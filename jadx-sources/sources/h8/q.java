package h8;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q extends vi.c {
    public int A;

    /* renamed from: a, reason: collision with root package name */
    public r8.o f7718a;

    /* renamed from: b, reason: collision with root package name */
    public r8.g f7719b;

    /* renamed from: c, reason: collision with root package name */
    public f f7720c;

    /* renamed from: d, reason: collision with root package name */
    public j f7721d;

    /* renamed from: e, reason: collision with root package name */
    public int f7722e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f7723f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ r f7724z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, vi.c cVar) {
        super(cVar);
        this.f7724z = rVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f7723f = obj;
        this.A |= Integer.MIN_VALUE;
        return this.f7724z.a(null, 0, this);
    }
}
