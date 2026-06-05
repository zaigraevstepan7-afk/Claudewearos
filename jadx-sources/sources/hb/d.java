package hb;

/* loaded from: classes.dex */
public final class d extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7785a;

    /* renamed from: b, reason: collision with root package name */
    public int f7786b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f7787c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ti.c cVar) {
        super(cVar);
        this.f7787c = eVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f7785a = obj;
        this.f7786b |= Integer.MIN_VALUE;
        return this.f7787c.b(null, this);
    }
}
