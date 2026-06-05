package y;

import t.u;
import t.u0;
import x.h2;
import x.s0;
import x.u1;
import x.w2;
import x.y1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final q5.b f20131a;

    /* renamed from: b, reason: collision with root package name */
    public final u f20132b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f20133c;

    /* renamed from: d, reason: collision with root package name */
    public final u1 f20134d = y1.f19763c;

    public g(q5.b bVar, u uVar, u0 u0Var) {
        this.f20131a = bVar;
        this.f20132b = uVar;
        this.f20133c = u0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(y.g r4, x.s1 r5, float r6, float r7, y.d r8, vi.c r9) {
        /*
            boolean r0 = r9 instanceof y.f
            if (r0 == 0) goto L14
            r0 = r9
            y.f r0 = (y.f) r0
            int r1 = r0.f20130c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f20130c = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            y.f r0 = new y.f
            r0.<init>(r4, r9)
            goto L12
        L1a:
            java.lang.Object r0 = r9.f20128a
            ui.a r1 = ui.a.f17085a
            int r2 = r9.f20130c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            uk.c.R(r0)
            goto L84
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            uk.c.R(r0)
            float r0 = java.lang.Math.abs(r6)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L3e
            goto L46
        L3e:
            float r0 = java.lang.Math.abs(r7)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L4d
        L46:
            r4 = 28
            t.k r4 = t.d.b(r6, r7, r4)
            return r4
        L4d:
            r9.f20130c = r3
            t.u r0 = r4.f20132b
            float r2 = t.d.i(r0, r2, r7)
            float r2 = java.lang.Math.abs(r2)
            float r3 = java.lang.Math.abs(r6)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L69
            w2.s1 r4 = new w2.s1
            r2 = 5
            r4.<init>(r0, r2)
        L67:
            r0 = r6
            goto L72
        L69:
            y.n r0 = new y.n
            t.u0 r4 = r4.f20133c
            r0.<init>(r4)
            r4 = r0
            goto L67
        L72:
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r0)
            r0 = r7
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r0)
            java.lang.Object r0 = r4.a(r5, r6, r7, r8, r9)
            if (r0 != r1) goto L84
            return r1
        L84:
            y.a r0 = (y.a) r0
            t.k r4 = r0.f20117b
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y.g.b(y.g, x.s1, float, float, y.d, vi.c):java.lang.Object");
    }

    @Override // x.s0
    public Object a(h2 h2Var, float f10, ti.c cVar) {
        return d(h2Var, f10, w2.f19747a, (vi.c) cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(x.s1 r11, float r12, ej.c r13, vi.c r14) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r14 instanceof y.c
            if (r0 == 0) goto L13
            r0 = r14
            y.c r0 = (y.c) r0
            int r1 = r0.f20121d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20121d = r1
            goto L18
        L13:
            y.c r0 = new y.c
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f20119b
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f20121d
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            ej.c r13 = r0.f20118a
            uk.c.R(r14)
            r5 = r10
            goto L4d
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            uk.c.R(r14)
            x.l r4 = new x.l
            r9 = 0
            r5 = r10
            r8 = r11
            r6 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f20118a = r7
            r0.f20121d = r3
            x.u1 r11 = r5.f20134d
            java.lang.Object r14 = qj.b0.G(r11, r4, r0)
            if (r14 != r1) goto L4c
            return r1
        L4c:
            r13 = r7
        L4d:
            y.a r14 = (y.a) r14
            java.lang.Float r11 = new java.lang.Float
            r12 = 0
            r11.<init>(r12)
            r13.invoke(r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: y.g.c(x.s1, float, ej.c, vi.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(x.s1 r5, float r6, ej.c r7, vi.c r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof y.e
            if (r0 == 0) goto L13
            r0 = r8
            y.e r0 = (y.e) r0
            int r1 = r0.f20127c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20127c = r1
            goto L18
        L13:
            y.e r0 = new y.e
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f20125a
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f20127c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            uk.c.R(r8)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            uk.c.R(r8)
            r0.f20127c = r3
            java.lang.Object r8 = r4.c(r5, r6, r7, r0)
            if (r8 != r1) goto L3b
            return r1
        L3b:
            y.a r8 = (y.a) r8
            java.lang.Float r5 = r8.f20116a
            float r5 = r5.floatValue()
            t.k r6 = r8.f20117b
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L4b
            goto L55
        L4b:
            java.lang.Object r5 = r6.b()
            java.lang.Number r5 = (java.lang.Number) r5
            float r7 = r5.floatValue()
        L55:
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: y.g.d(x.s1, float, ej.c, vi.c):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return gVar.f20133c.equals(this.f20133c) && fj.l.b(gVar.f20132b, this.f20132b) && gVar.f20131a.equals(this.f20131a);
    }

    public final int hashCode() {
        return this.f20131a.hashCode() + ((this.f20132b.hashCode() + (this.f20133c.hashCode() * 31)) * 31);
    }
}
