package m5;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x extends vi.c {

    /* renamed from: a, reason: collision with root package name */
    public fj.t f11397a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11398b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f11399c;

    /* renamed from: d, reason: collision with root package name */
    public int f11400d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, vi.c cVar) {
        super(cVar);
        this.f11399c = zVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        this.f11398b = obj;
        this.f11400d |= Integer.MIN_VALUE;
        return this.f11399c.i(null, false, this);
    }
}
