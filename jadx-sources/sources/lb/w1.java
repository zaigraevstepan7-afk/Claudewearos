package lb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class w1 implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10757a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.a f10758b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10759c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f10760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10761e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10762f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ f1.q2 f10763z;

    public /* synthetic */ w1(ej.a aVar, f1.a1 a1Var, String str, f1.a1 a1Var2, f1.a1 a1Var3, f1.q2 q2Var, int i10) {
        this.f10757a = i10;
        this.f10758b = aVar;
        this.f10759c = a1Var;
        this.f10760d = str;
        this.f10761e = a1Var2;
        this.f10762f = a1Var3;
        this.f10763z = q2Var;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f10757a) {
            case 0:
                f1.a1 a1Var = this.f10759c;
                boolean zBooleanValue = ((Boolean) a1Var.getValue()).booleanValue();
                f1.a1 a1Var2 = this.f10762f;
                if (zBooleanValue) {
                    a1Var.setValue(Boolean.FALSE);
                    if (!fj.l.b((String) this.f10761e.getValue(), this.f10760d)) {
                        a1Var2.setValue(Boolean.TRUE);
                    }
                } else if (((Boolean) this.f10763z.getValue()).booleanValue()) {
                    a1Var2.setValue(Boolean.TRUE);
                } else {
                    this.f10758b.a();
                }
                break;
            default:
                f1.a1 a1Var3 = this.f10759c;
                boolean zBooleanValue2 = ((Boolean) a1Var3.getValue()).booleanValue();
                f1.a1 a1Var4 = this.f10762f;
                if (zBooleanValue2) {
                    a1Var3.setValue(Boolean.FALSE);
                    if (!fj.l.b((String) this.f10761e.getValue(), this.f10760d)) {
                        a1Var4.setValue(Boolean.TRUE);
                    }
                } else if (((Boolean) this.f10763z.getValue()).booleanValue()) {
                    a1Var4.setValue(Boolean.TRUE);
                } else {
                    this.f10758b.a();
                }
                break;
        }
        return pi.o.f13011a;
    }
}
