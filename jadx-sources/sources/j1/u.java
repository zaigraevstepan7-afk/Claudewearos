package j1;

import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final u f8658c = new u(1, 0, 2);

    @Override // j1.j0
    public final void a(androidx.datastore.preferences.protobuf.k kVar, f1.a aVar, i1.k kVar2, p1.k kVar3, k0 k0Var) {
        i1.b bVar;
        int iC;
        int iF = kVar.f(0);
        if (kVar2.f8148n != 0) {
            f1.n.a("Cannot move a group while inserting");
        }
        if (iF < 0) {
            f1.n.a("Parameter offset is out of bounds");
        }
        if (iF == 0) {
            return;
        }
        int i10 = kVar2.f8154t;
        int i11 = kVar2.f8156v;
        int i12 = kVar2.f8155u;
        int i13 = i10;
        while (iF > 0) {
            i13 += kVar2.f8137b[(kVar2.r(i13) * 5) + 3];
            if (i13 > i12) {
                f1.n.a("Parameter offset is out of bounds");
            }
            iF--;
        }
        int i14 = kVar2.f8137b[(kVar2.r(i13) * 5) + 3];
        int iG = kVar2.g(kVar2.f8137b, kVar2.r(kVar2.f8154t));
        int iG2 = kVar2.g(kVar2.f8137b, kVar2.r(i13));
        int i15 = i13 + i14;
        int iG3 = kVar2.g(kVar2.f8137b, kVar2.r(i15));
        int i16 = iG3 - iG2;
        kVar2.x(i16, Math.max(kVar2.f8154t - 1, 0));
        kVar2.w(i14);
        int[] iArr = kVar2.f8137b;
        int iR = kVar2.r(i15) * 5;
        qi.k.e0(kVar2.r(i10) * 5, iR, (i14 * 5) + iR, iArr, iArr);
        if (i16 > 0) {
            Object[] objArr = kVar2.f8138c;
            int iH = kVar2.h(iG2 + i16);
            System.arraycopy(objArr, iH, objArr, iG, kVar2.h(iG3 + i16) - iH);
        }
        int i17 = iG2 + i16;
        int i18 = i17 - iG;
        int i19 = kVar2.f8145k;
        int i20 = kVar2.f8146l;
        int length = kVar2.f8138c.length;
        int i21 = kVar2.f8147m;
        int i22 = i10 + i14;
        int i23 = i10;
        while (i23 < i22) {
            int iR2 = kVar2.r(i23);
            int i24 = i18;
            int[] iArr2 = iArr;
            iArr2[(iR2 * 5) + 4] = i1.k.i(i1.k.i(kVar2.g(iArr, iR2) - i24, i21 < iR2 ? 0 : i19, i20, length), kVar2.f8145k, kVar2.f8146l, kVar2.f8138c.length);
            i23++;
            i18 = i24;
            iArr = iArr2;
            i19 = i19;
        }
        int i25 = i15 + i14;
        int iP = kVar2.p();
        int iA = i1.j.a(kVar2.f8139d, i15, iP);
        ArrayList arrayList = new ArrayList();
        if (iA >= 0) {
            while (iA < kVar2.f8139d.size() && (iC = kVar2.c((bVar = (i1.b) kVar2.f8139d.get(iA)))) >= i15 && iC < i25) {
                arrayList.add(bVar);
            }
        }
        int i26 = i10 - i15;
        int size = arrayList.size();
        for (int i27 = 0; i27 < size; i27++) {
            i1.b bVar2 = (i1.b) arrayList.get(i27);
            int iC2 = kVar2.c(bVar2) + i26;
            if (iC2 >= kVar2.f8142g) {
                bVar2.f8101a = -(iP - iC2);
            } else {
                bVar2.f8101a = iC2;
            }
            kVar2.f8139d.add(i1.j.a(kVar2.f8139d, iC2, iP), bVar2);
        }
        if (kVar2.I(i15, i14)) {
            f1.n.a("Unexpectedly removed anchors");
        }
        kVar2.m(i11, kVar2.f8155u, i10);
        if (i16 > 0) {
            kVar2.J(i17, i16, i15 - 1);
        }
    }
}
