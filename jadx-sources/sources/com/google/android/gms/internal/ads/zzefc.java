package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import mc.n;
import nc.t;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzefc implements zzede {
    private final Context zza;
    private final zzdpc zzb;
    private final zzdfy zzc;
    private final zzfco zzd;
    private final Executor zze;
    private final rc.a zzf;
    private final zzbkg zzg;
    private final boolean zzh = ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzjf)).booleanValue();
    private final zzecd zzi;
    private final zzdrw zzj;
    private final zzdsc zzk;

    public zzefc(Context context, rc.a aVar, zzfco zzfcoVar, Executor executor, zzdfy zzdfyVar, zzdpc zzdpcVar, zzbkg zzbkgVar, zzecd zzecdVar, zzdrw zzdrwVar, zzdsc zzdscVar) {
        this.zza = context;
        this.zzd = zzfcoVar;
        this.zzc = zzdfyVar;
        this.zze = executor;
        this.zzf = aVar;
        this.zzb = zzdpcVar;
        this.zzg = zzbkgVar;
        this.zzi = zzecdVar;
        this.zzj = zzdrwVar;
        this.zzk = zzdscVar;
    }

    public static mf.a zzc(zzefc zzefcVar, final zzfbt zzfbtVar, zzfcf zzfcfVar, zzdpg zzdpgVar, Object obj) {
        final zzefc zzefcVar2;
        zzbct zzbctVar = zzbdc.zzcr;
        t tVar = t.f12227d;
        zzbda zzbdaVar = tVar.f12230c;
        zzbda zzbdaVar2 = tVar.f12230c;
        if (((Boolean) zzbdaVar.zzb(zzbctVar)).booleanValue()) {
            m1.u(n.D.f11584k, zzefcVar.zzj.zza(), zzdrk.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        zzdpc zzdpcVar = zzefcVar.zzb;
        zzfco zzfcoVar = zzefcVar.zzd;
        final zzcfe zzcfeVarZza = zzdpcVar.zza(zzfcoVar.zze, zzfbtVar, zzfcfVar.zzb.zzb);
        zzcfeVarZza.zzac(zzfbtVar.zzW);
        Context context = zzefcVar.zza;
        zzdpgVar.zza(context, zzcfeVarZza.zzF());
        if (((Boolean) zzbdaVar2.zzb(zzbctVar)).booleanValue()) {
            m1.u(n.D.f11584k, zzefcVar.zzj.zza(), zzdrk.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzcai zzcaiVar = new zzcai();
        zzdfy zzdfyVar = zzefcVar.zzc;
        zzcrl zzcrlVar = new zzcrl(zzfcfVar, zzfbtVar, null);
        rc.a aVar = zzefcVar.zzf;
        boolean z2 = zzefcVar.zzh;
        zzbkg zzbkgVar = zzefcVar.zzg;
        final zzdev zzdevVarZzd = zzdfyVar.zzd(zzcrlVar, new zzdey(new zzefb(context, aVar, zzcaiVar, zzfbtVar, zzcfeVarZza, zzfcoVar, z2, zzbkgVar, zzefcVar.zzi, zzefcVar.zzk), zzcfeVarZza));
        zzcaiVar.zzc(zzdevVarZzd);
        if (((Boolean) zzbdaVar2.zzb(zzbctVar)).booleanValue()) {
            zzefcVar2 = zzefcVar;
            m1.u(n.D.f11584k, zzefcVar2.zzj.zza(), zzdrk.RENDERING_AD_COMPONENT_CREATION_END.zza());
        } else {
            zzefcVar2 = zzefcVar;
        }
        zzdevVarZzd.zzc().zzo(new zzcwl() { // from class: com.google.android.gms.internal.ads.zzeez
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
        if (((Boolean) zzbdaVar2.zzb(zzbdc.zzfx)).booleanValue() && zzdevVarZzd.zzl().zze(true)) {
            strZzb = zzcgp.zzb(strZzb, zzcgp.zza(zzfbtVar));
        }
        zzdpb zzdpbVarZzi = zzdevVarZzd.zzi();
        if (true != z2) {
            zzbkgVar = null;
        }
        zzdrw zzdrwVar = zzefcVar2.zzj;
        zzdpbVarZzi.zzi(zzcfeVarZza, true, zzbkgVar, zzdrwVar.zza());
        zzdevVarZzd.zzi();
        return zzgdb.zzm(zzdpb.zzj(zzcfeVarZza, zzfbyVar.zzb, strZzb, zzdrwVar.zza()), new zzfut(zzefcVar2) { // from class: com.google.android.gms.internal.ads.zzefa
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj2) {
                zzcfe zzcfeVar = zzcfeVarZza;
                if (zzfbtVar.zzM) {
                    zzcfeVar.zzah();
                }
                zzdev zzdevVar = zzdevVarZzd;
                zzcfeVar.zzab();
                zzcfeVar.onPause();
                return zzdevVar.zzg();
            }
        }, zzefcVar2.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final mf.a zza(final zzfcf zzfcfVar, final zzfbt zzfbtVar) {
        final zzdpg zzdpgVar = new zzdpg();
        mf.a aVarZzh = zzgdb.zzh(null);
        zzgci zzgciVar = new zzgci() { // from class: com.google.android.gms.internal.ads.zzeex
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) {
                return zzefc.zzc(this.zza, zzfbtVar, zzfcfVar, zzdpgVar, obj);
            }
        };
        Executor executor = this.zze;
        mf.a aVarZzn = zzgdb.zzn(aVarZzh, zzgciVar, executor);
        aVarZzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeey
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
