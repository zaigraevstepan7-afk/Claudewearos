package f0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class t0 implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6192a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f6193b;

    public /* synthetic */ t0(w0 w0Var, int i10) {
        this.f6192a = i10;
        this.f6193b = w0Var;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f6192a) {
            case 0:
                b0 b0Var = (b0) this.f6193b.H.a();
                int iA = b0Var.a();
                int i10 = 0;
                while (true) {
                    if (i10 >= iA) {
                        i10 = -1;
                    } else if (!b0Var.b(i10).equals(obj)) {
                        i10++;
                    }
                }
                return Integer.valueOf(i10);
            default:
                int iIntValue = ((Integer) obj).intValue();
                w0 w0Var = this.f6193b;
                b0 b0Var2 = (b0) w0Var.H.a();
                if (iIntValue < 0 || iIntValue >= b0Var2.a()) {
                    StringBuilder sbP = gk.b.p(iIntValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    sbP.append(b0Var2.a());
                    sbP.append(')');
                    a0.a.a(sbP.toString());
                }
                qj.b0.w(w0Var.e1(), null, new v0(w0Var, iIntValue, null, 0), 3);
                return Boolean.TRUE;
        }
    }
}
