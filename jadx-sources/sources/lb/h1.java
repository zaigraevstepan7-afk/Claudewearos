package lb;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class h1 implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10319a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10320b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10321c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10322d;

    public /* synthetic */ h1(f1.a1 a1Var, f1.a1 a1Var2, f1.a1 a1Var3, int i10) {
        this.f10319a = i10;
        this.f10320b = a1Var;
        this.f10321c = a1Var2;
        this.f10322d = a1Var3;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f10319a) {
            case 0:
                q3.K(this.f10320b, this.f10321c, this.f10322d, f.f10265b);
                break;
            case 1:
                q3.K(this.f10320b, this.f10321c, this.f10322d, f.f10266c);
                break;
            case 2:
                q3.K(this.f10320b, this.f10321c, this.f10322d, f.f10267d);
                break;
            case 3:
                q3.K(this.f10320b, this.f10321c, this.f10322d, f.f10268e);
                break;
            case 4:
                this.f10320b.setValue(f.f10265b);
                Boolean bool = Boolean.TRUE;
                this.f10321c.setValue(bool);
                this.f10322d.setValue(bool);
                break;
            case 5:
                this.f10320b.setValue(va.u.f18003a);
                this.f10321c.setValue("");
                this.f10322d.setValue(Boolean.TRUE);
                break;
            case 6:
                Boolean bool2 = Boolean.FALSE;
                this.f10320b.setValue(bool2);
                this.f10321c.setValue(null);
                this.f10322d.setValue(bool2);
                break;
            case 7:
                this.f10320b.setValue(Boolean.FALSE);
                this.f10321c.setValue(va.u.f18003a);
                this.f10322d.setValue("");
                break;
            case 8:
                Boolean bool3 = Boolean.FALSE;
                this.f10320b.setValue(bool3);
                this.f10321c.setValue(null);
                this.f10322d.setValue(bool3);
                break;
            default:
                this.f10320b.setValue("");
                this.f10321c.setValue(null);
                this.f10322d.setValue(Boolean.TRUE);
                break;
        }
        return pi.o.f13011a;
    }
}
