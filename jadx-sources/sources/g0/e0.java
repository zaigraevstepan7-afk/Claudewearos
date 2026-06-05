package g0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e0 extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public int f6860a;

    /* renamed from: b, reason: collision with root package name */
    public t.j f6861b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6862c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0 f6863d;

    /* renamed from: e, reason: collision with root package name */
    public int f6864e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(h0 h0Var, vi.c cVar) {
        super(cVar);
        this.f6863d = h0Var;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f6862c = obj;
        this.f6864e |= Integer.MIN_VALUE;
        return this.f6863d.f(0, null, this);
    }
}
