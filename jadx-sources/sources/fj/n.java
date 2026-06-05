package fj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class n extends o implements lj.d, ej.c {
    public n(String str, String str2) {
        super(c.f6790a, d3.x.class, str, str2, 1);
    }

    @Override // fj.d
    public final lj.a b() {
        w.f6808a.getClass();
        return this;
    }

    public final void i() {
        if (this.f6802z) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        lj.a aVarH = h();
        if (aVarH == this) {
            throw new dj.a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((n) ((lj.d) aVarH)).i();
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        i();
        throw null;
    }
}
