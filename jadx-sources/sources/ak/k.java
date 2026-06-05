package ak;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f659a;

    /* renamed from: b, reason: collision with root package name */
    public final f f660b;

    /* renamed from: c, reason: collision with root package name */
    public final List f661c;

    /* renamed from: d, reason: collision with root package name */
    public final List f662d;

    public k(d0 d0Var, f fVar, List list, List list2) {
        this.f659a = d0Var;
        this.f660b = fVar;
        this.f661c = list;
        this.f662d = list2;
    }

    public static k a(SSLSession sSLSession) throws IOException {
        Certificate[] peerCertificates;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        f fVarA = f.a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        d0 d0VarA = d0.a(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            peerCertificates = null;
        }
        List listJ = peerCertificates != null ? bk.d.j(peerCertificates) : Collections.EMPTY_LIST;
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new k(d0VarA, fVarA, listJ, localCertificates != null ? bk.d.j(localCertificates) : Collections.EMPTY_LIST);
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Certificate certificate = (Certificate) it.next();
            if (certificate instanceof X509Certificate) {
                arrayList.add(String.valueOf(((X509Certificate) certificate).getSubjectDN()));
            } else {
                arrayList.add(certificate.getType());
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f659a.equals(kVar.f659a) && this.f660b.equals(kVar.f660b) && this.f661c.equals(kVar.f661c) && this.f662d.equals(kVar.f662d);
    }

    public final int hashCode() {
        return this.f662d.hashCode() + ((this.f661c.hashCode() + ((this.f660b.hashCode() + ((this.f659a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Handshake{tlsVersion=" + this.f659a + " cipherSuite=" + this.f660b + " peerCertificates=" + b(this.f661c) + " localCertificates=" + b(this.f662d) + '}';
    }
}
