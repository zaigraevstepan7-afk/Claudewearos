package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k0 extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public w f19587a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19588b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f19589c;

    /* renamed from: d, reason: collision with root package name */
    public int f19590d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(m0 m0Var, vi.c cVar) {
        super(cVar);
        this.f19589c = m0Var;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f19588b = obj;
        this.f19590d |= Integer.MIN_VALUE;
        return m0.v1(this.f19589c, null, this);
    }
}
