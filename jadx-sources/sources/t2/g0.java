package t2;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g0 implements q1 {

    /* renamed from: a, reason: collision with root package name */
    public s3.m f15556a = s3.m.f14753b;

    /* renamed from: b, reason: collision with root package name */
    public float f15557b;

    /* renamed from: c, reason: collision with root package name */
    public float f15558c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0 f15559d;

    public g0(m0 m0Var) {
        this.f15559d = m0Var;
    }

    @Override // t2.s0
    public final r0 D0(int i10, int i11, Map map, ej.c cVar, ej.c cVar2) {
        if ((i10 & (-16777216)) != 0 || ((-16777216) & i11) != 0) {
            s2.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new f0(i10, i11, map, cVar, this, this.f15559d, cVar2);
    }

    @Override // t2.q1
    public final List L(ej.e eVar, Object obj) {
        m0 m0Var = this.f15559d;
        m0Var.h();
        v2.f0 f0Var = m0Var.f15600a;
        v2.b0 b0Var = f0Var.Z.f17692d;
        v2.b0 b0Var2 = v2.b0.f17575a;
        if (b0Var != b0Var2 && b0Var != v2.b0.f17577c && b0Var != v2.b0.f17576b && b0Var != v2.b0.f17578d) {
            s2.a.b("subcompose can only be used inside the measure or layout blocks");
        }
        q.g0 g0Var = m0Var.f15606z;
        Object objG = g0Var.g(obj);
        if (objG == null) {
            objG = (v2.f0) m0Var.C.k(obj);
            if (objG != null) {
                if (m0Var.H <= 0) {
                    s2.a.b("Check failed.");
                }
                m0Var.H--;
            } else {
                objG = m0Var.n(obj);
                if (objG == null) {
                    int i10 = m0Var.f15603d;
                    v2.f0 f0Var2 = new v2.f0(2);
                    f0Var.J = true;
                    f0Var.A(i10, f0Var2);
                    f0Var.J = false;
                    objG = f0Var2;
                }
            }
            g0Var.m(obj, objG);
        }
        v2.f0 f0Var3 = (v2.f0) objG;
        if (qi.l.B0(m0Var.f15603d, f0Var.o()) != f0Var3) {
            int iJ = ((g1.e) ((g1.b) f0Var.o()).f7016b).j(f0Var3);
            if (iJ < m0Var.f15603d) {
                s2.a.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i11 = m0Var.f15603d;
            if (i11 != iJ) {
                m0Var.j(iJ, i11);
            }
        }
        m0Var.f15603d++;
        m0Var.m(f0Var3, obj, false, eVar);
        return (b0Var == b0Var2 || b0Var == v2.b0.f17577c) ? f0Var3.m() : f0Var3.l();
    }

    @Override // s3.c
    public final float e() {
        return this.f15557b;
    }

    @Override // t2.r
    public final s3.m getLayoutDirection() {
        return this.f15556a;
    }

    @Override // s3.c
    public final float r0() {
        return this.f15558c;
    }

    @Override // t2.r
    public final boolean t0() {
        v2.b0 b0Var = this.f15559d.f15600a.Z.f17692d;
        return b0Var == v2.b0.f17578d || b0Var == v2.b0.f17576b;
    }
}
