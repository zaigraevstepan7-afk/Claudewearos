package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m1 extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f19629a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f19630b;

    /* renamed from: c, reason: collision with root package name */
    public int f19631c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(n1 n1Var, vi.c cVar) {
        super(cVar);
        this.f19630b = n1Var;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f19629a = obj;
        this.f19631c |= Integer.MIN_VALUE;
        return this.f19630b.b(null, this);
    }
}
