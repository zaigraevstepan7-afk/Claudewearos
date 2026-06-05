package a4;

import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: p0, reason: collision with root package name */
    public float f170p0 = -1.0f;

    /* renamed from: q0, reason: collision with root package name */
    public int f171q0 = -1;

    /* renamed from: r0, reason: collision with root package name */
    public int f172r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public c f173s0 = this.I;

    /* renamed from: t0, reason: collision with root package name */
    public int f174t0 = 0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f175u0;

    public h() {
        this.Q.clear();
        this.Q.add(this.f173s0);
        int length = this.P.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.P[i10] = this.f173s0;
        }
    }

    @Override // a4.d
    public final void L(y3.c cVar, boolean z2) {
        if (this.S == null) {
            return;
        }
        c cVar2 = this.f173s0;
        cVar.getClass();
        int iN = y3.c.n(cVar2);
        if (this.f174t0 == 1) {
            this.X = iN;
            this.Y = 0;
            G(this.S.k());
            J(0);
            return;
        }
        this.X = 0;
        this.Y = iN;
        J(this.S.n());
        G(0);
    }

    public final void M(int i10) {
        this.f173s0.l(i10);
        this.f175u0 = true;
    }

    public final void N(int i10) {
        if (this.f174t0 == i10) {
            return;
        }
        this.f174t0 = i10;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        if (this.f174t0 == 1) {
            this.f173s0 = this.H;
        } else {
            this.f173s0 = this.I;
        }
        arrayList.add(this.f173s0);
        c[] cVarArr = this.P;
        int length = cVarArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            cVarArr[i11] = this.f173s0;
        }
    }

    @Override // a4.d
    public final void b(y3.c cVar, boolean z2) {
        e eVar = (e) this.S;
        if (eVar == null) {
            return;
        }
        Object objI = eVar.i(2);
        Object objI2 = eVar.i(4);
        d dVar = this.S;
        boolean z10 = dVar != null && dVar.f129o0[0] == 2;
        if (this.f174t0 == 0) {
            objI = eVar.i(3);
            objI2 = eVar.i(5);
            d dVar2 = this.S;
            z10 = dVar2 != null && dVar2.f129o0[1] == 2;
        }
        if (this.f175u0) {
            c cVar2 = this.f173s0;
            if (cVar2.f94c) {
                y3.f fVarK = cVar.k(cVar2);
                cVar.d(fVarK, this.f173s0.d());
                if (this.f171q0 != -1) {
                    if (z10) {
                        cVar.f(cVar.k(objI2), fVarK, 0, 5);
                    }
                } else if (this.f172r0 != -1 && z10) {
                    y3.f fVarK2 = cVar.k(objI2);
                    cVar.f(fVarK, cVar.k(objI), 0, 5);
                    cVar.f(fVarK2, fVarK, 0, 5);
                }
                this.f175u0 = false;
                return;
            }
        }
        if (this.f171q0 != -1) {
            y3.f fVarK3 = cVar.k(this.f173s0);
            cVar.e(fVarK3, cVar.k(objI), this.f171q0, 8);
            if (z10) {
                cVar.f(cVar.k(objI2), fVarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.f172r0 != -1) {
            y3.f fVarK4 = cVar.k(this.f173s0);
            y3.f fVarK5 = cVar.k(objI2);
            cVar.e(fVarK4, fVarK5, -this.f172r0, 8);
            if (z10) {
                cVar.f(fVarK4, cVar.k(objI), 0, 5);
                cVar.f(fVarK5, fVarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.f170p0 != -1.0f) {
            y3.f fVarK6 = cVar.k(this.f173s0);
            y3.f fVarK7 = cVar.k(objI2);
            float f10 = this.f170p0;
            y3.b bVarL = cVar.l();
            bVarL.f20173d.g(fVarK6, -1.0f);
            bVarL.f20173d.g(fVarK7, f10);
            cVar.c(bVarL);
        }
    }

    @Override // a4.d
    public final boolean c() {
        return true;
    }

    @Override // a4.d
    public final c i(int i10) {
        int iB = y3.e.b(i10);
        if (iB != 1) {
            if (iB != 2) {
                if (iB != 3) {
                    if (iB != 4) {
                        return null;
                    }
                }
            }
            if (this.f174t0 == 0) {
                return this.f173s0;
            }
            return null;
        }
        if (this.f174t0 == 1) {
            return this.f173s0;
        }
        return null;
    }

    @Override // a4.d
    public final boolean x() {
        return this.f175u0;
    }

    @Override // a4.d
    public final boolean y() {
        return this.f175u0;
    }
}
