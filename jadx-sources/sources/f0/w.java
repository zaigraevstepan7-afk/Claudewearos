package f0;

import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w extends v1.n implements v2.m {
    public y H;

    @Override // v2.m
    public final void O0(v2.h0 h0Var) {
        ArrayList arrayList = this.H.f6213h;
        if (arrayList.size() <= 0) {
            h0Var.f();
        } else {
            m6.a.q(arrayList.get(0));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && fj.l.b(this.H, ((w) obj).H);
    }

    public final int hashCode() {
        return this.H.hashCode();
    }

    @Override // v1.n
    public final void i1() {
        this.H.getClass();
    }

    @Override // v1.n
    public final void j1() {
        y yVar = this.H;
        yVar.d();
        yVar.f6207b = null;
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.H + ')';
    }
}
