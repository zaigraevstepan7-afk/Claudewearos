package t7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f16093a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(false));

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f16094b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(true));

    /* renamed from: c, reason: collision with root package name */
    public final t f16095c;

    /* renamed from: d, reason: collision with root package name */
    public final h9.a f16096d;

    /* renamed from: e, reason: collision with root package name */
    public final p7.k f16097e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16098f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16099g;

    /* renamed from: h, reason: collision with root package name */
    public final int f16100h;

    public b(ef.f fVar) {
        String str = u.f16132a;
        this.f16095c = new t();
        this.f16096d = new h9.a(13);
        this.f16097e = new p7.k(27);
        this.f16098f = 4;
        this.f16099g = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f16100h = 20;
    }
}
