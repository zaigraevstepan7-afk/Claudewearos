package g0;

import x.s0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n0 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final y.g f6941a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f6942b;

    public n0(y.g gVar, h0 h0Var) {
        this.f6941a = gVar;
        this.f6942b = h0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // x.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(x.h2 r7, float r8, ti.c r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof g0.m0
            if (r0 == 0) goto L13
            r0 = r9
            g0.m0 r0 = (g0.m0) r0
            int r1 = r0.f6937c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6937c = r1
            goto L1a
        L13:
            g0.m0 r0 = new g0.m0
            vi.c r9 = (vi.c) r9
            r0.<init>(r6, r9)
        L1a:
            java.lang.Object r9 = r0.f6935a
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f6937c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            uk.c.R(r9)
            goto L46
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            uk.c.R(r9)
            ab.k r9 = new ab.k
            r2 = 19
            r9.<init>(r2, r6, r7)
            r0.f6937c = r3
            y.g r2 = r6.f6941a
            java.lang.Object r9 = r2.d(r7, r8, r9, r0)
            if (r9 != r1) goto L46
            return r1
        L46:
            java.lang.Number r9 = (java.lang.Number) r9
            float r7 = r9.floatValue()
            g0.h0 r8 = r6.f6942b
            com.google.android.gms.common.api.internal.i0 r9 = r8.f6893d
            com.google.android.gms.common.api.internal.i0 r0 = r8.f6893d
            java.lang.Object r9 = r9.f3554d
            f1.f1 r9 = (f1.f1) r9
            float r9 = r9.g()
            r1 = 0
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 != 0) goto L60
            goto La0
        L60:
            java.lang.Object r9 = r0.f3554d
            f1.f1 r9 = (f1.f1) r9
            float r9 = r9.g()
            float r9 = java.lang.Math.abs(r9)
            double r2 = (double) r9
            r4 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 >= 0) goto La0
            java.lang.Object r9 = r0.f3553c
            f1.g1 r9 = (f1.g1) r9
            int r9 = r9.g()
            x.n r0 = r8.f6899k
            boolean r0 = r0.a()
            if (r0 == 0) goto L9b
            f1.j1 r0 = r8.f6901m
            java.lang.Object r0 = r0.getValue()
            g0.z r0 = (g0.z) r0
            qj.z r0 = r0.f7011s
            g0.u r2 = new g0.u
            r3 = 2
            r4 = 0
            r2.<init>(r8, r4, r3)
            r3 = 3
            qj.b0.w(r0, r4, r2, r3)
        L9b:
            r0 = 0
            r8.s(r9, r1, r0)
            goto Lad
        La0:
            java.lang.Object r8 = r0.f3554d
            f1.f1 r8 = (f1.f1) r8
            float r8 = r8.g()
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r8)
        Lad:
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.n0.a(x.h2, float, ti.c):java.lang.Object");
    }
}
