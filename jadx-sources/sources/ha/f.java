package ha;

import fj.l;
import g3.n0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final n0 f7773a;

    public f(n0 n0Var) {
        this.f7773a = n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && l.b(this.f7773a, ((f) obj).f7773a);
    }

    public final int hashCode() {
        return this.f7773a.hashCode();
    }

    public final String toString() {
        return "TypographyScheme(input1Normal=" + this.f7773a + ")";
    }
}
