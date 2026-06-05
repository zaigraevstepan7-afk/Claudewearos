package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzpq {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzpq zza(boolean z2) {
        this.zza = true;
        return this;
    }

    public final zzpq zzb(boolean z2) {
        this.zzb = z2;
        return this;
    }

    public final zzpq zzc(boolean z2) {
        this.zzc = z2;
        return this;
    }

    public final zzps zzd() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzps(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
