package h8;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final String f7734a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7735b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7736c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7737d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7738e;

    public x(String str, String str2, String str3, String str4, String str5) {
        this.f7734a = str;
        this.f7735b = str2;
        this.f7736c = str3;
        this.f7737d = str4;
        this.f7738e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && fj.l.b(((x) obj).f7734a, this.f7734a);
    }

    public final int hashCode() {
        return this.f7734a.hashCode();
    }

    public final String toString() {
        return this.f7734a;
    }
}
