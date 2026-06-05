package com.google.android.gms.internal.ads;

import java.util.Objects;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzghr extends zzgfo {
    private final zzghq zza;

    private zzghr(zzghq zzghqVar) {
        this.zza = zzghqVar;
    }

    public static zzghr zzc(zzghq zzghqVar) {
        return new zzghr(zzghqVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzghr) && ((zzghr) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzghr.class, this.zza);
    }

    public final String toString() {
        return m1.j("ChaCha20Poly1305 Parameters (variant: ", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final boolean zza() {
        return this.zza != zzghq.zzc;
    }

    public final zzghq zzb() {
        return this.zza;
    }
}
