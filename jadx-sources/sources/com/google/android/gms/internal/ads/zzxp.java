package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzxp {
    public final long zza;
    public final long zzb;

    public zzxp(long j, long j4) {
        this.zza = j;
        this.zzb = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzxp)) {
            return false;
        }
        zzxp zzxpVar = (zzxp) obj;
        return this.zza == zzxpVar.zza && this.zzb == zzxpVar.zzb;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}
