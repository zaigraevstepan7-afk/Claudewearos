package ra;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c1.u3;
import com.anonlab.voidlauncher.R;
import f1.q2;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final p1.e f13927a = new p1.e(new d1.a(22), false, 530694692);

    /* renamed from: b, reason: collision with root package name */
    public static final p1.e f13928b = new p1.e(new a(4, (byte) 0), false, 4568811);

    /* renamed from: c, reason: collision with root package name */
    public static final p1.e f13929c = new p1.e(new d1.a(23), false, -1123341093);

    /* renamed from: d, reason: collision with root package name */
    public static final p1.e f13930d = new p1.e(new a(5, (byte) 0), false, 75828194);

    /* renamed from: e, reason: collision with root package name */
    public static final p1.e f13931e = new p1.e(new a(6, (byte) 0), false, -925227677);

    /* renamed from: f, reason: collision with root package name */
    public static final p1.e f13932f = new p1.e(new d1.a(24), false, 94938524);

    /* renamed from: g, reason: collision with root package name */
    public static final p1.e f13933g = new p1.e(new lb.d(26), false, 1294107811);

    /* renamed from: h, reason: collision with root package name */
    public static final p1.e f13934h = new p1.e(new lb.d(27), false, 293051940);

    /* renamed from: i, reason: collision with root package name */
    public static final p1.e f13935i = new p1.e(new lb.d(28), false, 1560405565);
    public static final p1.e j = new p1.e(new lb.d(29), false, -1298944140);

    /* renamed from: k, reason: collision with root package name */
    public static final p1.e f13936k = new p1.e(new a(0, (byte) 0), false, 265005157);

    /* renamed from: l, reason: collision with root package name */
    public static final p1.e f13937l = new p1.e(new a(1, (byte) 0), false, 1813725669);

    /* renamed from: m, reason: collision with root package name */
    public static final p1.e f13938m = new p1.e(new a(2, (byte) 0), false, 1551996609);

    /* renamed from: n, reason: collision with root package name */
    public static final p1.e f13939n = new p1.e(new a(3, (byte) 0), false, -163601982);

    /* renamed from: o, reason: collision with root package name */
    public static final p1.e f13940o = new p1.e(new d1.a(25), false, -161986583);

    /* renamed from: p, reason: collision with root package name */
    public static final p1.e f13941p = new p1.e(new a(7, (byte) 0), false, -865468880);

    /* renamed from: q, reason: collision with root package name */
    public static final p1.e f13942q = new p1.e(new a(8, (byte) 0), false, -2126277007);

    public static final void a(int i10, f1.i0 i0Var) {
        i0Var.c0(-1222219545);
        if (i0Var.T(i10 & 1, i10 != 0)) {
            i0Var.b0(-1614864554);
            androidx.lifecycle.b1 b1VarA = e6.a.a(i0Var);
            if (b1VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            androidx.lifecycle.x0 x0VarR = a.a.R(fj.w.a(r0.class), b1VarA.e(), yd.f.s(b1VarA), pk.b.a(i0Var));
            i0Var.p(false);
            r0 r0Var = (r0) x0VarR;
            f1.a1 a1VarH = a.a.h(r0Var.f14146c, i0Var);
            tj.c0 c0Var = r0Var.f14148e;
            Object objQ = i0Var.Q();
            Object obj = f1.m.f6385a;
            if (objQ == obj) {
                objQ = new ab.k(r0Var, 2);
                i0Var.l0(objQ);
            }
            ej.c cVar = (ej.c) objQ;
            Object objQ2 = i0Var.Q();
            if (objQ2 == obj) {
                objQ2 = f1.s.q(new d1.v0(a1VarH, 2));
                i0Var.l0(objQ2);
            }
            q2 q2Var = (q2) objQ2;
            boolean zF = i0Var.f(cVar);
            Object objQ3 = i0Var.Q();
            if (zF || objQ3 == obj) {
                objQ3 = new ab.n(cVar, 6);
                i0Var.l0(objQ3);
            }
            ej.c cVar2 = (ej.c) objQ3;
            Context context = (Context) i0Var.j(AndroidCompositionLocals_androidKt.f838b);
            boolean zF2 = i0Var.f(context);
            Object objQ4 = i0Var.Q();
            if (zF2 || objQ4 == obj) {
                objQ4 = new lb.g(context);
                i0Var.l0(objQ4);
            }
            lb.g gVar = (lb.g) objQ4;
            boolean zF3 = i0Var.f(context);
            Object objQ5 = i0Var.Q();
            if (zF3 || objQ5 == obj) {
                fj.l.f(context, "context");
                Resources resources = context.getResources();
                objQ5 = f1.s.A(new xa.b(r6.m() / 100.0f, r6.q() / 100.0f, resources.getDimensionPixelOffset(R.dimen.app_icon_badge_offset), resources.getBoolean(R.bool.app_icon_label_visible), new lb.g(context).n()));
                i0Var.l0(objQ5);
            }
            float f10 = ((ib.v0) a1VarH.getValue()).f8471k;
            ib.q0 q0Var = ((ib.v0) a1VarH.getValue()).f8472l;
            SharedPreferences sharedPreferences = gVar.f10289a;
            SharedPreferences sharedPreferences2 = gVar.f10289a;
            uk.c.f(f10, q0Var, sharedPreferences.getFloat("icon_highlight_angle", 45.0f), sharedPreferences2.getBoolean("app_icon_highlights", true), sharedPreferences2.getBoolean("origin_os_highlights", false), gVar.n(), p1.j.d(1727929313, new n((f1.a1) objQ5, r0Var, c0Var, cVar2, q2Var), i0Var), i0Var, 1572864);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new a(i10);
        }
    }

    public static final void b(final ib.g gVar, final tj.e eVar, final ej.c cVar, final LocalDateTime localDateTime, final ej.c cVar2, final ej.c cVar3, final ej.a aVar, final ej.c cVar4, final ej.c cVar5, final ej.c cVar6, final ej.c cVar7, final ej.f fVar, final ej.c cVar8, final ej.a aVar2, final ej.a aVar3, f1.i0 i0Var, final int i10) {
        fj.l.f(gVar, "state");
        fj.l.f(eVar, "effect");
        fj.l.f(cVar, "onAction");
        i0Var.c0(-1682082441);
        int i11 = i10 | (i0Var.f(gVar) ? 32 : 16) | (i0Var.h(eVar) ? 256 : 128) | (i0Var.h(cVar) ? 2048 : 1024) | (i0Var.h(localDateTime) ? 16384 : 8192) | (i0Var.h(cVar2) ? 131072 : 65536) | (i0Var.h(cVar3) ? 1048576 : 524288) | (i0Var.h(aVar) ? 8388608 : 4194304) | (i0Var.h(cVar4) ? 67108864 : 33554432) | (i0Var.h(cVar5) ? 536870912 : 268435456);
        int i12 = (i0Var.h(cVar6) ? 4 : 2) | (i0Var.h(cVar7) ? 32 : 16) | (i0Var.h(fVar) ? 256 : 128) | (i0Var.h(cVar8) ? 2048 : 1024) | (i0Var.h(aVar2) ? 16384 : 8192) | (i0Var.h(aVar3) ? 131072 : 65536);
        if (i0Var.T(i11 & 1, ((i11 & 306783379) == 306783378 && (i12 & 74899) == 74898) ? false : true)) {
            boolean z2 = (i11 & 7168) == 2048;
            Object objQ = i0Var.Q();
            if (z2 || objQ == f1.m.f6385a) {
                objQ = new db.g(cVar, 7);
                i0Var.l0(objQ);
            }
            ej.a aVar4 = (ej.a) objQ;
            ib.q0 q0Var = (ib.q0) i0Var.j(jb.f.f8822b);
            if (fj.l.b(q0Var, ib.r0.f8454a)) {
                i0Var.b0(-1573489506);
                fj.l.c(localDateTime);
                c(localDateTime, aVar4, i0Var, 6);
                i0Var.p(false);
            } else {
                if (!(q0Var instanceof ib.u0)) {
                    i0Var.b0(-1573490818);
                    i0Var.p(false);
                    throw new b3.e();
                }
                i0Var.b0(-1573483384);
                int i13 = i11 & 8190;
                int i14 = i11 >> 3;
                d(gVar, eVar, cVar, cVar2, cVar3, aVar, cVar4, cVar5, cVar6, cVar7, fVar, cVar8, aVar2, aVar3, i0Var, i13 | (57344 & i14) | (458752 & i14) | (3670016 & i14) | (29360128 & i14) | (i14 & 234881024) | ((i12 << 27) & 1879048192), (i12 >> 3) & 65534);
                i0Var.p(false);
            }
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e(eVar, cVar, localDateTime, cVar2, cVar3, aVar, cVar4, cVar5, cVar6, cVar7, fVar, cVar8, aVar2, aVar3, i10) { // from class: ra.p
                public final /* synthetic */ ej.c A;
                public final /* synthetic */ ej.c B;
                public final /* synthetic */ ej.c C;
                public final /* synthetic */ ej.c D;
                public final /* synthetic */ ej.f E;
                public final /* synthetic */ ej.c F;
                public final /* synthetic */ ej.a G;
                public final /* synthetic */ ej.a H;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ tj.e f14117b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ ej.c f14118c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ LocalDateTime f14119d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ ej.c f14120e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ ej.c f14121f;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ ej.a f14122z;

                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iO = f1.s.O(7);
                    b.b(this.f14116a, this.f14117b, this.f14118c, this.f14119d, this.f14120e, this.f14121f, this.f14122z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, (f1.i0) obj, iO);
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void c(LocalDateTime localDateTime, ej.a aVar, f1.i0 i0Var, int i10) {
        int i11;
        fj.l.f(localDateTime, "dateTime");
        fj.l.f(aVar, "onTap");
        i0Var.c0(-830342294);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.f(v1.l.f17564b) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.h(localDateTime) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= i0Var.h(aVar) ? 256 : 128;
        }
        if (i0Var.T(i11 & 1, (i11 & 147) != 146)) {
            Object objQ = i0Var.Q();
            f1.f fVar = f1.m.f6385a;
            if (objQ == fVar) {
                objQ = f1.s.A(Boolean.FALSE);
                i0Var.l0(objQ);
            }
            f1.a1 a1Var = (f1.a1) objQ;
            Object objQ2 = i0Var.Q();
            if (objQ2 == fVar) {
                objQ2 = new lb.q0(2, a1Var, null);
                i0Var.l0(objQ2);
            }
            f1.s.f((ej.e) objQ2, i0Var, pi.o.f13011a);
            s.a0.b(((Boolean) a1Var.getValue()).booleanValue(), null, s.n0.b(t.d.t(500, 0, t.y.f15329d, 2)), null, null, p1.j.d(-1156980846, new ba.b(localDateTime, aVar), i0Var), i0Var, 196608, 26);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new d0.j(localDateTime, aVar, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:544:0x0e7a  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0ea8  */
    /* JADX WARN: Type inference failed for: r38v2, types: [java.lang.Object, java.lang.Throwable, ti.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final ib.g r106, final tj.e r107, final ej.c r108, final ej.c r109, final ej.c r110, final ej.a r111, final ej.c r112, final ej.c r113, final ej.c r114, final ej.c r115, final ej.f r116, final ej.c r117, final ej.a r118, final ej.a r119, f1.i0 r120, final int r121, final int r122) {
        /*
            Method dump skipped, instructions count: 4786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.b.d(ib.g, tj.e, ej.c, ej.c, ej.c, ej.a, ej.c, ej.c, ej.c, ej.c, ej.f, ej.c, ej.a, ej.a, f1.i0, int, int):void");
    }

    public static final void e(f1.a1 a1Var, boolean z2) {
        a1Var.setValue(Boolean.valueOf(z2));
    }

    public static final float f(f1.f1 f1Var) {
        return f1Var.g();
    }

    public static final float g(f1.f1 f1Var) {
        return f1Var.g();
    }

    public static final boolean h(f1.a1 a1Var) {
        return ((Boolean) a1Var.getValue()).booleanValue();
    }

    public static final float i(f1.f1 f1Var) {
        return f1Var.g();
    }

    public static final boolean j(f1.a1 a1Var) {
        return ((Boolean) a1Var.getValue()).booleanValue();
    }

    public static final float k(q2 q2Var) {
        return ((s3.f) q2Var.getValue()).f14742a;
    }

    public static final float l(q2 q2Var) {
        return ((Number) q2Var.getValue()).floatValue();
    }

    public static final void m(f1.a1 a1Var, boolean z2) {
        a1Var.setValue(Boolean.valueOf(z2));
    }

    public static final c2.g n(f1.a1 a1Var) {
        return (c2.g) a1Var.getValue();
    }

    public static final c2.g o(f1.a1 a1Var) {
        return (c2.g) a1Var.getValue();
    }

    public static final c2.g p(f1.a1 a1Var) {
        return (c2.g) a1Var.getValue();
    }

    public static final boolean q(f1.a1 a1Var) {
        return ((Boolean) a1Var.getValue()).booleanValue();
    }

    public static final boolean r(f1.a1 a1Var) {
        return ((Boolean) a1Var.getValue()).booleanValue();
    }

    public static final c2.g s(f1.a1 a1Var) {
        return (c2.g) a1Var.getValue();
    }

    public static final c2.g t(f1.a1 a1Var) {
        return (c2.g) a1Var.getValue();
    }

    public static final boolean u(f1.a1 a1Var) {
        return ((Boolean) a1Var.getValue()).booleanValue();
    }

    public static final void v(f1.a1 a1Var, boolean z2) {
        a1Var.setValue(Boolean.valueOf(z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v18 */
    public static final void w(final ej.a aVar, final v1.o oVar, final mi.p pVar, final ea.c cVar, float f10, final float f11, float f12, final c2.g gVar, final boolean z2, final boolean z10, final c2.g gVar2, c2.g gVar3, final float f13, p1.e eVar, f1.i0 i0Var, final int i10) {
        final p1.e eVar2;
        float f14;
        float f15;
        f1.i0 i0Var2;
        int i11;
        float f16;
        t.j jVarT;
        ?? r52;
        v1.o oVar2;
        int i12;
        boolean z11;
        c2.g gVar4 = gVar3;
        f1.i0 i0Var3 = i0Var;
        fj.l.f(aVar, "onLongClick");
        fj.l.f(oVar, "modifier");
        i0Var3.c0(137704573);
        int i13 = i10 | (i0Var3.h(aVar) ? 4 : 2) | (i0Var3.f(oVar) ? 32 : 16) | (i0Var3.f(pVar) ? 256 : 128) | (i0Var3.c(f10) ? 16384 : 8192) | (i0Var3.c(f11) ? 131072 : 65536) | (i0Var3.c(f12) ? 1048576 : 524288) | (i0Var3.h(gVar) ? 8388608 : 4194304) | (i0Var3.g(z2) ? 67108864 : 33554432) | (i0Var3.g(z10) ? 536870912 : 268435456);
        if (i0Var3.T(i13 & 1, ((i13 & 306782355) == 306782354 && (((('\u0c00' | (i0Var3.h(gVar2) ? (char) 4 : (char) 2)) | (i0Var3.h(gVar4) ? ' ' : (char) 16)) | (i0Var3.c(f13) ? '\u0100' : '\u0080')) & 1171) == 1170) ? false : true)) {
            gi.d dVarD = gi.f.d(null, i0Var3, 0, 3);
            Context context = (Context) i0Var3.j(AndroidCompositionLocals_androidKt.f838b);
            boolean zF = i0Var3.f(context);
            Object objQ = i0Var3.Q();
            Object obj = f1.m.f6385a;
            if (zF || objQ == obj) {
                objQ = new lb.g(context);
                i0Var3.l0(objQ);
            }
            lb.g gVar5 = (lb.g) objQ;
            Object objQ2 = i0Var3.Q();
            if (objQ2 == obj) {
                objQ2 = f1.s.A(x(gVar5));
                i0Var3.l0(objQ2);
            }
            f1.a1 a1Var = (f1.a1) objQ2;
            Object objQ3 = i0Var3.Q();
            if (objQ3 == obj) {
                i11 = i13;
                objQ3 = f1.s.A(Boolean.valueOf(gVar5.f10289a.getBoolean("app_icon_liquid_glass", false)));
                i0Var3.l0(objQ3);
            } else {
                i11 = i13;
            }
            f1.a1 a1Var2 = (f1.a1) objQ3;
            Object objQ4 = i0Var3.Q();
            if (objQ4 == obj) {
                lb.a aVar2 = lb.f.f10264a;
                String string = gVar5.f10289a.getString("graphic_quality", "ULTRA");
                String str = string != null ? string : "ULTRA";
                aVar2.getClass();
                objQ4 = lb.a.a(str);
                i0Var3.l0(objQ4);
            }
            float f17 = ((lb.f) objQ4) == lb.f.f10268e ? 0 : 50.0f * f13;
            pi.h hVarR = mb.a.r(i0Var3);
            float f18 = z2 ? 1.09f : 1.0f;
            t.s sVar = t.y.f15326a;
            q2 q2VarB = t.e.b(f18, t.d.t(340, 0, sVar, 2), "home_wallpaper_zoom", null, i0Var, 3072, 20);
            float fFloatValue = z2 ? ((Number) hVarR.f13000a).floatValue() : 0.0f;
            if (z2) {
                jVarT = t.d.r();
                f16 = 0.0f;
            } else {
                f16 = 0.0f;
                jVarT = t.d.t(300, 0, sVar, 2);
            }
            q2 q2VarB2 = t.e.b(fFloatValue, jVarT, "home_wallpaper_parallax_x", null, i0Var, 3072, 20);
            q2 q2VarB3 = t.e.b(z2 ? ((Number) hVarR.f13001b).floatValue() : f16, z2 ? t.d.r() : t.d.t(300, 0, sVar, 2), "home_wallpaper_parallax_y", null, i0Var, 3072, 20);
            f1.i0 i0Var4 = i0Var;
            boolean zH = i0Var4.h(gVar5);
            Object objQ5 = i0Var4.Q();
            if (zH || objQ5 == obj) {
                objQ5 = new ab.m(gVar5, a1Var, a1Var2, 16);
                i0Var4.l0(objQ5);
            }
            f1.s.c(gVar5, (ej.c) objQ5, i0Var4);
            b0.i0 i0Var5 = b0.t1.f1433c;
            v1.o oVarC = oVar.c(i0Var5);
            boolean z12 = (i11 & 14) == 4;
            Object objQ6 = i0Var4.Q();
            if (z12 || objQ6 == obj) {
                objQ6 = new u3(1, aVar);
                i0Var4.l0(objQ6);
            }
            v1.o oVarA = p2.k0.a(oVarC, pi.o.f13011a, (PointerInputEventHandler) objQ6);
            v1.g gVar6 = v1.b.f17547a;
            t2.q0 q0VarD = b0.r.d(gVar6, false);
            int iHashCode = Long.hashCode(i0Var4.T);
            f1.n1 n1VarL = i0Var4.l();
            v1.o oVarC2 = v1.a.c(i0Var4, oVarA);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var4.e0();
            if (i0Var4.S) {
                i0Var4.k(fVar);
            } else {
                i0Var4.o0();
            }
            v2.e eVar3 = v2.g.f17649f;
            f1.s.M(eVar3, i0Var4, q0VarD);
            v2.e eVar4 = v2.g.f17648e;
            f1.s.M(eVar4, i0Var4, n1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            v2.e eVar5 = v2.g.f17650g;
            f1.s.w(i0Var4, numValueOf, eVar5);
            v2.d dVar = v2.g.f17651h;
            f1.s.I(dVar, i0Var4);
            v2.e eVar6 = v2.g.f17647d;
            f1.s.M(eVar6, i0Var4, oVarC2);
            b0.w wVar = b0.w.f1450a;
            v1.o oVarB = z1.h.b(f11, wVar.a());
            t2.q0 q0VarD2 = b0.r.d(gVar6, false);
            int iHashCode2 = Long.hashCode(i0Var4.T);
            f1.n1 n1VarL2 = i0Var4.l();
            v1.o oVarC3 = v1.a.c(i0Var4, oVarB);
            i0Var4.e0();
            if (i0Var4.S) {
                i0Var4.k(fVar);
            } else {
                i0Var4.o0();
            }
            f1.s.M(eVar3, i0Var4, q0VarD2);
            f1.s.M(eVar4, i0Var4, n1VarL2);
            gk.b.t(iHashCode2, i0Var4, eVar5, i0Var4, dVar);
            f1.s.M(eVar6, i0Var4, oVarC3);
            v1.o oVarB2 = z1.h.b(f17, gi.f.a(a.a.M(wVar.a(), pVar), dVarD));
            t2.q0 q0VarD3 = b0.r.d(gVar6, false);
            int iHashCode3 = Long.hashCode(i0Var4.T);
            f1.n1 n1VarL3 = i0Var4.l();
            v1.o oVarC4 = v1.a.c(i0Var4, oVarB2);
            i0Var4.e0();
            if (i0Var4.S) {
                i0Var4.k(fVar);
            } else {
                i0Var4.o0();
            }
            f1.s.M(eVar3, i0Var4, q0VarD3);
            f1.s.M(eVar4, i0Var4, n1VarL3);
            gk.b.t(iHashCode3, i0Var4, eVar5, i0Var4, dVar);
            f1.s.M(eVar6, i0Var4, oVarC4);
            if (gVar == null) {
                i0Var4.b0(335593078);
                i0Var4.p(false);
                r52 = 0;
                z11 = true;
                oVar2 = null;
                i12 = 2;
            } else {
                i0Var4.b0(335593079);
                boolean zF2 = i0Var4.f(q2VarB) | i0Var4.f(q2VarB2) | i0Var4.f(q2VarB3);
                Object objQ7 = i0Var4.Q();
                if (zF2 || objQ7 == obj) {
                    objQ7 = new mb.d(q2VarB, q2VarB2, q2VarB3, 1);
                    i0Var4.l0(objQ7);
                }
                r52 = 0;
                oVar2 = null;
                i12 = 2;
                z11 = true;
                v.n.c(gVar, null, c2.e0.q(i0Var5, (ej.c) objQ7), t2.h.f15563a, i0Var4, 24624, 232);
                i0Var4.p(false);
            }
            if (z10) {
                i0Var4.b0(336336180);
                mk.b.e(gVar == null ? gVar2 : gVar, oVar2, i0Var4, r52, i12);
                i0Var4.p(r52);
            } else {
                i0Var4.b0(336519731);
                i0Var4.p(r52);
            }
            v1.o oVarA2 = wVar.a();
            f14 = f10;
            long jC = c2.w.c(c2.w.f3052b, f14);
            c2.q0 q0Var = c2.e0.f2986b;
            b0.r.a(v.n.f(oVarA2, jC, q0Var), i0Var4, r52);
            if (f12 > f16) {
                i0Var4.b0(336777558);
                f15 = f12;
                b0.r.a(v.n.f(wVar.a(), c2.w.c(c2.e0.d(4293388782L), f15), q0Var), i0Var4, r52);
                i0Var4.p(r52);
            } else {
                f15 = f12;
                i0Var4.b0(337020691);
                i0Var4.p(r52);
            }
            i0Var4.p(z11);
            f1.r1 r1VarA = jb.f.f8828h.a(dVarD);
            f1.r1 r1VarA2 = jb.f.f8827g.a((jb.d) a1Var.getValue());
            f1.v vVar = jb.f.f8829i;
            Boolean bool = (Boolean) a1Var2.getValue();
            bool.getClass();
            gVar4 = gVar3;
            eVar2 = eVar;
            f1.s.b(new f1.r1[]{r1VarA, r1VarA2, vVar.a(bool), jb.f.j.a(gVar4)}, p1.j.d(-1872305719, new c1.d(eVar2), i0Var4), i0Var4, 56);
            i0Var4.p(z11);
            i0Var4.p(z11);
            i0Var2 = i0Var4;
        } else {
            eVar2 = eVar;
            f14 = f10;
            f15 = f12;
            i0Var3.W();
            i0Var2 = i0Var3;
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            final float f19 = f14;
            final float f20 = f15;
            final c2.g gVar7 = gVar4;
            t1VarU.f6456d = new ej.e(oVar, pVar, cVar, f19, f11, f20, gVar, z2, z10, gVar2, gVar7, f13, eVar2, i10) { // from class: ra.o
                public final /* synthetic */ c2.g A;
                public final /* synthetic */ boolean B;
                public final /* synthetic */ boolean C;
                public final /* synthetic */ c2.g D;
                public final /* synthetic */ c2.g E;
                public final /* synthetic */ float F;
                public final /* synthetic */ p1.e G;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ v1.o f14102b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ mi.p f14103c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ ea.c f14104d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ float f14105e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ float f14106f;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ float f14107z;

                @Override // ej.e
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iO = f1.s.O(1);
                    b.w(this.f14101a, this.f14102b, this.f14103c, this.f14104d, this.f14105e, this.f14106f, this.f14107z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, (f1.i0) obj2, iO);
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final jb.d x(lb.g gVar) {
        boolean zG = gVar.g();
        float fD = gVar.d();
        float fB = gVar.b();
        float fJ = gVar.j();
        float fI = gVar.i();
        float fC = gVar.c();
        SharedPreferences sharedPreferences = gVar.f10289a;
        return new jb.d(zG, fD, fB, fJ, fI, fC, sharedPreferences.getBoolean("dock_no_glass_effect", false), gVar.e(), gVar.k(), gVar.h(), sharedPreferences.getFloat("dock_horizontal_padding", 15.0f), sharedPreferences.getFloat("dock_vertical_padding", 15.0f), gVar.f(), sharedPreferences.getBoolean("dock_show_background", true), sharedPreferences.getFloat("liquid_glass_fill_opacity", 0.2f));
    }

    public static final List y(String str, List list) {
        if (nj.e.K0(str)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String str2 = ((xa.f) obj).f19864c.f19856b;
            fj.l.f(str2, "<this>");
            String str3 = str;
            if (nj.l.x0(0, 0, str.length(), str2, str3, true)) {
                arrayList.add(obj);
            }
            str = str3;
        }
        String str4 = str;
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (nj.e.C0(((xa.f) obj2).f19864c.f19856b, str4, true)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public static final xa.f z(oa.d dVar) {
        xa.e eVar;
        int id2 = dVar.getId();
        String strA = dVar.a();
        String name = dVar.getName();
        Bitmap icon = dVar.getIcon();
        int iOrdinal = dVar.getType().ordinal();
        if (iOrdinal == 0) {
            eVar = xa.e.f19859a;
        } else {
            if (iOrdinal != 1) {
                throw new b3.e();
            }
            eVar = xa.e.f19860b;
        }
        return new xa.f(id2, strA, new xa.d(icon, name, null, eVar), null);
    }
}
