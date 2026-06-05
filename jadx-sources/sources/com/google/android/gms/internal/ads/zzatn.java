package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzatn extends zzgyv implements zzhah {
    private static final zzatn zza;
    private static volatile zzhao zzb;
    private int zzc;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;

    static {
        zzatn zzatnVar = new zzatn();
        zza = zzatnVar;
        zzgyv.zzbZ(zzatn.class, zzatnVar);
    }

    private zzatn() {
    }

    public static zzatm zza() {
        return (zzatm) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzatn zzatnVar, long j) {
        zzatnVar.zzc |= 32;
        zzatnVar.zzi = j;
    }

    public static /* synthetic */ void zzd(zzatn zzatnVar, long j) {
        zzatnVar.zzc |= 4;
        zzatnVar.zzf = j;
    }

    public static /* synthetic */ void zzf(zzatn zzatnVar, long j) {
        zzatnVar.zzc |= 1;
        zzatnVar.zzd = j;
    }

    public static /* synthetic */ void zzg(zzatn zzatnVar, long j) {
        zzatnVar.zzc |= 8;
        zzatnVar.zzg = j;
    }

    public static /* synthetic */ void zzh(zzatn zzatnVar, long j) {
        zzatnVar.zzc |= 16;
        zzatnVar.zzh = j;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1002\u0004\u0006\u1002\u0005\u0007\u1002\u0006\b\u1002\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (iOrdinal == 3) {
            return new zzatn();
        }
        zzaug zzaugVar = null;
        if (iOrdinal == 4) {
            return new zzatm(zzaugVar);
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
        synchronized (zzatn.class) {
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
