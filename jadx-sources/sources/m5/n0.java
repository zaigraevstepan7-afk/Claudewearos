package m5;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n0 extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public yj.c f11345a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11346b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f11347c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o0 f11348d;

    /* renamed from: e, reason: collision with root package name */
    public int f11349e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(o0 o0Var, vi.c cVar) {
        super(cVar);
        this.f11348d = o0Var;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f11347c = obj;
        this.f11349e |= Integer.MIN_VALUE;
        return this.f11348d.c(null, this);
    }
}
