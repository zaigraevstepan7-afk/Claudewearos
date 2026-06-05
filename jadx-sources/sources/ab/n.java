package ab;

import c1.z3;
import ib.d0;
import ib.e0;
import ib.f0;
import ib.g0;
import ib.h0;
import ib.j0;
import ib.k0;
import ib.l0;
import ib.m0;
import ib.n0;
import ib.o0;
import java.util.List;
import v2.e2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.c f318b;

    public /* synthetic */ n(ej.c cVar, int i10) {
        this.f317a = i10;
        this.f318b = cVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        Object sVar;
        switch (this.f317a) {
            case 0:
                ej.c cVar = this.f318b;
                t2.w wVar = (t2.w) obj;
                fj.l.f(wVar, "it");
                cVar.invoke(Integer.valueOf((int) (wVar.I() & 4294967295L)));
                return pi.o.f13011a;
            case 1:
                ej.c cVar2 = this.f318b;
                fj.l.f((f1.b0) obj, "$this$DisposableEffect");
                return new z3(cVar2, 8);
            case 2:
                ej.c cVar3 = this.f318b;
                String str = (String) obj;
                fj.l.f(str, "it");
                cVar3.invoke(new ta.l(str));
                return pi.o.f13011a;
            case 3:
                ej.c cVar4 = this.f318b;
                String str2 = (String) obj;
                fj.l.f(str2, "pin");
                cVar4.invoke(str2);
                return pi.o.f13011a;
            case 4:
                this.f318b.invoke(new ib.c(new wa.l(((Integer) obj).intValue())));
                return pi.o.f13011a;
            case 5:
                ej.c cVar5 = this.f318b;
                List list = (List) obj;
                fj.l.f(list, "slotPackages");
                cVar5.invoke(list);
                return pi.o.f13011a;
            case 6:
                ej.c cVar6 = this.f318b;
                ib.e eVar = (ib.e) obj;
                fj.l.f(eVar, "action");
                if (eVar instanceof ib.a) {
                    ta.m mVar = ((ib.a) eVar).f8407a;
                    fj.l.f(mVar, "<this>");
                    if (mVar instanceof ta.l) {
                        sVar = new f0(((ta.l) mVar).f16168a);
                    } else if (mVar instanceof ta.i) {
                        sVar = new ib.r(0);
                    } else if (mVar instanceof ta.k) {
                        sVar = new e0(((ta.k) mVar).f16167a);
                    } else if ((mVar instanceof ta.h) || (mVar instanceof ta.g)) {
                        sVar = new f0("");
                    } else {
                        if (!(mVar instanceof ta.j)) {
                            throw new b3.e();
                        }
                        int iOrdinal = ((ta.j) mVar).f16166a.ordinal();
                        if (iOrdinal == 0) {
                            sVar = ib.z.f8486a;
                        } else if (iOrdinal == 1) {
                            sVar = ib.y.f8485a;
                        } else if (iOrdinal == 2) {
                            sVar = ib.a0.f8408a;
                        } else {
                            if (iOrdinal != 3) {
                                throw new b3.e();
                            }
                            sVar = ib.x.f8484a;
                        }
                    }
                } else if (eVar instanceof ib.d) {
                    db.d dVar = ((ib.d) eVar).f8413a;
                    fj.l.f(dVar, "<this>");
                    if (dVar instanceof db.c) {
                        sVar = ib.q.f8452a;
                    } else {
                        if (!(dVar instanceof db.b)) {
                            throw new b3.e();
                        }
                        sVar = ib.n.f8442a;
                    }
                } else if (eVar instanceof ib.c) {
                    wa.p pVar = ((ib.c) eVar).f8411a;
                    fj.l.f(pVar, "<this>");
                    if (pVar instanceof wa.k) {
                        sVar = new ib.t(((wa.k) pVar).f19111a);
                    } else if (pVar instanceof wa.l) {
                        sVar = new ib.l(((wa.l) pVar).f19119a);
                    } else if (pVar instanceof wa.m) {
                        sVar = new ib.b0(((wa.m) pVar).f19124a);
                    } else if (pVar instanceof wa.n) {
                        sVar = new ib.c0(((wa.n) pVar).f19128a);
                    } else {
                        if (!(pVar instanceof wa.o)) {
                            throw new b3.e();
                        }
                        sVar = d0.f8414a;
                    }
                } else {
                    if (!(eVar instanceof ib.b)) {
                        throw new b3.e();
                    }
                    cg.b bVar = ((ib.b) eVar).f8409a;
                    if (bVar instanceof j0) {
                        sVar = ib.w.f8483a;
                    } else if (bVar instanceof m0) {
                        sVar = ib.v.f8460a;
                    } else if (bVar instanceof o0) {
                        sVar = h0.f8433a;
                    } else if (bVar instanceof n0) {
                        sVar = g0.f8431a;
                    } else if (bVar instanceof k0) {
                        sVar = ib.o.f8444a;
                    } else {
                        if (!(bVar instanceof l0)) {
                            throw new b3.e();
                        }
                        sVar = new ib.s(((l0) bVar).f8439d);
                    }
                }
                cVar6.invoke(sVar);
                return pi.o.f13011a;
            case 7:
                this.f318b.invoke(new ib.b(new l0(((Integer) obj).intValue())));
                return pi.o.f13011a;
            case 8:
                ej.c cVar7 = this.f318b;
                wa.p pVar2 = (wa.p) obj;
                fj.l.f(pVar2, "action");
                cVar7.invoke(new ib.c(pVar2));
                return pi.o.f13011a;
            case 9:
                ej.c cVar8 = this.f318b;
                na.b bVar2 = (na.b) obj;
                fj.l.f(bVar2, "category");
                cVar8.invoke(bVar2.f11968a);
                return pi.o.f13011a;
            case 10:
                ej.c cVar9 = this.f318b;
                Long l10 = (Long) obj;
                l10.longValue();
                return cVar9.invoke(l10);
            case 11:
                t1.g gVar = (t1.g) this.f318b.invoke((t1.k) obj);
                synchronized (t1.m.f15471c) {
                    t1.m.f15472d = t1.m.f15472d.x(gVar.g());
                }
                return gVar;
            case 12:
                ej.c cVar10 = this.f318b;
                t2.w wVar2 = (t2.w) obj;
                fj.l.f(wVar2, "coordinates");
                cVar10.invoke(Integer.valueOf((int) (wVar2.I() >> 32)));
                return pi.o.f13011a;
            case 13:
                ej.c cVar11 = this.f318b;
                String str3 = (String) obj;
                fj.l.f(str3, "it");
                cVar11.invoke(new ta.l(str3));
                return pi.o.f13011a;
            case 14:
                ej.c cVar12 = this.f318b;
                t2.w wVar3 = (t2.w) obj;
                fj.l.f(wVar3, "coordinates");
                cVar12.invoke(Float.valueOf(Float.intBitsToFloat((int) (wVar3.q0(0L) & 4294967295L))));
                return pi.o.f13011a;
            case 15:
                ej.c cVar13 = this.f318b;
                e2 e2Var = (e2) obj;
                if (!(e2Var instanceof v.m0)) {
                    throw new IllegalStateException("Node is not a GestureNode instance");
                }
                Boolean bool = (Boolean) cVar13.invoke(((v.m0) e2Var).H);
                bool.getClass();
                return bool;
            default:
                this.f318b.invoke(wa.o.f19129a);
                return pi.o.f13011a;
        }
    }
}
