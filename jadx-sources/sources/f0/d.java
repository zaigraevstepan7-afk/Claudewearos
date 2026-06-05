package f0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends v1.n {
    public e3.d H;
    public final /* synthetic */ e I;

    public d(e eVar) {
        this.I = eVar;
    }

    @Override // v1.n
    public final void i1() {
        e eVar = this.I;
        eVar.f6129b = this;
        if (eVar.f6130c != null) {
            q1();
        }
    }

    @Override // v1.n
    public final void j1() {
        e eVar = this.I;
        if (eVar.f6129b == this) {
            eVar.f6129b = null;
        }
        e3.d dVar = this.H;
        if (dVar != null) {
            dVar.b();
        }
        this.H = null;
    }

    public final void q1() {
        b0.c1 c1Var = new b0.c1(15, this, this.I);
        v2.f0 f0VarY = v2.n.y(this);
        int i10 = f0VarY.f17624b;
        e3.b rectManager = ((w2.t) v2.i0.a(f0VarY)).getRectManager();
        e3.e eVar = rectManager.f5753c;
        eVar.getClass();
        q.v vVar = eVar.f5776a;
        e3.d dVar = new e3.d(eVar, i10, this, c1Var);
        Object objB = vVar.b(i10);
        if (objB == null) {
            vVar.i(i10, dVar);
            objB = dVar;
        }
        e3.d dVar2 = (e3.d) objB;
        if (dVar2 != dVar) {
            while (true) {
                e3.d dVar3 = dVar2.f5771d;
                if (dVar3 == null) {
                    break;
                } else {
                    dVar2 = dVar3;
                }
            }
            dVar2.f5771d = dVar;
        }
        if (v2.n.y(this.f17565a).f17638z) {
            rectManager.f5752b.k(i10, true);
        }
        rectManager.f5755e = true;
        rectManager.h();
        this.H = dVar;
    }
}
