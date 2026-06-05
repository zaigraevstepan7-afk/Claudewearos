package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzhcs extends zzgyv implements zzhah {
    private static final zzhcs zza;
    private static volatile zzhao zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private int zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private boolean zzv;
    private long zzw;
    private boolean zzy;
    private String zzf = "";
    private zzgzh zzg = zzgyv.zzbK();
    private String zzl = "";
    private zzgzh zzu = zzgyv.zzbK();
    private zzgzd zzx = zzgyv.zzbG();
    private zzgzd zzz = zzgyv.zzbG();

    static {
        zzhcs zzhcsVar = new zzhcs();
        zza = zzhcsVar;
        zzgyv.zzbZ(zzhcs.class, zzhcsVar);
    }

    private zzhcs() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001\u180c\u0000\u0002\u1007\u0001\u0003\u1008\u0002\u0004\u001a\u0005\u180c\u0003\u0006\u1007\u0004\u0007\u1007\u0005\b\u1007\u0006\t\u1008\u0007\n\u1004\b\u000b\u1004\t\f\u1004\n\r\u1007\u000b\u000e\u001b\u000f\u1007\f\u0010\u1002\r\u0011\u082c\u0012\u1007\u000e\u0013\u082c", new Object[]{"zzc", "zzd", zzhcr.zza, "zze", "zzf", "zzg", "zzh", zzhcp.zza, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", zzhco.class, "zzv", "zzw", "zzx", zzhcf.zza(), "zzy", "zzz", zzhcq.zza});
        }
        if (iOrdinal == 3) {
            return new zzhcs();
        }
        zzhfe zzhfeVar = null;
        if (iOrdinal == 4) {
            return new zzhcl(zzhfeVar);
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
        synchronized (zzhcs.class) {
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
