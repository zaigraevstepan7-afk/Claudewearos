package f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class t2 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6460a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.c f6461b;

    public /* synthetic */ t2(ej.c cVar, int i10) {
        this.f6460a = i10;
        this.f6461b = cVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6460a) {
            case 0:
                this.f6461b.invoke(obj);
                break;
            case 1:
                fj.l.f((hb.h) obj, "$this$DampedDragAnimation");
                this.f6461b.invoke(Boolean.TRUE);
                break;
            default:
                p2.w wVar = (p2.w) obj;
                Float f10 = (Float) obj2;
                f10.floatValue();
                fj.l.f(wVar, "change");
                wVar.a();
                this.f6461b.invoke(f10);
                break;
        }
        return pi.o.f13011a;
    }
}
