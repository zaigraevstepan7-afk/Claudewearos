package rg;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class h0 {

    /* renamed from: d, reason: collision with root package name */
    public static final x9.b f14418d = new x9.b(11);

    /* renamed from: a, reason: collision with root package name */
    public Object f14419a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14420b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14421c;

    public h0(z zVar, wg.i iVar) {
        this.f14421c = zVar;
        this.f14419a = iVar;
        this.f14420b = zVar.k(iVar.f19307a);
    }

    public static b b(ArrayList arrayList, ug.i iVar, h hVar) {
        b bVarB = b.f14382b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            d0 d0Var = (d0) obj;
            if (iVar.h(d0Var)) {
                h hVar2 = d0Var.f14392b;
                if (d0Var.c()) {
                    if (hVar.x(hVar2)) {
                        bVarB = bVarB.b(h.B(hVar, hVar2), d0Var.b());
                    } else if (hVar2.x(hVar)) {
                        bVarB = bVarB.b(h.f14414d, d0Var.b().l(h.B(hVar2, hVar)));
                    }
                } else if (hVar.x(hVar2)) {
                    bVarB = bVarB.e(h.B(hVar, hVar2), d0Var.a());
                } else if (hVar2.x(hVar)) {
                    h hVarB = h.B(hVar2, hVar);
                    if (hVarB.isEmpty()) {
                        bVarB = bVarB.e(h.f14414d, d0Var.a());
                    } else {
                        zg.r rVarZ = d0Var.a().z(hVarB);
                        if (rVarZ != null) {
                            bVarB = bVarB.b(h.f14414d, rVarZ);
                        }
                    }
                }
            }
        }
        return bVarB;
    }

    public zg.r a(h hVar, zg.r rVar, List list, boolean z2) {
        if (!list.isEmpty() || z2) {
            b bVarX = ((b) this.f14419a).x(hVar);
            if (z2 || !bVarX.f14383a.isEmpty()) {
                if (!z2 && rVar == null && bVarX.z(h.f14414d) == null) {
                    return null;
                }
                b bVarB = b((ArrayList) this.f14420b, new qh.c(z2, list, hVar), hVar);
                if (rVar == null) {
                    rVar = zg.j.f20603e;
                }
                return bVarB.i(rVar);
            }
        } else {
            zg.r rVarZ = ((b) this.f14419a).z(hVar);
            if (rVarZ != null) {
                return rVarZ;
            }
            b bVarX2 = ((b) this.f14419a).x(hVar);
            if (!bVarX2.f14383a.isEmpty()) {
                if (rVar == null && bVarX2.z(h.f14414d) == null) {
                    return null;
                }
                if (rVar == null) {
                    rVar = zg.j.f20603e;
                }
                return bVarX2.i(rVar);
            }
        }
        return rVar;
    }

    public List c(mg.b bVar) {
        wg.i iVar = (wg.i) this.f14419a;
        z zVar = (z) this.f14421c;
        tg.a aVar = zVar.f14496g;
        if (bVar == null) {
            wg.h hVar = iVar.f19307a;
            a0 a0Var = (a0) this.f14420b;
            if (a0Var != null) {
                return (List) aVar.c(new mc.g(4, zVar, a0Var, false));
            }
            return (List) aVar.c(new mc.g(3, zVar, hVar.f19305a, false));
        }
        zVar.f14497h.J("Listen at " + iVar.f19307a.f19305a + " failed: " + bVar.toString());
        return zVar.j(iVar.f19307a, null, bVar, false);
    }
}
