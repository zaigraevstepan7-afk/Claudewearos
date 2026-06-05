package tj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public uj.o f16339a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f16340b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m5.n f16341c;

    /* renamed from: d, reason: collision with root package name */
    public int f16342d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(m5.n nVar, ti.c cVar) {
        super(cVar);
        this.f16341c = nVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f16340b = obj;
        this.f16342d |= Integer.MIN_VALUE;
        return this.f16341c.c(null, this);
    }
}
