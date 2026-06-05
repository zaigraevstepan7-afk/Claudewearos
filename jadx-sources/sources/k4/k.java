package k4;

import android.content.res.Resources;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f9438a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f9439b;

    public k(Resources resources, Resources.Theme theme) {
        this.f9438a = resources;
        this.f9439b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.f9438a.equals(kVar.f9438a) && Objects.equals(this.f9439b, kVar.f9439b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f9438a, this.f9439b);
    }
}
