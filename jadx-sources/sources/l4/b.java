package l4;

import android.graphics.Insets;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f9966e = new b(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f9967a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9968b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9969c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9970d;

    public b(int i10, int i11, int i12, int i13) {
        this.f9967a = i10;
        this.f9968b = i11;
        this.f9969c = i12;
        this.f9970d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return c(Math.max(bVar.f9967a, bVar2.f9967a), Math.max(bVar.f9968b, bVar2.f9968b), Math.max(bVar.f9969c, bVar2.f9969c), Math.max(bVar.f9970d, bVar2.f9970d));
    }

    public static b b(b bVar, b bVar2) {
        return c(Math.min(bVar.f9967a, bVar2.f9967a), Math.min(bVar.f9968b, bVar2.f9968b), Math.min(bVar.f9969c, bVar2.f9969c), Math.min(bVar.f9970d, bVar2.f9970d));
    }

    public static b c(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f9966e : new b(i10, i11, i12, i13);
    }

    public static b d(Insets insets) {
        return c(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets e() {
        return k7.a.k(this.f9967a, this.f9968b, this.f9969c, this.f9970d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f9970d == bVar.f9970d && this.f9967a == bVar.f9967a && this.f9969c == bVar.f9969c && this.f9968b == bVar.f9968b;
    }

    public final int hashCode() {
        return (((((this.f9967a * 31) + this.f9968b) * 31) + this.f9969c) * 31) + this.f9970d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f9967a);
        sb2.append(", top=");
        sb2.append(this.f9968b);
        sb2.append(", right=");
        sb2.append(this.f9969c);
        sb2.append(", bottom=");
        return m6.a.g(sb2, this.f9970d, '}');
    }
}
