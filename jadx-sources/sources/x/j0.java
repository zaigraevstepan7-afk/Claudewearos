package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j0 extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public v f19571a;

    /* renamed from: b, reason: collision with root package name */
    public z.b f19572b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f19573c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0 f19574d;

    /* renamed from: e, reason: collision with root package name */
    public int f19575e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(m0 m0Var, vi.c cVar) {
        super(cVar);
        this.f19574d = m0Var;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f19573c = obj;
        this.f19575e |= Integer.MIN_VALUE;
        return m0.u1(this.f19574d, null, this);
    }
}
