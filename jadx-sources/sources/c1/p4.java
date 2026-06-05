package c1;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.anonlab.voidlauncher.R;
import com.anonlab.voidlauncher.core.data.db.displayables.source.DisplayablesDatabase;
import com.google.android.gms.internal.ads.zzbch;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class p4 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2579a;

    public /* synthetic */ p4(int i10) {
        this.f2579a = i10;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) throws e8.b {
        switch (this.f2579a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                cl.a aVar = (cl.a) obj;
                fj.l.f(aVar, "$this$single");
                fj.l.f((yk.a) obj2, "it");
                hj.a.j(aVar);
                d9.a aVar2 = new d9.a();
                tj.i0.a(0, 7, null);
                break;
            case 10:
                cl.a aVar3 = (cl.a) obj;
                fj.l.f(aVar3, "$this$single");
                fj.l.f((yk.a) obj2, "it");
                break;
            case 11:
                cl.a aVar4 = (cl.a) obj;
                fj.l.f(aVar4, "$this$single");
                fj.l.f((yk.a) obj2, "it");
                u6.q qVarK = u1.b.k(hj.a.j(aVar4), DisplayablesDatabase.class, "displayables_database");
                qVarK.f16780p = false;
                qVarK.f16781q = true;
                qVarK.f16782r = true;
                break;
            case 12:
                cl.a aVar5 = (cl.a) obj;
                fj.l.f(aVar5, "$this$single");
                fj.l.f((yk.a) obj2, "it");
                break;
            case 13:
                cl.a aVar6 = (cl.a) obj;
                fj.l.f(aVar6, "$this$single");
                fj.l.f((yk.a) obj2, "it");
                break;
            case 14:
                cl.a aVar7 = (cl.a) obj;
                fj.l.f(aVar7, "$this$single");
                fj.l.f((yk.a) obj2, "it");
                break;
            case 15:
                f1.i0 i0Var = (f1.i0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    v7.a("Rain Playground", null, 0L, 0L, k3.s.A, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 1572870, 0, 262078);
                } else {
                    i0Var.W();
                }
                break;
            case 16:
                f1.i0 i0Var2 = (f1.i0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (i0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    a2.b(u1.b.o(), "Back", null, 0L, i0Var2, 48, 12);
                } else {
                    i0Var2.W();
                }
                break;
            case 17:
                d0.u uVar = (d0.u) obj2;
                break;
            case 18:
                f1.i0 i0Var3 = (f1.i0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (i0Var3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x8.a.f('\uea80', null, hj.a.x(25), c2.w.f3054d, i0Var3, 3456, 2);
                } else {
                    i0Var3.W();
                }
                break;
            case 19:
                f1.i0 i0Var4 = (f1.i0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (i0Var4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    v1.o oVarV = b0.d.v(v1.l.f17564b, 14, 0.0f, 2);
                    b0.q1 q1VarA = b0.o1.a(b0.j.g(6), v1.b.D, i0Var4, 54);
                    int iHashCode = Long.hashCode(i0Var4.T);
                    f1.n1 n1VarL = i0Var4.l();
                    v1.o oVarC = v1.a.c(i0Var4, oVarV);
                    v2.h.f17668w.getClass();
                    v2.f fVar = v2.g.f17645b;
                    i0Var4.e0();
                    if (i0Var4.S) {
                        i0Var4.k(fVar);
                    } else {
                        i0Var4.o0();
                    }
                    f1.s.M(v2.g.f17649f, i0Var4, q1VarA);
                    f1.s.M(v2.g.f17648e, i0Var4, n1VarL);
                    f1.s.w(i0Var4, Integer.valueOf(iHashCode), v2.g.f17650g);
                    f1.s.I(v2.g.f17651h, i0Var4);
                    f1.s.M(v2.g.f17647d, i0Var4, oVarC);
                    long jX = hj.a.x(20);
                    long j = c2.w.f3054d;
                    x8.a.f('\uec72', null, jX, j, i0Var4, 3456, 2);
                    v7.a("Dev", null, j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var4, 390, 0, 262138);
                    i0Var4.p(true);
                } else {
                    i0Var4.W();
                }
                break;
            case 20:
                f1.i0 i0Var5 = (f1.i0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (i0Var5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x8.a.f('\uea7e', null, hj.a.x(24), c2.w.f3054d, i0Var5, 3456, 2);
                } else {
                    i0Var5.W();
                }
                break;
            case zzbch.zzt.zzm /* 21 */:
                ((Integer) obj2).getClass();
                break;
            case 22:
                e0.v vVar = (e0.v) obj2;
                break;
            case 23:
                ((Integer) obj2).getClass();
                x8.a.b(f1.s.O(7), (f1.i0) obj);
                break;
            case 24:
                Map mapC = ((f0.x0) obj2).c();
                if (mapC.isEmpty()) {
                }
                break;
            case 25:
                ((Integer) obj2).getClass();
                wd.a.i(f1.s.O(49), (f1.i0) obj);
                break;
            case 26:
                ((Integer) obj2).getClass();
                wd.a.f(f1.s.O(49), (f1.i0) obj);
                break;
            case 27:
                f1.i0 i0Var6 = (f1.i0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (i0Var6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    Context context = (Context) i0Var6.j(AndroidCompositionLocals_androidKt.f838b);
                    fj.l.f(context, "context");
                    SharedPreferences sharedPreferences = context.getSharedPreferences("home_launcher_settings", 0);
                    fj.l.e(sharedPreferences, "getSharedPreferences(...)");
                    ti.c cVar = null;
                    String string = sharedPreferences.getString("wallpaper_uri", null);
                    Uri uri = string != null ? Uri.parse(string) : null;
                    boolean zH = i0Var6.h(uri) | i0Var6.h(context);
                    Object objQ = i0Var6.Q();
                    if (zH || objQ == f1.m.f6385a) {
                        objQ = new ab.q(uri, context, cVar, 4);
                        i0Var6.l0(objQ);
                    }
                    f1.a1 a1VarD = f1.s.D(null, uri, (ej.e) objQ, i0Var6, 6);
                    if (uri != null && ((c2.g) a1VarD.getValue()) == null) {
                        i0Var6.b0(-1750524640);
                        b0.i0 i0Var7 = b0.t1.f1433c;
                        t2.q0 q0VarD = b0.r.d(v1.b.f17551e, false);
                        int iHashCode2 = Long.hashCode(i0Var6.T);
                        f1.n1 n1VarL2 = i0Var6.l();
                        v1.o oVarC2 = v1.a.c(i0Var6, i0Var7);
                        v2.h.f17668w.getClass();
                        v2.f fVar2 = v2.g.f17645b;
                        i0Var6.e0();
                        if (i0Var6.S) {
                            i0Var6.k(fVar2);
                        } else {
                            i0Var6.o0();
                        }
                        f1.s.M(v2.g.f17649f, i0Var6, q0VarD);
                        f1.s.M(v2.g.f17648e, i0Var6, n1VarL2);
                        f1.s.w(i0Var6, Integer.valueOf(iHashCode2), v2.g.f17650g);
                        f1.s.I(v2.g.f17651h, i0Var6);
                        f1.s.M(v2.g.f17647d, i0Var6, oVarC2);
                        x4.a(null, 0L, 0.0f, 0L, 0, 0.0f, i0Var6, 0, 63);
                        i0Var6.p(true);
                        i0Var6.p(false);
                    } else if (((c2.g) a1VarD.getValue()) != null) {
                        i0Var6.b0(-1750232310);
                        c2.g gVar = (c2.g) a1VarD.getValue();
                        fj.l.c(gVar);
                        fb.b.a(new h2.a(gVar), i0Var6, 8);
                        i0Var6.p(false);
                    } else {
                        i0Var6.b0(-1749993765);
                        fb.b.a(yd.f.V(R.drawable.img_home_background, i0Var6), i0Var6, 8);
                        i0Var6.p(false);
                    }
                } else {
                    i0Var6.W();
                }
                break;
            case 28:
                f1.i0 i0Var8 = (f1.i0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (i0Var8.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ha.d.a(false, fb.b.f6660a, i0Var8, 48);
                } else {
                    i0Var8.W();
                }
                break;
            default:
                e2.d dVar = (e2.d) obj;
                ej.c cVar2 = (ej.c) obj2;
                fj.l.f(dVar, "<this>");
                fj.l.f(cVar2, "it");
                cVar2.invoke(dVar);
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ p4(int i10, int i11) {
        this.f2579a = i11;
    }
}
