package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import mc.n;
import nc.n3;
import nc.s3;
import nc.t;
import org.json.JSONObject;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdmn {
    private final zzfco zza;
    private final Executor zzb;
    private final zzdpc zzc;
    private final zzdnx zzd;
    private final Context zze;
    private final zzdsc zzf;
    private final zzfjq zzg;
    private final zzebs zzh;
    private final zzdrw zzi;

    public zzdmn(zzfco zzfcoVar, Executor executor, zzdpc zzdpcVar, Context context, zzdsc zzdscVar, zzfjq zzfjqVar, zzebs zzebsVar, zzdnx zzdnxVar, zzdrw zzdrwVar) {
        this.zza = zzfcoVar;
        this.zzb = executor;
        this.zzc = zzdpcVar;
        this.zze = context;
        this.zzf = zzdscVar;
        this.zzg = zzfjqVar;
        this.zzh = zzebsVar;
        this.zzd = zzdnxVar;
        this.zzi = zzdrwVar;
    }

    public static mf.a zza(zzdmn zzdmnVar, mc.b bVar, zzbxy zzbxyVar, Object obj) {
        zzcfe zzcfeVarZza = zzdmnVar.zzc.zza(s3.c(), null, null);
        final zzcah zzcahVarZza = zzcah.zza((Object) zzcfeVarZza);
        zzdmnVar.zzh(zzcfeVarZza, bVar, zzbxyVar);
        zzcfeVarZza.zzN().zzK(new zzcgv() { // from class: com.google.android.gms.internal.ads.zzdmf
            @Override // com.google.android.gms.internal.ads.zzcgv
            public final void zza() {
                zzcahVarZza.zzb();
            }
        });
        zzcfeVarZza.loadUrl((String) t.f12227d.f12230c.zzb(zzbdc.zzdZ));
        return zzcahVarZza;
    }

    public static /* synthetic */ mf.a zzb(final zzdmn zzdmnVar, JSONObject jSONObject, final zzcfe zzcfeVar) {
        zzbmn zzbmnVar = zzdmnVar.zza.zzb;
        final zzcah zzcahVarZza = zzcah.zza((Object) zzcfeVar);
        if (zzbmnVar != null) {
            zzcfeVar.zzaj(zzcgy.zzd());
        } else {
            zzcfeVar.zzaj(zzcgy.zze());
        }
        zzcfeVar.zzN().zzC(new zzcgu() { // from class: com.google.android.gms.internal.ads.zzdme
            @Override // com.google.android.gms.internal.ads.zzcgu
            public final void zza(boolean z2, int i10, String str, String str2) {
                zzdmn.zzg(this.zza, zzcfeVar, zzcahVarZza, z2, i10, str, str2);
            }
        });
        zzcfeVar.zzp("google.afma.nativeAds.renderVideo", jSONObject);
        return zzcahVarZza;
    }

    public static mf.a zzc(final zzdmn zzdmnVar, s3 s3Var, zzfbt zzfbtVar, zzfbw zzfbwVar, mc.b bVar, zzbxy zzbxyVar, String str, String str2, Object obj) {
        final zzcfe zzcfeVarZza = zzdmnVar.zzc.zza(s3Var, zzfbtVar, zzfbwVar);
        final zzcah zzcahVarZza = zzcah.zza((Object) zzcfeVarZza);
        if (zzdmnVar.zza.zzb != null) {
            zzdmnVar.zzh(zzcfeVarZza, bVar, zzbxyVar);
            zzcfeVarZza.zzaj(zzcgy.zzd());
        } else {
            zzdnu zzdnuVarZzb = zzdmnVar.zzd.zzb();
            zzcgw zzcgwVarZzN = zzcfeVarZza.zzN();
            zzbct zzbctVar = zzbdc.zznE;
            t tVar = t.f12227d;
            zzcgwVarZzN.zzX(zzdnuVarZzb, zzdnuVarZzb, zzdnuVarZzb, zzdnuVarZzb, zzdnuVarZzb, false, null, !((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue() ? new mc.b(zzdmnVar.zze, null) : bVar, null, true != ((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue() ? null : zzbxyVar, zzdmnVar.zzh, zzdmnVar.zzg, zzdmnVar.zzf, null, zzdnuVarZzb, null, null, null, null);
            zzj(zzcfeVarZza);
        }
        zzcfeVarZza.zzN().zzC(new zzcgu() { // from class: com.google.android.gms.internal.ads.zzdmc
            @Override // com.google.android.gms.internal.ads.zzcgu
            public final void zza(boolean z2, int i10, String str3, String str4) {
                zzdmn.zzf(this.zza, zzcfeVarZza, zzcahVarZza, z2, i10, str3, str4);
            }
        });
        zzcfeVarZza.zzae(str, str2, null);
        return zzcahVarZza;
    }

    public static /* synthetic */ void zzf(zzdmn zzdmnVar, zzcfe zzcfeVar, zzcah zzcahVar, boolean z2, int i10, String str, String str2) {
        if (z2) {
            n3 n3Var = zzdmnVar.zza.zza;
            if (n3Var != null && zzcfeVar.zzq() != null) {
                zzcfeVar.zzq().zzs(n3Var);
            }
            zzcahVar.zzb();
            return;
        }
        zzcahVar.zzd(new zzegx(1, "Html video Web View failed to load. Error code: " + i10 + ", Description: " + str + ", Failing URL: " + str2));
    }

    public static void zzg(zzdmn zzdmnVar, zzcfe zzcfeVar, zzcah zzcahVar, boolean z2, int i10, String str, String str2) {
        if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzeh)).booleanValue()) {
            zzdmnVar.zzi(zzcfeVar, zzcahVar);
            return;
        }
        if (z2) {
            zzdmnVar.zzi(zzcfeVar, zzcahVar);
            return;
        }
        zzcahVar.zzd(new zzegx(1, "Native Video WebView failed to load. Error code: " + i10 + ", Description: " + str + ", Failing URL: " + str2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzh(zzcfe zzcfeVar, mc.b bVar, zzbxy zzbxyVar) {
        zzj(zzcfeVar);
        zzcfeVar.zzag("/video", zzbkc.zzl);
        zzcfeVar.zzag("/videoMeta", zzbkc.zzm);
        zzcfeVar.zzag("/precache", new zzcdm());
        zzcfeVar.zzag("/delayPageLoaded", zzbkc.zzp);
        zzcfeVar.zzag("/instrument", zzbkc.zzn);
        zzcfeVar.zzag("/log", zzbkc.zzg);
        zzcfeVar.zzag("/click", new zzbjb(null, 0 == true ? 1 : 0));
        if (this.zza.zzb != null) {
            zzcfeVar.zzN().zzH(true);
            zzcfeVar.zzag("/open", new zzbkp(true != ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zznE)).booleanValue() ? null : bVar, null, null, null, null));
        } else {
            zzcfeVar.zzN().zzH(false);
        }
        if (n.D.f11599z.zzp(zzcfeVar.getContext())) {
            Map map = new HashMap();
            if (zzcfeVar.zzD() != null) {
                map = zzcfeVar.zzD().zzaw;
            }
            zzcfeVar.zzag("/logScionEvent", new zzbkj(zzcfeVar.getContext(), map));
        }
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zznE)).booleanValue()) {
            zzcfeVar.zzN().zzD(bVar);
            zzcfeVar.zzN().zzL(zzbxyVar);
        }
    }

    private final void zzi(zzcfe zzcfeVar, zzcah zzcahVar) {
        n3 n3Var = this.zza.zza;
        if (n3Var != null && zzcfeVar.zzq() != null) {
            zzcfeVar.zzq().zzs(n3Var);
        }
        zzcahVar.zzb();
    }

    private static final void zzj(zzcfe zzcfeVar) {
        zzcfeVar.zzag("/videoClicked", zzbkc.zzh);
        zzcfeVar.zzN().zzJ(true);
        zzcfeVar.zzag("/getNativeAdViewSignals", zzbkc.zzs);
        zzcfeVar.zzag("/getNativeClickMeta", zzbkc.zzt);
    }

    public final mf.a zzd(final JSONObject jSONObject, final mc.b bVar, final zzbxy zzbxyVar) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcv)).booleanValue()) {
            m1.u(n.D.f11584k, this.zzi.zza(), zzdrk.NATIVE_ASSETS_LOADING_VIDEO_START.zza());
        }
        mf.a aVarZzh = zzgdb.zzh(null);
        zzgci zzgciVar = new zzgci() { // from class: com.google.android.gms.internal.ads.zzdmh
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) {
                return zzdmn.zza(this.zza, bVar, zzbxyVar, obj);
            }
        };
        Executor executor = this.zzb;
        return zzgdb.zzn(zzgdb.zzn(aVarZzh, zzgciVar, executor), new zzgci() { // from class: com.google.android.gms.internal.ads.zzdmg
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) {
                return zzdmn.zzb(this.zza, jSONObject, (zzcfe) obj);
            }
        }, executor);
    }

    public final mf.a zze(final String str, final String str2, final zzfbt zzfbtVar, final zzfbw zzfbwVar, final s3 s3Var, final mc.b bVar, final zzbxy zzbxyVar) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcv)).booleanValue()) {
            m1.u(n.D.f11584k, this.zzi.zza(), zzdrk.NATIVE_ASSETS_LOADING_VIDEO_COMPOSITION_START.zza());
        }
        return zzgdb.zzn(zzgdb.zzh(null), new zzgci() { // from class: com.google.android.gms.internal.ads.zzdmd
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) {
                return zzdmn.zzc(this.zza, s3Var, zzfbtVar, zzfbwVar, bVar, zzbxyVar, str, str2, obj);
            }
        }, this.zzb);
    }
}
