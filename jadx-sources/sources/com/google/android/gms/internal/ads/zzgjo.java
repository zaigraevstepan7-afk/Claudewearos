package com.google.android.gms.internal.ads;

import java.util.Objects;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgjo extends zzgfo {
    private final zzgjn zza;

    private zzgjo(zzgjn zzgjnVar) {
        this.zza = zzgjnVar;
    }

    public static zzgjo zzc(zzgjn zzgjnVar) {
        return new zzgjo(zzgjnVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzgjo) && ((zzgjo) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzgjo.class, this.zza);
    }

    public final String toString() {
        return m1.j("XChaCha20Poly1305 Parameters (variant: ", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final boolean zza() {
        return this.zza != zzgjn.zzc;
    }

    public final zzgjn zzb() {
        return this.zza;
    }
}
