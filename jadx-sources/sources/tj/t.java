package tj;

/* loaded from: classes2.dex */
public final class t extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public b1.g f16444a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f16445b;

    /* renamed from: c, reason: collision with root package name */
    public int f16446c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1.g f16447d;

    /* renamed from: e, reason: collision with root package name */
    public Object f16448e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(b1.g gVar, ti.c cVar) {
        super(cVar);
        this.f16447d = gVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f16445b = obj;
        this.f16446c |= Integer.MIN_VALUE;
        return this.f16447d.b(null, this);
    }
}
