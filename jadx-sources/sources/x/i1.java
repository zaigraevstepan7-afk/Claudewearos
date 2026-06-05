package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i1 extends vi.i implements ej.e {
    public final /* synthetic */ fj.v A;
    public final /* synthetic */ float B;
    public final /* synthetic */ k1 C;
    public final /* synthetic */ float D;
    public final /* synthetic */ l2 E;

    /* renamed from: a, reason: collision with root package name */
    public fj.r f19556a;

    /* renamed from: b, reason: collision with root package name */
    public fj.r f19557b;

    /* renamed from: c, reason: collision with root package name */
    public int f19558c;

    /* renamed from: d, reason: collision with root package name */
    public int f19559d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f19560e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fj.s f19561f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ fj.v f19562z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(fj.s sVar, fj.v vVar, fj.v vVar2, float f10, k1 k1Var, float f11, l2 l2Var, ti.c cVar) {
        super(2, cVar);
        this.f19561f = sVar;
        this.f19562z = vVar;
        this.A = vVar2;
        this.B = f10;
        this.C = k1Var;
        this.D = f11;
        this.E = l2Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        i1 i1Var = new i1(this.f19561f, this.f19562z, this.A, this.B, this.C, this.D, this.E, cVar);
        i1Var.f19560e = obj;
        return i1Var;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((i1) create((j2) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c9 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0184 -> B:37:0x0185). Please report as a decompilation issue!!! */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.i1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
