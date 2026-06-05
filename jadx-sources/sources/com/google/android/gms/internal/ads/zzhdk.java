package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzhdk extends zzgyv implements zzhah {
    private static final zzhdk zza;
    private static volatile zzhao zzb;
    private int zzc;
    private zzhdj zzd;
    private zzgxn zzf;
    private zzgxn zzg;
    private int zzh;
    private byte zzi = 2;
    private zzgzh zze = zzgyv.zzbK();

    static {
        zzhdk zzhdkVar = new zzhdk();
        zza = zzhdkVar;
        zzgyv.zzbZ(zzhdk.class, zzhdkVar);
    }

    private zzhdk() {
        zzgxn zzgxnVar = zzgxn.zzb;
        this.zzf = zzgxnVar;
        this.zzg = zzgxnVar;
    }

    public static zzhdh zzc() {
        return (zzhdh) zza.zzaZ();
    }

    public static /* synthetic */ void zzf(zzhdk zzhdkVar, zzhdg zzhdgVar) {
        zzhdgVar.getClass();
        zzgzh zzgzhVar = zzhdkVar.zze;
        if (!zzgzhVar.zzc()) {
            zzhdkVar.zze = zzgyv.zzbL(zzgzhVar);
        }
        zzhdkVar.zze.add(zzhdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyv
    public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
        zzhao zzgyqVar;
        zzhfe zzhfeVar = null;
        switch (zzgyuVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzi);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzi = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgyv.zzbQ(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001\u1009\u0000\u0002\u041b\u0003\u100a\u0001\u0004\u100a\u0002\u0005\u1004\u0003", new Object[]{"zzc", "zzd", "zze", zzhdg.class, "zzf", "zzg", "zzh"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhdk();
            case NEW_BUILDER:
                return new zzhdh(zzhfeVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzhao zzhaoVar = zzb;
                if (zzhaoVar != null) {
                    return zzhaoVar;
                }
                synchronized (zzhdk.class) {
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
            default:
                throw null;
        }
    }
}
