package b3;

import android.content.res.Resources;
import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Resources.Theme f1517a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1518b;

    public b(Resources.Theme theme, int i10) {
        this.f1517a = theme;
        this.f1518b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.b(this.f1517a, bVar.f1517a) && this.f1518b == bVar.f1518b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1518b) + (this.f1517a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Key(theme=");
        sb2.append(this.f1517a);
        sb2.append(", id=");
        return m6.a.g(sb2, this.f1518b, ')');
    }
}
