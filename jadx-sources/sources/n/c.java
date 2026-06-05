package n;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends v {

    /* renamed from: b, reason: collision with root package name */
    public final Object f11836b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f11837c = Executors.newFixedThreadPool(4, new h6.b(1));

    /* renamed from: d, reason: collision with root package name */
    public volatile Handler f11838d;

    public static Handler p0(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return i4.a.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
