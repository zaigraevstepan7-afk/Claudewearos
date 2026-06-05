package tj;

/* loaded from: classes2.dex */
public final class m extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f16402a;

    /* renamed from: b, reason: collision with root package name */
    public int f16403b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f16404c;

    /* renamed from: d, reason: collision with root package name */
    public n f16405d;

    /* renamed from: e, reason: collision with root package name */
    public f f16406e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, ti.c cVar) {
        super(cVar);
        this.f16404c = nVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f16402a = obj;
        this.f16403b |= Integer.MIN_VALUE;
        return this.f16404c.c(null, this);
    }
}
