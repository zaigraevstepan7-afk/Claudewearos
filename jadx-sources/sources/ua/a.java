package ua;

import c1.v7;
import f1.i0;
import fj.l;
import h8.s;
import pi.o;
import qj.b0;
import qj.m0;
import qj.u1;
import qj.w;
import v.v1;
import vj.n;
import vj.u;
import vj.x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16875a;

    public /* synthetic */ a(int i10) {
        this.f16875a = i10;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f16875a;
        o oVar = o.f13011a;
        switch (i10) {
            case 0:
                i0 i0Var = (i0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    v7.a("Search apps", null, k.f16931b, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 390, 0, 262138);
                } else {
                    i0Var.W();
                }
                return oVar;
            case 1:
                i0 i0Var2 = (i0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (i0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    v7.a("Draw white outlines on empty launcher grid slots.", null, k.f16931b, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var2, 390, 0, 262138);
                } else {
                    i0Var2.W();
                }
                return oVar;
            case 2:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 3:
                return Integer.valueOf(((v1) obj2).f17307a.g());
            case 4:
                i0 i0Var3 = (i0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (i0Var3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    v7.a("Folder Options", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var3, 6, 0, 262142);
                } else {
                    i0Var3.W();
                }
                return oVar;
            case 5:
                i0 i0Var4 = (i0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (i0Var4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    v7.a("Remove passcode protection from this folder?", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var4, 6, 0, 262142);
                } else {
                    i0Var4.W();
                }
                return oVar;
            case 6:
                ti.f fVar = (ti.f) obj2;
                if (!(fVar instanceof u)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue5 = num != null ? num.intValue() : 1;
                return iIntValue5 == 0 ? fVar : Integer.valueOf(iIntValue5 + 1);
            case 7:
                u uVar = (u) obj;
                ti.f fVar2 = (ti.f) obj2;
                if (uVar != null) {
                    return uVar;
                }
                if (fVar2 instanceof u) {
                    return (u) fVar2;
                }
                return null;
            case 8:
                x xVar = (x) obj;
                ti.f fVar3 = (ti.f) obj2;
                if (fVar3 instanceof u) {
                    u uVar2 = (u) fVar3;
                    Object objC = uVar2.c(xVar.f18130a);
                    Object[] objArr = xVar.f18131b;
                    int i11 = xVar.f18133d;
                    objArr[i11] = objC;
                    u[] uVarArr = xVar.f18132c;
                    xVar.f18133d = i11 + 1;
                    uVarArr[i11] = uVar2;
                }
                return xVar;
            case 9:
                i0 i0Var5 = (i0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!i0Var5.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    i0Var5.W();
                }
                return oVar;
            case 10:
                i0 i0Var6 = (i0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (i0Var6.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ha.d.a(false, y8.a.f20236a, i0Var6, 48);
                } else {
                    i0Var6.W();
                }
                return oVar;
            case 11:
                l.f((cl.a) obj, "$this$single");
                l.f((yk.a) obj2, "it");
                u1 u1VarC = b0.c();
                xj.e eVar = m0.f13601a;
                return b0.b(yd.f.W(u1VarC, n.f18117a).V(new s(w.f13631a, 2)));
            default:
                l.f((cl.a) obj, "$this$single");
                l.f((yk.a) obj2, "it");
                return new x9.b(0);
        }
    }
}
