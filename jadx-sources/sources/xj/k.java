package xj;

import java.util.concurrent.TimeUnit;
import vj.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f20102a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f20103b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f20104c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f20105d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f20106e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f20107f;

    static {
        String property;
        int i10 = t.f18123a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f20102a = property;
        f20103b = vj.b.k("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = t.f18123a;
        if (i11 < 2) {
            i11 = 2;
        }
        f20104c = vj.b.l(i11, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f20105d = vj.b.l(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f20106e = TimeUnit.SECONDS.toNanos(vj.b.k("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f20107f = g.f20097a;
    }
}
