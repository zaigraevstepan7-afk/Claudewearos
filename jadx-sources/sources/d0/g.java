package d0;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import b0.b0;
import b0.t1;
import b0.z;
import c1.v7;
import c1.x4;
import f1.f1;
import f1.i0;
import f1.n1;
import k3.d0;
import k3.e0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements ej.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4357a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4358b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f4357a = i10;
        this.f4358b = obj;
    }

    @Override // ej.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f4357a) {
            case 0:
                p1.e eVar = (p1.e) this.f4358b;
                c cVar = (c) obj;
                ((Integer) obj2).getClass();
                i0 i0Var = (i0) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= i0Var.f(cVar) ? 4 : 2;
                }
                if (i0Var.T(iIntValue & 1, (iIntValue & 131) != 130)) {
                    eVar.c(cVar, i0Var, Integer.valueOf(iIntValue & 14));
                } else {
                    i0Var.W();
                }
                return pi.o.f13011a;
            case 1:
                f7.g gVar = (f7.g) this.f4358b;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                fj.l.c(sQLiteQuery);
                gVar.e(new g7.h(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
            case 2:
                f1 f1Var = (f1) this.f4358b;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                i0 i0Var2 = (i0) obj3;
                ((Integer) obj4).getClass();
                fj.l.f((s.m) obj, "$this$AnimatedContent");
                if (zBooleanValue) {
                    i0Var2.b0(904263644);
                    v1.e eVar2 = v1.b.F;
                    v1.l lVar = v1.l.f17564b;
                    v1.o oVarV = b0.d.v(lVar, 24, 0.0f, 2);
                    b0 b0VarA = z.a(b0.j.f1361c, eVar2, i0Var2, 48);
                    int iHashCode = Long.hashCode(i0Var2.T);
                    n1 n1VarL = i0Var2.l();
                    v1.o oVarC = v1.a.c(i0Var2, oVarV);
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
                    Object objQ = i0Var2.Q();
                    if (objQ == f1.m.f6385a) {
                        objQ = new fb.c(f1Var, 17);
                        i0Var2.l0(objQ);
                    }
                    ej.a aVar = (ej.a) objQ;
                    float f10 = 4;
                    v1.o oVarC2 = z1.h.c(t1.e(f10, t1.c(1.0f, lVar)), j0.e.f8605a);
                    long j = c2.w.f3054d;
                    x4.b(aVar, oVarC2, j, c2.w.c(j, 0.3f), 1, 0.0f, null, i0Var2, 3462);
                    b0.d.e(i0Var2, t1.e(f10, lVar));
                    v7.a(m6.a.e((int) (f1Var.g() * 100), "Downloading... ", "%"), null, j, hj.a.x(12), k3.s.f9400z, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var2, 1597824, 0, 262058);
                    i0Var2.p(true);
                    i0Var2.p(false);
                } else {
                    i0Var2.b0(905488299);
                    v7.a("Download & install", null, c2.w.f3054d, hj.a.x(17), k3.s.A, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var2, 1597830, 0, 262058);
                    i0Var2.p(false);
                }
                return pi.o.f13011a;
            default:
                o3.c cVar2 = (o3.c) this.f4358b;
                e0 e0VarB = ((k3.k) cVar2.f12399e).b((k3.j) obj, (k3.s) obj2, ((k3.o) obj3).f9392a, ((k3.p) obj4).f9393a);
                if (e0VarB instanceof d0) {
                    Object obj5 = ((d0) e0VarB).f9373a;
                    fj.l.d(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
                    return (Typeface) obj5;
                }
                ac.d dVar = new ac.d(e0VarB, cVar2.C);
                cVar2.C = dVar;
                Object obj6 = dVar.f375d;
                fj.l.d(obj6, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) obj6;
        }
    }
}
