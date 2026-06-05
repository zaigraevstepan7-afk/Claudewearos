package t;

import f1.q2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f15200a;

    /* renamed from: b, reason: collision with root package name */
    public final j1 f15201b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15202c;

    /* renamed from: d, reason: collision with root package name */
    public final f1.j1 f15203d = f1.s.A(c());

    /* renamed from: e, reason: collision with root package name */
    public final f1.j1 f15204e = f1.s.A(new h1(c(), c()));

    /* renamed from: f, reason: collision with root package name */
    public final f1.h1 f15205f = new f1.h1(0);

    /* renamed from: g, reason: collision with root package name */
    public final f1.h1 f15206g = new f1.h1(Long.MIN_VALUE);

    /* renamed from: h, reason: collision with root package name */
    public final f1.j1 f15207h;

    /* renamed from: i, reason: collision with root package name */
    public final t1.q f15208i;
    public final t1.q j;

    /* renamed from: k, reason: collision with root package name */
    public final f1.j1 f15209k;

    public j1(l0 l0Var, j1 j1Var, String str) {
        this.f15200a = l0Var;
        this.f15201b = j1Var;
        this.f15202c = str;
        Boolean bool = Boolean.FALSE;
        this.f15207h = f1.s.A(bool);
        this.f15208i = new t1.q();
        this.j = new t1.q();
        this.f15209k = f1.s.A(bool);
        f1.s.q(new d1(this, 1));
        l0Var.getClass();
    }

    public final void a(Object obj, f1.i0 i0Var, int i10) {
        int i11;
        i0Var.c0(-1493585151);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? i0Var.f(obj) : i0Var.h(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.f(this) ? 32 : 16;
        }
        if (!i0Var.T(i11 & 1, (i11 & 19) != 18)) {
            i0Var.W();
        } else if (g()) {
            i0Var.b0(467722849);
            i0Var.p(false);
        } else {
            i0Var.b0(466062241);
            k(obj);
            int i12 = i11 & 112;
            boolean z2 = i12 == 32;
            Object objQ = i0Var.Q();
            f1.f fVar = f1.m.f6385a;
            if (z2 || objQ == fVar) {
                objQ = f1.s.q(new d1(this, 0));
                i0Var.l0(objQ);
            }
            if (((Boolean) ((q2) objQ).getValue()).booleanValue()) {
                i0Var.b0(466470356);
                Object objQ2 = i0Var.Q();
                if (objQ2 == fVar) {
                    objQ2 = f1.s.o(i0Var);
                    i0Var.l0(objQ2);
                }
                qj.z zVar = (qj.z) objQ2;
                boolean zH = i0Var.h(zVar) | (i12 == 32);
                Object objQ3 = i0Var.Q();
                if (zH || objQ3 == fVar) {
                    objQ3 = new k0.t1(18, zVar, this);
                    i0Var.l0(objQ3);
                }
                f1.s.d(zVar, this, (ej.c) objQ3, i0Var);
                i0Var.p(false);
            } else {
                i0Var.b0(467712929);
                i0Var.p(false);
            }
            i0Var.p(false);
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new d0.j(this, i10, 10, obj);
        }
    }

    public final long b() {
        t1.q qVar = this.f15208i;
        int size = qVar.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            jMax = Math.max(jMax, ((i1) qVar.get(i10)).C.g());
        }
        t1.q qVar2 = this.j;
        int size2 = qVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            jMax = Math.max(jMax, ((j1) qVar2.get(i11)).b());
        }
        return jMax;
    }

    public final Object c() {
        return this.f15200a.f15225b.getValue();
    }

    public final boolean d() {
        t1.q qVar = this.f15208i;
        int size = qVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((i1) qVar.get(i10)).getClass();
        }
        t1.q qVar2 = this.j;
        int size2 = qVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            if (((j1) qVar2.get(i11)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        j1 j1Var = this.f15201b;
        return j1Var != null ? j1Var.e() : this.f15205f.g();
    }

    public final g1 f() {
        return (g1) this.f15204e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.f15209k.getValue()).booleanValue();
    }

    public final void h(long j, boolean z2) {
        f1.h1 h1Var = this.f15206g;
        long jG = h1Var.g();
        l0 l0Var = this.f15200a;
        if (jG == Long.MIN_VALUE) {
            h1Var.h(j);
            l0Var.f15224a.setValue(Boolean.TRUE);
        } else if (!((Boolean) l0Var.f15224a.getValue()).booleanValue()) {
            l0Var.f15224a.setValue(Boolean.TRUE);
        }
        this.f15207h.setValue(Boolean.FALSE);
        t1.q qVar = this.f15208i;
        int size = qVar.size();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            i1 i1Var = (i1) qVar.get(i10);
            f1.j1 j1Var = i1Var.f15195e;
            f1.j1 j1Var2 = i1Var.f15195e;
            if (!((Boolean) j1Var.getValue()).booleanValue()) {
                long jB = z2 ? i1Var.b().b() : j;
                i1Var.A.setValue(i1Var.b().f(jB));
                i1Var.B = i1Var.b().d(jB);
                if (i1Var.b().e(jB)) {
                    j1Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) j1Var2.getValue()).booleanValue()) {
                z10 = false;
            }
        }
        t1.q qVar2 = this.j;
        int size2 = qVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            j1 j1Var3 = (j1) qVar2.get(i11);
            if (!fj.l.b(j1Var3.f15203d.getValue(), j1Var3.c())) {
                j1Var3.h(j, z2);
            }
            if (!fj.l.b(j1Var3.f15203d.getValue(), j1Var3.c())) {
                z10 = false;
            }
        }
        if (z10) {
            i();
        }
    }

    public final void i() {
        this.f15206g.h(Long.MIN_VALUE);
        l0 l0Var = this.f15200a;
        if (l0Var instanceof l0) {
            l0Var.f15225b.setValue(this.f15203d.getValue());
        }
        if (this.f15201b == null) {
            this.f15205f.h(0L);
        }
        l0Var.f15224a.setValue(Boolean.FALSE);
        t1.q qVar = this.j;
        int size = qVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((j1) qVar.get(i10)).i();
        }
    }

    public final void j(Object obj, Object obj2) {
        this.f15206g.h(Long.MIN_VALUE);
        l0 l0Var = this.f15200a;
        l0Var.f15224a.setValue(Boolean.FALSE);
        boolean zG = g();
        f1.j1 j1Var = this.f15203d;
        if (!zG || !fj.l.b(c(), obj) || !fj.l.b(j1Var.getValue(), obj2)) {
            if (!fj.l.b(c(), obj) && (l0Var instanceof l0)) {
                l0Var.f15225b.setValue(obj);
            }
            j1Var.setValue(obj2);
            this.f15209k.setValue(Boolean.TRUE);
            this.f15204e.setValue(new h1(obj, obj2));
        }
        t1.q qVar = this.j;
        int size = qVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            j1 j1Var2 = (j1) qVar.get(i10);
            fj.l.d(j1Var2, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (j1Var2.g()) {
                j1Var2.j(j1Var2.c(), j1Var2.f15203d.getValue());
            }
        }
        t1.q qVar2 = this.f15208i;
        int size2 = qVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((i1) qVar2.get(i11)).d();
        }
    }

    public final void k(Object obj) {
        f1.j1 j1Var = this.f15203d;
        if (fj.l.b(j1Var.getValue(), obj)) {
            return;
        }
        this.f15204e.setValue(new h1(j1Var.getValue(), obj));
        if (!fj.l.b(c(), j1Var.getValue())) {
            this.f15200a.f15225b.setValue(j1Var.getValue());
        }
        j1Var.setValue(obj);
        if (this.f15206g.g() == Long.MIN_VALUE) {
            this.f15207h.setValue(Boolean.TRUE);
        }
        t1.q qVar = this.f15208i;
        int size = qVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((i1) qVar.get(i10)).f15196f.h(-2.0f);
        }
    }

    public final String toString() {
        t1.q qVar = this.f15208i;
        int size = qVar.size();
        String str = "Transition animation values: ";
        for (int i10 = 0; i10 < size; i10++) {
            str = str + ((i1) qVar.get(i10)) + ", ";
        }
        return str;
    }
}
