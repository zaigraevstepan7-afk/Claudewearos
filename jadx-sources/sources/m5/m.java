package m5;

/* loaded from: classes.dex */
public final class m extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11335a;

    /* renamed from: b, reason: collision with root package name */
    public int f11336b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ea.b f11337c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ea.b bVar, ti.c cVar) {
        super(cVar);
        this.f11337c = bVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f11335a = obj;
        this.f11336b |= Integer.MIN_VALUE;
        return this.f11337c.b(null, this);
    }
}
