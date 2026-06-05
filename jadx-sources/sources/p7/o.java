package p7;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final p f12820a;

    static {
        p hVar;
        try {
            hVar = new ld.i((WebViewProviderFactoryBoundaryInterface) mk.b.k(WebViewProviderFactoryBoundaryInterface.class, x8.a.x()), 15);
        } catch (ClassNotFoundException unused) {
            hVar = new h();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
        f12820a = hVar;
    }
}
