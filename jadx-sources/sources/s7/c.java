package s7;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import fj.l;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements b, e, g {

    /* renamed from: c, reason: collision with root package name */
    public static final c f14768c = new c(0);

    /* renamed from: d, reason: collision with root package name */
    public static final c f14769d = new c(1);

    /* renamed from: e, reason: collision with root package name */
    public static final c f14770e = new c(2);

    /* renamed from: f, reason: collision with root package name */
    public static final c f14771f = new c(3);

    /* renamed from: g, reason: collision with root package name */
    public static final c f14772g = new c(4);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14773b;

    public /* synthetic */ c(int i10) {
        this.f14773b = i10;
    }

    @Override // s7.g
    public r7.a a(ContextWrapper contextWrapper, e eVar) {
        l.f(eVar, "densityCompatHelper");
        Context baseContext = contextWrapper;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = contextWrapper;
                break;
            }
            if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper2 = (ContextWrapper) baseContext;
            if (contextWrapper2.getBaseContext() == null) {
                break;
            }
            baseContext = contextWrapper2.getBaseContext();
            l.e(baseContext, "getBaseContext(...)");
        }
        if (baseContext instanceof Activity) {
            Activity activity = (Activity) baseContext;
            b.f14767a.getClass();
            int i10 = Build.VERSION.SDK_INT;
            return new r7.a(new q7.a((i10 >= 30 ? d.f14774b : i10 >= 29 ? f14770e : i10 >= 28 ? f14769d : f14768c).b(activity)), eVar.c(activity));
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            throw new IllegalArgumentException("Must provide a UiContext or Application Context");
        }
        Object systemService = contextWrapper.getSystemService("window");
        l.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        l.e(defaultDisplay, "getDefaultDisplay(...)");
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new r7.a(new Rect(0, 0, point.x, point.y), eVar.c(contextWrapper));
    }

    @Override // s7.b
    public Rect b(Activity activity) throws Exception {
        int i10 = this.f14773b;
        a aVar = b.f14767a;
        DisplayCutout displayCutoutM = null;
        switch (i10) {
            case 0:
                Rect rect = new Rect();
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                defaultDisplay.getRectSize(rect);
                if (!activity.isInMultiWindowMode()) {
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Resources resources = activity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    int i11 = rect.bottom + dimensionPixelSize;
                    if (i11 == point.y) {
                        rect.bottom = i11;
                    } else {
                        int i12 = rect.right + dimensionPixelSize;
                        if (i12 == point.x) {
                            rect.right = i12;
                        }
                    }
                }
                return rect;
            case 1:
                Rect rect2 = new Rect();
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    if (activity.isInMultiWindowMode()) {
                        Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                        l.d(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                        rect2.set((Rect) objInvoke);
                    } else {
                        Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                        l.d(objInvoke2, "null cannot be cast to non-null type android.graphics.Rect");
                        rect2.set((Rect) objInvoke2);
                    }
                } catch (Exception e10) {
                    if (!(e10 instanceof NoSuchFieldException) && !(e10 instanceof NoSuchMethodException) && !(e10 instanceof IllegalAccessException) && !(e10 instanceof InvocationTargetException)) {
                        throw e10;
                    }
                    aVar.getClass();
                    Log.w(a.f14766b, e10);
                    activity.getWindowManager().getDefaultDisplay().getRectSize(rect2);
                }
                Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
                Point point2 = new Point();
                defaultDisplay2.getRealSize(point2);
                if (!activity.isInMultiWindowMode()) {
                    Resources resources2 = activity.getResources();
                    int identifier2 = resources2.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize2 = identifier2 > 0 ? resources2.getDimensionPixelSize(identifier2) : 0;
                    int i13 = rect2.bottom + dimensionPixelSize2;
                    if (i13 == point2.y) {
                        rect2.bottom = i13;
                    } else {
                        int i14 = rect2.right + dimensionPixelSize2;
                        if (i14 == point2.x) {
                            rect2.right = i14;
                        } else if (rect2.left == dimensionPixelSize2) {
                            rect2.left = 0;
                        }
                    }
                }
                if ((rect2.width() < point2.x || rect2.height() < point2.y) && !activity.isInMultiWindowMode()) {
                    try {
                        Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                        constructor.setAccessible(true);
                        Object objNewInstance = constructor.newInstance(null);
                        Method declaredMethod = defaultDisplay2.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(defaultDisplay2, objNewInstance);
                        Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                        declaredField2.setAccessible(true);
                        Object obj2 = declaredField2.get(objNewInstance);
                        if (p7.e.A(obj2)) {
                            displayCutoutM = p7.e.m(obj2);
                        }
                    } catch (Exception e11) {
                        if (!(e11 instanceof ClassNotFoundException) && !(e11 instanceof NoSuchMethodException) && !(e11 instanceof NoSuchFieldException) && !(e11 instanceof IllegalAccessException) && !(e11 instanceof InvocationTargetException) && !(e11 instanceof InstantiationException)) {
                            throw e11;
                        }
                        aVar.getClass();
                        Log.w(a.f14766b, e11);
                    }
                    if (displayCutoutM != null) {
                        if (rect2.left == displayCutoutM.getSafeInsetLeft()) {
                            rect2.left = 0;
                        }
                        if (point2.x - rect2.right == displayCutoutM.getSafeInsetRight()) {
                            rect2.right = displayCutoutM.getSafeInsetRight() + rect2.right;
                        }
                        if (rect2.top == displayCutoutM.getSafeInsetTop()) {
                            rect2.top = 0;
                        }
                        if (point2.y - rect2.bottom == displayCutoutM.getSafeInsetBottom()) {
                            rect2.bottom = displayCutoutM.getSafeInsetBottom() + rect2.bottom;
                        }
                    }
                }
                return rect2;
            default:
                Configuration configuration2 = activity.getResources().getConfiguration();
                try {
                    Field declaredField3 = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField3.setAccessible(true);
                    Object obj3 = declaredField3.get(configuration2);
                    Object objInvoke3 = obj3.getClass().getDeclaredMethod("getBounds", null).invoke(obj3, null);
                    l.d(objInvoke3, "null cannot be cast to non-null type android.graphics.Rect");
                    return new Rect((Rect) objInvoke3);
                } catch (Exception e12) {
                    if (!(e12 instanceof NoSuchFieldException) && !(e12 instanceof NoSuchMethodException) && !(e12 instanceof IllegalAccessException) && !(e12 instanceof InvocationTargetException)) {
                        throw e12;
                    }
                    aVar.getClass();
                    Log.w(a.f14766b, e12);
                    return f14769d.b(activity);
                }
        }
    }

    @Override // s7.e
    public float c(ContextWrapper contextWrapper) {
        return contextWrapper.getResources().getDisplayMetrics().density;
    }
}
