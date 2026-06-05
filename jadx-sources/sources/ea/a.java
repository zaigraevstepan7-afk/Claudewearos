package ea;

/* loaded from: classes.dex */
public final class a extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5834a;

    /* renamed from: b, reason: collision with root package name */
    public int f5835b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f5836c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ti.c cVar) {
        super(cVar);
        this.f5836c = bVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f5834a = obj;
        this.f5835b |= Integer.MIN_VALUE;
        return this.f5836c.b(null, this);
    }
}
