package m;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f11158a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f11159b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f11160c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f11161d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f11158a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f11159b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f11160c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f11161d = true;
        } catch (NoSuchMethodException e10) {
            e10.printStackTrace();
        }
    }
}
