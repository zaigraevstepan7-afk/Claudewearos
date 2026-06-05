package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
abstract class zzgkv {
    int[] zza;
    private final int zzb;

    public zzgkv(byte[] bArr, int i10) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzgkt.zze(bArr);
        this.zzb = i10;
    }

    public abstract int zza();

    public abstract int[] zzb(int[] iArr, int i10);

    public final ByteBuffer zzc(byte[] bArr, int i10) {
        int[] iArrZzb = zzb(zzgkt.zze(bArr), i10);
        int[] iArr = (int[]) iArrZzb.clone();
        zzgkt.zzc(iArr);
        for (int i11 = 0; i11 < 16; i11++) {
            iArrZzb[i11] = iArrZzb[i11] + iArr[i11];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrZzb, 0, 16);
        return byteBufferOrder;
    }

    public final byte[] zzd(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length != zza()) {
            throw new GeneralSecurityException(m6.a.d(zza(), "The nonce length (in bytes) must be "));
        }
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining / 64;
        for (int i11 = 0; i11 < i10 + 1; i11++) {
            ByteBuffer byteBufferZzc = zzc(bArr, this.zzb + i11);
            if (i11 == i10) {
                zzgvs.zza(byteBufferAllocate, byteBuffer, byteBufferZzc, iRemaining % 64);
            } else {
                zzgvs.zza(byteBufferAllocate, byteBuffer, byteBufferZzc, 64);
            }
        }
        return byteBufferAllocate.array();
    }
}
