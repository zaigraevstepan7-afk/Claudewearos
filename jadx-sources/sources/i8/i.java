package i8;

import android.os.Trace;
import f1.c2;
import f1.j1;
import g3.y;
import qj.a0;
import qj.b0;
import qj.e1;
import qj.m0;
import qj.s1;
import qj.v;
import qj.z;
import tj.d0;
import tj.i0;
import tj.r0;
import v2.h0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i extends h2.b implements c2 {
    public static final y N = new y(14);
    public c2.n A;
    public boolean B;
    public e1 C;
    public z E;
    public m I;
    public c J;
    public final r0 K;
    public final r0 L;
    public final d0 M;

    /* renamed from: f, reason: collision with root package name */
    public final j1 f8383f = f1.s.A(null);

    /* renamed from: z, reason: collision with root package name */
    public float f8384z = 1.0f;
    public long D = 9205357640488583168L;
    public ej.c F = N;
    public t2.i G = t2.h.f15564b;
    public int H = 1;

    public i(c cVar) {
        this.J = cVar;
        this.K = i0.b(cVar);
        r0 r0VarB = i0.b(d.f8377a);
        this.L = r0VarB;
        this.M = new d0(r0VarB);
    }

    public static final r8.g j(i iVar, r8.g gVar, boolean z2) {
        r8.d dVarA = r8.g.a(gVar);
        dVarA.f13834d = new mh.g(14, gVar, iVar);
        r8.f fVar = gVar.f13885s;
        if (fVar.f13865g == null) {
            dVarA.f13841l = s8.i.f14789a;
        }
        if (fVar.f13866h == null) {
            t2.i iVar2 = iVar.G;
            int i10 = j8.g.f8753b;
            dVarA.f13842m = (fj.l.b(iVar2, t2.h.f15564b) || fj.l.b(iVar2, t2.h.f15566d)) ? s8.g.f14784b : s8.g.f14783a;
        }
        if (fVar.f13867i == null) {
            dVarA.f13843n = s8.d.f14781b;
        }
        if (z2) {
            ti.i iVar3 = ti.i.f16336a;
            dVarA.f13836f = iVar3;
            dVarA.f13837g = iVar3;
            dVarA.f13838h = iVar3;
        }
        return dVarA.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(i8.i r10, i8.h r11) {
        /*
            tj.r0 r0 = r10.L
            java.lang.Object r1 = r0.getValue()
            i8.h r1 = (i8.h) r1
            ej.c r2 = r10.F
            java.lang.Object r11 = r2.invoke(r11)
            i8.h r11 = (i8.h) r11
            r0.j(r11)
            t2.i r5 = r10.G
            boolean r0 = r11 instanceof i8.g
            r9 = 0
            if (r0 == 0) goto L20
            r0 = r11
            i8.g r0 = (i8.g) r0
            r8.p r0 = r0.f8382b
            goto L29
        L20:
            boolean r0 = r11 instanceof i8.e
            if (r0 == 0) goto L6f
            r0 = r11
            i8.e r0 = (i8.e) r0
            r8.c r0 = r0.f8379b
        L29:
            r8.g r2 = r0.b()
            gf.f r3 = r8.i.f13891a
            java.lang.Object r2 = h8.n.d(r2, r3)
            u8.f r2 = (u8.f) r2
            i8.j r3 = i8.k.f8385a
            u8.g r2 = r2.a(r3, r0)
            boolean r3 = r2 instanceof u8.c
            if (r3 == 0) goto L6f
            h2.b r3 = r1.a()
            boolean r4 = r1 instanceof i8.f
            if (r4 == 0) goto L48
            goto L49
        L48:
            r3 = r9
        L49:
            h2.b r4 = r11.a()
            oj.f r6 = oj.a.f12531b
            u8.c r2 = (u8.c) r2
            int r2 = r2.f16865c
            oj.c r6 = oj.c.f12538d
            long r6 = yd.f.j0(r2, r6)
            boolean r2 = r0 instanceof r8.p
            if (r2 == 0) goto L67
            r8.p r0 = (r8.p) r0
            boolean r0 = r0.f13916g
            if (r0 != 0) goto L64
            goto L67
        L64:
            r0 = 0
        L65:
            r8 = r0
            goto L69
        L67:
            r0 = 1
            goto L65
        L69:
            i8.p r2 = new i8.p
            r2.<init>(r3, r4, r5, r6, r8)
            goto L70
        L6f:
            r2 = r9
        L70:
            if (r2 == 0) goto L73
            goto L77
        L73:
            h2.b r2 = r11.a()
        L77:
            f1.j1 r10 = r10.f8383f
            r10.setValue(r2)
            h2.b r10 = r1.a()
            h2.b r0 = r11.a()
            if (r10 == r0) goto La7
            h2.b r10 = r1.a()
            boolean r0 = r10 instanceof f1.c2
            if (r0 == 0) goto L91
            f1.c2 r10 = (f1.c2) r10
            goto L92
        L91:
            r10 = r9
        L92:
            if (r10 == 0) goto L97
            r10.c()
        L97:
            h2.b r10 = r11.a()
            boolean r11 = r10 instanceof f1.c2
            if (r11 == 0) goto La2
            r9 = r10
            f1.c2 r9 = (f1.c2) r9
        La2:
            if (r9 == 0) goto La7
            r9.d()
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.i.k(i8.i, i8.h):void");
    }

    @Override // f1.c2
    public final void a() {
        e1 e1Var = this.C;
        if (e1Var != null) {
            e1Var.e(null);
        }
        this.C = null;
        Object obj = (h2.b) this.f8383f.getValue();
        c2 c2Var = obj instanceof c2 ? (c2) obj : null;
        if (c2Var != null) {
            c2Var.a();
        }
        this.B = false;
    }

    @Override // h2.b
    public final boolean b(float f10) {
        this.f8384z = f10;
        return true;
    }

    @Override // f1.c2
    public final void c() {
        e1 e1Var = this.C;
        if (e1Var != null) {
            e1Var.e(null);
        }
        this.C = null;
        Object obj = (h2.b) this.f8383f.getValue();
        c2 c2Var = obj instanceof c2 ? (c2) obj : null;
        if (c2Var != null) {
            c2Var.c();
        }
        this.B = false;
    }

    @Override // f1.c2
    public final void d() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            Object obj = (h2.b) this.f8383f.getValue();
            c2 c2Var = obj instanceof c2 ? (c2) obj : null;
            if (c2Var != null) {
                c2Var.d();
            }
            l();
            this.B = true;
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // h2.b
    public final boolean e(c2.n nVar) {
        this.A = nVar;
        return true;
    }

    @Override // h2.b
    public final long h() {
        h2.b bVar = (h2.b) this.f8383f.getValue();
        if (bVar != null) {
            return bVar.h();
        }
        return 9205357640488583168L;
    }

    @Override // h2.b
    public final void i(h0 h0Var) {
        e2.b bVar = h0Var.f17669a;
        long jA = bVar.a();
        if (!b2.e.a(this.D, jA)) {
            this.D = jA;
        }
        h2.b bVar2 = (h2.b) this.f8383f.getValue();
        if (bVar2 != null) {
            bVar2.g(h0Var, bVar.a(), this.f8384z, this.A);
        }
    }

    public final void l() {
        c cVar = this.J;
        if (cVar == null) {
            return;
        }
        z zVar = this.E;
        ti.c cVar2 = null;
        if (zVar == null) {
            fj.l.l("scope");
            throw null;
        }
        ab.s sVar = new ab.s(this, cVar, cVar2, 12);
        ti.h hVarQ = zVar.Q();
        int i10 = j8.g.f8753b;
        v vVar = (v) hVarQ.C(v.f13628b);
        s1 s1VarV = (vVar == null || vVar.equals(m0.f13602b)) ? b0.v(zVar, m0.f13602b, a0.f13541d, sVar) : b0.v(b0.b(new j8.d(zVar.Q())), new j8.e(vVar), a0.f13541d, sVar);
        e1 e1Var = this.C;
        if (e1Var != null) {
            e1Var.e(null);
        }
        this.C = s1VarV;
    }

    public final void m(c cVar) {
        if (fj.l.b(this.J, cVar)) {
            return;
        }
        this.J = cVar;
        if (cVar == null) {
            e1 e1Var = this.C;
            if (e1Var != null) {
                e1Var.e(null);
            }
            this.C = null;
        } else if (this.B) {
            l();
        }
        if (cVar != null) {
            r0 r0Var = this.K;
            r0Var.getClass();
            r0Var.k(null, cVar);
        }
    }
}
