package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i implements ej.e {
    public final /* synthetic */ long A;
    public final /* synthetic */ ej.e B;
    public final /* synthetic */ p1.e C;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ej.e f2212a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.e f2213b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c2.w0 f2214c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f2215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f2216e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f2217f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ long f2218z;

    public i(ej.e eVar, ej.e eVar2, c2.w0 w0Var, long j, float f10, long j4, long j10, long j11, ej.e eVar3, p1.e eVar4) {
        this.f2212a = eVar;
        this.f2213b = eVar2;
        this.f2214c = w0Var;
        this.f2215d = j;
        this.f2216e = f10;
        this.f2217f = j4;
        this.f2218z = j10;
        this.A = j11;
        this.B = eVar3;
        this.C = eVar4;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        f1.i0 i0Var = (f1.i0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            j.a(p1.j.d(1367541877, new h(this.B, this.C, 1), i0Var), null, this.f2212a, this.f2213b, this.f2214c, this.f2215d, this.f2216e, x0.d(e1.m.f5558a, i0Var), this.f2217f, this.f2218z, this.A, i0Var, 6);
        } else {
            i0Var.W();
        }
        return pi.o.f13011a;
    }
}
