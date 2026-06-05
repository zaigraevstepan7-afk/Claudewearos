package lb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class x3 implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10816a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10817b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10818c;

    public /* synthetic */ x3(f1.a1 a1Var, f1.a1 a1Var2, int i10) {
        this.f10816a = i10;
        this.f10817b = a1Var;
        this.f10818c = a1Var2;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f10816a) {
            case 0:
                String str = (String) obj;
                fj.l.f(str, "it");
                this.f10817b.setValue(str);
                this.f10818c.setValue(null);
                break;
            default:
                t2.w wVar = (t2.w) obj;
                fj.l.f(wVar, "coordinates");
                this.f10817b.setValue(t2.z.f(wVar, true));
                this.f10818c.setValue(new s3.l(wVar.I()));
                break;
        }
        return pi.o.f13011a;
    }
}
