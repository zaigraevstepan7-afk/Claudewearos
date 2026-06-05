package t7;

import android.net.Uri;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f16110a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16111b;

    public d(boolean z2, Uri uri) {
        this.f16110a = uri;
        this.f16111b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f16111b == dVar.f16111b && this.f16110a.equals(dVar.f16110a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f16110a.hashCode() * 31) + (this.f16111b ? 1 : 0);
    }
}
