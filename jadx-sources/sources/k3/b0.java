package k3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final j f9355a;

    /* renamed from: b, reason: collision with root package name */
    public final s f9356b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9357c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9358d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9359e;

    public b0(j jVar, s sVar, int i10, int i11, Object obj) {
        this.f9355a = jVar;
        this.f9356b = sVar;
        this.f9357c = i10;
        this.f9358d = i11;
        this.f9359e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return fj.l.b(this.f9355a, b0Var.f9355a) && fj.l.b(this.f9356b, b0Var.f9356b) && this.f9357c == b0Var.f9357c && this.f9358d == b0Var.f9358d && fj.l.b(this.f9359e, b0Var.f9359e);
    }

    public final int hashCode() {
        j jVar = this.f9355a;
        int iG = gk.b.g(this.f9358d, gk.b.g(this.f9357c, (((jVar == null ? 0 : jVar.hashCode()) * 31) + this.f9356b.f9401a) * 31, 31), 31);
        Object obj = this.f9359e;
        return iG + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TypefaceRequest(fontFamily=");
        sb2.append(this.f9355a);
        sb2.append(", fontWeight=");
        sb2.append(this.f9356b);
        sb2.append(", fontStyle=");
        String str = "Invalid";
        int i10 = this.f9357c;
        sb2.append((Object) (i10 == 0 ? "Normal" : i10 == 1 ? "Italic" : "Invalid"));
        sb2.append(", fontSynthesis=");
        int i11 = this.f9358d;
        if (i11 == 0) {
            str = "None";
        } else if (i11 == 1) {
            str = "Weight";
        } else if (i11 == 2) {
            str = "Style";
        } else if (i11 == 65535) {
            str = "All";
        }
        sb2.append((Object) str);
        sb2.append(", resourceLoaderCacheKey=");
        sb2.append(this.f9359e);
        sb2.append(')');
        return sb2.toString();
    }
}
