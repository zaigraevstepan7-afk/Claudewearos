package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class r1 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2630a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v1.o f2631b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f2632c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f2633d;

    public /* synthetic */ r1(v1.o oVar, float f10, long j, int i10, int i11) {
        this.f2630a = i11;
        this.f2631b = oVar;
        this.f2632c = f10;
        this.f2633d = j;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2630a) {
            case 0:
                ((Integer) obj2).getClass();
                int iO = f1.s.O(439);
                z4.d(this.f2631b, this.f2632c, this.f2633d, (f1.i0) obj, iO);
                break;
            default:
                ((Integer) obj2).getClass();
                int iO2 = f1.s.O(385);
                z4.j(this.f2631b, this.f2632c, this.f2633d, (f1.i0) obj, iO2);
                break;
        }
        return pi.o.f13011a;
    }
}
