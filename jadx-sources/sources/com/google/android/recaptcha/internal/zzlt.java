package com.google.android.recaptcha.internal;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzlt extends zzlu {
    public zzlt(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.recaptcha.internal.zzlu
    public final double zza(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.recaptcha.internal.zzlu
    public final float zzb(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.recaptcha.internal.zzlu
    public final void zzc(Object obj, long j, boolean z2) {
        if (zzlv.zzb) {
            zzlv.zzD(obj, j, z2 ? (byte) 1 : (byte) 0);
        } else {
            zzlv.zzE(obj, j, z2 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzlu
    public final void zzd(Object obj, long j, byte b10) {
        if (zzlv.zzb) {
            zzlv.zzD(obj, j, b10);
        } else {
            zzlv.zzE(obj, j, b10);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzlu
    public final void zze(Object obj, long j, double d10) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.recaptcha.internal.zzlu
    public final void zzf(Object obj, long j, float f10) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.recaptcha.internal.zzlu
    public final boolean zzg(Object obj, long j) {
        return zzlv.zzb ? zzlv.zzt(obj, j) : zzlv.zzu(obj, j);
    }
}
