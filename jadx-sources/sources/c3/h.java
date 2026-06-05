package c3;

import c1.n3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int f3091a;

    /* renamed from: b, reason: collision with root package name */
    public float f3092b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3093c;

    public h(int i10, n3 n3Var) {
        this.f3091a = i10;
        this.f3093c = n3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float a(int r6, boolean r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f3093c
            h3.j r0 = (h3.j) r0
            r1 = 1
            r2 = 0
            if (r7 == 0) goto L1d
            android.text.Layout r3 = r0.f7607f
            int r3 = h3.g.d(r3, r6, r7)
            android.text.Layout r4 = r0.f7607f
            int r4 = r4.getLineStart(r3)
            int r3 = r0.f(r3)
            if (r6 == r4) goto L1f
            if (r6 != r3) goto L1d
            goto L1f
        L1d:
            r3 = r2
            goto L20
        L1f:
            r3 = r1
        L20:
            int r4 = r6 * 4
            if (r9 == 0) goto L28
            if (r3 == 0) goto L2d
            r1 = r2
            goto L2d
        L28:
            if (r3 == 0) goto L2c
            r1 = 2
            goto L2d
        L2c:
            r1 = 3
        L2d:
            int r4 = r4 + r1
            int r1 = r5.f3091a
            if (r1 != r4) goto L35
            float r6 = r5.f3092b
            return r6
        L35:
            if (r9 == 0) goto L3c
            float r6 = r0.h(r6, r7)
            goto L40
        L3c:
            float r6 = r0.i(r6, r7)
        L40:
            if (r8 == 0) goto L46
            r5.f3091a = r4
            r5.f3092b = r6
        L46:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.h.a(int, boolean, boolean, boolean):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(float r5, vi.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof c3.g
            if (r0 == 0) goto L13
            r0 = r6
            c3.g r0 = (c3.g) r0
            int r1 = r0.f3090c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3090c = r1
            goto L18
        L13:
            c3.g r0 = new c3.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f3088a
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f3090c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            uk.c.R(r6)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            uk.c.R(r6)
            java.lang.Object r6 = r4.f3093c
            c1.n3 r6 = (c1.n3) r6
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r5)
            r0.f3090c = r3
            java.lang.Object r6 = r6.invoke(r2, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            java.lang.Number r6 = (java.lang.Number) r6
            float r5 = r6.floatValue()
            float r6 = r4.f3092b
            float r6 = r6 + r5
            r4.f3092b = r6
            pi.o r5 = pi.o.f13011a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.h.b(float, vi.c):java.lang.Object");
    }

    public h(h3.j jVar) {
        this.f3093c = jVar;
        this.f3091a = -1;
    }
}
