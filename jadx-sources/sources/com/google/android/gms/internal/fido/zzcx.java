package com.google.android.gms.internal.fido;

import java.io.Serializable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzcx extends zzcs implements Serializable {
    final zzcs zza;

    public zzcx(zzcs zzcsVar) {
        this.zza = zzcsVar;
    }

    @Override // com.google.android.gms.internal.fido.zzcs, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcx) {
            return this.zza.equals(((zzcx) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }

    @Override // com.google.android.gms.internal.fido.zzcs
    public final zzcs zza() {
        return this.zza;
    }
}
