package rh;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import ph.j;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final long f14512d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    public static final long f14513e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final j f14514a;

    /* renamed from: b, reason: collision with root package name */
    public long f14515b;

    /* renamed from: c, reason: collision with root package name */
    public int f14516c;

    public d() {
        if (h9.a.f7740c == null) {
            Pattern pattern = j.f12990c;
            h9.a.f7740c = new h9.a(12);
        }
        h9.a aVar = h9.a.f7740c;
        if (j.f12991d == null) {
            j.f12991d = new j(aVar);
        }
        this.f14514a = j.f12991d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean a() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f14516c     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            ph.j r0 = r4.f14514a     // Catch: java.lang.Throwable -> L19
            h9.a r0 = r0.f12992a     // Catch: java.lang.Throwable -> L19
            r0.getClass()     // Catch: java.lang.Throwable -> L19
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L19
            long r2 = r4.f14515b     // Catch: java.lang.Throwable -> L19
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L17
            goto L1b
        L17:
            r0 = 0
            goto L1c
        L19:
            r0 = move-exception
            goto L1e
        L1b:
            r0 = 1
        L1c:
            monitor-exit(r4)
            return r0
        L1e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L19
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rh.d.a():boolean");
    }

    public final synchronized void b(int i10) {
        long jMin;
        if ((i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404) {
            synchronized (this) {
                this.f14516c = 0;
            }
            return;
        }
        this.f14516c++;
        synchronized (this) {
            if (i10 == 429 || (i10 >= 500 && i10 < 600)) {
                double dPow = Math.pow(2.0d, this.f14516c);
                this.f14514a.getClass();
                jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), f14513e);
            } else {
                jMin = f14512d;
            }
            this.f14514a.f12992a.getClass();
            this.f14515b = System.currentTimeMillis() + jMin;
        }
        return;
    }
}
