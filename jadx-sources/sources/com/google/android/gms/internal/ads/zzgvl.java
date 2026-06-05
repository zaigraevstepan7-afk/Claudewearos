package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgvl extends zzgyv implements zzhah {
    private static final zzgvl zza;
    private static volatile zzhao zzb;
    private int zzc;

    static {
        zzgvl zzgvlVar = new zzgvl();
        zza = zzgvlVar;
        zzgyv.zzbZ(zzgvl.class, zzgvlVar);
    }

    private zzgvl() {
    }

    public static zzgvl zzc() {
        return zza;
    }

    public static zzgvl zzd(zzgxn zzgxnVar, zzgyf zzgyfVar) {
        return (zzgvl) zzgyv.zzbr(zza, zzgxnVar, zzgyfVar);
    }

    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
        }
        if (iOrdinal == 3) {
            return new zzgvl();
        }
        zzgvk zzgvkVar = null;
        if (iOrdinal == 4) {
            return new zzgvj(zzgvkVar);
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
        synchronized (zzgvl.class) {
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
