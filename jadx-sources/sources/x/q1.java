package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q1 extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f19687a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r1 f19688b;

    /* renamed from: c, reason: collision with root package name */
    public int f19689c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(r1 r1Var, vi.c cVar) {
        super(cVar);
        this.f19688b = r1Var;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f19687a = obj;
        this.f19689c |= Integer.MIN_VALUE;
        return this.f19688b.x(this);
    }
}
