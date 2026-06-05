package tj;

/* loaded from: classes2.dex */
public final class k extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16387a;

    /* renamed from: b, reason: collision with root package name */
    public int f16388b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f16389c;

    /* renamed from: d, reason: collision with root package name */
    public l f16390d;

    /* renamed from: e, reason: collision with root package name */
    public f f16391e;

    /* renamed from: f, reason: collision with root package name */
    public uj.o f16392f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, ti.c cVar) {
        super(cVar);
        this.f16389c = lVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f16387a = obj;
        this.f16388b |= Integer.MIN_VALUE;
        return this.f16389c.c(null, this);
    }
}
