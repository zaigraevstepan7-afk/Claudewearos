package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzpe {
    private final Class<?> zza;
    private final Class<? extends zzox> zzb;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzpe)) {
            return false;
        }
        zzpe zzpeVar = (zzpe) obj;
        return zzpeVar.zza.equals(this.zza) && zzpeVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return m1.w(this.zza.getSimpleName(), " with serialization type: ", this.zzb.getSimpleName());
    }

    private zzpe(Class<?> cls, Class<? extends zzox> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }
}
