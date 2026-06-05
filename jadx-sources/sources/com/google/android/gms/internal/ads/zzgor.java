package com.google.android.gms.internal.ads;

import java.util.Objects;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgor {
    private final Class zza;
    private final zzgws zzb;

    public /* synthetic */ zzgor(Class cls, zzgws zzgwsVar, zzgot zzgotVar) {
        this.zza = cls;
        this.zzb = zzgwsVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgor)) {
            return false;
        }
        zzgor zzgorVar = (zzgor) obj;
        return zzgorVar.zza.equals(this.zza) && zzgorVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return m1.w(this.zza.getSimpleName(), ", object identifier: ", String.valueOf(this.zzb));
    }
}
