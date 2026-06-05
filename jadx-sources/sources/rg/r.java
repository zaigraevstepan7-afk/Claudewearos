package rg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class r implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wg.h f14462a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f14463b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mg.b f14464c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f14465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f14466e;

    public r(z zVar, wg.h hVar, f fVar, mg.b bVar, boolean z2) {
        this.f14466e = zVar;
        this.f14462a = hVar;
        this.f14463b = fVar;
        this.f14464c = bVar;
        this.f14465d = z2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object obj;
        wg.h hVar = this.f14462a;
        h hVar2 = hVar.f19305a;
        z zVar = this.f14466e;
        ug.e eVar = zVar.f14490a;
        y yVar = zVar.f14495f;
        o oVar = (o) eVar.i(hVar2);
        ArrayList arrayList = new ArrayList();
        if (oVar == null) {
            return arrayList;
        }
        HashMap map = oVar.f14452a;
        if (!hVar.b() && oVar.h(hVar) == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        boolean zG = oVar.g();
        boolean zB = hVar.b();
        wg.g gVar = hVar.f19306b;
        mg.b bVar = this.f14464c;
        f fVar = this.f14463b;
        if (zB) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                wg.i iVar = (wg.i) ((Map.Entry) it.next()).getValue();
                List listB = iVar.b(fVar, bVar);
                wg.h hVar3 = iVar.f19307a;
                arrayList3.addAll(listB);
                if (iVar.f19310d.isEmpty()) {
                    it.remove();
                    if (!hVar3.f19306b.d()) {
                        arrayList2.add(hVar3);
                    }
                }
            }
        } else {
            wg.i iVar2 = (wg.i) map.get(gVar);
            if (iVar2 != null) {
                wg.h hVar4 = iVar2.f19307a;
                arrayList3.addAll(iVar2.b(fVar, bVar));
                if (iVar2.f19310d.isEmpty()) {
                    map.remove(gVar);
                    if (!hVar4.f19306b.d()) {
                        arrayList2.add(hVar4);
                    }
                }
            }
        }
        if (zG && !oVar.g()) {
            arrayList2.add(wg.h.a(hVar.f19305a));
        }
        if (map.isEmpty()) {
            zVar.f14490a = zVar.f14490a.x(hVar2);
        }
        int size = arrayList2.size();
        boolean z2 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            wg.h hVar5 = (wg.h) obj2;
            zVar.f14496g.e();
            z2 = z2 || hVar5.f19306b.d();
        }
        if (this.f14465d) {
            return null;
        }
        ug.e eVarW = zVar.f14490a;
        Object obj3 = eVarW.f17072a;
        boolean z10 = obj3 != null && ((o) obj3).g();
        og.l lVar = new og.l(hVar2);
        while (lVar.hasNext()) {
            eVarW = eVarW.w((zg.c) lVar.next());
            z10 = z10 || ((obj = eVarW.f17072a) != null && ((o) obj).g());
            if (z10 || eVarW.isEmpty()) {
                break;
            }
        }
        if (z2 && !z10) {
            ug.e eVarA = zVar.f14490a.A(hVar2);
            if (!eVarA.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                z.h(eVarA, arrayList4);
                int size2 = arrayList4.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj4 = arrayList4.get(i11);
                    i11++;
                    wg.i iVar3 = (wg.i) obj4;
                    h0 h0Var = new h0(zVar, iVar3);
                    yVar.m(z.i(iVar3.f19307a), (a0) h0Var.f14420b, h0Var, h0Var);
                }
            }
        }
        if (!z10 && !arrayList2.isEmpty() && bVar == null) {
            if (z2) {
                yVar.r(z.i(hVar));
            } else {
                int size3 = arrayList2.size();
                int i12 = 0;
                while (i12 < size3) {
                    Object obj5 = arrayList2.get(i12);
                    i12++;
                    wg.h hVar6 = (wg.h) obj5;
                    ug.l.c(zVar.k(hVar6) != null);
                    yVar.r(z.i(hVar6));
                }
            }
        }
        int size4 = arrayList2.size();
        int i13 = 0;
        while (i13 < size4) {
            Object obj6 = arrayList2.get(i13);
            i13++;
            wg.h hVar7 = (wg.h) obj6;
            if (!hVar7.f19306b.d()) {
                a0 a0VarK = zVar.k(hVar7);
                ug.l.c(a0VarK != null);
                zVar.f14493d.remove(hVar7);
                zVar.f14492c.remove(a0VarK);
            }
        }
        return arrayList3;
    }
}
