package nb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public jg.d f12000a;

    /* renamed from: b, reason: collision with root package name */
    public mg.d f12001b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12002c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f12003d;

    /* renamed from: e, reason: collision with root package name */
    public int f12004e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, vi.c cVar) {
        super(cVar);
        this.f12003d = oVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f12002c = obj;
        this.f12004e |= Integer.MIN_VALUE;
        return this.f12003d.a(null, this);
    }
}
