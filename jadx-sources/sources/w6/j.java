package w6;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public int f18816a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f18817b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f18818c;

    /* renamed from: d, reason: collision with root package name */
    public int f18819d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, vi.c cVar) {
        super(cVar);
        this.f18818c = mVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f18817b = obj;
        this.f18819d |= Integer.MIN_VALUE;
        return this.f18818c.d(null, null, this);
    }
}
