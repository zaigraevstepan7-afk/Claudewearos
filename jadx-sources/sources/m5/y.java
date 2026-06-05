package m5;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public fj.t f11401a;

    /* renamed from: b, reason: collision with root package name */
    public int f11402b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f11403c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fj.t f11404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f11405e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f11406f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ boolean f11407z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(fj.t tVar, z zVar, Object obj, boolean z2, ti.c cVar) {
        super(2, cVar);
        this.f11404d = tVar;
        this.f11405e = zVar;
        this.f11406f = obj;
        this.f11407z = z2;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        y yVar = new y(this.f11404d, this.f11405e, this.f11406f, this.f11407z, cVar);
        yVar.f11403c = obj;
        return yVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((i0) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0077, code lost:
    
        if (r9 == r0) goto L21;
     */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.io.IOException {
        /*
            r8 = this;
            ui.a r0 = ui.a.f17085a
            int r1 = r8.f11402b
            pi.o r2 = pi.o.f13011a
            java.lang.Object r3 = r8.f11406f
            m5.z r4 = r8.f11405e
            fj.t r5 = r8.f11404d
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L2a
            if (r1 == r7) goto L20
            if (r1 != r6) goto L18
            uk.c.R(r9)
            goto L7a
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            fj.t r1 = r8.f11401a
            java.lang.Object r7 = r8.f11403c
            m5.i0 r7 = (m5.i0) r7
            uk.c.R(r9)
            goto L51
        L2a:
            uk.c.R(r9)
            java.lang.Object r9 = r8.f11403c
            m5.i0 r9 = (m5.i0) r9
            m5.o0 r1 = r4.g()
            r8.f11403c = r9
            r8.f11401a = r5
            r8.f11402b = r7
            d8.e r1 = r1.f11355b
            java.lang.Object r1 = r1.f5001a
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            int r1 = r1.incrementAndGet()
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r1)
            if (r7 != r0) goto L4d
            goto L79
        L4d:
            r1 = r7
            r7 = r9
            r9 = r1
            r1 = r5
        L51:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r1.f6805a = r9
            r9 = 0
            r8.f11403c = r9
            r8.f11401a = r9
            r8.f11402b = r6
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.f11272b
            boolean r1 = r1.get()
            if (r1 != 0) goto L93
            java.io.File r1 = r7.f11271a
            m5.w r6 = new m5.w
            r6.<init>(r7, r3, r9)
            java.lang.Object r9 = a.a.e(r1, r6, r8)
            if (r9 != r0) goto L76
            goto L77
        L76:
            r9 = r2
        L77:
            if (r9 != r0) goto L7a
        L79:
            return r0
        L7a:
            boolean r9 = r8.f11407z
            if (r9 == 0) goto L92
            m5.a0 r9 = r4.f11413f
            m5.c r0 = new m5.c
            if (r3 == 0) goto L89
            int r1 = r3.hashCode()
            goto L8a
        L89:
            r1 = 0
        L8a:
            int r4 = r5.f6805a
            r0.<init>(r1, r4, r3)
            r9.b(r0)
        L92:
            return r2
        L93:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "This scope has already been closed."
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
