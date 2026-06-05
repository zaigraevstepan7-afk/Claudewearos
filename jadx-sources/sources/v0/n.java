package v0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f17431a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17432b;

    /* renamed from: c, reason: collision with root package name */
    public yj.c f17433c;

    /* renamed from: d, reason: collision with root package name */
    public long f17434d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f17435e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f17436f;

    /* renamed from: z, reason: collision with root package name */
    public int f17437z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, vi.c cVar) {
        super(cVar);
        this.f17436f = pVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f17435e = obj;
        this.f17437z |= Integer.MIN_VALUE;
        return p.a(this.f17436f, null, 0L, null, this);
    }
}
