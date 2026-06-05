package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
abstract class zzhbr {
    final Unsafe zza;

    public zzhbr(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract byte zza(long j);

    public abstract double zzb(Object obj, long j);

    public abstract float zzc(Object obj, long j);

    public abstract void zzd(long j, byte[] bArr, long j4, long j10);

    public abstract void zze(Object obj, long j, boolean z2);

    public abstract void zzf(Object obj, long j, byte b10);

    public abstract void zzg(Object obj, long j, double d10);

    public abstract void zzh(Object obj, long j, float f10);

    public abstract boolean zzi(Object obj, long j);
}
