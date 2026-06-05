package wa;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final List f19135a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f19136b;

    public q(List list, n0 n0Var) {
        fj.l.f(n0Var, "gridDimensions");
        this.f19135a = list;
        this.f19136b = n0Var;
    }

    public static q a(q qVar, ArrayList arrayList) {
        n0 n0Var = qVar.f19136b;
        fj.l.f(n0Var, "gridDimensions");
        return new q(arrayList, n0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return fj.l.b(this.f19135a, qVar.f19135a) && fj.l.b(this.f19136b, qVar.f19136b);
    }

    public final int hashCode() {
        return this.f19136b.hashCode() + (this.f19135a.hashCode() * 31);
    }

    public final String toString() {
        return "DisplayablesGridDisplayablePage(gridDisplayableItems=" + this.f19135a + ", gridDimensions=" + this.f19136b + ")";
    }
}
