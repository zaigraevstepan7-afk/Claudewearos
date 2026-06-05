package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzats extends zzgyv implements zzhah {
    private static final zzats zza;
    private static volatile zzhao zzb;
    private int zzc;
    private zzgxn zzd;
    private zzgxn zze;
    private zzgxn zzf;
    private zzgxn zzg;

    static {
        zzats zzatsVar = new zzats();
        zza = zzatsVar;
        zzgyv.zzbZ(zzats.class, zzatsVar);
    }

    private zzats() {
        zzgxn zzgxnVar = zzgxn.zzb;
        this.zzd = zzgxnVar;
        this.zze = zzgxnVar;
        this.zzf = zzgxnVar;
        this.zzg = zzgxnVar;
    }

    public static zzatr zza() {
        return (zzatr) zza.zzaZ();
    }

    public static zzats zzc(byte[] bArr, zzgyf zzgyfVar) {
        return (zzats) zzgyv.zzbx(zza, bArr, zzgyfVar);
    }

    public static /* synthetic */ void zzi(zzats zzatsVar, zzgxn zzgxnVar) {
        zzatsVar.zzc |= 1;
        zzatsVar.zzd = zzgxnVar;
    }

    public static /* synthetic */ void zzj(zzats zzatsVar, zzgxn zzgxnVar) {
        zzatsVar.zzc |= 2;
        zzatsVar.zze = zzgxnVar;
    }

    public static /* synthetic */ void zzk(zzats zzatsVar, zzgxn zzgxnVar) {
        zzatsVar.zzc |= 8;
        zzatsVar.zzg = zzgxnVar;
    }

    public static /* synthetic */ void zzl(zzats zzatsVar, zzgxn zzgxnVar) {
        zzatsVar.zzc |= 4;
        zzatsVar.zzf = zzgxnVar;
    }

    public final zzgxn zzd() {
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
            return zzgyv.zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u100a\u0001\u0003\u100a\u0002\u0004\u100a\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new zzats();
        }
        zzaug zzaugVar = null;
        if (iOrdinal == 4) {
            return new zzatr(zzaugVar);
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
        synchronized (zzats.class) {
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

    public final zzgxn zzf() {
        return this.zze;
    }

    public final zzgxn zzg() {
        return this.zzg;
    }

    public final zzgxn zzh() {
        return this.zzf;
    }
}
