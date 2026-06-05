package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzhcw extends zzgyv implements zzhah {
    private static final zzhcw zza;
    private static volatile zzhao zzb;
    private int zzc;
    private String zzd = "";

    static {
        zzhcw zzhcwVar = new zzhcw();
        zza = zzhcwVar;
        zzgyv.zzbZ(zzhcw.class, zzhcwVar);
    }

    private zzhcw() {
    }

    public static zzhcv zzc() {
        return (zzhcv) zza.zzaZ();
    }

    public static /* synthetic */ void zzf(zzhcw zzhcwVar, String str) {
        zzhcwVar.zzc |= 1;
        zzhcwVar.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[]{"zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhcw();
        }
        zzhfe zzhfeVar = null;
        if (iOrdinal == 4) {
            return new zzhcv(zzhfeVar);
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
        synchronized (zzhcw.class) {
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
