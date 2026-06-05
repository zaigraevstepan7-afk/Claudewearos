package v0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t0 extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public u0 f17479a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17480b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f17481c;

    /* renamed from: d, reason: collision with root package name */
    public int f17482d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, vi.c cVar) {
        super(cVar);
        this.f17481c = u0Var;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f17480b = obj;
        this.f17482d |= Integer.MIN_VALUE;
        return this.f17481c.s(this);
    }
}
