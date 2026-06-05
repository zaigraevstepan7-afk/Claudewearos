package n9;

import android.graphics.drawable.Drawable;
import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f11962a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11963b;

    public a(Drawable drawable, boolean z2) {
        this.f11962a = drawable;
        this.f11963b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.b(this.f11962a, aVar.f11962a) && this.f11963b == aVar.f11963b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11963b) + (this.f11962a.hashCode() * 31);
    }

    public final String toString() {
        return "AppIconDto(drawable=" + this.f11962a + ", isAdaptive=" + this.f11963b + ")";
    }
}
