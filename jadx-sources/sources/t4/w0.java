package t4;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w0 extends b1 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f15786e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f15787f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f15788g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f15789h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f15790c;

    /* renamed from: d, reason: collision with root package name */
    public l4.b f15791d;

    public w0() {
        this.f15790c = i();
    }

    private static WindowInsets i() {
        if (!f15787f) {
            try {
                f15786e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
            }
            f15787f = true;
        }
        Field field = f15786e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
            }
        }
        if (!f15789h) {
            try {
                f15788g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
            }
            f15789h = true;
        }
        Constructor constructor = f15788g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e13) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
            }
        }
        return null;
    }

    @Override // t4.b1
    public m1 b() {
        a();
        m1 m1VarD = m1.d(null, this.f15790c);
        l4.b[] bVarArr = this.f15697b;
        j1 j1Var = m1VarD.f15751a;
        j1Var.r(bVarArr);
        j1Var.u(this.f15791d);
        return m1VarD;
    }

    @Override // t4.b1
    public void e(l4.b bVar) {
        this.f15791d = bVar;
    }

    @Override // t4.b1
    public void g(l4.b bVar) {
        WindowInsets windowInsets = this.f15790c;
        if (windowInsets != null) {
            this.f15790c = windowInsets.replaceSystemWindowInsets(bVar.f9967a, bVar.f9968b, bVar.f9969c, bVar.f9970d);
        }
    }

    public w0(m1 m1Var) {
        super(m1Var);
        this.f15790c = m1Var.c();
    }
}
