package k8;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f9481a;

    /* renamed from: b, reason: collision with root package name */
    public int f9482b = 1073741824;

    public l(InputStream inputStream) {
        this.f9481a = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f9482b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f9481a.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i10 = this.f9481a.read();
        if (i10 == -1) {
            this.f9482b = 0;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.f9481a.skip(j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i10 = this.f9481a.read(bArr);
        if (i10 == -1) {
            this.f9482b = 0;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f9481a.read(bArr, i10, i11);
        if (i12 == -1) {
            this.f9482b = 0;
        }
        return i12;
    }
}
