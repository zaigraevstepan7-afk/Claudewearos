package v0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g0 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17393a;

    /* renamed from: b, reason: collision with root package name */
    public int f17394b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t.c f17395c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f17396d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(t.c cVar, long j, ti.c cVar2, int i10) {
        super(2, cVar2);
        this.f17393a = i10;
        this.f17395c = cVar;
        this.f17396d = j;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f17393a) {
            case 0:
                return new g0(this.f17395c, this.f17396d, cVar, 0);
            default:
                return new g0(this.f17395c, this.f17396d, cVar, 1);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f17393a) {
        }
        return ((g0) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (qj.b0.i(r12.f17396d, r12) == r0) goto L16;
     */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.f17393a
            switch(r0) {
                case 0: goto L78;
                default: goto L5;
            }
        L5:
            ui.a r0 = ui.a.f17085a
            int r1 = r12.f17394b
            r2 = 3
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L29
            if (r1 == r3) goto L25
            if (r1 == r4) goto L21
            if (r1 != r2) goto L19
            uk.c.R(r13)
            r6 = r12
            goto L75
        L19:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L21:
            uk.c.R(r13)
            goto L4b
        L25:
            uk.c.R(r13)
            goto L40
        L29:
            uk.c.R(r13)
            java.lang.Float r13 = new java.lang.Float
            r1 = 1058642330(0x3f19999a, float:0.6)
            r13.<init>(r1)
            r12.f17394b = r3
            t.c r1 = r12.f17395c
            java.lang.Object r13 = r1.f(r13, r12)
            if (r13 != r0) goto L40
        L3e:
            r6 = r12
            goto L77
        L40:
            r12.f17394b = r4
            long r5 = r12.f17396d
            java.lang.Object r13 = qj.b0.i(r5, r12)
            if (r13 != r0) goto L4b
            goto L3e
        L4b:
            java.lang.Float r6 = new java.lang.Float
            r13 = 1065353216(0x3f800000, float:1.0)
            r6.<init>(r13)
            t.s r1 = new t.s
            r3 = 1042536202(0x3e23d70a, float:0.16)
            r5 = 1050253722(0x3e99999a, float:0.3)
            r1.<init>(r3, r13, r5, r13)
            r13 = 400(0x190, float:5.6E-43)
            r3 = 0
            t.o1 r7 = t.d.t(r13, r3, r1, r4)
            r12.f17394b = r2
            t.c r5 = r12.f17395c
            r8 = 0
            r9 = 0
            r11 = 12
            r10 = r12
            java.lang.Object r13 = t.c.d(r5, r6, r7, r8, r9, r10, r11)
            r6 = r10
            if (r13 != r0) goto L75
            goto L77
        L75:
            pi.o r0 = pi.o.f13011a
        L77:
            return r0
        L78:
            r6 = r12
            ui.a r0 = ui.a.f17085a
            int r1 = r6.f17394b
            r2 = 1
            if (r1 == 0) goto L8e
            if (r1 != r2) goto L86
            uk.c.R(r13)
            goto Laa
        L86:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L8e:
            uk.c.R(r13)
            r13 = r2
            b2.b r2 = new b2.b
            long r3 = r6.f17396d
            r2.<init>(r3)
            t.u0 r3 = v0.h0.f17400d
            r6.f17394b = r13
            t.c r1 = r6.f17395c
            r4 = 0
            r5 = 0
            r7 = 12
            java.lang.Object r13 = t.c.d(r1, r2, r3, r4, r5, r6, r7)
            if (r13 != r0) goto Laa
            goto Lac
        Laa:
            pi.o r0 = pi.o.f13011a
        Lac:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
