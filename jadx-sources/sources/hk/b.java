package hk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b extends cg.b {

    /* renamed from: d, reason: collision with root package name */
    public final Object f8021d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f8022e;

    public b(Object obj, Method method) {
        this.f8021d = obj;
        this.f8022e = method;
    }

    public final boolean equals(Object obj) {
        return obj instanceof b;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // cg.b
    public final List m(String str, List list) throws SSLPeerUnverifiedException {
        try {
            return (List) this.f8022e.invoke(this.f8021d, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e11.getMessage());
            sSLPeerUnverifiedException.initCause(e11);
            throw sSLPeerUnverifiedException;
        }
    }
}
