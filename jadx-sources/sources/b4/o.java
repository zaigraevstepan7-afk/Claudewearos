package b4;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class o implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f1565a;

    /* renamed from: b, reason: collision with root package name */
    public a4.d f1566b;

    /* renamed from: c, reason: collision with root package name */
    public l f1567c;

    /* renamed from: d, reason: collision with root package name */
    public int f1568d;

    /* renamed from: e, reason: collision with root package name */
    public final g f1569e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f1570f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1571g = false;

    /* renamed from: h, reason: collision with root package name */
    public final f f1572h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public final f f1573i = new f(this);
    public int j = 1;

    public o(a4.d dVar) {
        this.f1566b = dVar;
    }

    public static void b(f fVar, f fVar2, int i10) {
        fVar.f1551l.add(fVar2);
        fVar.f1546f = i10;
        fVar2.f1550k.add(fVar);
    }

    public static f h(a4.c cVar) {
        a4.c cVar2 = cVar.f97f;
        if (cVar2 == null) {
            return null;
        }
        a4.d dVar = cVar2.f95d;
        int iB = y3.e.b(cVar2.f96e);
        if (iB == 1) {
            return dVar.f107d.f1572h;
        }
        if (iB == 2) {
            return dVar.f109e.f1572h;
        }
        if (iB == 3) {
            return dVar.f107d.f1573i;
        }
        if (iB == 4) {
            return dVar.f109e.f1573i;
        }
        if (iB != 5) {
            return null;
        }
        return dVar.f109e.f1557k;
    }

    public static f i(a4.c cVar, int i10) {
        a4.c cVar2 = cVar.f97f;
        if (cVar2 == null) {
            return null;
        }
        a4.d dVar = cVar2.f95d;
        o oVar = i10 == 0 ? dVar.f107d : dVar.f109e;
        int iB = y3.e.b(cVar2.f96e);
        if (iB == 1 || iB == 2) {
            return oVar.f1572h;
        }
        if (iB == 3 || iB == 4) {
            return oVar.f1573i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f1551l.add(fVar2);
        fVar.f1551l.add(this.f1569e);
        fVar.f1548h = i10;
        fVar.f1549i = gVar;
        fVar2.f1550k.add(fVar);
        gVar.f1550k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        if (i11 == 0) {
            a4.d dVar = this.f1566b;
            int i12 = dVar.f135u;
            int iMax = Math.max(dVar.f134t, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax != i10) {
                return iMax;
            }
        } else {
            a4.d dVar2 = this.f1566b;
            int i13 = dVar2.f138x;
            int iMax2 = Math.max(dVar2.f137w, i10);
            if (i13 > 0) {
                iMax2 = Math.min(i13, i10);
            }
            if (iMax2 != i10) {
                return iMax2;
            }
        }
        return i10;
    }

    public long j() {
        if (this.f1569e.j) {
            return r0.f1547g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(a4.c r12, a4.c r13, int r14) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.o.l(a4.c, a4.c, int):void");
    }
}
