package m5;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11357a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f11358b;

    /* renamed from: c, reason: collision with root package name */
    public int f11359c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(z zVar, vi.c cVar) {
        super(cVar);
        this.f11358b = zVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f11357a = obj;
        this.f11359c |= Integer.MIN_VALUE;
        z.b(this.f11358b, this);
        throw null;
    }
}
