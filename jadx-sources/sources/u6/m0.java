package u6;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m0 extends vi.i implements ej.e {
    public final /* synthetic */ j[] A;
    public final /* synthetic */ n0 B;
    public final /* synthetic */ f0 C;

    /* renamed from: a, reason: collision with root package name */
    public j[] f16747a;

    /* renamed from: b, reason: collision with root package name */
    public n0 f16748b;

    /* renamed from: c, reason: collision with root package name */
    public f0 f16749c;

    /* renamed from: d, reason: collision with root package name */
    public int f16750d;

    /* renamed from: e, reason: collision with root package name */
    public int f16751e;

    /* renamed from: f, reason: collision with root package name */
    public int f16752f;

    /* renamed from: z, reason: collision with root package name */
    public int f16753z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(j[] jVarArr, n0 n0Var, f0 f0Var, ti.c cVar) {
        super(2, cVar);
        this.A = jVarArr;
        this.B = n0Var;
        this.C = f0Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        return new m0(this.A, this.B, this.C, cVar);
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((m0) create((w6.i) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (u6.n0.c(r7, r6, r11, r10) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0075 -> B:26:0x0076). Please report as a decompilation issue!!! */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            ui.a r0 = ui.a.f17085a
            int r1 = r10.f16753z
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto Lc
            if (r1 != r2) goto L1c
        Lc:
            int r1 = r10.f16752f
            int r4 = r10.f16751e
            int r5 = r10.f16750d
            u6.f0 r6 = r10.f16749c
            u6.n0 r7 = r10.f16748b
            u6.j[] r8 = r10.f16747a
            uk.c.R(r11)
            goto L58
        L1c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L24:
            uk.c.R(r11)
            u6.j[] r11 = r10.A
            int r1 = r11.length
            r4 = 0
            u6.n0 r5 = r10.B
            u6.f0 r6 = r10.C
            r8 = r11
            r11 = r4
            r7 = r5
        L32:
            if (r4 >= r1) goto L78
            r5 = r8[r4]
            int r9 = r11 + 1
            int r5 = r5.ordinal()
            if (r5 == 0) goto L75
            if (r5 == r3) goto L60
            if (r5 != r2) goto L5a
            r10.f16747a = r8
            r10.f16748b = r7
            r10.f16749c = r6
            r10.f16750d = r9
            r10.f16751e = r4
            r10.f16752f = r1
            r10.f16753z = r2
            java.lang.Object r11 = u6.n0.d(r7, r6, r11, r10)
            if (r11 != r0) goto L57
            goto L74
        L57:
            r5 = r9
        L58:
            r11 = r5
            goto L76
        L5a:
            b3.e r11 = new b3.e
            r11.<init>()
            throw r11
        L60:
            r10.f16747a = r8
            r10.f16748b = r7
            r10.f16749c = r6
            r10.f16750d = r9
            r10.f16751e = r4
            r10.f16752f = r1
            r10.f16753z = r3
            java.lang.Object r11 = u6.n0.c(r7, r6, r11, r10)
            if (r11 != r0) goto L57
        L74:
            return r0
        L75:
            r11 = r9
        L76:
            int r4 = r4 + r3
            goto L32
        L78:
            pi.o r11 = pi.o.f13011a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.m0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
