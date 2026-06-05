package g0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m0 extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6935a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f6936b;

    /* renamed from: c, reason: collision with root package name */
    public int f6937c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, vi.c cVar) {
        super(cVar);
        this.f6936b = n0Var;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f6935a = obj;
        this.f6937c |= Integer.MIN_VALUE;
        return this.f6936b.a(null, 0.0f, this);
    }
}
