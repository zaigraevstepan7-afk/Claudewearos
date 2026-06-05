package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzasq extends zzgyv implements zzhah {
    public static final /* synthetic */ int zza = 0;
    private static final zzasq zzb;
    private static volatile zzhao zzc;
    private int zzd;
    private boolean zzf;
    private boolean zzg;
    private long zze = 100;
    private long zzh = 300;
    private long zzi = 1000;

    static {
        zzasq zzasqVar = new zzasq();
        zzb = zzasqVar;
        zzgyv.zzbZ(zzasq.class, zzasqVar);
    }

    private zzasq() {
    }

    public static zzasq zzb() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1002\u0003\u0005\u1002\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new zzasq();
        }
        zzasp zzaspVar = null;
        if (iOrdinal == 4) {
            return new zzaso(zzaspVar);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhao zzhaoVar = zzc;
        if (zzhaoVar != null) {
            return zzhaoVar;
        }
        synchronized (zzasq.class) {
            try {
                zzgyqVar = zzc;
                if (zzgyqVar == null) {
                    zzgyqVar = new zzgyq(zzb);
                    zzc = zzgyqVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzgyqVar;
    }
}
