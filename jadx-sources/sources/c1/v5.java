package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class v5 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2772a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1.n f2773b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fj.s f2774c;

    public /* synthetic */ v5(d1.n nVar, fj.s sVar, int i10) {
        this.f2772a = i10;
        this.f2773b = nVar;
        this.f2774c = sVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f2772a;
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        switch (i10) {
            case 0:
                d1.q qVar = this.f2773b.f4543a;
                qVar.j.h(fFloatValue);
                qVar.f4563k.h(fFloatValue2);
                this.f2774c.f6804a = fFloatValue;
                break;
            default:
                d1.q qVar2 = this.f2773b.f4543a;
                qVar2.j.h(fFloatValue);
                qVar2.f4563k.h(fFloatValue2);
                this.f2774c.f6804a = fFloatValue;
                break;
        }
        return pi.o.f13011a;
    }
}
