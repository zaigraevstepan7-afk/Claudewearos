package y;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f20125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f20126b;

    /* renamed from: c, reason: collision with root package name */
    public int f20127c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, vi.c cVar) {
        super(cVar);
        this.f20126b = gVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f20125a = obj;
        this.f20127c |= Integer.MIN_VALUE;
        return this.f20126b.d(null, 0.0f, null, this);
    }
}
