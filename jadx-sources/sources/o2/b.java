package o2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12371a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f12372b;

    /* renamed from: c, reason: collision with root package name */
    public int f12373c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, vi.c cVar) {
        super(cVar);
        this.f12372b = dVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f12371a = obj;
        this.f12373c |= Integer.MIN_VALUE;
        return this.f12372b.a(0L, 0L, this);
    }
}
