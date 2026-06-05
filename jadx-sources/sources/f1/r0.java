package f1;

import c1.s3;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r0 implements c2, qj.x {

    /* renamed from: a, reason: collision with root package name */
    public final ti.h f6430a;

    /* renamed from: b, reason: collision with root package name */
    public final ej.e f6431b;

    /* renamed from: c, reason: collision with root package name */
    public final vj.d f6432c;

    /* renamed from: d, reason: collision with root package name */
    public qj.s1 f6433d;

    public r0(ti.h hVar, ej.e eVar) {
        this.f6430a = hVar;
        this.f6431b = eVar;
        this.f6432c = qj.b0.b(hVar.V(this));
    }

    @Override // ti.h
    public final ti.f C(ti.g gVar) {
        return yd.f.w(this, gVar);
    }

    @Override // ti.h
    public final Object F(ej.e eVar, Object obj) {
        return eVar.invoke(obj, this);
    }

    @Override // ti.h
    public final ti.h V(ti.h hVar) {
        return yd.f.W(this, hVar);
    }

    @Override // f1.c2
    public final void a() {
        qj.s1 s1Var = this.f6433d;
        if (s1Var != null) {
            s1Var.o(new d0(1));
        }
        this.f6433d = null;
    }

    @Override // f1.c2
    public final void c() {
        qj.s1 s1Var = this.f6433d;
        if (s1Var != null) {
            s1Var.o(new d0(1));
        }
        this.f6433d = null;
    }

    @Override // f1.c2
    public final void d() {
        qj.s1 s1Var = this.f6433d;
        if (s1Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            s1Var.e(cancellationException);
        }
        this.f6433d = qj.b0.w(this.f6432c, null, this.f6431b, 3);
    }

    @Override // ti.f
    public final ti.g getKey() {
        return qj.w.f13631a;
    }

    @Override // qj.x
    public final void l(Throwable th2, ti.h hVar) throws Throwable {
        u1.f fVar = (u1.f) hVar.C(u1.f.f16570b);
        if (fVar != null) {
            u1.d.h(th2, new s3(25, fVar, this));
        }
        qj.x xVar = (qj.x) this.f6430a.C(qj.w.f13631a);
        if (xVar == null) {
            throw th2;
        }
        xVar.l(th2, hVar);
    }

    @Override // ti.h
    public final ti.h s(ti.g gVar) {
        return yd.f.N(this, gVar);
    }
}
