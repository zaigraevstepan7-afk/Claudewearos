package qj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class a extends l1 implements ti.c, z {

    /* renamed from: c, reason: collision with root package name */
    public final ti.h f13537c;

    public a(ti.h hVar, boolean z2) {
        super(z2);
        K((e1) hVar.C(w.f13632b));
        this.f13537c = hVar.V(this);
    }

    @Override // qj.l1
    public final void J(b3.e eVar) {
        b0.q(eVar, this.f13537c);
    }

    @Override // qj.z
    public final ti.h Q() {
        return this.f13537c;
    }

    @Override // qj.l1
    public final void Z(Object obj) {
        if (!(obj instanceof t)) {
            i0(obj);
            return;
        }
        t tVar = (t) obj;
        h0(t.f13621b.get(tVar) == 1, tVar.f13622a);
    }

    @Override // ti.c
    public final ti.h getContext() {
        return this.f13537c;
    }

    public final void j0(a0 a0Var, a aVar, ej.e eVar) {
        Object objInvoke;
        int iOrdinal = a0Var.ordinal();
        pi.o oVar = pi.o.f13011a;
        if (iOrdinal == 0) {
            try {
                vj.b.h(oVar, u3.a.g(u3.a.a(eVar, aVar, this)));
                return;
            } finally {
                th = th;
                if (th instanceof i0) {
                    th = ((i0) th).f13584a;
                }
                resumeWith(uk.c.r(th));
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                fj.l.f(eVar, "<this>");
                u3.a.g(u3.a.a(eVar, aVar, this)).resumeWith(oVar);
                return;
            }
            if (iOrdinal != 3) {
                throw new b3.e();
            }
            try {
                ti.h hVar = this.f13537c;
                Object objN = vj.b.n(hVar, null);
                try {
                    if (eVar instanceof vi.a) {
                        fj.y.c(2, eVar);
                        objInvoke = eVar.invoke(aVar, this);
                    } else {
                        objInvoke = u3.a.p(eVar, aVar, this);
                    }
                    vj.b.g(hVar, objN);
                    if (objInvoke != ui.a.f17085a) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th2) {
                    vj.b.g(hVar, objN);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // qj.l1
    public final String q() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // ti.c
    public final void resumeWith(Object obj) {
        Throwable thA = pi.k.a(obj);
        if (thA != null) {
            obj = new t(false, thA);
        }
        Object objS = S(obj);
        if (objS == b0.f13552e) {
            return;
        }
        j(objS);
    }

    public void i0(Object obj) {
    }

    public void h0(boolean z2, Throwable th2) {
    }
}
