package fc;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbfa;
import nc.f0;
import nc.q2;
import nc.r3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6693a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f6694b;

    public f(Context context, f0 f0Var) {
        this.f6693a = context;
        this.f6694b = f0Var;
    }

    public final void a(g gVar) {
        q2 q2Var = gVar.f6695a;
        Context context = this.f6693a;
        zzbdc.zza(context);
        if (((Boolean) zzbfa.zzc.zze()).booleanValue()) {
            if (((Boolean) nc.t.f12227d.f12230c.zzb(zzbdc.zzlu)).booleanValue()) {
                rc.c.f14330b.execute(new a8.e(2, this, q2Var, false));
                return;
            }
        }
        try {
            this.f6694b.zzg(r3.a(context, q2Var));
        } catch (RemoteException e10) {
            rc.k.e("Failed to load ad.", e10);
        }
    }
}
