package t4;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class j1 {

    /* renamed from: b, reason: collision with root package name */
    public static final m1 f15738b;

    /* renamed from: a, reason: collision with root package name */
    public final m1 f15739a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f15738b = (i10 >= 34 ? new a1() : i10 >= 31 ? new z0() : i10 >= 30 ? new y0() : i10 >= 29 ? new x0() : new w0()).b().f15751a.a().f15751a.b().f15751a.c();
    }

    public j1(m1 m1Var) {
        this.f15739a = m1Var;
    }

    public m1 a() {
        return this.f15739a;
    }

    public m1 b() {
        return this.f15739a;
    }

    public m1 c() {
        return this.f15739a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return p() == j1Var.p() && o() == j1Var.o() && Objects.equals(l(), j1Var.l()) && Objects.equals(j(), j1Var.j()) && Objects.equals(f(), j1Var.f());
    }

    public i f() {
        return null;
    }

    public l4.b g(int i10) {
        return l4.b.f9966e;
    }

    public l4.b h(int i10) {
        if ((i10 & 8) == 0) {
            return l4.b.f9966e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
    }

    public l4.b i() {
        return l();
    }

    public l4.b j() {
        return l4.b.f9966e;
    }

    public l4.b k() {
        return l();
    }

    public l4.b l() {
        return l4.b.f9966e;
    }

    public l4.b m() {
        return l();
    }

    public m1 n(int i10, int i11, int i12, int i13) {
        return f15738b;
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        return false;
    }

    public boolean q(int i10) {
        return true;
    }

    public void d(View view) {
    }

    public void e(m1 m1Var) {
    }

    public void r(l4.b[] bVarArr) {
    }

    public void s(l4.b bVar) {
    }

    public void t(m1 m1Var) {
    }

    public void u(l4.b bVar) {
    }

    public void v(int i10) {
    }
}
