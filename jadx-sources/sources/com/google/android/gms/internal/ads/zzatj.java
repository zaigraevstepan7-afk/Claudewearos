package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbch;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzatj extends zzgyv implements zzhah {
    private static final zzatj zza;
    private static volatile zzhao zzb;
    private int zzc;
    private long zzd = -1;
    private int zze = zzbch.zzq.zzf;

    static {
        zzatj zzatjVar = new zzatj();
        zza = zzatjVar;
        zzgyv.zzbZ(zzatj.class, zzatjVar);
    }

    private zzatj() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u180c\u0001", new Object[]{"zzc", "zzd", "zze", zzatw.zza});
        }
        if (iOrdinal == 3) {
            return new zzatj();
        }
        zzaug zzaugVar = null;
        if (iOrdinal == 4) {
            return new zzati(zzaugVar);
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
        synchronized (zzatj.class) {
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
