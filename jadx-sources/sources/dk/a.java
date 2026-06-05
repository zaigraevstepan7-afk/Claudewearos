package dk;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f5144a;

    /* renamed from: b, reason: collision with root package name */
    public int f5145b = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5146c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5147d;

    public a(List list) {
        this.f5144a = list;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.String[]] */
    public final ak.h a(SSLSocket sSLSocket) throws UnknownServiceException {
        boolean z2;
        ak.h hVar;
        int i10 = this.f5145b;
        List list = this.f5144a;
        int size = list.size();
        while (true) {
            z2 = true;
            if (i10 >= size) {
                hVar = null;
                break;
            }
            hVar = (ak.h) list.get(i10);
            if (hVar.a(sSLSocket)) {
                this.f5145b = i10 + 1;
                break;
            }
            i10++;
        }
        if (hVar == null) {
            throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f5147d + ", modes=" + list + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
        }
        int i11 = this.f5145b;
        while (true) {
            if (i11 >= list.size()) {
                z2 = false;
                break;
            }
            if (((ak.h) list.get(i11)).a(sSLSocket)) {
                break;
            }
            i11++;
        }
        this.f5146c = z2;
        ak.j jVar = ak.j.f658c;
        boolean z10 = this.f5147d;
        jVar.getClass();
        ?? r02 = hVar.f643d;
        String[] strArr = hVar.f642c;
        String[] strArrK = strArr != null ? bk.d.k(ak.f.f616b, sSLSocket.getEnabledCipherSuites(), strArr) : sSLSocket.getEnabledCipherSuites();
        String[] strArrK2 = r02 != 0 ? bk.d.k(bk.d.f1793i, sSLSocket.getEnabledProtocols(), r02) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        ak.e eVar = ak.f.f616b;
        byte[] bArr = bk.d.f1785a;
        int length = supportedCipherSuites.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                i12 = -1;
                break;
            }
            if (eVar.compare(supportedCipherSuites[i12], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i12++;
        }
        if (z10 && i12 != -1) {
            String str = supportedCipherSuites[i12];
            int length2 = strArrK.length;
            String[] strArr2 = new String[length2 + 1];
            System.arraycopy(strArrK, 0, strArr2, 0, strArrK.length);
            strArr2[length2] = str;
            strArrK = strArr2;
        }
        ak.g gVar = new ak.g();
        gVar.f634a = hVar.f640a;
        gVar.f636c = strArr;
        gVar.f637d = r02;
        gVar.f635b = hVar.f641b;
        gVar.b(strArrK);
        gVar.d(strArrK2);
        ak.h hVar2 = new ak.h(gVar);
        String[] strArr3 = hVar2.f643d;
        if (strArr3 != null) {
            sSLSocket.setEnabledProtocols(strArr3);
        }
        String[] strArr4 = hVar2.f642c;
        if (strArr4 != null) {
            sSLSocket.setEnabledCipherSuites(strArr4);
        }
        return hVar;
    }
}
