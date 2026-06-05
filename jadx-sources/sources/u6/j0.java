package u6;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j0 extends vi.c {
    public final /* synthetic */ n0 A;
    public int B;

    /* renamed from: a, reason: collision with root package name */
    public m f16724a;

    /* renamed from: b, reason: collision with root package name */
    public String f16725b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f16726c;

    /* renamed from: d, reason: collision with root package name */
    public int f16727d;

    /* renamed from: e, reason: collision with root package name */
    public int f16728e;

    /* renamed from: f, reason: collision with root package name */
    public int f16729f;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f16730z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(n0 n0Var, vi.c cVar) {
        super(cVar);
        this.A = n0Var;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f16730z = obj;
        this.B |= Integer.MIN_VALUE;
        return n0.c(this.A, null, 0, this);
    }
}
