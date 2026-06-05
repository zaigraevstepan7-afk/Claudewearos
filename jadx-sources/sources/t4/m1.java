package t4;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: b, reason: collision with root package name */
    public static final m1 f15750b;

    /* renamed from: a, reason: collision with root package name */
    public final j1 f15751a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            f15750b = i1.f15732s;
        } else if (i10 >= 30) {
            f15750b = g1.f15730r;
        } else {
            f15750b = j1.f15738b;
        }
    }

    public m1(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            this.f15751a = new i1(this, windowInsets);
            return;
        }
        if (i10 >= 31) {
            this.f15751a = new h1(this, windowInsets);
            return;
        }
        if (i10 >= 30) {
            this.f15751a = new g1(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f15751a = new f1(this, windowInsets);
        } else if (i10 >= 28) {
            this.f15751a = new e1(this, windowInsets);
        } else {
            this.f15751a = new d1(this, windowInsets);
        }
    }

    public static l4.b b(l4.b bVar, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, bVar.f9967a - i10);
        int iMax2 = Math.max(0, bVar.f9968b - i11);
        int iMax3 = Math.max(0, bVar.f9969c - i12);
        int iMax4 = Math.max(0, bVar.f9970d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? bVar : l4.b.c(iMax, iMax2, iMax3, iMax4);
    }

    public static m1 d(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        m1 m1Var = new m1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = l0.f15744a;
            m1 m1VarA = e0.a(view);
            j1 j1Var = m1Var.f15751a;
            j1Var.t(m1VarA);
            j1Var.d(view.getRootView());
            j1Var.v(view.getWindowSystemUiVisibility());
        }
        return m1Var;
    }

    public final int a() {
        return this.f15751a.l().f9968b;
    }

    public final WindowInsets c() {
        j1 j1Var = this.f15751a;
        if (j1Var instanceof c1) {
            return ((c1) j1Var).f15705c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m1) {
            return Objects.equals(this.f15751a, ((m1) obj).f15751a);
        }
        return false;
    }

    public final int hashCode() {
        j1 j1Var = this.f15751a;
        if (j1Var == null) {
            return 0;
        }
        return j1Var.hashCode();
    }

    public m1(m1 m1Var) {
        if (m1Var != null) {
            j1 j1Var = m1Var.f15751a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34 && (j1Var instanceof i1)) {
                this.f15751a = new i1(this, (i1) j1Var);
            } else if (i10 >= 31 && (j1Var instanceof h1)) {
                this.f15751a = new h1(this, (h1) j1Var);
            } else if (i10 >= 30 && (j1Var instanceof g1)) {
                this.f15751a = new g1(this, (g1) j1Var);
            } else if (i10 >= 29 && (j1Var instanceof f1)) {
                this.f15751a = new f1(this, (f1) j1Var);
            } else if (i10 >= 28 && (j1Var instanceof e1)) {
                this.f15751a = new e1(this, (e1) j1Var);
            } else if (j1Var instanceof d1) {
                this.f15751a = new d1(this, (d1) j1Var);
            } else if (j1Var instanceof c1) {
                this.f15751a = new c1(this, (c1) j1Var);
            } else {
                this.f15751a = new j1(this);
            }
            j1Var.e(this);
            return;
        }
        this.f15751a = new j1(this);
    }
}
