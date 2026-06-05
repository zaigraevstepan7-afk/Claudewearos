package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfve {
    public static int zza(int i10, int i11, String str) {
        String strZzb;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            strZzb = zzfvv.zzb("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else {
            if (i11 < 0) {
                throw new IllegalArgumentException(m6.a.d(i11, "negative size: "));
            }
            strZzb = zzfvv.zzb("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(strZzb);
    }

    public static int zzb(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(zzn(i10, i11, "index"));
        }
        return i10;
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object zzd(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(zzfvv.zzb(str, obj2));
    }

    public static void zze(boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzf(boolean z2, Object obj) {
        if (!z2) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzg(boolean z2, String str, char c6) {
        if (!z2) {
            throw new IllegalArgumentException(zzfvv.zzb(str, Character.valueOf(c6)));
        }
    }

    public static void zzh(boolean z2, String str, long j) {
        if (!z2) {
            throw new IllegalArgumentException(zzfvv.zzb(str, Long.valueOf(j)));
        }
    }

    public static void zzi(boolean z2, String str, Object obj) {
        if (!z2) {
            throw new IllegalArgumentException(zzfvv.zzb(str, obj));
        }
    }

    public static void zzj(boolean z2, String str, int i10, int i11) {
        if (!z2) {
            throw new IllegalArgumentException(zzfvv.zzb(str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    public static void zzk(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException((i10 < 0 || i10 > i12) ? zzn(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? zzn(i11, i12, "end index") : zzfvv.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    public static void zzl(boolean z2) {
        if (!z2) {
            throw new IllegalStateException();
        }
    }

    public static void zzm(boolean z2, Object obj) {
        if (!z2) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzn(int i10, int i11, String str) {
        if (i10 < 0) {
            return zzfvv.zzb("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return zzfvv.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(m6.a.d(i11, "negative size: "));
    }
}
