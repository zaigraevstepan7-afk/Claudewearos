package r7;

import android.graphics.Rect;
import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final q7.a f13816a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13817b;

    public a(q7.a aVar, float f10) {
        this.f13816a = aVar;
        this.f13817b = f10;
    }

    public final Rect a() {
        q7.a aVar = this.f13816a;
        aVar.getClass();
        return new Rect(aVar.f13289a, aVar.f13290b, aVar.f13291c, aVar.f13292d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        l.d(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        a aVar = (a) obj;
        return l.b(this.f13816a, aVar.f13816a) && this.f13817b == aVar.f13817b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13817b) + (this.f13816a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WindowMetrics(_bounds=");
        sb2.append(this.f13816a);
        sb2.append(", density=");
        return gk.b.o(sb2, this.f13817b, ')');
    }

    public a(Rect rect, float f10) {
        this.f13816a = new q7.a(rect);
        this.f13817b = f10;
    }
}
