package q4;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f13201a;

    /* renamed from: b, reason: collision with root package name */
    public String f13202b;

    /* renamed from: c, reason: collision with root package name */
    public List f13203c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Objects.equals(this.f13201a, aVar.f13201a) && Objects.equals(this.f13202b, aVar.f13202b) && Objects.equals(this.f13203c, aVar.f13203c);
    }

    public final int hashCode() {
        return Objects.hash(this.f13201a, this.f13202b, this.f13203c);
    }
}
