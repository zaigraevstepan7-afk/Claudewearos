package tj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class n0 extends vi.i implements ej.f {

    /* renamed from: a, reason: collision with root package name */
    public int f16411a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ f f16412b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f16413c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o0 f16414d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(o0 o0Var, ti.c cVar) {
        super(3, cVar);
        this.f16414d = o0Var;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        n0 n0Var = new n0(this.f16414d, (ti.c) obj3);
        n0Var.f16412b = (f) obj;
        n0Var.f16413c = iIntValue;
        return n0Var.invokeSuspend(pi.o.f13011a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r1.b(r8, r7) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        if (r1.b(r8, r7) != r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062 A[PHI: r1
      0x0062: PHI (r1v3 tj.f) = (r1v2 tj.f), (r1v6 tj.f) binds: [B:25:0x005f, B:13:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072 A[PHI: r1
      0x0072: PHI (r1v4 tj.f) = (r1v3 tj.f), (r1v7 tj.f) binds: [B:28:0x006f, B:12:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            ui.a r0 = ui.a.f17085a
            int r1 = r7.f16411a
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L34
            if (r1 == r6) goto L30
            if (r1 == r5) goto L2a
            if (r1 == r4) goto L24
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            goto L30
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            tj.f r1 = r7.f16412b
            uk.c.R(r8)
            goto L72
        L24:
            tj.f r1 = r7.f16412b
            uk.c.R(r8)
            goto L62
        L2a:
            tj.f r1 = r7.f16412b
            uk.c.R(r8)
            goto L55
        L30:
            uk.c.R(r8)
            goto L80
        L34:
            uk.c.R(r8)
            tj.f r1 = r7.f16412b
            int r8 = r7.f16413c
            if (r8 <= 0) goto L48
            tj.k0 r8 = tj.k0.f16393a
            r7.f16411a = r6
            java.lang.Object r8 = r1.b(r8, r7)
            if (r8 != r0) goto L80
            goto L7f
        L48:
            r7.f16412b = r1
            r7.f16411a = r5
            r5 = 0
            java.lang.Object r8 = qj.b0.i(r5, r7)
            if (r8 != r0) goto L55
            goto L7f
        L55:
            tj.k0 r8 = tj.k0.f16394b
            r7.f16412b = r1
            r7.f16411a = r4
            java.lang.Object r8 = r1.b(r8, r7)
            if (r8 != r0) goto L62
            goto L7f
        L62:
            r7.f16412b = r1
            r7.f16411a = r3
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r8 = qj.b0.i(r3, r7)
            if (r8 != r0) goto L72
            goto L7f
        L72:
            tj.k0 r8 = tj.k0.f16395c
            r3 = 0
            r7.f16412b = r3
            r7.f16411a = r2
            java.lang.Object r8 = r1.b(r8, r7)
            if (r8 != r0) goto L80
        L7f:
            return r0
        L80:
            pi.o r8 = pi.o.f13011a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tj.n0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
