package com.google.android.gms.internal.ads;

import android.util.Base64;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzauj {
    public static String zza(byte[] bArr, boolean z2) {
        return Base64.encodeToString(bArr, true != z2 ? 2 : 11);
    }

    public static byte[] zzb(String str, boolean z2) {
        byte[] bArrDecode = Base64.decode(str, 2);
        if (bArrDecode.length != 0 || str.length() <= 0) {
            return bArrDecode;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }
}
