package t2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l1 extends fj.m implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15595a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v1.o f15596b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15597c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pi.c f15599e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(Object obj, v1.o oVar, pi.c cVar, int i10, int i11) {
        super(2);
        this.f15595a = i11;
        this.f15598d = obj;
        this.f15596b = oVar;
        this.f15599e = cVar;
        this.f15597c = i10;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f15595a;
        f1.i0 i0Var = (f1.i0) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                z.a((p1) this.f15598d, this.f15596b, (ej.e) this.f15599e, i0Var, f1.s.O(this.f15597c | 1));
                break;
            default:
                v3.j.b((ej.c) this.f15598d, this.f15596b, (ej.c) this.f15599e, i0Var, f1.s.O(this.f15597c | 1));
                break;
        }
        return pi.o.f13011a;
    }
}
