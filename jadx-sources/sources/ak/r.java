package ak;

import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class r implements Cloneable {
    public static final List R = bk.d.j(s.HTTP_2, s.HTTP_1_1);
    public static final List S = bk.d.j(h.f638e, h.f639f);
    public final j A;
    public final SocketFactory B;
    public final SSLSocketFactory C;
    public final cg.b D;
    public final jk.c E;
    public final d F;
    public final b G;
    public final b H;
    public final p7.k I;
    public final b J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;

    /* renamed from: a, reason: collision with root package name */
    public final a8.j f709a;

    /* renamed from: b, reason: collision with root package name */
    public final List f710b;

    /* renamed from: c, reason: collision with root package name */
    public final List f711c;

    /* renamed from: d, reason: collision with root package name */
    public final List f712d;

    /* renamed from: e, reason: collision with root package name */
    public final List f713e;

    /* renamed from: f, reason: collision with root package name */
    public final b f714f;

    /* renamed from: z, reason: collision with root package name */
    public final ProxySelector f715z;

    static {
        j.f658c = new j();
    }

    public r(q qVar) throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        boolean z2;
        this.f709a = qVar.f686a;
        this.f710b = qVar.f687b;
        List list = qVar.f688c;
        this.f711c = list;
        this.f712d = Collections.unmodifiableList(new ArrayList(qVar.f689d));
        this.f713e = Collections.unmodifiableList(new ArrayList(qVar.f690e));
        this.f714f = qVar.f691f;
        this.f715z = qVar.f692g;
        this.A = qVar.f693h;
        this.B = qVar.f694i;
        Iterator it = list.iterator();
        loop0: while (true) {
            z2 = false;
            while (it.hasNext()) {
                z2 = (z2 || ((h) it.next()).f640a) ? true : z2;
            }
        }
        SSLSocketFactory sSLSocketFactory = qVar.j;
        if (sSLSocketFactory == null && z2) {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                        try {
                            hk.j jVar = hk.j.f8044a;
                            SSLContext sSLContextI = jVar.i();
                            sSLContextI.init(null, new TrustManager[]{x509TrustManager}, null);
                            this.C = sSLContextI.getSocketFactory();
                            this.D = jVar.c(x509TrustManager);
                        } catch (GeneralSecurityException e10) {
                            throw new AssertionError("No System TLS", e10);
                        }
                    }
                }
                throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
            } catch (GeneralSecurityException e11) {
                throw new AssertionError("No System TLS", e11);
            }
        }
        this.C = sSLSocketFactory;
        this.D = qVar.f695k;
        SSLSocketFactory sSLSocketFactory2 = this.C;
        if (sSLSocketFactory2 != null) {
            hk.j.f8044a.f(sSLSocketFactory2);
        }
        this.E = qVar.f696l;
        d dVar = qVar.f697m;
        cg.b bVar = this.D;
        this.F = Objects.equals(dVar.f608b, bVar) ? dVar : new d(dVar.f607a, bVar);
        this.G = qVar.f698n;
        this.H = qVar.f699o;
        this.I = qVar.f700p;
        this.J = qVar.f701q;
        this.K = qVar.f702r;
        this.L = qVar.f703s;
        this.M = qVar.f704t;
        this.N = qVar.f705u;
        this.O = qVar.f706v;
        this.P = qVar.f707w;
        this.Q = qVar.f708x;
        if (this.f712d.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f712d);
        }
        if (this.f713e.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f713e);
        }
    }
}
