package k0;

import b0.g2;
import c1.s3;
import c1.z2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final f1.j1 f9300a = f1.s.A(null);

    /* renamed from: b, reason: collision with root package name */
    public g3.f f9301b;

    /* renamed from: c, reason: collision with root package name */
    public final t1.q f9302c;

    public u1(g3.f fVar) {
        g3.y yVar = new g3.y(25);
        fVar.getClass();
        g3.c cVar = new g3.c(fVar);
        ArrayList arrayList = cVar.f7042c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            List list = (List) yVar.invoke(((g3.b) arrayList.get(i10)).a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                g3.d dVar = (g3.d) list.get(i11);
                arrayList3.add(new g3.b(dVar.f7045a, dVar.f7046b, dVar.f7047c, dVar.f7048d));
            }
            qi.q.u0(arrayList2, arrayList3);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.f9301b = cVar.e();
        this.f9302c = new t1.q();
    }

    public static g3.d c(g3.d dVar, g3.k0 k0Var) {
        int iC = k0Var.f7129b.c(r3.f7159f - 1, false);
        if (dVar.f7046b < iC) {
            return g3.d.a(dVar, null, Math.min(dVar.f7047c, iC), 11);
        }
        return null;
    }

    public final void a(int i10, f1.i0 i0Var) {
        char c6;
        boolean z2;
        boolean z10;
        Object obj;
        i0Var.c0(1154651354);
        char c10 = 2;
        int i11 = (i0Var.h(this) ? 4 : 2) | i10;
        boolean z11 = false;
        if (i0Var.T(i11 & 1, (i11 & 3) != 2)) {
            w2.n0 n0Var = (w2.n0) i0Var.j(w2.f1.f18272s);
            g3.f fVar = this.f9301b;
            List listA = fVar.a(fVar.f7081b.length());
            int size = listA.size();
            int i12 = 0;
            while (i12 < size) {
                g3.d dVar = (g3.d) listA.get(i12);
                int i13 = dVar.f7046b;
                Object obj2 = dVar.f7045a;
                if (i13 != dVar.f7047c) {
                    i0Var.b0(725478935);
                    Object objQ = i0Var.Q();
                    Object obj3 = f1.m.f6385a;
                    Object objP = objQ;
                    if (objQ == obj3) {
                        objP = t.m1.p(i0Var);
                    }
                    z.k kVar = (z.k) objP;
                    c6 = c10;
                    v1.o oVarQ = c2.e0.q(v1.l.f17564b, new t1(this, dVar));
                    Object objQ2 = i0Var.Q();
                    if (objQ2 == obj3) {
                        z10 = true;
                        Object yVar = new g3.y(26);
                        i0Var.l0(yVar);
                        obj = yVar;
                    } else {
                        z10 = true;
                        obj = objQ2;
                    }
                    v1.o oVarP = v.n.p(d3.p.a(oVarQ, z11, (ej.c) obj).c(new w1(new ac.l(10, this, dVar))), kVar);
                    p2.t.f12755a.getClass();
                    v1.o oVarG = p2.v.g(oVarP, p2.v.f12758c);
                    boolean zH = i0Var.h(this) | i0Var.f(dVar) | i0Var.h(n0Var);
                    Object objQ3 = i0Var.Q();
                    Object obj4 = objQ3;
                    if (zH || objQ3 == obj3) {
                        Object s3Var = new s3(this, dVar, n0Var);
                        i0Var.l0(s3Var);
                        obj4 = s3Var;
                    }
                    b0.r.a(v.n.m(oVarG, kVar, null, null, (ej.a) obj4, 508), i0Var, 0);
                    g3.l lVar = (g3.l) obj2;
                    g3.l0 l0VarA = lVar.a();
                    if (l0VarA == null || (l0VarA.f7134a == null && l0VarA.f7135b == null && l0VarA.f7136c == null && l0VarA.f7137d == null)) {
                        z2 = false;
                        i0Var.b0(728331710);
                        i0Var.p(false);
                    } else {
                        i0Var.b0(726303039);
                        Object objQ4 = i0Var.Q();
                        Object obj5 = objQ4;
                        if (objQ4 == obj3) {
                            Object u0Var = new u0(kVar);
                            i0Var.l0(u0Var);
                            obj5 = u0Var;
                        }
                        u0 u0Var2 = (u0) obj5;
                        Object objQ5 = i0Var.Q();
                        boolean z12 = false;
                        Object obj6 = objQ5;
                        if (objQ5 == obj3) {
                            Object z2Var = new z2(u0Var2, z12 ? 1 : 0, 7);
                            i0Var.l0(z2Var);
                            obj6 = z2Var;
                        }
                        f1.s.f((ej.e) obj6, i0Var, pi.o.f13011a);
                        f1.g1 g1Var = u0Var2.f9299b;
                        f1.g1 g1Var2 = u0Var2.f9299b;
                        Boolean boolValueOf = Boolean.valueOf((g1Var.g() & 2) != 0 ? z10 : false);
                        Boolean boolValueOf2 = Boolean.valueOf((g1Var2.g() & 1) != 0 ? z10 : false);
                        Boolean boolValueOf3 = Boolean.valueOf((g1Var2.g() & 4) != 0 ? z10 : false);
                        g3.l0 l0VarA2 = lVar.a();
                        g3.f0 f0Var = l0VarA2 != null ? l0VarA2.f7134a : null;
                        g3.l0 l0VarA3 = lVar.a();
                        g3.f0 f0Var2 = l0VarA3 != null ? l0VarA3.f7135b : null;
                        g3.l0 l0VarA4 = lVar.a();
                        g3.f0 f0Var3 = l0VarA4 != null ? l0VarA4.f7136c : null;
                        g3.l0 l0VarA5 = lVar.a();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, f0Var, f0Var2, f0Var3, l0VarA5 != null ? l0VarA5.f7137d : null};
                        boolean zH2 = i0Var.h(this) | i0Var.f(dVar);
                        Object objQ6 = i0Var.Q();
                        Object obj7 = objQ6;
                        if (zH2 || objQ6 == obj3) {
                            Object t1Var = new t1(this, dVar, u0Var2);
                            i0Var.l0(t1Var);
                            obj7 = t1Var;
                        }
                        b(objArr, (ej.c) obj7, i0Var, (i11 << 6) & 896);
                        z2 = false;
                        i0Var.p(false);
                    }
                    i0Var.p(z2);
                } else {
                    c6 = c10;
                    z2 = z11;
                    i0Var.b0(728345598);
                    i0Var.p(z2);
                }
                i12++;
                z11 = z2;
                c10 = c6;
            }
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new g2(i10, 16, this);
        }
    }

    public final void b(Object[] objArr, ej.c cVar, f1.i0 i0Var, int i10) {
        i0Var.c0(-2083052099);
        int i11 = (i10 & 48) == 0 ? (i0Var.h(cVar) ? 32 : 16) | i10 : i10;
        if ((i10 & 384) == 0) {
            i11 |= i0Var.h(this) ? 256 : 128;
        }
        i0Var.X(Integer.valueOf(objArr.length), -358306546, 0, null);
        int i12 = i11 | (i0Var.d(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i12 |= i0Var.h(obj) ? 4 : 0;
        }
        i0Var.p(false);
        if ((i12 & 14) == 0) {
            i12 |= 2;
        }
        if (i0Var.T(i12 & 1, (i12 & 147) != 146)) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(cVar);
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
            }
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zH = i0Var.h(this) | ((i12 & 112) == 32);
            Object objQ = i0Var.Q();
            if (zH || objQ == f1.m.f6385a) {
                objQ = new l(this, cVar, 1);
                i0Var.l0(objQ);
            }
            f1.s.e(array, (ej.c) objQ, i0Var);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new b6.e(this, objArr, cVar, i10, 4);
        }
    }
}
