package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfhy extends zzgyv implements zzhah {
    private static final zzfhy zza;
    private static volatile zzhao zzb;
    private zzgzh zzc = zzgyv.zzbK();

    static {
        zzfhy zzfhyVar = new zzfhy();
        zza = zzfhyVar;
        zzgyv.zzbZ(zzfhy.class, zzfhyVar);
    }

    private zzfhy() {
    }

    public static zzfhu zzb() {
        return (zzfhu) zza.zzaZ();
    }

    public static /* synthetic */ void zzd(zzfhy zzfhyVar, zzfhw zzfhwVar) {
        zzfhwVar.getClass();
        zzgzh zzgzhVar = zzfhyVar.zzc;
        if (!zzgzhVar.zzc()) {
            zzfhyVar.zzc = zzgyv.zzbL(zzgzhVar);
        }
        zzfhyVar.zzc.add(zzfhwVar);
    }

    public final int zza() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzfhw.class});
        }
        if (iOrdinal == 3) {
            return new zzfhy();
        }
        zzfhx zzfhxVar = null;
        if (iOrdinal == 4) {
            return new zzfhu(zzfhxVar);
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
        synchronized (zzfhy.class) {
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
