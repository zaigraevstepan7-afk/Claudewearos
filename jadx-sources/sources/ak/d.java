package ak;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f606c = new d(new LinkedHashSet(new ArrayList()), null);

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f607a;

    /* renamed from: b, reason: collision with root package name */
    public final cg.b f608b;

    public d(LinkedHashSet linkedHashSet, cg.b bVar) {
        this.f607a = linkedHashSet;
        this.f608b = bVar;
    }

    public static String b(X509Certificate x509Certificate) throws NoSuchAlgorithmException {
        if (x509Certificate == null) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        StringBuilder sb2 = new StringBuilder("sha256/");
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        kk.i iVar = kk.i.f9700d;
        fj.l.f(encoded, "data");
        byte[] bArrCopyOf = Arrays.copyOf(encoded, encoded.length);
        fj.l.e(bArrCopyOf, "copyOf(...)");
        kk.i iVar2 = new kk.i(bArrCopyOf);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        int i10 = 0;
        messageDigest.update(bArrCopyOf, 0, iVar2.e());
        byte[] bArrDigest = messageDigest.digest();
        fj.l.c(bArrDigest);
        new kk.i(bArrDigest);
        byte[] bArr = kk.a.f9673a;
        fj.l.f(bArr, "map");
        byte[] bArr2 = new byte[((bArrDigest.length + 2) / 3) * 4];
        int length = bArrDigest.length - (bArrDigest.length % 3);
        int i11 = 0;
        while (i10 < length) {
            byte b10 = bArrDigest[i10];
            int i12 = i10 + 2;
            byte b11 = bArrDigest[i10 + 1];
            i10 += 3;
            byte b12 = bArrDigest[i12];
            bArr2[i11] = bArr[(b10 & 255) >> 2];
            bArr2[i11 + 1] = bArr[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i13 = i11 + 3;
            bArr2[i11 + 2] = bArr[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i11 += 4;
            bArr2[i13] = bArr[b12 & 63];
        }
        int length2 = bArrDigest.length - length;
        if (length2 == 1) {
            byte b13 = bArrDigest[i10];
            bArr2[i11] = bArr[(b13 & 255) >> 2];
            bArr2[i11 + 1] = bArr[(b13 & 3) << 4];
            bArr2[i11 + 2] = 61;
            bArr2[i11 + 3] = 61;
        } else if (length2 == 2) {
            int i14 = i10 + 1;
            byte b14 = bArrDigest[i10];
            byte b15 = bArrDigest[i14];
            bArr2[i11] = bArr[(b14 & 255) >> 2];
            bArr2[i11 + 1] = bArr[((b14 & 3) << 4) | ((b15 & 255) >> 4)];
            bArr2[i11 + 2] = bArr[(b15 & 15) << 2];
            bArr2[i11 + 3] = 61;
        }
        sb2.append(new String(bArr2, nj.a.f12342a));
        return sb2.toString();
    }

    public final void a(String str, List list) throws SSLPeerUnverifiedException {
        List list2 = Collections.EMPTY_LIST;
        Iterator it = this.f607a.iterator();
        if (it.hasNext()) {
            throw gk.b.k(it);
        }
        if (list2.isEmpty()) {
            return;
        }
        cg.b bVar = this.f608b;
        if (bVar != null) {
            list = bVar.m(str, list);
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list2.size() > 0) {
                list2.get(0).getClass();
                throw new ClassCastException();
            }
        }
        StringBuilder sb2 = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i11);
            sb2.append("\n    ");
            sb2.append(b(x509Certificate));
            sb2.append(": ");
            sb2.append(x509Certificate.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(str);
        sb2.append(":");
        int size3 = list2.size();
        for (int i12 = 0; i12 < size3; i12++) {
            if (list2.get(i12) != null) {
                throw new ClassCastException();
            }
            sb2.append("\n    null");
        }
        throw new SSLPeerUnverifiedException(sb2.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Objects.equals(this.f608b, dVar.f608b) && this.f607a.equals(dVar.f607a);
    }

    public final int hashCode() {
        return this.f607a.hashCode() + (Objects.hashCode(this.f608b) * 31);
    }
}
