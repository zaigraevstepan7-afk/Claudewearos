package ak;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final n f578a;

    /* renamed from: b, reason: collision with root package name */
    public final b f579b;

    /* renamed from: c, reason: collision with root package name */
    public final SocketFactory f580c;

    /* renamed from: d, reason: collision with root package name */
    public final b f581d;

    /* renamed from: e, reason: collision with root package name */
    public final List f582e;

    /* renamed from: f, reason: collision with root package name */
    public final List f583f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f584g;

    /* renamed from: h, reason: collision with root package name */
    public final SSLSocketFactory f585h;

    /* renamed from: i, reason: collision with root package name */
    public final HostnameVerifier f586i;
    public final d j;

    public a(String str, int i10, b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, d dVar, b bVar2, List list, List list2, ProxySelector proxySelector) {
        m mVar = new m(0);
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            mVar.f666c = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            mVar.f666c = "https";
        }
        if (str == null) {
            throw new NullPointerException("host == null");
        }
        String strA = bk.d.a(n.g(false, str, 0, str.length()));
        if (strA == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        mVar.f669f = strA;
        if (i10 <= 0 || i10 > 65535) {
            throw new IllegalArgumentException(m6.a.d(i10, "unexpected port: "));
        }
        mVar.f665b = i10;
        this.f578a = mVar.b();
        if (bVar == null) {
            throw new NullPointerException("dns == null");
        }
        this.f579b = bVar;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f580c = socketFactory;
        if (bVar2 == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f581d = bVar2;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f582e = Collections.unmodifiableList(new ArrayList(list));
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f583f = Collections.unmodifiableList(new ArrayList(list2));
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f584g = proxySelector;
        this.f585h = sSLSocketFactory;
        this.f586i = hostnameVerifier;
        this.j = dVar;
    }

    public final boolean a(a aVar) {
        return this.f579b.equals(aVar.f579b) && this.f581d.equals(aVar.f581d) && this.f582e.equals(aVar.f582e) && this.f583f.equals(aVar.f583f) && this.f584g.equals(aVar.f584g) && Objects.equals(this.f585h, aVar.f585h) && Objects.equals(this.f586i, aVar.f586i) && Objects.equals(this.j, aVar.j) && this.f578a.f677e == aVar.f578a.f677e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f578a.equals(aVar.f578a) && a(aVar);
    }

    public final int hashCode() {
        return Objects.hashCode(this.j) + ((Objects.hashCode(this.f586i) + ((Objects.hashCode(this.f585h) + ((this.f584g.hashCode() + ((this.f583f.hashCode() + ((this.f582e.hashCode() + ((this.f581d.hashCode() + ((this.f579b.hashCode() + m1.c(527, 31, this.f578a.f681i)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Address{");
        n nVar = this.f578a;
        sb2.append(nVar.f676d);
        sb2.append(":");
        sb2.append(nVar.f677e);
        sb2.append(", proxySelector=");
        sb2.append(this.f584g);
        sb2.append("}");
        return sb2.toString();
    }
}
