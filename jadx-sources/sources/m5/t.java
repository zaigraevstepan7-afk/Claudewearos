package m5;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f11373a;

    /* renamed from: b, reason: collision with root package name */
    public p0 f11374b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f11375c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f11376d;

    /* renamed from: e, reason: collision with root package name */
    public int f11377e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(z zVar, ti.c cVar) {
        super(cVar);
        this.f11376d = zVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f11375c = obj;
        this.f11377e |= Integer.MIN_VALUE;
        return z.e(this.f11376d, false, this);
    }
}
