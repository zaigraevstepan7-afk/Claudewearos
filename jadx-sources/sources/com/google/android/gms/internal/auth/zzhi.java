package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
abstract class zzhi {
    final Unsafe zza;

    public zzhi(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object obj, long j);

    public abstract float zzb(Object obj, long j);

    public abstract void zzc(Object obj, long j, boolean z2);

    public abstract void zzd(Object obj, long j, double d10);

    public abstract void zze(Object obj, long j, float f10);

    public abstract boolean zzf(Object obj, long j);
}
