package lb;

import android.graphics.Bitmap;
import android.graphics.Rect;
import c1.v7;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class m2 implements ej.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10476a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10477b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10478c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10479d;

    public /* synthetic */ m2(Object obj, Object obj2, Object obj3, int i10) {
        this.f10476a = i10;
        this.f10477b = obj;
        this.f10478c = obj2;
        this.f10479d = obj3;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        switch (this.f10476a) {
            case 0:
                String str = (String) this.f10477b;
                ej.c cVar = (ej.c) this.f10478c;
                List list = (List) this.f10479d;
                f1.i0 i0Var = (f1.i0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                fj.l.f((d0.c) obj, "$this$item");
                if (i0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    q3.l("INSTALLED ICON PACKS", i0Var, 6);
                    q3.j(0L, p1.j.d(1266459248, new m2(str, cVar, list, 1), i0Var), i0Var, 48);
                } else {
                    i0Var.W();
                }
                return pi.o.f13011a;
            case 1:
                String str2 = (String) this.f10477b;
                ej.c cVar2 = (ej.c) this.f10478c;
                List list2 = (List) this.f10479d;
                f1.i0 i0Var2 = (f1.i0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                fj.l.f((b0.c0) obj, "$this$MSCard");
                if (i0Var2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean z2 = str2 == null;
                    boolean zF = i0Var2.f(cVar2);
                    Object objQ = i0Var2.Q();
                    Object obj4 = f1.m.f6385a;
                    if (zF || objQ == obj4) {
                        objQ = new db.g(cVar2, 2);
                        i0Var2.l0(objQ);
                    }
                    q3.g("Default", "Use app icons", null, z2, (ej.a) objQ, i0Var2, 438);
                    if (list2.isEmpty()) {
                        i0Var2.b0(2095138802);
                    } else {
                        i0Var2.b0(1591605435);
                        q3.k(0, i0Var2);
                    }
                    i0Var2.p(false);
                    i0Var2.b0(1591607298);
                    int i10 = 0;
                    for (Object obj5 : list2) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            yd.f.i0();
                            throw null;
                        }
                        s sVar = (s) obj5;
                        String str3 = sVar.f10635b;
                        String str4 = sVar.f10634a;
                        Bitmap bitmap = sVar.f10636c;
                        boolean zEquals = str4.equals(str2);
                        boolean zF2 = i0Var2.f(cVar2) | i0Var2.h(sVar);
                        Object objQ2 = i0Var2.Q();
                        if (zF2 || objQ2 == obj4) {
                            objQ2 = new c1.s3(13, cVar2, sVar);
                            i0Var2.l0(objQ2);
                        }
                        q3.g(str3, str4, bitmap, zEquals, (ej.a) objQ2, i0Var2, 0);
                        if (i10 != yd.f.B(list2)) {
                            i0Var2.b0(298323282);
                            q3.k(0, i0Var2);
                        } else {
                            i0Var2.b0(658097723);
                        }
                        i0Var2.p(false);
                        i10 = i11;
                    }
                    i0Var2.p(false);
                    if (list2.isEmpty()) {
                        i0Var2.b0(2095752385);
                        q3.k(0, i0Var2);
                        v7.a("No installed icon packs found", b0.d.u(v1.l.f17564b, 16, 14), q3.f10600d, hj.a.x(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var2, 25014, 0, 262120);
                        i0Var2.p(false);
                    } else {
                        i0Var2.b0(2096106994);
                        i0Var2.p(false);
                    }
                } else {
                    i0Var2.W();
                }
                return pi.o.f13011a;
            default:
                t1.t tVar = (t1.t) this.f10477b;
                t1.t tVar2 = (t1.t) this.f10478c;
                ej.f fVar = (ej.f) this.f10479d;
                String str5 = (String) obj;
                Rect rect = (Rect) obj2;
                Rect rect2 = (Rect) obj3;
                fj.l.f(str5, "packageName");
                fj.l.f(rect, "itemBounds");
                fj.l.f(rect2, "iconBounds");
                tVar.put(str5, rect);
                tVar2.put(str5, rect2);
                if (fVar != null) {
                    fVar.c(str5, rect, rect2);
                }
                return pi.o.f13011a;
        }
    }
}
