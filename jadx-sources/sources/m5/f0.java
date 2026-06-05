package m5;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f0 extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f11289a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11290b;

    /* renamed from: c, reason: collision with root package name */
    public i0 f11291c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f11292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0 f11293e;

    /* renamed from: f, reason: collision with root package name */
    public int f11294f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, vi.c cVar) {
        super(cVar);
        this.f11293e = g0Var;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f11292d = obj;
        this.f11294f |= Integer.MIN_VALUE;
        return this.f11293e.b(null, this);
    }
}
