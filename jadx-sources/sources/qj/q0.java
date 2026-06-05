package qj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class q0 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13612a;

    public q0(boolean z2) {
        this.f13612a = z2;
    }

    @Override // qj.b1
    public final boolean b() {
        return this.f13612a;
    }

    @Override // qj.b1
    public final n1 c() {
        return null;
    }

    public final String toString() {
        return m6.a.i(new StringBuilder("Empty{"), this.f13612a ? "Active" : "New", '}');
    }
}
