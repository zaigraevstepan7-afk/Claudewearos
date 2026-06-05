package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzhex extends zzgyv implements zzhah {
    private static final zzhex zza;
    private static volatile zzhao zzb;
    private int zzc;
    private int zzd;
    private int zzg;
    private String zze = "";
    private zzgzd zzf = zzgyv.zzbG();
    private zzgzh zzh = zzgyv.zzbK();
    private zzgxn zzi = zzgxn.zzb;

    static {
        zzhex zzhexVar = new zzhex();
        zza = zzhexVar;
        zzgyv.zzbZ(zzhex.class, zzhexVar);
    }

    private zzhex() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u0016\u0005\u1004\u0002\u0006\u001b\u0007\u100a\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", zzhev.class, "zzi"});
        }
        if (iOrdinal == 3) {
            return new zzhex();
        }
        zzhfe zzhfeVar = null;
        if (iOrdinal == 4) {
            return new zzhew(zzhfeVar);
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
        synchronized (zzhex.class) {
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
}
