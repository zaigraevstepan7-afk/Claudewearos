package f0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6137a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0.o f6138b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ac.d f6139c;

    public /* synthetic */ f(g0.o oVar, ac.d dVar, int i10) {
        this.f6137a = i10;
        this.f6138b = oVar;
        this.f6139c = dVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f6137a;
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                this.f6138b.c(this.f6139c, iIntValue, iIntValue2);
                break;
            default:
                this.f6138b.c(this.f6139c, iIntValue, iIntValue2);
                break;
        }
        return pi.o.f13011a;
    }
}
