package m5;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h extends vi.c {
    public int A;

    /* renamed from: a, reason: collision with root package name */
    public Object f11303a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11304b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11305c;

    /* renamed from: d, reason: collision with root package name */
    public fj.v f11306d;

    /* renamed from: e, reason: collision with root package name */
    public z f11307e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f11308f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ i f11309z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, vi.c cVar) {
        super(cVar);
        this.f11309z = iVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f11308f = obj;
        this.A |= Integer.MIN_VALUE;
        return this.f11309z.a(null, this);
    }
}
