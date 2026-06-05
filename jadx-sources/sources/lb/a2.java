package lb;

import android.content.Context;
import android.content.SharedPreferences;
import c1.v7;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class a2 implements ej.f {
    public final /* synthetic */ f1.a1 A;
    public final /* synthetic */ f1.f1 A0;
    public final /* synthetic */ String B;
    public final /* synthetic */ f1.f1 B0;
    public final /* synthetic */ ja.k C;
    public final /* synthetic */ f1.a1 C0;
    public final /* synthetic */ f1.a1 D;
    public final /* synthetic */ f1.a1 D0;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ f1.a1 E0;
    public final /* synthetic */ f1.a1 F;
    public final /* synthetic */ f1.a1 F0;
    public final /* synthetic */ String G;
    public final /* synthetic */ f1.a1 G0;
    public final /* synthetic */ f1.a1 H;
    public final /* synthetic */ f1.a1 H0;
    public final /* synthetic */ String I;
    public final /* synthetic */ f1.a1 I0;
    public final /* synthetic */ f1.a1 J;
    public final /* synthetic */ f1.a1 J0;
    public final /* synthetic */ f1.a1 K;
    public final /* synthetic */ f1.a1 K0;
    public final /* synthetic */ f1.q2 L;
    public final /* synthetic */ f1.a1 M;
    public final /* synthetic */ f1.g1 N;
    public final /* synthetic */ f1.g1 O;
    public final /* synthetic */ f1.a1 P;
    public final /* synthetic */ f1.f1 Q;
    public final /* synthetic */ f1.f1 R;
    public final /* synthetic */ f1.f1 S;
    public final /* synthetic */ f1.a1 T;
    public final /* synthetic */ f1.f1 U;
    public final /* synthetic */ f1.a1 V;
    public final /* synthetic */ f1.a1 W;
    public final /* synthetic */ f1.a1 X;
    public final /* synthetic */ f1.a1 Y;
    public final /* synthetic */ f1.f1 Z;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10105a;

    /* renamed from: a0, reason: collision with root package name */
    public final /* synthetic */ f1.f1 f10106a0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.a f10107b;

    /* renamed from: b0, reason: collision with root package name */
    public final /* synthetic */ f1.f1 f10108b0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f10109c;

    /* renamed from: c0, reason: collision with root package name */
    public final /* synthetic */ f1.f1 f10110c0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f10111d;

    /* renamed from: d0, reason: collision with root package name */
    public final /* synthetic */ f1.f1 f10112d0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f10113e;

    /* renamed from: e0, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10114e0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f10115f;

    /* renamed from: f0, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10116f0;

    /* renamed from: g0, reason: collision with root package name */
    public final /* synthetic */ f1.f1 f10117g0;

    /* renamed from: h0, reason: collision with root package name */
    public final /* synthetic */ f1.f1 f10118h0;

    /* renamed from: i0, reason: collision with root package name */
    public final /* synthetic */ f1.f1 f10119i0;

    /* renamed from: j0, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10120j0;

    /* renamed from: k0, reason: collision with root package name */
    public final /* synthetic */ f1.f1 f10121k0;

    /* renamed from: l0, reason: collision with root package name */
    public final /* synthetic */ f1.g1 f10122l0;

    /* renamed from: m0, reason: collision with root package name */
    public final /* synthetic */ f1.f1 f10123m0;

    /* renamed from: n0, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10124n0;

    /* renamed from: o0, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10125o0;

    /* renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10126p0;

    /* renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10127q0;

    /* renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10128r0;

    /* renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ f1.f1 f10129s0;

    /* renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ f1.f1 f10130t0;

    /* renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10131u0;

    /* renamed from: v0, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10132v0;
    public final /* synthetic */ f1.f1 w0;
    public final /* synthetic */ f1.f1 x0;
    public final /* synthetic */ f1.f1 y0;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ r3 f10133z;
    public final /* synthetic */ f1.f1 z0;

    public /* synthetic */ a2(ej.a aVar, String str, boolean z2, g gVar, Context context, r3 r3Var, f1.a1 a1Var, String str2, ja.k kVar, f1.a1 a1Var2, boolean z10, f1.a1 a1Var3, String str3, f1.a1 a1Var4, String str4, f1.a1 a1Var5, f1.a1 a1Var6, f1.q2 q2Var, f1.a1 a1Var7, f1.g1 g1Var, f1.g1 g1Var2, f1.a1 a1Var8, f1.f1 f1Var, f1.f1 f1Var2, f1.f1 f1Var3, f1.a1 a1Var9, f1.f1 f1Var4, f1.a1 a1Var10, f1.a1 a1Var11, f1.a1 a1Var12, f1.a1 a1Var13, f1.f1 f1Var5, f1.f1 f1Var6, f1.f1 f1Var7, f1.f1 f1Var8, f1.f1 f1Var9, f1.a1 a1Var14, f1.a1 a1Var15, f1.f1 f1Var10, f1.f1 f1Var11, f1.f1 f1Var12, f1.a1 a1Var16, f1.f1 f1Var13, f1.g1 g1Var3, f1.f1 f1Var14, f1.a1 a1Var17, f1.a1 a1Var18, f1.a1 a1Var19, f1.a1 a1Var20, f1.a1 a1Var21, f1.f1 f1Var15, f1.f1 f1Var16, f1.a1 a1Var22, f1.a1 a1Var23, f1.f1 f1Var17, f1.f1 f1Var18, f1.f1 f1Var19, f1.f1 f1Var20, f1.f1 f1Var21, f1.f1 f1Var22, f1.a1 a1Var24, f1.a1 a1Var25, f1.a1 a1Var26, f1.a1 a1Var27, f1.a1 a1Var28, f1.a1 a1Var29, f1.a1 a1Var30, f1.a1 a1Var31, f1.a1 a1Var32, int i10) {
        this.f10105a = i10;
        this.f10107b = aVar;
        this.f10109c = str;
        this.f10111d = z2;
        this.f10113e = gVar;
        this.f10115f = context;
        this.f10133z = r3Var;
        this.A = a1Var;
        this.B = str2;
        this.C = kVar;
        this.D = a1Var2;
        this.E = z10;
        this.F = a1Var3;
        this.G = str3;
        this.H = a1Var4;
        this.I = str4;
        this.J = a1Var5;
        this.K = a1Var6;
        this.L = q2Var;
        this.M = a1Var7;
        this.N = g1Var;
        this.O = g1Var2;
        this.P = a1Var8;
        this.Q = f1Var;
        this.R = f1Var2;
        this.S = f1Var3;
        this.T = a1Var9;
        this.U = f1Var4;
        this.V = a1Var10;
        this.W = a1Var11;
        this.X = a1Var12;
        this.Y = a1Var13;
        this.Z = f1Var5;
        this.f10106a0 = f1Var6;
        this.f10108b0 = f1Var7;
        this.f10110c0 = f1Var8;
        this.f10112d0 = f1Var9;
        this.f10114e0 = a1Var14;
        this.f10116f0 = a1Var15;
        this.f10117g0 = f1Var10;
        this.f10118h0 = f1Var11;
        this.f10119i0 = f1Var12;
        this.f10120j0 = a1Var16;
        this.f10121k0 = f1Var13;
        this.f10122l0 = g1Var3;
        this.f10123m0 = f1Var14;
        this.f10124n0 = a1Var17;
        this.f10125o0 = a1Var18;
        this.f10126p0 = a1Var19;
        this.f10127q0 = a1Var20;
        this.f10128r0 = a1Var21;
        this.f10129s0 = f1Var15;
        this.f10130t0 = f1Var16;
        this.f10131u0 = a1Var22;
        this.f10132v0 = a1Var23;
        this.w0 = f1Var17;
        this.x0 = f1Var18;
        this.y0 = f1Var19;
        this.z0 = f1Var20;
        this.A0 = f1Var21;
        this.B0 = f1Var22;
        this.C0 = a1Var24;
        this.D0 = a1Var25;
        this.E0 = a1Var26;
        this.F0 = a1Var27;
        this.G0 = a1Var28;
        this.H0 = a1Var29;
        this.I0 = a1Var30;
        this.J0 = a1Var31;
        this.K0 = a1Var32;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        switch (this.f10105a) {
            case 0:
                b0.i1 i1Var = (b0.i1) obj;
                f1.i0 i0Var = (f1.i0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                fj.l.f(i1Var, "innerPadding");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= i0Var.f(i1Var) ? 4 : 2;
                }
                if (i0Var.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    u6.v.f(b0.d.C(b0.d.s(b0.t1.f1433c, i1Var), b0.d.f1295e), null, p1.j.d(-1593040315, new a2(this.f10107b, this.f10109c, this.f10111d, this.f10113e, this.f10115f, this.f10133z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.f10106a0, this.f10108b0, this.f10110c0, this.f10112d0, this.f10114e0, this.f10116f0, this.f10117g0, this.f10118h0, this.f10119i0, this.f10120j0, this.f10121k0, this.f10122l0, this.f10123m0, this.f10124n0, this.f10125o0, this.f10126p0, this.f10127q0, this.f10128r0, this.f10129s0, this.f10130t0, this.f10131u0, this.f10132v0, this.w0, this.x0, this.y0, this.z0, this.A0, this.B0, this.C0, this.D0, this.E0, this.F0, this.G0, this.H0, this.I0, this.J0, this.K0, 1), i0Var), i0Var, 384, 2);
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
                    b0.k1 k1VarD = b0.d.d(0.0f, 0.0f, q3.f10603g, 7);
                    final ej.a aVar = this.f10107b;
                    boolean zF = i0Var2.f(aVar);
                    final String str = this.f10109c;
                    boolean zF2 = zF | i0Var2.f(str);
                    final boolean z2 = this.f10111d;
                    boolean zG = zF2 | i0Var2.g(z2);
                    final g gVar = this.f10113e;
                    boolean zH = zG | i0Var2.h(gVar);
                    final Context context = this.f10115f;
                    boolean zH2 = zH | i0Var2.h(context);
                    final r3 r3Var = this.f10133z;
                    boolean zD = zH2 | i0Var2.d(r3Var.ordinal());
                    final f1.a1 a1Var = this.A;
                    boolean zF3 = zD | i0Var2.f(a1Var);
                    final String str2 = this.B;
                    boolean zF4 = zF3 | i0Var2.f(str2);
                    final ja.k kVar = this.C;
                    boolean zH3 = zF4 | i0Var2.h(kVar);
                    final f1.a1 a1Var2 = this.D;
                    boolean zF5 = zH3 | i0Var2.f(a1Var2);
                    final boolean z10 = this.E;
                    boolean zG2 = zF5 | i0Var2.g(z10);
                    final f1.a1 a1Var3 = this.F;
                    boolean zF6 = zG2 | i0Var2.f(a1Var3);
                    final String str3 = this.G;
                    boolean zF7 = zF6 | i0Var2.f(str3);
                    Object objQ = i0Var2.Q();
                    if (zF7 || objQ == f1.m.f6385a) {
                        final f1.a1 a1Var4 = this.H;
                        final String str4 = this.I;
                        final f1.a1 a1Var5 = this.J;
                        final f1.a1 a1Var6 = this.K;
                        final f1.q2 q2Var = this.L;
                        final f1.a1 a1Var7 = this.M;
                        final f1.g1 g1Var = this.N;
                        final f1.g1 g1Var2 = this.O;
                        final f1.a1 a1Var8 = this.P;
                        final f1.f1 f1Var = this.Q;
                        final f1.f1 f1Var2 = this.R;
                        final f1.f1 f1Var3 = this.S;
                        final f1.a1 a1Var9 = this.T;
                        final f1.f1 f1Var4 = this.U;
                        final f1.a1 a1Var10 = this.V;
                        final f1.a1 a1Var11 = this.W;
                        final f1.a1 a1Var12 = this.X;
                        final f1.a1 a1Var13 = this.Y;
                        final f1.f1 f1Var5 = this.Z;
                        final f1.f1 f1Var6 = this.f10106a0;
                        final f1.f1 f1Var7 = this.f10108b0;
                        final f1.f1 f1Var8 = this.f10110c0;
                        final f1.f1 f1Var9 = this.f10112d0;
                        final f1.a1 a1Var14 = this.f10114e0;
                        final f1.a1 a1Var15 = this.f10116f0;
                        final f1.f1 f1Var10 = this.f10117g0;
                        final f1.f1 f1Var11 = this.f10118h0;
                        final f1.f1 f1Var12 = this.f10119i0;
                        final f1.a1 a1Var16 = this.f10120j0;
                        final f1.f1 f1Var13 = this.f10121k0;
                        final f1.g1 g1Var3 = this.f10122l0;
                        final f1.f1 f1Var14 = this.f10123m0;
                        final f1.a1 a1Var17 = this.f10124n0;
                        final f1.a1 a1Var18 = this.f10125o0;
                        final f1.a1 a1Var19 = this.f10126p0;
                        final f1.a1 a1Var20 = this.f10127q0;
                        final f1.a1 a1Var21 = this.f10128r0;
                        final f1.f1 f1Var15 = this.f10129s0;
                        final f1.f1 f1Var16 = this.f10130t0;
                        final f1.a1 a1Var22 = this.f10131u0;
                        final f1.a1 a1Var23 = this.f10132v0;
                        final f1.f1 f1Var17 = this.w0;
                        final f1.f1 f1Var18 = this.x0;
                        final f1.f1 f1Var19 = this.y0;
                        final f1.f1 f1Var20 = this.z0;
                        final f1.f1 f1Var21 = this.A0;
                        final f1.f1 f1Var22 = this.B0;
                        final f1.a1 a1Var24 = this.C0;
                        final f1.a1 a1Var25 = this.D0;
                        final f1.a1 a1Var26 = this.E0;
                        final f1.a1 a1Var27 = this.F0;
                        final f1.a1 a1Var28 = this.G0;
                        final f1.a1 a1Var29 = this.H0;
                        final f1.a1 a1Var30 = this.I0;
                        final f1.a1 a1Var31 = this.J0;
                        final f1.a1 a1Var32 = this.K0;
                        ej.c cVar = new ej.c() { // from class: lb.n2
                            @Override // ej.c
                            public final Object invoke(Object obj4) {
                                final f1.a1 a1Var33;
                                final f1.f1 f1Var23;
                                f1.a1 a1Var34;
                                final f1.f1 f1Var24;
                                f1.f1 f1Var25;
                                f1.a1 a1Var35;
                                f1.f1 f1Var26;
                                r3 r3Var2;
                                f1.a1 a1Var36;
                                f1.a1 a1Var37;
                                f1.a1 a1Var38;
                                boolean z11;
                                boolean z12;
                                f1.f1 f1Var27;
                                f1.a1 a1Var39;
                                f1.a1 a1Var40;
                                f1.f1 f1Var28;
                                f1.a1 a1Var41;
                                f1.f1 f1Var29;
                                f1.f1 f1Var30;
                                f1.a1 a1Var42;
                                f1.a1 a1Var43;
                                f1.f1 f1Var31;
                                f1.g1 g1Var4;
                                f1.g1 g1Var5;
                                f1.a1 a1Var44;
                                f1.f1 f1Var32;
                                f1.a1 a1Var45;
                                f1.f1 f1Var33;
                                f1.a1 a1Var46;
                                f1.a1 a1Var47;
                                f1.g1 g1Var6;
                                f1.a1 a1Var48;
                                f1.a1 a1Var49;
                                f1.f1 f1Var34;
                                f1.f1 f1Var35;
                                f1.f1 f1Var36;
                                f1.f1 f1Var37;
                                f1.f1 f1Var38;
                                f1.a1 a1Var50;
                                f1.f1 f1Var39;
                                f1.a1 a1Var51;
                                f1.f1 f1Var40;
                                boolean z13;
                                f1.f1 f1Var41;
                                f1.a1 a1Var52;
                                f1.a1 a1Var53;
                                f1.f1 f1Var42;
                                f1.f1 f1Var43;
                                f1.f1 f1Var44;
                                f1.a1 a1Var54;
                                f1.a1 a1Var55;
                                f1.f1 f1Var45;
                                f1.f1 f1Var46;
                                f1.a1 a1Var56;
                                f1.f1 f1Var47;
                                f1.a1 a1Var57;
                                f1.a1 a1Var58;
                                f1.f1 f1Var48;
                                f1.f1 f1Var49;
                                f1.g1 g1Var7;
                                f1.g1 g1Var8;
                                f1.g1 g1Var9;
                                f1.a1 a1Var59;
                                f1.f1 f1Var50;
                                f1.a1 a1Var60;
                                f1.a1 a1Var61;
                                f1.f1 f1Var51;
                                f1.a1 a1Var62;
                                f1.f1 f1Var52;
                                f1.a1 a1Var63;
                                f1.a1 a1Var64;
                                f1.a1 a1Var65;
                                d0.h hVar = (d0.h) obj4;
                                fj.l.f(hVar, "$this$LazyColumn");
                                String str5 = str;
                                ej.a aVar2 = aVar;
                                f1.a1 a1Var66 = a1Var4;
                                String str6 = str4;
                                f1.a1 a1Var67 = a1Var5;
                                final f1.a1 a1Var68 = a1Var67;
                                d0.h.p(hVar, new p1.e(new h(str5, aVar2, a1Var66, str6, a1Var67, a1Var6, q2Var), true, -412558384));
                                boolean z14 = z2;
                                if (z14) {
                                    d0.h.p(hVar, new p1.e(new cb.e(a1Var7, 1), true, -179225835));
                                }
                                final g gVar2 = gVar;
                                if (z14) {
                                    d0.h.p(hVar, new p1.e(new s2(gVar2, 0), true, -267809858));
                                }
                                final Context context2 = context;
                                if (z14) {
                                    d0.h.p(hVar, new p1.e(new w0(context2, 2), true, -698156131));
                                }
                                if (z14) {
                                    d0.h.p(hVar, new p1.e(new w0(context2, 3), true, -1128502404));
                                }
                                if (z14) {
                                    d0.h.p(hVar, new p1.e(new w0(context2, 4), true, -1558848677));
                                }
                                r3 r3Var3 = r3.f10629d;
                                r3 r3Var4 = r3Var;
                                final f1.a1 a1Var69 = a1Var;
                                final f1.g1 g1Var10 = g1Var;
                                final f1.g1 g1Var11 = g1Var2;
                                final f1.a1 a1Var70 = a1Var8;
                                final f1.f1 f1Var53 = f1Var;
                                f1.f1 f1Var54 = f1Var2;
                                f1.f1 f1Var55 = f1Var3;
                                f1.a1 a1Var71 = a1Var9;
                                final f1.f1 f1Var56 = f1Var4;
                                final f1.a1 a1Var72 = a1Var10;
                                final f1.a1 a1Var73 = a1Var11;
                                final f1.a1 a1Var74 = a1Var12;
                                final f1.a1 a1Var75 = a1Var13;
                                final f1.f1 f1Var57 = f1Var5;
                                final f1.f1 f1Var58 = f1Var6;
                                final f1.f1 f1Var59 = f1Var7;
                                final f1.f1 f1Var60 = f1Var8;
                                final f1.f1 f1Var61 = f1Var9;
                                final f1.a1 a1Var76 = a1Var14;
                                final f1.a1 a1Var77 = a1Var15;
                                final f1.f1 f1Var62 = f1Var10;
                                final f1.f1 f1Var63 = f1Var11;
                                final f1.f1 f1Var64 = f1Var12;
                                final f1.a1 a1Var78 = a1Var16;
                                final f1.f1 f1Var65 = f1Var13;
                                if (r3Var4 == r3Var3) {
                                    f1Var23 = f1Var54;
                                    a1Var33 = a1Var71;
                                    f1Var24 = f1Var55;
                                    ej.f fVar = new ej.f() { // from class: lb.t2
                                        @Override // ej.f
                                        public final Object c(Object obj5, Object obj6, Object obj7) {
                                            Object next;
                                            f1.i0 i0Var3 = (f1.i0) obj6;
                                            int iIntValue3 = ((Integer) obj7).intValue();
                                            fj.l.f((d0.c) obj5, "$this$item");
                                            if (i0Var3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                Iterator it = ((List) a1Var69.getValue()).iterator();
                                                while (true) {
                                                    if (!it.hasNext()) {
                                                        next = null;
                                                        break;
                                                    }
                                                    next = it.next();
                                                    if (((s) next).f10634a.equals((String) a1Var68.getValue())) {
                                                        break;
                                                    }
                                                }
                                                q3.f(gVar2, (s) next, g1Var10.g(), g1Var11.g(), q3.w(a1Var70), f1Var53.g(), f1Var23.g(), f1Var24.g(), q3.A(a1Var33), f1Var56.g(), ((Boolean) a1Var72.getValue()).booleanValue(), ((Boolean) a1Var73.getValue()).booleanValue(), (b) a1Var74.getValue(), ((Boolean) a1Var75.getValue()).booleanValue(), f1Var57.g(), f1Var58.g(), f1Var59.g(), f1Var60.g(), f1Var61.g(), ((Boolean) a1Var76.getValue()).booleanValue(), ((Number) a1Var77.getValue()).floatValue(), f1Var62.g(), f1Var63.g(), f1Var64.g(), ((Boolean) a1Var78.getValue()).booleanValue(), f1Var65.g(), null, i0Var3, 8, 67108864);
                                                b0.d.e(i0Var3, b0.t1.e(14, v1.l.f17564b));
                                                q3.l("APP ICONS", i0Var3, 6);
                                            } else {
                                                i0Var3.W();
                                            }
                                            return pi.o.f13011a;
                                        }
                                    };
                                    f1Var25 = f1Var65;
                                    a1Var76 = a1Var76;
                                    f1Var61 = f1Var61;
                                    f1Var60 = f1Var60;
                                    f1Var59 = f1Var59;
                                    f1Var58 = f1Var58;
                                    f1Var57 = f1Var57;
                                    a1Var75 = a1Var75;
                                    a1Var68 = a1Var68;
                                    g1Var10 = g1Var10;
                                    g1Var11 = g1Var11;
                                    a1Var34 = a1Var69;
                                    d0.h.p(hVar, new p1.e(fVar, true, -1989194950));
                                } else {
                                    a1Var33 = a1Var71;
                                    f1Var23 = f1Var54;
                                    a1Var34 = a1Var69;
                                    f1Var24 = f1Var55;
                                    f1Var25 = f1Var65;
                                }
                                f1.g1 g1Var12 = g1Var3;
                                f1.f1 f1Var66 = f1Var14;
                                f1.a1 a1Var79 = a1Var17;
                                f1.a1 a1Var80 = a1Var18;
                                f1.f1 f1Var67 = f1Var66;
                                f1.a1 a1Var81 = a1Var19;
                                f1.a1 a1Var82 = a1Var20;
                                f1.a1 a1Var83 = a1Var21;
                                if (r3Var4 == r3Var3) {
                                    f1.a1 a1Var84 = a1Var33;
                                    f1.f1 f1Var68 = f1Var24;
                                    f1.f1 f1Var69 = f1Var23;
                                    a1Var35 = a1Var83;
                                    r3Var2 = r3Var4;
                                    v0 v0Var = new v0(gVar2, str2, context2, f1Var53, g1Var10, g1Var11, g1Var12, a1Var70, a1Var72, a1Var73, f1Var69, f1Var68, f1Var67, a1Var84, f1Var56, a1Var74, a1Var68, a1Var75, f1Var57, f1Var58, f1Var59, f1Var60, f1Var61, a1Var79, a1Var77, a1Var76, a1Var80, a1Var81, f1Var62, f1Var63, f1Var64, a1Var78, a1Var82, a1Var35, a1Var66, 1);
                                    a1Var37 = a1Var82;
                                    gVar2 = gVar2;
                                    a1Var36 = a1Var79;
                                    a1Var77 = a1Var77;
                                    a1Var38 = a1Var80;
                                    f1Var62 = f1Var62;
                                    f1Var64 = f1Var64;
                                    a1Var81 = a1Var81;
                                    a1Var78 = a1Var78;
                                    f1Var67 = f1Var67;
                                    f1Var56 = f1Var56;
                                    a1Var73 = a1Var73;
                                    f1Var23 = f1Var69;
                                    f1Var24 = f1Var68;
                                    a1Var33 = a1Var84;
                                    a1Var72 = a1Var72;
                                    f1Var53 = f1Var53;
                                    f1Var26 = f1Var25;
                                    d0.h.p(hVar, new p1.e(v0Var, true, 1875426073));
                                } else {
                                    a1Var35 = a1Var83;
                                    f1Var26 = f1Var25;
                                    r3Var2 = r3Var4;
                                    a1Var36 = a1Var79;
                                    a1Var37 = a1Var82;
                                    a1Var38 = a1Var80;
                                }
                                f1.f1 f1Var70 = f1Var16;
                                if (r3Var2 == r3Var3) {
                                    f1.a1 a1Var85 = a1Var33;
                                    f1.f1 f1Var71 = f1Var23;
                                    f1.a1 a1Var86 = a1Var73;
                                    f1.f1 f1Var72 = f1Var64;
                                    f1.a1 a1Var87 = a1Var38;
                                    f1.a1 a1Var88 = a1Var37;
                                    f1.f1 f1Var73 = f1Var56;
                                    f1.f1 f1Var74 = f1Var24;
                                    f1.f1 f1Var75 = f1Var53;
                                    f1.a1 a1Var89 = a1Var72;
                                    f1.f1 f1Var76 = f1Var67;
                                    f1.a1 a1Var90 = a1Var78;
                                    f1.a1 a1Var91 = a1Var81;
                                    f1.f1 f1Var77 = f1Var62;
                                    f1.a1 a1Var92 = a1Var77;
                                    f1.a1 a1Var93 = a1Var36;
                                    u2 u2Var = new u2(gVar2, a1Var74, g1Var10, g1Var11, g1Var12, a1Var70, a1Var89, a1Var86, f1Var75, f1Var71, f1Var74, f1Var76, a1Var85, f1Var73, a1Var68, a1Var75, f1Var57, f1Var58, f1Var59, f1Var60, f1Var61, a1Var93, a1Var92, a1Var76, a1Var87, a1Var91, f1Var77, f1Var63, f1Var72, a1Var90, a1Var88, a1Var35, f1Var15, f1Var70, 0);
                                    a1Var73 = a1Var86;
                                    f1Var23 = f1Var71;
                                    a1Var33 = a1Var85;
                                    a1Var77 = a1Var92;
                                    f1Var62 = f1Var77;
                                    a1Var37 = a1Var88;
                                    f1Var70 = f1Var70;
                                    a1Var38 = a1Var87;
                                    a1Var81 = a1Var91;
                                    f1Var64 = f1Var72;
                                    a1Var78 = a1Var90;
                                    f1Var67 = f1Var76;
                                    a1Var72 = a1Var89;
                                    f1Var53 = f1Var75;
                                    f1Var24 = f1Var74;
                                    f1Var56 = f1Var73;
                                    a1Var74 = a1Var74;
                                    z11 = true;
                                    d0.h.p(hVar, new p1.e(u2Var, true, 1445079800));
                                } else {
                                    z11 = true;
                                }
                                if (r3Var2 == r3.f10631f) {
                                    g gVar3 = gVar2;
                                    f1.a1 a1Var94 = a1Var38;
                                    f1.g1 g1Var13 = g1Var10;
                                    f1.a1 a1Var95 = a1Var72;
                                    f1.a1 a1Var96 = a1Var68;
                                    f1.a1 a1Var97 = a1Var37;
                                    f1.a1 a1Var98 = a1Var74;
                                    z12 = z11;
                                    f1.a1 a1Var99 = a1Var33;
                                    f1.a1 a1Var100 = a1Var81;
                                    f1.f1 f1Var78 = f1Var26;
                                    f1.f1 f1Var79 = f1Var64;
                                    f1.f1 f1Var80 = f1Var61;
                                    f1.f1 f1Var81 = f1Var57;
                                    f1.f1 f1Var82 = f1Var56;
                                    f1.a1 a1Var101 = a1Var78;
                                    f1.f1 f1Var83 = f1Var62;
                                    f1.f1 f1Var84 = f1Var59;
                                    f1.f1 f1Var85 = f1Var23;
                                    f1.a1 a1Var102 = a1Var76;
                                    f1.f1 f1Var86 = f1Var60;
                                    f1.f1 f1Var87 = f1Var24;
                                    f1.a1 a1Var103 = a1Var77;
                                    f1.f1 f1Var88 = f1Var58;
                                    f1.f1 f1Var89 = f1Var53;
                                    f1.a1 a1Var104 = a1Var75;
                                    f1.a1 a1Var105 = a1Var35;
                                    f1.g1 g1Var14 = g1Var11;
                                    f1.a1 a1Var106 = a1Var73;
                                    f1.a1 a1Var107 = a1Var36;
                                    v2 v2Var = new v2(0, a1Var70, a1Var95, a1Var106, a1Var98, a1Var99, a1Var104, a1Var102, a1Var103, a1Var100, a1Var101, a1Var96, a1Var107, a1Var94, a1Var97, a1Var105, f1Var82, f1Var89, f1Var85, f1Var87, f1Var81, f1Var88, f1Var84, f1Var86, f1Var80, f1Var83, f1Var63, f1Var79, f1Var78, f1Var67, g1Var13, g1Var14, g1Var12, gVar3);
                                    a1Var72 = a1Var95;
                                    g1Var10 = g1Var13;
                                    a1Var38 = a1Var94;
                                    a1Var74 = a1Var98;
                                    g1Var12 = g1Var12;
                                    a1Var37 = a1Var97;
                                    a1Var68 = a1Var96;
                                    a1Var36 = a1Var107;
                                    gVar2 = gVar3;
                                    a1Var73 = a1Var106;
                                    f1Var27 = f1Var78;
                                    g1Var11 = g1Var14;
                                    a1Var35 = a1Var105;
                                    a1Var75 = a1Var104;
                                    f1Var53 = f1Var89;
                                    f1Var58 = f1Var88;
                                    a1Var77 = a1Var103;
                                    f1Var24 = f1Var87;
                                    f1Var60 = f1Var86;
                                    a1Var76 = a1Var102;
                                    f1Var23 = f1Var85;
                                    f1Var59 = f1Var84;
                                    f1Var62 = f1Var83;
                                    a1Var78 = a1Var101;
                                    f1Var56 = f1Var82;
                                    f1Var57 = f1Var81;
                                    f1Var61 = f1Var80;
                                    f1Var64 = f1Var79;
                                    f1Var63 = f1Var63;
                                    a1Var81 = a1Var100;
                                    a1Var33 = a1Var99;
                                    a1Var70 = a1Var70;
                                    d0.h.p(hVar, new p1.e(v2Var, z12, 1014733527));
                                } else {
                                    z12 = z11;
                                    f1Var27 = f1Var26;
                                }
                                if (r3Var2 == r3.f10632z) {
                                    g gVar4 = gVar2;
                                    f1.a1 a1Var108 = a1Var37;
                                    f1.f1 f1Var90 = f1Var24;
                                    f1.f1 f1Var91 = f1Var53;
                                    f1.a1 a1Var109 = a1Var72;
                                    f1.f1 f1Var92 = f1Var67;
                                    f1.f1 f1Var93 = f1Var64;
                                    f1.a1 a1Var110 = a1Var76;
                                    f1.a1 a1Var111 = a1Var77;
                                    f1.f1 f1Var94 = f1Var61;
                                    f1.f1 f1Var95 = f1Var60;
                                    f1.f1 f1Var96 = f1Var59;
                                    f1.f1 f1Var97 = f1Var58;
                                    f1.f1 f1Var98 = f1Var57;
                                    f1.a1 a1Var112 = a1Var75;
                                    f1.a1 a1Var113 = a1Var68;
                                    f1.a1 a1Var114 = a1Var74;
                                    f1Var38 = f1Var56;
                                    f1Var39 = f1Var90;
                                    f1.a1 a1Var115 = a1Var33;
                                    f1.f1 f1Var99 = f1Var23;
                                    f1.a1 a1Var116 = a1Var73;
                                    a1Var51 = a1Var115;
                                    f1.a1 a1Var117 = a1Var38;
                                    f1.a1 a1Var118 = a1Var78;
                                    f1Var29 = f1Var63;
                                    f1.f1 f1Var100 = f1Var62;
                                    f1.a1 a1Var119 = a1Var36;
                                    o2 o2Var = new o2(a1Var108, gVar4, g1Var10, g1Var11, g1Var12, a1Var70, a1Var109, a1Var116, f1Var91, f1Var99, f1Var39, f1Var92, a1Var51, f1Var38, a1Var114, a1Var113, a1Var112, f1Var98, f1Var97, f1Var96, f1Var95, f1Var94, a1Var119, a1Var111, a1Var110, a1Var117, a1Var81, f1Var100, f1Var29, f1Var93, a1Var118, a1Var35, 0);
                                    a1Var43 = a1Var108;
                                    gVar2 = gVar4;
                                    g1Var5 = g1Var12;
                                    a1Var40 = a1Var109;
                                    f1Var30 = f1Var92;
                                    a1Var39 = a1Var119;
                                    a1Var42 = a1Var117;
                                    a1Var41 = a1Var81;
                                    f1Var28 = f1Var93;
                                    a1Var78 = a1Var118;
                                    f1Var31 = f1Var27;
                                    g1Var4 = g1Var10;
                                    a1Var44 = a1Var70;
                                    f1Var35 = f1Var96;
                                    a1Var46 = a1Var110;
                                    f1Var33 = f1Var100;
                                    a1Var47 = a1Var35;
                                    g1Var6 = g1Var11;
                                    a1Var48 = a1Var114;
                                    a1Var68 = a1Var113;
                                    f1Var32 = f1Var95;
                                    f1Var61 = f1Var94;
                                    a1Var45 = a1Var111;
                                    f1Var37 = f1Var99;
                                    a1Var49 = a1Var112;
                                    f1Var57 = f1Var98;
                                    f1Var34 = f1Var97;
                                    a1Var50 = a1Var116;
                                    f1Var36 = f1Var91;
                                    d0.h.p(hVar, new p1.e(o2Var, z12, 584387254));
                                } else {
                                    a1Var39 = a1Var36;
                                    a1Var40 = a1Var72;
                                    f1Var28 = f1Var64;
                                    a1Var41 = a1Var81;
                                    f1Var29 = f1Var63;
                                    f1Var30 = f1Var67;
                                    a1Var42 = a1Var38;
                                    a1Var43 = a1Var37;
                                    f1Var31 = f1Var27;
                                    g1Var4 = g1Var10;
                                    g1Var5 = g1Var12;
                                    a1Var44 = a1Var70;
                                    f1Var32 = f1Var60;
                                    a1Var45 = a1Var77;
                                    f1Var33 = f1Var62;
                                    a1Var46 = a1Var76;
                                    a1Var47 = a1Var35;
                                    g1Var6 = g1Var11;
                                    a1Var48 = a1Var74;
                                    a1Var49 = a1Var75;
                                    f1Var34 = f1Var58;
                                    f1Var35 = f1Var59;
                                    f1Var36 = f1Var53;
                                    f1Var37 = f1Var23;
                                    f1Var38 = f1Var56;
                                    a1Var50 = a1Var73;
                                    f1Var39 = f1Var24;
                                    a1Var51 = a1Var33;
                                }
                                if (r3Var2 == r3.C) {
                                    final f1.a1 a1Var120 = a1Var22;
                                    final f1.a1 a1Var121 = a1Var23;
                                    final f1.f1 f1Var101 = f1Var17;
                                    final f1.f1 f1Var102 = f1Var18;
                                    final f1.f1 f1Var103 = f1Var19;
                                    final f1.f1 f1Var104 = f1Var20;
                                    final f1.f1 f1Var105 = f1Var21;
                                    f1Var40 = f1Var70;
                                    final f1.f1 f1Var106 = f1Var22;
                                    final f1.a1 a1Var122 = a1Var24;
                                    d0.h.p(hVar, new p1.e(new ej.f() { // from class: lb.p2
                                        @Override // ej.f
                                        public final Object c(Object obj5, Object obj6, Object obj7) {
                                            f1.i0 i0Var3 = (f1.i0) obj6;
                                            int iIntValue3 = ((Integer) obj7).intValue();
                                            fj.l.f((d0.c) obj5, "$this$item");
                                            if (i0Var3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                q3.l("OPEN ANIMATIONS", i0Var3, 6);
                                                final g gVar5 = gVar2;
                                                f1.a1 a1Var123 = a1Var120;
                                                q3.j(0L, p1.j.d(987751718, new ba.b(4, gVar5, a1Var123), i0Var3), i0Var3, 48);
                                                v1.l lVar = v1.l.f17564b;
                                                b0.d.e(i0Var3, b0.t1.e(16, lVar));
                                                if (((Boolean) a1Var123.getValue()).booleanValue()) {
                                                    i0Var3.b0(1635938777);
                                                    q3.l("ANIMATION SETTINGS", i0Var3, 6);
                                                    final f1.a1 a1Var124 = a1Var121;
                                                    final f1.f1 f1Var107 = f1Var101;
                                                    final f1.f1 f1Var108 = f1Var102;
                                                    final f1.f1 f1Var109 = f1Var103;
                                                    final f1.f1 f1Var110 = f1Var104;
                                                    final f1.f1 f1Var111 = f1Var105;
                                                    final f1.f1 f1Var112 = f1Var106;
                                                    final f1.a1 a1Var125 = a1Var122;
                                                    q3.j(0L, p1.j.d(-861056319, new ej.f() { // from class: lb.c3
                                                        @Override // ej.f
                                                        public final Object c(Object obj8, Object obj9, Object obj10) {
                                                            f1.i0 i0Var4 = (f1.i0) obj9;
                                                            int iIntValue4 = ((Integer) obj10).intValue();
                                                            fj.l.f((b0.c0) obj8, "$this$MSCard");
                                                            if (i0Var4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                boolean zBooleanValue = ((Boolean) a1Var124.getValue()).booleanValue();
                                                                g gVar6 = gVar5;
                                                                Object obj11 = f1.m.f6385a;
                                                                if (zBooleanValue) {
                                                                    i0Var4.b0(2110970196);
                                                                    f1.f1 f1Var113 = f1Var107;
                                                                    float f10 = 100;
                                                                    String strM = gk.b.m((int) (f1Var113.g() * f10), "%");
                                                                    float fG = f1Var113.g();
                                                                    kj.d dVar = new kj.d(0.35f, 1.4f);
                                                                    boolean zH4 = i0Var4.h(gVar6);
                                                                    Object objQ2 = i0Var4.Q();
                                                                    if (zH4 || objQ2 == obj11) {
                                                                        objQ2 = new d1(gVar6, f1Var113, 0);
                                                                        i0Var4.l0(objQ2);
                                                                    }
                                                                    q3.m("Damping", strM, fG, dVar, (ej.c) objQ2, i0Var4, 6);
                                                                    q3.k(0, i0Var4);
                                                                    f1.f1 f1Var114 = f1Var108;
                                                                    String strValueOf = String.valueOf((int) f1Var114.g());
                                                                    float fG2 = f1Var114.g();
                                                                    kj.d dVar2 = new kj.d(120.0f, 900.0f);
                                                                    boolean zH5 = i0Var4.h(gVar6);
                                                                    Object objQ3 = i0Var4.Q();
                                                                    if (zH5 || objQ3 == obj11) {
                                                                        objQ3 = new d1(gVar6, f1Var114, 1);
                                                                        i0Var4.l0(objQ3);
                                                                    }
                                                                    q3.m("Stiffness", strValueOf, fG2, dVar2, (ej.c) objQ3, i0Var4, 6);
                                                                    q3.k(0, i0Var4);
                                                                    f1.f1 f1Var115 = f1Var109;
                                                                    String strM2 = gk.b.m((int) (f1Var115.g() * f10), "%");
                                                                    float fG3 = f1Var115.g();
                                                                    kj.d dVar3 = new kj.d(0.0f, 0.18f);
                                                                    boolean zH6 = i0Var4.h(gVar6);
                                                                    Object objQ4 = i0Var4.Q();
                                                                    if (zH6 || objQ4 == obj11) {
                                                                        objQ4 = new d1(gVar6, f1Var115, 2);
                                                                        i0Var4.l0(objQ4);
                                                                    }
                                                                    q3.m("Overshoot", strM2, fG3, dVar3, (ej.c) objQ4, i0Var4, 6);
                                                                    i0Var4.p(false);
                                                                } else {
                                                                    i0Var4.b0(2112796902);
                                                                    f1.f1 f1Var116 = f1Var110;
                                                                    float f11 = 100;
                                                                    String strM3 = gk.b.m((int) (f1Var116.g() * f11), "%");
                                                                    float fG4 = f1Var116.g();
                                                                    kj.d dVar4 = new kj.d(0.5f, 2.0f);
                                                                    boolean zH7 = i0Var4.h(gVar6);
                                                                    Object objQ5 = i0Var4.Q();
                                                                    if (zH7 || objQ5 == obj11) {
                                                                        objQ5 = new d1(gVar6, f1Var116, 3);
                                                                        i0Var4.l0(objQ5);
                                                                    }
                                                                    q3.m("Overall Speed", strM3, fG4, dVar4, (ej.c) objQ5, i0Var4, 6);
                                                                    q3.k(0, i0Var4);
                                                                    f1.f1 f1Var117 = f1Var111;
                                                                    String strM4 = gk.b.m((int) (f1Var117.g() * f11), "%");
                                                                    float fG5 = f1Var117.g();
                                                                    kj.d dVar5 = new kj.d(0.5f, 2.0f);
                                                                    boolean zH8 = i0Var4.h(gVar6);
                                                                    Object objQ6 = i0Var4.Q();
                                                                    if (zH8 || objQ6 == obj11) {
                                                                        objQ6 = new d1(gVar6, f1Var117, 4);
                                                                        i0Var4.l0(objQ6);
                                                                    }
                                                                    q3.m("Position Speed", strM4, fG5, dVar5, (ej.c) objQ6, i0Var4, 6);
                                                                    q3.k(0, i0Var4);
                                                                    f1.f1 f1Var118 = f1Var112;
                                                                    String strM5 = gk.b.m((int) (f1Var118.g() * f11), "%");
                                                                    float fG6 = f1Var118.g();
                                                                    kj.d dVar6 = new kj.d(0.5f, 2.0f);
                                                                    boolean zH9 = i0Var4.h(gVar6);
                                                                    Object objQ7 = i0Var4.Q();
                                                                    if (zH9 || objQ7 == obj11) {
                                                                        objQ7 = new d1(gVar6, f1Var118, 5);
                                                                        i0Var4.l0(objQ7);
                                                                    }
                                                                    q3.m("Scale Speed", strM5, fG6, dVar6, (ej.c) objQ7, i0Var4, 6);
                                                                    i0Var4.p(false);
                                                                }
                                                                q3.k(0, i0Var4);
                                                                f1.a1 a1Var126 = a1Var125;
                                                                boolean zBooleanValue2 = ((Boolean) a1Var126.getValue()).booleanValue();
                                                                boolean zH10 = i0Var4.h(gVar6);
                                                                Object objQ8 = i0Var4.Q();
                                                                if (zH10 || objQ8 == obj11) {
                                                                    objQ8 = new e1(gVar6, a1Var126, 0);
                                                                    i0Var4.l0(objQ8);
                                                                }
                                                                q3.n("Limit Concurrent Animations", "Only allow one app animation at a time", zBooleanValue2, false, (ej.c) objQ8, i0Var4, 54, 8);
                                                            } else {
                                                                i0Var4.W();
                                                            }
                                                            return pi.o.f13011a;
                                                        }
                                                    }, i0Var3), i0Var3, 48);
                                                    i0Var3.p(false);
                                                } else {
                                                    i0Var3.b0(1640050896);
                                                    i0Var3.p(false);
                                                }
                                                b0.d.e(i0Var3, b0.t1.e(24, lVar));
                                            } else {
                                                i0Var3.W();
                                            }
                                            return pi.o.f13011a;
                                        }
                                    }, true, 1120111314));
                                } else {
                                    f1Var40 = f1Var70;
                                }
                                if (r3Var2 == r3.A) {
                                    z13 = true;
                                    d0.h.p(hVar, new p1.e(new q2(kVar, a1Var25, a1Var26, a1Var27, a1Var28, 0), true, 689765041));
                                } else {
                                    z13 = true;
                                }
                                if (r3Var2 == r3.B) {
                                    d0.h.p(hVar, new p1.e(new ba.b(3, context2, gVar2), z13, 259418768));
                                }
                                if (r3Var2 == r3.f10630e) {
                                    boolean z15 = z13;
                                    f1Var41 = f1Var39;
                                    a1Var52 = a1Var44;
                                    a1Var53 = a1Var51;
                                    f1Var42 = f1Var38;
                                    f1.a1 a1Var123 = a1Var68;
                                    f1Var43 = f1Var37;
                                    f1.f1 f1Var107 = f1Var57;
                                    f1Var44 = f1Var36;
                                    a1Var54 = a1Var50;
                                    a1Var55 = a1Var48;
                                    f1.f1 f1Var108 = f1Var61;
                                    f1.f1 f1Var109 = f1Var34;
                                    f1.f1 f1Var110 = f1Var35;
                                    f1.a1 a1Var124 = a1Var49;
                                    f1.f1 f1Var111 = f1Var32;
                                    f1.a1 a1Var125 = a1Var46;
                                    a1Var58 = a1Var45;
                                    f1.f1 f1Var112 = f1Var29;
                                    f1Var49 = f1Var33;
                                    f1.g1 g1Var15 = g1Var4;
                                    f1.g1 g1Var16 = g1Var6;
                                    f1.g1 g1Var17 = g1Var5;
                                    f1.f1 f1Var113 = f1Var30;
                                    f1.a1 a1Var126 = a1Var39;
                                    f1.a1 a1Var127 = a1Var42;
                                    f1.a1 a1Var128 = a1Var41;
                                    f1Var51 = f1Var31;
                                    a1Var62 = a1Var40;
                                    f1Var52 = f1Var28;
                                    u2 u2Var2 = new u2(gVar2, a1Var34, a1Var123, g1Var15, g1Var16, a1Var52, f1Var44, f1Var43, f1Var41, a1Var53, f1Var42, a1Var62, a1Var54, a1Var55, a1Var124, f1Var107, f1Var109, f1Var110, f1Var111, f1Var108, a1Var125, a1Var58, f1Var49, f1Var112, f1Var52, a1Var78, f1Var51, g1Var17, f1Var113, a1Var126, a1Var127, a1Var128, a1Var43, a1Var47);
                                    a1Var68 = a1Var123;
                                    g1Var7 = g1Var15;
                                    g1Var8 = g1Var16;
                                    g1Var9 = g1Var17;
                                    f1Var48 = f1Var112;
                                    a1Var57 = a1Var125;
                                    f1Var61 = f1Var108;
                                    f1Var47 = f1Var111;
                                    f1Var46 = f1Var110;
                                    f1Var45 = f1Var109;
                                    f1Var57 = f1Var107;
                                    a1Var56 = a1Var124;
                                    f1Var50 = f1Var113;
                                    a1Var63 = a1Var126;
                                    a1Var60 = a1Var127;
                                    a1Var61 = a1Var128;
                                    a1Var59 = a1Var47;
                                    d0.h.p(hVar, new p1.e(u2Var2, z15, -170927505));
                                } else {
                                    f1Var41 = f1Var39;
                                    a1Var52 = a1Var44;
                                    a1Var53 = a1Var51;
                                    f1Var42 = f1Var38;
                                    f1Var43 = f1Var37;
                                    f1Var44 = f1Var36;
                                    a1Var54 = a1Var50;
                                    a1Var55 = a1Var48;
                                    f1Var45 = f1Var34;
                                    f1Var46 = f1Var35;
                                    a1Var56 = a1Var49;
                                    f1Var47 = f1Var32;
                                    a1Var57 = a1Var46;
                                    a1Var58 = a1Var45;
                                    f1Var48 = f1Var29;
                                    f1Var49 = f1Var33;
                                    g1Var7 = g1Var4;
                                    g1Var8 = g1Var6;
                                    g1Var9 = g1Var5;
                                    a1Var59 = a1Var47;
                                    f1Var50 = f1Var30;
                                    a1Var60 = a1Var42;
                                    a1Var61 = a1Var41;
                                    f1Var51 = f1Var31;
                                    a1Var62 = a1Var40;
                                    f1Var52 = f1Var28;
                                    a1Var63 = a1Var39;
                                }
                                f1.a1 a1Var129 = a1Var2;
                                if (z14) {
                                    f1.a1 a1Var130 = a1Var78;
                                    f1.f1 f1Var114 = f1Var61;
                                    f1.a1 a1Var131 = a1Var56;
                                    a1Var64 = a1Var129;
                                    f1.f1 f1Var115 = f1Var51;
                                    f1.f1 f1Var116 = f1Var48;
                                    f1.a1 a1Var132 = a1Var59;
                                    f1.a1 a1Var133 = a1Var58;
                                    f1.f1 f1Var117 = f1Var49;
                                    f1.a1 a1Var134 = a1Var57;
                                    f1.f1 f1Var118 = f1Var52;
                                    f1.f1 f1Var119 = f1Var57;
                                    f1.f1 f1Var120 = f1Var45;
                                    f1.f1 f1Var121 = f1Var46;
                                    f1.f1 f1Var122 = f1Var47;
                                    g gVar5 = gVar2;
                                    f1.a1 a1Var135 = a1Var52;
                                    f1.f1 f1Var123 = f1Var42;
                                    f1.a1 a1Var136 = a1Var54;
                                    y0 y0Var = new y0(gVar5, a1Var135, a1Var136, f1Var123, a1Var131, f1Var119, f1Var120, f1Var121, f1Var122, f1Var114, a1Var134, a1Var133, a1Var61, f1Var117, f1Var116, f1Var118, a1Var130, f1Var115, a1Var132, a1Var29, a1Var30, a1Var31, a1Var64, 1);
                                    a1Var56 = a1Var131;
                                    f1Var57 = f1Var119;
                                    f1Var45 = f1Var120;
                                    f1Var46 = f1Var121;
                                    f1Var47 = f1Var122;
                                    f1Var61 = f1Var114;
                                    a1Var57 = a1Var134;
                                    a1Var58 = a1Var133;
                                    a1Var65 = a1Var61;
                                    f1Var49 = f1Var117;
                                    f1Var48 = f1Var116;
                                    f1Var52 = f1Var118;
                                    a1Var78 = a1Var130;
                                    d0.h.p(hVar, new p1.e(y0Var, true, -601273778));
                                } else {
                                    a1Var64 = a1Var129;
                                    a1Var65 = a1Var61;
                                }
                                if (z14) {
                                    final boolean z16 = z10;
                                    final f1.g1 g1Var18 = g1Var7;
                                    final String str7 = str3;
                                    final f1.g1 g1Var19 = g1Var9;
                                    final f1.a1 a1Var137 = a1Var3;
                                    final f1.a1 a1Var138 = a1Var62;
                                    final f1.a1 a1Var139 = a1Var52;
                                    final f1.a1 a1Var140 = a1Var32;
                                    final f1.a1 a1Var141 = a1Var60;
                                    final f1.f1 f1Var124 = f1Var61;
                                    final f1.a1 a1Var142 = a1Var58;
                                    final f1.f1 f1Var125 = f1Var49;
                                    final f1.a1 a1Var143 = a1Var57;
                                    final f1.f1 f1Var126 = f1Var52;
                                    final f1.a1 a1Var144 = a1Var65;
                                    final f1.a1 a1Var145 = a1Var63;
                                    final f1.a1 a1Var146 = a1Var53;
                                    final f1.a1 a1Var147 = a1Var68;
                                    final f1.a1 a1Var148 = a1Var56;
                                    final f1.f1 f1Var127 = f1Var57;
                                    final f1.f1 f1Var128 = f1Var46;
                                    final f1.f1 f1Var129 = f1Var44;
                                    final f1.f1 f1Var130 = f1Var43;
                                    final f1.f1 f1Var131 = f1Var41;
                                    final f1.f1 f1Var132 = f1Var42;
                                    final f1.a1 a1Var149 = a1Var78;
                                    final f1.f1 f1Var133 = f1Var40;
                                    final g gVar6 = gVar2;
                                    final f1.g1 g1Var20 = g1Var8;
                                    final f1.f1 f1Var134 = f1Var45;
                                    final f1.f1 f1Var135 = f1Var48;
                                    final f1.a1 a1Var150 = a1Var64;
                                    final f1.f1 f1Var136 = f1Var50;
                                    final f1.f1 f1Var137 = f1Var47;
                                    final f1.a1 a1Var151 = a1Var55;
                                    final f1.a1 a1Var152 = a1Var54;
                                    d0.h.p(hVar, new p1.e(new ej.f() { // from class: lb.r2
                                        @Override // ej.f
                                        public final Object c(Object obj5, Object obj6, Object obj7) {
                                            f1.i0 i0Var3 = (f1.i0) obj6;
                                            int iIntValue3 = ((Integer) obj7).intValue();
                                            String str8 = "\u2014";
                                            fj.l.f((d0.c) obj5, "$this$item");
                                            if (i0Var3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                Object objQ2 = i0Var3.Q();
                                                f1.f fVar2 = f1.m.f6385a;
                                                Context context3 = context2;
                                                if (objQ2 == fVar2) {
                                                    try {
                                                        String str9 = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 0).versionName;
                                                        if (str9 != null) {
                                                            str8 = str9;
                                                        }
                                                    } catch (Exception unused) {
                                                    }
                                                    i0Var3.l0(str8);
                                                    objQ2 = str8;
                                                }
                                                q3.l("ABOUT", i0Var3, 6);
                                                q3.j(0L, p1.j.d(-1163979647, new n0((String) objQ2, z16, str7, a1Var150, context3, a1Var137, a1Var140, 1), i0Var3), i0Var3, 48);
                                                v1.l lVar = v1.l.f17564b;
                                                b0.d.e(i0Var3, b0.t1.e(12, lVar));
                                                final g gVar7 = gVar6;
                                                final f1.g1 g1Var21 = g1Var18;
                                                final f1.g1 g1Var22 = g1Var20;
                                                final f1.g1 g1Var23 = g1Var19;
                                                final f1.f1 f1Var138 = f1Var133;
                                                final f1.a1 a1Var153 = a1Var139;
                                                final f1.a1 a1Var154 = a1Var138;
                                                final f1.a1 a1Var155 = a1Var152;
                                                final f1.f1 f1Var139 = f1Var129;
                                                final f1.f1 f1Var140 = f1Var130;
                                                final f1.f1 f1Var141 = f1Var131;
                                                final f1.f1 f1Var142 = f1Var136;
                                                final f1.f1 f1Var143 = f1Var132;
                                                final f1.a1 a1Var156 = a1Var151;
                                                final f1.a1 a1Var157 = a1Var146;
                                                final f1.a1 a1Var158 = a1Var145;
                                                final f1.a1 a1Var159 = a1Var147;
                                                final f1.a1 a1Var160 = a1Var148;
                                                final f1.f1 f1Var144 = f1Var127;
                                                final f1.f1 f1Var145 = f1Var134;
                                                final f1.f1 f1Var146 = f1Var128;
                                                final f1.f1 f1Var147 = f1Var137;
                                                final f1.f1 f1Var148 = f1Var124;
                                                final f1.f1 f1Var149 = f1Var125;
                                                final f1.f1 f1Var150 = f1Var135;
                                                final f1.f1 f1Var151 = f1Var126;
                                                final f1.a1 a1Var161 = a1Var149;
                                                final f1.a1 a1Var162 = a1Var142;
                                                final f1.a1 a1Var163 = a1Var143;
                                                final f1.a1 a1Var164 = a1Var141;
                                                final f1.a1 a1Var165 = a1Var144;
                                                q3.j(0L, p1.j.d(1058237176, new ej.f() { // from class: lb.x0
                                                    @Override // ej.f
                                                    public final Object c(Object obj8, Object obj9, Object obj10) {
                                                        z.k kVar2;
                                                        f1.i0 i0Var4 = (f1.i0) obj9;
                                                        int iIntValue4 = ((Integer) obj10).intValue();
                                                        fj.l.f((b0.c0) obj8, "$this$MSCard");
                                                        if (i0Var4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                            v1.l lVar2 = v1.l.f17564b;
                                                            v1.o oVarC2 = b0.t1.c(1.0f, lVar2);
                                                            Object objQ3 = i0Var4.Q();
                                                            f1.f fVar3 = f1.m.f6385a;
                                                            if (objQ3 == fVar3) {
                                                                objQ3 = t.m1.p(i0Var4);
                                                            }
                                                            z.k kVar3 = (z.k) objQ3;
                                                            final g gVar8 = gVar7;
                                                            boolean zH4 = i0Var4.h(gVar8);
                                                            Object objQ4 = i0Var4.Q();
                                                            if (zH4 || objQ4 == fVar3) {
                                                                final f1.g1 g1Var24 = g1Var21;
                                                                final f1.g1 g1Var25 = g1Var22;
                                                                final f1.g1 g1Var26 = g1Var23;
                                                                final f1.f1 f1Var152 = f1Var138;
                                                                final f1.a1 a1Var166 = a1Var153;
                                                                final f1.a1 a1Var167 = a1Var154;
                                                                final f1.a1 a1Var168 = a1Var155;
                                                                final f1.f1 f1Var153 = f1Var139;
                                                                final f1.f1 f1Var154 = f1Var140;
                                                                kVar2 = kVar3;
                                                                final f1.f1 f1Var155 = f1Var141;
                                                                final f1.f1 f1Var156 = f1Var142;
                                                                final f1.f1 f1Var157 = f1Var143;
                                                                final f1.a1 a1Var169 = a1Var156;
                                                                final f1.a1 a1Var170 = a1Var157;
                                                                final f1.a1 a1Var171 = a1Var158;
                                                                final f1.a1 a1Var172 = a1Var159;
                                                                final f1.a1 a1Var173 = a1Var160;
                                                                final f1.f1 f1Var158 = f1Var144;
                                                                final f1.f1 f1Var159 = f1Var145;
                                                                final f1.f1 f1Var160 = f1Var146;
                                                                final f1.f1 f1Var161 = f1Var147;
                                                                final f1.f1 f1Var162 = f1Var148;
                                                                final f1.f1 f1Var163 = f1Var149;
                                                                final f1.f1 f1Var164 = f1Var150;
                                                                final f1.f1 f1Var165 = f1Var151;
                                                                final f1.a1 a1Var174 = a1Var161;
                                                                final f1.a1 a1Var175 = a1Var162;
                                                                final f1.a1 a1Var176 = a1Var163;
                                                                final f1.a1 a1Var177 = a1Var164;
                                                                final f1.a1 a1Var178 = a1Var165;
                                                                ej.a aVar3 = new ej.a() { // from class: lb.o1
                                                                    @Override // ej.a
                                                                    public final Object a() {
                                                                        g gVar9 = gVar8;
                                                                        SharedPreferences sharedPreferences = gVar9.f10289a;
                                                                        sharedPreferences.edit().clear().apply();
                                                                        g1Var24.h(gVar9.p());
                                                                        g1Var25.h(gVar9.m());
                                                                        g1Var26.h(gVar9.q());
                                                                        f1Var152.h(gVar9.q());
                                                                        a1Var166.setValue(Boolean.valueOf(gVar9.o()));
                                                                        a1Var167.setValue(Boolean.valueOf(sharedPreferences.getBoolean("app_icon_highlights", true)));
                                                                        a1Var168.setValue(Boolean.valueOf(sharedPreferences.getBoolean("origin_os_highlights", false)));
                                                                        f1Var153.h(sharedPreferences.getFloat("icon_opacity", 1.0f));
                                                                        f1Var154.h(sharedPreferences.getFloat("icon_bg_opacity", 1.0f));
                                                                        f1Var155.h(sharedPreferences.getFloat("icon_fg_opacity", 1.0f));
                                                                        f1Var156.h(sharedPreferences.getFloat("icon_color_boost", 1.0f));
                                                                        f1Var157.h(sharedPreferences.getFloat("icon_highlight_angle", 45.0f));
                                                                        a1Var169.setValue(gVar9.n());
                                                                        a1Var170.setValue(Boolean.valueOf(sharedPreferences.getBoolean("icon_opacity_customize_expanded", false)));
                                                                        a1Var171.setValue(Boolean.valueOf(sharedPreferences.getBoolean("app_icon_liquid_glass", false)));
                                                                        a1Var172.setValue(sharedPreferences.getString("icon_pack_package", null));
                                                                        a1Var173.setValue(Boolean.valueOf(gVar9.g()));
                                                                        f1Var158.h(gVar9.d());
                                                                        q3.F(f1Var159, gVar9.b());
                                                                        q3.G(f1Var160, gVar9.j());
                                                                        q3.H(f1Var161, gVar9.i());
                                                                        q3.I(f1Var162, gVar9.c());
                                                                        f1Var163.h(sharedPreferences.getFloat("dock_horizontal_padding", 15.0f));
                                                                        f1Var164.h(sharedPreferences.getFloat("dock_vertical_padding", 15.0f));
                                                                        f1Var165.h(gVar9.f());
                                                                        a1Var174.setValue(Boolean.valueOf(sharedPreferences.getBoolean("dock_show_background", true)));
                                                                        a1Var175.setValue(Float.valueOf(gVar9.e()));
                                                                        a1Var176.setValue(Boolean.valueOf(sharedPreferences.getBoolean("dock_no_glass_effect", false)));
                                                                        a1Var177.setValue(Boolean.valueOf(gVar9.h()));
                                                                        a1Var178.setValue(Boolean.valueOf(gVar9.k()));
                                                                        return pi.o.f13011a;
                                                                    }
                                                                };
                                                                i0Var4.l0(aVar3);
                                                                objQ4 = aVar3;
                                                            } else {
                                                                kVar2 = kVar3;
                                                            }
                                                            float f10 = 16;
                                                            v1.o oVarU = b0.d.u(v.n.k(oVarC2, kVar2, null, false, null, (ej.a) objQ4, 28), f10, f10);
                                                            b0.q1 q1VarA = b0.o1.a(b0.j.f1363e, v1.b.D, i0Var4, 54);
                                                            int iHashCode = Long.hashCode(i0Var4.T);
                                                            f1.n1 n1VarL = i0Var4.l();
                                                            v1.o oVarC3 = v1.a.c(i0Var4, oVarU);
                                                            v2.h.f17668w.getClass();
                                                            v2.f fVar4 = v2.g.f17645b;
                                                            i0Var4.e0();
                                                            if (i0Var4.S) {
                                                                i0Var4.k(fVar4);
                                                            } else {
                                                                i0Var4.o0();
                                                            }
                                                            f1.s.M(v2.g.f17649f, i0Var4, q1VarA);
                                                            f1.s.M(v2.g.f17648e, i0Var4, n1VarL);
                                                            f1.s.w(i0Var4, Integer.valueOf(iHashCode), v2.g.f17650g);
                                                            f1.s.I(v2.g.f17651h, i0Var4);
                                                            f1.s.M(v2.g.f17647d, i0Var4, oVarC3);
                                                            String strValueOf = String.valueOf('\ue918');
                                                            k3.m mVar = ha.e.f7772d;
                                                            long jX = hj.a.x(18);
                                                            long j = c2.w.f3055e;
                                                            v7.a(strValueOf, null, j, jX, null, mVar, 0L, null, 0L, 0, false, 0, 0, null, i0Var4, 24960, 0, 261994);
                                                            b0.d.e(i0Var4, b0.t1.o(8, lVar2));
                                                            v7.a("Reset Settings", null, j, hj.a.x(16), k3.s.A, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var4, 1597830, 0, 262058);
                                                            i0Var4.p(true);
                                                        } else {
                                                            i0Var4.W();
                                                        }
                                                        return pi.o.f13011a;
                                                    }
                                                }, i0Var3), i0Var3, 48);
                                                b0.d.e(i0Var3, b0.t1.e(32, lVar));
                                            } else {
                                                i0Var3.W();
                                            }
                                            return pi.o.f13011a;
                                        }
                                    }, true, -1031620051));
                                }
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
}
