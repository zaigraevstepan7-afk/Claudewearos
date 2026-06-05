package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgug extends zzgyv implements zzhah {
    private static final zzgug zza;
    private static volatile zzhao zzb;
    private int zzc;
    private zzgzh zzd = zzgyv.zzbK();

    static {
        zzgug zzgugVar = new zzgug();
        zza = zzgugVar;
        zzgyv.zzbZ(zzgug.class, zzgugVar);
    }

    private zzgug() {
    }

    public static zzguc zza() {
        return (zzguc) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzgug zzgugVar, zzgue zzgueVar) {
        zzgueVar.getClass();
        zzgzh zzgzhVar = zzgugVar.zzd;
        if (!zzgzhVar.zzc()) {
            zzgugVar.zzd = zzgyv.zzbL(zzgzhVar);
        }
        zzgugVar.zzd.add(zzgueVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        int iOrdinal = zzgyuVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgyv.zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", zzgue.class});
        }
        if (iOrdinal == 3) {
            return new zzgug();
        }
        zzguf zzgufVar = null;
        if (iOrdinal == 4) {
            return new zzguc(zzgufVar);
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
        synchronized (zzgug.class) {
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
