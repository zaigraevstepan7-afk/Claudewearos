package i8;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public r8.g f8386a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8387b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f8388c;

    /* renamed from: d, reason: collision with root package name */
    public int f8389d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, vi.c cVar) {
        super(cVar);
        this.f8388c = mVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f8387b = obj;
        this.f8389d |= Integer.MIN_VALUE;
        return this.f8388c.a(null, null, this);
    }
}
