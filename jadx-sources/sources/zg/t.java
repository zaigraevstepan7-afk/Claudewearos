package zg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final rg.h f20618a;

    /* renamed from: b, reason: collision with root package name */
    public final rg.h f20619b;

    /* renamed from: c, reason: collision with root package name */
    public final r f20620c;

    public t(pg.r rVar) {
        List list = rVar.f12950a;
        this.f20618a = list != null ? new rg.h(list) : null;
        List list2 = rVar.f12951b;
        this.f20619b = list2 != null ? new rg.h(list2) : null;
        this.f20620c = u0.c.b(rVar.f12952c, j.f20603e);
    }

    public final r a(rg.h hVar, r rVar, r rVar2) {
        boolean z2 = true;
        rg.h hVar2 = this.f20618a;
        int iCompareTo = hVar2 == null ? 1 : hVar.compareTo(hVar2);
        rg.h hVar3 = this.f20619b;
        int iCompareTo2 = hVar3 == null ? -1 : hVar.compareTo(hVar3);
        int i10 = 0;
        boolean z10 = hVar2 != null && hVar.x(hVar2);
        boolean z11 = hVar3 != null && hVar.x(hVar3);
        if (iCompareTo > 0 && iCompareTo2 < 0 && !z11) {
            return rVar2;
        }
        if (iCompareTo > 0 && z11 && rVar2.n()) {
            return rVar2;
        }
        if (iCompareTo > 0 && iCompareTo2 == 0) {
            ug.l.c(z11);
            ug.l.c(!rVar2.n());
            return rVar.n() ? j.f20603e : rVar;
        }
        if (!z10 && !z11) {
            if (iCompareTo2 <= 0 && iCompareTo > 0) {
                z2 = false;
            }
            ug.l.c(z2);
            return rVar;
        }
        HashSet hashSet = new HashSet();
        Iterator it = rVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((p) it.next()).f20614a);
        }
        Iterator it2 = rVar2.iterator();
        while (it2.hasNext()) {
            hashSet.add(((p) it2.next()).f20614a);
        }
        ArrayList arrayList = new ArrayList(hashSet.size() + 1);
        arrayList.addAll(hashSet);
        if (!rVar2.c().isEmpty() || !rVar.c().isEmpty()) {
            arrayList.add(c.f20591d);
        }
        int size = arrayList.size();
        r rVarD = rVar;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            c cVar = (c) obj;
            r rVarT = rVar.t(cVar);
            r rVarA = a(hVar.i(cVar), rVar.t(cVar), rVar2.t(cVar));
            if (rVarA != rVarT) {
                rVarD = rVarD.d(cVar, rVarA);
            }
        }
        return rVarD;
    }

    public final String toString() {
        return "RangeMerge{optExclusiveStart=" + this.f20618a + ", optInclusiveEnd=" + this.f20619b + ", snap=" + this.f20620c + '}';
    }
}
