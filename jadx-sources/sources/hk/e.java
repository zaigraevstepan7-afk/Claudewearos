package hk;

import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class e extends j {

    /* renamed from: c, reason: collision with root package name */
    public final Class f8028c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f8029d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f8030e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f8031f;

    /* renamed from: g, reason: collision with root package name */
    public final Method f8032g;

    /* renamed from: h, reason: collision with root package name */
    public final c f8033h;

    public e(Class cls, Method method, Method method2, Method method3, Method method4) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method5;
        Method method6;
        Method method7 = null;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method8 = cls2.getMethod("get", null);
            method6 = cls2.getMethod("open", String.class);
            method5 = cls2.getMethod("warnIfOpen", null);
            method7 = method8;
        } catch (Exception unused) {
            method5 = null;
            method6 = null;
        }
        this.f8033h = new c(method7, method6, method5);
        this.f8028c = cls;
        this.f8029d = method;
        this.f8030e = method2;
        this.f8031f = method3;
        this.f8032g = method4;
    }

    public static boolean o(String str, Class cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            try {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", null).invoke(obj, null)).booleanValue();
            } catch (NoSuchMethodException unused2) {
                return true;
            }
        }
    }

    @Override // hk.j
    public final cg.b c(X509TrustManager x509TrustManager) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new b(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // hk.j
    public final jk.d d(X509TrustManager x509TrustManager) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new d(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return new jk.b(x509TrustManager.getAcceptedIssuers());
        }
    }

    @Override // hk.j
    public void g(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f8028c.isInstance(sSLSocket)) {
            if (str != null) {
                try {
                    this.f8029d.invoke(sSLSocket, Boolean.TRUE);
                    this.f8030e.invoke(sSLSocket, str);
                } catch (IllegalAccessException e10) {
                    e = e10;
                    throw new AssertionError(e);
                } catch (InvocationTargetException e11) {
                    e = e11;
                    throw new AssertionError(e);
                }
            }
            this.f8032g.invoke(sSLSocket, j.e(list));
        }
    }

    @Override // hk.j
    public final void h(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (AssertionError e10) {
            if (!bk.d.l(e10)) {
                throw e10;
            }
            throw new IOException(e10);
        } catch (ClassCastException e11) {
            throw e11;
        }
    }

    @Override // hk.j
    public final SSLContext i() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e10) {
            throw new IllegalStateException("No TLS provider", e10);
        }
    }

    @Override // hk.j
    public String j(SSLSocket sSLSocket) {
        if (this.f8028c.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f8031f.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, StandardCharsets.UTF_8);
                }
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new AssertionError(e10);
            }
        }
        return null;
    }

    @Override // hk.j
    public final Object k() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        c cVar = this.f8033h;
        Method method = cVar.f8023a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                cVar.f8024b.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // hk.j
    public final boolean l(String str) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return o(str, cls, cls.getMethod("getInstance", null).invoke(null, null));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return true;
        } catch (IllegalAccessException e10) {
            e = e10;
            throw new AssertionError("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e11) {
            e = e11;
            throw new AssertionError("unable to determine cleartext support", e);
        } catch (InvocationTargetException e12) {
            e = e12;
            throw new AssertionError("unable to determine cleartext support", e);
        }
    }

    @Override // hk.j
    public final void m(int i10, String str, Throwable th2) {
        int iMin;
        int i11 = i10 != 5 ? 3 : 5;
        if (th2 != null) {
            str = str + '\n' + Log.getStackTraceString(th2);
        }
        int length = str.length();
        int i12 = 0;
        while (i12 < length) {
            int iIndexOf = str.indexOf(10, i12);
            if (iIndexOf == -1) {
                iIndexOf = length;
            }
            while (true) {
                iMin = Math.min(iIndexOf, i12 + 4000);
                Log.println(i11, "OkHttp", str.substring(i12, iMin));
                if (iMin >= iIndexOf) {
                    break;
                } else {
                    i12 = iMin;
                }
            }
            i12 = iMin + 1;
        }
    }

    @Override // hk.j
    public final void n(Object obj, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        c cVar = this.f8033h;
        cVar.getClass();
        if (obj != null) {
            try {
                cVar.f8025c.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        m(5, str, null);
    }
}
