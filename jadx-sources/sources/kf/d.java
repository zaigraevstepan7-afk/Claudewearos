package kf;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzau;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzkd;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9557a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9558b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f9557a = i10;
        this.f9558b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        switch (this.f9557a) {
            case 0:
                e eVar = (e) this.f9558b;
                eVar.f9561b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                eVar.a().post(new b(this, iBinder));
                break;
            default:
                zze.zzk("BillingClientTesting", "Billing Override Service connected.");
                ((w8.q) this.f9558b).B = zzau.zzc(iBinder);
                ((w8.q) this.f9558b).A = 2;
                w8.q qVar = (w8.q) this.f9558b;
                zzkd zzkdVarD = w8.s.d(26);
                Objects.requireNonNull(zzkdVarD, "ApiSuccess should not be null");
                qVar.f18922g.R(zzkdVarD);
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f9557a) {
            case 0:
                e eVar = (e) this.f9558b;
                eVar.f9561b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                eVar.a().post(new c(this, 0));
                break;
            default:
                zze.zzl("BillingClientTesting", "Billing Override Service disconnected.");
                ((w8.q) this.f9558b).B = null;
                ((w8.q) this.f9558b).A = 0;
                break;
        }
    }
}
