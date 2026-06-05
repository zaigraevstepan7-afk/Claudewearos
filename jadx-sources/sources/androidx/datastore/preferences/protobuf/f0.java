package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public m0[] f926a;

    @Override // androidx.datastore.preferences.protobuf.m0
    public final w0 a(Class cls) {
        for (m0 m0Var : this.f926a) {
            if (m0Var.b(cls)) {
                return m0Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final boolean b(Class cls) {
        for (m0 m0Var : this.f926a) {
            if (m0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
