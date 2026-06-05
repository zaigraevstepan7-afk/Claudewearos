package com.google.android.gms.internal.ads;

import java.util.Objects;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgos {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgos(Class cls, Class cls2, zzgot zzgotVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgos)) {
            return false;
        }
        zzgos zzgosVar = (zzgos) obj;
        return zzgosVar.zza.equals(this.zza) && zzgosVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return m1.w(this.zza.getSimpleName(), " with serialization type: ", this.zzb.getSimpleName());
    }
}
