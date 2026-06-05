package qc;

import android.content.Context;
import android.os.Message;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzfrn;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m0 extends zzfrn {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e10) {
            mc.n.D.f11582h.zzw(e10, "AdMobHandler.handleMessage");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrn
    public final void zza(Message message) {
        try {
            super.zza(message);
        } catch (Throwable th2) {
            mc.n nVar = mc.n.D;
            r0 r0Var = nVar.f11577c;
            Context contextZzd = nVar.f11582h.zzd();
            if (contextZzd != null) {
                try {
                    if (((Boolean) zzbfl.zzb.zze()).booleanValue()) {
                        ud.c.a(contextZzd, th2);
                    }
                } catch (IllegalStateException unused) {
                }
            }
            throw th2;
        }
    }
}
