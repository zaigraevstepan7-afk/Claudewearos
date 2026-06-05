package ra;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m1 extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public fj.s f14083a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f14084b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1 f14085c;

    /* renamed from: d, reason: collision with root package name */
    public int f14086d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(n1 n1Var, vi.c cVar) {
        super(cVar);
        this.f14085c = n1Var;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f14084b = obj;
        this.f14086d |= Integer.MIN_VALUE;
        return this.f14085c.v0(0L, this);
    }
}
