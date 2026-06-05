package t4;

import android.os.Build;
import android.view.DisplayCutout;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f15731a;

    public i(DisplayCutout displayCutout) {
        this.f15731a = displayCutout;
    }

    public final l4.b a() {
        return Build.VERSION.SDK_INT >= 30 ? l4.b.d(i4.b.g(this.f15731a)) : l4.b.f9966e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f15731a, ((i) obj).f15731a);
    }

    public final int hashCode() {
        return this.f15731a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f15731a + "}";
    }
}
