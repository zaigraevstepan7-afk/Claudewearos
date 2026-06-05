package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f1148a = yd.f.L(Application.class, o0.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List f1149b = yd.f.K(o0.class);

    public static final Constructor a(Class cls, List list) throws SecurityException {
        fj.l.f(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        fj.l.e(constructors, "getConstructors(...)");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            fj.l.e(parameterTypes, "getParameterTypes(...)");
            List listV0 = qi.k.v0(parameterTypes);
            if (list.equals(listV0)) {
                return constructor;
            }
            if (list.size() == listV0.size() && listV0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final x0 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (x0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
        }
    }
}
