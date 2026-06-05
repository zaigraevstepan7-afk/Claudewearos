package f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w implements u2 {

    /* renamed from: a, reason: collision with root package name */
    public final ej.c f6468a;

    public w(ej.c cVar) {
        this.f6468a = cVar;
    }

    @Override // f1.u2
    public final Object a(n1 n1Var) {
        return this.f6468a.invoke(n1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && fj.l.b(this.f6468a, ((w) obj).f6468a);
    }

    public final int hashCode() {
        return this.f6468a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f6468a + ')';
    }
}
