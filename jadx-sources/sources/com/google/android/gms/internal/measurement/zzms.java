package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzms extends zzmu {
    public zzms(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(zzk(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(zzj(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final void zzc(Object obj, long j, boolean z2) {
        if (zzmv.zzb) {
            zzmv.zzD(obj, j, z2 ? (byte) 1 : (byte) 0);
        } else {
            zzmv.zzE(obj, j, z2 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final void zzd(Object obj, long j, byte b10) {
        if (zzmv.zzb) {
            zzmv.zzD(obj, j, b10);
        } else {
            zzmv.zzE(obj, j, b10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final void zze(Object obj, long j, double d10) {
        zzo(obj, j, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final void zzf(Object obj, long j, float f10) {
        zzn(obj, j, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final boolean zzg(Object obj, long j) {
        return zzmv.zzb ? zzmv.zzt(obj, j) : zzmv.zzu(obj, j);
    }
}
