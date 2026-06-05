package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzkr extends zzhk implements zzin {
    private static final zzkr zzb;
    private int zzd;
    private int zzf;
    private zzki zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private zzhn zzg = zzhk.zzr();
    private zzho zzh = zzhk.zzs();

    static {
        zzkr zzkrVar = new zzkr();
        zzb = zzkrVar;
        zzhk.zzx(zzkr.class, zzkrVar);
    }

    private zzkr() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzhk
    public final Object zzd(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001\u1008\u0000\u0002\u180c\u0001\u0003\u082c\u0004\u001b\u0005\u1009\u0002\u0006\u1007\u0003\u0007\u1007\u0004", new Object[]{"zzd", "zze", "zzf", zzkp.zza, "zzg", zzkm.zza, "zzh", zzln.class, "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new zzkr();
        }
        zzkq zzkqVar = null;
        if (i11 == 4) {
            return new zzko(zzkqVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
