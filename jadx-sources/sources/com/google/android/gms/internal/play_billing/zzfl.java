package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzfl extends zzhk implements zzin {
    private static final zzfl zzb;
    private int zzd;
    private zzfq zze;
    private zzfq zzf;
    private int zzg;

    static {
        zzfl zzflVar = new zzfl();
        zzb = zzflVar;
        zzhk.zzx(zzfl.class, zzflVar);
    }

    private zzfl() {
    }

    public static zzfk zza() {
        return (zzfk) zzb.zzm();
    }

    public static /* synthetic */ void zzc(zzfl zzflVar, zzfq zzfqVar) {
        zzfqVar.getClass();
        zzflVar.zze = zzfqVar;
        zzflVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u180c\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", zzft.zza()});
        }
        if (i11 == 3) {
            return new zzfl();
        }
        zzfo zzfoVar = null;
        if (i11 == 4) {
            return new zzfk(zzfoVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
