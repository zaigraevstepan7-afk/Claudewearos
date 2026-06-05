package v;

import android.view.KeyEvent;
import java.util.ArrayList;
import w2.h2;
import x.v2;
import x.w2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d0 extends g {

    /* renamed from: f0, reason: collision with root package name */
    public ej.a f17164f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f17165g0;

    /* renamed from: h0, reason: collision with root package name */
    public final q.y f17166h0;

    /* renamed from: i0, reason: collision with root package name */
    public final q.y f17167i0;

    /* renamed from: j0, reason: collision with root package name */
    public p2.w f17168j0;

    /* renamed from: k0, reason: collision with root package name */
    public qj.s1 f17169k0;

    /* renamed from: l0, reason: collision with root package name */
    public qj.s1 f17170l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f17171m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f17172n0;

    /* renamed from: o0, reason: collision with root package name */
    public long f17173o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f17174p0;

    /* renamed from: q0, reason: collision with root package name */
    public m2.b f17175q0;

    /* renamed from: r0, reason: collision with root package name */
    public qj.s1 f17176r0;

    /* renamed from: s0, reason: collision with root package name */
    public qj.s1 f17177s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f17178t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f17179u0;

    /* renamed from: v0, reason: collision with root package name */
    public long f17180v0;
    public boolean w0;

    public d0(d3.j jVar, ej.a aVar, ej.a aVar2, z.k kVar) {
        super(kVar, null, false, true, null, jVar, aVar);
        this.f17164f0 = aVar2;
        this.f17165g0 = true;
        int i10 = q.n.f13107a;
        this.f17166h0 = new q.y(6);
        this.f17167i0 = new q.y(6);
        this.f17173o0 = -1L;
        this.f17180v0 = -1L;
    }

    @Override // v.g
    public final void C1() {
        J1();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @Override // v.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean D1(android.view.KeyEvent r7) {
        /*
            r6 = this;
            long r0 = n2.d.b(r7)
            ej.a r7 = r6.f17164f0
            if (r7 == 0) goto L25
            q.y r7 = r6.f17166h0
            java.lang.Object r2 = r7.d(r0)
            if (r2 != 0) goto L25
            qj.z r2 = r6.e1()
            v.c0 r3 = new v.c0
            r4 = 2
            r5 = 0
            r3.<init>(r6, r5, r4)
            r4 = 3
            qj.s1 r2 = qj.b0.w(r2, r5, r3, r4)
            r7.g(r0, r2)
            r7 = 1
            goto L26
        L25:
            r7 = 0
        L26:
            q.y r2 = r6.f17167i0
            java.lang.Object r0 = r2.d(r0)
            v.b0 r0 = (v.b0) r0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v.d0.D1(android.view.KeyEvent):boolean");
    }

    @Override // v.g
    public final void E1(KeyEvent keyEvent) {
        long jB = n2.d.b(keyEvent);
        q.y yVar = this.f17166h0;
        boolean z2 = false;
        if (yVar.d(jB) != null) {
            qj.e1 e1Var = (qj.e1) yVar.d(jB);
            if (e1Var != null) {
                if (e1Var.b()) {
                    e1Var.e(null);
                } else {
                    z2 = true;
                }
            }
            yVar.f(jB);
        }
        if (z2) {
            return;
        }
        this.P.a();
    }

    public final void G1(boolean z2) {
        if (z2) {
            this.f17175q0 = null;
            qj.s1 s1Var = this.f17176r0;
            if (s1Var != null) {
                s1Var.e(null);
            }
            this.f17176r0 = null;
            qj.s1 s1Var2 = this.f17177s0;
            if (s1Var2 != null) {
                s1Var2.e(null);
            }
            this.f17177s0 = null;
            this.f17178t0 = false;
            this.f17179u0 = false;
            this.f17180v0 = -1L;
            this.w0 = false;
        } else {
            this.f17168j0 = null;
            qj.s1 s1Var3 = this.f17169k0;
            if (s1Var3 != null) {
                s1Var3.e(null);
            }
            this.f17169k0 = null;
            qj.s1 s1Var4 = this.f17170l0;
            if (s1Var4 != null) {
                s1Var4.e(null);
            }
            this.f17170l0 = null;
            this.f17171m0 = false;
            this.f17172n0 = false;
            this.f17173o0 = -1L;
            this.f17174p0 = false;
        }
        x1(z2);
    }

    public final void H1(long j, m2.b bVar) {
        if (this.O && !this.w0) {
            y1(bVar.f11261c, true);
            this.f17180v0 = j;
            if (!this.f17179u0 && !this.f17178t0) {
                this.P.a();
            }
        }
        this.f17175q0 = null;
        this.w0 = false;
        this.f17178t0 = false;
        qj.s1 s1Var = this.f17176r0;
        if (s1Var != null) {
            s1Var.e(null);
        }
        this.f17176r0 = null;
        this.f17179u0 = false;
    }

    public final void I1(long j, p2.w wVar) {
        if (this.O && !this.f17174p0) {
            y1(wVar.f12762c, false);
            this.f17173o0 = j;
            if (!this.f17172n0 && !this.f17171m0) {
                this.P.a();
            }
        }
        this.f17168j0 = null;
        this.f17174p0 = false;
        this.f17171m0 = false;
        qj.s1 s1Var = this.f17169k0;
        if (s1Var != null) {
            s1Var.e(null);
        }
        this.f17169k0 = null;
        this.f17172n0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J1() {
        /*
            Method dump skipped, instructions count: 182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.d0.J1():void");
    }

    @Override // v.g, v2.w1
    public final void V() {
        super.V();
        G1(false);
    }

    @Override // m2.c
    public final void X(ak.x xVar, p2.o oVar) {
        ArrayList arrayList = (ArrayList) xVar.f743c;
        B1();
        if (this.O && this.T == null) {
            m0 m0Var = new m0(this);
            q1(m0Var);
            this.T = m0Var;
        }
        int i10 = 0;
        if (oVar != p2.o.f12744b) {
            if (oVar != p2.o.f12745c || this.f17175q0 == null || this.f17179u0) {
                return;
            }
            int size = arrayList.size();
            while (i10 < size) {
                m2.b bVar = (m2.b) arrayList.get(i10);
                if (bVar.f11267i && !bVar.equals(this.f17175q0)) {
                    G1(true);
                    return;
                }
                i10++;
            }
            return;
        }
        if (this.f17175q0 == null) {
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                if (w2.h((m2.b) arrayList.get(i11))) {
                    m2.b bVar2 = (m2.b) arrayList.get(0);
                    bVar2.f11267i = true;
                    this.f17175q0 = bVar2;
                    if (this.O) {
                        qj.s1 s1Var = this.f17177s0;
                        ti.c cVar = null;
                        if (s1Var != null && s1Var.b()) {
                            ((h2) v2.n.h(this, w2.f1.f18273t)).getClass();
                            if (bVar2.f11260b - this.f17180v0 < 40) {
                                this.w0 = true;
                                return;
                            }
                            this.f17178t0 = true;
                            qj.s1 s1Var2 = this.f17177s0;
                            if (s1Var2 != null) {
                                s1Var2.e(null);
                            }
                            this.f17177s0 = null;
                        }
                        this.f17179u0 = false;
                        z1(bVar2);
                        if (this.f17164f0 != null) {
                            this.f17176r0 = qj.b0.w(e1(), null, new c0(this, cVar, 1), 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.f17179u0) {
            int size3 = arrayList.size();
            for (int i12 = 0; i12 < size3; i12++) {
                m2.b bVar3 = (m2.b) arrayList.get(i12);
                if (!bVar3.f11266h || bVar3.f11262d) {
                    int size4 = arrayList.size();
                    while (i10 < size4) {
                        ((m2.b) arrayList.get(i10)).f11267i = true;
                        i10++;
                    }
                    return;
                }
            }
            m2.b bVar4 = (m2.b) arrayList.get(0);
            bVar4.f11267i = true;
            long j = bVar4.f11260b;
            m2.b bVar5 = this.f17175q0;
            fj.l.c(bVar5);
            H1(j, bVar5);
            return;
        }
        int size5 = arrayList.size();
        for (int i13 = 0; i13 < size5; i13++) {
            m2.b bVar6 = (m2.b) arrayList.get(i13);
            if (bVar6.f11267i || !bVar6.f11266h || bVar6.f11262d) {
                float f10 = ((h2) v2.n.h(this, w2.f1.f18273t)).f();
                int size6 = arrayList.size();
                for (int i14 = 0; i14 < size6; i14++) {
                    m2.b bVar7 = (m2.b) arrayList.get(i14);
                    long j4 = bVar7.f11261c;
                    m2.b bVar8 = this.f17175q0;
                    fj.l.c(bVar8);
                    boolean z2 = Math.abs(b2.b.d(b2.b.e(j4, bVar8.f11261c))) > f10;
                    if (bVar7.f11267i || z2) {
                        G1(true);
                        return;
                    }
                }
                return;
            }
        }
        m2.b bVar9 = (m2.b) arrayList.get(0);
        bVar9.f11267i = true;
        long j10 = bVar9.f11260b;
        m2.b bVar10 = this.f17175q0;
        fj.l.c(bVar10);
        H1(j10, bVar10);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, java.util.List] */
    @Override // v.g, v2.w1
    public final void a0(p2.n nVar, p2.o oVar, long j) {
        super.a0(nVar, oVar, j);
        if (oVar != p2.o.f12744b) {
            if (oVar != p2.o.f12745c || this.f17168j0 == null || this.f17172n0) {
                return;
            }
            ?? r72 = nVar.f12734a;
            int size = r72.size();
            for (int i10 = 0; i10 < size; i10++) {
                p2.w wVar = (p2.w) r72.get(i10);
                if (wVar.b() && !wVar.equals(this.f17168j0)) {
                    G1(false);
                    return;
                }
            }
            return;
        }
        ti.c cVar = null;
        if (this.f17168j0 == null) {
            if (v2.e(nVar, true)) {
                p2.w wVar2 = (p2.w) nVar.f12734a.get(0);
                wVar2.a();
                this.f17168j0 = wVar2;
                if (this.O) {
                    qj.s1 s1Var = this.f17170l0;
                    if (s1Var != null && s1Var.b()) {
                        ((h2) v2.n.h(this, w2.f1.f18273t)).getClass();
                        if (wVar2.f12761b - this.f17173o0 < 40) {
                            this.f17174p0 = true;
                            return;
                        }
                        this.f17171m0 = true;
                        qj.s1 s1Var2 = this.f17170l0;
                        if (s1Var2 != null) {
                            s1Var2.e(null);
                        }
                        this.f17170l0 = null;
                    }
                    this.f17172n0 = false;
                    A1(wVar2);
                    if (this.f17164f0 != null) {
                        this.f17169k0 = qj.b0.w(e1(), null, new c0(this, cVar, 0), 3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        boolean z2 = nVar.f12736c == 2;
        ?? r73 = nVar.f12734a;
        if (z2 && !this.f17172n0 && this.O && this.f17164f0 != null) {
            qj.s1 s1Var3 = this.f17169k0;
            if (s1Var3 != null) {
                s1Var3.e(null);
            }
            this.f17169k0 = null;
            ej.a aVar = this.f17164f0;
            if (aVar != null) {
                aVar.a();
            }
            if (this.f17165g0) {
                ((k2.c) ((k2.a) v2.n.h(this, w2.f1.f18265l))).a(0);
            }
            this.f17172n0 = true;
        }
        if (this.f17172n0) {
            int size2 = r73.size();
            for (int i11 = 0; i11 < size2; i11++) {
                if (!p2.v.d((p2.w) r73.get(i11))) {
                    int size3 = r73.size();
                    for (int i12 = 0; i12 < size3; i12++) {
                        ((p2.w) r73.get(i12)).a();
                    }
                    return;
                }
            }
            p2.w wVar3 = (p2.w) r73.get(0);
            wVar3.a();
            long j4 = wVar3.f12761b;
            p2.w wVar4 = this.f17168j0;
            fj.l.c(wVar4);
            I1(j4, wVar4);
            return;
        }
        int size4 = r73.size();
        for (int i13 = 0; i13 < size4; i13++) {
            if (!p2.v.c((p2.w) r73.get(i13))) {
                long jW1 = w1(j);
                int size5 = r73.size();
                for (int i14 = 0; i14 < size5; i14++) {
                    p2.w wVar5 = (p2.w) r73.get(i14);
                    if (wVar5.b() || p2.v.f(wVar5, j, jW1)) {
                        G1(false);
                        return;
                    }
                }
                return;
            }
        }
        p2.w wVar6 = (p2.w) r73.get(0);
        wVar6.a();
        long j10 = wVar6.f12761b;
        p2.w wVar7 = this.f17168j0;
        fj.l.c(wVar7);
        I1(j10, wVar7);
    }

    @Override // v1.n
    public final void k1() {
        J1();
    }

    @Override // v.g
    public final void t1(d3.z zVar) {
        if (this.f17164f0 != null) {
            q0.k kVar = new q0.k(this, 15);
            lj.d[] dVarArr = d3.x.f4803a;
            zVar.b(d3.m.f4735c, new d3.a(null, kVar));
        }
    }

    @Override // v.g
    public final p2.p0 u1() {
        return null;
    }

    @Override // m2.c
    public final void z0() {
        G1(true);
    }
}
