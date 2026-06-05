package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbag {
    public static int zza(String str) throws UnsupportedEncodingException {
        byte[] bytes;
        int i10;
        try {
            bytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        int length = bytes.length;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = length & (-4);
            if (i11 >= i10) {
                break;
            }
            int i13 = ((bytes[i11] & 255) | ((bytes[i11 + 1] & 255) << 8) | ((bytes[i11 + 2] & 255) << 16) | (bytes[i11 + 3] << 24)) * (-862048943);
            int i14 = i12 ^ (((i13 >>> 17) | (i13 << 15)) * 461845907);
            i12 = (((i14 >>> 19) | (i14 << 13)) * 5) - 430675100;
            i11 += 4;
        }
        int i15 = length & 3;
        if (i15 == 1) {
            int i16 = ((bytes[i10] & 255) | i) * (-862048943);
            i12 ^= ((i16 >>> 17) | (i16 << 15)) * 461845907;
        } else {
            if (i15 != 2) {
                i = i15 == 3 ? (bytes[i10 + 2] & 255) << 16 : 0;
            }
            i |= (bytes[i10 + 1] & 255) << 8;
            int i162 = ((bytes[i10] & 255) | i) * (-862048943);
            i12 ^= ((i162 >>> 17) | (i162 << 15)) * 461845907;
        }
        int i17 = i12 ^ length;
        int i18 = (i17 ^ (i17 >>> 16)) * (-2048144789);
        int i19 = (i18 ^ (i18 >>> 13)) * (-1028477387);
        return i19 ^ (i19 >>> 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] zzb(java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbag.zzb(java.lang.String, boolean):java.lang.String[]");
    }
}
