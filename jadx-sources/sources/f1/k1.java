package f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k1 extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public ej.c f6365a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6366b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f6367c;

    /* renamed from: d, reason: collision with root package name */
    public int f6368d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(e eVar, ti.c cVar) {
        super(cVar);
        this.f6367c = eVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f6366b = obj;
        this.f6368d |= Integer.MIN_VALUE;
        return this.f6367c.a(null, this);
    }
}
