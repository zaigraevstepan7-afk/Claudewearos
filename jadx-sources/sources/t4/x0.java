package t4;

import android.view.WindowInsets;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class x0 extends b1 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f15797c;

    public x0() {
        this.f15797c = l7.y.g();
    }

    @Override // t4.b1
    public m1 b() {
        a();
        m1 m1VarD = m1.d(null, this.f15797c.build());
        m1VarD.f15751a.r(this.f15697b);
        return m1VarD;
    }

    @Override // t4.b1
    public void d(l4.b bVar) {
        this.f15797c.setMandatorySystemGestureInsets(bVar.e());
    }

    @Override // t4.b1
    public void e(l4.b bVar) {
        this.f15797c.setStableInsets(bVar.e());
    }

    @Override // t4.b1
    public void f(l4.b bVar) {
        this.f15797c.setSystemGestureInsets(bVar.e());
    }

    @Override // t4.b1
    public void g(l4.b bVar) {
        this.f15797c.setSystemWindowInsets(bVar.e());
    }

    @Override // t4.b1
    public void h(l4.b bVar) {
        this.f15797c.setTappableElementInsets(bVar.e());
    }

    public x0(m1 m1Var) {
        WindowInsets.Builder builderG;
        super(m1Var);
        WindowInsets windowInsetsC = m1Var.c();
        if (windowInsetsC != null) {
            builderG = l7.y.h(windowInsetsC);
        } else {
            builderG = l7.y.g();
        }
        this.f15797c = builderG;
    }
}
