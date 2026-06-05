package w6;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f implements e7.c {

    /* renamed from: a, reason: collision with root package name */
    public final e7.c f18807a;

    public f(e7.c cVar) {
        this.f18807a = cVar;
    }

    @Override // e7.c
    public final String M(int i10) {
        return this.f18807a.M(i10);
    }

    @Override // e7.c
    public final boolean a0() {
        return this.f18807a.a0();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        e7.c cVar = this.f18807a;
        cVar.reset();
        cVar.d();
    }

    @Override // e7.c
    public final void d() {
        this.f18807a.d();
    }

    @Override // e7.c
    public final int getColumnCount() {
        return this.f18807a.getColumnCount();
    }

    @Override // e7.c
    public final String getColumnName(int i10) {
        return this.f18807a.getColumnName(i10);
    }

    @Override // e7.c
    public final long getLong(int i10) {
        return this.f18807a.getLong(i10);
    }

    @Override // e7.c
    public final boolean isNull(int i10) {
        return this.f18807a.isNull(i10);
    }

    @Override // e7.c
    public final void reset() {
        this.f18807a.reset();
    }

    @Override // e7.c
    public final boolean x() {
        return this.f18807a.x();
    }
}
