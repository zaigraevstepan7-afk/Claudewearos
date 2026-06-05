package com.google.crypto.tink.shaded.protobuf;

import java.util.logging.Logger;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class l extends cg.b {

    /* renamed from: h, reason: collision with root package name */
    public static final Logger f4189h = Logger.getLogger(l.class.getName());

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f4190i = n1.f4205e;

    /* renamed from: d, reason: collision with root package name */
    public l0 f4191d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f4192e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4193f;

    /* renamed from: g, reason: collision with root package name */
    public int f4194g;

    public l(byte[] bArr, int i10) {
        if (((bArr.length - i10) | i10) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i10)));
        }
        this.f4192e = bArr;
        this.f4194g = 0;
        this.f4193f = i10;
    }

    public static int a0(int i10, i iVar) {
        return b0(iVar) + h0(i10);
    }

    public static int b0(i iVar) {
        int size = iVar.size();
        return i0(size) + size;
    }

    public static int c0(int i10) {
        return h0(i10) + 4;
    }

    public static int d0(int i10) {
        return h0(i10) + 8;
    }

    public static int e0(int i10, a aVar, b1 b1Var) {
        return aVar.b(b1Var) + (h0(i10) * 2);
    }

    public static int f0(int i10) {
        if (i10 >= 0) {
            return i0(i10);
        }
        return 10;
    }

    public static int g0(String str) {
        int length;
        try {
            length = q1.b(str);
        } catch (p1 unused) {
            length = str.getBytes(a0.f4133a).length;
        }
        return i0(length) + length;
    }

    public static int h0(int i10) {
        return i0(i10 << 3);
    }

    public static int i0(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int j0(long j) {
        int i10;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j) != 0) {
            i10 += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public final void k0(byte b10) throws androidx.datastore.preferences.protobuf.l {
        try {
            byte[] bArr = this.f4192e;
            int i10 = this.f4194g;
            this.f4194g = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new androidx.datastore.preferences.protobuf.l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4194g), Integer.valueOf(this.f4193f), 1), e10);
        }
    }

    public final void l0(byte[] bArr, int i10, int i11) throws androidx.datastore.preferences.protobuf.l {
        try {
            System.arraycopy(bArr, i10, this.f4192e, this.f4194g, i11);
            this.f4194g += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new androidx.datastore.preferences.protobuf.l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4194g), Integer.valueOf(this.f4193f), Integer.valueOf(i11)), e10);
        }
    }

    public final void m0(int i10, int i11) throws androidx.datastore.preferences.protobuf.l {
        r0(i10, 5);
        n0(i11);
    }

    public final void n0(int i10) throws androidx.datastore.preferences.protobuf.l {
        try {
            byte[] bArr = this.f4192e;
            int i11 = this.f4194g;
            int i12 = i11 + 1;
            this.f4194g = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f4194g = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f4194g = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f4194g = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new androidx.datastore.preferences.protobuf.l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4194g), Integer.valueOf(this.f4193f), 1), e10);
        }
    }

    public final void o0(int i10, long j) throws androidx.datastore.preferences.protobuf.l {
        r0(i10, 1);
        p0(j);
    }

    public final void p0(long j) throws androidx.datastore.preferences.protobuf.l {
        try {
            byte[] bArr = this.f4192e;
            int i10 = this.f4194g;
            int i11 = i10 + 1;
            this.f4194g = i11;
            bArr[i10] = (byte) (((int) j) & 255);
            int i12 = i10 + 2;
            this.f4194g = i12;
            bArr[i11] = (byte) (((int) (j >> 8)) & 255);
            int i13 = i10 + 3;
            this.f4194g = i13;
            bArr[i12] = (byte) (((int) (j >> 16)) & 255);
            int i14 = i10 + 4;
            this.f4194g = i14;
            bArr[i13] = (byte) (((int) (j >> 24)) & 255);
            int i15 = i10 + 5;
            this.f4194g = i15;
            bArr[i14] = (byte) (((int) (j >> 32)) & 255);
            int i16 = i10 + 6;
            this.f4194g = i16;
            bArr[i15] = (byte) (((int) (j >> 40)) & 255);
            int i17 = i10 + 7;
            this.f4194g = i17;
            bArr[i16] = (byte) (((int) (j >> 48)) & 255);
            this.f4194g = i10 + 8;
            bArr[i17] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new androidx.datastore.preferences.protobuf.l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4194g), Integer.valueOf(this.f4193f), 1), e10);
        }
    }

    public final void q0(int i10) throws androidx.datastore.preferences.protobuf.l {
        if (i10 >= 0) {
            s0(i10);
        } else {
            u0(i10);
        }
    }

    public final void r0(int i10, int i11) throws androidx.datastore.preferences.protobuf.l {
        s0((i10 << 3) | i11);
    }

    public final void s0(int i10) throws androidx.datastore.preferences.protobuf.l {
        while (true) {
            int i11 = i10 & (-128);
            byte[] bArr = this.f4192e;
            if (i11 == 0) {
                int i12 = this.f4194g;
                this.f4194g = i12 + 1;
                bArr[i12] = (byte) i10;
                return;
            } else {
                try {
                    int i13 = this.f4194g;
                    this.f4194g = i13 + 1;
                    bArr[i13] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new androidx.datastore.preferences.protobuf.l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4194g), Integer.valueOf(this.f4193f), 1), e10);
                }
            }
            throw new androidx.datastore.preferences.protobuf.l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4194g), Integer.valueOf(this.f4193f), 1), e10);
        }
    }

    public final void t0(int i10, long j) throws androidx.datastore.preferences.protobuf.l {
        r0(i10, 0);
        u0(j);
    }

    public final void u0(long j) throws androidx.datastore.preferences.protobuf.l {
        boolean z2 = f4190i;
        int i10 = this.f4193f;
        byte[] bArr = this.f4192e;
        if (z2 && i10 - this.f4194g >= 10) {
            while ((j & (-128)) != 0) {
                int i11 = this.f4194g;
                this.f4194g = i11 + 1;
                n1.k(bArr, i11, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            int i12 = this.f4194g;
            this.f4194g = i12 + 1;
            n1.k(bArr, i12, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                int i13 = this.f4194g;
                this.f4194g = i13 + 1;
                bArr[i13] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new androidx.datastore.preferences.protobuf.l(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4194g), Integer.valueOf(i10), 1), e10);
            }
        }
        int i14 = this.f4194g;
        this.f4194g = i14 + 1;
        bArr[i14] = (byte) j;
    }
}
