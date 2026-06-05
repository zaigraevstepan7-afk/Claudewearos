package com.google.android.gms.internal.ads;

import java.util.Objects;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgoh {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgoh(Class cls, Class cls2, zzgoi zzgoiVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgoh)) {
            return false;
        }
        zzgoh zzgohVar = (zzgoh) obj;
        return zzgohVar.zza.equals(this.zza) && zzgohVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return m1.w(this.zza.getSimpleName(), " with primitive type: ", this.zzb.getSimpleName());
    }
}
