package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public int f2922a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t.c f2923b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f2924c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f2925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z.j f2926e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(t.c cVar, float f10, boolean z2, z4 z4Var, z.j jVar, ti.c cVar2) {
        super(2, cVar2);
        this.f2923b = cVar;
        this.f2924c = f10;
        this.f2925d = z2;
        this.f2926e = jVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        return new z(this.f2923b, this.f2924c, this.f2925d, null, this.f2926e, cVar);
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (r8.f(r1, r7) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        if (d1.i0.a(r8, r4, r1, r7.f2926e, r7) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
    
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
            int r1 = r7.f2922a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L15:
            uk.c.R(r8)
            goto L81
        L19:
            uk.c.R(r8)
            t.c r8 = r7.f2923b
            f1.j1 r1 = r8.f15111e
            java.lang.Object r1 = r1.getValue()
            s3.f r1 = (s3.f) r1
            float r1 = r1.f14742a
            float r4 = r7.f2924c
            boolean r1 = s3.f.e(r1, r4)
            if (r1 != 0) goto L81
            boolean r1 = r7.f2925d
            if (r1 != 0) goto L42
            s3.f r1 = new s3.f
            r1.<init>(r4)
            r7.f2922a = r3
            java.lang.Object r8 = r8.f(r1, r7)
            if (r8 != r0) goto L81
            goto L80
        L42:
            f1.j1 r1 = r8.f15111e
            java.lang.Object r1 = r1.getValue()
            s3.f r1 = (s3.f) r1
            float r1 = r1.f14742a
            r3 = 0
            boolean r3 = s3.f.e(r1, r3)
            if (r3 == 0) goto L5b
            z.m r1 = new z.m
            r5 = 0
            r1.<init>(r5)
            goto L76
        L5b:
            r3 = 0
            boolean r3 = s3.f.e(r1, r3)
            if (r3 == 0) goto L68
            z.h r1 = new z.h
            r1.<init>()
            goto L76
        L68:
            r3 = 0
            boolean r1 = s3.f.e(r1, r3)
            if (r1 == 0) goto L75
            z.d r1 = new z.d
            r1.<init>()
            goto L76
        L75:
            r1 = 0
        L76:
            r7.f2922a = r2
            z.j r2 = r7.f2926e
            java.lang.Object r8 = d1.i0.a(r8, r4, r1, r2, r7)
            if (r8 != r0) goto L81
        L80:
            return r0
        L81:
            pi.o r8 = pi.o.f13011a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
