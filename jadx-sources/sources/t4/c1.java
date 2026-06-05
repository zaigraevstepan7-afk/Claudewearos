package t4;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class c1 extends j1 {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f15701i = false;
    public static Method j;

    /* renamed from: k, reason: collision with root package name */
    public static Class f15702k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f15703l;

    /* renamed from: m, reason: collision with root package name */
    public static Field f15704m;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f15705c;

    /* renamed from: d, reason: collision with root package name */
    public l4.b[] f15706d;

    /* renamed from: e, reason: collision with root package name */
    public l4.b f15707e;

    /* renamed from: f, reason: collision with root package name */
    public m1 f15708f;

    /* renamed from: g, reason: collision with root package name */
    public l4.b f15709g;

    /* renamed from: h, reason: collision with root package name */
    public int f15710h;

    public c1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var);
        this.f15707e = null;
        this.f15705c = windowInsets;
    }

    @SuppressLint({"PrivateApi"})
    private static void B() throws ClassNotFoundException, SecurityException {
        try {
            j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f15702k = cls;
            f15703l = cls.getDeclaredField("mVisibleInsets");
            f15704m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f15703l.setAccessible(true);
            f15704m.setAccessible(true);
        } catch (ReflectiveOperationException e10) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
        }
        f15701i = true;
    }

    public static boolean C(int i10, int i11) {
        return (i10 & 6) == (i11 & 6);
    }

    @SuppressLint({"WrongConstant"})
    private l4.b w(int i10, boolean z2) {
        l4.b bVarA = l4.b.f9966e;
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                bVarA = l4.b.a(bVarA, x(i11, z2));
            }
        }
        return bVarA;
    }

    private l4.b y() {
        m1 m1Var = this.f15708f;
        return m1Var != null ? m1Var.f15751a.j() : l4.b.f9966e;
    }

    private l4.b z(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f15701i) {
            B();
        }
        Method method = j;
        if (method != null && f15702k != null && f15703l != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f15703l.get(f15704m.get(objInvoke));
                if (rect != null) {
                    return l4.b.c(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
        }
        return null;
    }

    public boolean A(int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 8 && i10 != 128) {
                return true;
            }
        }
        return !x(i10, false).equals(l4.b.f9966e);
    }

    @Override // t4.j1
    public void d(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        l4.b bVarZ = z(view);
        if (bVarZ == null) {
            bVarZ = l4.b.f9966e;
        }
        s(bVarZ);
    }

    @Override // t4.j1
    public void e(m1 m1Var) {
        m1Var.f15751a.t(this.f15708f);
        l4.b bVar = this.f15709g;
        j1 j1Var = m1Var.f15751a;
        j1Var.s(bVar);
        j1Var.v(this.f15710h);
    }

    @Override // t4.j1
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return Objects.equals(this.f15709g, c1Var.f15709g) && C(this.f15710h, c1Var.f15710h);
    }

    @Override // t4.j1
    public l4.b g(int i10) {
        return w(i10, false);
    }

    @Override // t4.j1
    public l4.b h(int i10) {
        return w(i10, true);
    }

    @Override // t4.j1
    public final l4.b l() {
        if (this.f15707e == null) {
            WindowInsets windowInsets = this.f15705c;
            this.f15707e = l4.b.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f15707e;
    }

    @Override // t4.j1
    public m1 n(int i10, int i11, int i12, int i13) {
        m1 m1VarD = m1.d(null, this.f15705c);
        int i14 = Build.VERSION.SDK_INT;
        b1 a1Var = i14 >= 34 ? new a1(m1VarD) : i14 >= 31 ? new z0(m1VarD) : i14 >= 30 ? new y0(m1VarD) : i14 >= 29 ? new x0(m1VarD) : new w0(m1VarD);
        a1Var.g(m1.b(l(), i10, i11, i12, i13));
        a1Var.e(m1.b(j(), i10, i11, i12, i13));
        return a1Var.b();
    }

    @Override // t4.j1
    public boolean p() {
        return this.f15705c.isRound();
    }

    @Override // t4.j1
    @SuppressLint({"WrongConstant"})
    public boolean q(int i10) {
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0 && !A(i11)) {
                return false;
            }
        }
        return true;
    }

    @Override // t4.j1
    public void r(l4.b[] bVarArr) {
        this.f15706d = bVarArr;
    }

    @Override // t4.j1
    public void s(l4.b bVar) {
        this.f15709g = bVar;
    }

    @Override // t4.j1
    public void t(m1 m1Var) {
        this.f15708f = m1Var;
    }

    @Override // t4.j1
    public void v(int i10) {
        this.f15710h = i10;
    }

    public l4.b x(int i10, boolean z2) {
        l4.b bVarJ;
        int i11;
        l4.b bVar = l4.b.f9966e;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 8) {
                    l4.b[] bVarArr = this.f15706d;
                    bVarJ = bVarArr != null ? bVarArr[x8.a.J(8)] : null;
                    if (bVarJ != null) {
                        return bVarJ;
                    }
                    l4.b bVarL = l();
                    l4.b bVarY = y();
                    int i12 = bVarL.f9970d;
                    if (i12 > bVarY.f9970d) {
                        return l4.b.c(0, 0, 0, i12);
                    }
                    l4.b bVar2 = this.f15709g;
                    if (bVar2 != null && !bVar2.equals(bVar) && (i11 = this.f15709g.f9970d) > bVarY.f9970d) {
                        return l4.b.c(0, 0, 0, i11);
                    }
                } else {
                    if (i10 == 16) {
                        return k();
                    }
                    if (i10 == 32) {
                        return i();
                    }
                    if (i10 == 64) {
                        return m();
                    }
                    if (i10 == 128) {
                        m1 m1Var = this.f15708f;
                        i iVarF = m1Var != null ? m1Var.f15751a.f() : f();
                        if (iVarF != null) {
                            int i13 = Build.VERSION.SDK_INT;
                            return l4.b.c(i13 >= 28 ? i4.a.k(iVarF.f15731a) : 0, i13 >= 28 ? i4.a.m(iVarF.f15731a) : 0, i13 >= 28 ? i4.a.l(iVarF.f15731a) : 0, i13 >= 28 ? i4.a.j(iVarF.f15731a) : 0);
                        }
                    }
                }
            } else {
                if (z2) {
                    l4.b bVarY2 = y();
                    l4.b bVarJ2 = j();
                    return l4.b.c(Math.max(bVarY2.f9967a, bVarJ2.f9967a), 0, Math.max(bVarY2.f9969c, bVarJ2.f9969c), Math.max(bVarY2.f9970d, bVarJ2.f9970d));
                }
                if ((this.f15710h & 2) == 0) {
                    l4.b bVarL2 = l();
                    m1 m1Var2 = this.f15708f;
                    bVarJ = m1Var2 != null ? m1Var2.f15751a.j() : null;
                    int iMin = bVarL2.f9970d;
                    if (bVarJ != null) {
                        iMin = Math.min(iMin, bVarJ.f9970d);
                    }
                    return l4.b.c(bVarL2.f9967a, 0, bVarL2.f9969c, iMin);
                }
            }
        } else {
            if (z2) {
                return l4.b.c(0, Math.max(y().f9968b, l().f9968b), 0, 0);
            }
            if ((this.f15710h & 4) == 0) {
                return l4.b.c(0, l().f9968b, 0, 0);
            }
        }
        return bVar;
    }

    public c1(m1 m1Var, c1 c1Var) {
        this(m1Var, new WindowInsets(c1Var.f15705c));
    }
}
