package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzhdj extends zzgyv implements zzhah {
    private static final zzhdj zza;
    private static volatile zzhao zzb;
    private int zzc;
    private zzgxn zzd;
    private zzgxn zze;
    private zzgxn zzf;

    static {
        zzhdj zzhdjVar = new zzhdj();
        zza = zzhdjVar;
        zzgyv.zzbZ(zzhdj.class, zzhdjVar);
    }

    private zzhdj() {
        zzgxn zzgxnVar = zzgxn.zzb;
        this.zzd = zzgxnVar;
        this.zze = zzgxnVar;
        this.zzf = zzgxnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u100a\u0001\u0003\u100a\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzhdj();
        }
        zzhfe zzhfeVar = null;
        if (iOrdinal == 4) {
            return new zzhdi(zzhfeVar);
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
        synchronized (zzhdj.class) {
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
