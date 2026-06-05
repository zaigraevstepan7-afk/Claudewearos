package rc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadPoolExecutor f14329a = new ThreadPoolExecutor(2, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 10, TimeUnit.SECONDS, new SynchronousQueue(), new b("ClientDefault", 0));

    /* renamed from: b, reason: collision with root package name */
    public static final ExecutorService f14330b = Executors.newSingleThreadExecutor(new b("ClientSingle", 0));
}
