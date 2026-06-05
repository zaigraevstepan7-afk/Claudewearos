package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class o2 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f2510a = 8;

    /* renamed from: b, reason: collision with root package name */
    public static final float f2511b = 12;

    /* renamed from: c, reason: collision with root package name */
    public static final float f2512c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f2513d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f2514e;

    /* renamed from: f, reason: collision with root package name */
    public static final float f2515f;

    static {
        float f10 = 16;
        f2512c = f10;
        f2513d = f10;
        f2514e = f10;
        f2515f = f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final p1.e r38, final v1.o r39, final ej.e r40, ej.e r41, ej.e r42, c1.h2 r43, float r44, float r45, f1.i0 r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.o2.a(p1.e, v1.o, ej.e, ej.e, ej.e, c1.h2, float, float, f1.i0, int, int):void");
    }

    public static final void b(ej.e eVar, ej.e eVar2, p1.e eVar3, ej.e eVar4, ej.e eVar5, f1.i0 i0Var, int i10) {
        i0Var.c0(-61277522);
        int i11 = i10 | (i0Var.h(eVar) ? 4 : 2) | (i0Var.h(eVar2) ? 32 : 16) | (i0Var.h(eVar4) ? 2048 : 1024) | (i0Var.h(eVar5) ? 16384 : 8192);
        int i12 = 1;
        if (i0Var.T(i11 & 1, (i11 & 9363) != 9362)) {
            Object objQ = i0Var.Q();
            f1.f fVar = f1.m.f6385a;
            if (objQ == fVar) {
                objQ = new t2();
                i0Var.l0(objQ);
            }
            t2 t2Var = (t2) objQ;
            p1.e eVar6 = new p1.e(new s.f(qi.k.c0(new ej.e[]{eVar3, eVar4 == null ? b1.f1928a : eVar4, eVar5 == null ? b1.f1929b : eVar5, eVar == null ? b1.f1930c : eVar, eVar2 == null ? b1.f1931d : eVar2}), i12), true, 1271844412);
            Object objQ2 = i0Var.Q();
            if (objQ2 == fVar) {
                objQ2 = new t2.v0(t2Var);
                i0Var.l0(objQ2);
            }
            t2.q0 q0Var = (t2.q0) objQ2;
            int iHashCode = Long.hashCode(i0Var.T);
            f1.n1 n1VarL = i0Var.l();
            v1.o oVarC = v1.a.c(i0Var, v1.l.f17564b);
            v2.h.f17668w.getClass();
            v2.f fVar2 = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar2);
            } else {
                i0Var.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var, q0Var);
            f1.s.M(v2.g.f17648e, i0Var, n1VarL);
            v2.e eVar7 = v2.g.f17650g;
            if (i0Var.S || !fj.l.b(i0Var.Q(), Integer.valueOf(iHashCode))) {
                m6.a.l(iHashCode, i0Var, iHashCode, eVar7);
            }
            f1.s.M(v2.g.f17647d, i0Var, oVarC);
            eVar6.invoke(i0Var, 0);
            i0Var.p(true);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new bb.a(eVar, eVar2, eVar3, eVar4, eVar5, i10);
        }
    }

    public static final void c(long j, e1.l0 l0Var, ej.e eVar, f1.i0 i0Var, int i10) {
        long j4;
        f1.i0 i0Var2;
        ej.e eVar2;
        i0Var.c0(-285397024);
        int i11 = (i0Var.e(j) ? 4 : 2) | i10 | (i0Var.h(eVar) ? 256 : 128);
        if (i0Var.T(i11 & 1, (i11 & 147) != 146)) {
            j4 = j;
            i0Var2 = i0Var;
            d1.i.b(j4, p8.a(l0Var, i0Var), eVar, i0Var2, i11 & 910);
            eVar2 = eVar;
        } else {
            j4 = j;
            i0Var2 = i0Var;
            eVar2 = eVar;
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new k2(j4, l0Var, eVar2, i10);
        }
    }

    public static final int d(t2.r rVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j) {
        int iMax = Math.max(Math.max(s3.a.i(j), rVar.I0(i15 == 1 ? e1.t.f5661m : i15 == 2 ? e1.t.f5668t : e1.t.f5665q)), Math.max(i10, Math.max(i12 + i13 + i14, i11)) + i16);
        int iG = s3.a.g(j);
        return iMax > iG ? iG : iMax;
    }
}
