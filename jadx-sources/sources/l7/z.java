package l7;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class z extends hj.a {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f10084f = true;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f10085g = true;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f10086h = true;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f10087i = true;

    @Override // hj.a
    public void N(View view, int i10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 28) {
            super.N(view, i10);
        } else if (f10087i) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f10087i = false;
            }
        }
    }

    public void e0(View view, int i10, int i11, int i12, int i13) {
        if (f10086h) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f10086h = false;
            }
        }
    }

    public void f0(View view, Matrix matrix) {
        if (f10084f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f10084f = false;
            }
        }
    }

    public void g0(View view, Matrix matrix) {
        if (f10085g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f10085g = false;
            }
        }
    }
}
