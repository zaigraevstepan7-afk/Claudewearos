package f0;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c1.b8;
import c1.p4;
import c1.s3;
import c1.z3;
import com.anonlab.voidlauncher.R;
import f1.j1;
import f1.q1;
import f1.t1;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import t2.p1;
import x.o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final bk.b f6175a = new bk.b(2);

    public static final void a(final ej.a aVar, final v1.o oVar, final o0 o0Var, final f0 f0Var, f1.i0 i0Var, final int i10) {
        i0Var.c0(1055276397);
        int i11 = (i0Var.h(aVar) ? 4 : 2) | i10 | (i0Var.f(oVar) ? 32 : 16) | (i0Var.f(o0Var) ? 256 : 128) | (i0Var.f(f0Var) ? 2048 : 1024);
        if (i0Var.T(i11 & 1, (i11 & 1171) != 1170)) {
            final f1.a1 a1VarK = f1.s.K(aVar, i0Var);
            c(p1.j.d(-933153643, new ej.f() { // from class: f0.c0
                @Override // ej.f
                public final Object c(Object obj, Object obj2, Object obj3) {
                    v1.o oVarC;
                    s1.b bVar = (s1.b) obj;
                    f1.i0 i0Var2 = (f1.i0) obj2;
                    ((Integer) obj3).getClass();
                    Object objQ = i0Var2.Q();
                    f1.f fVar = f1.m.f6385a;
                    if (objQ == fVar) {
                        objQ = new a0(bVar, new b8(a1VarK, 4));
                        i0Var2.l0(objQ);
                    }
                    final a0 a0Var = (a0) objQ;
                    Object objQ2 = i0Var2.Q();
                    if (objQ2 == fVar) {
                        objQ2 = new p1(new mh.g(a0Var));
                        i0Var2.l0(objQ2);
                    }
                    final p1 p1Var = (p1) objQ2;
                    final o0 o0Var2 = o0Var;
                    if (o0Var2 != null) {
                        i0Var2.b0(1743490539);
                        i0Var2.b0(887527095);
                        final b1 b1Var = d1.f6128a;
                        if (b1Var != null) {
                            i0Var2.b0(1345554384);
                        } else {
                            i0Var2.b0(1345603457);
                            View view = (View) i0Var2.j(AndroidCompositionLocals_androidKt.f842f);
                            boolean zF = i0Var2.f(view);
                            Object objQ3 = i0Var2.Q();
                            if (zF || objQ3 == fVar) {
                                Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                                objQ3 = tag instanceof b1 ? (b1) tag : null;
                                if (objQ3 == null) {
                                    objQ3 = new b(view);
                                    view.setTag(R.id.compose_prefetch_scheduler, objQ3);
                                }
                                i0Var2.l0(objQ3);
                            }
                            b1Var = (b1) objQ3;
                        }
                        i0Var2.p(false);
                        i0Var2.p(false);
                        Object[] objArr = {o0Var2, a0Var, p1Var, b1Var};
                        boolean zF2 = i0Var2.f(o0Var2) | i0Var2.h(a0Var) | i0Var2.h(p1Var) | i0Var2.h(b1Var);
                        Object objQ4 = i0Var2.Q();
                        if (zF2 || objQ4 == fVar) {
                            objQ4 = new ej.c() { // from class: f0.e0
                                @Override // ej.c
                                public final Object invoke(Object obj4) {
                                    a1 a1Var = new a1();
                                    a1Var.f6105b = a0Var;
                                    a1Var.f6106c = p1Var;
                                    a1Var.f6107d = b1Var;
                                    a1Var.f6104a = true;
                                    o0 o0Var3 = o0Var2;
                                    o0Var3.f6178c = a1Var;
                                    return new z3(o0Var3, 4);
                                }
                            };
                            i0Var2.l0(objQ4);
                        }
                        f1.s.e(objArr, (ej.c) objQ4, i0Var2);
                        i0Var2.p(false);
                    } else {
                        i0Var2.b0(1744076749);
                        i0Var2.p(false);
                    }
                    int i12 = p0.f6182a;
                    v1.o oVar2 = oVar;
                    if (o0Var2 != null && (oVarC = oVar2.c(new g1(o0Var2))) != null) {
                        oVar2 = oVarC;
                    }
                    boolean zF3 = i0Var2.f(a0Var);
                    f0 f0Var2 = f0Var;
                    boolean zF4 = zF3 | i0Var2.f(f0Var2);
                    Object objQ5 = i0Var2.Q();
                    if (zF4 || objQ5 == fVar) {
                        objQ5 = new ab.g(7, a0Var, f0Var2);
                        i0Var2.l0(objQ5);
                    }
                    t2.z.a(p1Var, oVar2, (ej.e) objQ5, i0Var2, 8);
                    return pi.o.f13011a;
                }
            }, i0Var), i0Var, 6);
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e(oVar, o0Var, f0Var, i10) { // from class: f0.d0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ v1.o f6125b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ o0 f6126c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ f0 f6127d;

                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iO = f1.s.O(1);
                    o.a(this.f6124a, this.f6125b, this.f6126c, this.f6127d, (f1.i0) obj, iO);
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void b(Object obj, int i10, l0 l0Var, p1.e eVar, f1.i0 i0Var, int i11) {
        int i12;
        i0Var.c0(872548579);
        if ((i11 & 6) == 0) {
            i12 = (i0Var.h(obj) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= i0Var.d(i10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= i0Var.h(l0Var) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= i0Var.h(eVar) ? 2048 : 1024;
        }
        if (i0Var.T(i12 & 1, (i12 & 1171) != 1170)) {
            boolean zF = i0Var.f(obj) | i0Var.f(l0Var);
            Object objQ = i0Var.Q();
            Object obj2 = f1.m.f6385a;
            if (zF || objQ == obj2) {
                objQ = new k0(obj, l0Var);
                i0Var.l0(objQ);
            }
            k0 k0Var = (k0) objQ;
            k0Var.f6158c = i10;
            j1 j1Var = k0Var.f6162g;
            q1 q1Var = t2.d1.f15532a;
            k0 k0Var2 = (k0) i0Var.j(q1Var);
            t1.g gVarF = t1.r.f();
            ej.c cVarE = gVarF != null ? gVarF.e() : null;
            t1.g gVarK = t1.r.k(gVarF);
            try {
                if (k0Var2 != ((k0) j1Var.getValue())) {
                    j1Var.setValue(k0Var2);
                    if (k0Var.f6159d > 0) {
                        k0 k0Var3 = k0Var.f6160e;
                        if (k0Var3 != null) {
                            k0Var3.b();
                        }
                        if (k0Var2 != null) {
                            k0Var2.a();
                        } else {
                            k0Var2 = null;
                        }
                        k0Var.f6160e = k0Var2;
                    }
                }
                t1.r.n(gVarF, gVarK, cVarE);
                boolean zF2 = i0Var.f(k0Var);
                Object objQ2 = i0Var.Q();
                if (zF2 || objQ2 == obj2) {
                    objQ2 = new ab.k(k0Var, 13);
                    i0Var.l0(objQ2);
                }
                f1.s.c(k0Var, (ej.c) objQ2, i0Var);
                f1.s.a(q1Var.a(k0Var), eVar, i0Var, ((i12 >> 6) & 112) | 8);
            } catch (Throwable th2) {
                t1.r.n(gVarF, gVarK, cVarE);
                throw th2;
            }
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new b0.x(obj, i10, l0Var, eVar, i11);
        }
    }

    public static final void c(p1.e eVar, f1.i0 i0Var, int i10) {
        i0Var.c0(-709502251);
        if (i0Var.T(i10 & 1, (i10 & 3) != 2)) {
            q1 q1Var = s1.h.f14730a;
            Object obj = (s1.e) i0Var.j(q1Var);
            i0Var.b0(1967007413);
            Object[] objArr = new Object[0];
            Object objQ = i0Var.Q();
            Object obj2 = f1.m.f6385a;
            if (objQ == obj2) {
                objQ = new jb.e(29);
                i0Var.l0(objQ);
            }
            s1.c cVar = (s1.c) s1.k.e(objArr, s1.c.f14721e, (ej.a) objQ, i0Var, 384);
            cVar.f14724c = (s1.e) i0Var.j(q1Var);
            i0Var.p(false);
            Object[] objArr2 = {obj};
            qh.c cVar2 = new qh.c(4, new p4(24), new b0.c1(17, obj, cVar));
            boolean zH = i0Var.h(obj) | i0Var.h(cVar);
            Object objQ2 = i0Var.Q();
            if (zH || objQ2 == obj2) {
                objQ2 = new s3(4, obj, cVar);
                i0Var.l0(objQ2);
            }
            Object obj3 = (x0) s1.k.e(objArr2, cVar2, (ej.a) objQ2, i0Var, 0);
            f1.s.a(q1Var.a(obj3), p1.j.d(-412824043, new ab.g(8, eVar, obj3), i0Var), i0Var, 56);
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new c1.d(eVar, i10, 2);
        }
    }

    public static final void d(b0 b0Var, Object obj, int i10, Object obj2, f1.i0 i0Var, int i11) {
        i0Var.c0(1439843069);
        int i12 = (i0Var.f(b0Var) ? 4 : 2) | i11 | (i0Var.f(obj) ? 32 : 16) | (i0Var.d(i10) ? 256 : 128) | (i0Var.f(obj2) ? 2048 : 1024);
        if (i0Var.T(i12 & 1, (i12 & 1171) != 1170)) {
            ((s1.b) obj).a(obj2, p1.j.d(980966366, new d0.j(i10, b0Var, obj2), i0Var), i0Var, 48);
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new b6.e(b0Var, obj, i10, obj2, i11);
        }
    }

    public static final int e(int i10, g1.e eVar) {
        int i11 = eVar.f7026c - 1;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = ((i11 - i12) / 2) + i12;
            Object[] objArr = eVar.f7024a;
            int i14 = ((l) objArr[i13]).f6163a;
            if (i14 != i10) {
                if (i14 < i10) {
                    i12 = i13 + 1;
                    if (i10 < ((l) objArr[i12]).f6163a) {
                    }
                } else {
                    i11 = i13 - 1;
                }
            }
            return i13;
        }
        return i12;
    }

    public static final List f(g gVar, int i10, int i11, ArrayList arrayList, q.u uVar, int i12, int i13, int i14, ej.c cVar) {
        int i15;
        q.u uVar2;
        long j;
        long j4;
        int i16;
        Object obj;
        int i17;
        if (gVar == null || arrayList.isEmpty() || (i15 = uVar.f13137b) == 0) {
            return qi.s.f13520a;
        }
        int i18 = -1;
        if (i11 - i10 < 0 || i15 == 0) {
            uVar2 = q.j.f13093a;
        } else {
            kj.h hVarT = cg.b.T(0, i15);
            int i19 = hVarT.f9665a;
            int i20 = hVarT.f9666b;
            int iC = -1;
            if (i19 <= i20) {
                while (uVar.c(i19) <= i10) {
                    iC = uVar.c(i19);
                    if (i19 == i20) {
                        break;
                    }
                    i19++;
                }
            }
            if (iC == -1) {
                uVar2 = q.j.f13093a;
            } else {
                q.u uVar3 = q.j.f13093a;
                uVar2 = new q.u(1);
                uVar2.a(iC);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            Object obj2 = arrayList.get(i21);
            int index = ((h0) obj2).getIndex();
            int[] iArr = uVar.f13136a;
            int i22 = uVar.f13137b;
            int i23 = 0;
            while (true) {
                if (i23 >= i22) {
                    break;
                }
                if (iArr[i23] == index) {
                    arrayList3.add(obj2);
                    break;
                }
                i23++;
            }
        }
        int[] iArr2 = uVar2.f13136a;
        int i24 = uVar2.f13137b;
        int i25 = 0;
        while (i25 < i24) {
            int i26 = iArr2[i25];
            int size2 = arrayList.size();
            int i27 = 0;
            int i28 = 0;
            while (true) {
                if (i28 >= size2) {
                    i27 = i18;
                    break;
                }
                Object obj3 = arrayList.get(i28);
                i28++;
                if (((h0) obj3).getIndex() == i26) {
                    break;
                }
                i27++;
            }
            h0 h0Var = i27 == i18 ? (h0) cVar.invoke(Integer.valueOf(i26)) : (h0) arrayList.remove(i27);
            int iC2 = h0Var.c();
            if (i27 == i18) {
                j = 4294967295L;
                i16 = Integer.MIN_VALUE;
            } else {
                long jI = h0Var.i(0);
                if (h0Var.f()) {
                    j = 4294967295L;
                    j4 = jI & 4294967295L;
                } else {
                    j = 4294967295L;
                    j4 = jI >> 32;
                }
                i16 = (int) j4;
            }
            int size3 = arrayList3.size();
            int i29 = 0;
            while (true) {
                if (i29 >= size3) {
                    obj = null;
                    break;
                }
                obj = arrayList3.get(i29);
                if (((h0) obj).getIndex() != i26) {
                    break;
                }
                i29++;
            }
            h0 h0Var2 = (h0) obj;
            if (h0Var2 != null) {
                long jI2 = h0Var2.i(0);
                i17 = (int) (h0Var2.f() ? jI2 & j : jI2 >> 32);
            } else {
                i17 = Integer.MIN_VALUE;
            }
            int iMax = i16 == Integer.MIN_VALUE ? -i12 : Math.max(-i12, i16);
            if (i17 != Integer.MIN_VALUE) {
                iMax = Math.min(iMax, i17 - iC2);
            }
            h0Var.g();
            h0Var.h(iMax, i13, i14);
            arrayList2.add(h0Var);
            i25++;
            i18 = -1;
        }
        return arrayList2;
    }

    public static final List g(b0 b0Var, l0 l0Var, d8.e eVar) {
        kj.h hVar;
        g1.e eVar2 = (g1.e) eVar.f5001a;
        if (!(eVar2.f7026c != 0) && l0Var.f6166a.isEmpty()) {
            return qi.s.f13520a;
        }
        ArrayList arrayList = new ArrayList();
        if (((g1.e) eVar.f5001a).f7026c != 0) {
            int i10 = eVar2.f7026c;
            if (i10 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr = eVar2.f7024a;
            int i11 = ((m) objArr[0]).f6167a;
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = ((m) objArr[i12]).f6167a;
                if (i13 < i11) {
                    i11 = i13;
                }
            }
            if (i11 < 0) {
                a0.a.a("negative minIndex");
            }
            int i14 = eVar2.f7026c;
            if (i14 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr2 = eVar2.f7024a;
            int i15 = ((m) objArr2[0]).f6168b;
            for (int i16 = 0; i16 < i14; i16++) {
                int i17 = ((m) objArr2[i16]).f6168b;
                if (i17 > i15) {
                    i15 = i17;
                }
            }
            hVar = new kj.h(i11, Math.min(i15, b0Var.a() - 1), 1);
        } else {
            hVar = kj.h.f9672d;
        }
        int size = l0Var.f6166a.size();
        for (int i18 = 0; i18 < size; i18++) {
            k0 k0Var = (k0) l0Var.get(i18);
            int i19 = i(k0Var.f6158c, b0Var, k0Var.f6156a);
            int i20 = hVar.f9665a;
            if ((i19 > hVar.f9666b || i20 > i19) && i19 >= 0 && i19 < b0Var.a()) {
                arrayList.add(Integer.valueOf(i19));
            }
        }
        int i21 = hVar.f9665a;
        int i22 = hVar.f9666b;
        if (i21 <= i22) {
            while (true) {
                arrayList.add(Integer.valueOf(i21));
                if (i21 == i22) {
                    break;
                }
                i21++;
            }
        }
        return arrayList;
    }

    public static f1.a1 h() {
        return new j1(pi.o.f13011a, f1.f.f6290d);
    }

    public static final int i(int i10, b0 b0Var, Object obj) {
        int iD;
        return (obj == null || b0Var.a() == 0 || (i10 < b0Var.a() && obj.equals(b0Var.b(i10))) || (iD = b0Var.d(obj)) == -1) ? i10 : iD;
    }

    public static final v1.o m(s sVar, d8.e eVar, o1 o1Var) {
        return new n(sVar, eVar, o1Var);
    }

    public static final v1.o n(v1.o oVar, lj.c cVar, r0 r0Var, o1 o1Var, boolean z2) {
        return oVar.c(new s0(cVar, r0Var, o1Var, z2));
    }

    public static final List o(int i10, int i11, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return qi.s.f13520a;
        }
        ArrayList arrayListT0 = qi.l.T0(list);
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            h0 h0Var = (h0) arrayList.get(i12);
            int index = h0Var.getIndex();
            if (i10 <= index && index <= i11) {
                arrayListT0.add(h0Var);
            }
        }
        qi.p.t0(arrayListT0, f6175a);
        return arrayListT0;
    }

    public Object j(int i10) {
        l lVarD = k().d(i10);
        return lVarD.f6165c.getType().invoke(Integer.valueOf(i10 - lVarD.f6163a));
    }

    public abstract ak.x k();

    public Object l(int i10) {
        Object objInvoke;
        l lVarD = k().d(i10);
        int i11 = i10 - lVarD.f6163a;
        ej.c key = lVarD.f6165c.getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(i11))) == null) ? new j(i10) : objInvoke;
    }
}
