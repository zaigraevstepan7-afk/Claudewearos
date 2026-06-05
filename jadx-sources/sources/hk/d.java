package hk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d implements jk.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f8026a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f8027b;

    public d(X509TrustManager x509TrustManager, Method method) {
        this.f8027b = method;
        this.f8026a = x509TrustManager;
    }

    @Override // jk.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            TrustAnchor trustAnchor = (TrustAnchor) this.f8027b.invoke(this.f8026a, x509Certificate);
            if (trustAnchor != null) {
                return trustAnchor.getTrustedCert();
            }
        } catch (IllegalAccessException e10) {
            throw new AssertionError("unable to get issues and signature", e10);
        } catch (InvocationTargetException unused) {
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f8026a.equals(dVar.f8026a) && this.f8027b.equals(dVar.f8027b);
    }

    public final int hashCode() {
        return (this.f8027b.hashCode() * 31) + this.f8026a.hashCode();
    }
}
