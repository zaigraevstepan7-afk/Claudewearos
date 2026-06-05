package hk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class h extends j {

    /* renamed from: c, reason: collision with root package name */
    public final Method f8037c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f8038d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f8039e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f8040f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f8041g;

    public h(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f8037c = method;
        this.f8038d = method2;
        this.f8039e = method3;
        this.f8040f = cls;
        this.f8041g = cls2;
    }

    @Override // hk.j
    public final void a(SSLSocket sSLSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f8039e.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        }
    }

    @Override // hk.j
    public final void g(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f8037c.invoke(null, sSLSocket, Proxy.newProxyInstance(j.class.getClassLoader(), new Class[]{this.f8040f, this.f8041g}, new g(j.b(list))));
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        }
    }

    @Override // hk.j
    public final String j(SSLSocket sSLSocket) {
        try {
            g gVar = (g) Proxy.getInvocationHandler(this.f8038d.invoke(null, sSLSocket));
            boolean z2 = gVar.f8035b;
            if (!z2 && gVar.f8036c == null) {
                j.f8044a.m(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            if (z2) {
                return null;
            }
            return gVar.f8036c;
        } catch (IllegalAccessException e10) {
            e = e10;
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e11) {
            e = e11;
            throw new AssertionError("failed to get ALPN selected protocol", e);
        }
    }
}
