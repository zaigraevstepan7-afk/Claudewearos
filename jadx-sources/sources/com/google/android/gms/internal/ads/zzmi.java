package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzmi {
    public static final zzmi zza;
    public static final zzmi zzb;
    public final long zzc;
    public final long zzd;

    static {
        zzmi zzmiVar = new zzmi(0L, 0L);
        zza = zzmiVar;
        new zzmi(Long.MAX_VALUE, Long.MAX_VALUE);
        new zzmi(Long.MAX_VALUE, 0L);
        new zzmi(0L, Long.MAX_VALUE);
        zzb = zzmiVar;
    }

    public zzmi(long j, long j4) {
        zzdd.zzd(j >= 0);
        zzdd.zzd(j4 >= 0);
        this.zzc = j;
        this.zzd = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzmi.class == obj.getClass()) {
            zzmi zzmiVar = (zzmi) obj;
            if (this.zzc == zzmiVar.zzc && this.zzd == zzmiVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzc) * 31) + ((int) this.zzd);
    }
}
