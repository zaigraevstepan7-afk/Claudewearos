package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
abstract class zzamg<T, B> {
    public abstract int zza(T t10);

    public abstract B zza();

    public abstract T zza(T t10, T t11);

    public abstract void zza(B b10, int i10, int i11);

    public abstract void zza(B b10, int i10, long j);

    public abstract void zza(B b10, int i10, zzaho zzahoVar);

    public abstract void zza(B b10, int i10, T t10);

    public abstract void zza(T t10, zzanc zzancVar);

    public abstract boolean zza(zzale zzaleVar);

    public final boolean zza(B b10, zzale zzaleVar) throws zzajk {
        int iZzd = zzaleVar.zzd();
        int i10 = iZzd >>> 3;
        int i11 = iZzd & 7;
        if (i11 == 0) {
            zzb(b10, i10, zzaleVar.zzl());
            return true;
        }
        if (i11 == 1) {
            zza((zzamg<T, B>) b10, i10, zzaleVar.zzk());
            return true;
        }
        if (i11 == 2) {
            zza((zzamg<T, B>) b10, i10, zzaleVar.zzp());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw zzajk.zza();
            }
            zza((zzamg<T, B>) b10, i10, zzaleVar.zzf());
            return true;
        }
        B bZza = zza();
        int i12 = 4 | (i10 << 3);
        while (zzaleVar.zzc() != Integer.MAX_VALUE && zza((zzamg<T, B>) bZza, zzaleVar)) {
        }
        if (i12 != zzaleVar.zzd()) {
            throw zzajk.zzb();
        }
        zza((zzamg<T, B>) b10, i10, (int) zze(bZza));
        return true;
    }

    public abstract int zzb(T t10);

    public abstract void zzb(B b10, int i10, long j);

    public abstract void zzb(T t10, zzanc zzancVar);

    public abstract void zzb(Object obj, B b10);

    public abstract B zzc(Object obj);

    public abstract void zzc(Object obj, T t10);

    public abstract T zzd(Object obj);

    public abstract T zze(B b10);

    public abstract void zzf(Object obj);
}
