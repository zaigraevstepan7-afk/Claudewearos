package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzjo extends zzjp {
    public zzjo(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.zzjp
    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.play_billing.zzjp
    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.play_billing.zzjp
    public final void zzc(Object obj, long j, boolean z2) {
        if (zzjq.zzb) {
            zzjq.zzD(obj, j, z2 ? (byte) 1 : (byte) 0);
        } else {
            zzjq.zzE(obj, j, z2 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjp
    public final void zzd(Object obj, long j, byte b10) {
        if (zzjq.zzb) {
            zzjq.zzD(obj, j, b10);
        } else {
            zzjq.zzE(obj, j, b10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzjp
    public final void zze(Object obj, long j, double d10) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzjp
    public final void zzf(Object obj, long j, float f10) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzjp
    public final boolean zzg(Object obj, long j) {
        return zzjq.zzb ? zzjq.zzt(obj, j) : zzjq.zzu(obj, j);
    }
}
