package com.google.android.gms.internal.ads;

import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfvj extends zzfvc {
    private final Object zza;

    public zzfvj(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfvj) {
            return this.zza.equals(((zzfvj) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return m1.j("Optional.of(", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzfvc
    public final zzfvc zza(zzfut zzfutVar) {
        Object objApply = zzfutVar.apply(this.zza);
        zzfve.zzc(objApply, "the Function passed to Optional.transform() must not return null.");
        return new zzfvj(objApply);
    }

    @Override // com.google.android.gms.internal.ads.zzfvc
    public final Object zzb(Object obj) {
        return this.zza;
    }
}
