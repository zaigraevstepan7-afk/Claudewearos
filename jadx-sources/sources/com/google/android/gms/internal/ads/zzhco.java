package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzhco extends zzgyv implements zzhah {
    private static final zzhco zza;
    private static volatile zzhao zzb;
    private int zzc;
    private int zzd;
    private long zze;
    private zzgxn zzf = zzgxn.zzb;

    static {
        zzhco zzhcoVar = new zzhco();
        zza = zzhcoVar;
        zzgyv.zzbZ(zzhco.class, zzhcoVar);
    }

    private zzhco() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1002\u0001\u0003\u100a\u0002", new Object[]{"zzc", "zzd", zzhcn.zza, "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzhco();
        }
        zzhfe zzhfeVar = null;
        if (iOrdinal == 4) {
            return new zzhcm(zzhfeVar);
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
        synchronized (zzhco.class) {
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
