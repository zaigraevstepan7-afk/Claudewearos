package h0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public b2.c f7558a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f7559b;

    /* renamed from: c, reason: collision with root package name */
    public int f7560c;

    /* renamed from: d, reason: collision with root package name */
    public int f7561d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f7562e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f7563f;

    /* renamed from: z, reason: collision with root package name */
    public int f7564z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, vi.c cVar2) {
        super(cVar2);
        this.f7563f = cVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f7562e = obj;
        this.f7564z |= Integer.MIN_VALUE;
        return this.f7563f.a(null, this);
    }
}
