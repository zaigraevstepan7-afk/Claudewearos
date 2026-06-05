package lb;

import c1.v7;
import c1.z4;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements ej.f {
    public final /* synthetic */ f1.f1 A;
    public final /* synthetic */ f1.f1 B;
    public final /* synthetic */ f1.f1 C;
    public final /* synthetic */ f1.f1 D;
    public final /* synthetic */ f1.f1 E;
    public final /* synthetic */ f1.a1 F;
    public final /* synthetic */ f1.f1 G;
    public final /* synthetic */ f1.a1 H;
    public final /* synthetic */ f1.f1 I;
    public final /* synthetic */ f1.a1 J;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10312a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.a f10313b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f10314c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f10315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f10316e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.q2 f10317f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10318z;

    public /* synthetic */ h0(float f10, ej.a aVar, f1.a1 a1Var, f1.a1 a1Var2, f1.a1 a1Var3, f1.a1 a1Var4, f1.f1 f1Var, f1.f1 f1Var2, f1.f1 f1Var3, f1.f1 f1Var4, f1.f1 f1Var5, f1.f1 f1Var6, f1.f1 f1Var7, f1.q2 q2Var, g gVar, boolean z2) {
        this.f10313b = aVar;
        this.f10314c = gVar;
        this.f10315d = z2;
        this.f10316e = f10;
        this.f10317f = q2Var;
        this.f10318z = a1Var;
        this.A = f1Var;
        this.B = f1Var2;
        this.C = f1Var3;
        this.D = f1Var4;
        this.E = f1Var5;
        this.F = a1Var2;
        this.G = f1Var6;
        this.H = a1Var3;
        this.I = f1Var7;
        this.J = a1Var4;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        switch (this.f10312a) {
            case 0:
                final b0.i1 i1Var = (b0.i1) obj;
                f1.i0 i0Var = (f1.i0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                fj.l.f(i1Var, "innerPadding");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= i0Var.f(i1Var) ? 4 : 2;
                }
                if (i0Var.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    f1.v vVar = jb.f.f8827g;
                    final f1.a1 a1Var = this.f10318z;
                    boolean zBooleanValue = ((Boolean) a1Var.getValue()).booleanValue();
                    final f1.a1 a1Var2 = this.F;
                    f1.r1 r1VarA = vVar.a(new jb.d(false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, zBooleanValue, ((Boolean) a1Var2.getValue()).booleanValue(), 0.0f, 0.0f, 0.0f, false, 0.0f, 31999));
                    final ej.a aVar = this.f10313b;
                    final g gVar = this.f10314c;
                    final boolean z2 = this.f10315d;
                    final float f10 = this.f10316e;
                    final f1.q2 q2Var = this.f10317f;
                    final f1.a1 a1Var3 = this.H;
                    final f1.f1 f1Var = this.A;
                    final f1.f1 f1Var2 = this.B;
                    final f1.f1 f1Var3 = this.C;
                    final f1.f1 f1Var4 = this.D;
                    final f1.f1 f1Var5 = this.E;
                    final f1.f1 f1Var6 = this.G;
                    final f1.f1 f1Var7 = this.I;
                    final f1.a1 a1Var4 = this.J;
                    f1.s.a(r1VarA, p1.j.d(2115372958, new ej.e() { // from class: lb.j0
                        @Override // ej.e
                        public final Object invoke(Object obj4, Object obj5) {
                            f1.i0 i0Var2 = (f1.i0) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            if (i0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                u6.v.f(b0.d.C(b0.d.s(b0.t1.f1433c, i1Var), b0.d.f1295e), null, p1.j.d(-1379929334, new h0(f10, aVar, a1Var3, a1Var2, a1Var, a1Var4, f1Var, f1Var2, f1Var3, f1Var4, f1Var5, f1Var6, f1Var7, q2Var, gVar, z2), i0Var2), i0Var2, 384, 2);
                            } else {
                                i0Var2.W();
                            }
                            return pi.o.f13011a;
                        }
                    }, i0Var), i0Var, 56);
                } else {
                    i0Var.W();
                }
                break;
            default:
                v1.o oVar = (v1.o) obj;
                f1.i0 i0Var2 = (f1.i0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                fj.l.f(oVar, "overscrollModifier");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= i0Var2.f(oVar) ? 4 : 2;
                }
                if (i0Var2.T(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    v1.o oVarC = oVar.c(b0.t1.f1433c);
                    b0.k1 k1VarD = b0.d.d(0.0f, 0.0f, 32, 7);
                    final ej.a aVar2 = this.f10313b;
                    boolean zF = i0Var2.f(aVar2);
                    final g gVar2 = this.f10314c;
                    boolean zH = zF | i0Var2.h(gVar2);
                    final boolean z10 = this.f10315d;
                    boolean zG = zH | i0Var2.g(z10);
                    final float f11 = this.f10316e;
                    boolean zC = zG | i0Var2.c(f11);
                    final f1.q2 q2Var2 = this.f10317f;
                    boolean zF2 = zC | i0Var2.f(q2Var2);
                    Object objQ = i0Var2.Q();
                    if (zF2 || objQ == f1.m.f6385a) {
                        final f1.a1 a1Var5 = this.f10318z;
                        final f1.a1 a1Var6 = this.F;
                        final f1.a1 a1Var7 = this.H;
                        final f1.a1 a1Var8 = this.J;
                        final f1.f1 f1Var8 = this.A;
                        final f1.f1 f1Var9 = this.B;
                        final f1.f1 f1Var10 = this.C;
                        final f1.f1 f1Var11 = this.D;
                        final f1.f1 f1Var12 = this.E;
                        final f1.f1 f1Var13 = this.G;
                        final f1.f1 f1Var14 = this.I;
                        ej.c cVar = new ej.c() { // from class: lb.u
                            @Override // ej.c
                            public final Object invoke(Object obj4) {
                                d0.h hVar = (d0.h) obj4;
                                fj.l.f(hVar, "$this$LazyColumn");
                                final ej.a aVar3 = aVar2;
                                final g gVar3 = gVar2;
                                final boolean z11 = z10;
                                final float f12 = f11;
                                final f1.a1 a1Var9 = a1Var5;
                                final f1.f1 f1Var15 = f1Var8;
                                final f1.f1 f1Var16 = f1Var9;
                                final f1.f1 f1Var17 = f1Var10;
                                final f1.f1 f1Var18 = f1Var11;
                                final f1.f1 f1Var19 = f1Var12;
                                final f1.a1 a1Var10 = a1Var6;
                                final f1.f1 f1Var20 = f1Var13;
                                final f1.a1 a1Var11 = a1Var7;
                                final f1.f1 f1Var21 = f1Var14;
                                d0.h.p(hVar, new p1.e(new ej.f() { // from class: lb.v
                                    @Override // ej.f
                                    public final Object c(Object obj5, Object obj6, Object obj7) {
                                        v1.o oVar2;
                                        j0.d dVar;
                                        long j;
                                        f1.i0 i0Var3 = (f1.i0) obj6;
                                        int iIntValue3 = ((Integer) obj7).intValue();
                                        fj.l.f((d0.c) obj5, "$this$item");
                                        if (i0Var3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                            v1.l lVar = v1.l.f17564b;
                                            float f13 = 8;
                                            float f14 = 4;
                                            v1.o oVarU = b0.d.u(b0.t1.c(1.0f, lVar), f13, f14);
                                            b0.q1 q1VarA = b0.o1.a(b0.j.f1359a, v1.b.D, i0Var3, 48);
                                            int iHashCode = Long.hashCode(i0Var3.T);
                                            f1.n1 n1VarL = i0Var3.l();
                                            v1.o oVarC2 = v1.a.c(i0Var3, oVarU);
                                            v2.h.f17668w.getClass();
                                            v2.f fVar = v2.g.f17645b;
                                            i0Var3.e0();
                                            if (i0Var3.S) {
                                                i0Var3.k(fVar);
                                            } else {
                                                i0Var3.o0();
                                            }
                                            f1.s.M(v2.g.f17649f, i0Var3, q1VarA);
                                            f1.s.M(v2.g.f17648e, i0Var3, n1VarL);
                                            f1.s.w(i0Var3, Integer.valueOf(iHashCode), v2.g.f17650g);
                                            f1.s.I(v2.g.f17651h, i0Var3);
                                            f1.s.M(v2.g.f17647d, i0Var3, oVarC2);
                                            i2.f fVarH = u2.b.h();
                                            long j4 = l0.f10435e;
                                            v1.o oVarK = b0.t1.k(40, lVar);
                                            j0.d dVar2 = j0.e.f8605a;
                                            j0.c cVar2 = new j0.c(50);
                                            v1.o oVarC3 = z1.h.c(oVarK, new j0.d(cVar2, cVar2, cVar2, cVar2));
                                            Object objQ2 = i0Var3.Q();
                                            if (objQ2 == f1.m.f6385a) {
                                                objQ2 = t.m1.p(i0Var3);
                                            }
                                            c1.a2.b(fVarH, "Back", b0.d.t(f13, v.n.k(oVarC3, (z.k) objQ2, null, false, null, aVar3, 28)), j4, i0Var3, 3120, 0);
                                            v7.a("Customize", b0.d.x(lVar, f14, 0.0f, 0.0f, 0.0f, 14), l0.f10433c, hj.a.x(17), k3.s.A, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var3, 1597878, 0, 262056);
                                            i0Var3.p(true);
                                            b0.d.e(i0Var3, b0.t1.e(f13, lVar));
                                            float f15 = 16;
                                            v1.o oVarC4 = b0.t1.c(1.0f, b0.d.v(lVar, f15, 0.0f, 2));
                                            j0.d dVarA = j0.e.a(f15);
                                            long j10 = l0.f10432b;
                                            long jB = c1.x0.b(j10, i0Var3);
                                            long j11 = c2.w.f3058h;
                                            long jC = c2.w.c(jB, 0.38f);
                                            c1.w0 w0Var = (c1.w0) i0Var3.j(c1.x0.f2845a);
                                            c1.e0 e0Var = w0Var.X;
                                            if (e0Var == null) {
                                                e1.l lVar2 = e1.p.f5588a;
                                                oVar2 = oVarC4;
                                                dVar = dVarA;
                                                j = j10;
                                                e0Var = new c1.e0(c1.x0.c(w0Var, lVar2), c1.x0.a(w0Var, c1.x0.c(w0Var, lVar2)), c2.e0.k(c2.w.c(c1.x0.c(w0Var, e1.p.f5590c), e1.p.f5592e), c1.x0.c(w0Var, lVar2)), c2.w.c(c1.x0.a(w0Var, c1.x0.c(w0Var, lVar2)), 0.38f));
                                                w0Var.X = e0Var;
                                            } else {
                                                oVar2 = oVarC4;
                                                dVar = dVarA;
                                                j = j10;
                                            }
                                            long j12 = j != 16 ? j : e0Var.f2040a;
                                            if (jB == 16) {
                                                jB = e0Var.f2041b;
                                            }
                                            long j13 = jB;
                                            if (j11 == 16) {
                                                j11 = e0Var.f2042c;
                                            }
                                            long j14 = j11;
                                            if (jC == 16) {
                                                jC = e0Var.f2043d;
                                            }
                                            c1.e0 e0Var2 = new c1.e0(j12, j13, j14, jC);
                                            final g gVar4 = gVar3;
                                            final boolean z12 = z11;
                                            final float f16 = f12;
                                            final f1.a1 a1Var12 = a1Var9;
                                            final f1.f1 f1Var22 = f1Var15;
                                            final f1.f1 f1Var23 = f1Var16;
                                            final f1.f1 f1Var24 = f1Var17;
                                            final f1.f1 f1Var25 = f1Var18;
                                            final f1.f1 f1Var26 = f1Var19;
                                            final f1.a1 a1Var13 = a1Var10;
                                            final f1.f1 f1Var27 = f1Var20;
                                            final f1.a1 a1Var14 = a1Var11;
                                            final f1.f1 f1Var28 = f1Var21;
                                            z4.c(oVar2, dVar, e0Var2, null, p1.j.d(-1142728559, new ej.f() { // from class: lb.a0
                                                @Override // ej.f
                                                public final Object c(Object obj8, Object obj9, Object obj10) {
                                                    f1.i0 i0Var4 = (f1.i0) obj9;
                                                    int iIntValue4 = ((Integer) obj10).intValue();
                                                    fj.l.f((b0.c0) obj8, "$this$Card");
                                                    if (i0Var4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                        g gVar5 = gVar4;
                                                        q3.b(gVar5, z12, gVar5.f10289a.getBoolean("origin_os_highlights", false), f16, new jb.d(l0.g(a1Var12), f1Var22.g(), f1Var23.g(), f1Var24.g(), f1Var25.g(), f1Var26.g(), false, f1Var27.g(), ((Boolean) a1Var14.getValue()).booleanValue(), ((Boolean) a1Var13.getValue()).booleanValue(), 0.0f, 0.0f, 0.0f, false, f1Var28.g(), 15360), null, i0Var4, 0);
                                                    } else {
                                                        i0Var4.W();
                                                    }
                                                    return pi.o.f13011a;
                                                }
                                            }, i0Var3), i0Var3, 196614);
                                            b0.d.e(i0Var3, b0.t1.e(f15, lVar));
                                        } else {
                                            i0Var3.W();
                                        }
                                        return pi.o.f13011a;
                                    }
                                }, true, 721502495));
                                final f1.a1 a1Var12 = a1Var8;
                                final f1.q2 q2Var3 = q2Var2;
                                d0.h.p(hVar, new p1.e(new ej.f() { // from class: lb.w
                                    @Override // ej.f
                                    public final Object c(Object obj5, Object obj6, Object obj7) {
                                        f1.f1 f1Var22;
                                        g gVar4;
                                        f1.i0 i0Var3 = (f1.i0) obj6;
                                        int iIntValue3 = ((Integer) obj7).intValue();
                                        fj.l.f((d0.c) obj5, "$this$item");
                                        if (i0Var3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                            g gVar5 = gVar3;
                                            boolean zH2 = i0Var3.h(gVar5);
                                            Object objQ2 = i0Var3.Q();
                                            final f1.a1 a1Var13 = a1Var9;
                                            final f1.f1 f1Var23 = f1Var16;
                                            final f1.f1 f1Var24 = f1Var17;
                                            final f1.f1 f1Var25 = f1Var18;
                                            final f1.f1 f1Var26 = f1Var19;
                                            final f1.f1 f1Var27 = f1Var21;
                                            final f1.f1 f1Var28 = f1Var20;
                                            f1.f1 f1Var29 = f1Var15;
                                            final f1.a1 a1Var14 = a1Var10;
                                            final f1.a1 a1Var15 = a1Var11;
                                            if (zH2 || objQ2 == f1.m.f6385a) {
                                                f1Var22 = f1Var29;
                                                gVar4 = gVar5;
                                                y yVar = new y(a1Var13, a1Var14, a1Var15, f1Var23, f1Var24, f1Var25, f1Var26, f1Var27, f1Var28, f1Var22, gVar4);
                                                i0Var3.l0(yVar);
                                                objQ2 = yVar;
                                            } else {
                                                gVar4 = gVar5;
                                                f1Var22 = f1Var29;
                                            }
                                            l0.c("LIQUID GLASS", (ej.a) objQ2, i0Var3, 6, 0);
                                            final g gVar6 = gVar4;
                                            final f1.f1 f1Var30 = f1Var22;
                                            final f1.a1 a1Var16 = a1Var12;
                                            final f1.q2 q2Var4 = q2Var3;
                                            l0.a(p1.j.d(-253108562, new ej.e() { // from class: lb.z
                                                /* JADX WARN: Removed duplicated region for block: B:114:0x0479  */
                                                /* JADX WARN: Removed duplicated region for block: B:55:0x0252  */
                                                @Override // ej.e
                                                /*
                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                    To view partially-correct add '--show-bad-code' argument
                                                */
                                                public final java.lang.Object invoke(java.lang.Object r44, java.lang.Object r45) {
                                                    /*
                                                        Method dump skipped, instructions count: 1276
                                                        To view this dump add '--comments-level debug' option
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: lb.z.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                                                }
                                            }, i0Var3), i0Var3, 6);
                                            b0.d.e(i0Var3, b0.t1.e(24, v1.l.f17564b));
                                        } else {
                                            i0Var3.W();
                                        }
                                        return pi.o.f13011a;
                                    }
                                }, true, 1651521814));
                                d0.h.p(hVar, new p1.e(new ab.j(a1Var11, a1Var9, a1Var10, f1Var15, f1Var16, f1Var17, f1Var18, f1Var19, f1Var21, f1Var20, gVar3), true, 1919066711));
                                return pi.o.f13011a;
                            }
                        };
                        i0Var2.l0(cVar);
                        objQ = cVar;
                    }
                    x8.a.g(384, 506, null, k1VarD, null, (ej.c) objQ, i0Var2, null, null, oVarC, null, false);
                } else {
                    i0Var2.W();
                }
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ h0(f1.a1 a1Var, f1.a1 a1Var2, ej.a aVar, g gVar, boolean z2, float f10, f1.a1 a1Var3, f1.a1 a1Var4, f1.f1 f1Var, f1.f1 f1Var2, f1.f1 f1Var3, f1.f1 f1Var4, f1.f1 f1Var5, f1.f1 f1Var6, f1.f1 f1Var7, f1.a1 a1Var5) {
        this.f10318z = a1Var;
        this.F = a1Var2;
        this.f10313b = aVar;
        this.f10314c = gVar;
        this.f10315d = z2;
        this.f10316e = f10;
        this.f10317f = a1Var3;
        this.H = a1Var4;
        this.A = f1Var;
        this.B = f1Var2;
        this.C = f1Var3;
        this.D = f1Var4;
        this.E = f1Var5;
        this.G = f1Var6;
        this.I = f1Var7;
        this.J = a1Var5;
    }
}
