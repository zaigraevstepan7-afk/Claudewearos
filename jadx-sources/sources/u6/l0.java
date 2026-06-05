package u6;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l0 extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public qh.c f16743a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f16744b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n0 f16745c;

    /* renamed from: d, reason: collision with root package name */
    public int f16746d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n0 n0Var, vi.c cVar) {
        super(cVar);
        this.f16745c = n0Var;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f16744b = obj;
        this.f16746d |= Integer.MIN_VALUE;
        return this.f16745c.e(this);
    }
}
