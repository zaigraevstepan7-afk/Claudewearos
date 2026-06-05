package j1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final j f8635c = new j(0, 2, 1);

    @Override // j1.j0
    public final void a(androidx.datastore.preferences.protobuf.k kVar, f1.a aVar, i1.k kVar2, p1.k kVar3, k0 k0Var) {
        int i10;
        p1.f fVar = (p1.f) kVar.g(0);
        int iC = kVar2.c((i1.b) kVar.g(1));
        if (kVar2.f8154t >= iC) {
            f1.n.a("Check failed");
        }
        uk.c.J(kVar2, aVar, iC);
        int i11 = kVar2.f8154t;
        int iE = kVar2.f8156v;
        while (iE >= 0 && !kVar2.y(iE)) {
            iE = kVar2.E(kVar2.f8137b, iE);
        }
        int iU = iE + 1;
        int iL = 0;
        while (iU < i11) {
            if (kVar2.v(i11, iU)) {
                if (kVar2.y(iU)) {
                    iL = 0;
                }
                iU++;
            } else {
                iL += kVar2.y(iU) ? 1 : kVar2.f8137b[(kVar2.r(iU) * 5) + 1] & 67108863;
                iU += kVar2.u(iU);
            }
        }
        while (true) {
            i10 = kVar2.f8154t;
            if (i10 >= iC) {
                break;
            }
            if (kVar2.v(iC, i10)) {
                int i12 = kVar2.f8154t;
                if (i12 < kVar2.f8155u && (kVar2.f8137b[(kVar2.r(i12) * 5) + 1] & 1073741824) != 0) {
                    aVar.e(kVar2.D(kVar2.f8154t));
                    iL = 0;
                }
                kVar2.P();
            } else {
                iL += kVar2.L();
            }
        }
        if (i10 != iC) {
            f1.n.a("Check failed");
        }
        fVar.f12642a = iL;
    }
}
