package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzhee extends zzgyv implements zzhah {
    private static final zzhee zza;
    private static volatile zzhao zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private zzgxn zzf;
    private zzgxn zzg;

    static {
        zzhee zzheeVar = new zzhee();
        zza = zzheeVar;
        zzgyv.zzbZ(zzhee.class, zzheeVar);
    }

    private zzhee() {
        zzgxn zzgxnVar = zzgxn.zzb;
        this.zzf = zzgxnVar;
        this.zzg = zzgxnVar;
    }

    public static zzhec zzc() {
        return (zzhec) zza.zzaZ();
    }

    public static /* synthetic */ void zzf(zzhee zzheeVar, zzgxn zzgxnVar) {
        zzgxnVar.getClass();
        zzheeVar.zzc |= 4;
        zzheeVar.zzf = zzgxnVar;
    }

    public static /* synthetic */ void zzg(zzhee zzheeVar, String str) {
        zzheeVar.zzc |= 2;
        zzheeVar.zze = "image/png";
    }

    public static /* synthetic */ void zzh(zzhee zzheeVar, int i10) {
        zzheeVar.zzd = 1;
        zzheeVar.zzc = 1 | zzheeVar.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1008\u0001\u0003\u100a\u0002\u0004\u100a\u0003", new Object[]{"zzc", "zzd", zzhed.zza, "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new zzhee();
        }
        zzhfe zzhfeVar = null;
        if (iOrdinal == 4) {
            return new zzhec(zzhfeVar);
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
        synchronized (zzhee.class) {
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
