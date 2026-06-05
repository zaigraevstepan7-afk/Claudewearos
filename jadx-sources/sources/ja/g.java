package ja;

/* loaded from: classes.dex */
public final class g extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8772a;

    /* renamed from: b, reason: collision with root package name */
    public int f8773b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f8774c;

    /* renamed from: d, reason: collision with root package name */
    public tj.f f8775d;

    /* renamed from: e, reason: collision with root package name */
    public int f8776e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c cVar, ti.c cVar2) {
        super(cVar2);
        this.f8774c = cVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f8772a = obj;
        this.f8773b |= Integer.MIN_VALUE;
        return this.f8774c.b(null, this);
    }
}
