package x9;

import android.graphics.Bitmap;
import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f19847a;

    public a(Bitmap bitmap) {
        l.f(bitmap, "icon");
        this.f19847a = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && l.b(this.f19847a, ((a) obj).f19847a);
    }

    public final int hashCode() {
        return this.f19847a.hashCode();
    }

    public final String toString() {
        return "DisplayableIcon(icon=" + this.f19847a + ")";
    }
}
