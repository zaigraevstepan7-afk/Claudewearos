package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgvc extends zzgyv implements zzhah {
    private static final zzgvc zza;
    private static volatile zzhao zzb;
    private int zzc;
    private int zzd;
    private zzgvf zze;

    static {
        zzgvc zzgvcVar = new zzgvc();
        zza = zzgvcVar;
        zzgyv.zzbZ(zzgvc.class, zzgvcVar);
    }

    private zzgvc() {
    }

    public static zzgva zzb() {
        return (zzgva) zza.zzaZ();
    }

    public static zzgvc zzd(zzgxn zzgxnVar, zzgyf zzgyfVar) {
        return (zzgvc) zzgyv.zzbr(zza, zzgxnVar, zzgyfVar);
    }

    public static /* synthetic */ void zzg(zzgvc zzgvcVar, zzgvf zzgvfVar) {
        zzgvfVar.getClass();
        zzgvcVar.zze = zzgvfVar;
        zzgvcVar.zzc |= 1;
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\u1009\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzgvc();
        }
        zzgvb zzgvbVar = null;
        if (iOrdinal == 4) {
            return new zzgva(zzgvbVar);
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
        synchronized (zzgvc.class) {
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

    public final zzgvf zzf() {
        zzgvf zzgvfVar = this.zze;
        return zzgvfVar == null ? zzgvf.zzd() : zzgvfVar;
    }
}
