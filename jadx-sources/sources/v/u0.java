package v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u0 extends v1.n implements v2.w1 {
    public z.k H;
    public z.h I;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q1(v.u0 r4, vi.c r5) {
        /*
            boolean r0 = r5 instanceof v.r0
            if (r0 == 0) goto L13
            r0 = r5
            v.r0 r0 = (v.r0) r0
            int r1 = r0.f17277d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17277d = r1
            goto L18
        L13:
            v.r0 r0 = new v.r0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f17275b
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f17277d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            z.h r0 = r0.f17274a
            uk.c.R(r5)
            goto L4b
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            uk.c.R(r5)
            z.h r5 = r4.I
            if (r5 != 0) goto L4d
            z.h r5 = new z.h
            r5.<init>()
            z.k r2 = r4.H
            r0.f17274a = r5
            r0.f17277d = r3
            java.lang.Object r0 = r2.a(r5, r0)
            if (r0 != r1) goto L4a
            return r1
        L4a:
            r0 = r5
        L4b:
            r4.I = r0
        L4d:
            pi.o r4 = pi.o.f13011a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: v.u0.q1(v.u0, vi.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r1(v.u0 r4, vi.c r5) {
        /*
            boolean r0 = r5 instanceof v.s0
            if (r0 == 0) goto L13
            r0 = r5
            v.s0 r0 = (v.s0) r0
            int r1 = r0.f17280c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17280c = r1
            goto L18
        L13:
            v.s0 r0 = new v.s0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f17278a
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f17280c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            uk.c.R(r5)
            goto L46
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            uk.c.R(r5)
            z.h r5 = r4.I
            if (r5 == 0) goto L49
            z.i r2 = new z.i
            r2.<init>(r5)
            z.k r5 = r4.H
            r0.f17280c = r3
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            r5 = 0
            r4.I = r5
        L49:
            pi.o r4 = pi.o.f13011a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: v.u0.r1(v.u0, vi.c):java.lang.Object");
    }

    @Override // v2.w1
    public final void V() {
        s1();
    }

    @Override // v2.w1
    public final void a0(p2.n nVar, p2.o oVar, long j) {
        if (oVar == p2.o.f12744b) {
            int i10 = nVar.f12739f;
            ti.c cVar = null;
            if (i10 == 4) {
                qj.b0.w(e1(), null, new t0(this, cVar, 0), 3);
            } else if (i10 == 5) {
                qj.b0.w(e1(), null, new t0(this, cVar, 1), 3);
            }
        }
    }

    @Override // v1.n
    public final void j1() {
        s1();
    }

    public final void s1() {
        z.h hVar = this.I;
        if (hVar != null) {
            this.H.b(new z.i(hVar));
            this.I = null;
        }
    }
}
