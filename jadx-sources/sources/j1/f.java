package j1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final f f8627c = new f(0, 2, 1);

    @Override // j1.j0
    public final void a(androidx.datastore.preferences.protobuf.k kVar, f1.a aVar, i1.k kVar2, p1.k kVar3, k0 k0Var) {
        p1.f fVar = (p1.f) kVar.g(1);
        int i10 = fVar != null ? fVar.f12642a : 0;
        a aVar2 = (a) kVar.g(0);
        if (i10 > 0) {
            aVar = new d4.g(aVar, i10);
        }
        aVar2.m0(aVar, kVar2, kVar3, k0Var != null ? new t0.j(14, k0Var, kVar2) : null);
    }
}
