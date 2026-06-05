package ra;

/* loaded from: classes.dex */
public final class h0 extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f14011a;

    /* renamed from: b, reason: collision with root package name */
    public int f14012b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ea.b f14013c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ea.b bVar, ti.c cVar) {
        super(cVar);
        this.f14013c = bVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f14011a = obj;
        this.f14012b |= Integer.MIN_VALUE;
        return this.f14013c.b(null, this);
    }
}
