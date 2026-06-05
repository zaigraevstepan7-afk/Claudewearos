package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzhfd extends zzgyv implements zzhah {
    private static final zzhfd zza;
    private static volatile zzhao zzb;
    private int zzc;
    private boolean zzj;
    private double zzk;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzu;
    private String zzd = "";
    private String zze = "";
    private int zzf = 4;
    private zzgzh zzg = zzgyv.zzbK();
    private String zzh = "";
    private String zzi = "";
    private zzgzh zzl = zzgyv.zzbK();

    static {
        zzhfd zzhfdVar = new zzhfd();
        zza = zzhfdVar;
        zzgyv.zzbZ(zzhfd.class, zzhfdVar);
    }

    private zzhfd() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001\u1008\u0000\u0002\u180c\u0002\u0003\u001a\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1007\u0005\u0007\u1000\u0006\b\u001b\t\u1008\u0001\n\u180c\u0007\u000b\u1007\b\f\u1007\t\r\u1007\n\u000e\u1007\u000b", new Object[]{"zzc", "zzd", "zzf", zzhfc.zza, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzhfb.class, "zze", "zzm", zzhez.zza, "zzn", "zzo", "zzp", "zzu"});
        }
        if (iOrdinal == 3) {
            return new zzhfd();
        }
        zzhfe zzhfeVar = null;
        if (iOrdinal == 4) {
            return new zzhey(zzhfeVar);
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
        synchronized (zzhfd.class) {
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
