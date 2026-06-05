package pg;

import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class v {

    /* renamed from: k, reason: collision with root package name */
    public static long f12957k;

    /* renamed from: a, reason: collision with root package name */
    public t0.j f12958a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12959b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12960c = false;

    /* renamed from: d, reason: collision with root package name */
    public long f12961d = 0;

    /* renamed from: e, reason: collision with root package name */
    public qg.b f12962e;

    /* renamed from: f, reason: collision with root package name */
    public final a f12963f;

    /* renamed from: g, reason: collision with root package name */
    public ScheduledFuture f12964g;

    /* renamed from: h, reason: collision with root package name */
    public ScheduledFuture f12965h;

    /* renamed from: i, reason: collision with root package name */
    public final ScheduledExecutorService f12966i;
    public final p1.l j;

    public v(nc.p pVar, p2.h hVar, String str, String str2, a aVar, String str3) {
        this.f12966i = (ScheduledExecutorService) pVar.f12161a;
        this.f12963f = aVar;
        long j = f12957k;
        f12957k = 1 + j;
        this.j = new p1.l((k4.d) pVar.f12164d, "WebSocket", m1.g(j, "ws_"), 22);
        str = str == null ? (String) hVar.f12700c : str;
        boolean z2 = hVar.f12699b;
        String str4 = (String) hVar.f12701d;
        String str5 = (z2 ? "wss" : "ws") + "://" + str + "/.ws?ns=" + str4 + "&v=5";
        URI uriCreate = URI.create(str3 != null ? m1.w(str5, "&ls=", str3) : str5);
        HashMap map = new HashMap();
        map.put("User-Agent", (String) pVar.f12165e);
        map.put("X-Firebase-GMPID", (String) pVar.f12166f);
        map.put("X-Firebase-AppCheck", str2);
        this.f12958a = new t0.j(this, new ah.e(pVar, uriCreate, map));
    }

    public static void a(v vVar) {
        p1.l lVar = vVar.j;
        if (!vVar.f12960c) {
            if (lVar.A()) {
                lVar.l(null, "closing itself", new Object[0]);
            }
            vVar.f();
        }
        vVar.f12958a = null;
        ScheduledFuture scheduledFuture = vVar.f12964g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void b(String str) {
        p1.l lVar = this.j;
        qg.b bVar = this.f12962e;
        if (bVar.f13495z) {
            throw new IllegalStateException("Trying to add string after reading");
        }
        if (str.length() > 0) {
            bVar.f13489a.add(str);
        }
        long j = this.f12961d - 1;
        this.f12961d = j;
        if (j == 0) {
            try {
                qg.b bVar2 = this.f12962e;
                if (bVar2.f13495z) {
                    throw new IllegalStateException("Trying to freeze frozen StringListReader");
                }
                bVar2.f13495z = true;
                HashMap mapQ = a.a.Q(bVar2.toString());
                this.f12962e = null;
                if (lVar.A()) {
                    lVar.l(null, "handleIncomingFrame complete frame: " + mapQ, new Object[0]);
                }
                this.f12963f.f(mapQ);
            } catch (IOException e10) {
                lVar.o("Error parsing frame: " + this.f12962e.toString(), e10);
                c();
                f();
            } catch (ClassCastException e11) {
                lVar.o("Error parsing frame (cast error): " + this.f12962e.toString(), e11);
                c();
                f();
            }
        }
    }

    public final void c() {
        p1.l lVar = this.j;
        if (lVar.A()) {
            lVar.l(null, "websocket is being closed", new Object[0]);
        }
        this.f12960c = true;
        ((ah.e) this.f12958a.f15363b).a();
        ScheduledFuture scheduledFuture = this.f12965h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledFuture scheduledFuture2 = this.f12964g;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
        }
    }

    public final void d(int i10) {
        this.f12961d = i10;
        this.f12962e = new qg.b();
        p1.l lVar = this.j;
        if (lVar.A()) {
            lVar.l(null, "HandleNewFrameCount: " + this.f12961d, new Object[0]);
        }
    }

    public final void e() {
        if (this.f12960c) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f12964g;
        p1.l lVar = this.j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            if (lVar.A()) {
                lVar.l(null, "Reset keepAlive. Remaining: " + this.f12964g.getDelay(TimeUnit.MILLISECONDS), new Object[0]);
            }
        } else if (lVar.A()) {
            lVar.l(null, "Reset keepAlive", new Object[0]);
        }
        this.f12964g = this.f12966i.schedule(new t(this, 1), 45000L, TimeUnit.MILLISECONDS);
    }

    public final void f() {
        this.f12960c = true;
        boolean z2 = this.f12959b;
        a aVar = this.f12963f;
        p1.l lVar = (p1.l) aVar.f12886e;
        aVar.f12884c = null;
        if (z2 || aVar.f12882a != 1) {
            if (lVar.A()) {
                lVar.l(null, "Realtime connection lost", new Object[0]);
            }
        } else if (lVar.A()) {
            lVar.l(null, "Realtime connection failed", new Object[0]);
        }
        aVar.a(2);
    }
}
