package ra;

import c1.k2;
import c1.v7;
import c1.z4;
import f1.q2;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class a2 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f13926a = qi.k.c0(new p1[]{new p1('\uec49', "New Built-in Wallpapers", "Explore a fresh collection of stunning wallpapers designed to make your home screen stand out. Each wallpaper is crafted with attention to detail and optimized for your device."), new p1('\uec08', "Wallpaper Customization", "Now you can fully customize your wallpapers with advanced controls. Adjust blur, 3D depth, color filters, and more to create the perfect backdrop for your launcher."), new p1('\uea9b', "Redesigned Home Layout", "The home screen has been completely reimagined with a modern, fluid layout. Enjoy smoother transitions, better spacing, and an overall more polished experience. Organize your apps with beautiful, customizable folders."), new p1('\uec70', "Dock Customization", "Take full control of your dock appearance. Customize corner radius, blur intensity, liquid glass effects, and positioning to match your style perfectly."), new p1('\uec04', "Redesigned Settings", "Settings have been rebuilt from the ground up with a cleaner interface, better organization, and easier access to all customization options."), new p1('\uec70', "Redesigned App Drawer", "The app drawer has been completely redesigned with a modern interface, smooth animations, and better organization. Search, browse, and launch your apps faster than ever.")});

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final ra.p1 r46, final long r47, long r49, final long r51, final long r53, long r55, f1.i0 r57, final int r58) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.a2.a(ra.p1, long, long, long, long, long, f1.i0, int):void");
    }

    public static final void b(final v1.o oVar, final gi.d dVar, final float f10, final float f11, final float f12, final float f13, final ej.a aVar, f1.i0 i0Var, final int i10) {
        f1.i0 i0Var2 = i0Var;
        i0Var2.c0(-1248274646);
        int i11 = i10 | (i0Var2.f(oVar) ? 4 : 2) | (i0Var2.h(dVar) ? 32 : 16) | (i0Var2.c(f10) ? 256 : 128) | (i0Var2.c(f11) ? 2048 : 1024) | (i0Var2.c(f12) ? 16384 : 8192) | (i0Var2.c(f13) ? 131072 : 65536);
        if (i0Var2.T(i11 & 1, (599187 & i11) != 599186)) {
            Object objQ = i0Var2.Q();
            Object obj = f1.m.f6385a;
            if (objQ == obj) {
                objQ = f1.s.o(i0Var2);
                i0Var2.l0(objQ);
            }
            qj.z zVar = (qj.z) objQ;
            boolean zF = i0Var2.f(zVar);
            Object objQ2 = i0Var2.Q();
            if (zF || objQ2 == obj) {
                objQ2 = new hb.n(zVar);
                i0Var2.l0(objQ2);
            }
            hb.n nVar = (hb.n) objQ2;
            Object objQ3 = i0Var2.Q();
            if (objQ3 == obj) {
                objQ3 = t.m1.p(i0Var2);
            }
            z.k kVar = (z.k) objQ3;
            q2 q2VarB = t.e.b(((Boolean) u1.p.e(kVar, i0Var2, 6).getValue()).booleanValue() ? 0.95f : 1.0f, t.d.s(1.0f, 400.0f, null, 4), "buttonScale", null, i0Var2, 3120, 20);
            long jD = c2.e0.d(4278879487L);
            v1.o oVarE = b0.t1.e(56, b0.t1.c(1.0f, oVar));
            Object objQ4 = i0Var2.Q();
            if (objQ4 == obj) {
                objQ4 = new jb.e(28);
                i0Var2.l0(objQ4);
            }
            ej.a aVar2 = (ej.a) objQ4;
            boolean z2 = ((i11 & 7168) == 2048) | ((i11 & 896) == 256) | ((i11 & 57344) == 16384) | ((i11 & 458752) == 131072);
            Object objQ5 = i0Var2.Q();
            if (z2 || objQ5 == obj) {
                objQ5 = new ej.c() { // from class: ra.y1
                    @Override // ej.c
                    public final Object invoke(Object obj2) {
                        fi.e eVar = (fi.e) obj2;
                        fj.l.f(eVar, "$this$drawBackdrop");
                        float fD = b2.e.d(eVar.f6756c);
                        hi.a.a(eVar);
                        yd.f.l(eVar, eVar.f6754a * f10);
                        a.a.J(eVar, f11 * fD * 0.5f, f12 * fD, true, f13 > 0.0f);
                        return pi.o.f13011a;
                    }
                };
                i0Var2.l0(objQ5);
            }
            ej.c cVar = (ej.c) objQ5;
            boolean zH = i0Var2.h(nVar) | i0Var2.f(q2VarB);
            Object objQ6 = i0Var2.Q();
            if (zH || objQ6 == obj) {
                objQ6 = new k0.t1(13, nVar, q2VarB);
                i0Var2.l0(objQ6);
            }
            ej.c cVar2 = (ej.c) objQ6;
            Object objQ7 = i0Var2.Q();
            if (objQ7 == obj) {
                objQ7 = new f1.b(jD, 6);
                i0Var2.l0(objQ7);
            }
            v1.o oVarC = v.n.k(fi.c.b(oVarE, dVar, aVar2, cVar, null, null, null, cVar2, null, (ej.c) objQ7, 3000), kVar, null, false, null, aVar, 28).c(nVar.f7837i).c(nVar.j);
            t2.q0 q0VarD = b0.r.d(v1.b.f17551e, false);
            int iHashCode = Long.hashCode(i0Var2.T);
            f1.n1 n1VarL = i0Var2.l();
            v1.o oVarC2 = v1.a.c(i0Var2, oVarC);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var2, q0VarD);
            f1.s.M(v2.g.f17648e, i0Var2, n1VarL);
            f1.s.w(i0Var2, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var2);
            f1.s.M(v2.g.f17647d, i0Var2, oVarC2);
            v7.a("Continue", null, c2.w.f3054d, hj.a.x(17), k3.s.A, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var2, 1597830, 0, 262058);
            i0Var2 = i0Var2;
            i0Var2.p(true);
        } else {
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e(dVar, f10, f11, f12, f13, aVar, i10) { // from class: ra.r1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ gi.d f14170b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ float f14171c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ float f14172d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ float f14173e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ float f14174f;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ ej.a f14175z;

                @Override // ej.e
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iO = f1.s.O(1572865);
                    a2.b(this.f14169a, this.f14170b, this.f14171c, this.f14172d, this.f14173e, this.f14174f, this.f14175z, (f1.i0) obj2, iO);
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void c(lb.g gVar, ej.a aVar, f1.i0 i0Var, int i10) {
        float f10;
        boolean z2;
        f1.a1 a1Var;
        f1.i0 i0Var2 = i0Var;
        fj.l.f(aVar, "onDismiss");
        i0Var2.c0(206360648);
        int i11 = i10 | (i0Var2.h(gVar) ? 4 : 2) | (i0Var2.h(aVar) ? 32 : 16);
        if (i0Var2.T(i11 & 1, (i11 & 19) != 18)) {
            long jD = c2.e0.d(4278519045L);
            final long jD2 = c2.e0.d(4280032286L);
            final long jC = c2.e0.c(536870911);
            final long jD3 = c2.e0.d(4294967295L);
            final long jD4 = c2.e0.d(3019898879L);
            final long jD5 = c2.e0.d(2164260863L);
            long jD6 = c2.e0.d(4278879487L);
            final long jD7 = c2.e0.d(4281084974L);
            Object objQ = i0Var2.Q();
            Object obj = f1.m.f6385a;
            if (objQ == obj) {
                objQ = t.d.a(0.0f, 0.01f);
                i0Var2.l0(objQ);
            }
            t.c cVar = (t.c) objQ;
            Object objQ2 = i0Var2.Q();
            if (objQ2 == obj) {
                objQ2 = t.d.a(0.0f, 0.01f);
                i0Var2.l0(objQ2);
            }
            final t.c cVar2 = (t.c) objQ2;
            Object objQ3 = i0Var2.Q();
            if (objQ3 == obj) {
                objQ3 = f1.s.A(Boolean.FALSE);
                i0Var2.l0(objQ3);
            }
            f1.a1 a1Var2 = (f1.a1) objQ3;
            Object objQ4 = i0Var2.Q();
            if (objQ4 == obj) {
                objQ4 = new f1.b(jD, 5);
                i0Var2.l0(objQ4);
            }
            gi.d dVarD = gi.f.d((ej.c) objQ4, i0Var2, 48, 1);
            float fB = gVar.b();
            float fJ = gVar.j();
            float fI = gVar.i();
            float fC = gVar.c();
            boolean zH = i0Var2.h(cVar) | i0Var2.h(cVar2);
            Object objQ5 = i0Var2.Q();
            if (zH || objQ5 == obj) {
                f10 = fB;
                objQ5 = new androidx.lifecycle.h0(cVar, cVar2, null, 27);
                i0Var2.l0(objQ5);
            } else {
                f10 = fB;
            }
            f1.s.f((ej.e) objQ5, i0Var2, pi.o.f13011a);
            b0.i0 i0Var3 = b0.t1.f1433c;
            v1.o oVarA = z1.h.a(((Number) cVar.e()).floatValue(), v.n.f(i0Var3, jD, c2.e0.f2986b));
            v1.g gVar2 = v1.b.f17547a;
            t2.q0 q0VarD = b0.r.d(gVar2, false);
            int iHashCode = Long.hashCode(i0Var2.T);
            f1.n1 n1VarL = i0Var2.l();
            v1.o oVarC = v1.a.c(i0Var2, oVarA);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            v2.e eVar = v2.g.f17649f;
            f1.s.M(eVar, i0Var2, q0VarD);
            v2.e eVar2 = v2.g.f17648e;
            f1.s.M(eVar2, i0Var2, n1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            v2.e eVar3 = v2.g.f17650g;
            f1.s.w(i0Var2, numValueOf, eVar3);
            v2.d dVar = v2.g.f17651h;
            f1.s.I(dVar, i0Var2);
            v2.e eVar4 = v2.g.f17647d;
            f1.s.M(eVar4, i0Var2, oVarC);
            v1.o oVarA2 = gi.f.a(i0Var3, dVarD);
            t2.q0 q0VarD2 = b0.r.d(gVar2, false);
            int iHashCode2 = Long.hashCode(i0Var2.T);
            f1.n1 n1VarL2 = i0Var2.l();
            v1.o oVarC2 = v1.a.c(i0Var2, oVarA2);
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            f1.s.M(eVar, i0Var2, q0VarD2);
            f1.s.M(eVar2, i0Var2, n1VarL2);
            gk.b.t(iHashCode2, i0Var2, eVar3, i0Var2, dVar);
            f1.s.M(eVar4, i0Var2, oVarC2);
            u6.v.f(i0Var3, null, p1.j.d(-1881839896, new ej.f() { // from class: ra.x1
                @Override // ej.f
                public final Object c(Object obj2, Object obj3, Object obj4) {
                    v1.o oVar = (v1.o) obj2;
                    f1.i0 i0Var4 = (f1.i0) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    fj.l.f(oVar, "overscrollModifier");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= i0Var4.f(oVar) ? 4 : 2;
                    }
                    if (i0Var4.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                        v1.o oVarA3 = z1.h.a(((Number) cVar2.e()).floatValue(), b0.t1.f1433c.c(oVar));
                        float f11 = 20;
                        b0.k1 k1Var = new b0.k1(f11, 80, f11, 100);
                        b0.h hVarG = b0.j.g(24);
                        Object objQ6 = i0Var4.Q();
                        if (objQ6 == f1.m.f6385a) {
                            final long j = jD3;
                            final long j4 = jD4;
                            final long j10 = jD5;
                            final long j11 = jD2;
                            final long j12 = jC;
                            final long j13 = jD7;
                            ej.c cVar3 = new ej.c() { // from class: ra.s1
                                @Override // ej.c
                                public final Object invoke(Object obj5) {
                                    d0.h hVar = (d0.h) obj5;
                                    fj.l.f(hVar, "$this$LazyColumn");
                                    final long j14 = j;
                                    final long j15 = j4;
                                    final long j16 = j10;
                                    d0.h.p(hVar, new p1.e(new ej.f() { // from class: ra.t1
                                        @Override // ej.f
                                        public final Object c(Object obj6, Object obj7, Object obj8) {
                                            f1.i0 i0Var5 = (f1.i0) obj7;
                                            int iIntValue2 = ((Integer) obj8).intValue();
                                            fj.l.f((d0.c) obj6, "$this$item");
                                            if (i0Var5.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                v1.l lVar = v1.l.f17564b;
                                                v1.o oVarC3 = b0.t1.c(1.0f, lVar);
                                                b0.b0 b0VarA = b0.z.a(b0.j.f1361c, v1.b.F, i0Var5, 48);
                                                int iHashCode3 = Long.hashCode(i0Var5.T);
                                                f1.n1 n1VarL3 = i0Var5.l();
                                                v1.o oVarC4 = v1.a.c(i0Var5, oVarC3);
                                                v2.h.f17668w.getClass();
                                                v2.f fVar2 = v2.g.f17645b;
                                                i0Var5.e0();
                                                if (i0Var5.S) {
                                                    i0Var5.k(fVar2);
                                                } else {
                                                    i0Var5.o0();
                                                }
                                                f1.s.M(v2.g.f17649f, i0Var5, b0VarA);
                                                f1.s.M(v2.g.f17648e, i0Var5, n1VarL3);
                                                f1.s.w(i0Var5, Integer.valueOf(iHashCode3), v2.g.f17650g);
                                                f1.s.I(v2.g.f17651h, i0Var5);
                                                f1.s.M(v2.g.f17647d, i0Var5, oVarC4);
                                                v7.a("What's New", null, j14, hj.a.x(34), k3.s.B, null, 0L, new r3.k(3), 0L, 0, false, 0, 0, null, i0Var5, 1597830, 0, 261034);
                                                b0.d.e(i0Var5, b0.t1.e(8, lVar));
                                                v7.a("Discover the latest features and improvements", null, j15, hj.a.x(15), null, null, 0L, new r3.k(3), 0L, 0, false, 0, 0, null, i0Var5, 24966, 0, 261098);
                                                b0.d.e(i0Var5, b0.t1.e(6, lVar));
                                                v7.a("6.1", null, j16, hj.a.x(14), null, null, 0L, new r3.k(3), 0L, 0, false, 0, 0, null, i0Var5, 24966, 0, 261098);
                                                i0Var5.p(true);
                                            } else {
                                                i0Var5.W();
                                            }
                                            return pi.o.f13011a;
                                        }
                                    }, true, 988135859));
                                    final long j17 = j11;
                                    final long j18 = j12;
                                    d0.h.p(hVar, new p1.e(new ej.f() { // from class: ra.u1
                                        @Override // ej.f
                                        public final Object c(Object obj6, Object obj7, Object obj8) {
                                            f1.i0 i0Var5 = (f1.i0) obj7;
                                            int iIntValue2 = ((Integer) obj8).intValue();
                                            fj.l.f((d0.c) obj6, "$this$item");
                                            if (i0Var5.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                a2.d(j17, j18, j14, j15, i0Var5, 3510);
                                            } else {
                                                i0Var5.W();
                                            }
                                            return pi.o.f13011a;
                                        }
                                    }, true, 968802652));
                                    List list = a2.f13926a;
                                    hVar.f4359b.a(list.size(), new d0.f(null, new i1(1, list), new p1.e(new z1(list, j17, j18, j14, j15, j13), true, 802480018)));
                                    return pi.o.f13011a;
                                }
                            };
                            i0Var4.l0(cVar3);
                            objQ6 = cVar3;
                        }
                        x8.a.g(805330944, 490, hVarG, k1Var, null, (ej.c) objQ6, i0Var4, null, null, oVarA3, null, false);
                    } else {
                        i0Var4.W();
                    }
                    return pi.o.f13011a;
                }
            }, i0Var2), i0Var2, 390, 2);
            i0Var2.p(true);
            v1.g gVar3 = v1.b.f17548b;
            b0.w wVar = b0.w.f1450a;
            v1.l lVar = v1.l.f17564b;
            b0.r.a(v.n.e(b0.t1.e(180, b0.t1.c(1.0f, wVar.b(lVar, gVar3))), y9.a.l(qi.k.c0(new c2.w[]{new c2.w(c2.e0.d(4278519045L)), new c2.w(c2.w.f3057g)}), 0.0f, 14)), i0Var2, 0);
            float f11 = 15;
            v1.o oVarP = b0.t1.p(b0.d.x(b0.d.C(wVar.b(lVar, v1.b.A), b0.d.f1297g), f11, 0.0f, f11, f11, 2), Float.NaN, 500);
            Object objQ6 = i0Var2.Q();
            if (objQ6 == obj) {
                objQ6 = new r0.d(a1Var2, 18);
                i0Var2.l0(objQ6);
            }
            b(oVarP, dVarD, f10, fJ, fI, fC, (ej.a) objQ6, i0Var2, 1572864);
            i0Var2 = i0Var2;
            if (((Boolean) a1Var2.getValue()).booleanValue()) {
                i0Var2.b0(147407614);
                Object objQ7 = i0Var2.Q();
                if (objQ7 == obj) {
                    a1Var = a1Var2;
                    objQ7 = new r0.d(a1Var, 19);
                    i0Var2.l0(objQ7);
                } else {
                    a1Var = a1Var2;
                }
                z2 = true;
                z4.a((ej.a) objQ7, p1.j.d(568539169, new k2(aVar, a1Var, jD6), i0Var2), null, null, p1.j.d(-1178792035, new b1(jD3, 1), i0Var2), p1.j.d(531858812, new b1(jD4, 2), i0Var2), null, jD2, 0L, jD3, jD4, 0.0f, null, i0Var, 102432822, 54, 12956);
                i0Var2 = i0Var;
                i0Var2.p(false);
            } else {
                z2 = true;
                i0Var2.b0(148997108);
                i0Var2.p(false);
            }
            i0Var2.p(z2);
        } else {
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new lb.i0(gVar, aVar, i10, 1);
        }
    }

    public static final void d(final long j, final long j4, final long j10, final long j11, f1.i0 i0Var, final int i10) {
        f1.i0 i0Var2 = i0Var;
        i0Var2.c0(601763693);
        if (i0Var2.T(i10 & 1, (i10 & 1171) != 1170)) {
            ga.c cVar = new ga.c(20, 1);
            v1.o oVarT = b0.d.t(18, v.n.h(v.n.f(z1.h.c(b0.t1.c(1.0f, v1.l.f17564b), cVar), j, c2.e0.f2986b), 1, j4, cVar));
            b0.b0 b0VarA = b0.z.a(b0.j.g(10), v1.b.E, i0Var2, 6);
            int iHashCode = Long.hashCode(i0Var2.T);
            f1.n1 n1VarL = i0Var2.l();
            v1.o oVarC = v1.a.c(i0Var2, oVarT);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var2, b0VarA);
            f1.s.M(v2.g.f17648e, i0Var2, n1VarL);
            f1.s.w(i0Var2, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var2);
            f1.s.M(v2.g.f17647d, i0Var2, oVarC);
            v7.a("Optimized performance", null, j10, hj.a.x(22), k3.s.B, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 1597830, 0, 262058);
            v7.a("This update focuses on making the launcher feel faster, smoother, and a lot more reliable. We cleaned up a ton of bugs, improved general stability, and polished plenty of rough edges across the app.", null, j11, hj.a.x(15), null, null, 0L, null, hj.a.x(22), 0, false, 0, 0, null, i0Var, 24966, 48, 260074);
            i0Var2 = i0Var;
            i0Var2.p(true);
        } else {
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e(j, j4, j10, j11, i10) { // from class: ra.w1

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ long f14257a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f14258b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f14259c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f14260d;

                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iO = f1.s.O(3511);
                    a2.d(this.f14257a, this.f14258b, this.f14259c, this.f14260d, (f1.i0) obj, iO);
                    return pi.o.f13011a;
                }
            };
        }
    }
}
