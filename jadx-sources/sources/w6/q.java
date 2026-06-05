package w6;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public long f18841a;

    /* renamed from: b, reason: collision with root package name */
    public ej.a f18842b;

    /* renamed from: c, reason: collision with root package name */
    public fj.v f18843c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f18844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f18845e;

    /* renamed from: f, reason: collision with root package name */
    public int f18846f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, vi.c cVar) {
        super(cVar);
        this.f18845e = rVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f18844d = obj;
        this.f18846f |= Integer.MIN_VALUE;
        return this.f18845e.b(0L, null, this);
    }
}
