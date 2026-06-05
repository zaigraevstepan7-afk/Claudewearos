package q6;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public g f13284a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13285b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f13286c;

    /* renamed from: d, reason: collision with root package name */
    public int f13287d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, ti.c cVar) {
        super(cVar);
        this.f13286c = gVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f13285b = obj;
        this.f13287d |= Integer.MIN_VALUE;
        return g.c(this.f13286c, null, this);
    }
}
