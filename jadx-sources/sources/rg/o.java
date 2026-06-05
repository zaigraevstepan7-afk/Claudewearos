package rg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f14452a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final tg.a f14453b;

    public o(tg.a aVar) {
        this.f14453b = aVar;
    }

    public final ArrayList a(r5.g gVar, q5.b bVar, zg.r rVar) {
        wg.g gVar2 = ((sg.d) gVar.f13731b).f15036b;
        HashMap map = this.f14452a;
        if (gVar2 != null) {
            wg.i iVar = (wg.i) map.get(gVar2);
            ug.l.c(iVar != null);
            return b(iVar, gVar, bVar, rVar);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.addAll(b((wg.i) ((Map.Entry) it.next()).getValue(), gVar, bVar, rVar));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:207:0x0463  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList b(wg.i r22, r5.g r23, q5.b r24, zg.r r25) {
        /*
            Method dump skipped, instructions count: 1132
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rg.o.b(wg.i, r5.g, q5.b, zg.r):java.util.ArrayList");
    }

    public final zg.r c(h hVar) {
        zg.r rVarL;
        Iterator it = this.f14452a.values().iterator();
        do {
            rVarL = null;
            if (!it.hasNext()) {
                break;
            }
            wg.i iVar = (wg.i) it.next();
            zg.r rVarN = iVar.f19309c.n();
            if (rVarN != null && (iVar.f19307a.f19306b.d() || (!hVar.isEmpty() && !rVarN.t(hVar.z()).isEmpty()))) {
                rVarL = rVarN.l(hVar);
            }
        } while (rVarL == null);
        return rVarL;
    }

    public final wg.i d() {
        Iterator it = this.f14452a.entrySet().iterator();
        while (it.hasNext()) {
            wg.i iVar = (wg.i) ((Map.Entry) it.next()).getValue();
            if (iVar.f19307a.f19306b.d()) {
                return iVar;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f14452a.entrySet().iterator();
        while (it.hasNext()) {
            wg.i iVar = (wg.i) ((Map.Entry) it.next()).getValue();
            if (!iVar.f19307a.f19306b.d()) {
                arrayList.add(iVar);
            }
        }
        return arrayList;
    }

    public final wg.i f(wg.h hVar, q5.b bVar, wg.a aVar) {
        boolean z2;
        wg.i iVar = (wg.i) this.f14452a.get(hVar.f19306b);
        if (iVar != null) {
            return iVar;
        }
        boolean z10 = aVar.f19287b;
        zg.l lVar = aVar.f19286a;
        zg.r rVarA = ((h0) bVar.f13236c).a((h) bVar.f13235b, z10 ? lVar.f20605a : null, Collections.EMPTY_LIST, false);
        if (rVarA != null) {
            z2 = true;
        } else {
            zg.r rVar = lVar.f20605a;
            if (rVar == null) {
                rVar = zg.j.f20603e;
            }
            rVarA = bVar.g(rVar);
            z2 = false;
        }
        return new wg.i(hVar, new q5.b(20, new wg.a(new zg.l(rVarA, hVar.f19306b.f19304e), z2, false), aVar));
    }

    public final boolean g() {
        return d() != null;
    }

    public final wg.i h(wg.h hVar) {
        return hVar.f19306b.d() ? d() : (wg.i) this.f14452a.get(hVar.f19306b);
    }
}
