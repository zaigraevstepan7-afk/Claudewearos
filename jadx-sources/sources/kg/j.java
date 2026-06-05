package kg;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final r f9630a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9631b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9632c;

    public j(int i10, int i11, Class cls) {
        this(r.a(cls), i10, i11);
    }

    public static j a(Class cls) {
        return new j(0, 1, cls);
    }

    public static j b(Class cls) {
        return new j(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f9630a.equals(jVar.f9630a) && this.f9631b == jVar.f9631b && this.f9632c == jVar.f9632c;
    }

    public final int hashCode() {
        return ((((this.f9630a.hashCode() ^ 1000003) * 1000003) ^ this.f9631b) * 1000003) ^ this.f9632c;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f9630a);
        sb2.append(", type=");
        int i10 = this.f9631b;
        sb2.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        int i11 = this.f9632c;
        if (i11 == 0) {
            str = "direct";
        } else if (i11 == 1) {
            str = "provider";
        } else {
            if (i11 != 2) {
                throw new AssertionError(m6.a.d(i11, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return m6.a.j(sb2, str, "}");
    }

    public j(r rVar, int i10, int i11) {
        this.f9630a = rVar;
        this.f9631b = i10;
        this.f9632c = i11;
    }
}
