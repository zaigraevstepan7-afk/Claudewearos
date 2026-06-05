package s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v extends fj.m implements ej.e {
    public final /* synthetic */ int A;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f14686a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v1.o f14687b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s0 f14688c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t0 f14689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f14690e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p1.e f14691f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f14692z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(boolean z2, v1.o oVar, s0 s0Var, t0 t0Var, String str, p1.e eVar, int i10, int i11) {
        super(2);
        this.f14686a = z2;
        this.f14687b = oVar;
        this.f14688c = s0Var;
        this.f14689d = t0Var;
        this.f14690e = str;
        this.f14691f = eVar;
        this.f14692z = i10;
        this.A = i11;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        a0.b(this.f14686a, this.f14687b, this.f14688c, this.f14689d, this.f14690e, this.f14691f, (f1.i0) obj, f1.s.O(this.f14692z | 1), this.A);
        return pi.o.f13011a;
    }
}
