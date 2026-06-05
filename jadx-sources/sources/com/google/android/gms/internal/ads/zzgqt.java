package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgqt {
    public static byte[] zza(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            byte b10 = bArr[i10];
            byte b11 = (byte) ((b10 + b10) & 254);
            bArr2[i10] = b11;
            if (i10 < 15) {
                bArr2[i10] = (byte) (((bArr[i11] >> 7) & 1) | b11);
            }
            i10 = i11;
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }
}
