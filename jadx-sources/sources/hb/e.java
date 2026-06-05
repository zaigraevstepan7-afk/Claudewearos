package hb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e implements tj.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tj.f f7788a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f7789b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f7790c;

    public e(tj.f fVar, h hVar, float f10) {
        this.f7788a = fVar;
        this.f7789b = hVar;
        this.f7790c = f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // tj.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5, ti.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof hb.d
            if (r0 == 0) goto L13
            r0 = r6
            hb.d r0 = (hb.d) r0
            int r1 = r0.f7786b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7786b = r1
            goto L18
        L13:
            hb.d r0 = new hb.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f7785a
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f7786b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            uk.c.R(r6)
            goto L5f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            uk.c.R(r6)
            r6 = r5
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            hb.h r2 = r4.f7789b
            t.c r2 = r2.f7807l
            f1.j1 r2 = r2.f15111e
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r6 = r6 - r2
            float r6 = java.lang.Math.abs(r6)
            float r2 = r4.f7790c
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 >= 0) goto L5f
            r0.f7786b = r3
            tj.f r6 = r4.f7788a
            java.lang.Object r5 = r6.b(r5, r0)
            if (r5 != r1) goto L5f
            return r1
        L5f:
            pi.o r5 = pi.o.f13011a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: hb.e.b(java.lang.Object, ti.c):java.lang.Object");
    }
}
