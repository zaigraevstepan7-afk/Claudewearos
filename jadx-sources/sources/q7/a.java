package q7;

import android.graphics.Rect;
import fj.l;
import gk.b;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f13289a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13290b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13291c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13292d;

    static {
        new a(0, 0, 0, 0);
    }

    public a(int i10, int i11, int i12, int i13) {
        this.f13289a = i10;
        this.f13290b = i11;
        this.f13291c = i12;
        this.f13292d = i13;
        if (i10 > i12) {
            throw new IllegalArgumentException(b.l(i10, i12, "Left must be less than or equal to right, left: ", ", right: ").toString());
        }
        if (i11 > i13) {
            throw new IllegalArgumentException(b.l(i11, i13, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        l.d(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        a aVar = (a) obj;
        return this.f13289a == aVar.f13289a && this.f13290b == aVar.f13290b && this.f13291c == aVar.f13291c && this.f13292d == aVar.f13292d;
    }

    public final int hashCode() {
        return (((((this.f13289a * 31) + this.f13290b) * 31) + this.f13291c) * 31) + this.f13292d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a.class.getSimpleName());
        sb2.append(" { [");
        sb2.append(this.f13289a);
        sb2.append(',');
        sb2.append(this.f13290b);
        sb2.append(',');
        sb2.append(this.f13291c);
        sb2.append(',');
        return m6.a.h(sb2, this.f13292d, "] }");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        l.f(rect, "rect");
    }
}
