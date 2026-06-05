package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import mc.n;
import nc.t;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzedp implements zzede {
    private final zzcob zza;
    private final Context zzb;
    private final zzdpc zzc;
    private final zzfco zzd;
    private final Executor zze;
    private final rc.a zzf;
    private final zzbkg zzg;
    private final boolean zzh = ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzjf)).booleanValue();
    private final zzecd zzi;
    private final zzdrw zzj;
    private final zzdsc zzk;

    public zzedp(zzcob zzcobVar, Context context, Executor executor, zzdpc zzdpcVar, zzfco zzfcoVar, rc.a aVar, zzbkg zzbkgVar, zzecd zzecdVar, zzdrw zzdrwVar, zzdsc zzdscVar) {
        this.zzb = context;
        this.zza = zzcobVar;
        this.zze = executor;
        this.zzc = zzdpcVar;
        this.zzd = zzfcoVar;
        this.zzf = aVar;
        this.zzg = zzbkgVar;
        this.zzi = zzecdVar;
        this.zzj = zzdrwVar;
        this.zzk = zzdscVar;
    }

    public static mf.a zzc(final zzedp zzedpVar, final zzfbt zzfbtVar, zzfcf zzfcfVar, zzdpg zzdpgVar, Object obj) {
        zzbct zzbctVar = zzbdc.zzcr;
        t tVar = t.f12227d;
        zzbda zzbdaVar = tVar.f12230c;
        zzbda zzbdaVar2 = tVar.f12230c;
        if (((Boolean) zzbdaVar.zzb(zzbctVar)).booleanValue()) {
            m1.u(n.D.f11584k, zzedpVar.zzj.zza(), zzdrk.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        zzdpc zzdpcVar = zzedpVar.zzc;
        zzfco zzfcoVar = zzedpVar.zzd;
        final zzcfe zzcfeVarZza = zzdpcVar.zza(zzfcoVar.zze, zzfbtVar, zzfcfVar.zzb.zzb);
        zzcfeVarZza.zzac(zzfbtVar.zzW);
        zzdpgVar.zza(zzedpVar.zzb, zzcfeVarZza.zzF());
        if (((Boolean) zzbdaVar2.zzb(zzbctVar)).booleanValue()) {
            m1.u(n.D.f11584k, zzedpVar.zzj.zza(), zzdrk.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzcai zzcaiVar = new zzcai();
        zzcob zzcobVar = zzedpVar.zza;
        zzcrl zzcrlVar = new zzcrl(zzfcfVar, zzfbtVar, null);
        rc.a aVar = zzedpVar.zzf;
        boolean z2 = zzedpVar.zzh;
        zzbkg zzbkgVar = zzedpVar.zzg;
        final zzcny zzcnyVarZza = zzcobVar.zza(zzcrlVar, new zzdey(new zzedr(aVar, zzcaiVar, zzfbtVar, zzcfeVarZza, zzfcoVar, z2, zzbkgVar, zzedpVar.zzi, zzedpVar.zzk), zzcfeVarZza), new zzcnz(zzfbtVar.zzaa));
        if (((Boolean) zzbdaVar2.zzb(zzbctVar)).booleanValue()) {
            m1.u(n.D.f11584k, zzedpVar.zzj.zza(), zzdrk.RENDERING_AD_COMPONENT_CREATION_END.zza());
        }
        zzdpb zzdpbVarZzh = zzcnyVarZza.zzh();
        zzbkg zzbkgVar2 = true != z2 ? null : zzbkgVar;
        zzdrw zzdrwVar = zzedpVar.zzj;
        zzdpbVarZzh.zzi(zzcfeVarZza, false, zzbkgVar2, zzdrwVar.zza());
        zzcaiVar.zzc(zzcnyVarZza);
        zzcnyVarZza.zzc().zzo(new zzcwl() { // from class: com.google.android.gms.internal.ads.zzedn
            @Override // com.google.android.gms.internal.ads.zzcwl
            public final void zzs() {
                zzcfe zzcfeVar = zzcfeVarZza;
                if (zzcfeVar.zzN() != null) {
                    zzcfeVar.zzN().zzs();
                }
            }
        }, zzcad.zzg);
        zzfby zzfbyVar = zzfbtVar.zzs;
        String strZzb = zzfbyVar.zza;
        if (((Boolean) zzbdaVar2.zzb(zzbdc.zzfx)).booleanValue() && zzcnyVarZza.zzi().zze(true)) {
            strZzb = zzcgp.zzb(strZzb, zzcgp.zza(zzfbtVar));
        }
        zzcnyVarZza.zzh();
        return zzgdb.zzm(zzdpb.zzj(zzcfeVarZza, zzfbyVar.zzb, strZzb, zzdrwVar.zza()), new zzfut(zzedpVar) { // from class: com.google.android.gms.internal.ads.zzedo
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj2) {
                zzcfe zzcfeVar = zzcfeVarZza;
                if (zzfbtVar.zzM) {
                    zzcfeVar.zzah();
                }
                zzcny zzcnyVar = zzcnyVarZza;
                zzcfeVar.zzab();
                zzcfeVar.onPause();
                return zzcnyVar.zza();
            }
        }, zzedpVar.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final mf.a zza(final zzfcf zzfcfVar, final zzfbt zzfbtVar) {
        final zzdpg zzdpgVar = new zzdpg();
        mf.a aVarZzh = zzgdb.zzh(null);
        zzgci zzgciVar = new zzgci() { // from class: com.google.android.gms.internal.ads.zzedl
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) {
                return zzedp.zzc(this.zza, zzfbtVar, zzfcfVar, zzdpgVar, obj);
            }
        };
        Executor executor = this.zze;
        mf.a aVarZzn = zzgdb.zzn(aVarZzh, zzgciVar, executor);
        aVarZzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedm
            @Override // java.lang.Runnable
            public final void run() {
                zzdpgVar.zzb();
            }
        }, executor);
        return aVarZzn;
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final boolean zzb(zzfcf zzfcfVar, zzfbt zzfbtVar) {
        zzfby zzfbyVar = zzfbtVar.zzs;
        return (zzfbyVar == null || zzfbyVar.zza == null) ? false : true;
    }
}
