package r8;

import qj.e1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final e1 f13822a;

    public /* synthetic */ a(e1 e1Var) {
        this.f13822a = e1Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return fj.l.b(this.f13822a, ((a) obj).f13822a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13822a.hashCode();
    }

    public final String toString() {
        return "BaseRequestDelegate(job=" + this.f13822a + ')';
    }
}
