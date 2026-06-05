package w2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends pf.e {

    /* renamed from: d, reason: collision with root package name */
    public static c f18212d;

    /* renamed from: e, reason: collision with root package name */
    public static final r3.j f18213e = r3.j.f13682b;

    /* renamed from: f, reason: collision with root package name */
    public static final r3.j f18214f = r3.j.f13681a;

    /* renamed from: c, reason: collision with root package name */
    public g3.k0 f18215c;

    @Override // pf.e
    public final int[] c(int i10) {
        int iD;
        if (e().length() <= 0 || i10 >= e().length()) {
            return null;
        }
        r3.j jVar = f18213e;
        if (i10 < 0) {
            g3.k0 k0Var = this.f18215c;
            if (k0Var == null) {
                fj.l.l("layoutResult");
                throw null;
            }
            iD = k0Var.f7129b.d(0);
        } else {
            g3.k0 k0Var2 = this.f18215c;
            if (k0Var2 == null) {
                fj.l.l("layoutResult");
                throw null;
            }
            int iD2 = k0Var2.f7129b.d(i10);
            iD = i(iD2, jVar) == i10 ? iD2 : iD2 + 1;
        }
        g3.k0 k0Var3 = this.f18215c;
        if (k0Var3 == null) {
            fj.l.l("layoutResult");
            throw null;
        }
        if (iD >= k0Var3.f7129b.f7159f) {
            return null;
        }
        return d(i(iD, jVar), i(iD, f18214f) + 1);
    }

    @Override // pf.e
    public final int[] h(int i10) {
        int iD;
        if (e().length() <= 0 || i10 <= 0) {
            return null;
        }
        int length = e().length();
        r3.j jVar = f18214f;
        if (i10 > length) {
            g3.k0 k0Var = this.f18215c;
            if (k0Var == null) {
                fj.l.l("layoutResult");
                throw null;
            }
            iD = k0Var.f7129b.d(e().length());
        } else {
            g3.k0 k0Var2 = this.f18215c;
            if (k0Var2 == null) {
                fj.l.l("layoutResult");
                throw null;
            }
            int iD2 = k0Var2.f7129b.d(i10);
            iD = i(iD2, jVar) + 1 == i10 ? iD2 : iD2 - 1;
        }
        if (iD < 0) {
            return null;
        }
        return d(i(iD, f18213e), i(iD, jVar) + 1);
    }

    public final int i(int i10, r3.j jVar) {
        g3.k0 k0Var = this.f18215c;
        if (k0Var == null) {
            fj.l.l("layoutResult");
            throw null;
        }
        int iF = k0Var.f(i10);
        g3.k0 k0Var2 = this.f18215c;
        if (k0Var2 == null) {
            fj.l.l("layoutResult");
            throw null;
        }
        if (jVar != k0Var2.g(iF)) {
            g3.k0 k0Var3 = this.f18215c;
            if (k0Var3 != null) {
                return k0Var3.f(i10);
            }
            fj.l.l("layoutResult");
            throw null;
        }
        if (this.f18215c != null) {
            return r6.f7129b.c(i10, false) - 1;
        }
        fj.l.l("layoutResult");
        throw null;
    }
}
