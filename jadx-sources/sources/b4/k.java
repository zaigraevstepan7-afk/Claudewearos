package b4;

import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k extends o {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f1554k = new int[2];

    public static void m(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // b4.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(b4.d r24) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.k.a(b4.d):void");
    }

    @Override // b4.o
    public final void d() {
        a4.d dVar;
        a4.d dVar2;
        int i10;
        a4.d dVar3;
        a4.d dVar4;
        int i11;
        a4.d dVar5 = this.f1566b;
        boolean z2 = dVar5.f101a;
        g gVar = this.f1569e;
        if (z2) {
            gVar.d(dVar5.n());
        }
        boolean z10 = gVar.j;
        ArrayList arrayList = gVar.f1550k;
        ArrayList arrayList2 = gVar.f1551l;
        f fVar = this.f1573i;
        f fVar2 = this.f1572h;
        if (!z10) {
            a4.d dVar6 = this.f1566b;
            int i12 = dVar6.f129o0[0];
            this.f1568d = i12;
            if (i12 != 3) {
                if (i12 == 4 && (dVar4 = dVar6.S) != null && ((i11 = dVar4.f129o0[0]) == 1 || i11 == 4)) {
                    int iN = (dVar4.n() - this.f1566b.H.e()) - this.f1566b.J.e();
                    o.b(fVar2, dVar4.f107d.f1572h, this.f1566b.H.e());
                    o.b(fVar, dVar4.f107d.f1573i, -this.f1566b.J.e());
                    gVar.d(iN);
                    return;
                }
                if (i12 == 1) {
                    gVar.d(dVar6.n());
                }
            }
        } else if (this.f1568d == 4 && (dVar2 = (dVar = this.f1566b).S) != null && ((i10 = dVar2.f129o0[0]) == 1 || i10 == 4)) {
            o.b(fVar2, dVar2.f107d.f1572h, dVar.H.e());
            o.b(fVar, dVar2.f107d.f1573i, -this.f1566b.J.e());
            return;
        }
        if (gVar.j) {
            a4.d dVar7 = this.f1566b;
            if (dVar7.f101a) {
                a4.c[] cVarArr = dVar7.P;
                a4.c cVar = cVarArr[0];
                a4.c cVar2 = cVar.f97f;
                if (cVar2 != null && cVarArr[1].f97f != null) {
                    if (dVar7.u()) {
                        fVar2.f1546f = this.f1566b.P[0].e();
                        fVar.f1546f = -this.f1566b.P[1].e();
                        return;
                    }
                    f fVarH = o.h(this.f1566b.P[0]);
                    if (fVarH != null) {
                        o.b(fVar2, fVarH, this.f1566b.P[0].e());
                    }
                    f fVarH2 = o.h(this.f1566b.P[1]);
                    if (fVarH2 != null) {
                        o.b(fVar, fVarH2, -this.f1566b.P[1].e());
                    }
                    fVar2.f1542b = true;
                    fVar.f1542b = true;
                    return;
                }
                if (cVar2 != null) {
                    f fVarH3 = o.h(cVar);
                    if (fVarH3 != null) {
                        o.b(fVar2, fVarH3, this.f1566b.P[0].e());
                        o.b(fVar, fVar2, gVar.f1547g);
                        return;
                    }
                    return;
                }
                a4.c cVar3 = cVarArr[1];
                if (cVar3.f97f != null) {
                    f fVarH4 = o.h(cVar3);
                    if (fVarH4 != null) {
                        o.b(fVar, fVarH4, -this.f1566b.P[1].e());
                        o.b(fVar2, fVar, -gVar.f1547g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof a4.i) || dVar7.S == null || dVar7.i(7).f97f != null) {
                    return;
                }
                a4.d dVar8 = this.f1566b;
                o.b(fVar2, dVar8.S.f107d.f1572h, dVar8.o());
                o.b(fVar, fVar2, gVar.f1547g);
                return;
            }
        }
        if (this.f1568d == 3) {
            a4.d dVar9 = this.f1566b;
            int i13 = dVar9.f131q;
            if (i13 == 2) {
                a4.d dVar10 = dVar9.S;
                if (dVar10 != null) {
                    g gVar2 = dVar10.f109e.f1569e;
                    arrayList2.add(gVar2);
                    gVar2.f1550k.add(gVar);
                    gVar.f1542b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                }
            } else if (i13 == 3) {
                if (dVar9.f132r == 3) {
                    fVar2.f1541a = this;
                    fVar.f1541a = this;
                    m mVar = dVar9.f109e;
                    mVar.f1572h.f1541a = this;
                    mVar.f1573i.f1541a = this;
                    gVar.f1541a = this;
                    if (dVar9.v()) {
                        arrayList2.add(this.f1566b.f109e.f1569e);
                        this.f1566b.f109e.f1569e.f1550k.add(gVar);
                        m mVar2 = this.f1566b.f109e;
                        mVar2.f1569e.f1541a = this;
                        arrayList2.add(mVar2.f1572h);
                        arrayList2.add(this.f1566b.f109e.f1573i);
                        this.f1566b.f109e.f1572h.f1550k.add(gVar);
                        this.f1566b.f109e.f1573i.f1550k.add(gVar);
                    } else if (this.f1566b.u()) {
                        this.f1566b.f109e.f1569e.f1551l.add(gVar);
                        arrayList.add(this.f1566b.f109e.f1569e);
                    } else {
                        this.f1566b.f109e.f1569e.f1551l.add(gVar);
                    }
                } else {
                    g gVar3 = dVar9.f109e.f1569e;
                    arrayList2.add(gVar3);
                    gVar3.f1550k.add(gVar);
                    this.f1566b.f109e.f1572h.f1550k.add(gVar);
                    this.f1566b.f109e.f1573i.f1550k.add(gVar);
                    gVar.f1542b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                    fVar2.f1551l.add(gVar);
                    fVar.f1551l.add(gVar);
                }
            }
        }
        a4.d dVar11 = this.f1566b;
        a4.c[] cVarArr2 = dVar11.P;
        a4.c cVar4 = cVarArr2[0];
        a4.c cVar5 = cVar4.f97f;
        if (cVar5 != null && cVarArr2[1].f97f != null) {
            if (dVar11.u()) {
                fVar2.f1546f = this.f1566b.P[0].e();
                fVar.f1546f = -this.f1566b.P[1].e();
                return;
            }
            f fVarH5 = o.h(this.f1566b.P[0]);
            f fVarH6 = o.h(this.f1566b.P[1]);
            if (fVarH5 != null) {
                fVarH5.b(this);
            }
            if (fVarH6 != null) {
                fVarH6.b(this);
            }
            this.j = 4;
            return;
        }
        if (cVar5 != null) {
            f fVarH7 = o.h(cVar4);
            if (fVarH7 != null) {
                o.b(fVar2, fVarH7, this.f1566b.P[0].e());
                c(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        a4.c cVar6 = cVarArr2[1];
        if (cVar6.f97f != null) {
            f fVarH8 = o.h(cVar6);
            if (fVarH8 != null) {
                o.b(fVar, fVarH8, -this.f1566b.P[1].e());
                c(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if ((dVar11 instanceof a4.i) || (dVar3 = dVar11.S) == null) {
            return;
        }
        o.b(fVar2, dVar3.f107d.f1572h, dVar11.o());
        c(fVar, fVar2, 1, gVar);
    }

    @Override // b4.o
    public final void e() {
        f fVar = this.f1572h;
        if (fVar.j) {
            this.f1566b.X = fVar.f1547g;
        }
    }

    @Override // b4.o
    public final void f() {
        this.f1567c = null;
        this.f1572h.c();
        this.f1573i.c();
        this.f1569e.c();
        this.f1571g = false;
    }

    @Override // b4.o
    public final boolean k() {
        return this.f1568d != 3 || this.f1566b.f131q == 0;
    }

    public final void n() {
        this.f1571g = false;
        f fVar = this.f1572h;
        fVar.c();
        fVar.j = false;
        f fVar2 = this.f1573i;
        fVar2.c();
        fVar2.j = false;
        this.f1569e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f1566b.f114g0;
    }
}
