package b4;

import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends o {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f1530k;

    /* renamed from: l, reason: collision with root package name */
    public int f1531l;

    public c(a4.d dVar, int i10) {
        a4.d dVar2;
        super(dVar);
        ArrayList arrayList = new ArrayList();
        this.f1530k = arrayList;
        this.f1570f = i10;
        a4.d dVar3 = this.f1566b;
        a4.d dVarM = dVar3.m(i10);
        while (true) {
            dVar2 = dVar3;
            dVar3 = dVarM;
            if (dVar3 == null) {
                break;
            } else {
                dVarM = dVar3.m(this.f1570f);
            }
        }
        this.f1566b = dVar2;
        int i11 = this.f1570f;
        arrayList.add(i11 == 0 ? dVar2.f107d : i11 == 1 ? dVar2.f109e : null);
        a4.d dVarL = dVar2.l(this.f1570f);
        while (dVarL != null) {
            int i12 = this.f1570f;
            arrayList.add(i12 == 0 ? dVarL.f107d : i12 == 1 ? dVarL.f109e : null);
            dVarL = dVarL.l(this.f1570f);
        }
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            o oVar = (o) obj;
            int i14 = this.f1570f;
            if (i14 == 0) {
                oVar.f1566b.f103b = this;
            } else if (i14 == 1) {
                oVar.f1566b.f105c = this;
            }
        }
        if (this.f1570f == 0 && ((a4.e) this.f1566b.S).f146u0 && arrayList.size() > 1) {
            this.f1566b = ((o) arrayList.get(arrayList.size() - 1)).f1566b;
        }
        this.f1531l = this.f1570f == 0 ? this.f1566b.f116h0 : this.f1566b.f118i0;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // b4.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(b4.d r28) {
        /*
            Method dump skipped, instructions count: 945
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.c.a(b4.d):void");
    }

    @Override // b4.o
    public final void d() {
        ArrayList arrayList = this.f1530k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((o) obj).d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        a4.d dVar = ((o) arrayList.get(0)).f1566b;
        a4.d dVar2 = ((o) arrayList.get(size2 - 1)).f1566b;
        int i11 = this.f1570f;
        f fVar = this.f1573i;
        f fVar2 = this.f1572h;
        if (i11 == 0) {
            a4.c cVar = dVar.H;
            a4.c cVar2 = dVar2.J;
            f fVarI = o.i(cVar, 0);
            int iE = cVar.e();
            a4.d dVarM = m();
            if (dVarM != null) {
                iE = dVarM.H.e();
            }
            if (fVarI != null) {
                o.b(fVar2, fVarI, iE);
            }
            f fVarI2 = o.i(cVar2, 0);
            int iE2 = cVar2.e();
            a4.d dVarN = n();
            if (dVarN != null) {
                iE2 = dVarN.J.e();
            }
            if (fVarI2 != null) {
                o.b(fVar, fVarI2, -iE2);
            }
        } else {
            a4.c cVar3 = dVar.I;
            a4.c cVar4 = dVar2.K;
            f fVarI3 = o.i(cVar3, 1);
            int iE3 = cVar3.e();
            a4.d dVarM2 = m();
            if (dVarM2 != null) {
                iE3 = dVarM2.I.e();
            }
            if (fVarI3 != null) {
                o.b(fVar2, fVarI3, iE3);
            }
            f fVarI4 = o.i(cVar4, 1);
            int iE4 = cVar4.e();
            a4.d dVarN2 = n();
            if (dVarN2 != null) {
                iE4 = dVarN2.K.e();
            }
            if (fVarI4 != null) {
                o.b(fVar, fVarI4, -iE4);
            }
        }
        fVar2.f1541a = this;
        fVar.f1541a = this;
    }

    @Override // b4.o
    public final void e() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f1530k;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((o) arrayList.get(i10)).e();
            i10++;
        }
    }

    @Override // b4.o
    public final void f() {
        this.f1567c = null;
        ArrayList arrayList = this.f1530k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((o) obj).f();
        }
    }

    @Override // b4.o
    public final long j() {
        ArrayList arrayList = this.f1530k;
        int size = arrayList.size();
        long j = 0;
        for (int i10 = 0; i10 < size; i10++) {
            j = r5.f1573i.f1546f + ((o) arrayList.get(i10)).j() + j + r5.f1572h.f1546f;
        }
        return j;
    }

    @Override // b4.o
    public final boolean k() {
        ArrayList arrayList = this.f1530k;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((o) arrayList.get(i10)).k()) {
                return false;
            }
        }
        return true;
    }

    public final a4.d m() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f1530k;
            if (i10 >= arrayList.size()) {
                return null;
            }
            a4.d dVar = ((o) arrayList.get(i10)).f1566b;
            if (dVar.f112f0 != 8) {
                return dVar;
            }
            i10++;
        }
    }

    public final a4.d n() {
        ArrayList arrayList = this.f1530k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a4.d dVar = ((o) arrayList.get(size)).f1566b;
            if (dVar.f112f0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f1570f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.f1530k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            sb2.append("<");
            sb2.append((o) obj);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
