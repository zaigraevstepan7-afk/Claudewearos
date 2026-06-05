package kk;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class w extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f9737a;

    public w(x xVar) {
        this.f9737a = xVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        x xVar = this.f9737a;
        if (xVar.f9740c) {
            throw new IOException("closed");
        }
        return (int) Math.min(xVar.f9739b.f9695b, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f9737a.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        x xVar = this.f9737a;
        f fVar = xVar.f9739b;
        if (xVar.f9740c) {
            throw new IOException("closed");
        }
        if (fVar.f9695b == 0 && xVar.f9738a.A(8192L, fVar) == -1) {
            return -1;
        }
        return fVar.readByte() & 255;
    }

    public final String toString() {
        return this.f9737a + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final long transferTo(OutputStream outputStream) throws IOException {
        fj.l.f(outputStream, "out");
        x xVar = this.f9737a;
        f fVar = xVar.f9739b;
        if (xVar.f9740c) {
            throw new IOException("closed");
        }
        long j = 0;
        long j4 = 0;
        while (true) {
            if (fVar.f9695b == j && xVar.f9738a.A(8192L, fVar) == -1) {
                return j4;
            }
            long j10 = fVar.f9695b;
            j4 += j10;
            hj.a.n(j10, 0L, j10);
            y yVar = fVar.f9694a;
            while (j10 > j) {
                fj.l.c(yVar);
                int iMin = (int) Math.min(j10, yVar.f9743c - yVar.f9742b);
                outputStream.write(yVar.f9741a, yVar.f9742b, iMin);
                int i10 = yVar.f9742b + iMin;
                yVar.f9742b = i10;
                long j11 = iMin;
                fVar.f9695b -= j11;
                j10 -= j11;
                if (i10 == yVar.f9743c) {
                    y yVarA = yVar.a();
                    fVar.f9694a = yVarA;
                    z.a(yVar);
                    yVar = yVarA;
                }
                j = 0;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        fj.l.f(bArr, "data");
        x xVar = this.f9737a;
        f fVar = xVar.f9739b;
        if (!xVar.f9740c) {
            hj.a.n(bArr.length, i10, i11);
            if (fVar.f9695b == 0 && xVar.f9738a.A(8192L, fVar) == -1) {
                return -1;
            }
            return fVar.read(bArr, i10, i11);
        }
        throw new IOException("closed");
    }
}
