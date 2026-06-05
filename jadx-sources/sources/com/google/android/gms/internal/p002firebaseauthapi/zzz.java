package com.google.android.gms.internal.p002firebaseauthapi;

import m6.a;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzz {
    public static int zza(int i10, int i11) {
        String strZza;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            strZza = zzah.zza("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else {
            if (i11 < 0) {
                throw new IllegalArgumentException(a.d(i11, "negative size: "));
            }
            strZza = zzah.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(zzb(i10, i11, "index"));
        }
        return i10;
    }

    private static String zzb(int i10, int i11, String str) {
        if (i10 < 0) {
            return zzah.zza("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return zzah.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(a.d(i11, "negative size: "));
    }

    public static int zza(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(zzb(i10, i11, str));
        }
        return i10;
    }

    public static <T> T zza(T t10) {
        t10.getClass();
        return t10;
    }

    public static void zza(int i10, int i11, int i12) {
        String strZzb;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strZzb = zzb(i10, i12, "start index");
            } else if (i11 >= 0 && i11 <= i12) {
                strZzb = zzah.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            } else {
                strZzb = zzb(i11, i12, "end index");
            }
            throw new IndexOutOfBoundsException(strZzb);
        }
    }
}
