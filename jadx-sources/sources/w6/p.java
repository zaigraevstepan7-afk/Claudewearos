package w6;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f18838a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f18839b;

    /* renamed from: c, reason: collision with root package name */
    public int f18840c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, vi.c cVar) {
        super(cVar);
        this.f18839b = rVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f18838a = obj;
        this.f18840c |= Integer.MIN_VALUE;
        return this.f18839b.a(this);
    }
}
