package x;

import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e2 extends m0 implements n2.e, v2.z1 {

    /* renamed from: c0, reason: collision with root package name */
    public v.i f19505c0;

    /* renamed from: d0, reason: collision with root package name */
    public s0 f19506d0;

    /* renamed from: e0, reason: collision with root package name */
    public final o2.d f19507e0;

    /* renamed from: f0, reason: collision with root package name */
    public final m f19508f0;

    /* renamed from: g0, reason: collision with root package name */
    public final l2 f19509g0;

    /* renamed from: h0, reason: collision with root package name */
    public final a2 f19510h0;

    /* renamed from: i0, reason: collision with root package name */
    public final a2.e0 f19511i0;

    /* renamed from: j0, reason: collision with root package name */
    public final i f19512j0;

    /* renamed from: k0, reason: collision with root package name */
    public uj.r f19513k0;

    /* renamed from: l0, reason: collision with root package name */
    public d2 f19514l0;

    /* renamed from: m0, reason: collision with root package name */
    public k1 f19515m0;

    /* renamed from: n0, reason: collision with root package name */
    public a3 f19516n0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [v2.k, x.e2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [x.s0] */
    public e2(v.i iVar, d dVar, s0 s0Var, o1 o1Var, f2 f2Var, z.k kVar, boolean z2, boolean z10) {
        super(y1.f19761a, z2, kVar, o1Var);
        this.f19505c0 = iVar;
        this.f19506d0 = s0Var;
        o2.d dVar2 = new o2.d();
        this.f19507e0 = dVar2;
        m mVar = new m(new t.u(new ld.i(y1.f19764d)));
        this.f19508f0 = mVar;
        v.i iVar2 = this.f19505c0;
        ?? r12 = this.f19506d0;
        l2 l2Var = new l2(f2Var, iVar2, r12 == 0 ? mVar : r12, o1Var, z10, dVar2, this, new b2(this, 0));
        this.f19509g0 = l2Var;
        a2 a2Var = new a2(l2Var, z2);
        this.f19510h0 = a2Var;
        a2.e0 e0Var = new a2.e0(2, null, 10);
        q1(e0Var);
        this.f19511i0 = e0Var;
        i iVar3 = new i(o1Var, l2Var, z10, dVar, new b2(this, 1));
        q1(iVar3);
        this.f19512j0 = iVar3;
        q1(new o2.i(a2Var, dVar2));
        h0.h hVar = new h0.h();
        hVar.H = iVar3;
        q1(hVar);
    }

    @Override // n2.e
    public final boolean A(KeyEvent keyEvent) {
        return false;
    }

    @Override // x.m0
    public final void D1(w wVar) {
        qj.b0.w(this.f19507e0.c(), null, new t0.f(wVar, this, null, 22), 3);
    }

    @Override // x.m0
    public final boolean I1() {
        l2 l2Var = this.f19509g0;
        if (l2Var.f19613a.a()) {
            return true;
        }
        v.i iVar = l2Var.f19614b;
        if (iVar == null) {
            return false;
        }
        v.h0 h0Var = iVar.f17219c;
        EdgeEffect edgeEffect = h0Var.f17208d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? v.l.b(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = h0Var.f17209e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? v.l.b(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = h0Var.f17210f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? v.l.b(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = h0Var.f17211g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? v.l.b(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    public final void L1(v.i iVar, d dVar, s0 s0Var, o1 o1Var, f2 f2Var, z.k kVar, boolean z2, boolean z10) {
        boolean z11;
        boolean z12 = true;
        boolean z13 = false;
        if (this.L != z2) {
            this.f19510h0.f19444b = z2;
            z11 = true;
        } else {
            z11 = false;
        }
        s0 s0Var2 = s0Var == null ? this.f19508f0 : s0Var;
        l2 l2Var = this.f19509g0;
        if (!fj.l.b(l2Var.f19613a, f2Var)) {
            l2Var.f19613a = f2Var;
            z13 = true;
        }
        l2Var.f19614b = iVar;
        if (l2Var.f19616d != o1Var) {
            l2Var.f19616d = o1Var;
            z13 = true;
        }
        if (l2Var.f19617e != z10) {
            l2Var.f19617e = z10;
        } else {
            z12 = z13;
        }
        l2Var.f19615c = s0Var2;
        l2Var.f19618f = this.f19507e0;
        i iVar2 = this.f19512j0;
        iVar2.H = o1Var;
        iVar2.J = z10;
        iVar2.K = dVar;
        this.f19505c0 = iVar;
        this.f19506d0 = s0Var;
        ta.n nVar = y1.f19761a;
        o1 o1Var2 = l2Var.f19616d;
        o1 o1Var3 = o1.f19664a;
        if (o1Var2 != o1Var3) {
            o1Var3 = o1.f19665b;
        }
        K1(nVar, z2, kVar, o1Var3, z12);
        if (z11) {
            this.f19513k0 = null;
            this.f19514l0 = null;
            v2.n.o(this);
        }
    }

    @Override // n2.e
    public final boolean Q(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        if (!this.L) {
            return false;
        }
        if ((!n2.a.a(n2.d.b(keyEvent), n2.a.D) && !n2.a.a(n2.d.a(keyEvent.getKeyCode()), n2.a.C)) || n2.d.c(keyEvent) != 2 || keyEvent.isCtrlPressed()) {
            return false;
        }
        o1 o1Var = this.f19509g0.f19616d;
        o1 o1Var2 = o1.f19664a;
        i iVar = this.f19512j0;
        if (o1Var == o1Var2) {
            int iR1 = (int) (iVar.r1() & 4294967295L);
            float f10 = n2.a.a(n2.d.a(keyEvent.getKeyCode()), n2.a.C) ? iR1 : -iR1;
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            iFloatToRawIntBits = Float.floatToRawIntBits(f10);
        } else {
            int iR12 = (int) (iVar.r1() >> 32);
            jFloatToRawIntBits = Float.floatToRawIntBits(n2.a.a(n2.d.a(keyEvent.getKeyCode()), n2.a.C) ? iR12 : -iR12);
            iFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
        }
        qj.b0.w(e1(), null, new d2(this, (jFloatToRawIntBits << 32) | (iFloatToRawIntBits & 4294967295L), null, 0), 3);
        return true;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // x.m0, v2.w1
    public final void a0(p2.n nVar, p2.o oVar, long j) {
        int i10;
        int i11;
        ?? r10 = nVar.f12734a;
        int size = r10.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                break;
            }
            if (((Boolean) this.K.invoke(new p2.g0(((p2.w) r10.get(i12)).f12768i))).booleanValue()) {
                super.a0(nVar, oVar, j);
                break;
            }
            i12++;
        }
        if (this.N == null) {
            v.m0 m0Var = new v.m0(this);
            q1(m0Var);
            this.N = m0Var;
        }
        if (this.L) {
            p2.o oVar2 = p2.o.f12743a;
            ti.c cVar = null;
            l2 l2Var = this.f19509g0;
            if (oVar == oVar2 && nVar.f12739f == 6) {
                if (this.f19515m0 == null) {
                    this.f19515m0 = new k1(l2Var, new w5.a0(ViewConfiguration.get(v2.n.A(this).getContext())), new p1.d(2, this, e2.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 1), v2.n.y(this).R);
                }
                k1 k1Var = this.f19515m0;
                if (k1Var != null) {
                    qj.z zVarE1 = e1();
                    if (k1Var.f19593h == null) {
                        k1Var.f19593h = qj.b0.w(zVarE1, null, new t0.f(k1Var, cVar, 19), 3);
                    }
                }
            }
            k1 k1Var2 = this.f19515m0;
            if (k1Var2 != null && nVar.f12739f == 6) {
                int size2 = r10.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size2) {
                        if (oVar == p2.o.f12743a && k1Var2.f19654d) {
                            k1Var2.f(nVar);
                            n1.a(nVar);
                        }
                        if (oVar == p2.o.f12744b && !k1Var2.f19654d && k1Var2.f(nVar)) {
                            n1.a(nVar);
                        }
                    } else if (((p2.w) r10.get(i13)).b()) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            if (oVar == p2.o.f12743a && ((i11 = nVar.f12739f) == 10 || i11 == 11 || i11 == 12)) {
                if (this.f19516n0 == null) {
                    i10 = 10;
                    this.f19516n0 = new a3(l2Var, new p1.d(2, this, e2.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4, 2), v2.n.y(this).R);
                } else {
                    i10 = 10;
                }
                a3 a3Var = this.f19516n0;
                if (a3Var != null) {
                    qj.z zVarE12 = e1();
                    if (a3Var.f19446g == null) {
                        a3Var.f19446g = qj.b0.w(zVarE12, null, new ab.q(a3Var, null), 3);
                    }
                }
            } else {
                i10 = 10;
            }
            a3 a3Var2 = this.f19516n0;
            if (a3Var2 != null) {
                int i14 = nVar.f12739f;
                if (i14 == i10 || i14 == 11 || i14 == 12) {
                    int size3 = r10.size();
                    for (int i15 = 0; i15 < size3; i15++) {
                        if (((p2.w) r10.get(i15)).b()) {
                            return;
                        }
                    }
                    if (oVar == p2.o.f12743a && a3Var2.f19654d) {
                        a3Var2.d(nVar);
                        n1.a(nVar);
                    }
                    if (oVar == p2.o.f12744b && !a3Var2.f19654d && a3Var2.d(nVar)) {
                        n1.a(nVar);
                    }
                }
            }
        }
    }

    @Override // v1.n
    public final boolean f1() {
        return false;
    }

    @Override // v1.n
    public final void i1() {
        if (this.G) {
            s3.c cVar = v2.n.y(this).R;
            m mVar = this.f19508f0;
            mVar.getClass();
            mVar.f19625a = new t.u(new ld.i(cVar));
        }
        k1 k1Var = this.f19515m0;
        if (k1Var != null) {
            k1Var.f19653c = v2.n.y(this).R;
        }
        a3 a3Var = this.f19516n0;
        if (a3Var != null) {
            a3Var.f19653c = v2.n.y(this).R;
        }
    }

    @Override // v2.j
    public final void l() {
        V();
        if (this.G) {
            s3.c cVar = v2.n.y(this).R;
            m mVar = this.f19508f0;
            mVar.getClass();
            mVar.f19625a = new t.u(new ld.i(cVar));
        }
        k1 k1Var = this.f19515m0;
        if (k1Var != null) {
            k1Var.f19653c = v2.n.y(this).R;
        }
        a3 a3Var = this.f19516n0;
        if (a3Var != null) {
            a3Var.f19653c = v2.n.y(this).R;
        }
    }

    @Override // v2.z1
    public final void u0(d3.z zVar) {
        if (this.L && (this.f19513k0 == null || this.f19514l0 == null)) {
            this.f19513k0 = new uj.r(this, 3);
            this.f19514l0 = new d2(this, null);
        }
        uj.r rVar = this.f19513k0;
        if (rVar != null) {
            lj.d[] dVarArr = d3.x.f4803a;
            zVar.b(d3.m.f4736d, new d3.a(null, rVar));
        }
        d2 d2Var = this.f19514l0;
        if (d2Var != null) {
            lj.d[] dVarArr2 = d3.x.f4803a;
            zVar.b(d3.m.f4737e, d2Var);
        }
    }

    @Override // x.m0
    public final Object x1(l0 l0Var, l0 l0Var2) {
        v.f1 f1Var = v.f1.f17190b;
        l2 l2Var = this.f19509g0;
        Object objF = l2Var.f(f1Var, new w6.z(l0Var, l2Var, null, 6), l0Var2);
        return objF == ui.a.f17085a ? objF : pi.o.f13011a;
    }

    @Override // x.m0
    public final void C1(long j) {
    }
}
