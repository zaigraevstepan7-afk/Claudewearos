package k8;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public yj.e f9460a;

    /* renamed from: b, reason: collision with root package name */
    public int f9461b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f9462c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f9463d;

    /* renamed from: e, reason: collision with root package name */
    public int f9464e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, vi.c cVar) {
        super(cVar);
        this.f9463d = eVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f9462c = obj;
        this.f9464e |= Integer.MIN_VALUE;
        return this.f9463d.a(this);
    }
}
