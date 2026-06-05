package g3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7035a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7036b;

    /* renamed from: c, reason: collision with root package name */
    public int f7037c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7038d;

    public b(Object obj, int i10, int i11, String str) {
        this.f7035a = obj;
        this.f7036b = i10;
        this.f7037c = i11;
        this.f7038d = str;
    }

    public final d a(int i10) {
        int i11 = this.f7037c;
        if (i11 != Integer.MIN_VALUE) {
            i10 = i11;
        }
        if (!(i10 != Integer.MIN_VALUE)) {
            m3.a.b("Item.end should be set first");
        }
        return new d(this.f7035a, this.f7036b, i10, this.f7038d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return fj.l.b(this.f7035a, bVar.f7035a) && this.f7036b == bVar.f7036b && this.f7037c == bVar.f7037c && fj.l.b(this.f7038d, bVar.f7038d);
    }

    public final int hashCode() {
        Object obj = this.f7035a;
        return this.f7038d.hashCode() + gk.b.g(this.f7037c, gk.b.g(this.f7036b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MutableRange(item=");
        sb2.append(this.f7035a);
        sb2.append(", start=");
        sb2.append(this.f7036b);
        sb2.append(", end=");
        sb2.append(this.f7037c);
        sb2.append(", tag=");
        return m6.a.i(sb2, this.f7038d, ')');
    }

    public /* synthetic */ b(f0 f0Var, int i10, int i11, int i12) {
        this(f0Var, i10, (i12 & 4) != 0 ? Integer.MIN_VALUE : i11, "");
    }
}
