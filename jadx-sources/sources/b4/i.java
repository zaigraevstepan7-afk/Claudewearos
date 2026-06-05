package b4;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i extends o {
    @Override // b4.d
    public final void a(d dVar) {
        f fVar = this.f1572h;
        if (fVar.f1543c && !fVar.j) {
            fVar.d((int) ((((f) fVar.f1551l.get(0)).f1547g * ((a4.h) this.f1566b).f170p0) + 0.5f));
        }
    }

    @Override // b4.o
    public final void d() {
        a4.d dVar = this.f1566b;
        a4.h hVar = (a4.h) dVar;
        int i10 = hVar.f171q0;
        int i11 = hVar.f172r0;
        int i12 = hVar.f174t0;
        f fVar = this.f1572h;
        if (i12 == 1) {
            if (i10 != -1) {
                fVar.f1551l.add(dVar.S.f107d.f1572h);
                this.f1566b.S.f107d.f1572h.f1550k.add(fVar);
                fVar.f1546f = i10;
            } else if (i11 != -1) {
                fVar.f1551l.add(dVar.S.f107d.f1573i);
                this.f1566b.S.f107d.f1573i.f1550k.add(fVar);
                fVar.f1546f = -i11;
            } else {
                fVar.f1542b = true;
                fVar.f1551l.add(dVar.S.f107d.f1573i);
                this.f1566b.S.f107d.f1573i.f1550k.add(fVar);
            }
            m(this.f1566b.f107d.f1572h);
            m(this.f1566b.f107d.f1573i);
            return;
        }
        if (i10 != -1) {
            fVar.f1551l.add(dVar.S.f109e.f1572h);
            this.f1566b.S.f109e.f1572h.f1550k.add(fVar);
            fVar.f1546f = i10;
        } else if (i11 != -1) {
            fVar.f1551l.add(dVar.S.f109e.f1573i);
            this.f1566b.S.f109e.f1573i.f1550k.add(fVar);
            fVar.f1546f = -i11;
        } else {
            fVar.f1542b = true;
            fVar.f1551l.add(dVar.S.f109e.f1573i);
            this.f1566b.S.f109e.f1573i.f1550k.add(fVar);
        }
        m(this.f1566b.f109e.f1572h);
        m(this.f1566b.f109e.f1573i);
    }

    @Override // b4.o
    public final void e() {
        a4.d dVar = this.f1566b;
        int i10 = ((a4.h) dVar).f174t0;
        f fVar = this.f1572h;
        if (i10 == 1) {
            dVar.X = fVar.f1547g;
        } else {
            dVar.Y = fVar.f1547g;
        }
    }

    @Override // b4.o
    public final void f() {
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
