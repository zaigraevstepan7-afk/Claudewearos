package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
abstract class zzmu {
    final Unsafe zza;

    public zzmu(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract double zza(Object obj, long j);

    public abstract float zzb(Object obj, long j);

    public abstract void zzc(Object obj, long j, boolean z2);

    public abstract void zzd(Object obj, long j, byte b10);

    public abstract void zze(Object obj, long j, double d10);

    public abstract void zzf(Object obj, long j, float f10);

    public abstract boolean zzg(Object obj, long j);

    public final int zzh(Class cls) {
        return this.zza.arrayBaseOffset(cls);
    }

    public final int zzi(Class cls) {
        return this.zza.arrayIndexScale(cls);
    }

    public final int zzj(Object obj, long j) {
        return this.zza.getInt(obj, j);
    }

    public final long zzk(Object obj, long j) {
        return this.zza.getLong(obj, j);
    }

    public final long zzl(Field field) {
        return this.zza.objectFieldOffset(field);
    }

    public final Object zzm(Object obj, long j) {
        return this.zza.getObject(obj, j);
    }

    public final void zzn(Object obj, long j, int i10) {
        this.zza.putInt(obj, j, i10);
    }

    public final void zzo(Object obj, long j, long j4) {
        this.zza.putLong(obj, j, j4);
    }

    public final void zzp(Object obj, long j, Object obj2) {
        this.zza.putObject(obj, j, obj2);
    }
}
