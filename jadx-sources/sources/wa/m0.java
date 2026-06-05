package wa;

import android.graphics.Rect;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final xa.f f19125a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f19126b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f19127c;

    public m0(xa.f fVar, Rect rect, Rect rect2) {
        fj.l.f(fVar, "app");
        fj.l.f(rect, "boundsInWindow");
        fj.l.f(rect2, "iconBoundsInWindow");
        this.f19125a = fVar;
        this.f19126b = rect;
        this.f19127c = rect2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return fj.l.b(this.f19125a, m0Var.f19125a) && fj.l.b(this.f19126b, m0Var.f19126b) && fj.l.b(this.f19127c, m0Var.f19127c);
    }

    public final int hashCode() {
        return this.f19127c.hashCode() + ((this.f19126b.hashCode() + (this.f19125a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "GridAppContextMenuRequest(app=" + this.f19125a + ", boundsInWindow=" + this.f19126b + ", iconBoundsInWindow=" + this.f19127c + ")";
    }
}
