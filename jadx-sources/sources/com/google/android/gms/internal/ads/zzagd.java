package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
abstract class zzagd {
    protected final zzaez zza;

    public zzagd(zzaez zzaezVar) {
        this.zza = zzaezVar;
    }

    public abstract boolean zza(zzen zzenVar);

    public abstract boolean zzb(zzen zzenVar, long j);

    public final boolean zzf(zzen zzenVar, long j) {
        return zza(zzenVar) && zzb(zzenVar, j);
    }
}
