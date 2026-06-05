package y;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public ej.c f20118a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f20119b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f20120c;

    /* renamed from: d, reason: collision with root package name */
    public int f20121d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, vi.c cVar) {
        super(cVar);
        this.f20120c = gVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f20119b = obj;
        this.f20121d |= Integer.MIN_VALUE;
        return this.f20120c.c(null, 0.0f, null, this);
    }
}
