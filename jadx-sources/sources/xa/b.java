package xa;

import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f19849a;

    /* renamed from: b, reason: collision with root package name */
    public final float f19850b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19851c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f19852d;

    /* renamed from: e, reason: collision with root package name */
    public final lb.b f19853e;

    public b(float f10, float f11, int i10, boolean z2, lb.b bVar) {
        this.f19849a = f10;
        this.f19850b = f11;
        this.f19851c = i10;
        this.f19852d = z2;
        this.f19853e = bVar;
    }

    public static b a(b bVar, float f10, lb.b bVar2) {
        float f11 = bVar.f19850b;
        int i10 = bVar.f19851c;
        boolean z2 = bVar.f19852d;
        bVar.getClass();
        l.f(bVar2, "shapeType");
        return new b(f10, f11, i10, z2, bVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Float.compare(this.f19849a, bVar.f19849a) == 0 && Float.compare(this.f19850b, bVar.f19850b) == 0 && this.f19851c == bVar.f19851c && this.f19852d == bVar.f19852d && this.f19853e == bVar.f19853e;
    }

    public final int hashCode() {
        return this.f19853e.hashCode() + gk.b.i(gk.b.g(this.f19851c, gk.b.f(this.f19850b, Float.hashCode(this.f19849a) * 31, 31), 31), 31, this.f19852d);
    }

    public final String toString() {
        return "AppIconHelperConfig(cornerRadiusPercent=" + this.f19849a + ", viewSizePercent=" + this.f19850b + ", badgeOffsetPx=" + this.f19851c + ", labelVisible=" + this.f19852d + ", shapeType=" + this.f19853e + ")";
    }
}
