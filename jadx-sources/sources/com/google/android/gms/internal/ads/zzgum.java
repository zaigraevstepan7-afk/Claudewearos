package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgum extends zzgyv implements zzhah {
    private static final zzgum zza;
    private static volatile zzhao zzb;
    private String zzc = "";

    static {
        zzgum zzgumVar = new zzgum();
        zza = zzgumVar;
        zzgyv.zzbZ(zzgum.class, zzgumVar);
    }

    private zzgum() {
    }

    public static zzguk zza() {
        return (zzguk) zza.zzaZ();
    }

    public static zzgum zzc() {
        return zza;
    }

    public static zzgum zzd(zzgxn zzgxnVar, zzgyf zzgyfVar) {
        return (zzgum) zzgyv.zzbr(zza, zzgxnVar, zzgyfVar);
    }

    public static /* synthetic */ void zzg(zzgum zzgumVar, String str) {
        str.getClass();
        zzgumVar.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[]{"zzc"});
        }
        if (iOrdinal == 3) {
            return new zzgum();
        }
        zzgul zzgulVar = null;
        if (iOrdinal == 4) {
            return new zzguk(zzgulVar);
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
        synchronized (zzgum.class) {
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

    public final String zzf() {
        return this.zzc;
    }
}
