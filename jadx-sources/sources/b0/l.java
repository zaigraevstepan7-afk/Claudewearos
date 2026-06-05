package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1374a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2.f1 f1375b;

    public /* synthetic */ l(t2.f1 f1Var, int i10) {
        this.f1374a = i10;
        this.f1375b = f1Var;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        t2.e1 e1Var = (t2.e1) obj;
        switch (this.f1374a) {
            case 0:
                t2.e1.D(e1Var, this.f1375b, 0, 0);
                break;
            case 1:
                t2.e1.D(e1Var, this.f1375b, 0, 0);
                break;
            case 2:
                s3.m mVarR = e1Var.r();
                s3.m mVar = s3.m.f14752a;
                t2.f1 f1Var = this.f1375b;
                if (mVarR == mVar || e1Var.x() == 0) {
                    t2.e1.f(e1Var, f1Var);
                    f1Var.G0(s3.j.c(0L, f1Var.f15554e), 0.0f, null);
                } else {
                    long jX = ((e1Var.x() - f1Var.f15550a) - r1) << 32;
                    t2.e1.f(e1Var, f1Var);
                    f1Var.G0(s3.j.c((((int) 0) & 4294967295L) | jX, f1Var.f15554e), 0.0f, null);
                }
                return pi.o.f13011a;
            case 3:
                t2.e1.D(e1Var, this.f1375b, 0, 0);
                break;
            case 4:
                t2.e1.D(e1Var, this.f1375b, 0, 0);
                break;
            case 5:
                e1Var.z(this.f1375b, 0, 0, 0.0f);
                break;
            case 6:
                e1Var.z(this.f1375b, 0, 0, 0.0f);
                break;
            case 7:
                e1Var.z(this.f1375b, 0, 0, 0.0f);
                break;
            case 8:
                fj.l.f(e1Var, "$this$layout");
                e1Var.z(this.f1375b, 0, 0, 0.0f);
                break;
            case 9:
                e1Var.z(this.f1375b, 0, 0, 0.0f);
                break;
            case 10:
                t2.e1.D(e1Var, this.f1375b, 0, 0);
                break;
            case 11:
                t2.e1.D(e1Var, this.f1375b, 0, 0);
                break;
            case 12:
                t2.e1.D(e1Var, this.f1375b, 0, 0);
                break;
            case 13:
                e1Var.z(this.f1375b, 0, 0, 0.0f);
                break;
            default:
                e1Var.z(this.f1375b, 0, 0, 0.0f);
                break;
        }
        return pi.o.f13011a;
    }
}
