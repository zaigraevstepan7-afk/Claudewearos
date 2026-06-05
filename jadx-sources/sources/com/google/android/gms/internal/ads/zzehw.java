package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import mc.n;
import nc.t;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzehw implements zzede {
    private final Context zza;
    private final zzdpc zzb;
    private final zzdol zzc;
    private final zzfco zzd;
    private final Executor zze;
    private final rc.a zzf;
    private final zzbkg zzg;
    private final boolean zzh = ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzjf)).booleanValue();
    private final zzecd zzi;
    private final zzdrw zzj;
    private final zzdsc zzk;

    public zzehw(Context context, rc.a aVar, zzfco zzfcoVar, Executor executor, zzdol zzdolVar, zzdpc zzdpcVar, zzbkg zzbkgVar, zzecd zzecdVar, zzdrw zzdrwVar, zzdsc zzdscVar) {
        this.zza = context;
        this.zzd = zzfcoVar;
        this.zzc = zzdolVar;
        this.zze = executor;
        this.zzf = aVar;
        this.zzb = zzdpcVar;
        this.zzg = zzbkgVar;
        this.zzi = zzecdVar;
        this.zzj = zzdrwVar;
        this.zzk = zzdscVar;
    }

    public static mf.a zzc(final zzehw zzehwVar, final zzfbt zzfbtVar, zzfcf zzfcfVar, zzdpg zzdpgVar, Object obj) {
        zzbct zzbctVar = zzbdc.zzcr;
        t tVar = t.f12227d;
        zzbda zzbdaVar = tVar.f12230c;
        zzbda zzbdaVar2 = tVar.f12230c;
        if (((Boolean) zzbdaVar.zzb(zzbctVar)).booleanValue()) {
            m1.u(n.D.f11584k, zzehwVar.zzj.zza(), zzdrk.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        zzdpc zzdpcVar = zzehwVar.zzb;
        zzfco zzfcoVar = zzehwVar.zzd;
        final zzcfe zzcfeVarZza = zzdpcVar.zza(zzfcoVar.zze, zzfbtVar, zzfcfVar.zzb.zzb);
        zzcfeVarZza.zzac(zzfbtVar.zzW);
        Context context = zzehwVar.zza;
        zzdpgVar.zza(context, zzcfeVarZza.zzF());
        if (((Boolean) zzbdaVar2.zzb(zzbctVar)).booleanValue()) {
            m1.u(n.D.f11584k, zzehwVar.zzj.zza(), zzdrk.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzcai zzcaiVar = new zzcai();
        zzdol zzdolVar = zzehwVar.zzc;
        zzcrl zzcrlVar = new zzcrl(zzfcfVar, zzfbtVar, null);
        rc.a aVar = zzehwVar.zzf;
        zzbkg zzbkgVar = zzehwVar.zzg;
        boolean z2 = zzehwVar.zzh;
        zzecd zzecdVar = zzehwVar.zzi;
        zzdrw zzdrwVar = zzehwVar.zzj;
        final zzdoh zzdohVarZzd = zzdolVar.zzd(zzcrlVar, new zzdoi(new zzehv(context, zzdpcVar, zzfcoVar, aVar, zzfbtVar, zzcaiVar, zzcfeVarZza, zzbkgVar, z2, zzecdVar, zzdrwVar, zzehwVar.zzk), zzcfeVarZza));
        zzcaiVar.zzc(zzdohVarZzd);
        if (((Boolean) zzbdaVar2.zzb(zzbctVar)).booleanValue()) {
            m1.u(n.D.f11584k, zzdrwVar.zza(), zzdrk.RENDERING_AD_COMPONENT_CREATION_END.zza());
        }
        zzbkv.zzb(zzcfeVarZza, zzdohVarZzd.zzg());
        zzdohVarZzd.zzc().zzo(new zzcwl() { // from class: com.google.android.gms.internal.ads.zzehp
            @Override // com.google.android.gms.internal.ads.zzcwl
            public final void zzs() {
                zzcfe zzcfeVar = zzcfeVarZza;
                if (zzcfeVar.zzN() != null) {
                    zzcfeVar.zzN().zzs();
                }
            }
        }, zzcad.zzg);
        zzdohVarZzd.zzl().zzi(zzcfeVarZza, true, true != z2 ? null : zzbkgVar, zzdrwVar.zza());
        zzfby zzfbyVar = zzfbtVar.zzs;
        String strZzb = zzfbyVar.zza;
        if (((Boolean) zzbdaVar2.zzb(zzbdc.zzfx)).booleanValue() && zzdohVarZzd.zzm().zze(true)) {
            strZzb = zzcgp.zzb(strZzb, zzcgp.zza(zzfbtVar));
        }
        zzdohVarZzd.zzl();
        return zzgdb.zzm(zzdpb.zzj(zzcfeVarZza, zzfbyVar.zzb, strZzb, zzdrwVar.zza()), new zzfut(zzehwVar) { // from class: com.google.android.gms.internal.ads.zzehq
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj2) {
                zzcfe zzcfeVar = zzcfeVarZza;
                if (zzfbtVar.zzM) {
                    zzcfeVar.zzah();
                }
                zzdoh zzdohVar = zzdohVarZzd;
                zzcfeVar.zzab();
                zzcfeVar.onPause();
                return zzdohVar.zzi();
            }
        }, zzehwVar.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final mf.a zza(final zzfcf zzfcfVar, final zzfbt zzfbtVar) {
        final zzdpg zzdpgVar = new zzdpg();
        mf.a aVarZzh = zzgdb.zzh(null);
        zzgci zzgciVar = new zzgci() { // from class: com.google.android.gms.internal.ads.zzehr
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) {
                return zzehw.zzc(this.zza, zzfbtVar, zzfcfVar, zzdpgVar, obj);
            }
        };
        Executor executor = this.zze;
        mf.a aVarZzn = zzgdb.zzn(aVarZzh, zzgciVar, executor);
        aVarZzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehs
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
