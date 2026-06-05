package k3;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final List f9394a;

    public r(q... qVarArr) {
        if (qVarArr.length <= 0) {
            this.f9394a = qi.k.v0(qVarArr);
        } else {
            q qVar = qVarArr[0];
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return fj.l.b(this.f9394a, ((r) obj).f9394a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9394a.hashCode();
    }
}
