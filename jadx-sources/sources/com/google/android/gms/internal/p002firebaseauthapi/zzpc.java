package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzpc {
    private final Class<? extends zzox> zza;
    private final zzxv zzb;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzpc)) {
            return false;
        }
        zzpc zzpcVar = (zzpc) obj;
        return zzpcVar.zza.equals(this.zza) && zzpcVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return m1.w(this.zza.getSimpleName(), ", object identifier: ", String.valueOf(this.zzb));
    }

    private zzpc(Class<? extends zzox> cls, zzxv zzxvVar) {
        this.zza = cls;
        this.zzb = zzxvVar;
    }
}
