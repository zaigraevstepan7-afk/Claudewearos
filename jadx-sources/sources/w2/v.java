package w2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public q.w f18436a;

    /* renamed from: b, reason: collision with root package name */
    public sj.b f18437b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f18438c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f18439d;

    /* renamed from: e, reason: collision with root package name */
    public int f18440e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y yVar, vi.c cVar) {
        super(cVar);
        this.f18439d = yVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f18438c = obj;
        this.f18440e |= Integer.MIN_VALUE;
        return this.f18439d.l(this);
    }
}
