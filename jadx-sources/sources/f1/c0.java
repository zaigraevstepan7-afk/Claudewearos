package f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c0 implements u2 {

    /* renamed from: a, reason: collision with root package name */
    public final j1 f6275a;

    public c0(j1 j1Var) {
        this.f6275a = j1Var;
    }

    @Override // f1.u2
    public final Object a(n1 n1Var) {
        return this.f6275a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && this.f6275a.equals(((c0) obj).f6275a);
    }

    public final int hashCode() {
        return this.f6275a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f6275a + ')';
    }
}
