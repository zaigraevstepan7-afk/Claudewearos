package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzku extends zzhk implements zzin {
    private static final zzku zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private int zzg;
    private long zzh;

    static {
        zzku zzkuVar = new zzku();
        zzb = zzkuVar;
        zzhk.zzx(zzku.class, zzkuVar);
    }

    private zzku() {
    }

    public static /* synthetic */ void zzC(zzku zzkuVar, int i10) {
        zzkuVar.zzd |= 4;
        zzkuVar.zzg = i10;
    }

    public static /* synthetic */ void zzD(zzku zzkuVar, long j) {
        zzkuVar.zzd |= 8;
        zzkuVar.zzh = j;
    }

    public static /* synthetic */ void zzE(zzku zzkuVar, String str) {
        str.getClass();
        zzkuVar.zzd |= 2;
        zzkuVar.zzf = str;
    }

    public static /* synthetic */ void zzF(zzku zzkuVar, String str) {
        str.getClass();
        zzkuVar.zzd |= 1;
        zzkuVar.zze = str;
    }

    public static zzks zzc() {
        return (zzks) zzb.zzm();
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1004\u0002\u0004\u1002\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzku();
        }
        zzkt zzktVar = null;
        if (i11 == 4) {
            return new zzks(zzktVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
