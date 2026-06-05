package mg;

import java.util.HashMap;
import kg.p;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11679a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final cg.i f11680b;

    /* renamed from: c, reason: collision with root package name */
    public final mh.g f11681c;

    /* renamed from: d, reason: collision with root package name */
    public final t0.j f11682d;

    public g(cg.i iVar, p pVar, p pVar2) {
        this.f11680b = iVar;
        this.f11681c = new mh.g(pVar);
        this.f11682d = new t0.j(pVar2);
    }

    public final synchronized f a(rg.l lVar) {
        f fVar;
        try {
            fVar = (f) this.f11679a.get(lVar);
            if (fVar == null) {
                rg.e eVar = new rg.e();
                eVar.f14402h = 2;
                eVar.j = false;
                cg.i iVar = this.f11680b;
                iVar.b();
                if (!"[DEFAULT]".equals(iVar.f3368b)) {
                    cg.i iVar2 = this.f11680b;
                    iVar2.b();
                    eVar.d(iVar2.f3368b);
                }
                cg.i iVar3 = this.f11680b;
                synchronized (eVar) {
                    eVar.f14403i = iVar3;
                }
                eVar.f14397c = this.f11681c;
                eVar.f14398d = this.f11682d;
                f fVar2 = new f(eVar, lVar);
                this.f11679a.put(lVar, fVar2);
                fVar = fVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return fVar;
    }
}
