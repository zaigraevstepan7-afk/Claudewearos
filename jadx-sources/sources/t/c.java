package t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final p1 f15107a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15108b;

    /* renamed from: c, reason: collision with root package name */
    public final k f15109c;

    /* renamed from: d, reason: collision with root package name */
    public final f1.j1 f15110d;

    /* renamed from: e, reason: collision with root package name */
    public final f1.j1 f15111e;

    /* renamed from: f, reason: collision with root package name */
    public final p0 f15112f;

    /* renamed from: g, reason: collision with root package name */
    public final u0 f15113g;

    /* renamed from: h, reason: collision with root package name */
    public final p f15114h;

    /* renamed from: i, reason: collision with root package name */
    public final p f15115i;
    public final p j;

    /* renamed from: k, reason: collision with root package name */
    public final p f15116k;

    public c(Object obj, p1 p1Var, Object obj2) {
        this.f15107a = p1Var;
        this.f15108b = obj2;
        k kVar = new k(p1Var, obj, null, 60);
        this.f15109c = kVar;
        this.f15110d = f1.s.A(Boolean.FALSE);
        this.f15111e = f1.s.A(obj);
        this.f15112f = new p0();
        this.f15113g = new u0(obj2);
        p pVar = kVar.f15212c;
        boolean z2 = pVar instanceof l;
        p pVar2 = z2 ? d.f15132e : pVar instanceof m ? d.f15133f : pVar instanceof n ? d.f15134g : d.f15135h;
        this.f15114h = pVar2;
        p pVar3 = z2 ? d.f15128a : pVar instanceof m ? d.f15129b : pVar instanceof n ? d.f15130c : d.f15131d;
        this.f15115i = pVar3;
        this.j = pVar2;
        this.f15116k = pVar3;
    }

    public static final Object a(c cVar, Object obj) {
        p1 p1Var = cVar.f15107a;
        p pVar = cVar.f15116k;
        p pVar2 = cVar.j;
        if (!fj.l.b(pVar2, cVar.f15114h) || !fj.l.b(pVar, cVar.f15115i)) {
            p pVar3 = (p) p1Var.f15249a.invoke(obj);
            int iB = pVar3.b();
            boolean z2 = false;
            for (int i10 = 0; i10 < iB; i10++) {
                if (pVar3.a(i10) < pVar2.a(i10) || pVar3.a(i10) > pVar.a(i10)) {
                    pVar3.e(cg.b.o(pVar3.a(i10), pVar2.a(i10), pVar.a(i10)), i10);
                    z2 = true;
                }
            }
            if (z2) {
                return p1Var.f15250b.invoke(pVar3);
            }
        }
        return obj;
    }

    public static final void b(c cVar) {
        k kVar = cVar.f15109c;
        kVar.f15212c.d();
        kVar.f15213d = Long.MIN_VALUE;
        cVar.f15110d.setValue(Boolean.FALSE);
    }

    public static Object d(c cVar, Object obj, j jVar, Float f10, ej.c cVar2, ti.c cVar3, int i10) {
        if ((i10 & 2) != 0) {
            jVar = cVar.f15113g;
        }
        j jVar2 = jVar;
        Object objInvoke = f10;
        if ((i10 & 4) != 0) {
            objInvoke = cVar.f15107a.f15250b.invoke(cVar.f15109c.f15212c);
        }
        if ((i10 & 8) != 0) {
            cVar2 = null;
        }
        Object objE = cVar.e();
        p1 p1Var = cVar.f15107a;
        return p0.a(cVar.f15112f, new a(cVar, objInvoke, new c1(jVar2, p1Var, objE, obj, (p) p1Var.f15249a.invoke(objInvoke)), cVar.f15109c.f15213d, cVar2, null), cVar3);
    }

    public final Object c(Float f10, u uVar, ej.c cVar, vi.c cVar2) {
        Object objE = e();
        p1 p1Var = this.f15107a;
        return p0.a(this.f15112f, new a(this, f10, new t(uVar, p1Var, objE, (p) p1Var.f15249a.invoke(f10)), this.f15109c.f15213d, cVar, null), cVar2);
    }

    public final Object e() {
        return this.f15109c.f15211b.getValue();
    }

    public final Object f(Object obj, ti.c cVar) {
        Object objA = p0.a(this.f15112f, new b(this, obj, null), cVar);
        return objA == ui.a.f17085a ? objA : pi.o.f13011a;
    }

    public /* synthetic */ c(Object obj, p1 p1Var, Object obj2, int i10) {
        this(obj, p1Var, (i10 & 4) != 0 ? null : obj2);
    }
}
