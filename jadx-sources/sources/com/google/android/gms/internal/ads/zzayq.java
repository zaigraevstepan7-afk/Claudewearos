package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzayq extends zzgyv implements zzhah {
    private static final zzayq zza;
    private static volatile zzhao zzb;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        zzayq zzayqVar = new zzayq();
        zza = zzayqVar;
        zzgyv.zzbZ(zzayq.class, zzayqVar);
    }

    private zzayq() {
    }

    public static zzayo zzd() {
        return (zzayo) zza.zzaZ();
    }

    public static zzayq zzg() {
        return zza;
    }

    public static zzayq zzh(zzgxn zzgxnVar) {
        return (zzayq) zzgyv.zzbm(zza, zzgxnVar);
    }

    public static zzayq zzi(zzgxn zzgxnVar, zzgyf zzgyfVar) {
        return (zzayq) zzgyv.zzbr(zza, zzgxnVar, zzgyfVar);
    }

    public static /* synthetic */ void zzl(zzayq zzayqVar, String str) {
        str.getClass();
        zzayqVar.zzc |= 2;
        zzayqVar.zze = str;
    }

    public static /* synthetic */ void zzm(zzayq zzayqVar, long j) {
        zzayqVar.zzc |= 8;
        zzayqVar.zzg = j;
    }

    public static /* synthetic */ void zzn(zzayq zzayqVar, long j) {
        zzayqVar.zzc |= 4;
        zzayqVar.zzf = j;
    }

    public static /* synthetic */ void zzo(zzayq zzayqVar, long j) {
        zzayqVar.zzc |= 16;
        zzayqVar.zzh = j;
    }

    public static /* synthetic */ void zzp(zzayq zzayqVar, String str) {
        str.getClass();
        zzayqVar.zzc |= 1;
        zzayqVar.zzd = str;
    }

    public final long zza() {
        return this.zzg;
    }

    public final long zzb() {
        return this.zzf;
    }

    public final long zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1003\u0002\u0004\u1003\u0003\u0005\u1003\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (iOrdinal == 3) {
            return new zzayq();
        }
        zzayp zzaypVar = null;
        if (iOrdinal == 4) {
            return new zzayo(zzaypVar);
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
        synchronized (zzayq.class) {
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

    public final String zzj() {
        return this.zze;
    }

    public final String zzk() {
        return this.zzd;
    }
}
