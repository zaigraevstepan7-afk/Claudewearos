package w6;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public String f18875a;

    /* renamed from: b, reason: collision with root package name */
    public ej.c f18876b;

    /* renamed from: c, reason: collision with root package name */
    public h f18877c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f18878d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f18879e;

    /* renamed from: f, reason: collision with root package name */
    public int f18880f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, vi.c cVar) {
        super(cVar);
        this.f18879e = yVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f18878d = obj;
        this.f18880f |= Integer.MIN_VALUE;
        return this.f18879e.b(null, null, this);
    }
}
