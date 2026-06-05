package t2;

import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h0 implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f15570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f15571c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r0 f15573e;

    public /* synthetic */ h0(r0 r0Var, m0 m0Var, int i10, r0 r0Var2, int i11) {
        this.f15569a = i11;
        this.f15571c = m0Var;
        this.f15572d = i10;
        this.f15573e = r0Var2;
        this.f15570b = r0Var;
    }

    @Override // t2.r0
    public final Map f() {
        switch (this.f15569a) {
        }
        return this.f15570b.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    @Override // t2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.f15569a
            switch(r1) {
                case 0: goto L1e;
                default: goto L7;
            }
        L7:
            int r1 = r0.f15572d
            t2.m0 r2 = r0.f15571c
            r2.f15603d = r1
            t2.r0 r1 = r0.f15573e
            r1.g()
            v2.f0 r1 = r2.f15600a
            v2.f0 r1 = r1.A
            if (r1 != 0) goto L1d
            int r1 = r2.f15603d
            r2.g(r1)
        L1d:
            return
        L1e:
            int r1 = r0.f15572d
            t2.m0 r2 = r0.f15571c
            r2.f15604e = r1
            t2.r0 r1 = r0.f15573e
            r1.g()
            g1.e r1 = r2.F
            q.g0 r3 = r2.E
            long[] r4 = r3.f13073a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L9d
            r7 = 0
        L35:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L98
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L4f:
            if (r12 >= r10) goto L95
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L8c
            int r13 = r7 << 3
            int r13 = r13 + r12
            java.lang.Object[] r14 = r3.f13074b
            r14 = r14[r13]
            java.lang.Object[] r15 = r3.f13075c
            r15 = r15[r13]
            t2.n1 r15 = (t2.n1) r15
            int r6 = r1.j(r14)
            r17 = r11
            if (r6 < 0) goto L73
            int r11 = r2.f15604e
            if (r6 < r11) goto L8e
        L73:
            if (r6 < 0) goto L7d
            java.lang.Object[] r11 = r1.f7024a
            r18 = r11[r6]
            java.lang.Object r18 = t2.z.f15684b
            r11[r6] = r18
        L7d:
            q.g0 r6 = r2.C
            boolean r6 = r6.b(r14)
            if (r6 == 0) goto L88
            r15.a()
        L88:
            r3.l(r13)
            goto L8e
        L8c:
            r17 = r11
        L8e:
            long r8 = r8 >> r17
            int r12 = r12 + 1
            r11 = r17
            goto L4f
        L95:
            r6 = r11
            if (r10 != r6) goto L9d
        L98:
            if (r7 == r5) goto L9d
            int r7 = r7 + 1
            goto L35
        L9d:
            int r1 = r2.f15603d
            r2.g(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.h0.g():void");
    }

    @Override // t2.r0
    public final int getHeight() {
        switch (this.f15569a) {
        }
        return this.f15570b.getHeight();
    }

    @Override // t2.r0
    public final int getWidth() {
        switch (this.f15569a) {
        }
        return this.f15570b.getWidth();
    }

    @Override // t2.r0
    public final ej.c h() {
        switch (this.f15569a) {
        }
        return this.f15570b.h();
    }
}
