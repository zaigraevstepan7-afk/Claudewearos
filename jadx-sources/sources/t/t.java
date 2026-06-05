package t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t implements f {

    /* renamed from: a, reason: collision with root package name */
    public final u1 f15280a;

    /* renamed from: b, reason: collision with root package name */
    public final p1 f15281b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15282c;

    /* renamed from: d, reason: collision with root package name */
    public final p f15283d;

    /* renamed from: e, reason: collision with root package name */
    public final p f15284e;

    /* renamed from: f, reason: collision with root package name */
    public final p f15285f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f15286g;

    /* renamed from: h, reason: collision with root package name */
    public final long f15287h;

    public t(u uVar, p1 p1Var, Object obj, p pVar) {
        u1 u1Var = new u1(uVar.f15291a);
        this.f15280a = u1Var;
        this.f15281b = p1Var;
        this.f15282c = obj;
        p pVar2 = (p) p1Var.f15249a.invoke(obj);
        this.f15283d = pVar2;
        this.f15284e = d.j(pVar);
        ej.c cVar = p1Var.f15250b;
        if (u1Var.f15298d == null) {
            u1Var.f15298d = pVar2.c();
        }
        p pVar3 = u1Var.f15298d;
        if (pVar3 == null) {
            fj.l.l("targetVector");
            throw null;
        }
        int iB = pVar3.b();
        for (int i10 = 0; i10 < iB; i10++) {
            p pVar4 = u1Var.f15298d;
            if (pVar4 == null) {
                fj.l.l("targetVector");
                throw null;
            }
            pVar4.e(u1Var.f15295a.n(pVar2.a(i10), pVar.a(i10)), i10);
        }
        p pVar5 = u1Var.f15298d;
        if (pVar5 == null) {
            fj.l.l("targetVector");
            throw null;
        }
        this.f15286g = cVar.invoke(pVar5);
        if (u1Var.f15297c == null) {
            u1Var.f15297c = pVar2.c();
        }
        p pVar6 = u1Var.f15297c;
        if (pVar6 == null) {
            fj.l.l("velocityVector");
            throw null;
        }
        int iB2 = pVar6.b();
        long jMax = 0;
        for (int i11 = 0; i11 < iB2; i11++) {
            pVar2.getClass();
            jMax = Math.max(jMax, u1Var.f15295a.m(pVar.a(i11)));
        }
        this.f15287h = jMax;
        p pVarJ = d.j(this.f15280a.a(jMax, this.f15283d, pVar));
        this.f15285f = pVarJ;
        int iB3 = pVarJ.b();
        for (int i12 = 0; i12 < iB3; i12++) {
            p pVar7 = this.f15285f;
            float fA = pVar7.a(i12);
            float f10 = this.f15280a.f15299e;
            pVar7.e(cg.b.o(fA, -f10, f10), i12);
        }
    }

    @Override // t.f
    public final boolean a() {
        return false;
    }

    @Override // t.f
    public final long b() {
        return this.f15287h;
    }

    @Override // t.f
    public final p1 c() {
        return this.f15281b;
    }

    @Override // t.f
    public final p d(long j) {
        if (e(j)) {
            return this.f15285f;
        }
        return this.f15280a.a(j, this.f15283d, this.f15284e);
    }

    @Override // t.f
    public final Object f(long j) {
        if (e(j)) {
            return this.f15286g;
        }
        ej.c cVar = this.f15281b.f15250b;
        u1 u1Var = this.f15280a;
        p pVar = u1Var.f15296b;
        p pVar2 = this.f15283d;
        if (pVar == null) {
            u1Var.f15296b = pVar2.c();
        }
        p pVar3 = u1Var.f15296b;
        if (pVar3 == null) {
            fj.l.l("valueVector");
            throw null;
        }
        int iB = pVar3.b();
        for (int i10 = 0; i10 < iB; i10++) {
            p pVar4 = u1Var.f15296b;
            if (pVar4 == null) {
                fj.l.l("valueVector");
                throw null;
            }
            pVar4.e(u1Var.f15295a.i(pVar2.a(i10), this.f15284e.a(i10), j), i10);
        }
        p pVar5 = u1Var.f15296b;
        if (pVar5 != null) {
            return cVar.invoke(pVar5);
        }
        fj.l.l("valueVector");
        throw null;
    }

    @Override // t.f
    public final Object g() {
        return this.f15286g;
    }
}
