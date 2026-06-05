package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import mc.n;
import nc.h2;
import nc.q3;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcrz {
    private final zzdxt zza;
    private final zzfco zzb;
    private final zzfgs zzc;
    private final zzckz zzd;
    private final zzeha zze;
    private final zzdbd zzf;
    private zzfcf zzg;
    private final zzdzb zzh;
    private final zzcuu zzi;
    private final Executor zzj;
    private final zzdym zzk;
    private final zzedj zzl;

    public zzcrz(zzdxt zzdxtVar, zzfco zzfcoVar, zzfgs zzfgsVar, zzckz zzckzVar, zzeha zzehaVar, zzdbd zzdbdVar, zzfcf zzfcfVar, zzdzb zzdzbVar, zzcuu zzcuuVar, Executor executor, zzdym zzdymVar, zzedj zzedjVar) {
        this.zza = zzdxtVar;
        this.zzb = zzfcoVar;
        this.zzc = zzfgsVar;
        this.zzd = zzckzVar;
        this.zze = zzehaVar;
        this.zzf = zzdbdVar;
        this.zzg = zzfcfVar;
        this.zzh = zzdzbVar;
        this.zzi = zzcuuVar;
        this.zzj = executor;
        this.zzk = zzdymVar;
        this.zzl = zzedjVar;
    }

    public static /* synthetic */ zzfcf zzd(zzcrz zzcrzVar, zzfcf zzfcfVar) {
        zzcrzVar.zzd.zza(zzfcfVar);
        return zzfcfVar;
    }

    public static /* synthetic */ mf.a zze(zzcrz zzcrzVar, zzfei zzfeiVar, zzbvo zzbvoVar) {
        zzbvoVar.zzi = zzfeiVar;
        return zzcrzVar.zzh.zze(zzbvoVar);
    }

    public final h2 zza(Throwable th2) {
        return zzfdp.zzb(th2, this.zzl);
    }

    public final zzdbd zzc() {
        return this.zzf;
    }

    public final mf.a zzf(final zzfei zzfeiVar) {
        zzffy zzffyVarZza = this.zzc.zzb(zzfgm.GET_CACHE_KEY, this.zzi.zzc()).zzf(new zzgci() { // from class: com.google.android.gms.internal.ads.zzcrv
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) {
                return zzcrz.zze(this.zza, zzfeiVar, (zzbvo) obj);
            }
        }).zza();
        zzgdb.zzr(zzffyVarZza, new zzcrx(this), this.zzj);
        return zzffyVarZza;
    }

    public final mf.a zzg(zzbvo zzbvoVar) {
        zzffy zzffyVarZza = this.zzc.zzb(zzfgm.NOTIFY_CACHE_HIT, this.zzh.zzf(zzbvoVar)).zza();
        zzgdb.zzr(zzffyVarZza, new zzcry(this), this.zzj);
        return zzffyVarZza;
    }

    public final mf.a zzh(mf.a aVar) {
        zzfgi zzfgiVarZzf = this.zzc.zzb(zzfgm.RENDERER, aVar).zze(new zzffw() { // from class: com.google.android.gms.internal.ads.zzcru
            @Override // com.google.android.gms.internal.ads.zzffw
            public final Object zza(Object obj) {
                zzfcf zzfcfVar = (zzfcf) obj;
                zzcrz.zzd(this.zza, zzfcfVar);
                return zzfcfVar;
            }
        }).zzf(this.zze);
        if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfM)).booleanValue()) {
            zzfgiVarZzf = zzfgiVarZzf.zzi(((Integer) r1.f12230c.zzb(zzbdc.zzfN)).intValue(), TimeUnit.SECONDS);
        }
        return zzfgiVarZzf.zza();
    }

    public final mf.a zzi() {
        q3 q3Var = this.zzb.zzd;
        if (q3Var.Q == null && q3Var.L == null) {
            return zzj(this.zzi.zzc());
        }
        zzfgs zzfgsVar = this.zzc;
        zzdxt zzdxtVar = this.zza;
        return zzfgc.zzc(zzdxtVar.zze(), zzfgm.PRELOADED_LOADER, zzfgsVar).zza();
    }

    public final mf.a zzj(mf.a aVar) {
        zzfcf zzfcfVar = this.zzg;
        if (zzfcfVar != null) {
            zzfgs zzfgsVar = this.zzc;
            return zzfgc.zzc(zzgdb.zzh(zzfcfVar), zzfgm.SERVER_TRANSACTION, zzfgsVar).zza();
        }
        n.D.j.zzj();
        zzfgi zzfgiVarZzb = this.zzc.zzb(zzfgm.SERVER_TRANSACTION, aVar);
        final zzdym zzdymVar = this.zzk;
        Objects.requireNonNull(zzdymVar);
        return zzfgiVarZzb.zzf(new zzgci() { // from class: com.google.android.gms.internal.ads.zzcrw
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) {
                return zzdymVar.zzc((zzbvo) obj);
            }
        }).zza();
    }

    public final void zzk(zzfcf zzfcfVar) {
        this.zzg = zzfcfVar;
    }
}
