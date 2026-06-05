package g0;

import f1.f1;
import f1.g1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6858a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f6859b;

    public /* synthetic */ e(h0 h0Var, int i10) {
        this.f6858a = i10;
        this.f6859b = h0Var;
    }

    @Override // ej.a
    public final Object a() {
        int iL;
        switch (this.f6858a) {
            case 0:
                iL = this.f6859b.l();
                break;
            case 1:
                iL = this.f6859b.l();
                break;
            case 2:
                h0 h0Var = this.f6859b;
                return Integer.valueOf(h0Var.f6899k.a() ? h0Var.f6906r.g() : ((g1) h0Var.f6893d.f3553c).g());
            case 3:
                h0 h0Var2 = this.f6859b;
                g1 g1Var = h0Var2.f6905q;
                boolean zA = h0Var2.f6899k.a();
                com.google.android.gms.common.api.internal.i0 i0Var = h0Var2.f6893d;
                iL = h0Var2.j(!zA ? ((g1) i0Var.f3553c).g() : g1Var.g() != -1 ? g1Var.g() : Math.abs(((f1) i0Var.f3554d).g()) >= Math.abs(Math.min(h0Var2.f6902n.w0(l0.f6930a), ((float) h0Var2.m()) / 2.0f) / ((float) h0Var2.m())) ? ((Boolean) h0Var2.E.getValue()).booleanValue() ? h0Var2.f6894e + 1 : h0Var2.f6894e : ((g1) i0Var.f3553c).g());
                break;
            case 4:
                iL = this.f6859b.l();
                break;
            case 5:
                h0 h0Var3 = this.f6859b;
                return Boolean.valueOf(((g1) h0Var3.f6893d.f3553c).g() == 0 && ((f1) h0Var3.f6893d.f3554d).g() >= 0.0f);
            default:
                h0 h0Var4 = this.f6859b;
                return Boolean.valueOf(((g1) h0Var4.f6893d.f3553c).g() == h0Var4.l() - 1 && ((f1) h0Var4.f6893d.f3554d).g() <= 0.0f);
        }
        return Integer.valueOf(iL);
    }
}
