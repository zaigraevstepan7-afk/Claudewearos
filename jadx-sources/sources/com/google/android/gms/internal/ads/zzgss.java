package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgss extends zzgyv implements zzhah {
    private static final zzgss zza;
    private static volatile zzhao zzb;
    private int zzc;
    private zzgxn zzd = zzgxn.zzb;

    static {
        zzgss zzgssVar = new zzgss();
        zza = zzgssVar;
        zzgyv.zzbZ(zzgss.class, zzgssVar);
    }

    private zzgss() {
    }

    public static zzgsq zzb() {
        return (zzgsq) zza.zzaZ();
    }

    public static zzgss zzd(zzgxn zzgxnVar, zzgyf zzgyfVar) {
        return (zzgss) zzgyv.zzbr(zza, zzgxnVar, zzgyfVar);
    }

    public static zzhao zzg() {
        return zza.zzbN();
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
            return zzgyv.zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzgss();
        }
        zzgsr zzgsrVar = null;
        if (iOrdinal == 4) {
            return new zzgsq(zzgsrVar);
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
        synchronized (zzgss.class) {
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

    public final zzgxn zzf() {
        return this.zzd;
    }
}
