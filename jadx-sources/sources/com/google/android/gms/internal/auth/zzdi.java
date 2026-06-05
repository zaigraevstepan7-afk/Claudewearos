package com.google.android.gms.internal.auth;

import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzdi extends zzdh {
    private final Object zza;

    public zzdi(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzdi) {
            return this.zza.equals(((zzdi) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return m1.j("Optional.of(", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.auth.zzdh
    public final Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.auth.zzdh
    public final boolean zzb() {
        return true;
    }
}
