package w2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends pf.e {

    /* renamed from: e, reason: collision with root package name */
    public static d f18220e;

    /* renamed from: f, reason: collision with root package name */
    public static final r3.j f18221f = r3.j.f13682b;

    /* renamed from: g, reason: collision with root package name */
    public static final r3.j f18222g = r3.j.f13681a;

    /* renamed from: c, reason: collision with root package name */
    public g3.k0 f18223c;

    /* renamed from: d, reason: collision with root package name */
    public d3.r f18224d;

    @Override // pf.e
    public final int[] c(int i10) {
        int iE;
        if (e().length() <= 0 || i10 >= e().length()) {
            return null;
        }
        try {
            d3.r rVar = this.f18224d;
            if (rVar == null) {
                fj.l.l("node");
                throw null;
            }
            b2.c cVarG = rVar.g();
            int iRound = Math.round(cVarG.f1505d - cVarG.f1503b);
            if (i10 <= 0) {
                i10 = 0;
            }
            g3.k0 k0Var = this.f18223c;
            if (k0Var == null) {
                fj.l.l("layoutResult");
                throw null;
            }
            int iD = k0Var.f7129b.d(i10);
            g3.k0 k0Var2 = this.f18223c;
            if (k0Var2 == null) {
                fj.l.l("layoutResult");
                throw null;
            }
            float f10 = k0Var2.f7129b.f(iD) + iRound;
            g3.k0 k0Var3 = this.f18223c;
            if (k0Var3 == null) {
                fj.l.l("layoutResult");
                throw null;
            }
            if (k0Var3 == null) {
                fj.l.l("layoutResult");
                throw null;
            }
            if (f10 < k0Var3.f7129b.f(r0.f7159f - 1)) {
                g3.k0 k0Var4 = this.f18223c;
                if (k0Var4 == null) {
                    fj.l.l("layoutResult");
                    throw null;
                }
                iE = k0Var4.f7129b.e(f10);
            } else {
                g3.k0 k0Var5 = this.f18223c;
                if (k0Var5 == null) {
                    fj.l.l("layoutResult");
                    throw null;
                }
                iE = k0Var5.f7129b.f7159f;
            }
            return d(i10, i(iE - 1, f18222g) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // pf.e
    public final int[] h(int i10) {
        int iE;
        if (e().length() <= 0 || i10 <= 0) {
            return null;
        }
        try {
            d3.r rVar = this.f18224d;
            if (rVar == null) {
                fj.l.l("node");
                throw null;
            }
            b2.c cVarG = rVar.g();
            int iRound = Math.round(cVarG.f1505d - cVarG.f1503b);
            int length = e().length();
            if (length <= i10) {
                i10 = length;
            }
            g3.k0 k0Var = this.f18223c;
            if (k0Var == null) {
                fj.l.l("layoutResult");
                throw null;
            }
            int iD = k0Var.f7129b.d(i10);
            g3.k0 k0Var2 = this.f18223c;
            if (k0Var2 == null) {
                fj.l.l("layoutResult");
                throw null;
            }
            float f10 = k0Var2.f7129b.f(iD) - iRound;
            if (f10 > 0.0f) {
                g3.k0 k0Var3 = this.f18223c;
                if (k0Var3 == null) {
                    fj.l.l("layoutResult");
                    throw null;
                }
                iE = k0Var3.f7129b.e(f10);
            } else {
                iE = 0;
            }
            if (i10 == e().length() && iE < iD) {
                iE++;
            }
            return d(i(iE, f18221f), i10);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int i(int i10, r3.j jVar) {
        g3.k0 k0Var = this.f18223c;
        if (k0Var == null) {
            fj.l.l("layoutResult");
            throw null;
        }
        int iF = k0Var.f(i10);
        g3.k0 k0Var2 = this.f18223c;
        if (k0Var2 == null) {
            fj.l.l("layoutResult");
            throw null;
        }
        if (jVar != k0Var2.g(iF)) {
            g3.k0 k0Var3 = this.f18223c;
            if (k0Var3 != null) {
                return k0Var3.f(i10);
            }
            fj.l.l("layoutResult");
            throw null;
        }
        if (this.f18223c != null) {
            return r6.f7129b.c(i10, false) - 1;
        }
        fj.l.l("layoutResult");
        throw null;
    }
}
