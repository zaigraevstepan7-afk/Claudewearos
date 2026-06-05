package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import mc.n;
import nc.l2;
import nc.n3;
import nc.s3;
import nc.t;
import qc.k;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeef implements zzede {
    private final zzcps zza;
    private final Context zzb;
    private final zzdpc zzc;
    private final zzfco zzd;
    private final Executor zze;
    private final zzfut zzf;
    private final zzdrw zzg;

    public zzeef(zzcps zzcpsVar, Context context, Executor executor, zzdpc zzdpcVar, zzfco zzfcoVar, zzfut zzfutVar, zzdrw zzdrwVar) {
        this.zzb = context;
        this.zza = zzcpsVar;
        this.zze = executor;
        this.zzc = zzdpcVar;
        this.zzd = zzfcoVar;
        this.zzf = zzfutVar;
        this.zzg = zzdrwVar;
    }

    public static mf.a zzc(final zzeef zzeefVar, zzfcf zzfcfVar, zzfbt zzfbtVar, Object obj) {
        zzbct zzbctVar = zzbdc.zzcr;
        t tVar = t.f12227d;
        zzbda zzbdaVar = tVar.f12230c;
        zzbda zzbdaVar2 = tVar.f12230c;
        if (((Boolean) zzbdaVar.zzb(zzbctVar)).booleanValue()) {
            m1.u(n.D.f11584k, zzeefVar.zzg.zza(), zzdrk.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        Context context = zzeefVar.zzb;
        s3 s3VarZza = zzfcu.zza(context, zzfbtVar.zzu);
        final zzcfe zzcfeVarZza = zzeefVar.zzc.zza(s3VarZza, zzfbtVar, zzfcfVar.zzb.zzb);
        zzcfeVarZza.zzac(zzfbtVar.zzW);
        View viewZza = (((Boolean) zzbdaVar2.zzb(zzbdc.zzic)).booleanValue() && zzfbtVar.zzag) ? zzcqh.zza(context, zzcfeVarZza.zzF(), zzfbtVar) : new zzdpf(context, zzcfeVarZza.zzF(), (k) zzeefVar.zzf.apply(zzfbtVar));
        if (((Boolean) zzbdaVar2.zzb(zzbctVar)).booleanValue()) {
            m1.u(n.D.f11584k, zzeefVar.zzg.zza(), zzdrk.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        final zzcoo zzcooVarZza = zzeefVar.zza.zza(new zzcrl(zzfcfVar, zzfbtVar, null), new zzcou(viewZza, zzcfeVarZza, new zzcqt() { // from class: com.google.android.gms.internal.ads.zzedz
            @Override // com.google.android.gms.internal.ads.zzcqt
            public final l2 zza() {
                return zzcfeVarZza.zzq();
            }
        }, zzfcu.zzb(s3VarZza)));
        if (((Boolean) zzbdaVar2.zzb(zzbctVar)).booleanValue()) {
            m1.u(n.D.f11584k, zzeefVar.zzg.zza(), zzdrk.RENDERING_AD_COMPONENT_CREATION_END.zza());
        }
        zzdpb zzdpbVarZzi = zzcooVarZza.zzi();
        zzdrw zzdrwVar = zzeefVar.zzg;
        zzdpbVarZzi.zzi(zzcfeVarZza, false, null, zzdrwVar.zza());
        zzcwj zzcwjVarZzc = zzcooVarZza.zzc();
        zzcwl zzcwlVar = new zzcwl() { // from class: com.google.android.gms.internal.ads.zzeea
            @Override // com.google.android.gms.internal.ads.zzcwl
            public final void zzs() {
                zzcfe zzcfeVar = zzcfeVarZza;
                if (zzcfeVar.zzN() != null) {
                    zzcfeVar.zzN().zzs();
                }
            }
        };
        zzgdm zzgdmVar = zzcad.zzg;
        zzcwjVarZzc.zzo(zzcwlVar, zzgdmVar);
        zzfby zzfbyVar = zzfbtVar.zzs;
        String strZzb = zzfbyVar.zza;
        if (((Boolean) zzbdaVar2.zzb(zzbdc.zzfx)).booleanValue() && zzcooVarZza.zzl().zze(true)) {
            strZzb = zzcgp.zzb(strZzb, zzcgp.zza(zzfbtVar));
        }
        zzcooVarZza.zzi();
        mf.a aVarZzj = zzdpb.zzj(zzcfeVarZza, zzfbyVar.zzb, strZzb, zzdrwVar.zza());
        if (zzfbtVar.zzM) {
            aVarZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeeb
                @Override // java.lang.Runnable
                public final void run() {
                    zzcfeVarZza.zzah();
                }
            }, zzeefVar.zze);
        }
        aVarZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeec
            @Override // java.lang.Runnable
            public final void run() {
                zzeef.zzd(this.zza, zzcfeVarZza);
            }
        }, zzeefVar.zze);
        return zzgdb.zzm(aVarZzj, new zzfut() { // from class: com.google.android.gms.internal.ads.zzeed
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj2) {
                return zzcooVarZza.zza();
            }
        }, zzgdmVar);
    }

    public static void zzd(zzeef zzeefVar, zzcfe zzcfeVar) {
        zzcfeVar.zzab();
        zzfco zzfcoVar = zzeefVar.zzd;
        zzcgg zzcggVarZzq = zzcfeVar.zzq();
        n3 n3Var = zzfcoVar.zza;
        if (n3Var != null && zzcggVarZzq != null) {
            zzcggVarZzq.zzs(n3Var);
        }
        if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzbt)).booleanValue() || zzcfeVar.isAttachedToWindow()) {
            return;
        }
        zzcfeVar.onPause();
        zzcfeVar.zzav(true);
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final mf.a zza(final zzfcf zzfcfVar, final zzfbt zzfbtVar) {
        return zzgdb.zzn(zzgdb.zzh(null), new zzgci() { // from class: com.google.android.gms.internal.ads.zzeee
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) {
                return zzeef.zzc(this.zza, zzfcfVar, zzfbtVar, obj);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final boolean zzb(zzfcf zzfcfVar, zzfbt zzfbtVar) {
        zzfby zzfbyVar = zzfbtVar.zzs;
        return (zzfbyVar == null || zzfbyVar.zza == null) ? false : true;
    }
}
