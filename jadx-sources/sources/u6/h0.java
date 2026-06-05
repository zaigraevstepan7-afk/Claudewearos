package u6;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h0 extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public qh.c f16711a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f16712b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n0 f16713c;

    /* renamed from: d, reason: collision with root package name */
    public int f16714d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(n0 n0Var, vi.c cVar) {
        super(cVar);
        this.f16713c = n0Var;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f16712b = obj;
        this.f16714d |= Integer.MIN_VALUE;
        return n0.b(this.f16713c, this);
    }
}
