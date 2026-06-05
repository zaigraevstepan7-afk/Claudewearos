package nb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12023a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f12024b;

    /* renamed from: c, reason: collision with root package name */
    public int f12025c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, vi.c cVar) {
        super(cVar);
        this.f12024b = oVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f12023a = obj;
        this.f12025c |= Integer.MIN_VALUE;
        return this.f12024b.j(null, null, this);
    }
}
