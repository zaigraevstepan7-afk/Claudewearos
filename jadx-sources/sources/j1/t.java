package j1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final t f8657c = new t(0, 3, 1);

    @Override // j1.j0
    public final void a(androidx.datastore.preferences.protobuf.k kVar, f1.a aVar, i1.k kVar2, p1.k kVar3, k0 k0Var) {
        t0.j jVar;
        i1.h hVar = (i1.h) kVar.g(1);
        i1.b bVar = (i1.b) kVar.g(0);
        c cVar = (c) kVar.g(2);
        i1.k kVarX = hVar.x();
        if (k0Var != null) {
            try {
                jVar = new t0.j(14, k0Var, kVar2);
            } catch (Throwable th2) {
                kVarX.e(false);
                throw th2;
            }
        } else {
            jVar = null;
        }
        if (!cVar.f8621c.e0()) {
            f1.n.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        cVar.f8620b.d0(aVar, kVarX, kVar3, jVar);
        kVarX.e(true);
        kVar2.d();
        bVar.getClass();
        kVar2.A(hVar, hVar.b(bVar));
        kVar2.k();
    }
}
