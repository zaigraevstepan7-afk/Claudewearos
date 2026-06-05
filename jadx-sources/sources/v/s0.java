package v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s0 extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f17278a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f17279b;

    /* renamed from: c, reason: collision with root package name */
    public int f17280c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(u0 u0Var, vi.c cVar) {
        super(cVar);
        this.f17279b = u0Var;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f17278a = obj;
        this.f17280c |= Integer.MIN_VALUE;
        return u0.r1(this.f17279b, this);
    }
}
