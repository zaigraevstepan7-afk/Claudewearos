package v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public long f17201a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17202b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f17203c;

    /* renamed from: d, reason: collision with root package name */
    public int f17204d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, vi.c cVar) {
        super(cVar);
        this.f17203c = iVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f17202b = obj;
        this.f17204d |= Integer.MIN_VALUE;
        return this.f17203c.b(0L, null, this);
    }
}
