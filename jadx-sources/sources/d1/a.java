package d1;

import b0.r1;
import b0.t1;
import c1.v7;
import com.google.android.gms.internal.ads.zzbch;
import lb.q3;
import t2.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ej.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4464a;

    public /* synthetic */ a(int i10) {
        this.f4464a = i10;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        switch (this.f4464a) {
            case 0:
                t2.s0 s0Var = (t2.s0) obj;
                final int iI0 = s0Var.I0(c.f4478a);
                int i10 = iI0 * 2;
                final f1 f1VarY = ((t2.p0) obj2).Y(s3.b.i(i10, ((s3.a) obj3).f14736a, 0));
                final int i11 = 1;
                break;
            case 1:
                t2.s0 s0Var2 = (t2.s0) obj;
                final int iI02 = s0Var2.I0(c.f4479b);
                int i12 = iI02 * 2;
                final int i13 = 0;
                final f1 f1VarY2 = ((t2.p0) obj2).Y(s3.b.i(0, ((s3.a) obj3).f14736a, i12));
                break;
            case 2:
                ej.e eVar = (ej.e) obj;
                f1.i0 i0Var = (f1.i0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= i0Var.h(eVar) ? 4 : 2;
                }
                if (i0Var.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    eVar.invoke(i0Var, Integer.valueOf(iIntValue & 14));
                } else {
                    i0Var.W();
                }
                break;
            case 3:
                f1.i0 i0Var2 = (f1.i0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                fj.l.f((r1) obj, "$this$TextButton");
                if (i0Var2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    v7.a("Restart app", null, c2.e0.d(4294916912L), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var2, 390, 0, 262138);
                } else {
                    i0Var2.W();
                }
                break;
            case 4:
                f1.i0 i0Var3 = (f1.i0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                fj.l.f((r1) obj, "$this$TextButton");
                if (i0Var3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    v7.a("Cancel", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var3, 6, 0, 262142);
                } else {
                    i0Var3.W();
                }
                break;
            case 5:
                f1.i0 i0Var4 = (f1.i0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                fj.l.f((r1) obj, "$this$TextButton");
                if (i0Var4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    v7.a("Set up Passcode", null, q3.f10601e, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var4, 390, 0, 262138);
                } else {
                    i0Var4.W();
                }
                break;
            case 6:
                f1.i0 i0Var5 = (f1.i0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                fj.l.f((r1) obj, "$this$TextButton");
                if (i0Var5.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    v7.a("Restart app", null, c2.e0.d(4294916912L), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var5, 390, 0, 262138);
                } else {
                    i0Var5.W();
                }
                break;
            case 7:
                f1.i0 i0Var6 = (f1.i0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                fj.l.f((r1) obj, "$this$TextButton");
                if (i0Var6.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    v7.a("Cancel", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var6, 6, 0, 262142);
                } else {
                    i0Var6.W();
                }
                break;
            case 8:
                f1.i0 i0Var7 = (f1.i0) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                fj.l.f((r1) obj, "$this$TextButton");
                if (i0Var7.T(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    v7.a("Watch ad", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var7, 6, 0, 262142);
                } else {
                    i0Var7.W();
                }
                break;
            case 9:
                f1.i0 i0Var8 = (f1.i0) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                fj.l.f((r1) obj, "$this$TextButton");
                if (i0Var8.T(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    v7.a("Nop, close", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var8, 6, 0, 262142);
                } else {
                    i0Var8.W();
                }
                break;
            case 10:
                f1.i0 i0Var9 = (f1.i0) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                fj.l.f((b0.c0) obj, "$this$LiquidBottomTab");
                if (i0Var9.T(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    x8.a.f('\ueca6', null, hj.a.x(20), c2.w.f3054d, i0Var9, 3456, 2);
                } else {
                    i0Var9.W();
                }
                break;
            case 11:
                f1.i0 i0Var10 = (f1.i0) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                fj.l.f((b0.c0) obj, "$this$LiquidBottomTab");
                if (i0Var10.T(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    x8.a.f('\uec49', null, hj.a.x(20), c2.w.c(c2.w.f3054d, 0.5f), i0Var10, 3456, 2);
                } else {
                    i0Var10.W();
                }
                break;
            case 12:
                f1.i0 i0Var11 = (f1.i0) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                fj.l.f((b0.c0) obj, "$this$LiquidBottomTab");
                if (i0Var11.T(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    x8.a.f('\uec04', null, hj.a.x(20), c2.w.c(c2.w.f3054d, 0.5f), i0Var11, 3456, 2);
                } else {
                    i0Var11.W();
                }
                break;
            case 13:
                r1 r1Var = (r1) obj;
                f1.i0 i0Var12 = (f1.i0) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                fj.l.f(r1Var, "$this$LiquidBottomTabs");
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= i0Var12.f(r1Var) ? 4 : 2;
                }
                if (i0Var12.T(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    Object objQ = i0Var12.Q();
                    f1.f fVar = f1.m.f6385a;
                    if (objQ == fVar) {
                        objQ = new b6.j(19);
                        i0Var12.l0(objQ);
                    }
                    int i14 = (iIntValue12 & 14) | 3120;
                    gb.a.a(r1Var, (ej.a) objQ, null, lb.c.f10178p, i0Var12, i14);
                    Object objQ2 = i0Var12.Q();
                    if (objQ2 == fVar) {
                        objQ2 = new b6.j(19);
                        i0Var12.l0(objQ2);
                    }
                    gb.a.a(r1Var, (ej.a) objQ2, null, lb.c.f10179q, i0Var12, i14);
                    Object objQ3 = i0Var12.Q();
                    if (objQ3 == fVar) {
                        objQ3 = new b6.j(19);
                        i0Var12.l0(objQ3);
                    }
                    gb.a.a(r1Var, (ej.a) objQ3, null, lb.c.f10180r, i0Var12, i14);
                } else {
                    i0Var12.W();
                }
                break;
            case 14:
                f1.i0 i0Var13 = (f1.i0) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                fj.l.f((r1) obj, "$this$TextButton");
                if (i0Var13.T(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    v7.a("Remove Passcode", null, c2.w.f3055e, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var13, 390, 0, 262138);
                } else {
                    i0Var13.W();
                }
                break;
            case 15:
                f1.i0 i0Var14 = (f1.i0) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                fj.l.f((r1) obj, "$this$TextButton");
                if (i0Var14.T(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    v7.a("Set Passcode", null, q3.f10601e, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var14, 390, 0, 262138);
                } else {
                    i0Var14.W();
                }
                break;
            case 16:
                f1.i0 i0Var15 = (f1.i0) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                fj.l.f((r1) obj, "$this$TextButton");
                if (i0Var15.T(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    v7.a("Unlock", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var15, 6, 0, 262142);
                } else {
                    i0Var15.W();
                }
                break;
            case 17:
                f1.i0 i0Var16 = (f1.i0) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                fj.l.f((r1) obj, "$this$TextButton");
                if (i0Var16.T(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    v7.a("Cancel", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var16, 6, 0, 262142);
                } else {
                    i0Var16.W();
                }
                break;
            case 18:
                f1.i0 i0Var17 = (f1.i0) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                fj.l.f((r1) obj, "$this$TextButton");
                if (i0Var17.T(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    v7.a("Reset All", null, c2.e0.d(4292030255L), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var17, 390, 0, 262138);
                } else {
                    i0Var17.W();
                }
                break;
            case 19:
                f1.i0 i0Var18 = (f1.i0) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                fj.l.f((r1) obj, "$this$TextButton");
                if (i0Var18.T(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    v7.a("Cancel", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var18, 6, 0, 262142);
                } else {
                    i0Var18.W();
                }
                break;
            case 20:
                f1.i0 i0Var19 = (f1.i0) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                fj.l.f((r1) obj, "$this$TextButton");
                if (i0Var19.T(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    v7.a("Continue", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var19, 6, 0, 262142);
                } else {
                    i0Var19.W();
                }
                break;
            case zzbch.zzt.zzm /* 21 */:
                f1.i0 i0Var20 = (f1.i0) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                fj.l.f((r1) obj, "$this$TextButton");
                if (i0Var20.T(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    v7.a("Cancel", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var20, 6, 0, 262142);
                } else {
                    i0Var20.W();
                }
                break;
            case 22:
                f1.i0 i0Var21 = (f1.i0) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                fj.l.f((r1) obj, "$this$TextButton");
                if (i0Var21.T(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    v7.a("Close", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var21, 6, 0, 262142);
                } else {
                    i0Var21.W();
                }
                break;
            case 23:
                f1.i0 i0Var22 = (f1.i0) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                fj.l.f((r1) obj, "$this$TextButton");
                if (i0Var22.T(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    v7.a("Close", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var22, 6, 0, 262142);
                } else {
                    i0Var22.W();
                }
                break;
            case 24:
                f1.i0 i0Var23 = (f1.i0) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                fj.l.f((r1) obj, "$this$TextButton");
                if (i0Var23.T(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    v7.a("Update", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var23, 6, 0, 262142);
                } else {
                    i0Var23.W();
                }
                break;
            case 25:
                f1.i0 i0Var24 = (f1.i0) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                fj.l.f((r1) obj, "$this$TextButton");
                if (i0Var24.T(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    v7.a("OK", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var24, 6, 0, 262142);
                } else {
                    i0Var24.W();
                }
                break;
            case 26:
                f1.i0 i0Var25 = (f1.i0) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                fj.l.f((r1) obj, "$this$TextButton");
                if (i0Var25.T(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    v7.a("Delete Passcode", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var25, 6, 0, 262142);
                } else {
                    i0Var25.W();
                }
                break;
            case 27:
                f1.i0 i0Var26 = (f1.i0) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                fj.l.f((r1) obj, "$this$TextButton");
                if (i0Var26.T(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    v7.a("Cancel", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var26, 6, 0, 262142);
                } else {
                    i0Var26.W();
                }
                break;
            default:
                w.c cVar = (w.c) obj;
                f1.i0 i0Var27 = (f1.i0) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                if ((iIntValue27 & 6) == 0) {
                    iIntValue27 |= i0Var27.f(cVar) ? 4 : 2;
                }
                if (i0Var27.T(iIntValue27 & 1, (iIntValue27 & 19) != 18)) {
                    b0.r.a(v.n.f(t1.e(w.e.f18157k, t1.c(1.0f, b0.d.v(v1.l.f17564b, 0.0f, w.e.f18158l, 1))), cVar.f18144c, c2.e0.f2986b), i0Var27, 0);
                } else {
                    i0Var27.W();
                }
                break;
        }
        return pi.o.f13011a;
    }
}
