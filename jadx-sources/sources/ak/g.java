package ak;

import java.io.Serializable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f634a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f635b;

    /* renamed from: c, reason: collision with root package name */
    public Object f636c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f637d;

    public g(boolean z2) {
        this.f634a = z2;
    }

    public void a(f... fVarArr) {
        if (!this.f634a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String[] strArr = new String[fVarArr.length];
        for (int i10 = 0; i10 < fVarArr.length; i10++) {
            strArr[i10] = fVarArr[i10].f633a;
        }
        b(strArr);
    }

    public void b(String... strArr) {
        if (!this.f634a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f636c = (String[]) strArr.clone();
    }

    public void c(d0... d0VarArr) {
        if (!this.f634a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        String[] strArr = new String[d0VarArr.length];
        for (int i10 = 0; i10 < d0VarArr.length; i10++) {
            strArr[i10] = d0VarArr[i10].f615a;
        }
        d(strArr);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    public void d(String... strArr) {
        if (!this.f634a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f637d = (String[]) strArr.clone();
    }
}
