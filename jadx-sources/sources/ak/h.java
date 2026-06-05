package ak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final h f638e;

    /* renamed from: f, reason: collision with root package name */
    public static final h f639f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f640a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f641b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f642c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f643d;

    static {
        f fVar = f.f630q;
        f fVar2 = f.f631r;
        f fVar3 = f.f632s;
        f fVar4 = f.f624k;
        f fVar5 = f.f626m;
        f fVar6 = f.f625l;
        f fVar7 = f.f627n;
        f fVar8 = f.f629p;
        f fVar9 = f.f628o;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9};
        f[] fVarArr2 = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, f.f623i, f.j, f.f621g, f.f622h, f.f619e, f.f620f, f.f618d};
        g gVar = new g(true);
        gVar.a(fVarArr);
        d0 d0Var = d0.TLS_1_3;
        d0 d0Var2 = d0.TLS_1_2;
        gVar.c(d0Var, d0Var2);
        gVar.f635b = true;
        g gVar2 = new g(true);
        gVar2.a(fVarArr2);
        gVar2.c(d0Var, d0Var2);
        gVar2.f635b = true;
        f638e = new h(gVar2);
        g gVar3 = new g(true);
        gVar3.a(fVarArr2);
        gVar3.c(d0Var, d0Var2, d0.TLS_1_1, d0.TLS_1_0);
        gVar3.f635b = true;
        f639f = new h(new g(false));
    }

    public h(g gVar) {
        this.f640a = gVar.f634a;
        this.f642c = (String[]) gVar.f636c;
        this.f643d = (String[]) gVar.f637d;
        this.f641b = gVar.f635b;
    }

    public final boolean a(SSLSocket sSLSocket) {
        if (!this.f640a) {
            return false;
        }
        String[] strArr = this.f643d;
        if (strArr != null && !bk.d.m(bk.d.f1793i, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f642c;
        return strArr2 == null || bk.d.m(f.f616b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        h hVar = (h) obj;
        boolean z2 = hVar.f640a;
        boolean z10 = this.f640a;
        if (z10 != z2) {
            return false;
        }
        if (z10) {
            return Arrays.equals(this.f642c, hVar.f642c) && Arrays.equals(this.f643d, hVar.f643d) && this.f641b == hVar.f641b;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f640a) {
            return ((((527 + Arrays.hashCode(this.f642c)) * 31) + Arrays.hashCode(this.f643d)) * 31) + (!this.f641b ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List listUnmodifiableList;
        if (!this.f640a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb2 = new StringBuilder("ConnectionSpec(cipherSuites=");
        List listUnmodifiableList2 = null;
        String[] strArr = this.f642c;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(f.a(str));
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        } else {
            listUnmodifiableList = null;
        }
        sb2.append(Objects.toString(listUnmodifiableList, "[all enabled]"));
        sb2.append(", tlsVersions=");
        String[] strArr2 = this.f643d;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            for (String str2 : strArr2) {
                arrayList2.add(d0.a(str2));
            }
            listUnmodifiableList2 = Collections.unmodifiableList(arrayList2);
        }
        sb2.append(Objects.toString(listUnmodifiableList2, "[all enabled]"));
        sb2.append(", supportsTlsExtensions=");
        sb2.append(this.f641b);
        sb2.append(")");
        return sb2.toString();
    }
}
