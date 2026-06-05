package t2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k1 extends fj.m implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v1.o f15587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.e f15588b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15589c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15590d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(v1.o oVar, ej.e eVar, int i10, int i11) {
        super(2);
        this.f15587a = oVar;
        this.f15588b = eVar;
        this.f15589c = i10;
        this.f15590d = i11;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iO = f1.s.O(this.f15589c | 1);
        int i10 = this.f15590d;
        z.b(this.f15587a, this.f15588b, (f1.i0) obj, iO, i10);
        return pi.o.f13011a;
    }
}
