package qj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class m1 extends s1 {

    /* renamed from: d, reason: collision with root package name */
    public final ti.c f13603d;

    public m1(ti.h hVar, ej.e eVar) {
        super(hVar, false);
        this.f13603d = u3.a.a(eVar, this, this);
    }

    @Override // qj.l1
    public final void a0() throws Throwable {
        try {
            vj.b.h(pi.o.f13011a, u3.a.g(this.f13603d));
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof i0) {
                th = ((i0) th).f13584a;
            }
            resumeWith(uk.c.r(th));
            throw th;
        }
    }
}
