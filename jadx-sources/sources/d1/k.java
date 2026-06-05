package d1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4520a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f4521b;

    /* renamed from: c, reason: collision with root package name */
    public int f4522c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, vi.c cVar) {
        super(cVar);
        this.f4521b = qVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f4520a = obj;
        this.f4522c |= Integer.MIN_VALUE;
        return this.f4521b.b(null, null, this);
    }
}
