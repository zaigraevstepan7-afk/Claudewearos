package ra;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k1 extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public long f14058a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f14059b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1 f14060c;

    /* renamed from: d, reason: collision with root package name */
    public int f14061d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(n1 n1Var, vi.c cVar) {
        super(cVar);
        this.f14060c = n1Var;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f14059b = obj;
        this.f14061d |= Integer.MIN_VALUE;
        return this.f14060c.Z0(0L, 0L, this);
    }
}
