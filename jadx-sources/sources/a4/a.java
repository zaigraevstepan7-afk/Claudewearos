package a4;

import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends i {

    /* renamed from: r0, reason: collision with root package name */
    public int f72r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f73s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f74t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f75u0;

    public final boolean O() {
        int i10;
        int i11;
        int i12;
        boolean z2 = true;
        int i13 = 0;
        while (true) {
            i10 = this.f177q0;
            if (i13 >= i10) {
                break;
            }
            d dVar = this.f176p0[i13];
            if ((this.f73s0 || dVar.c()) && ((((i11 = this.f72r0) == 0 || i11 == 1) && !dVar.x()) || (((i12 = this.f72r0) == 2 || i12 == 3) && !dVar.y()))) {
                z2 = false;
            }
            i13++;
        }
        if (!z2 || i10 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z10 = false;
        for (int i14 = 0; i14 < this.f177q0; i14++) {
            d dVar2 = this.f176p0[i14];
            if (this.f73s0 || dVar2.c()) {
                if (!z10) {
                    int i15 = this.f72r0;
                    if (i15 == 0) {
                        iMax = dVar2.i(2).d();
                    } else if (i15 == 1) {
                        iMax = dVar2.i(4).d();
                    } else if (i15 == 2) {
                        iMax = dVar2.i(3).d();
                    } else if (i15 == 3) {
                        iMax = dVar2.i(5).d();
                    }
                    z10 = true;
                }
                int i16 = this.f72r0;
                if (i16 == 0) {
                    iMax = Math.min(iMax, dVar2.i(2).d());
                } else if (i16 == 1) {
                    iMax = Math.max(iMax, dVar2.i(4).d());
                } else if (i16 == 2) {
                    iMax = Math.min(iMax, dVar2.i(3).d());
                } else if (i16 == 3) {
                    iMax = Math.max(iMax, dVar2.i(5).d());
                }
            }
        }
        int i17 = iMax + this.f74t0;
        int i18 = this.f72r0;
        if (i18 == 0 || i18 == 1) {
            E(i17, i17);
        } else {
            F(i17, i17);
        }
        this.f75u0 = true;
        return true;
    }

    public final int P() {
        int i10 = this.f72r0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    @Override // a4.d
    public final void b(y3.c cVar, boolean z2) {
        boolean z10;
        int i10;
        int i11;
        c[] cVarArr = this.P;
        c cVar2 = this.H;
        cVarArr[0] = cVar2;
        int i12 = 2;
        c cVar3 = this.I;
        cVarArr[2] = cVar3;
        c cVar4 = this.J;
        cVarArr[1] = cVar4;
        c cVar5 = this.K;
        cVarArr[3] = cVar5;
        for (c cVar6 : cVarArr) {
            cVar6.f100i = cVar.k(cVar6);
        }
        int i13 = this.f72r0;
        if (i13 < 0 || i13 >= 4) {
            return;
        }
        c cVar7 = cVarArr[i13];
        if (!this.f75u0) {
            O();
        }
        if (this.f75u0) {
            this.f75u0 = false;
            int i14 = this.f72r0;
            if (i14 == 0 || i14 == 1) {
                cVar.d(cVar2.f100i, this.X);
                cVar.d(cVar4.f100i, this.X);
                return;
            } else {
                if (i14 == 2 || i14 == 3) {
                    cVar.d(cVar3.f100i, this.Y);
                    cVar.d(cVar5.f100i, this.Y);
                    return;
                }
                return;
            }
        }
        for (int i15 = 0; i15 < this.f177q0; i15++) {
            d dVar = this.f176p0[i15];
            if ((this.f73s0 || dVar.c()) && ((((i11 = this.f72r0) == 0 || i11 == 1) && dVar.f129o0[0] == 3 && dVar.H.f97f != null && dVar.J.f97f != null) || ((i11 == 2 || i11 == 3) && dVar.f129o0[1] == 3 && dVar.I.f97f != null && dVar.K.f97f != null))) {
                z10 = true;
                break;
            }
        }
        z10 = false;
        boolean z11 = cVar2.g() || cVar4.g();
        boolean z12 = cVar3.g() || cVar5.g();
        int i16 = !(!z10 && (((i10 = this.f72r0) == 0 && z11) || ((i10 == 2 && z12) || ((i10 == 1 && z11) || (i10 == 3 && z12))))) ? 4 : 5;
        int i17 = 0;
        while (i17 < this.f177q0) {
            d dVar2 = this.f176p0[i17];
            if (this.f73s0 || dVar2.c()) {
                y3.f fVarK = cVar.k(dVar2.P[this.f72r0]);
                c[] cVarArr2 = dVar2.P;
                int i18 = this.f72r0;
                c cVar8 = cVarArr2[i18];
                cVar8.f100i = fVarK;
                c cVar9 = cVar8.f97f;
                int i19 = (cVar9 == null || cVar9.f95d != this) ? 0 : cVar8.f98g;
                if (i18 == 0 || i18 == i12) {
                    y3.f fVar = cVar7.f100i;
                    int i20 = this.f74t0 - i19;
                    y3.b bVarL = cVar.l();
                    y3.f fVarM = cVar.m();
                    fVarM.f20199d = 0;
                    bVarL.c(fVar, fVarK, fVarM, i20);
                    cVar.c(bVarL);
                } else {
                    y3.f fVar2 = cVar7.f100i;
                    int i21 = this.f74t0 + i19;
                    y3.b bVarL2 = cVar.l();
                    y3.f fVarM2 = cVar.m();
                    fVarM2.f20199d = 0;
                    bVarL2.b(fVar2, fVarK, fVarM2, i21);
                    cVar.c(bVarL2);
                }
                cVar.e(cVar7.f100i, fVarK, this.f74t0 + i19, i16);
            }
            i17++;
            i12 = 2;
        }
        int i22 = this.f72r0;
        if (i22 == 0) {
            cVar.e(cVar4.f100i, cVar2.f100i, 0, 8);
            cVar.e(cVar2.f100i, this.S.J.f100i, 0, 4);
            cVar.e(cVar2.f100i, this.S.H.f100i, 0, 0);
            return;
        }
        if (i22 == 1) {
            cVar.e(cVar2.f100i, cVar4.f100i, 0, 8);
            cVar.e(cVar2.f100i, this.S.H.f100i, 0, 4);
            cVar.e(cVar2.f100i, this.S.J.f100i, 0, 0);
        } else if (i22 == 2) {
            cVar.e(cVar5.f100i, cVar3.f100i, 0, 8);
            cVar.e(cVar3.f100i, this.S.K.f100i, 0, 4);
            cVar.e(cVar3.f100i, this.S.I.f100i, 0, 0);
        } else if (i22 == 3) {
            cVar.e(cVar3.f100i, cVar5.f100i, 0, 8);
            cVar.e(cVar3.f100i, this.S.I.f100i, 0, 4);
            cVar.e(cVar3.f100i, this.S.K.f100i, 0, 0);
        }
    }

    @Override // a4.d
    public final boolean c() {
        return true;
    }

    @Override // a4.d
    public final String toString() {
        String strJ = m6.a.j(new StringBuilder("[Barrier] "), this.f114g0, " {");
        for (int i10 = 0; i10 < this.f177q0; i10++) {
            d dVar = this.f176p0[i10];
            if (i10 > 0) {
                strJ = m1.v(strJ, ", ");
            }
            strJ = strJ + dVar.f114g0;
        }
        return m1.v(strJ, "}");
    }

    @Override // a4.d
    public final boolean x() {
        return this.f75u0;
    }

    @Override // a4.d
    public final boolean y() {
        return this.f75u0;
    }
}
