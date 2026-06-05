package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import cg.i;
import com.google.android.gms.common.internal.e0;
import ig.b0;
import ig.p;
import ig.r;
import java.util.concurrent.ScheduledExecutorService;
import qd.a;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzaci {
    private static final a zza = new a("FirebaseAuth", "FirebaseAuthFallback:");
    private final zzyl zzb;
    private final zzadx zzc;

    public zzaci(i iVar, ScheduledExecutorService scheduledExecutorService) {
        e0.i(iVar);
        iVar.b();
        Context context = iVar.f3367a;
        e0.i(context);
        this.zzb = new zzyl(new zzacw(iVar, zzact.zza()));
        this.zzc = new zzadx(context, scheduledExecutorService);
    }

    public final void zza(String str, String str2, zzacg zzacgVar) {
        e0.e(str);
        e0.i(zzacgVar);
        this.zzb.zza(str, str2, new zzacf(zzacgVar, zza));
    }

    public final void zzb(String str, String str2, zzacg zzacgVar) {
        e0.e(str);
        e0.e(str2);
        e0.i(zzacgVar);
        this.zzb.zzb(str, str2, new zzacf(zzacgVar, zza));
    }

    public final void zzc(String str, String str2, zzacg zzacgVar) {
        e0.e(str);
        e0.e(str2);
        e0.i(zzacgVar);
        this.zzb.zzc(str, str2, new zzacf(zzacgVar, zza));
    }

    public final void zzd(String str, String str2, zzacg zzacgVar) {
        e0.e(str);
        e0.i(zzacgVar);
        this.zzb.zzd(str, str2, new zzacf(zzacgVar, zza));
    }

    public final void zze(String str, String str2, zzacg zzacgVar) {
        e0.e(str);
        this.zzb.zze(str, str2, new zzacf(zzacgVar, zza));
    }

    public final void zzf(String str, String str2, zzacg zzacgVar) {
        e0.e(str);
        e0.e(str2);
        e0.i(zzacgVar);
        this.zzb.zzf(str, str2, new zzacf(zzacgVar, zza));
    }

    public final void zze(String str, zzacg zzacgVar) {
        e0.e(str);
        e0.i(zzacgVar);
        this.zzb.zzf(str, new zzacf(zzacgVar, zza));
    }

    public final void zza(zzxx zzxxVar, zzacg zzacgVar) {
        e0.i(zzxxVar);
        e0.e(zzxxVar.zza());
        e0.e(zzxxVar.zzb());
        e0.i(zzacgVar);
        this.zzb.zza(zzxxVar.zza(), zzxxVar.zzb(), zzxxVar.zzc(), new zzacf(zzacgVar, zza));
    }

    public final void zzd(String str, zzacg zzacgVar) {
        e0.i(zzacgVar);
        this.zzb.zze(str, new zzacf(zzacgVar, zza));
    }

    public final void zzb(String str, zzacg zzacgVar) {
        e0.e(str);
        e0.i(zzacgVar);
        this.zzb.zzb(str, new zzacf(zzacgVar, zza));
    }

    public final void zzc(String str, zzacg zzacgVar) {
        e0.e(str);
        e0.i(zzacgVar);
        this.zzb.zzc(str, new zzacf(zzacgVar, zza));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzacg zzacgVar) {
        e0.e(str);
        e0.e(str2);
        e0.i(zzacgVar);
        this.zzb.zzb(str, str2, str3, str4, new zzacf(zzacgVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, zzacg zzacgVar) {
        e0.e(str);
        e0.e(str2);
        e0.i(zzacgVar);
        this.zzb.zza(str, str2, str3, str4, new zzacf(zzacgVar, zza));
    }

    public final void zza(String str, zzacg zzacgVar) {
        e0.e(str);
        e0.i(zzacgVar);
        this.zzb.zza(str, new zzacf(zzacgVar, zza));
    }

    public final void zza(p pVar, String str, String str2, String str3, zzacg zzacgVar) {
        e0.i(pVar);
        throw null;
    }

    public final void zza(String str, p pVar, String str2, zzacg zzacgVar) {
        e0.e(str);
        e0.i(pVar);
        throw null;
    }

    public final void zza(zzya zzyaVar, zzacg zzacgVar) {
        e0.i(zzyaVar);
        this.zzb.zza(zzafj.zzb(), new zzacf(zzacgVar, zza));
    }

    public final void zza(zzxz zzxzVar, zzacg zzacgVar) {
        e0.i(zzxzVar);
        this.zzb.zza(zzafk.zza(zzxzVar.zzb(), zzxzVar.zza()), new zzacf(zzacgVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzacg zzacgVar) {
        e0.e(str);
        e0.e(str2);
        e0.e(str3);
        e0.i(zzacgVar);
        this.zzb.zza(str, str2, str3, str4, str5, new zzacf(zzacgVar, zza));
    }

    public final void zza(String str, zzags zzagsVar, zzacg zzacgVar) {
        e0.e(str);
        e0.i(zzagsVar);
        e0.i(zzacgVar);
        this.zzb.zza(str, zzagsVar, new zzacf(zzacgVar, zza));
    }

    public final void zza(zzyc zzycVar, zzacg zzacgVar) {
        e0.i(zzacgVar);
        e0.i(zzycVar);
        r rVarZza = zzycVar.zza();
        e0.i(rVarZza);
        String strZzb = zzycVar.zzb();
        e0.e(strZzb);
        this.zzb.zza(strZzb, zzadr.zza(rVarZza), new zzacf(zzacgVar, zza));
    }

    public final void zza(zzafy zzafyVar, zzacg zzacgVar) {
        e0.i(zzafyVar);
        this.zzb.zza(zzafyVar, new zzacf(zzacgVar, zza));
    }

    public final void zza(zzyb zzybVar, zzacg zzacgVar) {
        e0.i(zzybVar);
        e0.e(zzybVar.zzb());
        e0.i(zzacgVar);
        this.zzb.zza(zzybVar.zzb(), zzybVar.zza(), new zzacf(zzacgVar, zza));
    }

    public final void zza(zzye zzyeVar, zzacg zzacgVar) {
        e0.i(zzyeVar);
        e0.e(zzyeVar.zzc());
        e0.i(zzacgVar);
        this.zzb.zza(zzyeVar.zzc(), zzyeVar.zza(), zzyeVar.zzd(), zzyeVar.zzb(), new zzacf(zzacgVar, zza));
    }

    public final void zza(zzyd zzydVar, zzacg zzacgVar) {
        e0.i(zzacgVar);
        e0.i(zzydVar);
        zzagd zzagdVarZza = zzydVar.zza();
        e0.i(zzagdVarZza);
        String strZzd = zzagdVarZza.zzd();
        zzacf zzacfVar = new zzacf(zzacgVar, zza);
        if (this.zzc.zzd(strZzd)) {
            if (zzagdVarZza.zze()) {
                this.zzc.zzc(strZzd);
            } else {
                this.zzc.zzb(zzacfVar, strZzd);
                return;
            }
        }
        long jZzb = zzagdVarZza.zzb();
        boolean zZzf = zzagdVarZza.zzf();
        if (zza(jZzb, zZzf)) {
            zzagdVarZza.zza(new zzaeh(this.zzc.zzb()));
        }
        this.zzc.zza(strZzd, zzacfVar, jZzb, zZzf);
        this.zzb.zza(zzagdVarZza, this.zzc.zza(zzacfVar, strZzd));
    }

    public final void zza(zzyg zzygVar, zzacg zzacgVar) {
        e0.i(zzygVar);
        e0.i(zzacgVar);
        this.zzb.zzd(zzygVar.zza(), new zzacf(zzacgVar, zza));
    }

    public final void zza(zzags zzagsVar, zzacg zzacgVar) {
        e0.i(zzagsVar);
        e0.i(zzacgVar);
        this.zzb.zza(zzagsVar, new zzacf(zzacgVar, zza));
    }

    public final void zza(zzagx zzagxVar, zzacg zzacgVar) {
        e0.i(zzagxVar);
        e0.i(zzacgVar);
        this.zzb.zza(zzagxVar, new zzacf(zzacgVar, zza));
    }

    public final void zza(zzyf zzyfVar, zzacg zzacgVar) {
        e0.i(zzyfVar);
        e0.i(zzyfVar.zza());
        e0.i(zzacgVar);
        this.zzb.zza(zzyfVar.zza(), zzyfVar.zzb(), new zzacf(zzacgVar, zza));
    }

    public final void zza(zzyi zzyiVar, zzacg zzacgVar) {
        e0.i(zzacgVar);
        e0.i(zzyiVar);
        r rVarZza = zzyiVar.zza();
        e0.i(rVarZza);
        this.zzb.zza(zzadr.zza(rVarZza), new zzacf(zzacgVar, zza));
    }

    public final void zza(String str, String str2, String str3, long j, boolean z2, boolean z10, String str4, String str5, boolean z11, zzacg zzacgVar) {
        e0.f(str, "idToken should not be empty.");
        e0.i(zzacgVar);
        zzacf zzacfVar = new zzacf(zzacgVar, zza);
        if (this.zzc.zzd(str2)) {
            if (z2) {
                this.zzc.zzc(str2);
            } else {
                this.zzc.zzb(zzacfVar, str2);
                return;
            }
        }
        zzagn zzagnVarZza = zzagn.zza(str, str2, str3, str4, str5, null);
        if (zza(j, z11)) {
            zzagnVarZza.zza(new zzaeh(this.zzc.zzb()));
        }
        this.zzc.zza(str2, zzacfVar, j, z11);
        this.zzb.zza(zzagnVarZza, this.zzc.zza(zzacfVar, str2));
    }

    public final void zza(zzyh zzyhVar, zzacg zzacgVar) {
        e0.i(zzyhVar);
        e0.i(zzacgVar);
        String str = zzyhVar.zzb().f8567d;
        zzacf zzacfVar = new zzacf(zzacgVar, zza);
        if (this.zzc.zzd(str)) {
            if (zzyhVar.zzg()) {
                this.zzc.zzc(str);
            } else {
                this.zzc.zzb(zzacfVar, str);
                return;
            }
        }
        long jZza = zzyhVar.zza();
        boolean zZzh = zzyhVar.zzh();
        zzagl zzaglVarZza = zzagl.zza(zzyhVar.zzd(), zzyhVar.zzb().f8564a, zzyhVar.zzb().f8567d, zzyhVar.zzc(), zzyhVar.zzf(), zzyhVar.zze());
        if (zza(jZza, zZzh)) {
            zzaglVarZza.zza(new zzaeh(this.zzc.zzb()));
        }
        this.zzc.zza(str, zzacfVar, jZza, zZzh);
        this.zzb.zza(zzaglVarZza, this.zzc.zza(zzacfVar, str));
    }

    public final void zza(zzagp zzagpVar, zzacg zzacgVar) {
        e0.i(zzacgVar);
        this.zzb.zza(zzagpVar, new zzacf(zzacgVar, zza));
    }

    public final void zza(String str, String str2, String str3, zzacg zzacgVar) {
        e0.f(str, "cachedTokenState should not be empty.");
        e0.f(str2, "uid should not be empty.");
        e0.i(zzacgVar);
        this.zzb.zzb(str, str2, str3, new zzacf(zzacgVar, zza));
    }

    public final void zza(String str, b0 b0Var, zzacg zzacgVar) {
        e0.e(str);
        e0.i(b0Var);
        e0.i(zzacgVar);
        this.zzb.zza(str, b0Var, new zzacf(zzacgVar, zza));
    }

    public final void zza(zzyk zzykVar, zzacg zzacgVar) {
        e0.i(zzykVar);
        this.zzb.zza(zzafh.zza(zzykVar.zza(), zzykVar.zzb(), zzykVar.zzc()), new zzacf(zzacgVar, zza));
    }

    private static boolean zza(long j, boolean z2) {
        if (j > 0 && z2) {
            return true;
        }
        zza.f("App hash will not be appended to the request.", new Object[0]);
        return false;
    }
}
