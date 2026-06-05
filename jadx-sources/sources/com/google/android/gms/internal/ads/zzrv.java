package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzrv {
    private static final byte[] zza = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    private static final byte[] zzb = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    private ByteBuffer zzc = zzcn.zza;
    private int zze = 0;
    private int zzd = 2;

    private static final void zzc(ByteBuffer byteBuffer, long j, int i10, int i11, boolean z2) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z2 ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i10);
        byteBuffer.putInt(0);
        byteBuffer.put(zzgbl.zza(i11));
    }

    public final void zza(zzhs zzhsVar, List list) {
        int length;
        ByteBuffer byteBuffer;
        int i10;
        ByteBuffer byteBuffer2 = zzhsVar.zzc;
        byteBuffer2.getClass();
        if (byteBuffer2.limit() - zzhsVar.zzc.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.zzd == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer3 = zzhsVar.zzc;
        int iPosition = byteBuffer3.position();
        int iLimit = byteBuffer3.limit();
        int i11 = iLimit - iPosition;
        int i12 = (i11 + 255) / 255;
        int i13 = i12 + 27 + i11;
        if (this.zzd == 2) {
            length = bArr != null ? bArr.length + 28 : 47;
            i13 += length + 44;
        } else {
            length = 0;
        }
        if (this.zzc.capacity() < i13) {
            this.zzc = ByteBuffer.allocate(i13).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.zzc.clear();
        }
        ByteBuffer byteBuffer4 = this.zzc;
        if (this.zzd == 2) {
            if (bArr != null) {
                byteBuffer = byteBuffer4;
                i10 = 22;
                zzc(byteBuffer, 0L, 0, 1, true);
                int length2 = bArr.length;
                byteBuffer.put(zzgbl.zza(length2));
                byteBuffer.put(bArr);
                int i14 = length2 + 28;
                byteBuffer.putInt(22, zzex.zzf(byteBuffer.array(), byteBuffer.arrayOffset(), i14, 0));
                byteBuffer.position(i14);
            } else {
                byteBuffer = byteBuffer4;
                i10 = 22;
                byteBuffer.put(zza);
            }
            byteBuffer.put(zzb);
        } else {
            byteBuffer = byteBuffer4;
            i10 = 22;
        }
        int iZzc = this.zze + zzaeo.zzc(byteBuffer3);
        this.zze = iZzc;
        int i15 = i10;
        ByteBuffer byteBuffer5 = byteBuffer;
        zzc(byteBuffer5, iZzc, this.zzd, i12, false);
        for (int i16 = 0; i16 < i12; i16++) {
            if (i11 >= 255) {
                byteBuffer5.put((byte) -1);
                i11 -= 255;
            } else {
                byteBuffer5.put((byte) i11);
                i11 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBuffer5.put(byteBuffer3.get(iPosition));
            iPosition++;
        }
        byteBuffer3.position(byteBuffer3.limit());
        byteBuffer5.flip();
        if (this.zzd == 2) {
            byteBuffer5.putInt(length + 66, zzex.zzf(byteBuffer5.array(), byteBuffer5.arrayOffset() + length + 44, byteBuffer5.limit() - byteBuffer5.position(), 0));
        } else {
            byteBuffer5.putInt(i15, zzex.zzf(byteBuffer5.array(), byteBuffer5.arrayOffset(), byteBuffer5.limit() - byteBuffer5.position(), 0));
        }
        this.zzd++;
        this.zzc = byteBuffer5;
        zzhsVar.zzb();
        zzhsVar.zzj(this.zzc.remaining());
        zzhsVar.zzc.put(this.zzc);
        zzhsVar.zzk();
    }

    public final void zzb() {
        this.zzc = zzcn.zza;
        this.zze = 0;
        this.zzd = 2;
    }
}
