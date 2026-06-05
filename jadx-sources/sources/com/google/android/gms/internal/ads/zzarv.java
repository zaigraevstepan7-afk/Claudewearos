package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzarv extends zzgyv implements zzhah {
    private static final zzarv zza;
    private static volatile zzhao zzb;
    private int zzc;
    private int zzd;
    private boolean zzg;
    private zzasn zzi;
    private zzasq zzj;
    private boolean zzk;
    private boolean zze = true;
    private String zzf = "unknown_host";
    private boolean zzh = true;

    static {
        zzarv zzarvVar = new zzarv();
        zza = zzarvVar;
        zzgyv.zzbZ(zzarv.class, zzarvVar);
    }

    private zzarv() {
    }

    public static zzart zza() {
        return (zzart) zza.zzaZ();
    }

    public static /* synthetic */ void zzg(zzarv zzarvVar, boolean z2) {
        zzarvVar.zzc |= 8;
        zzarvVar.zzg = z2;
    }

    public static /* synthetic */ void zzh(zzarv zzarvVar, String str) {
        str.getClass();
        zzarvVar.zzc |= 4;
        zzarvVar.zzf = str;
    }

    public final zzasn zzc() {
        zzasn zzasnVar = this.zzi;
        return zzasnVar == null ? zzasn.zzc() : zzasnVar;
    }

    public final zzasq zzd() {
        zzasq zzasqVar = this.zzj;
        return zzasqVar == null ? zzasq.zzb() : zzasqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1007\u0001\u0003\u1008\u0002\u0004\u1007\u0003\u0005\u1007\u0004\u0006\u1009\u0005\u0007\u1009\u0006\b\u1007\u0007", new Object[]{"zzc", "zzd", zzarw.zza, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (iOrdinal == 3) {
            return new zzarv();
        }
        zzaru zzaruVar = null;
        if (iOrdinal == 4) {
            return new zzart(zzaruVar);
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
        synchronized (zzarv.class) {
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

    public final String zzf() {
        return this.zzf;
    }

    @Deprecated
    public final boolean zzi() {
        return this.zzg;
    }
}
