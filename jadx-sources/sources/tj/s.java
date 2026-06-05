package tj;

/* loaded from: classes2.dex */
public final class s extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16439a;

    /* renamed from: b, reason: collision with root package name */
    public int f16440b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f16441c;

    /* renamed from: d, reason: collision with root package name */
    public b1.g f16442d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(n nVar, ti.c cVar) {
        super(cVar);
        this.f16441c = nVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f16439a = obj;
        this.f16440b |= Integer.MIN_VALUE;
        return this.f16441c.c(null, this);
    }
}
