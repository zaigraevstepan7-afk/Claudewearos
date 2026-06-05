package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l0 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19605a = 0;

    /* renamed from: b, reason: collision with root package name */
    public fj.v f19606b;

    /* renamed from: c, reason: collision with root package name */
    public fj.v f19607c;

    /* renamed from: d, reason: collision with root package name */
    public int f19608d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f19609e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m0 f19610f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(fj.v vVar, m0 m0Var, ti.c cVar) {
        super(2, cVar);
        this.f19607c = vVar;
        this.f19610f = m0Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f19605a) {
            case 0:
                l0 l0Var = new l0(this.f19607c, this.f19610f, cVar);
                l0Var.f19609e = obj;
                return l0Var;
            default:
                l0 l0Var2 = new l0(this.f19610f, cVar);
                l0Var2.f19609e = obj;
                return l0Var2;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19605a) {
            case 0:
                return ((l0) create((ej.c) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
            default:
                return ((l0) create((qj.z) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:36|37|(1:94)|16|89|40|(2:46|(2:48|(1:95)))(2:42|(2:44|91))) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6 A[Catch: CancellationException -> 0x00c6, TryCatch #2 {CancellationException -> 0x00c6, blocks: (B:40:0x00b0, B:42:0x00b6, B:46:0x00c8, B:48:0x00cc), top: B:89:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8 A[Catch: CancellationException -> 0x00c6, TryCatch #2 {CancellationException -> 0x00c6, blocks: (B:40:0x00b0, B:42:0x00b6, B:46:0x00c8, B:48:0x00cc), top: B:89:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0087 -> B:21:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00c3 -> B:21:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00ca -> B:21:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00d7 -> B:21:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00e5 -> B:13:0x002c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x013b -> B:79:0x013c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0140 -> B:81:0x0141). Please report as a decompilation issue!!! */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.l0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(m0 m0Var, ti.c cVar) {
        super(2, cVar);
        this.f19610f = m0Var;
    }
}
