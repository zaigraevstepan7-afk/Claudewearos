package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbch;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzasz extends zzgyv implements zzhah {
    private static final zzasz zza;
    private static volatile zzhao zzb;
    private int zzc;
    private long zzd = -1;
    private int zze = zzbch.zzq.zzf;
    private int zzf = zzbch.zzq.zzf;

    static {
        zzasz zzaszVar = new zzasz();
        zza = zzaszVar;
        zzgyv.zzbZ(zzasz.class, zzaszVar);
    }

    private zzasz() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            zzgzb zzgzbVar = zzatw.zza;
            return zzgyv.zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u180c\u0001\u0003\u180c\u0002", new Object[]{"zzc", "zzd", "zze", zzgzbVar, "zzf", zzgzbVar});
        }
        if (iOrdinal == 3) {
            return new zzasz();
        }
        zzaug zzaugVar = null;
        if (iOrdinal == 4) {
            return new zzasy(zzaugVar);
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
        synchronized (zzasz.class) {
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
