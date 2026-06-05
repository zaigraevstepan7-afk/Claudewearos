package c3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f3089b;

    /* renamed from: c, reason: collision with root package name */
    public int f3090c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, vi.c cVar) {
        super(cVar);
        this.f3089b = hVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f3088a = obj;
        this.f3090c |= Integer.MIN_VALUE;
        return this.f3089b.b(0.0f, this);
    }
}
