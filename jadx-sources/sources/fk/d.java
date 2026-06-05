package fk;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d extends a {

    /* renamed from: d, reason: collision with root package name */
    public long f6819d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f6820e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, long j) {
        super(gVar);
        this.f6820e = gVar;
        this.f6819d = j;
        if (j == 0) {
            b();
        }
    }

    @Override // fk.a, kk.c0
    public final long A(long j, kk.f fVar) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException(m1.g(j, "byteCount < 0: "));
        }
        if (this.f6810b) {
            throw new IllegalStateException("closed");
        }
        long j4 = this.f6819d;
        if (j4 == 0) {
            return -1L;
        }
        long jA = super.A(Math.min(j4, j), fVar);
        if (jA == -1) {
            ((dk.e) this.f6820e.f6828d).h();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }
        long j10 = this.f6819d - jA;
        this.f6819d = j10;
        if (j10 == 0) {
            b();
        }
        return jA;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zO;
        if (this.f6810b) {
            return;
        }
        if (this.f6819d != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            try {
                zO = bk.d.o(this, 100);
            } catch (IOException unused) {
                zO = false;
            }
            if (!zO) {
                ((dk.e) this.f6820e.f6828d).h();
                b();
            }
        }
        this.f6810b = true;
    }
}
