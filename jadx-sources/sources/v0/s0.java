package v0;

import f1.j1;
import k0.s1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s0 implements k0.b1 {

    /* renamed from: b, reason: collision with root package name */
    public g3.m0 f17473b;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u0 f17475d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f17472a = true;

    /* renamed from: c, reason: collision with root package name */
    public l7.n f17474c = v.f17513d;

    public s0(u0 u0Var) {
        this.f17475d = u0Var;
    }

    @Override // k0.b1
    public final void a(long j, l7.n nVar) {
        long j4;
        s1 s1VarD;
        s1 s1VarD2;
        u0 u0Var = this.f17475d;
        j1 j1Var = u0Var.f17501q;
        if (u0Var.k() && ((k0.j0) j1Var.getValue()) == null) {
            j1Var.setValue(k0.j0.f9135c);
            u0Var.f17503s = -1;
            this.f17472a = true;
            this.f17474c = nVar;
            u0Var.o();
            k0.t0 t0Var = u0Var.f17489d;
            if (t0Var == null || (s1VarD2 = t0Var.d()) == null || !s1VarD2.c(j)) {
                j4 = j;
                k0.t0 t0Var2 = u0Var.f17489d;
                if (t0Var2 != null && (s1VarD = t0Var2.d()) != null) {
                    int iA = u0Var.f17487b.a(s1VarD.b(j4, true));
                    l3.t tVarE = u0.e(u0Var.n().f9937a, g3.e0.b(iA, iA));
                    u0Var.h(false);
                    k2.a aVar = u0Var.j;
                    if (aVar != null) {
                        ((k2.c) aVar).a(0);
                    }
                    u0Var.f17488c.invoke(tVarE);
                    u0Var.f17506v = new g3.m0(tVarE.f9938b);
                }
                this.f17472a = false;
            } else {
                if (u0Var.n().f9937a.f7081b.length() == 0) {
                    return;
                }
                u0Var.h(false);
                long jC = u0.c(u0Var, l3.t.a(u0Var.n(), null, g3.m0.f7143b, 5), j, true, false, this.f17474c, true, new k2.b(0));
                j4 = j;
                u0Var.f17499o = new g3.m0(jC);
                this.f17473b = new g3.m0(jC);
            }
            u0Var.q(k0.k0.f9150a);
            u0Var.f17498n = j4;
            u0Var.f17502r.setValue(new b2.b(j4));
            u0Var.f17500p = 0L;
        }
    }

    @Override // k0.b1
    public final void b() {
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    @Override // k0.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r10) {
        /*
            r9 = this;
            v0.u0 r0 = r9.f17475d
            boolean r1 = r0.k()
            if (r1 == 0) goto Leb
            l3.t r1 = r0.n()
            g3.f r1 = r1.f9937a
            java.lang.String r1 = r1.f7081b
            int r1 = r1.length()
            if (r1 != 0) goto L18
            goto Leb
        L18:
            long r1 = r0.f17500p
            long r10 = b2.b.f(r1, r10)
            r0.f17500p = r10
            k0.t0 r10 = r0.f17489d
            r11 = 0
            if (r10 == 0) goto Le8
            k0.s1 r10 = r10.d()
            if (r10 == 0) goto Le8
            long r1 = r0.f17498n
            long r3 = r0.f17500p
            long r1 = b2.b.f(r1, r3)
            b2.b r3 = new b2.b
            r3.<init>(r1)
            f1.j1 r1 = r0.f17502r
            r1.setValue(r3)
            g3.m0 r1 = r0.f17499o
            r2 = 9
            if (r1 != 0) goto L96
            b2.b r1 = r0.i()
            fj.l.c(r1)
            long r3 = r1.f1500a
            boolean r1 = r10.c(r3)
            if (r1 != 0) goto L96
            l3.n r1 = r0.f17487b
            long r3 = r0.f17498n
            r5 = 1
            int r3 = r10.b(r3, r5)
            int r1 = r1.a(r3)
            l3.n r3 = r0.f17487b
            b2.b r4 = r0.i()
            fj.l.c(r4)
            long r6 = r4.f1500a
            int r10 = r10.b(r6, r5)
            int r10 = r3.a(r10)
            if (r1 != r10) goto L78
            l7.n r10 = v0.v.f17513d
        L76:
            r6 = r10
            goto L7b
        L78:
            l7.n r10 = v0.v.f17514e
            goto L76
        L7b:
            l3.t r1 = r0.n()
            b2.b r10 = r0.i()
            fj.l.c(r10)
            long r3 = r10.f1500a
            k2.b r8 = new k2.b
            r8.<init>(r2)
            r2 = r3
            r4 = 0
            r5 = 0
            r7 = 1
            long r1 = v0.u0.c(r0, r1, r2, r4, r5, r6, r7, r8)
            goto Ld7
        L96:
            g3.m0 r1 = r0.f17499o
            if (r1 == 0) goto La1
            long r3 = r1.f7145a
            r1 = 32
            long r3 = r3 >> r1
            int r1 = (int) r3
            goto La7
        La1:
            long r3 = r0.f17498n
            int r1 = r10.b(r3, r11)
        La7:
            b2.b r3 = r0.i()
            fj.l.c(r3)
            long r3 = r3.f1500a
            int r10 = r10.b(r3, r11)
            g3.m0 r3 = r0.f17499o
            if (r3 != 0) goto Lbb
            if (r1 != r10) goto Lbb
            goto Leb
        Lbb:
            l3.t r1 = r0.n()
            b2.b r10 = r0.i()
            fj.l.c(r10)
            long r3 = r10.f1500a
            l7.n r6 = r9.f17474c
            k2.b r8 = new k2.b
            r8.<init>(r2)
            r2 = r3
            r4 = 0
            r5 = 0
            r7 = 1
            long r1 = v0.u0.c(r0, r1, r2, r4, r5, r6, r7, r8)
        Ld7:
            g3.m0 r10 = new g3.m0
            r10.<init>(r1)
            r9.f17473b = r10
            g3.m0 r10 = r0.f17499o
            boolean r10 = g3.m0.a(r1, r10)
            if (r10 != 0) goto Le8
            r9.f17472a = r11
        Le8:
            r0.t(r11)
        Leb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.s0.e(long):void");
    }

    public final void f() {
        u0 u0Var = this.f17475d;
        u0Var.f17501q.setValue(null);
        u0Var.f17502r.setValue(null);
        this.f17474c = v.f17513d;
        u0Var.t(true);
        g3.m0 m0Var = this.f17473b;
        boolean zC = g3.m0.c(m0Var != null ? m0Var.f7145a : u0Var.n().f9938b);
        u0Var.q(zC ? k0.k0.f9152c : k0.k0.f9151b);
        k0.t0 t0Var = u0Var.f17489d;
        if (t0Var != null) {
            t0Var.f9275m.setValue(Boolean.valueOf(!zC && u3.a.h(u0Var, true)));
        }
        k0.t0 t0Var2 = u0Var.f17489d;
        if (t0Var2 != null) {
            t0Var2.f9276n.setValue(Boolean.valueOf(!zC && u3.a.h(u0Var, false)));
        }
        k0.t0 t0Var3 = u0Var.f17489d;
        if (t0Var3 != null) {
            t0Var3.f9277o.setValue(Boolean.valueOf(zC && u3.a.h(u0Var, true)));
        }
        if (this.f17472a) {
            u0.b(u0Var, u0Var.f17499o);
        }
        u0Var.f17499o = null;
    }

    @Override // k0.b1
    public final void onCancel() {
        f();
    }

    @Override // k0.b1
    public final void c() {
    }

    @Override // k0.b1
    public final void d() {
    }
}
