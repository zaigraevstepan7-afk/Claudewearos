package u6;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k0 extends vi.c {
    public int A;

    /* renamed from: a, reason: collision with root package name */
    public m f16736a;

    /* renamed from: b, reason: collision with root package name */
    public String f16737b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f16738c;

    /* renamed from: d, reason: collision with root package name */
    public int f16739d;

    /* renamed from: e, reason: collision with root package name */
    public int f16740e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f16741f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ n0 f16742z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(n0 n0Var, vi.c cVar) {
        super(cVar);
        this.f16742z = n0Var;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f16741f = obj;
        this.A |= Integer.MIN_VALUE;
        return n0.d(this.f16742z, null, 0, this);
    }
}
