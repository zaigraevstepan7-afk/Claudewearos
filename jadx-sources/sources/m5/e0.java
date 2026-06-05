package m5;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e0 extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f11282a;

    /* renamed from: b, reason: collision with root package name */
    public c0 f11283b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f11284c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g0 f11285d;

    /* renamed from: e, reason: collision with root package name */
    public int f11286e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var, vi.c cVar) {
        super(cVar);
        this.f11285d = g0Var;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f11284c = obj;
        this.f11286e |= Integer.MIN_VALUE;
        return this.f11285d.a(null, this);
    }
}
