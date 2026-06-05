package j1;

import f1.d2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final e f8625c = new e(0, 2, 1);

    @Override // j1.j0
    public final void a(androidx.datastore.preferences.protobuf.k kVar, f1.a aVar, i1.k kVar2, p1.k kVar3, k0 k0Var) {
        i1.b bVar = (i1.b) kVar.g(0);
        Object objG = kVar.g(1);
        if (objG instanceof d2) {
            kVar3.h((d2) objG);
        }
        if (kVar2.f8148n != 0) {
            f1.n.a("Can only append a slot if not current inserting");
        }
        int i10 = kVar2.f8144i;
        int i11 = kVar2.j;
        int iC = kVar2.c(bVar);
        int iG = kVar2.g(kVar2.f8137b, kVar2.r(iC + 1));
        kVar2.f8144i = iG;
        kVar2.j = iG;
        kVar2.x(1, iC);
        if (i10 >= iG) {
            i10++;
            i11++;
        }
        kVar2.f8138c[iG] = objG;
        kVar2.f8144i = i10;
        kVar2.j = i11;
    }
}
