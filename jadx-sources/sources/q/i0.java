package q;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i0 extends vi.h implements ej.e {
    public int A;
    public long B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ j0 E;
    public final /* synthetic */ mj.e F;

    /* renamed from: b, reason: collision with root package name */
    public mj.e f13087b;

    /* renamed from: c, reason: collision with root package name */
    public j0 f13088c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f13089d;

    /* renamed from: e, reason: collision with root package name */
    public int f13090e;

    /* renamed from: f, reason: collision with root package name */
    public int f13091f;

    /* renamed from: z, reason: collision with root package name */
    public int f13092z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, mj.e eVar, ti.c cVar) {
        super(cVar);
        this.E = j0Var;
        this.F = eVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        i0 i0Var = new i0(this.E, this.F, cVar);
        i0Var.D = obj;
        return i0Var;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) create((mj.g) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0052 -> B:22:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0054 -> B:14:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0070 -> B:19:0x0097). Please report as a decompilation issue!!! */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            ui.a r1 = ui.a.f17085a
            int r2 = r0.C
            r3 = 0
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L2f
            if (r2 != r5) goto L27
            int r2 = r0.A
            int r6 = r0.f13092z
            long r7 = r0.B
            int r9 = r0.f13091f
            int r10 = r0.f13090e
            long[] r11 = r0.f13089d
            q.j0 r12 = r0.f13088c
            mj.e r13 = r0.f13087b
            java.lang.Object r14 = r0.D
            mj.g r14 = (mj.g) r14
            uk.c.R(r22)
            goto L97
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2f:
            uk.c.R(r22)
            java.lang.Object r2 = r0.D
            mj.g r2 = (mj.g) r2
            q.j0 r6 = r0.E
            q.h0 r7 = r6.f13095b
            long[] r7 = r7.f13081a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto La7
            mj.e r9 = r0.F
            r10 = r3
        L44:
            r11 = r7[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto La2
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r2
            r2 = r3
            r19 = r11
            r12 = r6
            r11 = r7
            r6 = r13
            r13 = r9
            r9 = r10
            r10 = r8
            r7 = r19
        L67:
            if (r2 >= r6) goto L9a
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L97
            int r3 = r9 << 3
            int r3 = r3 + r2
            r13.f11822c = r3
            q.h0 r4 = r12.f13095b
            java.lang.Object[] r4 = r4.f13082b
            r3 = r4[r3]
            r0.D = r14
            r0.f13087b = r13
            r0.f13088c = r12
            r0.f13089d = r11
            r0.f13090e = r10
            r0.f13091f = r9
            r0.B = r7
            r0.f13092z = r6
            r0.A = r2
            r0.C = r5
            r14.b(r3, r0)
            ui.a r2 = ui.a.f17085a
            return r1
        L97:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L67
        L9a:
            if (r6 != r4) goto La7
            r8 = r10
            r7 = r11
            r6 = r12
            r2 = r14
            r10 = r9
            r9 = r13
        La2:
            if (r10 == r8) goto La7
            int r10 = r10 + 1
            goto L44
        La7:
            pi.o r1 = pi.o.f13011a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q.i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
