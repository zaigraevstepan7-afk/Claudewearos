package c1;

import java.util.WeakHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final f1.v f2567a = new f1.v(new b6.j(3));

    /* renamed from: b, reason: collision with root package name */
    public static final float f2568b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f2569c;

    static {
        new f1.s0(new b6.j(4));
        new t.s(0.8f, 0.0f, 0.8f, 0.15f);
        float f10 = 4;
        f2568b = f10;
        f2569c = 16 - f10;
    }

    public static final void a(v1.o oVar, g3.n0 n0Var, g3.n0 n0Var2, p1.e eVar, ej.f fVar, float f10, b0.d2 d2Var, k8 k8Var, f1.i0 i0Var, int i10, int i11) {
        int i12;
        float f11;
        k8 k8Var2;
        int i13;
        v1.e eVar2 = v1.b.E;
        i0Var.c0(-2033800111);
        if ((i10 & 6) == 0) {
            i12 = (i0Var.f(oVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= i0Var.h(cb.a.f3145a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= i0Var.f(n0Var) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= i0Var.h(null) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= i0Var.f(n0Var2) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= i0Var.f(eVar2) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i12 |= i0Var.h(eVar) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i12 |= i0Var.h(fVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            f11 = f10;
            i12 |= i0Var.c(f11) ? 67108864 : 33554432;
        } else {
            f11 = f10;
        }
        if ((805306368 & i10) == 0) {
            i12 |= i0Var.f(d2Var) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            k8Var2 = k8Var;
            i13 = i11 | (i0Var.f(k8Var2) ? 4 : 2);
        } else {
            k8Var2 = k8Var;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= i0Var.f(null) ? 32 : 16;
        }
        if (i0Var.T(i12 & 1, ((306783379 & i12) == 306783378 && (i13 & 19) == 18) ? false : true)) {
            ((l1) i0Var.j(f2567a)).a(new z5(oVar, n0Var, n0Var2, eVar, fVar, f11, d2Var, k8Var2), i0Var, 0);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new o(oVar, n0Var, n0Var2, eVar, fVar, f10, d2Var, k8Var, i10, i11);
        }
    }

    public static final void b(v1.o oVar, final p1.e eVar, ej.f fVar, float f10, b0.d2 d2Var, final k8 k8Var, f1.i0 i0Var, final int i10) {
        final v1.o oVar2;
        final ej.f fVar2;
        final b0.d2 d2Var2;
        int i11;
        i0Var.c0(1784421840);
        int i12 = i10 | 93232 | (i0Var.f(k8Var) ? 1048576 : 524288) | 12582912;
        if (i0Var.T(i12 & 1, (4793491 & i12) != 4793490)) {
            i0Var.Y();
            if ((i10 & 1) == 0 || i0Var.C()) {
                fVar = a1.f1875a;
                f10 = l8.f2398a;
                WeakHashMap weakHashMap = b0.f2.f1311w;
                b0.a1 a1Var = new b0.a1(new b0.x1(b0.c.e(i0Var).f1318g, b0.c.e(i0Var).f1313b), b0.d.f1301l | 16);
                i11 = i12 & (-458753);
                oVar = v1.l.f17564b;
                d2Var2 = a1Var;
            } else {
                i0Var.W();
                i11 = i12 & (-458753);
                d2Var2 = d2Var;
            }
            int i13 = i11;
            v1.o oVar3 = oVar;
            fVar2 = fVar;
            i0Var.q();
            a(oVar3, p8.a(e1.e.f5378b, i0Var), g3.n0.f7150d, eVar, fVar2, (s3.f.e(f10, Float.NaN) || s3.f.e(f10, Float.POSITIVE_INFINITY)) ? l8.f2398a : f10, d2Var2, k8Var, i0Var, 14380086, (i13 >> 18) & 126);
            oVar2 = oVar3;
        } else {
            i0Var.W();
            oVar2 = oVar;
            fVar2 = fVar;
            d2Var2 = d2Var;
        }
        final float f11 = f10;
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e(eVar, fVar2, f11, d2Var2, k8Var, i10) { // from class: c1.n

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p1.e f2454b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ ej.f f2455c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ float f2456d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ b0.d2 f2457e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ k8 f2458f;

                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iO = f1.s.O(391);
                    p.b(this.f2453a, this.f2454b, this.f2455c, this.f2456d, this.f2457e, this.f2458f, (f1.i0) obj, iO);
                    return pi.o.f13011a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final v1.o r38, final d1.j0 r39, final long r40, final long r42, final long r44, long r46, final g3.n0 r48, final g3.n0 r49, ej.a r50, final b0.i r51, p1.e r52, p1.e r53, final float r54, f1.i0 r55, final int r56) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.p.c(v1.o, d1.j0, long, long, long, long, g3.n0, g3.n0, ej.a, b0.i, p1.e, p1.e, float, f1.i0, int):void");
    }
}
