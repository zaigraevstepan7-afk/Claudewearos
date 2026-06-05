package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzhel extends zzgyv implements zzhah {
    private static final zzhel zza;
    private static volatile zzhao zzb;
    private int zzc;
    private long zze;
    private boolean zzf;
    private int zzg;
    private boolean zzj;
    private boolean zzk;
    private String zzd = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzhel zzhelVar = new zzhel();
        zza = zzhelVar;
        zzgyv.zzbZ(zzhel.class, zzhelVar);
    }

    private zzhel() {
    }

    public static zzhek zzc() {
        return (zzhek) zza.zzaZ();
    }

    public static /* synthetic */ void zzf(zzhel zzhelVar, String str) {
        zzhelVar.zzc |= 1;
        zzhelVar.zzd = str;
    }

    public static /* synthetic */ void zzg(zzhel zzhelVar, long j) {
        zzhelVar.zzc |= 2;
        zzhelVar.zze = j;
    }

    public static /* synthetic */ void zzh(zzhel zzhelVar, boolean z2) {
        zzhelVar.zzc |= 4;
        zzhelVar.zzf = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u1007\u0002\u0004\u180c\u0003\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1007\u0006\b\u1007\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", zzhem.zza, "zzh", "zzi", "zzj", "zzk"});
        }
        if (iOrdinal == 3) {
            return new zzhel();
        }
        zzhfe zzhfeVar = null;
        if (iOrdinal == 4) {
            return new zzhek(zzhfeVar);
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
        synchronized (zzhel.class) {
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
