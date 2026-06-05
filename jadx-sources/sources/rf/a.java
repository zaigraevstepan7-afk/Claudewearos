package rf;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f14378a = Logger.getLogger(a.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f14379b = new AtomicBoolean(false);

    public static boolean a() {
        return f14379b.get();
    }
}
