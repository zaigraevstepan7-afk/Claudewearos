package kk;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class m extends e0 {

    /* renamed from: e, reason: collision with root package name */
    public e0 f9710e;

    public m(e0 e0Var) {
        fj.l.f(e0Var, "delegate");
        this.f9710e = e0Var;
    }

    @Override // kk.e0
    public final e0 a() {
        return this.f9710e.a();
    }

    @Override // kk.e0
    public final e0 b() {
        return this.f9710e.b();
    }

    @Override // kk.e0
    public final long c() {
        return this.f9710e.c();
    }

    @Override // kk.e0
    public final e0 d(long j) {
        return this.f9710e.d(j);
    }

    @Override // kk.e0
    public final boolean e() {
        return this.f9710e.e();
    }

    @Override // kk.e0
    public final void f() throws InterruptedIOException {
        this.f9710e.f();
    }

    @Override // kk.e0
    public final e0 g(long j) {
        fj.l.f(TimeUnit.MILLISECONDS, "unit");
        return this.f9710e.g(j);
    }
}
