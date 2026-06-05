package v2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class k extends v1.n {
    public final int H = j1.e(this);
    public v1.n I;

    @Override // v1.n
    public final void g1() {
        super.g1();
        for (v1.n nVar = this.I; nVar != null; nVar = nVar.f17570f) {
            nVar.p1(this.A);
            if (!nVar.G) {
                nVar.g1();
            }
        }
    }

    @Override // v1.n
    public final void h1() {
        for (v1.n nVar = this.I; nVar != null; nVar = nVar.f17570f) {
            nVar.h1();
        }
        super.h1();
    }

    @Override // v1.n
    public final void l1() {
        super.l1();
        for (v1.n nVar = this.I; nVar != null; nVar = nVar.f17570f) {
            nVar.l1();
        }
    }

    @Override // v1.n
    public final void m1() {
        for (v1.n nVar = this.I; nVar != null; nVar = nVar.f17570f) {
            nVar.m1();
        }
        super.m1();
    }

    @Override // v1.n
    public final void n1() {
        super.n1();
        for (v1.n nVar = this.I; nVar != null; nVar = nVar.f17570f) {
            nVar.n1();
        }
    }

    @Override // v1.n
    public final void o1(v1.n nVar) {
        this.f17565a = nVar;
        for (v1.n nVar2 = this.I; nVar2 != null; nVar2 = nVar2.f17570f) {
            nVar2.o1(nVar);
        }
    }

    @Override // v1.n
    public final void p1(i1 i1Var) {
        this.A = i1Var;
        for (v1.n nVar = this.I; nVar != null; nVar = nVar.f17570f) {
            nVar.p1(i1Var);
        }
    }

    public final j q1(j jVar) {
        v1.n nVar = ((v1.n) jVar).f17565a;
        if (nVar != jVar) {
            v1.n nVar2 = jVar instanceof v1.n ? (v1.n) jVar : null;
            v1.n nVar3 = nVar2 != null ? nVar2.f17569e : null;
            if (nVar != this.f17565a || !fj.l.b(nVar3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
        } else {
            if (nVar.G) {
                s2.a.b("Cannot delegate to an already attached node");
            }
            nVar.o1(this.f17565a);
            int i10 = this.f17567c;
            int iF = j1.f(nVar);
            nVar.f17567c = iF;
            int i11 = this.f17567c;
            int i12 = iF & 2;
            if (i12 != 0 && (i11 & 2) != 0 && !(this instanceof w)) {
                s2.a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + nVar);
            }
            nVar.f17570f = this.I;
            this.I = nVar;
            nVar.f17569e = this;
            s1(iF | this.f17567c, false);
            if (this.G) {
                if (i12 == 0 || (i10 & 2) != 0) {
                    p1(this.A);
                } else {
                    b1 b1Var = n.y(this).Y;
                    this.f17565a.p1(null);
                    b1Var.g();
                }
                nVar.g1();
                nVar.m1();
                if (!nVar.G) {
                    s2.a.b("autoInvalidateInsertedNode called on unattached node");
                }
                j1.a(nVar, -1, 1);
            }
        }
        return jVar;
    }

    public final void r1(j jVar) {
        v1.n nVar = null;
        for (v1.n nVar2 = this.I; nVar2 != null; nVar2 = nVar2.f17570f) {
            if (nVar2 == jVar) {
                boolean z2 = nVar2.G;
                if (z2) {
                    q.a0 a0Var = j1.f17705a;
                    if (!z2) {
                        s2.a.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    j1.a(nVar2, -1, 2);
                    nVar2.n1();
                    nVar2.h1();
                }
                nVar2.o1(nVar2);
                nVar2.f17568d = 0;
                if (nVar == null) {
                    this.I = nVar2.f17570f;
                } else {
                    nVar.f17570f = nVar2.f17570f;
                }
                nVar2.f17570f = null;
                nVar2.f17569e = null;
                int i10 = this.f17567c;
                int iF = j1.f(this);
                s1(iF, true);
                if (this.G && (i10 & 2) != 0 && (iF & 2) == 0) {
                    b1 b1Var = n.y(this).Y;
                    this.f17565a.p1(null);
                    b1Var.g();
                    return;
                }
                return;
            }
            nVar = nVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + jVar).toString());
    }

    public final void s1(int i10, boolean z2) {
        v1.n nVar;
        int i11 = this.f17567c;
        this.f17567c = i10;
        if (i11 != i10) {
            v1.n nVar2 = this.f17565a;
            if (nVar2 == this) {
                this.f17568d = i10;
            }
            if (this.G) {
                v1.n nVar3 = this;
                while (nVar3 != null) {
                    i10 |= nVar3.f17567c;
                    nVar3.f17567c = i10;
                    if (nVar3 == nVar2) {
                        break;
                    } else {
                        nVar3 = nVar3.f17569e;
                    }
                }
                if (z2 && nVar3 == nVar2) {
                    i10 = j1.f(nVar2);
                    nVar2.f17567c = i10;
                }
                int i12 = i10 | ((nVar3 == null || (nVar = nVar3.f17570f) == null) ? 0 : nVar.f17568d);
                while (nVar3 != null) {
                    i12 |= nVar3.f17567c;
                    nVar3.f17568d = i12;
                    nVar3 = nVar3.f17569e;
                }
            }
        }
    }
}
