package com.google.android.gms.internal.ads;

import java.util.Arrays;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgws {
    private final byte[] zza;

    private zzgws(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i11);
    }

    public static zzgws zzb(byte[] bArr) {
        if (bArr != null) {
            return zzc(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static zzgws zzc(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        if (i11 > length) {
            i11 = length;
        }
        return new zzgws(bArr, 0, i11);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgws) {
            return Arrays.equals(((zzgws) obj).zza, this.zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b10 : bArr) {
            sb2.append("0123456789abcdef".charAt((b10 & 255) >> 4));
            sb2.append("0123456789abcdef".charAt(b10 & 15));
        }
        return m1.j("Bytes(", sb2.toString(), ")");
    }

    public final int zza() {
        return this.zza.length;
    }

    public final byte[] zzd() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
