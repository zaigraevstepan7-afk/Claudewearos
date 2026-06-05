package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaty extends zzgyv implements zzhah {
    private static final zzaty zza;
    private static volatile zzhao zzb;
    private int zzc;
    private long zzf;
    private long zzh;
    private long zzi;
    private String zzd = "";
    private String zze = "";
    private String zzg = "D";

    static {
        zzaty zzatyVar = new zzaty();
        zza = zzatyVar;
        zzgyv.zzbZ(zzaty.class, zzatyVar);
    }

    private zzaty() {
    }

    public static zzatx zza() {
        return (zzatx) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzaty zzatyVar, String str) {
        zzatyVar.zzc |= 1;
        zzatyVar.zzd = "0.460000000";
    }

    public static /* synthetic */ void zzd(zzaty zzatyVar, String str) {
        str.getClass();
        zzatyVar.zzc |= 2;
        zzatyVar.zze = str;
    }

    public static /* synthetic */ void zzf(zzaty zzatyVar, String str) {
        str.getClass();
        zzatyVar.zzc |= 8;
        zzatyVar.zzg = str;
    }

    public static /* synthetic */ void zzg(zzaty zzatyVar, long j) {
        zzatyVar.zzc |= 4;
        zzatyVar.zzf = j;
    }

    public static /* synthetic */ void zzh(zzaty zzatyVar, long j) {
        zzatyVar.zzc |= 32;
        zzatyVar.zzi = j;
    }

    public static /* synthetic */ void zzi(zzaty zzatyVar, long j) {
        zzatyVar.zzc |= 16;
        zzatyVar.zzh = j;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1002\u0002\u0004\u1008\u0003\u0005\u1002\u0004\u0006\u1002\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new zzaty();
        }
        zzaug zzaugVar = null;
        if (iOrdinal == 4) {
            return new zzatx(zzaugVar);
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
        synchronized (zzaty.class) {
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
