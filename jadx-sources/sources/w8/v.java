package w8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.i0;
import com.google.android.gms.internal.play_billing.zzco;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzgw;
import com.google.android.gms.internal.play_billing.zzjz;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public boolean f18995a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18996b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f18997c;

    public v(i0 i0Var, boolean z2) {
        this.f18997c = i0Var;
        this.f18996b = z2;
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f18995a) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f18996b ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f18995a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Context context) {
        if (!this.f18995a) {
            zze.zzl("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f18995a = false;
        }
    }

    public final void c(Bundle bundle, c cVar, int i10) {
        t tVar = (t) this.f18997c.f3554d;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                ((qh.c) tVar).Q(zzjz.zzC(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), zzgw.zza()));
            } else {
                ((qh.c) tVar).Q(s.b(23, i10, cVar));
            }
        } catch (Throwable unused) {
            zze.zzl("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        i0 i0Var = this.f18997c;
        t tVar = (t) i0Var.f3554d;
        ac.h hVar = (ac.h) i0Var.f3553c;
        Bundle extras = intent.getExtras();
        if (extras == null) {
            zze.zzl("BillingBroadcastManager", "Bundle is null.");
            c cVar = u.f18985h;
            ((qh.c) tVar).Q(s.b(11, 1, cVar));
            if (hVar != null) {
                hVar.d(cVar, null);
                return;
            }
            return;
        }
        c cVarZzf = zze.zzf(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        int i10 = true == Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW") ? 2 : 1;
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED") || action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            List listZzj = zze.zzj(extras);
            if (cVarZzf.f18942a == 0) {
                ((qh.c) tVar).R(s.d(i10));
            } else {
                c(extras, cVarZzf, i10);
            }
            hVar.d(cVarZzf, listZzj);
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (cVarZzf.f18942a != 0) {
                c(extras, cVarZzf, i10);
                hVar.d(cVarZzf, zzco.zzl());
            } else {
                zze.zzl("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                c cVar2 = u.f18985h;
                ((qh.c) tVar).Q(s.b(77, i10, cVar2));
                hVar.d(cVar2, zzco.zzl());
            }
        }
    }
}
