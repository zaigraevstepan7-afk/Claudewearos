package tj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class p extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public c f16418a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f16419b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f16420c;

    /* renamed from: d, reason: collision with root package name */
    public int f16421d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(c cVar, ti.c cVar2) {
        super(cVar2);
        this.f16420c = cVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f16419b = obj;
        this.f16421d |= Integer.MIN_VALUE;
        return this.f16420c.b(null, this);
    }
}
