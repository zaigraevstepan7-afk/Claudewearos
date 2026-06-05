package j1;

import f1.d2;
import f1.t1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e0 extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final e0 f8626c = new e0(1, 0, 2);

    @Override // j1.j0
    public final void a(androidx.datastore.preferences.protobuf.k kVar, f1.a aVar, i1.k kVar2, p1.k kVar3, k0 k0Var) {
        int iF = kVar.f(0);
        int i10 = kVar2.f8156v;
        int iN = kVar2.N(kVar2.f8137b, kVar2.r(i10));
        int iG = kVar2.g(kVar2.f8137b, kVar2.r(i10 + 1));
        for (int iMax = Math.max(iN, iG - iF); iMax < iG; iMax++) {
            Object obj = kVar2.f8138c[kVar2.h(iMax)];
            if (obj instanceof d2) {
                kVar3.e((d2) obj);
            } else if (obj instanceof t1) {
                ((t1) obj).d();
            }
        }
        if (iF <= 0) {
            f1.n.a("Check failed");
        }
        int i11 = kVar2.f8156v;
        int iN2 = kVar2.N(kVar2.f8137b, kVar2.r(i11));
        int iG2 = kVar2.g(kVar2.f8137b, kVar2.r(i11 + 1)) - iF;
        if (iG2 < iN2) {
            f1.n.a("Check failed");
        }
        kVar2.J(iG2, iF, i11);
        int i12 = kVar2.f8144i;
        if (i12 >= iN2) {
            kVar2.f8144i = i12 - iF;
        }
    }
}
