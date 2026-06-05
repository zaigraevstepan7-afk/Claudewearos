package xi;

import fj.l;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f20072a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f20073b;

    static {
        Method method;
        Method method2;
        Method[] methods = Throwable.class.getMethods();
        l.c(methods);
        int length = methods.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            method = null;
            if (i11 >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i11];
            if (l.b(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                l.e(parameterTypes, "getParameterTypes(...)");
                if (l.b(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    break;
                }
            }
            i11++;
        }
        f20072a = method2;
        int length2 = methods.length;
        while (true) {
            if (i10 >= length2) {
                break;
            }
            Method method3 = methods[i10];
            if (l.b(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
            i10++;
        }
        f20073b = method;
    }
}
