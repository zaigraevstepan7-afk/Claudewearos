package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzhbp extends zzhbr {
    public zzhbp(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final byte zza(long j) {
        return Memory.peekByte((int) j);
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final double zzb(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final float zzc(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final void zzd(long j, byte[] bArr, long j4, long j10) {
        Memory.peekByteArray((int) j, bArr, (int) j4, (int) j10);
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final void zze(Object obj, long j, boolean z2) {
        if (zzhbs.zzb) {
            zzhbs.zzG(obj, j, z2 ? (byte) 1 : (byte) 0);
        } else {
            zzhbs.zzH(obj, j, z2 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final void zzf(Object obj, long j, byte b10) {
        if (zzhbs.zzb) {
            zzhbs.zzG(obj, j, b10);
        } else {
            zzhbs.zzH(obj, j, b10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final void zzg(Object obj, long j, double d10) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final void zzh(Object obj, long j, float f10) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final boolean zzi(Object obj, long j) {
        return zzhbs.zzb ? zzhbs.zzw(obj, j) : zzhbs.zzx(obj, j);
    }
}
