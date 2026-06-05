package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l5 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public int f2382a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t.c f2383b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f2384c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f2385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z.j f2386e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f2387f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(t.c cVar, float f10, boolean z2, z.j jVar, f1.a1 a1Var, ti.c cVar2) {
        super(2, cVar2);
        this.f2383b = cVar;
        this.f2384c = f10;
        this.f2385d = z2;
        this.f2386e = jVar;
        this.f2387f = a1Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        return new l5(this.f2383b, this.f2384c, this.f2385d, this.f2386e, this.f2387f, cVar);
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((l5) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (r8.f(r1, r7) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (d1.i0.a(r8, r6, r1, r2, r7) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        return r0;
     */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            ui.a r0 = ui.a.f17085a
            int r1 = r7.f2382a
            z.j r2 = r7.f2386e
            f1.a1 r3 = r7.f2387f
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L1d
            if (r1 == r5) goto L19
            if (r1 != r4) goto L11
            goto L19
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L19:
            uk.c.R(r8)
            goto L55
        L1d:
            uk.c.R(r8)
            t.c r8 = r7.f2383b
            f1.j1 r1 = r8.f15111e
            java.lang.Object r1 = r1.getValue()
            s3.f r1 = (s3.f) r1
            float r1 = r1.f14742a
            float r6 = r7.f2384c
            boolean r1 = s3.f.e(r1, r6)
            if (r1 != 0) goto L58
            boolean r1 = r7.f2385d
            if (r1 != 0) goto L46
            s3.f r1 = new s3.f
            r1.<init>(r6)
            r7.f2382a = r5
            java.lang.Object r8 = r8.f(r1, r7)
            if (r8 != r0) goto L55
            goto L54
        L46:
            java.lang.Object r1 = r3.getValue()
            z.j r1 = (z.j) r1
            r7.f2382a = r4
            java.lang.Object r8 = d1.i0.a(r8, r6, r1, r2, r7)
            if (r8 != r0) goto L55
        L54:
            return r0
        L55:
            r3.setValue(r2)
        L58:
            pi.o r8 = pi.o.f13011a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.l5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
