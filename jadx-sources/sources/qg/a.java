package qg;

import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import p1.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f13480a;

    /* renamed from: b, reason: collision with root package name */
    public final l f13481b;

    /* renamed from: h, reason: collision with root package name */
    public ScheduledFuture f13487h;

    /* renamed from: i, reason: collision with root package name */
    public long f13488i;

    /* renamed from: g, reason: collision with root package name */
    public final Random f13486g = new Random();
    public boolean j = true;

    /* renamed from: c, reason: collision with root package name */
    public final long f13482c = 1000;

    /* renamed from: d, reason: collision with root package name */
    public final long f13483d = 30000;

    /* renamed from: f, reason: collision with root package name */
    public final double f13485f = 1.3d;

    /* renamed from: e, reason: collision with root package name */
    public final double f13484e = 0.7d;

    public a(ScheduledExecutorService scheduledExecutorService, l lVar) {
        this.f13480a = scheduledExecutorService;
        this.f13481b = lVar;
    }
}
