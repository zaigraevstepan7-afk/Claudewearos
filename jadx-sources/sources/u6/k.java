package u6;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public final long[] f16732b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f16733c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f16734d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f16731a = new ReentrantLock();

    /* renamed from: e, reason: collision with root package name */
    public final ReentrantLock f16735e = new ReentrantLock();

    public k(int i10) {
        this.f16732b = new long[i10];
        this.f16733c = new boolean[i10];
    }
}
