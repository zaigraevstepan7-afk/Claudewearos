package bb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public long f1680a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1681b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f1682c;

    /* renamed from: d, reason: collision with root package name */
    public int f1683d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, vi.c cVar) {
        super(cVar);
        this.f1682c = lVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f1681b = obj;
        this.f1683d |= Integer.MIN_VALUE;
        return this.f1682c.Z0(0L, 0L, this);
    }
}
