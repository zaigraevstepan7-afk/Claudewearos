package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
abstract class zzhbl {
    private static volatile int zza = 100;

    public abstract Object zza(Object obj);

    public abstract Object zzb();

    public abstract Object zzc(Object obj);

    public abstract void zzd(Object obj, int i10, int i11);

    public abstract void zze(Object obj, int i10, long j);

    public abstract void zzf(Object obj, int i10, Object obj2);

    public abstract void zzg(Object obj, int i10, zzgxn zzgxnVar);

    public abstract void zzh(Object obj, int i10, long j);

    public abstract void zzi(Object obj);

    public abstract void zzj(Object obj, Object obj2);

    public final boolean zzk(Object obj, zzhat zzhatVar, int i10) throws zzgzk {
        int iZzd = zzhatVar.zzd();
        int i11 = iZzd >>> 3;
        int i12 = iZzd & 7;
        if (i12 == 0) {
            zzh(obj, i11, zzhatVar.zzl());
            return true;
        }
        if (i12 == 1) {
            zze(obj, i11, zzhatVar.zzk());
            return true;
        }
        if (i12 == 2) {
            zzg(obj, i11, zzhatVar.zzp());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                if (i10 != 0) {
                    return false;
                }
                throw new zzgzk("Protocol message end-group tag did not match expected tag.");
            }
            if (i12 != 5) {
                throw new zzgzj("Protocol message tag had invalid wire type.");
            }
            zzd(obj, i11, zzhatVar.zzf());
            return true;
        }
        Object objZzb = zzb();
        int i13 = i11 << 3;
        int i14 = i10 + 1;
        if (i14 >= zza) {
            throw new zzgzk("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzhatVar.zzc() != Integer.MAX_VALUE && zzk(objZzb, zzhatVar, i14)) {
        }
        if ((i13 | 4) != zzhatVar.zzd()) {
            throw new zzgzk("Protocol message end-group tag did not match expected tag.");
        }
        zzf(obj, i11, zzc(objZzb));
        return true;
    }
}
