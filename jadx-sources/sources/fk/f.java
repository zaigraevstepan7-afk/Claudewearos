package fk;

import java.io.IOException;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class f extends a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f6824d;

    @Override // fk.a, kk.c0
    public final long A(long j, kk.f fVar) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException(m1.g(j, "byteCount < 0: "));
        }
        if (this.f6810b) {
            throw new IllegalStateException("closed");
        }
        if (this.f6824d) {
            return -1L;
        }
        long jA = super.A(j, fVar);
        if (jA != -1) {
            return jA;
        }
        this.f6824d = true;
        b();
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f6810b) {
            return;
        }
        if (!this.f6824d) {
            b();
        }
        this.f6810b = true;
    }
}
