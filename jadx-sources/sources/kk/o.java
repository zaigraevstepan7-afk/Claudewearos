package kk;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class o implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final x f9716a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f9717b;

    /* renamed from: c, reason: collision with root package name */
    public int f9718c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9719d;

    public o(x xVar, Inflater inflater) {
        this.f9716a = xVar;
        this.f9717b = inflater;
    }

    @Override // kk.c0
    public final long A(long j, f fVar) throws DataFormatException, IOException {
        long j4;
        fj.l.f(fVar, "sink");
        while (j >= 0) {
            if (this.f9719d) {
                throw new IllegalStateException("closed");
            }
            x xVar = this.f9716a;
            Inflater inflater = this.f9717b;
            if (j == 0) {
                j4 = 0;
            } else {
                try {
                    y yVarP = fVar.P(1);
                    int iMin = (int) Math.min(j, 8192 - yVarP.f9743c);
                    if (inflater.needsInput() && !xVar.b()) {
                        y yVar = xVar.f9739b.f9694a;
                        fj.l.c(yVar);
                        int i10 = yVar.f9743c;
                        int i11 = yVar.f9742b;
                        int i12 = i10 - i11;
                        this.f9718c = i12;
                        inflater.setInput(yVar.f9741a, i11, i12);
                    }
                    int iInflate = inflater.inflate(yVarP.f9741a, yVarP.f9743c, iMin);
                    int i13 = this.f9718c;
                    if (i13 != 0) {
                        int remaining = i13 - inflater.getRemaining();
                        this.f9718c -= remaining;
                        xVar.skip(remaining);
                    }
                    if (iInflate > 0) {
                        yVarP.f9743c += iInflate;
                        j4 = iInflate;
                        fVar.f9695b += j4;
                    } else {
                        if (yVarP.f9742b == yVarP.f9743c) {
                            fVar.f9694a = yVarP.a();
                            z.a(yVarP);
                        }
                        j4 = 0;
                    }
                } catch (DataFormatException e10) {
                    throw new IOException(e10);
                }
            }
            if (j4 > 0) {
                return j4;
            }
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
            if (xVar.b()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        throw new IllegalArgumentException(m1.g(j, "byteCount < 0: ").toString());
    }

    @Override // kk.c0
    public final e0 a() {
        return this.f9716a.f9738a.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f9719d) {
            return;
        }
        this.f9717b.end();
        this.f9719d = true;
        this.f9716a.close();
    }
}
