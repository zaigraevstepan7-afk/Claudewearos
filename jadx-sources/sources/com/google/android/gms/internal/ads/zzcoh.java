package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import mc.n;
import nc.t;
import qc.l0;
import qc.r0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcoh extends zzcqv {
    private final zzcfe zzc;
    private final int zzd;
    private final Context zze;
    private final zzcnv zzf;
    private final zzdgg zzg;
    private final zzdda zzh;
    private final zzcwe zzi;
    private final boolean zzj;
    private final zzbzu zzk;
    private boolean zzl;

    public zzcoh(zzcqu zzcquVar, Context context, zzcfe zzcfeVar, int i10, zzcnv zzcnvVar, zzdgg zzdggVar, zzdda zzddaVar, zzcwe zzcweVar, zzbzu zzbzuVar) {
        super(zzcquVar);
        this.zzl = false;
        this.zzc = zzcfeVar;
        this.zze = context;
        this.zzd = i10;
        this.zzf = zzcnvVar;
        this.zzg = zzdggVar;
        this.zzh = zzddaVar;
        this.zzi = zzcweVar;
        this.zzj = ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfF)).booleanValue();
        this.zzk = zzbzuVar;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final void zzb() {
        super.zzb();
        zzcfe zzcfeVar = this.zzc;
        if (zzcfeVar != null) {
            zzcfeVar.destroy();
        }
    }

    public final void zzc(zzbao zzbaoVar) {
        zzcfe zzcfeVar = this.zzc;
        if (zzcfeVar != null) {
            zzcfeVar.zzak(zzbaoVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13, types: [android.content.Context] */
    public final void zzd(Activity activity, zzbbb zzbbbVar, boolean z2) {
        zzcfe zzcfeVar;
        zzfbt zzfbtVarZzD;
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.zze;
        }
        boolean z10 = this.zzj;
        if (z10) {
            this.zzh.zzb();
        }
        n nVar = n.D;
        r0 r0Var = nVar.f11577c;
        zzdgg zzdggVar = this.zzg;
        if (!r0.k(zzdggVar.zza())) {
            zzbct zzbctVar = zzbdc.zzaO;
            t tVar = t.f12227d;
            if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
                r0 r0Var2 = nVar.f11577c;
                if (r0.f(activity2)) {
                    int i10 = l0.f13401b;
                    k.g("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    this.zzi.zzd();
                    if (((Boolean) tVar.f12230c.zzb(zzbdc.zzaP)).booleanValue()) {
                        new zzfok(activity2.getApplicationContext(), nVar.f11593t.b()).zza(this.zza.zzb.zzb.zzb);
                        return;
                    }
                    return;
                }
            }
        }
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzmf)).booleanValue() && (zzcfeVar = this.zzc) != null && (zzfbtVarZzD = zzcfeVar.zzD()) != null && zzfbtVarZzD.zzar && zzfbtVarZzD.zzas != this.zzk.zzb()) {
            int i11 = l0.f13401b;
            k.g("The app open consent form has been shown.");
            this.zzi.zzc(zzfdp.zzd(12, "The consent form has already been shown.", null));
            return;
        }
        if (this.zzl) {
            int i12 = l0.f13401b;
            k.g("App open interstitial ad is already visible.");
            this.zzi.zzc(zzfdp.zzd(10, null, null));
        }
        if (this.zzl) {
            return;
        }
        try {
            zzdggVar.zzb(z2, activity2, this.zzi);
            if (z10) {
                this.zzh.zza();
            }
            this.zzl = true;
        } catch (zzdgf e10) {
            this.zzi.zze(e10);
        }
    }

    public final void zze(long j, int i10) {
        this.zzf.zza(j, i10);
    }
}
