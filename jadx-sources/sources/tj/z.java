package tj;

/* loaded from: classes2.dex */
public final class z extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16468a;

    /* renamed from: b, reason: collision with root package name */
    public int f16469b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1.g f16470c;

    /* renamed from: d, reason: collision with root package name */
    public Object f16471d;

    /* renamed from: e, reason: collision with root package name */
    public f f16472e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(b1.g gVar, ti.c cVar) {
        super(cVar);
        this.f16470c = gVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f16468a = obj;
        this.f16469b |= Integer.MIN_VALUE;
        return this.f16470c.b(null, this);
    }
}
