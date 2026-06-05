package w6;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s implements e7.c {

    /* renamed from: a, reason: collision with root package name */
    public final e7.c f18855a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18856b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f18857c;

    public s(y yVar, e7.c cVar) {
        fj.l.f(cVar, "delegate");
        this.f18857c = yVar;
        this.f18855a = cVar;
        this.f18856b = u0.b.e();
    }

    @Override // e7.c
    public final String M(int i10) {
        if (this.f18857c.f18885e) {
            uk.c.S(21, "Statement is recycled");
            throw null;
        }
        if (this.f18856b == u0.b.e()) {
            return this.f18855a.M(i10);
        }
        uk.c.S(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // e7.c
    public final boolean a0() {
        if (this.f18857c.f18885e) {
            uk.c.S(21, "Statement is recycled");
            throw null;
        }
        if (this.f18856b == u0.b.e()) {
            return this.f18855a.a0();
        }
        uk.c.S(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.f18857c.f18885e) {
            uk.c.S(21, "Statement is recycled");
            throw null;
        }
        if (this.f18856b == u0.b.e()) {
            this.f18855a.close();
        } else {
            uk.c.S(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // e7.c
    public final void d() {
        if (this.f18857c.f18885e) {
            uk.c.S(21, "Statement is recycled");
            throw null;
        }
        if (this.f18856b == u0.b.e()) {
            this.f18855a.d();
        } else {
            uk.c.S(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // e7.c
    public final int getColumnCount() {
        if (this.f18857c.f18885e) {
            uk.c.S(21, "Statement is recycled");
            throw null;
        }
        if (this.f18856b == u0.b.e()) {
            return this.f18855a.getColumnCount();
        }
        uk.c.S(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // e7.c
    public final String getColumnName(int i10) {
        if (this.f18857c.f18885e) {
            uk.c.S(21, "Statement is recycled");
            throw null;
        }
        if (this.f18856b == u0.b.e()) {
            return this.f18855a.getColumnName(i10);
        }
        uk.c.S(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // e7.c
    public final long getLong(int i10) {
        if (this.f18857c.f18885e) {
            uk.c.S(21, "Statement is recycled");
            throw null;
        }
        if (this.f18856b == u0.b.e()) {
            return this.f18855a.getLong(i10);
        }
        uk.c.S(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // e7.c
    public final boolean isNull(int i10) {
        if (this.f18857c.f18885e) {
            uk.c.S(21, "Statement is recycled");
            throw null;
        }
        if (this.f18856b == u0.b.e()) {
            return this.f18855a.isNull(i10);
        }
        uk.c.S(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // e7.c
    public final void reset() {
        if (this.f18857c.f18885e) {
            uk.c.S(21, "Statement is recycled");
            throw null;
        }
        if (this.f18856b == u0.b.e()) {
            this.f18855a.reset();
        } else {
            uk.c.S(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
