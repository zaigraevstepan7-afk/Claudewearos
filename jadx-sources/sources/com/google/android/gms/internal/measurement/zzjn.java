package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzjn {
    private final Object zza;
    private final int zzb;

    public zzjn(Object obj, int i10) {
        this.zza = obj;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjn)) {
            return false;
        }
        zzjn zzjnVar = (zzjn) obj;
        return this.zza == zzjnVar.zza && this.zzb == zzjnVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
