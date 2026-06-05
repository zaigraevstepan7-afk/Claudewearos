package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaon {
    public static int zza(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    public static long zzb(zzen zzenVar, int i10, int i11) {
        zzenVar.zzL(i10);
        if (zzenVar.zza() < 5) {
            return -9223372036854775807L;
        }
        int iZzg = zzenVar.zzg();
        if ((8388608 & iZzg) != 0 || ((iZzg >> 8) & 8191) != i11 || (iZzg & 32) == 0 || zzenVar.zzm() < 7 || zzenVar.zza() < 7 || (zzenVar.zzm() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zzenVar.zzH(bArr, 0, 6);
        long j = bArr[0];
        long j4 = bArr[1];
        long j10 = bArr[2];
        long j11 = bArr[3] & 255;
        return ((j & 255) << 25) | ((j4 & 255) << 17) | ((j10 & 255) << 9) | (j11 + j11) | ((bArr[4] & 255) >> 7);
    }
}
