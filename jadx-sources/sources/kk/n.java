package kk;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class n implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public byte f9711a;

    /* renamed from: b, reason: collision with root package name */
    public final x f9712b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f9713c;

    /* renamed from: d, reason: collision with root package name */
    public final o f9714d;

    /* renamed from: e, reason: collision with root package name */
    public final CRC32 f9715e;

    public n(c0 c0Var) {
        fj.l.f(c0Var, "source");
        x xVar = new x(c0Var);
        this.f9712b = xVar;
        Inflater inflater = new Inflater(true);
        this.f9713c = inflater;
        this.f9714d = new o(xVar, inflater);
        this.f9715e = new CRC32();
    }

    public static void b(int i10, int i11, String str) throws IOException {
        if (i11 == i10) {
            return;
        }
        throw new IOException(str + ": actual 0x" + nj.e.P0(8, hj.a.R(i11)) + " != expected 0x" + nj.e.P0(8, hj.a.R(i10)));
    }

    @Override // kk.c0
    public final long A(long j, f fVar) throws DataFormatException, IOException {
        n nVar = this;
        fj.l.f(fVar, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(m1.g(j, "byteCount < 0: ").toString());
        }
        if (j == 0) {
            return 0L;
        }
        byte b10 = nVar.f9711a;
        CRC32 crc32 = nVar.f9715e;
        x xVar = nVar.f9712b;
        if (b10 == 0) {
            xVar.b0(10L);
            f fVar2 = xVar.f9739b;
            byte bG = fVar2.g(3L);
            boolean z2 = ((bG >> 1) & 1) == 1;
            if (z2) {
                nVar.e(fVar2, 0L, 10L);
            }
            b(8075, xVar.readShort(), "ID1ID2");
            xVar.skip(8L);
            if (((bG >> 2) & 1) == 1) {
                xVar.b0(2L);
                if (z2) {
                    e(fVar2, 0L, 2L);
                }
                long jD = fVar2.D() & 65535;
                xVar.b0(jD);
                if (z2) {
                    e(fVar2, 0L, jD);
                }
                xVar.skip(jD);
            }
            if (((bG >> 3) & 1) == 1) {
                long jE = xVar.e((byte) 0, 0L, Long.MAX_VALUE);
                if (jE == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    e(fVar2, 0L, jE + 1);
                }
                xVar.skip(jE + 1);
            }
            if (((bG >> 4) & 1) == 1) {
                long jE2 = xVar.e((byte) 0, 0L, Long.MAX_VALUE);
                if (jE2 == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    nVar = this;
                    nVar.e(fVar2, 0L, jE2 + 1);
                } else {
                    nVar = this;
                }
                xVar.skip(jE2 + 1);
            } else {
                nVar = this;
            }
            if (z2) {
                b(xVar.s(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            nVar.f9711a = (byte) 1;
        }
        if (nVar.f9711a == 1) {
            long j4 = fVar.f9695b;
            long jA = nVar.f9714d.A(j, fVar);
            if (jA != -1) {
                nVar.e(fVar, j4, jA);
                return jA;
            }
            nVar.f9711a = (byte) 2;
        }
        if (nVar.f9711a == 2) {
            b(xVar.l(), (int) crc32.getValue(), "CRC");
            b(xVar.l(), (int) nVar.f9713c.getBytesWritten(), "ISIZE");
            nVar.f9711a = (byte) 3;
            if (!xVar.b()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // kk.c0
    public final e0 a() {
        return this.f9712b.f9738a.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f9714d.close();
    }

    public final void e(f fVar, long j, long j4) {
        y yVar = fVar.f9694a;
        fj.l.c(yVar);
        while (true) {
            int i10 = yVar.f9743c;
            int i11 = yVar.f9742b;
            if (j < i10 - i11) {
                break;
            }
            j -= i10 - i11;
            yVar = yVar.f9746f;
            fj.l.c(yVar);
        }
        while (j4 > 0) {
            int iMin = (int) Math.min(yVar.f9743c - r6, j4);
            this.f9715e.update(yVar.f9741a, (int) (yVar.f9742b + j), iMin);
            j4 -= iMin;
            yVar = yVar.f9746f;
            fj.l.c(yVar);
            j = 0;
        }
    }
}
