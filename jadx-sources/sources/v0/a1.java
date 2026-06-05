package v0;

import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f17349a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17350b;

    public a1(long j, long j4) {
        this.f17349a = j;
        this.f17350b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return c2.w.d(this.f17349a, a1Var.f17349a) && c2.w.d(this.f17350b, a1Var.f17350b);
    }

    public final int hashCode() {
        int i10 = c2.w.f3059i;
        return Long.hashCode(this.f17350b) + (Long.hashCode(this.f17349a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionColors(selectionHandleColor=");
        m1.q(this.f17349a, sb2, ", selectionBackgroundColor=");
        sb2.append((Object) c2.w.j(this.f17350b));
        sb2.append(')');
        return sb2.toString();
    }
}
