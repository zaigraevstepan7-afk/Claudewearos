package b0;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f1291a = new c(0);

    /* renamed from: b, reason: collision with root package name */
    public static final c f1292b = new c(1);

    /* renamed from: c, reason: collision with root package name */
    public static final k0 f1293c = new k0(0, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final ab.d f1294d = new ab.d(1);

    /* renamed from: e, reason: collision with root package name */
    public static final ab.d f1295e = new ab.d(2);

    /* renamed from: f, reason: collision with root package name */
    public static final ab.d f1296f = new ab.d(3);

    /* renamed from: g, reason: collision with root package name */
    public static final ab.d f1297g = new ab.d(4);

    /* renamed from: h, reason: collision with root package name */
    public static final int f1298h = 9;

    /* renamed from: i, reason: collision with root package name */
    public static final int f1299i = 6;
    public static final int j = 10;

    /* renamed from: k, reason: collision with root package name */
    public static final int f1300k = 5;

    /* renamed from: l, reason: collision with root package name */
    public static final int f1301l = 15;

    public static final v1.o A(v1.o oVar) {
        v0 v0Var = v0.f1446a;
        return oVar.c(new w0());
    }

    public static final v1.o B(v1.o oVar, d2 d2Var) {
        return oVar.c(new q0(d2Var));
    }

    public static final v1.o C(v1.o oVar, ej.c cVar) {
        return oVar.c(new v1(cVar));
    }

    public static final void a(v1.o oVar, v1.c cVar, p1.e eVar, f1.i0 i0Var, int i10, int i11) {
        int i12;
        i0Var.c0(380139498);
        if ((i10 & 6) == 0) {
            i12 = (i0Var.f(oVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= i0Var.f(cVar) ? 32 : 16;
        }
        int i14 = i12 | 384;
        if ((i10 & 3072) == 0) {
            i14 |= i0Var.h(eVar) ? 2048 : 1024;
        }
        if (i0Var.T(i14 & 1, (i14 & 1171) != 1170)) {
            if (i13 != 0) {
                cVar = v1.b.f17547a;
            }
            t2.q0 q0VarD = r.d(cVar, false);
            boolean zF = i0Var.f(q0VarD) | ((i14 & 7168) == 2048);
            Object objQ = i0Var.Q();
            if (zF || objQ == f1.m.f6385a) {
                objQ = new ab.g(1, q0VarD, eVar);
                i0Var.l0(objQ);
            }
            t2.z.b(oVar, (ej.e) objQ, i0Var, i14 & 14, 0);
        } else {
            i0Var.W();
        }
        v1.c cVar2 = cVar;
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new x(oVar, cVar2, eVar, i10, i11, 0);
        }
    }

    public static k1 b(float f10, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        float f11 = 0;
        return new k1(f10, f11, f10, f11);
    }

    public static final k1 c(float f10, float f11, float f12, float f13) {
        return new k1(f10, f11, f12, f13);
    }

    public static k1 d(float f10, float f11, float f12, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        float f13 = 0;
        if ((i10 & 4) != 0) {
            f11 = 0;
        }
        if ((i10 & 8) != 0) {
            f12 = 0;
        }
        return new k1(f10, f13, f11, f12);
    }

    public static final void e(f1.i0 i0Var, v1.o oVar) {
        q qVar = q.f1398c;
        int iHashCode = Long.hashCode(i0Var.T);
        v1.o oVarC = v1.a.c(i0Var, oVar);
        f1.n1 n1VarL = i0Var.l();
        v2.h.f17668w.getClass();
        v2.f fVar = v2.g.f17645b;
        i0Var.e0();
        if (i0Var.S) {
            i0Var.k(fVar);
        } else {
            i0Var.o0();
        }
        f1.s.M(v2.g.f17649f, i0Var, qVar);
        f1.s.M(v2.g.f17648e, i0Var, n1VarL);
        f1.s.I(v2.g.f17651h, i0Var);
        f1.s.M(v2.g.f17647d, i0Var, oVarC);
        f1.s.M(v2.g.f17650g, i0Var, Integer.valueOf(iHashCode));
        i0Var.p(true);
    }

    public static k0 f(int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return new k0(0, i10);
    }

    public static v1.o g(float f10, v1.o oVar) {
        return oVar.c(new k(f10));
    }

    public static final float h(i1 i1Var, s3.m mVar) {
        return mVar == s3.m.f14752a ? i1Var.c(mVar) : i1Var.b(mVar);
    }

    public static final float i(i1 i1Var, s3.m mVar) {
        return mVar == s3.m.f14752a ? i1Var.b(mVar) : i1Var.c(mVar);
    }

    public static final v1.o j(v1.o oVar, k0 k0Var) {
        return oVar.c(new y1(k0Var));
    }

    public static final n1 k(t2.p0 p0Var) {
        Object objC0 = p0Var.c0();
        if (objC0 instanceof n1) {
            return (n1) objC0;
        }
        return null;
    }

    public static final float l(n1 n1Var) {
        if (n1Var != null) {
            return n1Var.f1381a;
        }
        return 0.0f;
    }

    public static final boolean m(int i10, long j4, int i11) {
        int iJ = s3.a.j(j4);
        if (i10 > s3.a.h(j4) || iJ > i10) {
            return false;
        }
        return i11 <= s3.a.g(j4) && s3.a.i(j4) <= i11;
    }

    public static t2.r0 n(m1 m1Var, int i10, int i11, int i12, int i13, int i14, t2.s0 s0Var, List list, t2.f1[] f1VarArr, int i15) {
        int i16;
        float f10;
        long j4;
        int i17;
        int i18;
        int i19;
        List list2 = list;
        long j10 = i14;
        int[] iArr = new int[i15];
        int iMax = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int iMin = 0;
        float f11 = 0.0f;
        while (i20 < i15) {
            t2.p0 p0Var = (t2.p0) list2.get(i20);
            float fL = l(k(p0Var));
            if (fL > 0.0f) {
                f11 += fL;
                i21++;
                j4 = j10;
                i17 = i20;
            } else {
                int i23 = i12 - i22;
                t2.f1 f1VarY = f1VarArr[i20];
                j4 = j10;
                if (f1VarY == null) {
                    if (i12 == Integer.MAX_VALUE) {
                        i17 = i20;
                        i18 = i21;
                        i19 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                    } else {
                        i17 = i20;
                        i18 = i21;
                        i19 = i23 < 0 ? 0 : i23;
                    }
                    f1VarY = p0Var.Y(m1Var.e(false, 0, i19, i13));
                } else {
                    i17 = i20;
                    i18 = i21;
                }
                t2.f1 f1Var = f1VarY;
                int iD = m1Var.d(f1Var);
                int iC = m1Var.c(f1Var);
                iArr[i17] = iD;
                int i24 = i23 - iD;
                if (i24 < 0) {
                    i24 = 0;
                }
                iMin = Math.min(i14, i24);
                i22 += iD + iMin;
                iMax = Math.max(iMax, iC);
                f1VarArr[i17] = f1Var;
                i21 = i18;
            }
            i20 = i17 + 1;
            j10 = j4;
        }
        long j11 = j10;
        if (i21 == 0) {
            i22 -= iMin;
            i16 = 0;
        } else {
            long j12 = (r21 - 1) * j11;
            long jRound = ((i12 != Integer.MAX_VALUE ? i12 : i10) - i22) - j12;
            if (jRound < 0) {
                jRound = 0;
            }
            float f12 = jRound / f11;
            for (int i25 = 0; i25 < i15; i25++) {
                jRound -= Math.round(l(k((t2.p0) list2.get(i25))) * f12);
            }
            int i26 = iMax;
            int i27 = 0;
            int i28 = 0;
            while (i27 < i15) {
                if (f1VarArr[i27] == null) {
                    t2.p0 p0Var2 = (t2.p0) list2.get(i27);
                    n1 n1VarK = k(p0Var2);
                    float fL2 = l(n1VarK);
                    if (fL2 <= 0.0f) {
                        c0.a.b("All weights <= 0 should have placeables");
                    }
                    f10 = f12;
                    int iSignum = Long.signum(jRound);
                    jRound -= iSignum;
                    int iMax2 = Math.max(0, Math.round(fL2 * f10) + iSignum);
                    t2.f1 f1VarY2 = p0Var2.Y(m1Var.e(true, (!(n1VarK != null ? n1VarK.f1382b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i13));
                    int iD2 = m1Var.d(f1VarY2);
                    int iC2 = m1Var.c(f1VarY2);
                    iArr[i27] = iD2;
                    i28 += iD2;
                    int iMax3 = Math.max(i26, iC2);
                    f1VarArr[i27] = f1VarY2;
                    i26 = iMax3;
                } else {
                    f10 = f12;
                }
                i27++;
                list2 = list;
                f12 = f10;
            }
            i16 = (int) (i28 + j12);
            int i29 = i12 - i22;
            if (i16 < 0) {
                i16 = 0;
            }
            if (i16 > i29) {
                i16 = i29;
            }
            iMax = i26;
        }
        int i30 = i16 + i22;
        if (i30 < 0) {
            i30 = 0;
        }
        int iMax4 = Math.max(i30, i10);
        int iMax5 = Math.max(iMax, Math.max(i11, 0));
        int[] iArr2 = new int[i15];
        m1Var.b(iMax4, s0Var, iArr, iArr2);
        return m1Var.j(f1VarArr, s0Var, iArr2, iMax4, iMax5);
    }

    public static final v1.o o(v1.o oVar, ej.c cVar) {
        return oVar.c(new e1(cVar));
    }

    public static final v1.o p(v1.o oVar, float f10, float f11) {
        return oVar.c(new b1(f10, f11));
    }

    public static v1.o q(v1.o oVar, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        return p(oVar, f10, f11);
    }

    public static final v1.o r(v1.o oVar, ej.c cVar) {
        return oVar.c(new d0(cVar));
    }

    public static final v1.o s(v1.o oVar, i1 i1Var) {
        return oVar.c(new j1(i1Var));
    }

    public static final v1.o t(float f10, v1.o oVar) {
        return oVar.c(new g1(f10, f10, f10, f10));
    }

    public static final v1.o u(v1.o oVar, float f10, float f11) {
        return oVar.c(new g1(f10, f11, f10, f11));
    }

    public static v1.o v(v1.o oVar, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        return u(oVar, f10, f11);
    }

    public static final v1.o w(v1.o oVar, float f10, float f11, float f12, float f13) {
        return oVar.c(new g1(f10, f11, f12, f13));
    }

    public static v1.o x(v1.o oVar, float f10, float f11, float f12, float f13, int i10) {
        if ((i10 & 1) != 0) {
            f10 = 0;
        }
        if ((i10 & 2) != 0) {
            f11 = 0;
        }
        if ((i10 & 4) != 0) {
            f12 = 0;
        }
        if ((i10 & 8) != 0) {
            f13 = 0;
        }
        return w(oVar, f10, f11, f12, f13);
    }

    public static final u0 y(l4.b bVar) {
        return new u0(bVar.f9967a, bVar.f9968b, bVar.f9969c, bVar.f9970d);
    }

    public static final void z(StringBuilder sb2, String str) {
        if (sb2.length() > 0) {
            sb2.append('+');
        }
        sb2.append(str);
    }
}
