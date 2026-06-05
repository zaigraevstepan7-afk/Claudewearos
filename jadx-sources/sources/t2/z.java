package t2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final w0 f15683a = new w0(6);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f15684b = new Object();

    public static final void a(p1 p1Var, v1.o oVar, ej.e eVar, f1.i0 i0Var, int i10) {
        int i11;
        i0Var.c0(-511989831);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.h(p1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.f(oVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= i0Var.h(eVar) ? 256 : 128;
        }
        if (i0Var.T(i11 & 1, (i11 & 147) != 146)) {
            int iHashCode = Long.hashCode(i0Var.T);
            f1.g0 g0VarJ = f1.s.J(i0Var);
            v1.o oVarC = v1.a.c(i0Var, oVar);
            f1.n1 n1VarL = i0Var.l();
            v2.f fVar = v2.f.f17617c;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar);
            } else {
                i0Var.o0();
            }
            f1.s.M(p1Var.f15624c, i0Var, p1Var);
            f1.s.M(p1Var.f15625d, i0Var, g0VarJ);
            f1.s.M(p1Var.f15626e, i0Var, eVar);
            v2.h.f17668w.getClass();
            f1.s.M(v2.g.f17648e, i0Var, n1VarL);
            f1.s.I(v2.g.f17651h, i0Var);
            f1.s.M(v2.g.f17647d, i0Var, oVarC);
            f1.s.M(v2.g.f17650g, i0Var, Integer.valueOf(iHashCode));
            i0Var.p(true);
            if (i0Var.F()) {
                i0Var.b0(-1259187287);
                i0Var.p(false);
            } else {
                i0Var.b0(-1259245908);
                boolean zH = i0Var.h(p1Var);
                Object objQ = i0Var.Q();
                if (zH || objQ == f1.m.f6385a) {
                    objQ = new a2.f0(p1Var, 11);
                    i0Var.l0(objQ);
                }
                f1.s.j((ej.a) objQ, i0Var);
                i0Var.p(false);
            }
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new l1(p1Var, oVar, eVar, i10, 0);
        }
    }

    public static final void b(v1.o oVar, ej.e eVar, f1.i0 i0Var, int i10, int i11) {
        int i12;
        i0Var.c0(-1298353104);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (i0Var.f(oVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= i0Var.h(eVar) ? 32 : 16;
        }
        if (i0Var.T(i12 & 1, (i12 & 19) != 18)) {
            if (i13 != 0) {
                oVar = v1.l.f17564b;
            }
            Object objQ = i0Var.Q();
            if (objQ == f1.m.f6385a) {
                objQ = new p1(w0.f15663b);
                i0Var.l0(objQ);
            }
            a((p1) objQ, oVar, eVar, i0Var, (i12 << 3) & 1008);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new k1(oVar, eVar, i10, i11);
        }
    }

    public static final float c(long j, long j4) {
        return Math.min(Float.intBitsToFloat((int) (j4 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float d(t2.e1 r6, boolean r7, t2.o[] r8, float r9) {
        /*
            int r0 = r8.length
            r1 = 2143289344(0x7fc00000, float:NaN)
            r2 = 0
            r3 = r2
        L5:
            if (r3 >= r0) goto L20
            r4 = r8[r3]
            float r4 = r6.l(r4)
            boolean r5 = java.lang.Float.isNaN(r1)
            if (r5 != 0) goto L1c
            int r5 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r5 <= 0) goto L19
            r5 = 1
            goto L1a
        L19:
            r5 = r2
        L1a:
            if (r7 != r5) goto L1d
        L1c:
            r1 = r4
        L1d:
            int r3 = r3 + 1
            goto L5
        L20:
            boolean r6 = java.lang.Float.isNaN(r1)
            if (r6 == 0) goto L27
            return r9
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.z.d(t2.e1, boolean, t2.o[], float):float");
    }

    public static final b2.c e(w wVar) {
        w wVarD0 = wVar.d0();
        return wVarD0 != null ? wVarD0.z(wVar, true) : new b2.c(0.0f, 0.0f, (int) (wVar.I() >> 32), (int) (wVar.I() & 4294967295L));
    }

    public static final b2.c f(w wVar, boolean z2) {
        w wVarH = h(wVar);
        float fI = (int) (wVarH.I() >> 32);
        float fI2 = (int) (wVarH.I() & 4294967295L);
        b2.c cVarZ = wVarH.z(wVar, z2);
        float f10 = cVarZ.f1505d;
        float f11 = cVarZ.f1504c;
        float f12 = cVarZ.f1503b;
        float f13 = cVarZ.f1502a;
        if (z2) {
            if (f13 < 0.0f) {
                f13 = 0.0f;
            }
            if (f13 > fI) {
                f13 = fI;
            }
        }
        if (z2) {
            if (f12 < 0.0f) {
                f12 = 0.0f;
            }
            if (f12 > fI2) {
                f12 = fI2;
            }
        }
        if (z2) {
            if (f11 < 0.0f) {
                f11 = 0.0f;
            }
            if (f11 <= fI) {
                fI = f11;
            }
            f11 = fI;
        }
        if (z2) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            if (f10 <= fI2) {
                fI2 = f10;
            }
            f10 = fI2;
        }
        if (f13 == f11 || f12 == f10) {
            return b2.c.f1501e;
        }
        long jX = wVarH.x((Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L));
        long jX2 = wVarH.x((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L));
        long jX3 = wVarH.x((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
        long jX4 = wVarH.x((Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jX >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jX2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jX4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jX3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jX & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jX2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jX4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jX3 & 4294967295L));
        return new b2.c(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final boolean g(long j, long j4) {
        return j == j4;
    }

    public static final w h(w wVar) {
        w wVar2;
        w wVarD0 = wVar.d0();
        while (true) {
            w wVar3 = wVarD0;
            wVar2 = wVar;
            wVar = wVar3;
            if (wVar == null) {
                break;
            }
            wVarD0 = wVar.d0();
        }
        v2.i1 i1Var = wVar2 instanceof v2.i1 ? (v2.i1) wVar2 : null;
        if (i1Var == null) {
            return wVar2;
        }
        v2.i1 i1Var2 = i1Var.J;
        while (true) {
            v2.i1 i1Var3 = i1Var2;
            v2.i1 i1Var4 = i1Var;
            i1Var = i1Var3;
            if (i1Var == null) {
                return i1Var4;
            }
            i1Var2 = i1Var.J;
        }
    }

    public static final Object i(p0 p0Var) {
        Object objC0 = p0Var.c0();
        a0 a0Var = objC0 instanceof a0 ? (a0) objC0 : null;
        if (a0Var != null) {
            return a0Var.H;
        }
        return null;
    }

    public static final v2.o0 j(v2.o0 o0Var) {
        v2.f0 f0Var = o0Var.H.H;
        while (true) {
            v2.f0 f0VarU = f0Var.u();
            v2.f0 f0Var2 = null;
            if ((f0VarU != null ? f0VarU.A : null) == null) {
                v2.o0 o0VarU1 = f0Var.Y.f17584d.u1();
                fj.l.c(o0VarU1);
                return o0VarU1;
            }
            v2.f0 f0VarU2 = f0Var.u();
            if (f0VarU2 != null) {
                f0Var2 = f0VarU2.A;
            }
            fj.l.c(f0Var2);
            v2.f0 f0VarU3 = f0Var.u();
            fj.l.c(f0VarU3);
            f0Var = f0VarU3.A;
            fj.l.c(f0Var);
        }
    }

    public static final v1.o k(v1.o oVar, ej.f fVar) {
        return oVar.c(new x(fVar));
    }

    public static final v1.o l(v1.o oVar, Object obj) {
        return oVar.c(new y(obj));
    }

    public static final v1.o m(v1.o oVar, ej.c cVar) {
        return oVar.c(new x0(cVar));
    }

    public static final v1.o n(v1.o oVar, ej.c cVar) {
        return oVar.c(new z0(cVar));
    }

    public static final long o(long j, long j4) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j4 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
