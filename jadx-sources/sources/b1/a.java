package b1;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c1.n1;
import c1.o1;
import c2.u;
import c2.w;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import q.b0;
import t.m1;
import v1.n;
import v2.h0;
import v2.m;
import v2.v;
import z.k;
import z.l;
import z.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends n implements v2.i, m, v {
    public final k H;
    public final boolean I;
    public final float J;
    public final o1 K;
    public final n1 L;
    public i M;
    public float N;
    public boolean P;
    public d R;
    public e S;
    public long O = 0;
    public final b0 Q = new b0();

    public a(k kVar, boolean z2, float f10, o1 o1Var, n1 n1Var) {
        this.H = kVar;
        this.I = z2;
        this.J = f10;
        this.K = o1Var;
        this.L = n1Var;
    }

    @Override // v2.m
    public final void O0(h0 h0Var) {
        e2.b bVar = h0Var.f17669a;
        h0Var.f();
        i iVar = this.M;
        if (iVar != null) {
            float f10 = this.N;
            long jA = this.K.a();
            float fFloatValue = ((Number) ((t.c) iVar.f1489c).e()).floatValue();
            if (fFloatValue > 0.0f) {
                long jC = w.c(jA, fFloatValue);
                if (iVar.f1487a) {
                    float fE = b2.e.e(bVar.a());
                    float fB = b2.e.b(bVar.a());
                    ac.d dVar = bVar.f5738b;
                    long jY = dVar.y();
                    dVar.h().f();
                    try {
                        ((ld.i) dVar.f373b).w(0.0f, 0.0f, fE, fB, 1);
                        e2.d.V0(h0Var, jC, f10, 0L, null, 124);
                    } finally {
                        m1.r(dVar, jY);
                    }
                } else {
                    e2.d.V0(h0Var, jC, f10, 0L, null, 124);
                }
            }
        }
        u uVarH = bVar.f5738b.h();
        e eVar = this.S;
        if (eVar != null) {
            long j = this.O;
            int iH = hj.a.H(this.N);
            long jA2 = this.K.a();
            this.L.a();
            eVar.e(iH, j, jA2);
            eVar.draw(c2.c.a(uVarH));
        }
    }

    @Override // v2.v, v2.w0
    public final void f(long j) {
        float fW0;
        this.P = true;
        s3.c cVar = v2.n.y(this).R;
        this.O = cg.b.S(j);
        float f10 = this.J;
        if (Float.isNaN(f10)) {
            long j4 = this.O;
            float f11 = c.f1465a;
            float fE = b2.e.e(j4);
            float fB = b2.e.b(j4);
            fW0 = b2.b.d((Float.floatToRawIntBits(fB) & 4294967295L) | (Float.floatToRawIntBits(fE) << 32)) / 2.0f;
            if (this.I) {
                fW0 += cVar.w0(c.f1465a);
            }
        } else {
            fW0 = cVar.w0(f10);
        }
        this.N = fW0;
        b0 b0Var = this.Q;
        Object[] objArr = b0Var.f13033a;
        int i10 = b0Var.f13034b;
        for (int i11 = 0; i11 < i10; i11++) {
            q1((o) objArr[i11]);
        }
        b0Var.d();
    }

    @Override // v1.n
    public final boolean f1() {
        return false;
    }

    @Override // v1.n
    public final void i1() {
        qj.b0.w(e1(), null, new androidx.lifecycle.h0(this, (ti.c) null, 1), 3);
    }

    @Override // v1.n
    public final void j1() {
        d dVar = this.R;
        if (dVar != null) {
            this.S = null;
            v2.n.m(this);
            mh.g gVar = dVar.f1469d;
            e eVar = (e) ((LinkedHashMap) gVar.f11707b).get(this);
            if (eVar != null) {
                eVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) gVar.f11707b;
                e eVar2 = (e) linkedHashMap.get(this);
                if (eVar2 != null) {
                }
                linkedHashMap.remove(this);
                dVar.f1468c.add(eVar);
            }
        }
    }

    public final void q1(o oVar) {
        e eVar;
        if (!(oVar instanceof z.m)) {
            if (oVar instanceof z.n) {
                e eVar2 = this.S;
                if (eVar2 != null) {
                    eVar2.d();
                    return;
                }
                return;
            }
            if (!(oVar instanceof l) || (eVar = this.S) == null) {
                return;
            }
            eVar.d();
            return;
        }
        z.m mVar = (z.m) oVar;
        long j = this.O;
        float f10 = this.N;
        d dVar = this.R;
        if (dVar == null) {
            Object obj = (View) v2.n.h(this, AndroidCompositionLocals_androidKt.f842f);
            while (!(obj instanceof ViewGroup)) {
                Object parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    throw new IllegalArgumentException(("Couldn't find a valid parent for " + obj + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    d dVar2 = new d(viewGroup.getContext());
                    viewGroup.addView(dVar2);
                    dVar = dVar2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt instanceof d) {
                        dVar = (d) childAt;
                        break;
                    }
                    i10++;
                }
            }
            this.R = dVar;
        }
        ArrayList arrayList = dVar.f1467b;
        mh.g gVar = dVar.f1469d;
        LinkedHashMap linkedHashMap = (LinkedHashMap) gVar.f11707b;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) gVar.f11707b;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) gVar.f11708c;
        e eVar3 = (e) linkedHashMap.get(this);
        if (eVar3 == null) {
            ArrayList arrayList2 = dVar.f1468c;
            fj.l.f(arrayList2, "<this>");
            eVar3 = (e) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (eVar3 == null) {
                if (dVar.f1470e > yd.f.B(arrayList)) {
                    eVar3 = new e(dVar.getContext());
                    dVar.addView(eVar3);
                    arrayList.add(eVar3);
                } else {
                    eVar3 = (e) arrayList.get(dVar.f1470e);
                    a aVar = (a) linkedHashMap3.get(eVar3);
                    if (aVar != null) {
                        aVar.S = null;
                        v2.n.m(aVar);
                        e eVar4 = (e) linkedHashMap2.get(aVar);
                        if (eVar4 != null) {
                        }
                        linkedHashMap2.remove(aVar);
                        eVar3.c();
                    }
                }
                int i11 = dVar.f1470e;
                if (i11 < dVar.f1466a - 1) {
                    dVar.f1470e = i11 + 1;
                } else {
                    dVar.f1470e = 0;
                }
            }
            linkedHashMap2.put(this, eVar3);
            linkedHashMap3.put(eVar3, this);
        }
        e eVar5 = eVar3;
        int iH = hj.a.H(f10);
        long jA = this.K.a();
        this.L.a();
        eVar5.b(mVar, this.I, j, iH, jA, new a7.e(this, 2));
        this.S = eVar5;
        v2.n.m(this);
    }
}
