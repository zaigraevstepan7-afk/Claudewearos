package t2;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d0 implements q1, s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f15530a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f15531b;

    public d0(m0 m0Var) {
        this.f15531b = m0Var;
        this.f15530a = m0Var.A;
    }

    @Override // t2.s0
    public final r0 B(int i10, int i11, Map map, ej.c cVar) {
        return this.f15530a.D0(i10, i11, map, null, cVar);
    }

    @Override // t2.s0
    public final r0 D0(int i10, int i11, Map map, ej.c cVar, ej.c cVar2) {
        return this.f15530a.D0(i10, i11, map, cVar, cVar2);
    }

    @Override // s3.c
    public final int E0(long j) {
        return this.f15530a.E0(j);
    }

    @Override // s3.c
    public final int I0(float f10) {
        return this.f15530a.I0(f10);
    }

    @Override // s3.c
    public final long J(float f10) {
        return this.f15530a.J(f10);
    }

    @Override // s3.c
    public final long K(long j) {
        return this.f15530a.K(j);
    }

    @Override // t2.q1
    public final List L(ej.e eVar, Object obj) {
        m0 m0Var = this.f15531b;
        v2.f0 f0Var = m0Var.f15600a;
        q.g0 g0Var = m0Var.f15606z;
        v2.f0 f0Var2 = (v2.f0) g0Var.g(obj);
        if (f0Var2 != null && ((g1.e) ((g1.b) f0Var.o()).f7016b).j(f0Var2) < m0Var.f15603d) {
            return f0Var2.m();
        }
        q.g0 g0Var2 = m0Var.E;
        q.g0 g0Var3 = m0Var.C;
        g1.e eVar2 = m0Var.F;
        if (eVar2.f7026c < m0Var.f15604e) {
            s2.a.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        v2.f0 f0Var3 = (v2.f0) g0Var.g(obj);
        int i10 = eVar2.f7026c;
        int i11 = m0Var.f15604e;
        if (i10 == i11) {
            eVar2.b(obj);
        } else {
            Object[] objArr = eVar2.f7024a;
            Object obj2 = objArr[i11];
            objArr[i11] = obj;
        }
        m0Var.f15604e++;
        boolean zB = g0Var3.b(obj);
        if (zB || f0Var3 != null) {
            if (!zB && f0Var3 != null) {
                m0Var.j(((g1.e) ((g1.b) f0Var.o()).f7016b).j(f0Var3), ((g1.e) ((g1.b) f0Var.o()).f7016b).f7026c);
                m0Var.H++;
                g0Var.k(obj);
                g0Var3.m(obj, f0Var3);
                g0Var2.m(obj, m0Var.f(obj));
                if (f0Var.G()) {
                    m0Var.h();
                }
            }
            v2.f0 f0Var4 = (v2.f0) g0Var3.g(obj);
            e0 e0Var = f0Var4 != null ? (e0) m0Var.f15605f.g(f0Var4) : null;
            if (e0Var != null && e0Var.f15536d) {
                m0Var.m(f0Var4, obj, false, eVar);
            }
            if ((e0Var != null ? e0Var.f15538f : null) != null) {
                m0Var.d(e0Var, true);
            }
        } else {
            m0Var.k(obj, eVar, false);
            g0Var2.m(obj, m0Var.f(obj));
        }
        v2.f0 f0Var5 = (v2.f0) g0Var3.g(obj);
        if (f0Var5 == null) {
            return qi.s.f13520a;
        }
        List listO0 = f0Var5.Z.f17703p.O0();
        g1.b bVar = (g1.b) listO0;
        int i12 = ((g1.e) bVar.f7016b).f7026c;
        for (int i13 = 0; i13 < i12; i13++) {
            ((v2.v0) bVar.get(i13)).f17793f.f17690b = true;
        }
        return listO0;
    }

    @Override // s3.c
    public final float N(long j) {
        return this.f15530a.N(j);
    }

    @Override // s3.c
    public final long Q0(long j) {
        return this.f15530a.Q0(j);
    }

    @Override // s3.c
    public final float W0(long j) {
        return this.f15530a.W0(j);
    }

    @Override // s3.c
    public final long Z(float f10) {
        return this.f15530a.Z(f10);
    }

    @Override // s3.c
    public final float e() {
        return this.f15530a.f15557b;
    }

    @Override // t2.r
    public final s3.m getLayoutDirection() {
        return this.f15530a.f15556a;
    }

    @Override // s3.c
    public final float h0(int i10) {
        return this.f15530a.h0(i10);
    }

    @Override // s3.c
    public final float l0(float f10) {
        return f10 / this.f15530a.e();
    }

    @Override // s3.c
    public final float r0() {
        return this.f15530a.f15558c;
    }

    @Override // t2.r
    public final boolean t0() {
        return this.f15530a.t0();
    }

    @Override // s3.c
    public final float w0(float f10) {
        return this.f15530a.e() * f10;
    }
}
