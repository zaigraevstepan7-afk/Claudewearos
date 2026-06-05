package hk;

import ak.s;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f8044a;

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f8045b;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    static {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hk.j.<clinit>():void");
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            s sVar = (s) list.get(i10);
            if (sVar != s.HTTP_1_0) {
                arrayList.add(sVar.f722a);
            }
        }
        return arrayList;
    }

    public static byte[] e(List list) {
        kk.f fVar = new kk.f();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            s sVar = (s) list.get(i10);
            if (sVar != s.HTTP_1_0) {
                fVar.W(sVar.f722a.length());
                fVar.h0(sVar.f722a);
            }
        }
        return fVar.t(fVar.f9695b);
    }

    public cg.b c(X509TrustManager x509TrustManager) {
        return new jk.a(d(x509TrustManager));
    }

    public jk.d d(X509TrustManager x509TrustManager) {
        return new jk.b(x509TrustManager.getAcceptedIssuers());
    }

    public void h(Socket socket, InetSocketAddress inetSocketAddress, int i10) {
        socket.connect(inetSocketAddress, i10);
    }

    public SSLContext i() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e10) {
            throw new IllegalStateException("No TLS provider", e10);
        }
    }

    public String j(SSLSocket sSLSocket) {
        return null;
    }

    public Object k() {
        if (f8045b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean l(String str) {
        return true;
    }

    public void m(int i10, String str, Throwable th2) {
        f8045b.log(i10 == 5 ? Level.WARNING : Level.INFO, str, th2);
    }

    public void n(Object obj, String str) {
        if (obj == null) {
            str = m1.v(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        m(5, str, (Throwable) obj);
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void f(SSLSocketFactory sSLSocketFactory) {
    }

    public void g(SSLSocket sSLSocket, String str, List list) {
    }
}
