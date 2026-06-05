package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i0 extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f19553a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f19554b;

    /* renamed from: c, reason: collision with root package name */
    public int f19555c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(m0 m0Var, vi.c cVar) {
        super(cVar);
        this.f19554b = m0Var;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f19553a = obj;
        this.f19555c |= Integer.MIN_VALUE;
        return m0.t1(this.f19554b, this);
    }
}
