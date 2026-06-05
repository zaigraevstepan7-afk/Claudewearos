package ah;

import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.util.Base64;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import nc.p;
import p1.l;
import pg.u;
import pg.v;
import t.m1;
import t0.j;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicInteger f463l = new AtomicInteger(0);

    /* renamed from: m, reason: collision with root package name */
    public static final Charset f464m = Charset.forName("UTF-8");

    /* renamed from: n, reason: collision with root package name */
    public static final ThreadFactory f465n = Executors.defaultThreadFactory();

    /* renamed from: o, reason: collision with root package name */
    public static final lh.e f466o = new lh.e();

    /* renamed from: a, reason: collision with root package name */
    public volatile int f467a = 1;

    /* renamed from: b, reason: collision with root package name */
    public volatile Socket f468b = null;

    /* renamed from: c, reason: collision with root package name */
    public j f469c = null;

    /* renamed from: d, reason: collision with root package name */
    public final URI f470d;

    /* renamed from: e, reason: collision with root package name */
    public final String f471e;

    /* renamed from: f, reason: collision with root package name */
    public final h f472f;

    /* renamed from: g, reason: collision with root package name */
    public final i f473g;

    /* renamed from: h, reason: collision with root package name */
    public final ac.d f474h;

    /* renamed from: i, reason: collision with root package name */
    public final l f475i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final Thread f476k;

    public e(p pVar, URI uri, HashMap map) {
        int iIncrementAndGet = f463l.incrementAndGet();
        this.j = iIncrementAndGet;
        this.f476k = f465n.newThread(new d(this, 0));
        this.f470d = uri;
        this.f471e = (String) pVar.f12167z;
        this.f475i = new l((k4.d) pVar.f12164d, "WebSocket", m6.a.d(iIncrementAndGet, "sk_"), 22);
        ac.d dVar = new ac.d(2, false);
        dVar.f374c = null;
        dVar.f373b = uri;
        dVar.f375d = map;
        byte[] bArr = new byte[16];
        for (int i10 = 0; i10 < 16; i10++) {
            bArr[i10] = (byte) ((Math.random() * 255) + 0);
        }
        dVar.f374c = Base64.encodeToString(bArr, 2);
        this.f474h = dVar;
        h hVar = new h();
        hVar.f478a = null;
        hVar.f479b = null;
        hVar.f480c = null;
        hVar.f481d = new byte[112];
        hVar.f483f = false;
        hVar.f479b = this;
        this.f472f = hVar;
        this.f473g = new i(this, this.j);
    }

    public final synchronized void a() {
        int iB = y3.e.b(this.f467a);
        if (iB == 0) {
            this.f467a = 5;
            return;
        }
        if (iB == 1) {
            b();
            return;
        }
        if (iB != 2) {
            if (iB != 3) {
                if (iB != 4) {
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        try {
            this.f467a = 4;
            this.f473g.f486c = true;
            this.f473g.b((byte) 8, new byte[0]);
        } catch (IOException e10) {
            this.f469c.q(new f("Failed to send close frame", e10));
        }
    }

    public final synchronized void b() {
        if (this.f467a == 5) {
            return;
        }
        this.f472f.f483f = true;
        this.f473g.f486c = true;
        if (this.f468b == null) {
            this.f467a = 5;
            j jVar = this.f469c;
            ((v) jVar.f15364c).f12966i.execute(new u(jVar, 1));
            return;
        } else {
            try {
                this.f468b.close();
            } catch (Exception e10) {
                this.f469c.q(new f("Failed to close", e10));
            }
            this.f467a = 5;
            j jVar2 = this.f469c;
            ((v) jVar2.f15364c).f12966i.execute(new u(jVar2, 1));
            return;
        }
    }

    public final synchronized void c() {
        if (this.f467a != 1) {
            this.f469c.q(new f("connect() already called"));
            a();
            return;
        }
        lh.e eVar = f466o;
        Thread thread = this.f476k;
        String str = "TubeSockReader-" + this.j;
        eVar.getClass();
        thread.setName(str);
        this.f467a = 2;
        this.f476k.start();
    }

    public final Socket d() {
        URI uri = this.f470d;
        String scheme = uri.getScheme();
        String host = uri.getHost();
        int port = uri.getPort();
        if (scheme != null && scheme.equals("ws")) {
            if (port == -1) {
                port = 80;
            }
            try {
                return new Socket(host, port);
            } catch (UnknownHostException e10) {
                throw new f(m1.i("unknown host: ", host), e10);
            } catch (IOException e11) {
                throw new f("error while creating socket to " + uri, e11);
            }
        }
        if (scheme == null || !scheme.equals("wss")) {
            throw new f(m1.i("unsupported protocol: ", scheme));
        }
        if (port == -1) {
            port = 443;
        }
        String str = this.f471e;
        SSLSessionCache sSLSessionCache = null;
        if (str != null) {
            try {
                sSLSessionCache = new SSLSessionCache(new File(str));
            } catch (IOException e12) {
                this.f475i.l(e12, "Failed to initialize SSL session cache", new Object[0]);
            }
        }
        try {
            SSLSocket sSLSocket = (SSLSocket) SSLCertificateSocketFactory.getDefault(60000, sSLSessionCache).createSocket(host, port);
            if (HttpsURLConnection.getDefaultHostnameVerifier().verify(host, sSLSocket.getSession())) {
                return sSLSocket;
            }
            throw new f("Error while verifying secure socket to " + uri);
        } catch (UnknownHostException e13) {
            throw new f(m1.i("unknown host: ", host), e13);
        } catch (IOException e14) {
            throw new f("error while creating secure socket to " + uri, e14);
        }
    }

    public final synchronized void e(byte b10, byte[] bArr) {
        if (this.f467a != 3) {
            this.f469c.q(new f("error while sending data: not connected"));
        } else {
            try {
                this.f473g.b(b10, bArr);
            } catch (IOException e10) {
                this.f469c.q(new f("Failed to send frame", e10));
                a();
            }
        }
    }
}
