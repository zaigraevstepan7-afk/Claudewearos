package kk;

import java.io.IOException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class l implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f9709a;

    public l(c0 c0Var) {
        fj.l.f(c0Var, "delegate");
        this.f9709a = c0Var;
    }

    @Override // kk.c0
    public long A(long j, f fVar) {
        fj.l.f(fVar, "sink");
        return this.f9709a.A(j, fVar);
    }

    @Override // kk.c0
    public final e0 a() {
        return this.f9709a.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f9709a.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f9709a + ')';
    }
}
