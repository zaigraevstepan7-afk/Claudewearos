package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaet {
    public static final zzaet zza = new zzaet(0, 0);
    public final long zzb;
    public final long zzc;

    public zzaet(long j, long j4) {
        this.zzb = j;
        this.zzc = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaet.class == obj.getClass()) {
            zzaet zzaetVar = (zzaet) obj;
            if (this.zzb == zzaetVar.zzb && this.zzc == zzaetVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        return "[timeUs=" + this.zzb + ", position=" + this.zzc + "]";
    }
}
