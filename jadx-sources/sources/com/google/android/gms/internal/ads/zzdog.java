package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import mc.n;
import nc.t;
import qc.l0;
import qc.r0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdog extends zzcqv {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdgg zze;
    private final zzdda zzf;
    private final zzcwe zzg;
    private final zzcxl zzh;
    private final zzcrq zzi;
    private final zzbwq zzj;
    private final zzfok zzk;
    private final zzfch zzl;
    private boolean zzm;

    public zzdog(zzcqu zzcquVar, Context context, zzcfe zzcfeVar, zzdgg zzdggVar, zzdda zzddaVar, zzcwe zzcweVar, zzcxl zzcxlVar, zzcrq zzcrqVar, zzfbt zzfbtVar, zzfok zzfokVar, zzfch zzfchVar) {
        super(zzcquVar);
        this.zzm = false;
        this.zzc = context;
        this.zze = zzdggVar;
        this.zzd = new WeakReference(zzcfeVar);
        this.zzf = zzddaVar;
        this.zzg = zzcweVar;
        this.zzh = zzcxlVar;
        this.zzi = zzcrqVar;
        this.zzk = zzfokVar;
        zzbwm zzbwmVar = zzfbtVar.zzl;
        this.zzj = new zzbxk(zzbwmVar != null ? zzbwmVar.zza : "", zzbwmVar != null ? zzbwmVar.zzb : 1);
        this.zzl = zzfchVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcfe zzcfeVar = (zzcfe) this.zzd.get();
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzgP)).booleanValue()) {
                if (!this.zzm && zzcfeVar != null) {
                    zzcad.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdof
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcfeVar.destroy();
                        }
                    });
                }
            } else if (zzcfeVar != null) {
                zzcfeVar.destroy();
            }
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    public final Bundle zza() {
        return this.zzh.zzb();
    }

    public final zzbwq zzc() {
        return this.zzj;
    }

    public final zzfch zzd() {
        return this.zzl;
    }

    public final boolean zze() {
        return this.zzi.zzg();
    }

    public final boolean zzf() {
        return this.zzm;
    }

    public final boolean zzg() {
        zzcfe zzcfeVar = (zzcfe) this.zzd.get();
        return (zzcfeVar == null || zzcfeVar.zzaG()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.content.Context] */
    public final boolean zzh(boolean z2, Activity activity) {
        n nVar = n.D;
        r0 r0Var = nVar.f11577c;
        zzdgg zzdggVar = this.zze;
        if (!r0.k(zzdggVar.zza())) {
            zzbct zzbctVar = zzbdc.zzaO;
            t tVar = t.f12227d;
            if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
                r0 r0Var2 = nVar.f11577c;
                if (r0.f(this.zzc)) {
                    int i10 = l0.f13401b;
                    k.g("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    this.zzg.zzd();
                    if (((Boolean) tVar.f12230c.zzb(zzbdc.zzaP)).booleanValue()) {
                        this.zzk.zza(this.zza.zzb.zzb.zzb);
                    }
                    return false;
                }
            }
        }
        if (this.zzm) {
            int i11 = l0.f13401b;
            k.g("The rewarded ad have been showed.");
            this.zzg.zzc(zzfdp.zzd(10, null, null));
            return false;
        }
        this.zzm = true;
        zzdda zzddaVar = this.zzf;
        zzddaVar.zzb();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.zzc;
        }
        try {
            zzdggVar.zzb(z2, activity2, this.zzg);
            zzddaVar.zza();
            return true;
        } catch (zzdgf e10) {
            this.zzg.zze(e10);
            return false;
        }
    }
}
