package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g2 extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public fj.u f19534a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19535b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l2 f19536c;

    /* renamed from: d, reason: collision with root package name */
    public int f19537d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(l2 l2Var, vi.c cVar) {
        super(cVar);
        this.f19536c = l2Var;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f19535b = obj;
        this.f19537d |= Integer.MIN_VALUE;
        return this.f19536c.a(0L, this);
    }
}
