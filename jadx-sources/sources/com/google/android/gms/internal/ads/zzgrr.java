package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgrr extends zzgyv implements zzhah {
    private static final zzgrr zza;
    private static volatile zzhao zzb;
    private int zzc;
    private zzgrx zzd;
    private zzgti zze;

    static {
        zzgrr zzgrrVar = new zzgrr();
        zza = zzgrrVar;
        zzgyv.zzbZ(zzgrr.class, zzgrrVar);
    }

    private zzgrr() {
    }

    public static zzgrp zza() {
        return (zzgrp) zza.zzaZ();
    }

    public static zzgrr zzc(zzgxn zzgxnVar, zzgyf zzgyfVar) {
        return (zzgrr) zzgyv.zzbr(zza, zzgxnVar, zzgyfVar);
    }

    public static /* synthetic */ void zzg(zzgrr zzgrrVar, zzgrx zzgrxVar) {
        zzgrxVar.getClass();
        zzgrrVar.zzd = zzgrxVar;
        zzgrrVar.zzc |= 1;
    }

    public static /* synthetic */ void zzh(zzgrr zzgrrVar, zzgti zzgtiVar) {
        zzgtiVar.getClass();
        zzgrrVar.zze = zzgtiVar;
        zzgrrVar.zzc |= 2;
    }

    public final zzgrx zzd() {
        zzgrx zzgrxVar = this.zzd;
        return zzgrxVar == null ? zzgrx.zzd() : zzgrxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzgrr();
        }
        zzgrq zzgrqVar = null;
        if (iOrdinal == 4) {
            return new zzgrp(zzgrqVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhao zzhaoVar = zzb;
        if (zzhaoVar != null) {
            return zzhaoVar;
        }
        synchronized (zzgrr.class) {
            try {
                zzgyqVar = zzb;
                if (zzgyqVar == null) {
                    zzgyqVar = new zzgyq(zza);
                    zzb = zzgyqVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzgyqVar;
    }

    public final zzgti zzf() {
        zzgti zzgtiVar = this.zze;
        return zzgtiVar == null ? zzgti.zzf() : zzgtiVar;
    }
}
