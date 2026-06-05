package f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s2 implements u2 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6448a;

    public s2(Object obj) {
        this.f6448a = obj;
    }

    @Override // f1.u2
    public final Object a(n1 n1Var) {
        return this.f6448a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s2) && fj.l.b(this.f6448a, ((s2) obj).f6448a);
    }

    public final int hashCode() {
        Object obj = this.f6448a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f6448a + ')';
    }
}
