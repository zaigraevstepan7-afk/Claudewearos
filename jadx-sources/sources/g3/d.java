package g3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7045a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7046b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7047c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7048d;

    public d(Object obj, int i10, int i11, String str) {
        this.f7045a = obj;
        this.f7046b = i10;
        this.f7047c = i11;
        this.f7048d = str;
        if (i10 <= i11) {
            return;
        }
        m3.a.a("Reversed range is not supported");
    }

    public static d a(d dVar, a aVar, int i10, int i11) {
        Object obj = aVar;
        if ((i11 & 1) != 0) {
            obj = dVar.f7045a;
        }
        int i12 = dVar.f7046b;
        if ((i11 & 4) != 0) {
            i10 = dVar.f7047c;
        }
        String str = dVar.f7048d;
        dVar.getClass();
        return new d(obj, i12, i10, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return fj.l.b(this.f7045a, dVar.f7045a) && this.f7046b == dVar.f7046b && this.f7047c == dVar.f7047c && fj.l.b(this.f7048d, dVar.f7048d);
    }

    public final int hashCode() {
        Object obj = this.f7045a;
        return this.f7048d.hashCode() + gk.b.g(this.f7047c, gk.b.g(this.f7046b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Range(item=");
        sb2.append(this.f7045a);
        sb2.append(", start=");
        sb2.append(this.f7046b);
        sb2.append(", end=");
        sb2.append(this.f7047c);
        sb2.append(", tag=");
        return m6.a.i(sb2, this.f7048d, ')');
    }

    public d(int i10, int i11, Object obj) {
        this(obj, i10, i11, "");
    }
}
