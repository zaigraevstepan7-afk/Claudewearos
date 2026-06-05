package k0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x0 extends vi.h implements ej.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9320b;

    /* renamed from: c, reason: collision with root package name */
    public int f9321c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9322d;

    /* renamed from: e, reason: collision with root package name */
    public Object f9323e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f9324f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(Object obj, ti.c cVar, int i10) {
        super(cVar);
        this.f9320b = i10;
        this.f9324f = obj;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [ej.e, vi.h] */
    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f9320b) {
            case 0:
                x0 x0Var = new x0((b1) this.f9324f, cVar, 0);
                x0Var.f9322d = obj;
                return x0Var;
            case 1:
                x0 x0Var2 = new x0((ti.h) this.f9323e, (ej.e) this.f9324f, cVar);
                x0Var2.f9322d = obj;
                return x0Var2;
            case 2:
                x0 x0Var3 = new x0((ej.a) this.f9324f, cVar, 2);
                x0Var3.f9323e = obj;
                return x0Var3;
            default:
                x0 x0Var4 = new x0((p2.o) this.f9323e, (fj.v) this.f9324f, cVar);
                x0Var4.f9322d = obj;
                return x0Var4;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9320b) {
            case 0:
                return ((x0) create((p2.o0) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 1:
                return ((x0) create((p2.o0) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            case 2:
                return ((x0) create((mj.g) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            default:
                return ((x0) create((p2.o0) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01c7, code lost:
    
        if (r3 == r0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e2, code lost:
    
        if (r5 != r0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        if (r2 == r0) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e A[PHI: r3 r5 r8
      0x004e: PHI (r3v16 int) = (r3v21 int), (r3v0 int) binds: [B:14:0x004b, B:11:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x004e: PHI (r5v18 p2.o0) = (r5v19 p2.o0), (r5v22 p2.o0) binds: [B:14:0x004b, B:11:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x004e: PHI (r8v5 java.lang.Object) = (r8v11 java.lang.Object), (r8v15 java.lang.Object) binds: [B:14:0x004b, B:11:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0151 A[PHI: r5
      0x0151: PHI (r5v10 ??) = (r5v25 ??), (r5v26 ??), (r5v11 ??), (r5v27 ??) binds: [B:88:0x0183, B:83:0x0170, B:76:0x0150, B:68:0x013a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0157 A[Catch: CancellationException -> 0x013e, TRY_ENTER, TryCatch #0 {CancellationException -> 0x013e, blocks: (B:79:0x0157, B:82:0x0165, B:68:0x013a, B:73:0x0145), top: B:118:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0188 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r0v12, types: [ej.e, vi.h] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x01e2 -> B:108:0x01e6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a3 -> B:35:0x00a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0110 -> B:56:0x0111). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0170 -> B:77:0x0151). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x0183 -> B:77:0x0151). Please report as a decompilation issue!!! */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.x0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(p2.o oVar, fj.v vVar, ti.c cVar) {
        super(cVar);
        this.f9320b = 3;
        this.f9323e = oVar;
        this.f9324f = vVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x0(ti.h hVar, ej.e eVar, ti.c cVar) {
        super(cVar);
        this.f9320b = 1;
        this.f9323e = hVar;
        this.f9324f = (vi.h) eVar;
    }
}
