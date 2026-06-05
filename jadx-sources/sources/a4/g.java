package a4;

import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g extends i {
    public b4.b A0;
    public d4.f B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public float I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public int O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public ArrayList V0;
    public d[] W0;
    public d[] X0;
    public int[] Y0;
    public d[] Z0;
    public int a1;

    /* renamed from: r0, reason: collision with root package name */
    public int f165r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f166s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f167t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f168u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f169v0;
    public int w0;
    public boolean x0;
    public int y0;
    public int z0;

    @Override // a4.i
    public final void N() {
        for (int i10 = 0; i10 < this.f177q0; i10++) {
            d dVar = this.f176p0[i10];
            if (dVar != null) {
                dVar.E = true;
            }
        }
    }

    public final int O(d dVar, int i10) {
        d dVar2;
        if (dVar != null) {
            int[] iArr = dVar.f129o0;
            if (iArr[1] == 3) {
                int i11 = dVar.f132r;
                if (i11 != 0) {
                    if (i11 == 2) {
                        int i12 = (int) (dVar.f139y * i10);
                        if (i12 != dVar.k()) {
                            dVar.f113g = true;
                            Q(iArr[0], dVar.n(), 1, i12, dVar);
                        }
                        return i12;
                    }
                    dVar2 = dVar;
                    if (i11 == 1) {
                        return dVar2.k();
                    }
                    if (i11 == 3) {
                        return (int) ((dVar2.n() * dVar2.V) + 0.5f);
                    }
                }
            } else {
                dVar2 = dVar;
            }
            return dVar2.k();
        }
        return 0;
    }

    public final int P(d dVar, int i10) {
        d dVar2;
        if (dVar != null) {
            int[] iArr = dVar.f129o0;
            if (iArr[0] == 3) {
                int i11 = dVar.f131q;
                if (i11 != 0) {
                    if (i11 == 2) {
                        int i12 = (int) (dVar.f136v * i10);
                        if (i12 != dVar.n()) {
                            dVar.f113g = true;
                            Q(1, i12, iArr[1], dVar.k(), dVar);
                        }
                        return i12;
                    }
                    dVar2 = dVar;
                    if (i11 == 1) {
                        return dVar2.n();
                    }
                    if (i11 == 3) {
                        return (int) ((dVar2.k() * dVar2.V) + 0.5f);
                    }
                }
            } else {
                dVar2 = dVar;
            }
            return dVar2.n();
        }
        return 0;
    }

    public final void Q(int i10, int i11, int i12, int i13, d dVar) {
        d4.f fVar;
        d dVar2;
        b4.b bVar = this.A0;
        while (true) {
            fVar = this.B0;
            if (fVar != null || (dVar2 = this.S) == null) {
                break;
            } else {
                this.B0 = ((e) dVar2).f145t0;
            }
        }
        bVar.f1521a = i10;
        bVar.f1522b = i12;
        bVar.f1523c = i11;
        bVar.f1524d = i13;
        fVar.b(dVar, bVar);
        dVar.J(bVar.f1525e);
        dVar.G(bVar.f1526f);
        dVar.D = bVar.f1528h;
        dVar.D(bVar.f1527g);
    }

    @Override // a4.d
    public final void b(y3.c cVar, boolean z2) {
        d dVar;
        float f10;
        int i10;
        ArrayList arrayList = this.V0;
        super.b(cVar, z2);
        d dVar2 = this.S;
        boolean z10 = dVar2 != null && ((e) dVar2).f146u0;
        int i11 = this.S0;
        if (i11 != 0) {
            if (i11 == 1) {
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    ((f) arrayList.get(i12)).b(i12, z10, i12 == size + (-1));
                    i12++;
                }
            } else if (i11 == 2 && this.Y0 != null && this.X0 != null && this.W0 != null) {
                for (int i13 = 0; i13 < this.a1; i13++) {
                    this.Z0[i13].A();
                }
                int[] iArr = this.Y0;
                int i14 = iArr[0];
                int i15 = iArr[1];
                float f11 = this.I0;
                d dVar3 = null;
                int i16 = 0;
                while (i16 < i14) {
                    if (z10) {
                        i10 = (i14 - i16) - 1;
                        f10 = 1.0f - this.I0;
                    } else {
                        f10 = f11;
                        i10 = i16;
                    }
                    d dVar4 = this.X0[i10];
                    if (dVar4 != null) {
                        c cVar2 = dVar4.H;
                        if (dVar4.f112f0 != 8) {
                            if (i16 == 0) {
                                dVar4.f(cVar2, this.H, this.f169v0);
                                dVar4.f116h0 = this.C0;
                                dVar4.f106c0 = f10;
                            }
                            if (i16 == i14 - 1) {
                                dVar4.f(dVar4.J, this.J, this.w0);
                            }
                            if (i16 > 0 && dVar3 != null) {
                                c cVar3 = dVar3.J;
                                dVar4.f(cVar2, cVar3, this.O0);
                                dVar3.f(cVar3, cVar2, 0);
                            }
                            dVar3 = dVar4;
                        }
                    }
                    i16++;
                    f11 = f10;
                }
                for (int i17 = 0; i17 < i15; i17++) {
                    d dVar5 = this.W0[i17];
                    if (dVar5 != null) {
                        c cVar4 = dVar5.I;
                        if (dVar5.f112f0 != 8) {
                            if (i17 == 0) {
                                dVar5.f(cVar4, this.I, this.f165r0);
                                dVar5.f118i0 = this.D0;
                                dVar5.f108d0 = this.J0;
                            }
                            if (i17 == i15 - 1) {
                                dVar5.f(dVar5.K, this.K, this.f166s0);
                            }
                            if (i17 > 0 && dVar3 != null) {
                                c cVar5 = dVar3.K;
                                dVar5.f(cVar4, cVar5, this.P0);
                                dVar3.f(cVar5, cVar4, 0);
                            }
                            dVar3 = dVar5;
                        }
                    }
                }
                for (int i18 = 0; i18 < i14; i18++) {
                    for (int i19 = 0; i19 < i15; i19++) {
                        int i20 = (i19 * i14) + i18;
                        if (this.U0 == 1) {
                            i20 = (i18 * i15) + i19;
                        }
                        d[] dVarArr = this.Z0;
                        if (i20 < dVarArr.length && (dVar = dVarArr[i20]) != null && dVar.f112f0 != 8) {
                            d dVar6 = this.X0[i18];
                            d dVar7 = this.W0[i19];
                            if (dVar != dVar6) {
                                dVar.f(dVar.H, dVar6.H, 0);
                                dVar.f(dVar.J, dVar6.J, 0);
                            }
                            if (dVar != dVar7) {
                                dVar.f(dVar.I, dVar7.I, 0);
                                dVar.f(dVar.K, dVar7.K, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z10, true);
        }
        this.x0 = false;
    }
}
