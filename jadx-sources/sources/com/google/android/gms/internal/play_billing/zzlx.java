package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzlx extends zzhk implements zzin {
    private static final zzlx zzb;
    private int zzd;
    private int zze;
    private boolean zzf;

    static {
        zzlx zzlxVar = new zzlx();
        zzb = zzlxVar;
        zzhk.zzx(zzlx.class, zzlxVar);
    }

    private zzlx() {
    }

    public static /* synthetic */ void zzC(zzlx zzlxVar, boolean z2) {
        zzlxVar.zzd |= 2;
        zzlxVar.zzf = true;
    }

    public static zzlv zzc() {
        return (zzlv) zzb.zzm();
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1007\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzlx();
        }
        zzlw zzlwVar = null;
        if (i11 == 4) {
            return new zzlv(zzlwVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
