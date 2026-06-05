package u0;

import android.os.Trace;
import c2.s;
import c2.u;
import c2.v0;
import d3.v;
import d3.x;
import d3.y;
import d3.z;
import g3.f0;
import g3.j0;
import g3.k0;
import g3.n0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import t2.f1;
import t2.p0;
import t2.r0;
import t2.s0;
import v2.h0;
import v2.w;
import v2.z1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k extends v1.n implements w, v2.m, z1 {
    public g3.f H;
    public n0 I;
    public k3.i J;
    public ej.c K;
    public int L;
    public boolean M;
    public int N;
    public int O;
    public List P;
    public ej.c Q;
    public ej.c R;
    public Map S;
    public f T;
    public i U;
    public j V;

    @Override // v2.w
    public final int C(v2.n0 n0Var, p0 p0Var, int i10) {
        return r1(n0Var).a(i10, n0Var.getLayoutDirection());
    }

    @Override // v2.w
    public final int O(v2.n0 n0Var, p0 p0Var, int i10) {
        return r1(n0Var).a(i10, n0Var.getLayoutDirection());
    }

    @Override // v2.m
    public final void O0(h0 h0Var) {
        if (!this.G) {
            return;
        }
        u uVarH = h0Var.f17669a.f5738b.h();
        f fVarR1 = r1(h0Var);
        k0 k0Var = fVarR1.f16506n;
        if (k0Var == null) {
            throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + fVarR1);
        }
        g3.o oVar = k0Var.f7129b;
        long j = k0Var.f7130c;
        boolean z2 = true;
        boolean z10 = (((float) ((int) (j >> 32))) < oVar.f7157d || oVar.f7156c || ((float) ((int) (j & 4294967295L))) < oVar.f7158e) && this.L != 3;
        if (z10) {
            b2.c cVarG = uk.c.g(0L, (Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L));
            uVarH.f();
            u.d(uVarH, cVarG);
        }
        try {
            f0 f0Var = this.I.f7151a;
            r3.l lVar = f0Var.f7095m;
            if (lVar == null) {
                lVar = r3.l.f13685b;
            }
            r3.l lVar2 = lVar;
            v0 v0Var = f0Var.f7096n;
            if (v0Var == null) {
                v0Var = v0.f3048d;
            }
            v0 v0Var2 = v0Var;
            e2.e eVar = f0Var.f7098p;
            if (eVar == null) {
                eVar = e2.g.f5743a;
            }
            e2.e eVar2 = eVar;
            s sVarB = f0Var.f7084a.b();
            if (sVarB != null) {
                g3.o.j(oVar, uVarH, sVarB, this.I.f7151a.f7084a.e(), v0Var2, lVar2, eVar2);
            } else {
                long jB = c2.w.f3058h;
                if (jB == 16) {
                    jB = this.I.b() != 16 ? this.I.b() : c2.w.f3052b;
                }
                g3.o.i(oVar, uVarH, jB, v0Var2, lVar2, eVar2);
            }
            if (z10) {
                uVarH.q();
            }
            j jVar = this.V;
            if (!((jVar == null || !jVar.f16542c) ? l.i(this.H) : false)) {
                List list = this.P;
                if (list != null && !list.isEmpty()) {
                    z2 = false;
                }
                if (z2) {
                    return;
                }
            }
            h0Var.f();
        } finally {
        }
    }

    @Override // v2.w
    public final int R0(v2.n0 n0Var, p0 p0Var, int i10) {
        return k0.s.m(r1(n0Var).e(n0Var.getLayoutDirection()).c());
    }

    @Override // v2.w
    public final int b1(v2.n0 n0Var, p0 p0Var, int i10) {
        return k0.s.m(r1(n0Var).e(n0Var.getLayoutDirection()).b());
    }

    @Override // v1.n
    public final boolean f1() {
        return false;
    }

    public final f q1() {
        if (this.T == null) {
            this.T = new f(this.H, this.I, this.J, this.L, this.M, this.N, this.O, this.P);
        }
        f fVar = this.T;
        fj.l.c(fVar);
        return fVar;
    }

    @Override // v2.w
    public final r0 r(s0 s0Var, p0 p0Var, long j) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            f fVarR1 = r1(s0Var);
            boolean zC = fVarR1.c(j, s0Var.getLayoutDirection());
            k0 k0Var = fVarR1.f16506n;
            if (k0Var == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + fVarR1);
            }
            long j4 = k0Var.f7130c;
            k0Var.f7129b.f7154a.a();
            if (zC) {
                v2.n.v(this, 2).D1();
                ej.c cVar = this.K;
                if (cVar != null) {
                    cVar.invoke(k0Var);
                }
                Map linkedHashMap = this.S;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap(2);
                }
                linkedHashMap.put(t2.d.f15528a, Integer.valueOf(Math.round(k0Var.f7131d)));
                linkedHashMap.put(t2.d.f15529b, Integer.valueOf(Math.round(k0Var.f7132e)));
                this.S = linkedHashMap;
            }
            ej.c cVar2 = this.Q;
            if (cVar2 != null) {
                cVar2.invoke(k0Var.f7133f);
            }
            int i10 = (int) (j4 >> 32);
            int i11 = (int) (j4 & 4294967295L);
            f1 f1VarY = p0Var.Y(uk.c.B(i10, i10, i11, i11));
            Map map = this.S;
            fj.l.c(map);
            r0 r0VarB = s0Var.B(i10, i11, map, new b0.l(f1VarY, 13));
            Trace.endSection();
            return r0VarB;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final f r1(s3.c cVar) {
        f fVar;
        j jVar = this.V;
        if (jVar != null && jVar.f16542c && (fVar = jVar.f16543d) != null) {
            fVar.d(cVar);
            return fVar;
        }
        f fVarQ1 = q1();
        fVarQ1.d(cVar);
        return fVarQ1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [u0.i] */
    @Override // v2.z1
    public final void u0(z zVar) {
        i iVar = this.U;
        i iVar2 = iVar;
        if (iVar == null) {
            final int i10 = 0;
            ?? r02 = new ej.c(this) { // from class: u0.i

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k f16539b;

                {
                    this.f16539b = this;
                }

                @Override // ej.c
                public final Object invoke(Object obj) {
                    k0 k0Var;
                    boolean z2;
                    switch (i10) {
                        case 0:
                            List list = (List) obj;
                            k kVar = this.f16539b;
                            k0 k0Var2 = kVar.q1().f16506n;
                            if (k0Var2 != null) {
                                j0 j0Var = k0Var2.f7128a;
                                k0Var = new k0(new j0(j0Var.f7117a, n0.e(kVar.I, c2.w.f3058h, 0L, null, null, 0L, 0, 0L, 16777214), j0Var.f7119c, j0Var.f7120d, j0Var.f7121e, j0Var.f7122f, j0Var.f7123g, j0Var.f7124h, j0Var.f7125i, j0Var.j), k0Var2.f7129b, k0Var2.f7130c);
                                list.add(k0Var);
                            } else {
                                k0Var = null;
                            }
                            return Boolean.valueOf(k0Var != null);
                        case 1:
                            g3.f fVar = (g3.f) obj;
                            k kVar2 = this.f16539b;
                            j jVar = kVar2.V;
                            qi.s sVar = qi.s.f13520a;
                            if (jVar == null) {
                                j jVar2 = new j(kVar2.H, fVar);
                                f fVar2 = new f(fVar, kVar2.I, kVar2.J, kVar2.L, kVar2.M, kVar2.N, kVar2.O, sVar);
                                fVar2.d(kVar2.q1().j);
                                jVar2.f16543d = fVar2;
                                kVar2.V = jVar2;
                            } else if (!fj.l.b(fVar, jVar.f16541b)) {
                                jVar.f16541b = fVar;
                                f fVar3 = jVar.f16543d;
                                if (fVar3 != null) {
                                    n0 n0Var = kVar2.I;
                                    k3.i iVar3 = kVar2.J;
                                    int i11 = kVar2.L;
                                    boolean z10 = kVar2.M;
                                    int i12 = kVar2.N;
                                    int i13 = kVar2.O;
                                    fVar3.f16494a = fVar;
                                    boolean zC = n0Var.c(fVar3.f16503k);
                                    fVar3.f16503k = n0Var;
                                    if (!zC) {
                                        fVar3.f16509q <<= 2;
                                        fVar3.f16504l = null;
                                        fVar3.f16506n = null;
                                        fVar3.f16508p = -1;
                                        fVar3.f16507o = -1;
                                    }
                                    fVar3.f16495b = iVar3;
                                    fVar3.f16496c = i11;
                                    fVar3.f16497d = z10;
                                    fVar3.f16498e = i12;
                                    fVar3.f16499f = i13;
                                    fVar3.f16500g = sVar;
                                    fVar3.f16509q = (fVar3.f16509q << 2) | 2;
                                    fVar3.f16504l = null;
                                    fVar3.f16506n = null;
                                    fVar3.f16508p = -1;
                                    fVar3.f16507o = -1;
                                }
                            }
                            v2.n.o(kVar2);
                            v2.n.n(kVar2);
                            v2.n.m(kVar2);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            k kVar3 = this.f16539b;
                            j jVar3 = kVar3.V;
                            if (jVar3 == null) {
                                z2 = false;
                            } else {
                                ej.c cVar = kVar3.R;
                                if (cVar != null) {
                                    cVar.invoke(jVar3);
                                }
                                j jVar4 = kVar3.V;
                                if (jVar4 != null) {
                                    jVar4.f16542c = zBooleanValue;
                                }
                                v2.n.o(kVar3);
                                v2.n.n(kVar3);
                                v2.n.m(kVar3);
                                z2 = true;
                            }
                            return Boolean.valueOf(z2);
                    }
                }
            };
            this.U = r02;
            iVar2 = r02;
        }
        g3.f fVar = this.H;
        lj.d[] dVarArr = x.f4803a;
        zVar.b(v.C, yd.f.K(fVar));
        j jVar = this.V;
        if (jVar != null) {
            g3.f fVar2 = jVar.f16541b;
            y yVar = v.D;
            lj.d[] dVarArr2 = x.f4803a;
            lj.d dVar = dVarArr2[16];
            zVar.b(yVar, fVar2);
            boolean z2 = jVar.f16542c;
            y yVar2 = v.E;
            lj.d dVar2 = dVarArr2[17];
            zVar.b(yVar2, Boolean.valueOf(z2));
        }
        final int i11 = 1;
        zVar.b(d3.m.f4743l, new d3.a(null, new ej.c(this) { // from class: u0.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f16539b;

            {
                this.f16539b = this;
            }

            @Override // ej.c
            public final Object invoke(Object obj) {
                k0 k0Var;
                boolean z22;
                switch (i11) {
                    case 0:
                        List list = (List) obj;
                        k kVar = this.f16539b;
                        k0 k0Var2 = kVar.q1().f16506n;
                        if (k0Var2 != null) {
                            j0 j0Var = k0Var2.f7128a;
                            k0Var = new k0(new j0(j0Var.f7117a, n0.e(kVar.I, c2.w.f3058h, 0L, null, null, 0L, 0, 0L, 16777214), j0Var.f7119c, j0Var.f7120d, j0Var.f7121e, j0Var.f7122f, j0Var.f7123g, j0Var.f7124h, j0Var.f7125i, j0Var.j), k0Var2.f7129b, k0Var2.f7130c);
                            list.add(k0Var);
                        } else {
                            k0Var = null;
                        }
                        return Boolean.valueOf(k0Var != null);
                    case 1:
                        g3.f fVar3 = (g3.f) obj;
                        k kVar2 = this.f16539b;
                        j jVar2 = kVar2.V;
                        qi.s sVar = qi.s.f13520a;
                        if (jVar2 == null) {
                            j jVar22 = new j(kVar2.H, fVar3);
                            f fVar22 = new f(fVar3, kVar2.I, kVar2.J, kVar2.L, kVar2.M, kVar2.N, kVar2.O, sVar);
                            fVar22.d(kVar2.q1().j);
                            jVar22.f16543d = fVar22;
                            kVar2.V = jVar22;
                        } else if (!fj.l.b(fVar3, jVar2.f16541b)) {
                            jVar2.f16541b = fVar3;
                            f fVar32 = jVar2.f16543d;
                            if (fVar32 != null) {
                                n0 n0Var = kVar2.I;
                                k3.i iVar3 = kVar2.J;
                                int i112 = kVar2.L;
                                boolean z10 = kVar2.M;
                                int i12 = kVar2.N;
                                int i13 = kVar2.O;
                                fVar32.f16494a = fVar3;
                                boolean zC = n0Var.c(fVar32.f16503k);
                                fVar32.f16503k = n0Var;
                                if (!zC) {
                                    fVar32.f16509q <<= 2;
                                    fVar32.f16504l = null;
                                    fVar32.f16506n = null;
                                    fVar32.f16508p = -1;
                                    fVar32.f16507o = -1;
                                }
                                fVar32.f16495b = iVar3;
                                fVar32.f16496c = i112;
                                fVar32.f16497d = z10;
                                fVar32.f16498e = i12;
                                fVar32.f16499f = i13;
                                fVar32.f16500g = sVar;
                                fVar32.f16509q = (fVar32.f16509q << 2) | 2;
                                fVar32.f16504l = null;
                                fVar32.f16506n = null;
                                fVar32.f16508p = -1;
                                fVar32.f16507o = -1;
                            }
                        }
                        v2.n.o(kVar2);
                        v2.n.n(kVar2);
                        v2.n.m(kVar2);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        k kVar3 = this.f16539b;
                        j jVar3 = kVar3.V;
                        if (jVar3 == null) {
                            z22 = false;
                        } else {
                            ej.c cVar = kVar3.R;
                            if (cVar != null) {
                                cVar.invoke(jVar3);
                            }
                            j jVar4 = kVar3.V;
                            if (jVar4 != null) {
                                jVar4.f16542c = zBooleanValue;
                            }
                            v2.n.o(kVar3);
                            v2.n.n(kVar3);
                            v2.n.m(kVar3);
                            z22 = true;
                        }
                        return Boolean.valueOf(z22);
                }
            }
        }));
        final int i12 = 2;
        zVar.b(d3.m.f4744m, new d3.a(null, new ej.c(this) { // from class: u0.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f16539b;

            {
                this.f16539b = this;
            }

            @Override // ej.c
            public final Object invoke(Object obj) {
                k0 k0Var;
                boolean z22;
                switch (i12) {
                    case 0:
                        List list = (List) obj;
                        k kVar = this.f16539b;
                        k0 k0Var2 = kVar.q1().f16506n;
                        if (k0Var2 != null) {
                            j0 j0Var = k0Var2.f7128a;
                            k0Var = new k0(new j0(j0Var.f7117a, n0.e(kVar.I, c2.w.f3058h, 0L, null, null, 0L, 0, 0L, 16777214), j0Var.f7119c, j0Var.f7120d, j0Var.f7121e, j0Var.f7122f, j0Var.f7123g, j0Var.f7124h, j0Var.f7125i, j0Var.j), k0Var2.f7129b, k0Var2.f7130c);
                            list.add(k0Var);
                        } else {
                            k0Var = null;
                        }
                        return Boolean.valueOf(k0Var != null);
                    case 1:
                        g3.f fVar3 = (g3.f) obj;
                        k kVar2 = this.f16539b;
                        j jVar2 = kVar2.V;
                        qi.s sVar = qi.s.f13520a;
                        if (jVar2 == null) {
                            j jVar22 = new j(kVar2.H, fVar3);
                            f fVar22 = new f(fVar3, kVar2.I, kVar2.J, kVar2.L, kVar2.M, kVar2.N, kVar2.O, sVar);
                            fVar22.d(kVar2.q1().j);
                            jVar22.f16543d = fVar22;
                            kVar2.V = jVar22;
                        } else if (!fj.l.b(fVar3, jVar2.f16541b)) {
                            jVar2.f16541b = fVar3;
                            f fVar32 = jVar2.f16543d;
                            if (fVar32 != null) {
                                n0 n0Var = kVar2.I;
                                k3.i iVar3 = kVar2.J;
                                int i112 = kVar2.L;
                                boolean z10 = kVar2.M;
                                int i122 = kVar2.N;
                                int i13 = kVar2.O;
                                fVar32.f16494a = fVar3;
                                boolean zC = n0Var.c(fVar32.f16503k);
                                fVar32.f16503k = n0Var;
                                if (!zC) {
                                    fVar32.f16509q <<= 2;
                                    fVar32.f16504l = null;
                                    fVar32.f16506n = null;
                                    fVar32.f16508p = -1;
                                    fVar32.f16507o = -1;
                                }
                                fVar32.f16495b = iVar3;
                                fVar32.f16496c = i112;
                                fVar32.f16497d = z10;
                                fVar32.f16498e = i122;
                                fVar32.f16499f = i13;
                                fVar32.f16500g = sVar;
                                fVar32.f16509q = (fVar32.f16509q << 2) | 2;
                                fVar32.f16504l = null;
                                fVar32.f16506n = null;
                                fVar32.f16508p = -1;
                                fVar32.f16507o = -1;
                            }
                        }
                        v2.n.o(kVar2);
                        v2.n.n(kVar2);
                        v2.n.m(kVar2);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        k kVar3 = this.f16539b;
                        j jVar3 = kVar3.V;
                        if (jVar3 == null) {
                            z22 = false;
                        } else {
                            ej.c cVar = kVar3.R;
                            if (cVar != null) {
                                cVar.invoke(jVar3);
                            }
                            j jVar4 = kVar3.V;
                            if (jVar4 != null) {
                                jVar4.f16542c = zBooleanValue;
                            }
                            v2.n.o(kVar3);
                            v2.n.n(kVar3);
                            v2.n.m(kVar3);
                            z22 = true;
                        }
                        return Boolean.valueOf(z22);
                }
            }
        }));
        zVar.b(d3.m.f4745n, new d3.a(null, new q0.k(this, 12)));
        x.a(zVar, iVar2);
    }
}
