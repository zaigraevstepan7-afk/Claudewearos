package wg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import zg.k;
import zg.l;
import zg.p;
import zg.r;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final h f19307a;

    /* renamed from: b, reason: collision with root package name */
    public final j f19308b;

    /* renamed from: c, reason: collision with root package name */
    public q5.b f19309c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f19310d;

    /* renamed from: e, reason: collision with root package name */
    public final q5.b f19311e;

    public i(h hVar, q5.b bVar) {
        this.f19307a = hVar;
        g gVar = hVar.f19306b;
        yh.c cVar = new yh.c(gVar.f19304e, 26);
        xg.b cVar2 = gVar.d() ? new yh.c(gVar.f19304e, 26) : new a8.j(gVar);
        this.f19308b = new j(cVar2);
        a aVar = (a) bVar.f13236c;
        a aVar2 = (a) bVar.f13235b;
        l lVar = new l(zg.j.f20603e, hVar.f19306b.f19304e);
        l lVar2 = aVar.f19286a;
        cVar.i(lVar, lVar2, null);
        l lVarI = cVar2.i(lVar, aVar2.f19286a, null);
        this.f19309c = new q5.b(20, new a(lVarI, aVar2.f19287b, cVar2.f()), new a(lVar2, aVar.f19287b, false));
        this.f19310d = new ArrayList();
        this.f19311e = new q5.b(hVar);
    }

    public final ArrayList a(ArrayList arrayList, l lVar, rg.f fVar) {
        List listAsList = fVar == null ? this.f19310d : Arrays.asList(fVar);
        q5.b bVar = this.f19311e;
        bVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            c cVar = (c) obj;
            int i11 = cVar.f19292a;
            l lVar2 = cVar.f19293b;
            if (y3.e.a(i11, 4)) {
                k kVar = (k) bVar.f13236c;
                r rVar = cVar.f19294c.f20605a;
                r rVar2 = lVar2.f20605a;
                zg.c cVar2 = zg.c.f20589b;
                if (kVar.compare(new p(cVar2, rVar), new p(cVar2, rVar2)) != 0) {
                    arrayList3.add(new c(3, lVar2, cVar.f19295d, null));
                }
            }
        }
        bVar.l(arrayList2, 1, arrayList, listAsList, lVar);
        bVar.l(arrayList2, 2, arrayList, listAsList, lVar);
        bVar.l(arrayList2, 3, arrayList3, listAsList, lVar);
        bVar.l(arrayList2, 4, arrayList, listAsList, lVar);
        bVar.l(arrayList2, 5, arrayList, listAsList, lVar);
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    public final List b(rg.f fVar, mg.b bVar) {
        ?? arrayList;
        int i10 = 0;
        ArrayList arrayList2 = this.f19310d;
        if (bVar != null) {
            arrayList = new ArrayList();
            ug.l.b("A cancel should cancel all event registrations", fVar == null);
            rg.h hVar = this.f19307a.f19305a;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                arrayList.add(new b((rg.f) obj, bVar, hVar));
            }
        } else {
            arrayList = Collections.EMPTY_LIST;
        }
        if (fVar == null) {
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                ((rg.f) obj2).g();
            }
            arrayList2.clear();
            return arrayList;
        }
        int i12 = -1;
        while (true) {
            if (i10 >= arrayList2.size()) {
                i10 = i12;
                break;
            }
            rg.f fVar2 = (rg.f) arrayList2.get(i10);
            if (fVar2.e(fVar)) {
                if (fVar2.f14408a.get()) {
                    break;
                }
                i12 = i10;
            }
            i10++;
        }
        if (i10 != -1) {
            rg.f fVar3 = (rg.f) arrayList2.get(i10);
            arrayList2.remove(i10);
            fVar3.g();
        }
        return arrayList;
    }
}
