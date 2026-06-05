package kk;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class e0 {

    /* renamed from: d, reason: collision with root package name */
    public static final d0 f9690d = new d0();

    /* renamed from: a, reason: collision with root package name */
    public boolean f9691a;

    /* renamed from: b, reason: collision with root package name */
    public long f9692b;

    /* renamed from: c, reason: collision with root package name */
    public long f9693c;

    public e0 a() {
        this.f9691a = false;
        return this;
    }

    public e0 b() {
        this.f9693c = 0L;
        return this;
    }

    public long c() {
        if (this.f9691a) {
            return this.f9692b;
        }
        throw new IllegalStateException("No deadline");
    }

    public e0 d(long j) {
        this.f9691a = true;
        this.f9692b = j;
        return this;
    }

    public boolean e() {
        return this.f9691a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f9691a && this.f9692b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public e0 g(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        fj.l.f(timeUnit, "unit");
        if (j < 0) {
            throw new IllegalArgumentException(m1.g(j, "timeout < 0: ").toString());
        }
        this.f9693c = timeUnit.toNanos(j);
        return this;
    }
}
