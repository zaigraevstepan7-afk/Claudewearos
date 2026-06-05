package v2;

import android.os.SystemClock;
import android.view.MotionEvent;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends v1.n implements w, m, z1, w1, u2.d, u1, v, o, a2.g, a2.v, a2.y, s1, z1.b {
    public v1.m H;

    @Override // v2.w
    public final int C(n0 n0Var, t2.p0 p0Var, int i10) {
        v1.m mVar = this.H;
        fj.l.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((t2.b0) mVar).r(new t2.v(n0Var, n0Var.getLayoutDirection()), new t2.j(p0Var, t2.t0.f15638a, t2.u0.f15648b, 1), s3.b.b(0, i10, 0, 0, 13)).getHeight();
    }

    @Override // a2.g
    public final void E(a2.b0 b0Var) {
        v1.m mVar = this.H;
        s2.a.b("onFocusEvent called on wrong node");
        mVar.getClass();
        throw new ClassCastException();
    }

    @Override // v2.s1
    public final boolean M() {
        return this.G;
    }

    @Override // v2.w1
    public final boolean M0() {
        v1.m mVar = this.H;
        fj.l.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((p2.d0) mVar).f12691e.getClass();
        return true;
    }

    @Override // v2.o
    public final void N0(i1 i1Var) {
        fj.l.d(this.H, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        throw new ClassCastException();
    }

    @Override // v2.w
    public final int O(n0 n0Var, t2.p0 p0Var, int i10) {
        v1.m mVar = this.H;
        fj.l.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((t2.b0) mVar).r(new t2.v(n0Var, n0Var.getLayoutDirection()), new t2.j(p0Var, t2.t0.f15639b, t2.u0.f15648b, 1), s3.b.b(0, i10, 0, 0, 13)).getHeight();
    }

    @Override // v2.m
    public final void O0(h0 h0Var) {
        v1.m mVar = this.H;
        fj.l.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        h0Var.f();
    }

    @Override // a2.v
    public final void P0(a2.s sVar) {
        v1.m mVar = this.H;
        s2.a.b("applyFocusProperties called on wrong node");
        mVar.getClass();
        throw new ClassCastException();
    }

    @Override // v2.w
    public final int R0(n0 n0Var, t2.p0 p0Var, int i10) {
        v1.m mVar = this.H;
        fj.l.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((t2.b0) mVar).r(new t2.v(n0Var, n0Var.getLayoutDirection()), new t2.j(p0Var, t2.t0.f15639b, t2.u0.f15647a, 1), s3.b.b(0, 0, 0, i10, 7)).getWidth();
    }

    @Override // v2.w1
    public final void V() {
        v1.m mVar = this.H;
        fj.l.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        wh.s sVar = ((p2.d0) mVar).f12691e;
        p2.b0 b0Var = (p2.b0) sVar.f19380b;
        p2.d0 d0Var = (p2.d0) sVar.f19382d;
        if (b0Var == p2.b0.f12670b) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            p2.c0 c0Var = new p2.c0(d0Var, 0);
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            c0Var.invoke(motionEventObtain);
            motionEventObtain.recycle();
            sVar.f19380b = p2.b0.f12669a;
            d0Var.f12690d = false;
            sVar.f19381c = null;
        }
    }

    @Override // z1.b
    public final long a() {
        return cg.b.S(n.v(this, 128).f15552c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // v2.w1
    public final void a0(p2.n nVar, p2.o oVar, long j) {
        boolean z2;
        boolean z10;
        boolean z11;
        v1.m mVar = this.H;
        fj.l.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        wh.s sVar = ((p2.d0) mVar).f12691e;
        p2.d0 d0Var = (p2.d0) sVar.f19382d;
        ?? r02 = nVar.f12734a;
        int size = r02.size();
        for (int i10 = 0; i10 < size; i10++) {
            p2.w wVar = (p2.w) r02.get(i10);
            if (p2.v.b(wVar) || p2.v.d(wVar)) {
                z2 = false;
                break;
            }
        }
        z2 = true;
        if (!z2) {
            z10 = false;
            break;
        }
        int size2 = r02.size();
        for (int i11 = 0; i11 < size2; i11++) {
            if (((p2.w) r02.get(i11)).b()) {
                z10 = false;
                break;
            }
        }
        z10 = true;
        if (d0Var.f12690d) {
            z11 = true;
        } else {
            int size3 = r02.size();
            int i12 = 0;
            while (true) {
                if (i12 < size3) {
                    p2.w wVar2 = (p2.w) r02.get(i12);
                    if (p2.v.b(wVar2) || p2.v.d(wVar2)) {
                        break;
                    } else {
                        i12++;
                    }
                } else if (z10) {
                    break;
                } else {
                    z11 = false;
                }
            }
            z11 = true;
        }
        if (((p2.b0) sVar.f19380b) != p2.b0.f12671c) {
            if (oVar == p2.o.f12743a && z11) {
                sVar.f19381c = nVar;
                sVar.h(nVar, !z2 || d0Var.f12690d);
            }
            if (oVar == p2.o.f12744b && z2 && nVar.equals((p2.n) sVar.f19381c) && d0Var.f12690d) {
                int size4 = r02.size();
                for (int i13 = 0; i13 < size4; i13++) {
                    ((p2.w) r02.get(i13)).a();
                }
            }
            if (oVar == p2.o.f12745c && !z11 && !nVar.equals((p2.n) sVar.f19381c)) {
                sVar.h(nVar, true);
            }
        }
        if (oVar == p2.o.f12745c) {
            int size5 = r02.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size5) {
                    sVar.f19380b = p2.b0.f12669a;
                    ((p2.d0) sVar.f19382d).f12690d = false;
                    sVar.f19381c = null;
                    break;
                } else if (!p2.v.d((p2.w) r02.get(i14))) {
                    break;
                } else {
                    i14++;
                }
            }
            if (nVar.equals((p2.n) sVar.f19381c) && z2) {
                int size6 = r02.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size6) {
                        break;
                    }
                    if (!((p2.w) r02.get(i15)).b()) {
                        i15++;
                    } else if (!d0Var.f12690d) {
                        sVar.r(nVar);
                        return;
                    }
                }
                int size7 = r02.size();
                for (int i16 = 0; i16 < size7; i16++) {
                    ((p2.w) r02.get(i16)).a();
                }
            }
        }
    }

    @Override // v2.w
    public final int b1(n0 n0Var, t2.p0 p0Var, int i10) {
        v1.m mVar = this.H;
        fj.l.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((t2.b0) mVar).r(new t2.v(n0Var, n0Var.getLayoutDirection()), new t2.j(p0Var, t2.t0.f15638a, t2.u0.f15647a, 1), s3.b.b(0, 0, 0, i10, 7)).getWidth();
    }

    @Override // v2.m
    public final void d0() {
        n.m(this);
    }

    @Override // z1.b
    public final s3.c e() {
        return n.y(this).R;
    }

    @Override // v2.w1
    public final void g0() {
        v1.m mVar = this.H;
        fj.l.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((p2.d0) mVar).f12691e.getClass();
    }

    @Override // z1.b
    public final s3.m getLayoutDirection() {
        return n.y(this).S;
    }

    @Override // v1.n
    public final void i1() {
        q1(true);
    }

    @Override // v1.n
    public final void j1() {
        if (!this.G) {
            s2.a.b("unInitializeModifier called on unattached node");
        }
        if ((this.f17567c & 8) != 0) {
            ((w2.t) n.z(this)).F();
        }
    }

    @Override // v2.j
    public final void l() {
        if (this.H instanceof p2.d0) {
            V();
        }
    }

    @Override // u2.d
    public final u2.a p0() {
        return u2.a.f16586a;
    }

    public final void q1(boolean z2) {
        if (!this.G) {
            s2.a.b("initializeModifier called on unattached node");
        }
        v1.m mVar = this.H;
        if ((this.f17567c & 4) != 0 && !z2) {
            n.v(this, 2).D1();
        }
        if ((this.f17567c & 2) != 0) {
            b2 b2Var = n.y(this).Y.f17585e;
            fj.l.d(b2Var, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
            if (b2Var.H) {
                i1 i1Var = this.A;
                fj.l.c(i1Var);
                ((y) i1Var).Y1(this);
                q1 q1Var = i1Var.f17688e0;
                if (q1Var != null) {
                    ((w2.l1) q1Var).invalidate();
                }
            }
            if (!z2) {
                n.v(this, 2).D1();
                n.y(this).D();
            }
        }
        if (mVar instanceof d0.s) {
            d0.s sVar = (d0.s) mVar;
            f0 f0VarY = n.y(this);
            switch (sVar.f4432b) {
                case 0:
                    ((d0.u) sVar.f4433c).f4449k = f0VarY;
                    break;
                case 1:
                    ((e0.v) sVar.f4433c).j = f0VarY;
                    break;
                default:
                    ((g0.h0) sVar.f4433c).f6912x.setValue(f0VarY);
                    break;
            }
        }
        int i10 = this.f17567c;
        if ((i10 & 16) != 0 && (mVar instanceof p2.d0)) {
            ((p2.d0) mVar).f12691e.f19379a = this.A;
        }
        if ((i10 & 8) != 0) {
            ((w2.t) n.z(this)).F();
        }
    }

    @Override // v2.w
    public final t2.r0 r(t2.s0 s0Var, t2.p0 p0Var, long j) {
        v1.m mVar = this.H;
        fj.l.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((t2.b0) mVar).r(s0Var, p0Var, j);
    }

    public final String toString() {
        return this.H.toString();
    }

    @Override // v2.z1
    public final void u0(d3.z zVar) {
        int i10;
        v1.m mVar = this.H;
        fj.l.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        d3.n nVarF = ((d3.o) mVar).f();
        fj.l.d(zVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        d3.n nVar = (d3.n) zVar;
        q.g0 g0Var = nVar.f4758a;
        if (nVarF.f4760c) {
            nVar.f4760c = true;
        }
        if (nVarF.f4761d) {
            nVar.f4761d = true;
        }
        q.g0 g0Var2 = nVarF.f4758a;
        Object[] objArr = g0Var2.f13074b;
        Object[] objArr2 = g0Var2.f13075c;
        long[] jArr = g0Var2.f13073a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j = jArr[i11];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((255 & j) < 128) {
                        int i15 = (i11 << 3) + i14;
                        Object obj = objArr[i15];
                        Object obj2 = objArr2[i15];
                        d3.y yVar = (d3.y) obj;
                        if (!g0Var.b(yVar)) {
                            g0Var.m(yVar, obj2);
                        } else if (obj2 instanceof d3.a) {
                            Object objG = g0Var.g(yVar);
                            fj.l.d(objG, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                            d3.a aVar = (d3.a) objG;
                            i10 = i12;
                            String str = aVar.f4703a;
                            if (str == null) {
                                str = ((d3.a) obj2).f4703a;
                            }
                            pi.c cVar = aVar.f4704b;
                            if (cVar == null) {
                                cVar = ((d3.a) obj2).f4704b;
                            }
                            g0Var.m(yVar, new d3.a(str, cVar));
                        }
                        i10 = i12;
                    } else {
                        i10 = i12;
                    }
                    j >>= i10;
                    i14++;
                    i12 = i10;
                }
                if (i13 != i12) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    @Override // v2.u1
    public final Object y0(s3.c cVar, Object obj) {
        v1.m mVar = this.H;
        fj.l.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((t2.b1) mVar).e();
    }

    @Override // v2.v, v2.w0
    public final void f(long j) {
    }

    @Override // v2.v
    public final void o0(t2.w wVar) {
    }
}
