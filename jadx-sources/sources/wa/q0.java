package wa;

import android.graphics.Rect;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final xa.f f19137a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19138b;

    /* renamed from: c, reason: collision with root package name */
    public final float f19139c;

    /* renamed from: d, reason: collision with root package name */
    public final float f19140d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f19141e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f19142f;

    /* renamed from: g, reason: collision with root package name */
    public final float f19143g;

    /* renamed from: h, reason: collision with root package name */
    public final float f19144h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f19145i;
    public final Integer j;

    public q0(xa.f fVar, int i10, float f10, float f11, Rect rect, Rect rect2, float f12, float f13, Integer num, Integer num2) {
        fj.l.f(fVar, "app");
        this.f19137a = fVar;
        this.f19138b = i10;
        this.f19139c = f10;
        this.f19140d = f11;
        this.f19141e = rect;
        this.f19142f = rect2;
        this.f19143g = f12;
        this.f19144h = f13;
        this.f19145i = num;
        this.j = num2;
    }

    public static q0 a(q0 q0Var, float f10, float f11, Integer num, Integer num2, int i10) {
        xa.f fVar = q0Var.f19137a;
        int i11 = q0Var.f19138b;
        if ((i10 & 4) != 0) {
            f10 = q0Var.f19139c;
        }
        float f12 = f10;
        if ((i10 & 8) != 0) {
            f11 = q0Var.f19140d;
        }
        float f13 = f11;
        Rect rect = q0Var.f19141e;
        Rect rect2 = q0Var.f19142f;
        float f14 = q0Var.f19143g;
        float f15 = q0Var.f19144h;
        if ((i10 & 256) != 0) {
            num = q0Var.f19145i;
        }
        fj.l.f(fVar, "app");
        return new q0(fVar, i11, f12, f13, rect, rect2, f14, f15, num, num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return fj.l.b(this.f19137a, q0Var.f19137a) && this.f19138b == q0Var.f19138b && Float.compare(this.f19139c, q0Var.f19139c) == 0 && Float.compare(this.f19140d, q0Var.f19140d) == 0 && fj.l.b(this.f19141e, q0Var.f19141e) && fj.l.b(this.f19142f, q0Var.f19142f) && Float.compare(this.f19143g, q0Var.f19143g) == 0 && Float.compare(this.f19144h, q0Var.f19144h) == 0 && fj.l.b(this.f19145i, q0Var.f19145i) && fj.l.b(this.j, q0Var.j);
    }

    public final int hashCode() {
        int iF = gk.b.f(this.f19144h, gk.b.f(this.f19143g, (this.f19142f.hashCode() + ((this.f19141e.hashCode() + gk.b.f(this.f19140d, gk.b.f(this.f19139c, gk.b.g(this.f19138b, this.f19137a.hashCode() * 31, 31), 31), 31)) * 31)) * 31, 31), 31);
        Integer num = this.f19145i;
        int iHashCode = (iF + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.j;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "GridDragSession(app=" + this.f19137a + ", sourceAbsoluteIndex=" + this.f19138b + ", currentRawX=" + this.f19139c + ", currentRawY=" + this.f19140d + ", itemBoundsInWindow=" + this.f19141e + ", iconBoundsInWindow=" + this.f19142f + ", touchOffsetX=" + this.f19143g + ", touchOffsetY=" + this.f19144h + ", targetAbsoluteIndex=" + this.f19145i + ", previewAbsoluteIndex=" + this.j + ")";
    }
}
