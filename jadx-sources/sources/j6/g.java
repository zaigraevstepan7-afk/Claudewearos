package j6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import qi.q;
import tj.d0;
import tj.i0;
import tj.r0;
import wh.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f8709a = i0.b(h.f8722f);

    /* renamed from: b, reason: collision with root package name */
    public final r0 f8710b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f8711c;

    /* renamed from: d, reason: collision with root package name */
    public final qi.j f8712d;

    /* renamed from: e, reason: collision with root package name */
    public final qi.j f8713e;

    /* renamed from: f, reason: collision with root package name */
    public d f8714f;

    /* renamed from: g, reason: collision with root package name */
    public int f8715g;

    /* renamed from: h, reason: collision with root package name */
    public f f8716h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashSet f8717i;
    public final LinkedHashSet j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f8718k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8719l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8720m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8721n;

    public g() {
        r0 r0VarB = i0.b(new e());
        this.f8710b = r0VarB;
        this.f8711c = new d0(r0VarB);
        this.f8712d = new qi.j();
        this.f8713e = new qi.j();
        this.f8717i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.f8718k = new LinkedHashSet();
    }

    public final void a(s sVar, f fVar, int i10) {
        fj.l.f(sVar, "dispatcher");
        if (fVar.f8707a == null) {
            (i10 != 0 ? i10 != 1 ? this.f8717i : this.j : this.f8718k).add(fVar);
            fVar.f8707a = sVar;
            fj.l.f((e) this.f8711c.f16351a.getValue(), "history");
            fVar.b(i10 != 0 ? i10 != 1 ? this.f8721n : this.f8719l : this.f8720m);
            return;
        }
        throw new IllegalArgumentException(("Input '" + fVar + "' is already added to dispatcher " + fVar.f8707a + '.').toString());
    }

    public final void b() {
        boolean z2;
        boolean z10;
        e eVar;
        qi.j jVar = this.f8712d;
        if (jVar == null || !jVar.isEmpty()) {
            Iterator it = jVar.iterator();
            while (it.hasNext()) {
                if (((d) it.next()).f8703b) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        qi.j jVar2 = this.f8713e;
        if (jVar2 == null || !jVar2.isEmpty()) {
            Iterator it2 = jVar2.iterator();
            while (it2.hasNext()) {
                if (((d) it2.next()).f8703b) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        } else {
            z10 = false;
        }
        boolean z11 = z2 || z10;
        boolean z12 = this.f8720m != z2;
        boolean z13 = this.f8719l != z10;
        boolean z14 = this.f8721n != z11;
        LinkedHashSet linkedHashSet = this.f8718k;
        if (z12) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((f) it3.next()).b(z2);
            }
        }
        LinkedHashSet linkedHashSet2 = this.j;
        if (z13) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((f) it4.next()).b(z10);
            }
        }
        LinkedHashSet linkedHashSet3 = this.f8717i;
        if (z14) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((f) it5.next()).b(z11);
            }
        }
        this.f8720m = z2;
        this.f8719l = z10;
        this.f8721n = z11;
        d dVarC = this.f8714f;
        if (dVarC == null) {
            dVarC = c(0);
        }
        d dVarC2 = this.f8714f;
        if (dVarC2 == null) {
            dVarC2 = c(0);
        }
        if (fj.l.b(dVarC2, dVarC)) {
            if (dVarC2 == null) {
                eVar = new e();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = jVar.iterator();
                while (it6.hasNext()) {
                    boolean z15 = ((d) it6.next()).f8703b;
                }
                Iterator<E> it7 = jVar2.iterator();
                while (it7.hasNext()) {
                    boolean z16 = ((d) it7.next()).f8703b;
                }
                cg.b bVar = dVarC2.f8702a;
                ri.c cVarR = yd.f.r();
                q.u0(cVarR, arrayList);
                cVarR.add(bVar);
                q.u0(cVarR, qi.s.f13520a);
                eVar = new e(arrayList.size(), yd.f.m(cVarR));
            }
            r0 r0Var = this.f8710b;
            if (fj.l.b((e) r0Var.getValue(), eVar)) {
                return;
            }
            r0Var.k(null, eVar);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((f) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((f) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((f) it10.next()).getClass();
            }
        }
    }

    public final d c(int i10) {
        Object next;
        Object next2;
        qi.j jVar = this.f8713e;
        qi.j jVar2 = this.f8712d;
        Object obj = null;
        if (i10 == -1) {
            Iterator it = jVar2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((d) next).f8703b) {
                    break;
                }
            }
            d dVar = (d) next;
            if (dVar != null) {
                return dVar;
            }
            Iterator it2 = jVar.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next3 = it2.next();
                if (((d) next3).f8703b) {
                    obj = next3;
                    break;
                }
            }
            return (d) obj;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i10 + "'.").toString());
            }
            Iterator it3 = jVar2.iterator();
            while (it3.hasNext()) {
                ((d) it3.next()).getClass();
            }
            Iterator it4 = jVar.iterator();
            while (it4.hasNext()) {
                ((d) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = jVar2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it5.next();
            if (((d) next2).f8703b) {
                break;
            }
        }
        d dVar2 = (d) next2;
        if (dVar2 != null) {
            return dVar2;
        }
        Iterator it6 = jVar.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next4 = it6.next();
            if (((d) next4).f8703b) {
                obj = next4;
                break;
            }
        }
        return (d) obj;
    }
}
