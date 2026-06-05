package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzhh extends zzhi {
    public zzhh(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final void zzc(Object obj, long j, boolean z2) {
        if (zzhj.zza) {
            zzhj.zzi(obj, j, z2);
        } else {
            zzhj.zzj(obj, j, z2);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final void zzd(Object obj, long j, double d10) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final void zze(Object obj, long j, float f10) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final boolean zzf(Object obj, long j) {
        return zzhj.zza ? zzhj.zzq(obj, j) : zzhj.zzr(obj, j);
    }
}
