package eb;

import b0.r;
import c1.d3;
import c2.e0;
import c2.f0;
import c2.q0;
import c2.w;
import f1.a1;
import f1.i0;
import f1.n1;
import f1.t1;
import pi.o;
import t.s;
import v.n;
import w2.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final s f5898a = new s(0.19f, 1.0f, 0.22f, 1.0f);

    /* renamed from: b, reason: collision with root package name */
    public static final s f5899b = new s(0.19f, 1.0f, 0.22f, 1.0f);

    /* renamed from: c, reason: collision with root package name */
    public static final s f5900c = new s(0.19f, 1.0f, 0.22f, 1.0f);

    public static final void a(final k kVar, final int i10, final int i11, final float f10, float f11, final boolean z2, final float f12, final float f13, final float f14, final boolean z10, final float f15, final float f16, final float f17, final ej.a aVar, final ej.e eVar, final ej.c cVar, final ej.a aVar2, i0 i0Var, final int i12) {
        i0 i0Var2;
        final float f18;
        t1 t1Var;
        ej.e eVar2;
        Object objA;
        Object objA2;
        Object hVar;
        s3.c cVar2;
        Object obj;
        Integer num;
        t.c cVar3;
        int i13;
        int i14;
        j jVar;
        final boolean z11;
        t.c cVar4;
        k kVar2;
        t.c cVar5;
        float f19;
        float fO;
        float fO2;
        final float fO3;
        j jVar2 = kVar.f5908e;
        int i15 = kVar.f5909f;
        long j = kVar.f5904a;
        fj.l.f(aVar, "onCloseRequested");
        fj.l.f(eVar, "onFinishedClosing");
        fj.l.f(cVar, "onLaunchApp");
        fj.l.f(aVar2, "onAppLaunched");
        i0Var.c0(379086975);
        int i16 = i12 | (i0Var.h(kVar) ? 32 : 16) | (i0Var.d(i10) ? 256 : 128) | (i0Var.d(i11) ? 2048 : 1024) | (i0Var.c(f10) ? 16384 : 8192) | 196608 | (i0Var.g(z2) ? 1048576 : 524288) | (i0Var.c(f12) ? 8388608 : 4194304) | (i0Var.c(f13) ? 67108864 : 33554432) | (i0Var.c(f14) ? 536870912 : 268435456);
        int i17 = 0 | (i0Var.g(z10) ? (char) 4 : (char) 2) | (i0Var.c(f15) ? 32 : 16) | (i0Var.c(f16) ? '\u0100' : '\u0080') | (i0Var.c(f17) ? '\u0800' : '\u0400') | (i0Var.h(aVar) ? '\u4000' : '\u2000') | (i0Var.h(cVar) ? (char) 0 : (char) 0) | (i0Var.h(aVar2) ? (char) 0 : (char) 0);
        if (i0Var.T(i16 & 1, ((i16 & 306783377) == 306783376 && (4793491 & i17) == 4793490) ? false : true)) {
            final float f20 = 36;
            if (i10 <= 0 || i11 <= 0) {
                t1 t1VarU = i0Var.u();
                if (t1VarU != null) {
                    final int i18 = 0;
                    eVar2 = new ej.e(kVar, i10, i11, f10, f20, z2, f12, f13, f14, z10, f15, f16, f17, aVar, eVar, cVar, aVar2, i12, i18) { // from class: eb.a
                        public final /* synthetic */ float A;
                        public final /* synthetic */ float B;
                        public final /* synthetic */ float C;
                        public final /* synthetic */ boolean D;
                        public final /* synthetic */ float E;
                        public final /* synthetic */ float F;
                        public final /* synthetic */ float G;
                        public final /* synthetic */ ej.a H;
                        public final /* synthetic */ ej.e I;
                        public final /* synthetic */ ej.c J;
                        public final /* synthetic */ ej.a K;

                        /* renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f5846a;

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ k f5847b;

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ int f5848c;

                        /* renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ int f5849d;

                        /* renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ float f5850e;

                        /* renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ float f5851f;

                        /* renamed from: z, reason: collision with root package name */
                        public final /* synthetic */ boolean f5852z;

                        {
                            this.f5846a = i18;
                        }

                        @Override // ej.e
                        public final Object invoke(Object obj2, Object obj3) {
                            i0 i0Var3 = (i0) obj2;
                            switch (this.f5846a) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    i.a(this.f5847b, this.f5848c, this.f5849d, this.f5850e, this.f5851f, this.f5852z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, i0Var3, f1.s.O(71));
                                    break;
                                default:
                                    ((Integer) obj3).getClass();
                                    i.a(this.f5847b, this.f5848c, this.f5849d, this.f5850e, this.f5851f, this.f5852z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, i0Var3, f1.s.O(71));
                                    break;
                            }
                            return o.f13011a;
                        }
                    };
                    t1Var = t1VarU;
                    t1Var.f6456d = eVar2;
                }
                return;
            }
            s3.c cVar6 = (s3.c) i0Var.j(f1.f18262h);
            boolean zE = i0Var.e(j);
            Object objQ = i0Var.Q();
            Object obj2 = f1.m.f6385a;
            if (zE || objQ == obj2) {
                objA = t.d.a(0.0f, 0.01f);
                i0Var.l0(objA);
            } else {
                objA = objQ;
            }
            t.c cVar7 = (t.c) objA;
            boolean zE2 = i0Var.e(j);
            Object objQ2 = i0Var.Q();
            if (zE2 || objQ2 == obj2) {
                objA2 = t.d.a(0.0f, 0.01f);
                i0Var.l0(objA2);
            } else {
                objA2 = objQ2;
            }
            t.c cVar8 = (t.c) objA2;
            boolean zE3 = i0Var.e(j);
            Object objQ3 = i0Var.Q();
            if (zE3 || objQ3 == obj2) {
                objQ3 = t.d.a(0.0f, 0.01f);
                i0Var.l0(objQ3);
            }
            t.c cVar9 = (t.c) objQ3;
            boolean zE4 = i0Var.e(j) | i0Var.d(i15);
            Object objQ4 = i0Var.Q();
            if (zE4 || objQ4 == obj2) {
                objQ4 = f1.s.A(Boolean.FALSE);
                i0Var.l0(objQ4);
            }
            a1 a1Var = (a1) objQ4;
            float f21 = 330;
            int i19 = (int) (f21 / f12);
            boolean z12 = jVar2 != j.f5902b;
            boolean z13 = (i17 & 57344) == 16384;
            Object objQ5 = i0Var.Q();
            if (z13 || objQ5 == obj2) {
                objQ5 = new d3(3, aVar);
                i0Var.l0(objQ5);
            }
            wd.a.a(z12, (ej.a) objQ5, i0Var, 0, 0);
            Integer numValueOf = Integer.valueOf(i15);
            int i20 = i17 & 14;
            boolean zH = ((i17 & 896) == 256) | ((i17 & 3670016) == 1048576) | ((i16 & 3670016) == 1048576) | i0Var.h(kVar) | i0Var.h(cVar7) | i0Var.h(cVar8) | i0Var.h(cVar9) | i0Var.f(a1Var) | ((i17 & 29360128) == 8388608) | (i20 == 4) | ((i17 & 112) == 32) | i0Var.d(i19) | ((i16 & 29360128) == 8388608) | i0Var.d(i19) | i0Var.d(i19);
            Object objQ6 = i0Var.Q();
            if (zH || objQ6 == obj2) {
                cVar2 = cVar6;
                obj = obj2;
                num = numValueOf;
                cVar3 = cVar8;
                i13 = i20;
                i14 = i17;
                jVar = jVar2;
                z11 = z10;
                cVar4 = cVar7;
                hVar = new h(kVar, cVar4, cVar3, cVar9, z2, cVar, aVar2, eVar, a1Var, z11, f15, f16, i19, f12, i19, i19, null);
                kVar2 = kVar;
                cVar5 = cVar9;
                i0Var2 = i0Var;
                i0Var2.l0(hVar);
            } else {
                cVar2 = cVar6;
                hVar = objQ6;
                cVar5 = cVar9;
                obj = obj2;
                num = numValueOf;
                cVar4 = cVar7;
                cVar3 = cVar8;
                i13 = i20;
                i0Var2 = i0Var;
                i14 = i17;
                jVar = jVar2;
                kVar2 = kVar;
                z11 = z10;
            }
            f1.s.g(num, jVar, (ej.e) hVar, i0Var2);
            if (z11) {
                f19 = 0.0f;
                fO = cg.b.o(((Number) cVar4.e()).floatValue(), 0.0f, 1.2f);
            } else {
                f19 = 0.0f;
                fO = cg.b.o(((Number) cVar4.e()).floatValue(), 0.0f, 1.0f);
            }
            if (z11) {
                fO2 = cg.b.o(((Number) cVar3.e()).floatValue(), f19, 1.2f);
            } else {
                fO2 = cg.b.o(((Number) cVar3.e()).floatValue() < 0.5f ? cg.b.o(((Number) cVar3.e()).floatValue() * f13, f19, 0.6f) : (((((Number) cVar3.e()).floatValue() - 0.5f) / 0.5f) * 0.4f) + 0.6f, f19, 1.0f);
            }
            if (z11) {
                fO3 = cg.b.o(((Number) cVar4.e()).floatValue(), f19, 1.2f);
            } else {
                fO3 = cg.b.o(fO < 0.5f ? cg.b.o(fO * f14, f19, 0.425f) : (((fO - 0.5f) / 0.5f) * 0.575f) + 0.425f, f19, 1.0f);
            }
            float fFloatValue = ((Number) cVar5.e()).floatValue();
            s3.k kVar3 = kVar2.f5905b;
            float fC = (kVar3.c() / 2.0f) + kVar3.f14747a;
            float fA = (kVar3.a() / 2.0f) + kVar3.f14748b;
            float fC2 = kVar3.c();
            if (fC2 < 1.0f) {
                fC2 = 1.0f;
            }
            float fA2 = kVar3.a();
            if (fA2 < 1.0f) {
                fA2 = 1.0f;
            }
            float f22 = i10;
            float f23 = i11;
            float f24 = f23 / 2.0f;
            float fE = gk.b.e(f22, fC2, fO, fC2);
            float fE2 = gk.b.e(f23, fA2, fO, fA2);
            float fE3 = gk.b.e(f22 / 2.0f, fC, fO2, fC);
            float fE4 = gk.b.e(f24, fA, fO2, fA) - (fE2 / 2.0f);
            float f25 = fO * f21;
            float fO4 = (((f20 - 2) - f10) * cg.b.o((f25 - 72) / 86.0f, 0.0f, 1.0f)) + f10;
            float f26 = 0;
            float fO5 = cg.b.o((f25 - f26) / 330.0f, 0.0f, 1.0f);
            float fO6 = 1.0f - cg.b.o(((fFloatValue * f21) - f26) / 330.0f, 0.0f, 1.0f);
            s3.c cVar10 = cVar2;
            v1.o oVarL = b0.t1.l(b0.d.p(v1.l.f17564b, cVar10.h0(hj.a.H(fE3 - (fE / 2.0f))), cVar10.h0(hj.a.H(fE4))), cVar10.h0(hj.a.H(fE)), cVar10.h0(hj.a.H(fE2)));
            boolean zC = (i13 == 4) | ((i14 & 7168) == 2048) | i0Var2.c(fO3);
            Object objQ7 = i0Var2.Q();
            if (zC || objQ7 == obj) {
                objQ7 = new ej.c() { // from class: eb.b
                    @Override // ej.c
                    public final Object invoke(Object obj3) {
                        f0 f0Var = (f0) obj3;
                        fj.l.f(f0Var, "$this$graphicsLayer");
                        float f27 = (fO3 * (z11 ? f17 : 0.05f)) + 1.0f;
                        f0Var.p(f27);
                        f0Var.j(f27);
                        return o.f13011a;
                    }
                };
                i0Var2.l0(objQ7);
            }
            v1.o oVarC = z1.h.c(e0.q(oVarL, (ej.c) objQ7), j0.e.a(fO4));
            long j4 = w.f3054d;
            q0 q0Var = e0.f2986b;
            v1.o oVarF = n.f(oVarC, j4, q0Var);
            t2.q0 q0VarD = r.d(v1.b.f17547a, false);
            int iHashCode = Long.hashCode(i0Var2.T);
            n1 n1VarL = i0Var2.l();
            v1.o oVarC2 = v1.a.c(i0Var2, oVarF);
            v2.h.f17668w.getClass();
            ej.a aVar3 = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(aVar3);
            } else {
                i0Var2.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var2, q0VarD);
            f1.s.M(v2.g.f17648e, i0Var2, n1VarL);
            f1.s.w(i0Var2, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var2);
            f1.s.M(v2.g.f17647d, i0Var2, oVarC2);
            c2.g gVar = new c2.g(kVar2.f5906c);
            b0.i0 i0Var3 = b0.t1.f1433c;
            n.c(gVar, null, z1.h.a(fO6, i0Var3), t2.h.f15568f, i0Var2, 24624, 232);
            r.a(n.f(i0Var3, w.c(j4, fO5), q0Var), i0Var2, 0);
            i0Var2.p(true);
            f18 = f20;
        } else {
            i0Var2 = i0Var;
            i0Var2.W();
            f18 = f11;
        }
        t1 t1VarU2 = i0Var2.u();
        if (t1VarU2 != null) {
            final int i21 = 1;
            eVar2 = new ej.e(kVar, i10, i11, f10, f18, z2, f12, f13, f14, z10, f15, f16, f17, aVar, eVar, cVar, aVar2, i12, i21) { // from class: eb.a
                public final /* synthetic */ float A;
                public final /* synthetic */ float B;
                public final /* synthetic */ float C;
                public final /* synthetic */ boolean D;
                public final /* synthetic */ float E;
                public final /* synthetic */ float F;
                public final /* synthetic */ float G;
                public final /* synthetic */ ej.a H;
                public final /* synthetic */ ej.e I;
                public final /* synthetic */ ej.c J;
                public final /* synthetic */ ej.a K;

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f5846a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ k f5847b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f5848c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f5849d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ float f5850e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ float f5851f;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ boolean f5852z;

                {
                    this.f5846a = i21;
                }

                @Override // ej.e
                public final Object invoke(Object obj22, Object obj3) {
                    i0 i0Var32 = (i0) obj22;
                    switch (this.f5846a) {
                        case 0:
                            ((Integer) obj3).getClass();
                            i.a(this.f5847b, this.f5848c, this.f5849d, this.f5850e, this.f5851f, this.f5852z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, i0Var32, f1.s.O(71));
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            i.a(this.f5847b, this.f5848c, this.f5849d, this.f5850e, this.f5851f, this.f5852z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, i0Var32, f1.s.O(71));
                            break;
                    }
                    return o.f13011a;
                }
            };
            t1Var = t1VarU2;
            t1Var.f6456d = eVar2;
        }
    }
}
