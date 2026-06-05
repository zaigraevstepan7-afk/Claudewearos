package vj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class u implements ti.f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f18124a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadLocal f18125b;

    /* renamed from: c, reason: collision with root package name */
    public final v f18126c;

    public u(Object obj, ThreadLocal threadLocal) {
        this.f18124a = obj;
        this.f18125b = threadLocal;
        this.f18126c = new v(threadLocal);
    }

    @Override // ti.h
    public final ti.f C(ti.g gVar) {
        if (this.f18126c.equals(gVar)) {
            return this;
        }
        return null;
    }

    @Override // ti.h
    public final Object F(ej.e eVar, Object obj) {
        return eVar.invoke(obj, this);
    }

    @Override // ti.h
    public final ti.h V(ti.h hVar) {
        return yd.f.W(this, hVar);
    }

    public final void a(Object obj) {
        this.f18125b.set(obj);
    }

    public final Object c(ti.h hVar) {
        ThreadLocal threadLocal = this.f18125b;
        Object obj = threadLocal.get();
        threadLocal.set(this.f18124a);
        return obj;
    }

    @Override // ti.f
    public final ti.g getKey() {
        return this.f18126c;
    }

    @Override // ti.h
    public final ti.h s(ti.g gVar) {
        return this.f18126c.equals(gVar) ? ti.i.f16336a : this;
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f18124a + ", threadLocal = " + this.f18125b + ')';
    }
}
