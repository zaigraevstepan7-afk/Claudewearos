package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfzz extends zzfzq implements Serializable {
    final zzfzq zza;

    public zzfzz(zzfzq zzfzqVar) {
        this.zza = zzfzqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzq, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfzz) {
            return this.zza.equals(((zzfzz) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }
}
