package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m extends wd.a {

    /* renamed from: i, reason: collision with root package name */
    public static final Logger f968i = Logger.getLogger(m.class.getName());
    public static final boolean j = k1.f962e;

    /* renamed from: d, reason: collision with root package name */
    public g0 f969d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f970e;

    /* renamed from: f, reason: collision with root package name */
    public final int f971f;

    /* renamed from: g, reason: collision with root package name */
    public int f972g;

    /* renamed from: h, reason: collision with root package name */
    public final m5.r0 f973h;

    public m(m5.r0 r0Var, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i10, 20);
        this.f970e = new byte[iMax];
        this.f971f = iMax;
        this.f973h = r0Var;
    }

    public static int a0(int i10, g gVar) {
        int iC0 = c0(i10);
        int size = gVar.size();
        return d0(size) + size + iC0;
    }

    public static int b0(String str) {
        int length;
        try {
            length = n1.a(str);
        } catch (m1 unused) {
            length = str.getBytes(y.f1035a).length;
        }
        return d0(length) + length;
    }

    public static int c0(int i10) {
        return d0(i10 << 3);
    }

    public static int d0(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int e0(long j4) {
        return (640 - (Long.numberOfLeadingZeros(j4) * 9)) >>> 6;
    }

    @Override // wd.a
    public final void S(int i10, byte[] bArr, int i11) throws IOException {
        i0(bArr, i10, i11);
    }

    public final void V(int i10) {
        int i11 = this.f972g;
        int i12 = i11 + 1;
        this.f972g = i12;
        byte[] bArr = this.f970e;
        bArr[i11] = (byte) (i10 & 255);
        int i13 = i11 + 2;
        this.f972g = i13;
        bArr[i12] = (byte) ((i10 >> 8) & 255);
        int i14 = i11 + 3;
        this.f972g = i14;
        bArr[i13] = (byte) ((i10 >> 16) & 255);
        this.f972g = i11 + 4;
        bArr[i14] = (byte) ((i10 >> 24) & 255);
    }

    public final void W(long j4) {
        int i10 = this.f972g;
        int i11 = i10 + 1;
        this.f972g = i11;
        byte[] bArr = this.f970e;
        bArr[i10] = (byte) (j4 & 255);
        int i12 = i10 + 2;
        this.f972g = i12;
        bArr[i11] = (byte) ((j4 >> 8) & 255);
        int i13 = i10 + 3;
        this.f972g = i13;
        bArr[i12] = (byte) ((j4 >> 16) & 255);
        int i14 = i10 + 4;
        this.f972g = i14;
        bArr[i13] = (byte) (255 & (j4 >> 24));
        int i15 = i10 + 5;
        this.f972g = i15;
        bArr[i14] = (byte) (((int) (j4 >> 32)) & 255);
        int i16 = i10 + 6;
        this.f972g = i16;
        bArr[i15] = (byte) (((int) (j4 >> 40)) & 255);
        int i17 = i10 + 7;
        this.f972g = i17;
        bArr[i16] = (byte) (((int) (j4 >> 48)) & 255);
        this.f972g = i10 + 8;
        bArr[i17] = (byte) (((int) (j4 >> 56)) & 255);
    }

    public final void X(int i10, int i11) {
        Y((i10 << 3) | i11);
    }

    public final void Y(int i10) {
        boolean z2 = j;
        byte[] bArr = this.f970e;
        if (z2) {
            while ((i10 & (-128)) != 0) {
                int i11 = this.f972g;
                this.f972g = i11 + 1;
                k1.j(bArr, i11, (byte) ((i10 | 128) & 255));
                i10 >>>= 7;
            }
            int i12 = this.f972g;
            this.f972g = i12 + 1;
            k1.j(bArr, i12, (byte) i10);
            return;
        }
        while ((i10 & (-128)) != 0) {
            int i13 = this.f972g;
            this.f972g = i13 + 1;
            bArr[i13] = (byte) ((i10 | 128) & 255);
            i10 >>>= 7;
        }
        int i14 = this.f972g;
        this.f972g = i14 + 1;
        bArr[i14] = (byte) i10;
    }

    public final void Z(long j4) {
        boolean z2 = j;
        byte[] bArr = this.f970e;
        if (z2) {
            while ((j4 & (-128)) != 0) {
                int i10 = this.f972g;
                this.f972g = i10 + 1;
                k1.j(bArr, i10, (byte) ((((int) j4) | 128) & 255));
                j4 >>>= 7;
            }
            int i11 = this.f972g;
            this.f972g = i11 + 1;
            k1.j(bArr, i11, (byte) j4);
            return;
        }
        while ((j4 & (-128)) != 0) {
            int i12 = this.f972g;
            this.f972g = i12 + 1;
            bArr[i12] = (byte) ((((int) j4) | 128) & 255);
            j4 >>>= 7;
        }
        int i13 = this.f972g;
        this.f972g = i13 + 1;
        bArr[i13] = (byte) j4;
    }

    public final void f0() throws IOException {
        this.f973h.write(this.f970e, 0, this.f972g);
        this.f972g = 0;
    }

    public final void g0(int i10) throws IOException {
        if (this.f971f - this.f972g < i10) {
            f0();
        }
    }

    public final void h0(byte b10) throws IOException {
        if (this.f972g == this.f971f) {
            f0();
        }
        int i10 = this.f972g;
        this.f972g = i10 + 1;
        this.f970e[i10] = b10;
    }

    public final void i0(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f972g;
        int i13 = this.f971f;
        int i14 = i13 - i12;
        byte[] bArr2 = this.f970e;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f972g += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.f972g = i13;
        f0();
        if (i16 > i13) {
            this.f973h.write(bArr, i15, i16);
        } else {
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.f972g = i16;
        }
    }

    public final void j0(int i10, boolean z2) throws IOException {
        g0(11);
        X(i10, 0);
        byte b10 = z2 ? (byte) 1 : (byte) 0;
        int i11 = this.f972g;
        this.f972g = i11 + 1;
        this.f970e[i11] = b10;
    }

    public final void k0(int i10, g gVar) {
        v0(i10, 2);
        l0(gVar);
    }

    public final void l0(g gVar) throws IOException {
        x0(gVar.size());
        S(gVar.x(), gVar.f930b, gVar.size());
    }

    public final void m0(int i10, int i11) {
        g0(14);
        X(i10, 5);
        V(i11);
    }

    public final void n0(int i10) throws IOException {
        g0(4);
        V(i10);
    }

    public final void o0(int i10, long j4) {
        g0(18);
        X(i10, 1);
        W(j4);
    }

    public final void p0(long j4) throws IOException {
        g0(8);
        W(j4);
    }

    public final void q0(int i10, int i11) throws IOException {
        g0(20);
        X(i10, 0);
        if (i11 >= 0) {
            Y(i11);
        } else {
            Z(i11);
        }
    }

    public final void r0(int i10) throws IOException {
        if (i10 >= 0) {
            x0(i10);
        } else {
            z0(i10);
        }
    }

    public final void s0(int i10, a aVar, x0 x0Var) throws IOException {
        v0(i10, 2);
        x0(aVar.a(x0Var));
        x0Var.e(aVar, this.f969d);
    }

    public final void t0(int i10, String str) throws IOException {
        v0(i10, 2);
        u0(str);
    }

    public final void u0(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iD0 = d0(length);
            int i10 = iD0 + length;
            int i11 = this.f971f;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int iZ = n1.f976a.z(str, bArr, 0, length);
                x0(iZ);
                i0(bArr, 0, iZ);
                return;
            }
            if (i10 > i11 - this.f972g) {
                f0();
            }
            int iD02 = d0(str.length());
            int i12 = this.f972g;
            byte[] bArr2 = this.f970e;
            try {
                try {
                    if (iD02 == iD0) {
                        int i13 = i12 + iD02;
                        this.f972g = i13;
                        int iZ2 = n1.f976a.z(str, bArr2, i13, i11 - i13);
                        this.f972g = i12;
                        Y((iZ2 - i12) - iD02);
                        this.f972g = iZ2;
                    } else {
                        int iA = n1.a(str);
                        Y(iA);
                        this.f972g = n1.f976a.z(str, bArr2, this.f972g, iA);
                    }
                } catch (ArrayIndexOutOfBoundsException e10) {
                    throw new l(e10);
                }
            } catch (m1 e11) {
                this.f972g = i12;
                throw e11;
            }
        } catch (m1 e12) {
            f968i.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e12);
            byte[] bytes = str.getBytes(y.f1035a);
            try {
                x0(bytes.length);
                S(0, bytes, bytes.length);
            } catch (IndexOutOfBoundsException e13) {
                throw new l(e13);
            }
        }
    }

    public final void v0(int i10, int i11) {
        x0((i10 << 3) | i11);
    }

    public final void w0(int i10, int i11) throws IOException {
        g0(20);
        X(i10, 0);
        Y(i11);
    }

    public final void x0(int i10) throws IOException {
        g0(5);
        Y(i10);
    }

    public final void y0(int i10, long j4) {
        g0(20);
        X(i10, 0);
        Z(j4);
    }

    public final void z0(long j4) throws IOException {
        g0(10);
        Z(j4);
    }
}
