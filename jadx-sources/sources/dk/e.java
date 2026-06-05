package dk;

import ak.c0;
import ak.r;
import ak.s;
import ak.w;
import ak.y;
import ak.z;
import com.google.android.gms.common.api.internal.i0;
import f1.n0;
import fj.l;
import gk.n;
import gk.q;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kk.e0;
import kk.v;
import kk.x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e extends n {

    /* renamed from: b, reason: collision with root package name */
    public final f f5168b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f5169c;

    /* renamed from: d, reason: collision with root package name */
    public Socket f5170d;

    /* renamed from: e, reason: collision with root package name */
    public Socket f5171e;

    /* renamed from: f, reason: collision with root package name */
    public ak.k f5172f;

    /* renamed from: g, reason: collision with root package name */
    public s f5173g;

    /* renamed from: h, reason: collision with root package name */
    public q f5174h;

    /* renamed from: i, reason: collision with root package name */
    public x f5175i;
    public v j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5176k;

    /* renamed from: l, reason: collision with root package name */
    public int f5177l;

    /* renamed from: m, reason: collision with root package name */
    public int f5178m;

    /* renamed from: n, reason: collision with root package name */
    public int f5179n;

    /* renamed from: o, reason: collision with root package name */
    public int f5180o = 1;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f5181p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public long f5182q = Long.MAX_VALUE;

    public e(f fVar, c0 c0Var) {
        this.f5168b = fVar;
        this.f5169c = c0Var;
    }

    @Override // gk.n
    public final void a(q qVar) {
        synchronized (this.f5168b) {
            this.f5180o = qVar.g();
        }
    }

    @Override // gk.n
    public final void b(gk.x xVar) {
        xVar.c(null, 5);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c0 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r10, int r11, int r12, boolean r13, ak.j r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk.e.c(int, int, int, boolean, ak.j):void");
    }

    public final void d(int i10, int i11, ak.j jVar) throws IOException {
        c0 c0Var = this.f5169c;
        Proxy proxy = c0Var.f604b;
        InetSocketAddress inetSocketAddress = c0Var.f605c;
        this.f5170d = (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) ? c0Var.f603a.f580c.createSocket() : new Socket(proxy);
        jVar.getClass();
        this.f5170d.setSoTimeout(i11);
        try {
            hk.j.f8044a.h(this.f5170d, inetSocketAddress, i10);
            try {
                this.f5175i = u6.v.j(u6.v.h0(this.f5170d));
                this.j = u6.v.i(u6.v.e0(this.f5170d));
            } catch (NullPointerException e10) {
                if ("throw with null exception".equals(e10.getMessage())) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + inetSocketAddress);
            connectException.initCause(e11);
            throw connectException;
        }
    }

    public final void e(int i10, int i11, int i12, ak.j jVar) throws IOException {
        ak.v vVar = new ak.v(0);
        c0 c0Var = this.f5169c;
        ak.a aVar = c0Var.f603a;
        ak.a aVar2 = c0Var.f603a;
        ak.n nVar = aVar.f578a;
        if (nVar == null) {
            throw new NullPointerException("url == null");
        }
        vVar.f730a = nVar;
        vVar.y("CONNECT", null);
        ((yh.c) vVar.f732c).A("Host", bk.d.i(aVar2.f578a, true));
        ((yh.c) vVar.f732c).A("Proxy-Connection", "Keep-Alive");
        ((yh.c) vVar.f732c).A("User-Agent", "okhttp/3.14.9");
        w wVarI = vVar.i();
        y yVar = new y();
        yVar.f745a = wVarI;
        yVar.f746b = s.HTTP_1_1;
        yVar.f747c = 407;
        yVar.f748d = "Preemptive Authenticate";
        yVar.f751g = bk.d.f1788d;
        yVar.f754k = -1L;
        yVar.f755l = -1L;
        yVar.f750f.A("Proxy-Authenticate", "OkHttp-Preemptive");
        yVar.a();
        aVar2.f581d.getClass();
        ak.n nVar2 = wVarI.f735a;
        d(i10, i11, jVar);
        String str = "CONNECT " + bk.d.i(nVar2, true) + " HTTP/1.1";
        x xVar = this.f5175i;
        fk.g gVar = new fk.g((r) null, (e) null, xVar, this.j);
        e0 e0VarA = xVar.f9738a.a();
        long j = i11;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        e0VarA.g(j);
        this.j.f9734a.a().g(i12);
        gVar.r(wVarI.f737c, str);
        gVar.c();
        y yVarE = gVar.e(false);
        yVarE.f745a = wVarI;
        z zVarA = yVarE.a();
        int i13 = zVarA.f759c;
        long jA = ek.d.a(zVarA);
        if (jA != -1) {
            fk.d dVarM = gVar.m(jA);
            bk.d.o(dVarM, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
            dVarM.close();
        }
        if (i13 != 200) {
            if (i13 != 407) {
                throw new IOException(m6.a.d(i13, "Unexpected response code for CONNECT: "));
            }
            aVar2.f581d.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!this.f5175i.f9739b.e() || !this.j.f9735b.e()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void f(a aVar, ak.j jVar) throws Throwable {
        String str;
        SSLSocket sSLSocket;
        c0 c0Var = this.f5169c;
        ak.a aVar2 = c0Var.f603a;
        SSLSocketFactory sSLSocketFactory = aVar2.f585h;
        s sVarA = s.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = aVar2.f582e;
            s sVar = s.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(sVar)) {
                this.f5171e = this.f5170d;
                this.f5173g = sVarA;
                return;
            } else {
                this.f5171e = this.f5170d;
                this.f5173g = sVar;
                i();
                return;
            }
        }
        jVar.getClass();
        ak.a aVar3 = c0Var.f603a;
        SSLSocketFactory sSLSocketFactory2 = aVar3.f585h;
        ak.n nVar = aVar3.f578a;
        SSLSocket sSLSocket2 = null;
        try {
            try {
                Socket socket = this.f5170d;
                str = nVar.f676d;
                sSLSocket = (SSLSocket) sSLSocketFactory2.createSocket(socket, str, nVar.f677e, true);
            } catch (AssertionError e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            boolean z2 = aVar.a(sSLSocket).f641b;
            if (z2) {
                hk.j.f8044a.g(sSLSocket, str, aVar3.f582e);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            ak.k kVarA = ak.k.a(session);
            List list2 = kVarA.f661c;
            if (aVar3.f586i.verify(str, session)) {
                aVar3.j.a(str, list2);
                String strJ = z2 ? hk.j.f8044a.j(sSLSocket) : null;
                this.f5171e = sSLSocket;
                this.f5175i = u6.v.j(u6.v.h0(sSLSocket));
                this.j = u6.v.i(u6.v.e0(this.f5171e));
                this.f5172f = kVarA;
                if (strJ != null) {
                    sVarA = s.a(strJ);
                }
                this.f5173g = sVarA;
                hk.j.f8044a.a(sSLSocket);
                if (this.f5173g == s.HTTP_2) {
                    i();
                    return;
                }
                return;
            }
            if (list2.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + str + " not verified (no certificates)");
            }
            X509Certificate x509Certificate = (X509Certificate) list2.get(0);
            throw new SSLPeerUnverifiedException("Hostname " + str + " not verified:\n    certificate: " + ak.d.b(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + jk.c.a(x509Certificate));
        } catch (AssertionError e11) {
            e = e11;
            if (!bk.d.l(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (Throwable th3) {
            th = th3;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                hk.j.f8044a.a(sSLSocket2);
            }
            bk.d.d(sSLSocket2);
            throw th;
        }
    }

    public final ek.b g(r rVar, ek.e eVar) throws SocketException {
        int i10 = eVar.f6092h;
        if (this.f5174h != null) {
            return new gk.r(rVar, this, eVar, this.f5174h);
        }
        this.f5171e.setSoTimeout(i10);
        e0 e0VarA = this.f5175i.f9738a.a();
        long j = i10;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        e0VarA.g(j);
        this.j.f9734a.a().g(eVar.f6093i);
        return new fk.g(rVar, this, this.f5175i, this.j);
    }

    public final void h() {
        synchronized (this.f5168b) {
            this.f5176k = true;
        }
    }

    public final void i() throws SocketException {
        this.f5171e.setSoTimeout(0);
        i0 i0Var = new i0();
        i0Var.f3556f = n.f7485a;
        i0Var.f3551a = true;
        Socket socket = this.f5171e;
        String str = this.f5169c.f603a.f578a.f676d;
        x xVar = this.f5175i;
        v vVar = this.j;
        i0Var.f3552b = socket;
        i0Var.f3553c = str;
        i0Var.f3554d = xVar;
        i0Var.f3555e = vVar;
        i0Var.f3556f = this;
        q qVar = new q(i0Var);
        this.f5174h = qVar;
        gk.y yVar = qVar.M;
        synchronized (yVar) {
            try {
                if (yVar.f7546e) {
                    throw new IOException("closed");
                }
                if (yVar.f7543b) {
                    Logger logger = gk.y.f7541z;
                    if (logger.isLoggable(Level.FINE)) {
                        String strF = gk.g.f7466a.f();
                        byte[] bArr = bk.d.f1785a;
                        Locale locale = Locale.US;
                        logger.fine(">> CONNECTION " + strF);
                    }
                    kk.g gVar = yVar.f7542a;
                    byte[] bArr2 = gk.g.f7466a.f9701a;
                    byte[] bArrCopyOf = Arrays.copyOf(bArr2, bArr2.length);
                    l.e(bArrCopyOf, "copyOf(...)");
                    gVar.write(bArrCopyOf);
                    yVar.f7542a.flush();
                }
            } finally {
            }
        }
        gk.y yVar2 = qVar.M;
        n0 n0Var = qVar.J;
        synchronized (yVar2) {
            try {
                if (yVar2.f7546e) {
                    throw new IOException("closed");
                }
                yVar2.g(0, Integer.bitCount(n0Var.f6400a) * 6, (byte) 4, (byte) 0);
                int i10 = 0;
                while (i10 < 10) {
                    if (((1 << i10) & n0Var.f6400a) != 0) {
                        yVar2.f7542a.writeShort(i10 == 4 ? 3 : i10 == 7 ? 4 : i10);
                        yVar2.f7542a.writeInt(n0Var.f6401b[i10]);
                    }
                    i10++;
                }
                yVar2.f7542a.flush();
            } finally {
            }
        }
        if (qVar.J.a() != 65535) {
            qVar.M.C(0, r0 - 65535);
        }
        new Thread(qVar.N).start();
    }

    public final boolean j(ak.n nVar) {
        int i10 = nVar.f677e;
        String str = nVar.f676d;
        ak.n nVar2 = this.f5169c.f603a.f578a;
        if (i10 == nVar2.f677e) {
            if (str.equals(nVar2.f676d)) {
                return true;
            }
            ak.k kVar = this.f5172f;
            if (kVar != null && jk.c.c(str, (X509Certificate) kVar.f661c.get(0))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Connection{");
        c0 c0Var = this.f5169c;
        sb2.append(c0Var.f603a.f578a.f676d);
        sb2.append(":");
        sb2.append(c0Var.f603a.f578a.f677e);
        sb2.append(", proxy=");
        sb2.append(c0Var.f604b);
        sb2.append(" hostAddress=");
        sb2.append(c0Var.f605c);
        sb2.append(" cipherSuite=");
        ak.k kVar = this.f5172f;
        sb2.append(kVar != null ? kVar.f660b : "none");
        sb2.append(" protocol=");
        sb2.append(this.f5173g);
        sb2.append('}');
        return sb2.toString();
    }
}
