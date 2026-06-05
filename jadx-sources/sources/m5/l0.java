package m5;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l0 extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public yj.a f11331a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11332b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a8.j f11333c;

    /* renamed from: d, reason: collision with root package name */
    public int f11334d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(a8.j jVar, vi.c cVar) {
        super(cVar);
        this.f11333c = jVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f11332b = obj;
        this.f11334d |= Integer.MIN_VALUE;
        return this.f11333c.F(this);
    }
}
