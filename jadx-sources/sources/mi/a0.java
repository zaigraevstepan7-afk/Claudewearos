package mi;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a0 extends vi.c {
    public int A;
    public int B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ b0 E;
    public int F;

    /* renamed from: a, reason: collision with root package name */
    public f2.b f11719a;

    /* renamed from: b, reason: collision with root package name */
    public String f11720b;

    /* renamed from: c, reason: collision with root package name */
    public d0 f11721c;

    /* renamed from: d, reason: collision with root package name */
    public String f11722d;

    /* renamed from: e, reason: collision with root package name */
    public float f11723e;

    /* renamed from: f, reason: collision with root package name */
    public int f11724f;

    /* renamed from: z, reason: collision with root package name */
    public int f11725z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, vi.c cVar) {
        super(cVar);
        this.E = b0Var;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return b0.c(this.E, null, 0.0f, this);
    }
}
