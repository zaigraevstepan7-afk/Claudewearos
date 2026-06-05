package ab;

import android.graphics.Rect;
import b0.k1;
import b0.r1;
import b0.t1;
import c1.a2;
import c1.s3;
import c1.v7;
import c1.x6;
import c2.e0;
import c2.z0;
import com.anonlab.voidlauncher.feature.home.presentation.HomeActivity;
import f1.a1;
import f1.g1;
import f1.i0;
import f1.q2;
import g3.m0;
import i2.h0;
import java.util.ArrayList;
import java.util.List;
import k0.k0;
import t2.f1;
import t2.p0;
import t2.s0;
import v0.u0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements ej.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f257a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f258b;

    public /* synthetic */ a0(Object obj, int i10) {
        this.f257a = i10;
        this.f258b = obj;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i10 = this.f257a;
        int i11 = 8;
        f1.f fVar = f1.m.f6385a;
        int i12 = 1;
        pi.o oVar = pi.o.f13011a;
        Object obj4 = this.f258b;
        switch (i10) {
            case 0:
                q2 q2Var = (q2) obj4;
                b0.v vVar = (b0.v) obj;
                i0 i0Var = (i0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                fj.l.f(vVar, "$this$GlassyBox");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= i0Var.f(vVar) ? 4 : 2;
                }
                if (!i0Var.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    i0Var.W();
                    break;
                } else {
                    v1.o oVarA = vVar.a();
                    long j = c2.w.f3052b;
                    b0.r.a(v.n.f(oVarA, c2.w.c(j, 0.65f), e0.f2986b), i0Var, 0);
                    i2.f fVarB = cg.b.f3356a;
                    if (fVarB == null) {
                        i2.e eVar = new i2.e("Rounded.Autorenew", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i13 = h0.f8270a;
                        z0 z0Var = new z0(j);
                        d8.e eVar2 = new d8.e(9);
                        eVar2.x(12.0f, 6.0f);
                        eVar2.H(1.79f);
                        eVar2.o(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
                        eVar2.w(2.79f, -2.79f);
                        eVar2.o(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
                        eVar2.w(-2.79f, -2.79f);
                        eVar2.o(-0.31f, -0.31f, -0.85f, -0.09f, -0.85f, 0.36f);
                        eVar2.v(12.0f, 4.0f);
                        eVar2.o(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
                        eVar2.o(0.0f, 1.04f, 0.2f, 2.04f, 0.57f, 2.95f);
                        eVar2.o(0.27f, 0.67f, 1.13f, 0.85f, 1.64f, 0.34f);
                        eVar2.o(0.27f, -0.27f, 0.38f, -0.68f, 0.23f, -1.04f);
                        eVar2.n(6.15f, 13.56f, 6.0f, 12.79f, 6.0f, 12.0f);
                        eVar2.o(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f);
                        eVar2.k();
                        eVar2.x(17.79f, 8.71f);
                        eVar2.o(-0.27f, 0.27f, -0.38f, 0.69f, -0.23f, 1.04f);
                        eVar2.o(0.28f, 0.7f, 0.44f, 1.46f, 0.44f, 2.25f);
                        eVar2.o(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
                        eVar2.H(-1.79f);
                        eVar2.o(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
                        eVar2.w(-2.79f, 2.79f);
                        eVar2.o(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
                        eVar2.w(2.79f, 2.79f);
                        eVar2.o(0.31f, 0.31f, 0.85f, 0.09f, 0.85f, -0.35f);
                        eVar2.v(12.0f, 20.0f);
                        eVar2.o(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f);
                        eVar2.o(0.0f, -1.04f, -0.2f, -2.04f, -0.57f, -2.95f);
                        eVar2.o(-0.27f, -0.67f, -1.13f, -0.85f, -1.64f, -0.34f);
                        eVar2.k();
                        i2.e.a(eVar, (ArrayList) eVar2.f5001a, z0Var);
                        fVarB = eVar.b();
                        cg.b.f3356a = fVarB;
                    }
                    i2.f fVar2 = fVarB;
                    long j4 = c2.w.f3054d;
                    v1.o oVarK = t1.k(24, v1.l.f17564b);
                    boolean zF = i0Var.f(q2Var);
                    Object objQ = i0Var.Q();
                    if (zF || objQ == fVar) {
                        objQ = new z(q2Var, i12);
                        i0Var.l0(objQ);
                    }
                    a2.b(fVar2, "Rotate icons", e0.q(oVarK, (ej.c) objQ), j4, i0Var, 3120, 0);
                    break;
                }
            case 1:
                x6 x6Var = (x6) obj4;
                s0 s0Var = (s0) obj;
                f1 f1VarY = ((p0) obj2).Y(((s3.a) obj3).f14736a);
                break;
            case 2:
                s0 s0Var2 = (s0) obj;
                p0 p0Var = (p0) obj2;
                fj.l.f(s0Var2, "$this$layout");
                fj.l.f(p0Var, "measurable");
                f1 f1VarY2 = p0Var.Y(((s3.a) obj3).f14736a);
                break;
            case 3:
                ((q0.i) obj4).invoke((Throwable) obj);
                break;
            case 4:
                g1 g1Var = (g1) obj4;
                i0 i0Var2 = (i0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i14 = HomeActivity.N;
                fj.l.f((r1) obj, "$this$TextButton");
                if (!i0Var2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    i0Var2.W();
                    break;
                } else {
                    v7.a(g1Var.g() > 0 ? m6.a.e(g1Var.g(), "I understand (", ")") : "I understand", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var2, 0, 0, 262142);
                    break;
                }
            case 5:
                t1.t tVar = (t1.t) obj4;
                String str = (String) obj;
                Rect rect = (Rect) obj3;
                fj.l.f(str, "pkg");
                fj.l.f((Rect) obj2, "<unused var>");
                fj.l.f(rect, "iconBounds");
                if (nj.l.A0(str, "folder:")) {
                    tVar.put(str, rect);
                    break;
                }
                break;
            case 6:
                ej.e eVar3 = (ej.e) obj4;
                i0 i0Var3 = (i0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                fj.l.f((b0.v) obj, "$this$GlassyBox");
                if (!i0Var3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    i0Var3.W();
                    break;
                } else {
                    eVar3.invoke(i0Var3, 0);
                    break;
                }
            case 7:
                t0.e eVar4 = (t0.e) obj4;
                int iIntValue4 = ((Integer) obj).intValue();
                int iIntValue5 = ((Integer) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                if (!zBooleanValue) {
                    iIntValue4 = eVar4.N.a(iIntValue4);
                }
                if (!zBooleanValue) {
                    iIntValue5 = eVar4.N.a(iIntValue5);
                }
                if (eVar4.M) {
                    long j10 = eVar4.K.f9938b;
                    int i15 = m0.f7144c;
                    if (iIntValue4 != ((int) (j10 >> 32)) || iIntValue5 != ((int) (j10 & 4294967295L))) {
                        if (Math.min(iIntValue4, iIntValue5) < 0 || Math.max(iIntValue4, iIntValue5) > eVar4.K.f9937a.f7081b.length()) {
                            u0 u0Var = eVar4.O;
                            u0Var.t(false);
                            u0Var.q(k0.f9150a);
                        } else {
                            if (zBooleanValue || iIntValue4 == iIntValue5) {
                                u0 u0Var2 = eVar4.O;
                                u0Var2.t(false);
                                u0Var2.q(k0.f9150a);
                            } else {
                                eVar4.O.h(true);
                            }
                            eVar4.L.f9284v.invoke(new l3.t(eVar4.K.f9937a, g3.e0.b(iIntValue4, iIntValue5), (m0) null));
                            z = true;
                        }
                    }
                }
                break;
            case 8:
                u0 u0Var3 = (u0) obj4;
                v1.o oVar2 = (v1.o) obj;
                i0 i0Var4 = (i0) obj2;
                ((Integer) obj3).getClass();
                i0Var4.b0(1980580247);
                s3.c cVar = (s3.c) i0Var4.j(w2.f1.f18262h);
                Object objQ2 = i0Var4.Q();
                if (objQ2 == fVar) {
                    objQ2 = f1.s.A(new s3.l(0L));
                    i0Var4.l0(objQ2);
                }
                a1 a1Var = (a1) objQ2;
                boolean zH = i0Var4.h(u0Var3);
                Object objQ3 = i0Var4.Q();
                if (zH || objQ3 == fVar) {
                    objQ3 = new s3(29, u0Var3, a1Var);
                    i0Var4.l0(objQ3);
                }
                ej.a aVar = (ej.a) objQ3;
                boolean zF2 = i0Var4.f(cVar);
                Object objQ4 = i0Var4.Q();
                if (zF2 || objQ4 == fVar) {
                    objQ4 = new ta.t(cVar, a1Var, i12);
                    i0Var4.l0(objQ4);
                }
                t.m mVar = v0.h0.f17397a;
                v1.o oVarA2 = v1.a.a(oVar2, new ba.b(i11, aVar, (ej.c) objQ4));
                i0Var4.p(false);
                break;
            case 9:
                ej.f fVar3 = (ej.f) obj4;
                String str2 = (String) obj;
                Integer num = (Integer) obj2;
                num.intValue();
                Integer num2 = (Integer) obj3;
                num2.intValue();
                fj.l.f(str2, "packageName");
                if (fVar3 != null) {
                    fVar3.c(str2, num, num2);
                    break;
                }
                break;
            case 10:
                ((ej.c) obj4).invoke(new b2.b(((p2.w) obj2).f12762c));
                break;
            case 11:
                List list = (List) obj4;
                v1.o oVar3 = (v1.o) obj;
                i0 i0Var5 = (i0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                fj.l.f(oVar3, "overscrollModifier");
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= i0Var5.f(oVar3) ? 4 : 2;
                }
                if (!i0Var5.T(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    i0Var5.W();
                    break;
                } else {
                    v1.o oVarV = b0.d.v(oVar3.c(t1.f1433c), 16, 0.0f, 2);
                    float f10 = 32;
                    float f11 = 0;
                    k1 k1Var = new k1(f11, f10, f11, f10);
                    boolean zF3 = i0Var5.f(list);
                    Object objQ5 = i0Var5.Q();
                    if (zF3 || objQ5 == fVar) {
                        objQ5 = new q0.i(list, 17);
                        i0Var5.l0(objQ5);
                    }
                    x8.a.g(0, 506, null, k1Var, null, (ej.c) objQ5, i0Var5, null, null, oVarV, null, false);
                    break;
                }
            case 12:
                yj.c cVar2 = (yj.c) obj4;
                yj.c.A.set(cVar2, null);
                cVar2.e(null);
                break;
            default:
                ((yj.h) obj4).d();
                break;
        }
        return oVar;
    }

    public /* synthetic */ a0(yj.c cVar, yj.b bVar) {
        this.f257a = 12;
        this.f258b = cVar;
    }
}
