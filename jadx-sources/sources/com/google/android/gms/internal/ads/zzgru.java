package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgru extends zzgyv implements zzhah {
    private static final zzgru zza;
    private static volatile zzhao zzb;
    private int zzc;
    private int zzd;
    private zzgsa zze;
    private zzgxn zzf = zzgxn.zzb;

    static {
        zzgru zzgruVar = new zzgru();
        zza = zzgruVar;
        zzgyv.zzbZ(zzgru.class, zzgruVar);
    }

    private zzgru() {
    }

    public static zzgrs zzb() {
        return (zzgrs) zza.zzaZ();
    }

    public static zzgru zzd() {
        return zza;
    }

    public static /* synthetic */ void zzi(zzgru zzgruVar, zzgsa zzgsaVar) {
        zzgsaVar.getClass();
        zzgruVar.zze = zzgsaVar;
        zzgruVar.zzc |= 1;
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
            return zzgyv.zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u1009\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzgru();
        }
        zzgrt zzgrtVar = null;
        if (iOrdinal == 4) {
            return new zzgrs(zzgrtVar);
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
        synchronized (zzgru.class) {
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

    public final zzgsa zzf() {
        zzgsa zzgsaVar = this.zze;
        return zzgsaVar == null ? zzgsa.zzd() : zzgsaVar;
    }

    public final zzgxn zzg() {
        return this.zzf;
    }
}
