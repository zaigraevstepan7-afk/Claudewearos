package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z1 extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public long f19774a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19775b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2 f19776c;

    /* renamed from: d, reason: collision with root package name */
    public int f19777d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(a2 a2Var, vi.c cVar) {
        super(cVar);
        this.f19776c = a2Var;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f19775b = obj;
        this.f19777d |= Integer.MIN_VALUE;
        return this.f19776c.Z0(0L, 0L, this);
    }
}
