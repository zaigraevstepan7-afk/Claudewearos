package tj;

/* loaded from: classes2.dex */
public final class i extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16375a;

    /* renamed from: b, reason: collision with root package name */
    public int f16376b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f16377c;

    /* renamed from: d, reason: collision with root package name */
    public Object f16378d;

    /* renamed from: e, reason: collision with root package name */
    public f f16379e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, ti.c cVar) {
        super(cVar);
        this.f16377c = jVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f16375a = obj;
        this.f16376b |= Integer.MIN_VALUE;
        return this.f16377c.c(null, this);
    }
}
