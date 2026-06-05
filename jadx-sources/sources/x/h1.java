package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h1 extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public l2 f19545a;

    /* renamed from: b, reason: collision with root package name */
    public fj.s f19546b;

    /* renamed from: c, reason: collision with root package name */
    public float f19547c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f19548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k1 f19549e;

    /* renamed from: f, reason: collision with root package name */
    public int f19550f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(k1 k1Var, vi.c cVar) {
        super(cVar);
        this.f19549e = k1Var;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f19548d = obj;
        this.f19550f |= Integer.MIN_VALUE;
        return k1.c(this.f19549e, null, null, 0.0f, 0.0f, this);
    }
}
