package b4;

import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m extends o {

    /* renamed from: k, reason: collision with root package name */
    public f f1557k;

    /* renamed from: l, reason: collision with root package name */
    public a f1558l;

    @Override // b4.d
    public final void a(d dVar) {
        float f10;
        float f11;
        float f12;
        int i10;
        if (y3.e.b(this.j) == 3) {
            a4.d dVar2 = this.f1566b;
            l(dVar2.I, dVar2.K, 1);
            return;
        }
        g gVar = this.f1569e;
        if (gVar.f1543c && !gVar.j && this.f1568d == 3) {
            a4.d dVar3 = this.f1566b;
            int i11 = dVar3.f132r;
            if (i11 == 2) {
                a4.d dVar4 = dVar3.S;
                if (dVar4 != null) {
                    if (dVar4.f109e.f1569e.j) {
                        gVar.d((int) ((r5.f1547g * dVar3.f139y) + 0.5f));
                    }
                }
            } else if (i11 == 3) {
                g gVar2 = dVar3.f107d.f1569e;
                if (gVar2.j) {
                    int i12 = dVar3.W;
                    if (i12 == -1) {
                        f10 = gVar2.f1547g;
                        f11 = dVar3.V;
                    } else if (i12 == 0) {
                        f12 = gVar2.f1547g * dVar3.V;
                        i10 = (int) (f12 + 0.5f);
                        gVar.d(i10);
                    } else if (i12 != 1) {
                        i10 = 0;
                        gVar.d(i10);
                    } else {
                        f10 = gVar2.f1547g;
                        f11 = dVar3.V;
                    }
                    f12 = f10 / f11;
                    i10 = (int) (f12 + 0.5f);
                    gVar.d(i10);
                }
            }
        }
        f fVar = this.f1572h;
        boolean z2 = fVar.f1543c;
        ArrayList arrayList = fVar.f1551l;
        if (z2) {
            f fVar2 = this.f1573i;
            boolean z10 = fVar2.f1543c;
            ArrayList arrayList2 = fVar2.f1551l;
            if (z10) {
                if (fVar.j && fVar2.j && gVar.j) {
                    return;
                }
                if (!gVar.j && this.f1568d == 3) {
                    a4.d dVar5 = this.f1566b;
                    if (dVar5.f131q == 0 && !dVar5.v()) {
                        f fVar3 = (f) arrayList.get(0);
                        f fVar4 = (f) arrayList2.get(0);
                        int i13 = fVar3.f1547g + fVar.f1546f;
                        int i14 = fVar4.f1547g + fVar2.f1546f;
                        fVar.d(i13);
                        fVar2.d(i14);
                        gVar.d(i14 - i13);
                        return;
                    }
                }
                if (!gVar.j && this.f1568d == 3 && this.f1565a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    f fVar5 = (f) arrayList.get(0);
                    int i15 = (((f) arrayList2.get(0)).f1547g + fVar2.f1546f) - (fVar5.f1547g + fVar.f1546f);
                    int i16 = gVar.f1552m;
                    if (i15 < i16) {
                        gVar.d(i15);
                    } else {
                        gVar.d(i16);
                    }
                }
                if (gVar.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    f fVar6 = (f) arrayList.get(0);
                    f fVar7 = (f) arrayList2.get(0);
                    int i17 = fVar6.f1547g;
                    int i18 = fVar.f1546f + i17;
                    int i19 = fVar7.f1547g;
                    int i20 = fVar2.f1546f + i19;
                    float f13 = this.f1566b.f108d0;
                    if (fVar6 == fVar7) {
                        f13 = 0.5f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    fVar.d((int) ((((i19 - i17) - gVar.f1547g) * f13) + i17 + 0.5f));
                    fVar2.d(fVar.f1547g + gVar.f1547g);
                }
            }
        }
    }

    @Override // b4.o
    public final void d() {
        a4.d dVar;
        a4.d dVar2;
        a4.d dVar3;
        a4.d dVar4;
        f fVar = this.f1557k;
        a4.d dVar5 = this.f1566b;
        boolean z2 = dVar5.f101a;
        g gVar = this.f1569e;
        if (z2) {
            gVar.d(dVar5.k());
        }
        boolean z10 = gVar.j;
        ArrayList arrayList = gVar.f1550k;
        ArrayList arrayList2 = gVar.f1551l;
        f fVar2 = this.f1573i;
        f fVar3 = this.f1572h;
        if (!z10) {
            a4.d dVar6 = this.f1566b;
            this.f1568d = dVar6.f129o0[1];
            if (dVar6.D) {
                this.f1558l = new a(this);
            }
            int i10 = this.f1568d;
            if (i10 != 3) {
                if (i10 == 4 && (dVar4 = this.f1566b.S) != null && dVar4.f129o0[1] == 1) {
                    int iK = (dVar4.k() - this.f1566b.I.e()) - this.f1566b.K.e();
                    o.b(fVar3, dVar4.f109e.f1572h, this.f1566b.I.e());
                    o.b(fVar2, dVar4.f109e.f1573i, -this.f1566b.K.e());
                    gVar.d(iK);
                    return;
                }
                if (i10 == 1) {
                    gVar.d(this.f1566b.k());
                }
            }
        } else if (this.f1568d == 4 && (dVar2 = (dVar = this.f1566b).S) != null && dVar2.f129o0[1] == 1) {
            o.b(fVar3, dVar2.f109e.f1572h, dVar.I.e());
            o.b(fVar2, dVar2.f109e.f1573i, -this.f1566b.K.e());
            return;
        }
        boolean z11 = gVar.j;
        if (z11) {
            a4.d dVar7 = this.f1566b;
            if (dVar7.f101a) {
                a4.c[] cVarArr = dVar7.P;
                a4.c cVar = cVarArr[2];
                a4.c cVar2 = cVar.f97f;
                if (cVar2 != null && cVarArr[3].f97f != null) {
                    if (dVar7.v()) {
                        fVar3.f1546f = this.f1566b.P[2].e();
                        fVar2.f1546f = -this.f1566b.P[3].e();
                    } else {
                        f fVarH = o.h(this.f1566b.P[2]);
                        if (fVarH != null) {
                            o.b(fVar3, fVarH, this.f1566b.P[2].e());
                        }
                        f fVarH2 = o.h(this.f1566b.P[3]);
                        if (fVarH2 != null) {
                            o.b(fVar2, fVarH2, -this.f1566b.P[3].e());
                        }
                        fVar3.f1542b = true;
                        fVar2.f1542b = true;
                    }
                    a4.d dVar8 = this.f1566b;
                    if (dVar8.D) {
                        o.b(fVar, fVar3, dVar8.Z);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    f fVarH3 = o.h(cVar);
                    if (fVarH3 != null) {
                        o.b(fVar3, fVarH3, this.f1566b.P[2].e());
                        o.b(fVar2, fVar3, gVar.f1547g);
                        a4.d dVar9 = this.f1566b;
                        if (dVar9.D) {
                            o.b(fVar, fVar3, dVar9.Z);
                            return;
                        }
                        return;
                    }
                    return;
                }
                a4.c cVar3 = cVarArr[3];
                if (cVar3.f97f != null) {
                    f fVarH4 = o.h(cVar3);
                    if (fVarH4 != null) {
                        o.b(fVar2, fVarH4, -this.f1566b.P[3].e());
                        o.b(fVar3, fVar2, -gVar.f1547g);
                    }
                    a4.d dVar10 = this.f1566b;
                    if (dVar10.D) {
                        o.b(fVar, fVar3, dVar10.Z);
                        return;
                    }
                    return;
                }
                a4.c cVar4 = cVarArr[4];
                if (cVar4.f97f != null) {
                    f fVarH5 = o.h(cVar4);
                    if (fVarH5 != null) {
                        o.b(fVar, fVarH5, 0);
                        o.b(fVar3, fVar, -this.f1566b.Z);
                        o.b(fVar2, fVar3, gVar.f1547g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof a4.i) || dVar7.S == null || dVar7.i(7).f97f != null) {
                    return;
                }
                a4.d dVar11 = this.f1566b;
                o.b(fVar3, dVar11.S.f109e.f1572h, dVar11.p());
                o.b(fVar2, fVar3, gVar.f1547g);
                a4.d dVar12 = this.f1566b;
                if (dVar12.D) {
                    o.b(fVar, fVar3, dVar12.Z);
                    return;
                }
                return;
            }
        }
        if (z11 || this.f1568d != 3) {
            gVar.b(this);
        } else {
            a4.d dVar13 = this.f1566b;
            int i11 = dVar13.f132r;
            if (i11 == 2) {
                a4.d dVar14 = dVar13.S;
                if (dVar14 != null) {
                    g gVar2 = dVar14.f109e.f1569e;
                    arrayList2.add(gVar2);
                    gVar2.f1550k.add(gVar);
                    gVar.f1542b = true;
                    arrayList.add(fVar3);
                    arrayList.add(fVar2);
                }
            } else if (i11 == 3 && !dVar13.v()) {
                a4.d dVar15 = this.f1566b;
                if (dVar15.f131q != 3) {
                    g gVar3 = dVar15.f107d.f1569e;
                    arrayList2.add(gVar3);
                    gVar3.f1550k.add(gVar);
                    gVar.f1542b = true;
                    arrayList.add(fVar3);
                    arrayList.add(fVar2);
                }
            }
        }
        a4.d dVar16 = this.f1566b;
        a4.c[] cVarArr2 = dVar16.P;
        a4.c cVar5 = cVarArr2[2];
        a4.c cVar6 = cVar5.f97f;
        if (cVar6 != null && cVarArr2[3].f97f != null) {
            if (dVar16.v()) {
                fVar3.f1546f = this.f1566b.P[2].e();
                fVar2.f1546f = -this.f1566b.P[3].e();
            } else {
                f fVarH6 = o.h(this.f1566b.P[2]);
                f fVarH7 = o.h(this.f1566b.P[3]);
                if (fVarH6 != null) {
                    fVarH6.b(this);
                }
                if (fVarH7 != null) {
                    fVarH7.b(this);
                }
                this.j = 4;
            }
            if (this.f1566b.D) {
                c(fVar, fVar3, 1, this.f1558l);
            }
        } else if (cVar6 != null) {
            f fVarH8 = o.h(cVar5);
            if (fVarH8 != null) {
                o.b(fVar3, fVarH8, this.f1566b.P[2].e());
                c(fVar2, fVar3, 1, gVar);
                if (this.f1566b.D) {
                    c(fVar, fVar3, 1, this.f1558l);
                }
                if (this.f1568d == 3) {
                    a4.d dVar17 = this.f1566b;
                    if (dVar17.V > 0.0f) {
                        k kVar = dVar17.f107d;
                        if (kVar.f1568d == 3) {
                            kVar.f1569e.f1550k.add(gVar);
                            arrayList2.add(this.f1566b.f107d.f1569e);
                            gVar.f1541a = this;
                        }
                    }
                }
            }
        } else {
            a4.c cVar7 = cVarArr2[3];
            if (cVar7.f97f != null) {
                f fVarH9 = o.h(cVar7);
                if (fVarH9 != null) {
                    o.b(fVar2, fVarH9, -this.f1566b.P[3].e());
                    c(fVar3, fVar2, -1, gVar);
                    if (this.f1566b.D) {
                        c(fVar, fVar3, 1, this.f1558l);
                    }
                }
            } else {
                a4.c cVar8 = cVarArr2[4];
                if (cVar8.f97f != null) {
                    f fVarH10 = o.h(cVar8);
                    if (fVarH10 != null) {
                        o.b(fVar, fVarH10, 0);
                        c(fVar3, fVar, -1, this.f1558l);
                        c(fVar2, fVar3, 1, gVar);
                    }
                } else if (!(dVar16 instanceof a4.i) && (dVar3 = dVar16.S) != null) {
                    o.b(fVar3, dVar3.f109e.f1572h, dVar16.p());
                    c(fVar2, fVar3, 1, gVar);
                    if (this.f1566b.D) {
                        c(fVar, fVar3, 1, this.f1558l);
                    }
                    if (this.f1568d == 3) {
                        a4.d dVar18 = this.f1566b;
                        if (dVar18.V > 0.0f) {
                            k kVar2 = dVar18.f107d;
                            if (kVar2.f1568d == 3) {
                                kVar2.f1569e.f1550k.add(gVar);
                                arrayList2.add(this.f1566b.f107d.f1569e);
                                gVar.f1541a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            gVar.f1543c = true;
        }
    }

    @Override // b4.o
    public final void e() {
        f fVar = this.f1572h;
        if (fVar.j) {
            this.f1566b.Y = fVar.f1547g;
        }
    }

    @Override // b4.o
    public final void f() {
        this.f1567c = null;
        this.f1572h.c();
        this.f1573i.c();
        this.f1557k.c();
        this.f1569e.c();
        this.f1571g = false;
    }

    @Override // b4.o
    public final boolean k() {
        return this.f1568d != 3 || this.f1566b.f132r == 0;
    }

    public final void m() {
        this.f1571g = false;
        f fVar = this.f1572h;
        fVar.c();
        fVar.j = false;
        f fVar2 = this.f1573i;
        fVar2.c();
        fVar2.j = false;
        f fVar3 = this.f1557k;
        fVar3.c();
        fVar3.j = false;
        this.f1569e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f1566b.f114g0;
    }
}
