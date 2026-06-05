package nd;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.internal.common.zzd;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l extends zau {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f12291b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f12291b = eVar;
        this.f12290a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        int i11 = f.f12279a;
        e eVar = this.f12291b;
        Context context = this.f12290a;
        int iD = eVar.d(context, i11);
        AtomicBoolean atomicBoolean = i.f12283a;
        if (iD == 1 || iD == 2 || iD == 3 || iD == 9) {
            Intent intentB = eVar.b(context, "n", iD);
            eVar.h(context, iD, intentB == null ? null : PendingIntent.getActivity(context, 0, intentB, zzd.zza | 134217728));
        }
    }
}
