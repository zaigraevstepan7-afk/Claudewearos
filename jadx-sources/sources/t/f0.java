package t;

import f1.q2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f0 implements q2 {
    public final /* synthetic */ h0 A;

    /* renamed from: a, reason: collision with root package name */
    public Float f15158a;

    /* renamed from: b, reason: collision with root package name */
    public Float f15159b;

    /* renamed from: c, reason: collision with root package name */
    public final f1.j1 f15160c;

    /* renamed from: d, reason: collision with root package name */
    public c1 f15161d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15162e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15163f;

    /* renamed from: z, reason: collision with root package name */
    public long f15164z;

    public f0(h0 h0Var, Float f10, Float f11, e0 e0Var) {
        p1 p1Var = d.j;
        this.A = h0Var;
        this.f15158a = f10;
        this.f15159b = f11;
        this.f15160c = f1.s.A(f10);
        this.f15161d = new c1(e0Var, p1Var, this.f15158a, this.f15159b, null);
    }

    @Override // f1.q2
    public final Object getValue() {
        return this.f15160c.getValue();
    }
}
