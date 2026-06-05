package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzatf extends zzgyv implements zzhah {
    private static final zzatf zza;
    private static volatile zzhao zzb;
    private int zzc;
    private int zzd;
    private long zze = -1;

    static {
        zzatf zzatfVar = new zzatf();
        zza = zzatfVar;
        zzgyv.zzbZ(zzatf.class, zzatfVar);
    }

    private zzatf() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1002\u0001", new Object[]{"zzc", "zzd", zzasv.zza, "zze"});
        }
        if (iOrdinal == 3) {
            return new zzatf();
        }
        zzaug zzaugVar = null;
        if (iOrdinal == 4) {
            return new zzate(zzaugVar);
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
        synchronized (zzatf.class) {
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
