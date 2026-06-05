package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeo {
    public static final zzeo zza = new zzeo(-1, -1);
    private final int zzb;
    private final int zzc;

    static {
        new zzeo(0, 0);
    }

    public zzeo(int i10, int i11) {
        boolean z2 = false;
        if ((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0)) {
            z2 = true;
        }
        zzdd.zzd(z2);
        this.zzb = i10;
        this.zzc = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzeo) {
            zzeo zzeoVar = (zzeo) obj;
            if (this.zzb == zzeoVar.zzb && this.zzc == zzeoVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.zzc;
    }

    public final String toString() {
        return this.zzb + "x" + this.zzc;
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }
}
