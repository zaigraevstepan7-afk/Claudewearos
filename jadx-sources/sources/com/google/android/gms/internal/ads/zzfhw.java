package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfhw extends zzgyv implements zzhah {
    private static final zzfhw zza;
    private static volatile zzhao zzb;
    private int zzc;
    private zzfht zzd;

    static {
        zzfhw zzfhwVar = new zzfhw();
        zza = zzfhwVar;
        zzgyv.zzbZ(zzfhw.class, zzfhwVar);
    }

    private zzfhw() {
    }

    public static zzfhv zza() {
        return (zzfhv) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzfhw zzfhwVar, zzfht zzfhtVar) {
        zzfhtVar.getClass();
        zzfhwVar.zzd = zzfhtVar;
        zzfhwVar.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006\u1009\u0000", new Object[]{"zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzfhw();
        }
        zzfhx zzfhxVar = null;
        if (iOrdinal == 4) {
            return new zzfhv(zzfhxVar);
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
        synchronized (zzfhw.class) {
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
