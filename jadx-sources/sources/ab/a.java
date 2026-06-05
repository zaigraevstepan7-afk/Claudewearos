package ab;

import android.graphics.Rect;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f252a;

    /* renamed from: b, reason: collision with root package name */
    public final xa.f f253b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f254c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f255d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f256e;

    public a(int i10, xa.f fVar, Rect rect, Rect rect2, boolean z2) {
        fj.l.f(fVar, "app");
        fj.l.f(rect, "anchorBoundsInWindow");
        fj.l.f(rect2, "iconBoundsInWindow");
        this.f252a = i10;
        this.f253b = fVar;
        this.f254c = rect;
        this.f255d = rect2;
        this.f256e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f252a == aVar.f252a && fj.l.b(this.f253b, aVar.f253b) && fj.l.b(this.f254c, aVar.f254c) && fj.l.b(this.f255d, aVar.f255d) && this.f256e == aVar.f256e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f256e) + ((this.f255d.hashCode() + ((this.f254c.hashCode() + ((this.f253b.hashCode() + (Integer.hashCode(this.f252a) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AppContextMenuState(appId=" + this.f252a + ", app=" + this.f253b + ", anchorBoundsInWindow=" + this.f254c + ", iconBoundsInWindow=" + this.f255d + ", isFolderLocked=" + this.f256e + ")";
    }
}
