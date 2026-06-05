package dk;

import fj.l;
import java.io.IOException;
import java.net.ProtocolException;
import kk.b0;
import kk.e0;
import t.m1;
import wh.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f5148a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5149b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5150c;

    /* renamed from: d, reason: collision with root package name */
    public long f5151d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5152e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s f5153f;

    public b(s sVar, b0 b0Var, long j) {
        this.f5153f = sVar;
        l.f(b0Var, "delegate");
        this.f5148a = b0Var;
        this.f5150c = j;
    }

    @Override // kk.b0
    public final void Y(long j, kk.f fVar) throws IOException {
        if (this.f5152e) {
            throw new IllegalStateException("closed");
        }
        long j4 = this.f5150c;
        if (j4 != -1 && this.f5151d + j > j4) {
            StringBuilder sbL = m1.l("expected ", " bytes but received ", j4);
            sbL.append(this.f5151d + j);
            throw new ProtocolException(sbL.toString());
        }
        try {
            this.f5148a.Y(j, fVar);
            this.f5151d += j;
        } catch (IOException e10) {
            throw e(e10);
        }
    }

    @Override // kk.b0
    public final e0 a() {
        return this.f5148a.a();
    }

    public final void b() {
        this.f5148a.close();
    }

    @Override // kk.b0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f5152e) {
            return;
        }
        this.f5152e = true;
        long j = this.f5150c;
        if (j != -1 && this.f5151d != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            b();
            e(null);
        } catch (IOException e10) {
            throw e(e10);
        }
    }

    public final IOException e(IOException iOException) {
        if (this.f5149b) {
            return iOException;
        }
        this.f5149b = true;
        return this.f5153f.e(false, true, iOException);
    }

    @Override // kk.b0, java.io.Flushable
    public final void flush() throws IOException {
        try {
            g();
        } catch (IOException e10) {
            throw e(e10);
        }
    }

    public final void g() {
        this.f5148a.flush();
    }

    public final String toString() {
        return b.class.getSimpleName() + '(' + this.f5148a + ')';
    }
}
