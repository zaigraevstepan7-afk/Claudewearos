package l7;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final z f10082a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f10083b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f10082a = new a0();
        } else {
            f10082a = new z();
        }
        f10083b = new b(Float.class, "translationAlpha", 5);
        new b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i10, int i11, int i12, int i13) {
        f10082a.e0(view, i10, i11, i12, i13);
    }

    public static void b(View view, int i10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        f10082a.N(view, i10);
    }
}
