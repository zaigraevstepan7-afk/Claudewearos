package f6;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import lh.e;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final e f6645a = new e();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f6646b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f6647c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f6648d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                m6.a.p(autoCloseable);
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }
}
