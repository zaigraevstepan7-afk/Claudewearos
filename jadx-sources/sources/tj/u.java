package tj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class u extends vi.i implements ej.f {

    /* renamed from: a, reason: collision with root package name */
    public int f16450a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ f f16451b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f16452c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi.i f16453d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u(ej.e eVar, ti.c cVar) {
        super(3, cVar);
        this.f16453d = (vi.i) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ej.e, vi.i] */
    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        u uVar = new u(this.f16453d, (ti.c) obj3);
        uVar.f16451b = (f) obj;
        uVar.f16452c = obj2;
        return uVar.invokeSuspend(pi.o.f13011a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r1.b(r5, r4) == r0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r3v1, types: [ej.e, vi.i] */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            ui.a r0 = ui.a.f17085a
            int r1 = r4.f16450a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            uk.c.R(r5)
            goto L3e
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            tj.f r1 = r4.f16451b
            uk.c.R(r5)
            goto L32
        L1e:
            uk.c.R(r5)
            tj.f r1 = r4.f16451b
            java.lang.Object r5 = r4.f16452c
            r4.f16451b = r1
            r4.f16450a = r3
            vi.i r3 = r4.f16453d
            java.lang.Object r5 = r3.invoke(r5, r4)
            if (r5 != r0) goto L32
            goto L3d
        L32:
            r3 = 0
            r4.f16451b = r3
            r4.f16450a = r2
            java.lang.Object r5 = r1.b(r5, r4)
            if (r5 != r0) goto L3e
        L3d:
            return r0
        L3e:
            pi.o r5 = pi.o.f13011a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tj.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
