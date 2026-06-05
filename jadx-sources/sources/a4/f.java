package a4;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f148a;

    /* renamed from: d, reason: collision with root package name */
    public c f151d;

    /* renamed from: e, reason: collision with root package name */
    public c f152e;

    /* renamed from: f, reason: collision with root package name */
    public c f153f;

    /* renamed from: g, reason: collision with root package name */
    public c f154g;

    /* renamed from: h, reason: collision with root package name */
    public int f155h;

    /* renamed from: i, reason: collision with root package name */
    public int f156i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f157k;

    /* renamed from: q, reason: collision with root package name */
    public int f163q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f164r;

    /* renamed from: b, reason: collision with root package name */
    public d f149b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f150c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f158l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f159m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f160n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f161o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f162p = 0;

    public f(g gVar, int i10, c cVar, c cVar2, c cVar3, c cVar4, int i11) {
        this.f164r = gVar;
        this.f148a = i10;
        this.f151d = cVar;
        this.f152e = cVar2;
        this.f153f = cVar3;
        this.f154g = cVar4;
        this.f155h = gVar.f169v0;
        this.f156i = gVar.f165r0;
        this.j = gVar.w0;
        this.f157k = gVar.f166s0;
        this.f163q = i11;
    }

    public final void a(d dVar) {
        int i10 = this.f148a;
        g gVar = this.f164r;
        if (i10 == 0) {
            int iP = gVar.P(dVar, this.f163q);
            if (dVar.f129o0[0] == 3) {
                this.f162p++;
                iP = 0;
            }
            this.f158l = iP + (dVar.f112f0 != 8 ? gVar.O0 : 0) + this.f158l;
            int iO = gVar.O(dVar, this.f163q);
            if (this.f149b == null || this.f150c < iO) {
                this.f149b = dVar;
                this.f150c = iO;
                this.f159m = iO;
            }
        } else {
            int iP2 = gVar.P(dVar, this.f163q);
            int iO2 = gVar.O(dVar, this.f163q);
            if (dVar.f129o0[1] == 3) {
                this.f162p++;
                iO2 = 0;
            }
            this.f159m = iO2 + (dVar.f112f0 != 8 ? gVar.P0 : 0) + this.f159m;
            if (this.f149b == null || this.f150c < iP2) {
                this.f149b = dVar;
                this.f150c = iP2;
                this.f158l = iP2;
            }
        }
        this.f161o++;
    }

    public final void b(int i10, boolean z2, boolean z10) {
        g gVar;
        int i11;
        d dVar;
        char c6;
        int i12;
        int i13;
        int i14;
        int i15 = this.f161o;
        int i16 = 0;
        while (true) {
            gVar = this.f164r;
            if (i16 >= i15 || (i14 = this.f160n + i16) >= gVar.a1) {
                break;
            }
            d dVar2 = gVar.Z0[i14];
            if (dVar2 != null) {
                dVar2.A();
            }
            i16++;
        }
        if (i15 == 0 || this.f149b == null) {
            return;
        }
        boolean z11 = z10 && i10 == 0;
        int i17 = -1;
        int i18 = -1;
        for (int i19 = 0; i19 < i15; i19++) {
            int i20 = this.f160n + (z2 ? (i15 - 1) - i19 : i19);
            if (i20 >= gVar.a1) {
                break;
            }
            if (gVar.Z0[i20].f112f0 == 0) {
                if (i17 == -1) {
                    i17 = i19;
                }
                i18 = i19;
            }
        }
        if (this.f148a != 0) {
            d dVar3 = this.f149b;
            dVar3.f116h0 = gVar.C0;
            c cVar = dVar3.H;
            c cVar2 = dVar3.J;
            int i21 = this.f155h;
            if (i10 > 0) {
                i21 += gVar.O0;
            }
            if (z2) {
                cVar2.a(this.f153f, i21);
                if (z10) {
                    cVar.a(this.f151d, this.j);
                }
                if (i10 > 0) {
                    this.f153f.f95d.H.a(cVar2, 0);
                }
            } else {
                cVar.a(this.f151d, i21);
                if (z10) {
                    cVar2.a(this.f153f, this.j);
                }
                if (i10 > 0) {
                    this.f151d.f95d.J.a(cVar, 0);
                }
            }
            d dVar4 = null;
            int i22 = 0;
            while (i22 < i15) {
                int i23 = this.f160n + i22;
                if (i23 >= gVar.a1) {
                    return;
                }
                d dVar5 = gVar.Z0[i23];
                if (i22 == 0) {
                    dVar5.f(dVar5.I, this.f152e, this.f156i);
                    int i24 = gVar.D0;
                    float f10 = gVar.J0;
                    if (this.f160n == 0) {
                        int i25 = gVar.F0;
                        i11 = -1;
                        if (i25 != -1) {
                            f10 = gVar.L0;
                        }
                        i24 = i25;
                        dVar5.f118i0 = i24;
                        dVar5.f108d0 = f10;
                    } else {
                        i11 = -1;
                    }
                    if (z10 && (i25 = gVar.H0) != i11) {
                        f10 = gVar.N0;
                        i24 = i25;
                    }
                    dVar5.f118i0 = i24;
                    dVar5.f108d0 = f10;
                }
                if (i22 == i15 - 1) {
                    dVar5.f(dVar5.K, this.f154g, this.f157k);
                }
                if (dVar4 != null) {
                    c cVar3 = dVar4.K;
                    c cVar4 = dVar5.I;
                    cVar4.a(cVar3, gVar.P0);
                    if (i22 == i17) {
                        int i26 = this.f156i;
                        if (cVar4.h()) {
                            cVar4.f99h = i26;
                        }
                    }
                    cVar3.a(cVar4, 0);
                    if (i22 == i18 + 1) {
                        int i27 = this.f157k;
                        if (cVar3.h()) {
                            cVar3.f99h = i27;
                        }
                    }
                }
                if (dVar5 != dVar3) {
                    if (z2) {
                        int i28 = gVar.Q0;
                        if (i28 == 0) {
                            dVar5.J.a(cVar2, 0);
                        } else if (i28 == 1) {
                            dVar5.H.a(cVar, 0);
                        } else if (i28 == 2) {
                            dVar5.H.a(cVar, 0);
                            dVar5.J.a(cVar2, 0);
                        }
                    } else {
                        int i29 = gVar.Q0;
                        if (i29 == 0) {
                            dVar5.H.a(cVar, 0);
                        } else if (i29 == 1) {
                            dVar5.J.a(cVar2, 0);
                        } else if (i29 == 2) {
                            if (z11) {
                                dVar5.H.a(this.f151d, this.f155h);
                                dVar5.J.a(this.f153f, this.j);
                            } else {
                                dVar5.H.a(cVar, 0);
                                dVar5.J.a(cVar2, 0);
                            }
                        }
                    }
                }
                i22++;
                dVar4 = dVar5;
            }
            return;
        }
        d dVar6 = this.f149b;
        dVar6.f118i0 = gVar.D0;
        c cVar5 = dVar6.K;
        c cVar6 = dVar6.I;
        int i30 = this.f156i;
        if (i10 > 0) {
            i30 += gVar.P0;
        }
        cVar6.a(this.f152e, i30);
        if (z10) {
            cVar5.a(this.f154g, this.f157k);
        }
        if (i10 > 0) {
            this.f152e.f95d.K.a(cVar6, 0);
        }
        if (gVar.R0 != 3 || dVar6.D) {
            dVar = dVar6;
        } else {
            for (int i31 = 0; i31 < i15; i31++) {
                int i32 = this.f160n + (z2 ? (i15 - 1) - i31 : i31);
                if (i32 >= gVar.a1) {
                    break;
                }
                dVar = gVar.Z0[i32];
                if (dVar.D) {
                    break;
                }
            }
            dVar = dVar6;
        }
        int i33 = 0;
        d dVar7 = null;
        while (i33 < i15) {
            int i34 = z2 ? (i15 - 1) - i33 : i33;
            int i35 = this.f160n + i34;
            if (i35 >= gVar.a1) {
                return;
            }
            d dVar8 = gVar.Z0[i35];
            if (i33 == 0) {
                dVar8.f(dVar8.H, this.f151d, this.f155h);
            }
            if (i34 == 0) {
                int i36 = gVar.C0;
                float f11 = z2 ? 1.0f - gVar.I0 : gVar.I0;
                if (this.f160n == 0) {
                    int i37 = gVar.E0;
                    i12 = i36;
                    if (i37 != -1) {
                        f11 = z2 ? 1.0f - gVar.K0 : gVar.K0;
                        i13 = i37;
                    }
                    dVar8.f116h0 = i13;
                    dVar8.f106c0 = f11;
                } else {
                    i12 = i36;
                }
                if (!z10 || (i13 = gVar.G0) == -1) {
                    i13 = i12;
                } else {
                    f11 = z2 ? 1.0f - gVar.M0 : gVar.M0;
                }
                dVar8.f116h0 = i13;
                dVar8.f106c0 = f11;
            }
            if (i33 == i15 - 1) {
                dVar8.f(dVar8.J, this.f153f, this.j);
            }
            if (dVar7 != null) {
                c cVar7 = dVar7.J;
                c cVar8 = dVar8.H;
                cVar8.a(cVar7, gVar.O0);
                if (i33 == i17) {
                    int i38 = this.f155h;
                    if (cVar8.h()) {
                        cVar8.f99h = i38;
                    }
                }
                cVar7.a(cVar8, 0);
                if (i33 == i18 + 1) {
                    int i39 = this.j;
                    if (cVar7.h()) {
                        cVar7.f99h = i39;
                    }
                }
            }
            if (dVar8 != dVar6) {
                int i40 = gVar.R0;
                c6 = 3;
                if (i40 == 3 && dVar.D && dVar8 != dVar && dVar8.D) {
                    dVar8.L.a(dVar.L, 0);
                } else if (i40 == 0) {
                    dVar8.I.a(cVar6, 0);
                } else if (i40 == 1) {
                    dVar8.K.a(cVar5, 0);
                } else if (z11) {
                    dVar8.I.a(this.f152e, this.f156i);
                    dVar8.K.a(this.f154g, this.f157k);
                } else {
                    dVar8.I.a(cVar6, 0);
                    dVar8.K.a(cVar5, 0);
                }
            } else {
                c6 = 3;
            }
            i33++;
            dVar7 = dVar8;
        }
    }

    public final int c() {
        return this.f148a == 1 ? this.f159m - this.f164r.P0 : this.f159m;
    }

    public final int d() {
        return this.f148a == 0 ? this.f158l - this.f164r.O0 : this.f158l;
    }

    public final void e(int i10) {
        g gVar;
        int i11;
        int i12 = this.f162p;
        if (i12 == 0) {
            return;
        }
        int i13 = this.f161o;
        int i14 = i10 / i12;
        int i15 = 0;
        while (true) {
            gVar = this.f164r;
            if (i15 >= i13 || (i11 = this.f160n + i15) >= gVar.a1) {
                break;
            }
            d dVar = gVar.Z0[i11];
            if (this.f148a == 0) {
                if (dVar != null) {
                    int[] iArr = dVar.f129o0;
                    if (iArr[0] == 3 && dVar.f131q == 0) {
                        gVar.Q(1, i14, iArr[1], dVar.k(), dVar);
                    }
                }
            } else if (dVar != null) {
                int[] iArr2 = dVar.f129o0;
                if (iArr2[1] == 3 && dVar.f132r == 0) {
                    int i16 = i14;
                    gVar.Q(iArr2[0], dVar.n(), 1, i16, dVar);
                    i14 = i16;
                }
            }
            i15++;
        }
        this.f158l = 0;
        this.f159m = 0;
        this.f149b = null;
        this.f150c = 0;
        int i17 = this.f161o;
        for (int i18 = 0; i18 < i17; i18++) {
            int i19 = this.f160n + i18;
            if (i19 >= gVar.a1) {
                return;
            }
            d dVar2 = gVar.Z0[i19];
            if (this.f148a == 0) {
                int iN = dVar2.n();
                int i20 = gVar.O0;
                if (dVar2.f112f0 == 8) {
                    i20 = 0;
                }
                this.f158l = iN + i20 + this.f158l;
                int iO = gVar.O(dVar2, this.f163q);
                if (this.f149b == null || this.f150c < iO) {
                    this.f149b = dVar2;
                    this.f150c = iO;
                    this.f159m = iO;
                }
            } else {
                int iP = gVar.P(dVar2, this.f163q);
                int iO2 = gVar.O(dVar2, this.f163q);
                int i21 = gVar.P0;
                if (dVar2.f112f0 == 8) {
                    i21 = 0;
                }
                this.f159m = iO2 + i21 + this.f159m;
                if (this.f149b == null || this.f150c < iP) {
                    this.f149b = dVar2;
                    this.f150c = iP;
                    this.f158l = iP;
                }
            }
        }
    }

    public final void f(int i10, c cVar, c cVar2, c cVar3, c cVar4, int i11, int i12, int i13, int i14, int i15) {
        this.f148a = i10;
        this.f151d = cVar;
        this.f152e = cVar2;
        this.f153f = cVar3;
        this.f154g = cVar4;
        this.f155h = i11;
        this.f156i = i12;
        this.j = i13;
        this.f157k = i14;
        this.f163q = i15;
    }
}
