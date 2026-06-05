package z5;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f20414a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20415b;

    public i(int i10, int i11) {
        this.f20414a = i10;
        this.f20415b = i11;
    }

    public final int a() {
        return this.f20415b - this.f20414a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f20415b == iVar.f20415b && this.f20414a == iVar.f20414a;
    }

    public final int hashCode() {
        return (this.f20414a * 31) + this.f20415b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(this.f20414a);
        sb2.append(", ");
        return m6.a.h(sb2, this.f20415b, "]");
    }
}
