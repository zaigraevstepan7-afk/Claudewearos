package qa;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f13329a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f13330b;

    /* renamed from: c, reason: collision with root package name */
    public int f13331c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, vi.c cVar) {
        super(cVar);
        this.f13330b = eVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f13329a = obj;
        this.f13331c |= Integer.MIN_VALUE;
        return this.f13330b.a(this);
    }
}
