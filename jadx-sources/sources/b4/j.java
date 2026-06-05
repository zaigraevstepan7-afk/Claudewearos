package b4;

import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j extends o {
    @Override // b4.d
    public final void a(d dVar) {
        a4.a aVar = (a4.a) this.f1566b;
        int i10 = aVar.f72r0;
        f fVar = this.f1572h;
        ArrayList arrayList = fVar.f1551l;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = -1;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            int i14 = ((f) obj).f1547g;
            if (i12 == -1 || i14 < i12) {
                i12 = i14;
            }
            if (i11 < i14) {
                i11 = i14;
            }
        }
        if (i10 == 0 || i10 == 2) {
            fVar.d(i12 + aVar.f74t0);
        } else {
            fVar.d(i11 + aVar.f74t0);
        }
    }

    @Override // b4.o
    public final void d() {
        a4.d dVar = this.f1566b;
        if (dVar instanceof a4.a) {
            f fVar = this.f1572h;
            fVar.f1542b = true;
            ArrayList arrayList = fVar.f1551l;
            a4.a aVar = (a4.a) dVar;
            int i10 = aVar.f72r0;
            boolean z2 = aVar.f73s0;
            int i11 = 0;
            if (i10 == 0) {
                fVar.f1545e = 4;
                while (i11 < aVar.f177q0) {
                    a4.d dVar2 = aVar.f176p0[i11];
                    if (z2 || dVar2.f112f0 != 8) {
                        f fVar2 = dVar2.f107d.f1572h;
                        fVar2.f1550k.add(fVar);
                        arrayList.add(fVar2);
                    }
                    i11++;
                }
                m(this.f1566b.f107d.f1572h);
                m(this.f1566b.f107d.f1573i);
                return;
            }
            if (i10 == 1) {
                fVar.f1545e = 5;
                while (i11 < aVar.f177q0) {
                    a4.d dVar3 = aVar.f176p0[i11];
                    if (z2 || dVar3.f112f0 != 8) {
                        f fVar3 = dVar3.f107d.f1573i;
                        fVar3.f1550k.add(fVar);
                        arrayList.add(fVar3);
                    }
                    i11++;
                }
                m(this.f1566b.f107d.f1572h);
                m(this.f1566b.f107d.f1573i);
                return;
            }
            if (i10 == 2) {
                fVar.f1545e = 6;
                while (i11 < aVar.f177q0) {
                    a4.d dVar4 = aVar.f176p0[i11];
                    if (z2 || dVar4.f112f0 != 8) {
                        f fVar4 = dVar4.f109e.f1572h;
                        fVar4.f1550k.add(fVar);
                        arrayList.add(fVar4);
                    }
                    i11++;
                }
                m(this.f1566b.f109e.f1572h);
                m(this.f1566b.f109e.f1573i);
                return;
            }
            if (i10 != 3) {
                return;
            }
            fVar.f1545e = 7;
            while (i11 < aVar.f177q0) {
                a4.d dVar5 = aVar.f176p0[i11];
                if (z2 || dVar5.f112f0 != 8) {
                    f fVar5 = dVar5.f109e.f1573i;
                    fVar5.f1550k.add(fVar);
                    arrayList.add(fVar5);
                }
                i11++;
            }
            m(this.f1566b.f109e.f1572h);
            m(this.f1566b.f109e.f1573i);
        }
    }

    @Override // b4.o
    public final void e() {
        a4.d dVar = this.f1566b;
        if (dVar instanceof a4.a) {
            int i10 = ((a4.a) dVar).f72r0;
            f fVar = this.f1572h;
            if (i10 == 0 || i10 == 1) {
                dVar.X = fVar.f1547g;
            } else {
                dVar.Y = fVar.f1547g;
            }
        }
    }

    @Override // b4.o
    public final void f() {
        this.f1567c = null;
        this.f1572h.c();
    }

    @Override // b4.o
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f1572h;
        fVar2.f1550k.add(fVar);
        fVar.f1551l.add(fVar2);
    }
}
