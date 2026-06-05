package tj;

/* loaded from: classes2.dex */
public final class w extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public b1.g f16455a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f16456b;

    /* renamed from: c, reason: collision with root package name */
    public int f16457c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1.g f16458d;

    /* renamed from: e, reason: collision with root package name */
    public Object f16459e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(b1.g gVar, ti.c cVar) {
        super(cVar);
        this.f16458d = gVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f16456b = obj;
        this.f16457c |= Integer.MIN_VALUE;
        return this.f16458d.b(null, this);
    }
}
