package kk;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class x implements h {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f9738a;

    /* renamed from: b, reason: collision with root package name */
    public final f f9739b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9740c;

    public x(c0 c0Var) {
        fj.l.f(c0Var, "source");
        this.f9738a = c0Var;
        this.f9739b = new f();
    }

    @Override // kk.c0
    public final long A(long j, f fVar) {
        fj.l.f(fVar, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(m1.g(j, "byteCount < 0: ").toString());
        }
        if (this.f9740c) {
            throw new IllegalStateException("closed");
        }
        f fVar2 = this.f9739b;
        if (fVar2.f9695b == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.f9738a.A(8192L, fVar2) == -1) {
                return -1L;
            }
        }
        return fVar2.A(Math.min(j, fVar2.f9695b), fVar);
    }

    @Override // kk.h
    public final String I(Charset charset) {
        fj.l.f(charset, "charset");
        c0 c0Var = this.f9738a;
        f fVar = this.f9739b;
        fVar.V(c0Var);
        return fVar.I(charset);
    }

    @Override // kk.h
    public final boolean N(long j) {
        f fVar;
        if (j < 0) {
            throw new IllegalArgumentException(m1.g(j, "byteCount < 0: ").toString());
        }
        if (this.f9740c) {
            throw new IllegalStateException("closed");
        }
        do {
            fVar = this.f9739b;
            if (fVar.f9695b >= j) {
                return true;
            }
        } while (this.f9738a.A(8192L, fVar) != -1);
        return false;
    }

    @Override // kk.h
    public final String S() {
        return u(Long.MAX_VALUE);
    }

    @Override // kk.h
    public final int U(s sVar) throws EOFException {
        fj.l.f(sVar, "options");
        if (this.f9740c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            f fVar = this.f9739b;
            int iC = lk.a.c(fVar, sVar, true);
            if (iC != -2) {
                if (iC != -1) {
                    fVar.skip(sVar.f9724a[iC].e());
                    return iC;
                }
            } else if (this.f9738a.A(8192L, fVar) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // kk.c0
    public final e0 a() {
        return this.f9738a.a();
    }

    public final boolean b() {
        if (this.f9740c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f9739b;
        return fVar.e() && this.f9738a.A(8192L, fVar) == -1;
    }

    @Override // kk.h
    public final void b0(long j) throws EOFException {
        if (!N(j)) {
            throw new EOFException();
        }
    }

    @Override // kk.h
    public final long c0() throws EOFException {
        f fVar;
        byte bG;
        b0(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            boolean zN = N(i11);
            fVar = this.f9739b;
            if (!zN) {
                break;
            }
            bG = fVar.g(i10);
            if ((bG < 48 || bG > 57) && ((bG < 97 || bG > 102) && (bG < 65 || bG > 70))) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            x8.a.n(16);
            String string = Integer.toString(bG, 16);
            fj.l.e(string, "toString(...)");
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
        }
        return fVar.c0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f9740c) {
            return;
        }
        this.f9740c = true;
        this.f9738a.close();
        f fVar = this.f9739b;
        fVar.skip(fVar.f9695b);
    }

    public final long e(byte b10, long j, long j4) {
        if (this.f9740c) {
            throw new IllegalStateException("closed");
        }
        if (0 > j4) {
            throw new IllegalArgumentException(m1.g(j4, "fromIndex=0 toIndex=").toString());
        }
        long jMax = 0;
        while (jMax < j4) {
            f fVar = this.f9739b;
            byte b11 = b10;
            long j10 = j4;
            long jL = fVar.l(b11, jMax, j10);
            if (jL != -1) {
                return jL;
            }
            long j11 = fVar.f9695b;
            if (j11 >= j10 || this.f9738a.A(8192L, fVar) == -1) {
                break;
            }
            jMax = Math.max(jMax, j11);
            b10 = b11;
            j4 = j10;
        }
        return -1L;
    }

    public final void g(byte[] bArr) throws EOFException {
        f fVar = this.f9739b;
        try {
            b0(bArr.length);
            fVar.C(bArr);
        } catch (EOFException e10) {
            int i10 = 0;
            while (true) {
                long j = fVar.f9695b;
                if (j <= 0) {
                    throw e10;
                }
                int i11 = fVar.read(bArr, i10, (int) j);
                if (i11 == -1) {
                    throw new AssertionError();
                }
                i10 += i11;
            }
        }
    }

    @Override // kk.h
    public final i h(long j) throws EOFException {
        b0(j);
        return this.f9739b.h(j);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f9740c;
    }

    public final int l() throws EOFException {
        b0(4L);
        int i10 = this.f9739b.readInt();
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    public final long n() throws EOFException {
        char c6;
        char c10;
        char c11;
        char c12;
        long j;
        b0(8L);
        f fVar = this.f9739b;
        if (fVar.f9695b < 8) {
            throw new EOFException();
        }
        y yVar = fVar.f9694a;
        fj.l.c(yVar);
        int i10 = yVar.f9742b;
        int i11 = yVar.f9743c;
        if (i11 - i10 < 8) {
            j = ((fVar.readInt() & 4294967295L) << 32) | (4294967295L & fVar.readInt());
            c11 = '8';
            c12 = '\b';
            c6 = 24;
            c10 = '(';
        } else {
            byte[] bArr = yVar.f9741a;
            c6 = 24;
            c10 = '(';
            c11 = '8';
            c12 = '\b';
            int i12 = i10 + 7;
            long j4 = ((bArr[i10] & 255) << 56) | ((bArr[i10 + 1] & 255) << 48) | ((bArr[i10 + 2] & 255) << 40) | ((bArr[i10 + 3] & 255) << 32) | ((bArr[i10 + 4] & 255) << 24) | ((bArr[i10 + 5] & 255) << 16) | ((bArr[i10 + 6] & 255) << 8);
            int i13 = i10 + 8;
            long j10 = j4 | (bArr[i12] & 255);
            fVar.f9695b -= 8;
            if (i13 == i11) {
                fVar.f9694a = yVar.a();
                z.a(yVar);
            } else {
                yVar.f9742b = i13;
            }
            j = j10;
        }
        return ((j & 255) << c11) | (((-72057594037927936L) & j) >>> c11) | ((71776119061217280L & j) >>> c10) | ((280375465082880L & j) >>> c6) | ((1095216660480L & j) >>> c12) | ((4278190080L & j) << c12) | ((16711680 & j) << c6) | ((65280 & j) << c10);
    }

    @Override // kk.h
    public final f q() {
        return this.f9739b;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        fj.l.f(byteBuffer, "sink");
        f fVar = this.f9739b;
        if (fVar.f9695b == 0 && this.f9738a.A(8192L, fVar) == -1) {
            return -1;
        }
        return fVar.read(byteBuffer);
    }

    @Override // kk.h
    public final byte readByte() throws EOFException {
        b0(1L);
        return this.f9739b.readByte();
    }

    @Override // kk.h
    public final int readInt() throws EOFException {
        b0(4L);
        return this.f9739b.readInt();
    }

    @Override // kk.h
    public final short readShort() throws EOFException {
        b0(2L);
        return this.f9739b.readShort();
    }

    public final short s() throws EOFException {
        b0(2L);
        return this.f9739b.D();
    }

    @Override // kk.h
    public final void skip(long j) throws EOFException {
        if (this.f9740c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            f fVar = this.f9739b;
            if (fVar.f9695b == 0 && this.f9738a.A(8192L, fVar) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, fVar.f9695b);
            fVar.skip(jMin);
            j -= jMin;
        }
    }

    public final String t(long j) throws EOFException {
        b0(j);
        f fVar = this.f9739b;
        fVar.getClass();
        return fVar.F(j, nj.a.f12342a);
    }

    public final String toString() {
        return "buffer(" + this.f9738a + ')';
    }

    @Override // kk.h
    public final String u(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(m1.g(j, "limit < 0: ").toString());
        }
        long j4 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jE = e((byte) 10, 0L, j4);
        f fVar = this.f9739b;
        if (jE != -1) {
            return lk.a.b(jE, fVar);
        }
        if (j4 < Long.MAX_VALUE && N(j4) && fVar.g(j4 - 1) == 13 && N(j4 + 1) && fVar.g(j4) == 10) {
            return lk.a.b(j4, fVar);
        }
        f fVar2 = new f();
        fVar.b(fVar2, 0L, Math.min(32, fVar.f9695b));
        throw new EOFException("\\n not found: limit=" + Math.min(fVar.f9695b, j) + " content=" + fVar2.h(fVar2.f9695b).f() + '\u2026');
    }
}
