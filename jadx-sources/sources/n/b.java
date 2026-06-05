package n;

import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends v {

    /* renamed from: c, reason: collision with root package name */
    public static volatile b f11833c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f11834d = new a(0);

    /* renamed from: b, reason: collision with root package name */
    public final c f11835b = new c();

    public static b p0() {
        if (f11833c != null) {
            return f11833c;
        }
        synchronized (b.class) {
            try {
                if (f11833c == null) {
                    f11833c = new b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f11833c;
    }
}
