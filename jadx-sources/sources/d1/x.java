package d1;

import c1.j8;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x extends vi.h implements ej.e {
    public final /* synthetic */ j8 A;

    /* renamed from: b, reason: collision with root package name */
    public tj.b0 f4599b;

    /* renamed from: c, reason: collision with root package name */
    public p2.o f4600c;

    /* renamed from: d, reason: collision with root package name */
    public long f4601d;

    /* renamed from: e, reason: collision with root package name */
    public int f4602e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f4603f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ qj.z f4604z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(qj.z zVar, j8 j8Var, ti.c cVar) {
        super(cVar);
        this.f4604z = zVar;
        this.A = j8Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        x xVar = new x(this.f4604z, this.A, cVar);
        xVar.f4603f = obj;
        return xVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((p2.o0) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #4 {all -> 0x0019, blocks: (B:8:0x0014, B:41:0x00c5, B:43:0x00c9), top: B:55:0x0014 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12, types: [p2.o] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [tj.b0] */
    /* JADX WARN: Type inference failed for: r8v3, types: [tj.b0] */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
