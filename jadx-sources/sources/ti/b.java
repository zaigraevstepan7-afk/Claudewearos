package ti;

import fj.l;
import java.io.Serializable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b implements h, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final h f16333a;

    /* renamed from: b, reason: collision with root package name */
    public final f f16334b;

    public b(f fVar, h hVar) {
        l.f(hVar, "left");
        l.f(fVar, "element");
        this.f16333a = hVar;
        this.f16334b = fVar;
    }

    @Override // ti.h
    public final f C(g gVar) {
        l.f(gVar, "key");
        b bVar = this;
        while (true) {
            f fVarC = bVar.f16334b.C(gVar);
            if (fVarC != null) {
                return fVarC;
            }
            h hVar = bVar.f16333a;
            if (!(hVar instanceof b)) {
                return hVar.C(gVar);
            }
            bVar = (b) hVar;
        }
    }

    @Override // ti.h
    public final Object F(ej.e eVar, Object obj) {
        return eVar.invoke(this.f16333a.F(eVar, obj), this.f16334b);
    }

    @Override // ti.h
    public final h V(h hVar) {
        l.f(hVar, "context");
        return hVar == i.f16336a ? this : (h) hVar.F(new ra.a(13, (byte) 0), this);
    }

    public final boolean equals(Object obj) {
        boolean zB;
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            int i10 = 2;
            b bVar2 = bVar;
            int i11 = 2;
            while (true) {
                h hVar = bVar2.f16333a;
                bVar2 = hVar instanceof b ? (b) hVar : null;
                if (bVar2 == null) {
                    break;
                }
                i11++;
            }
            b bVar3 = this;
            while (true) {
                h hVar2 = bVar3.f16333a;
                bVar3 = hVar2 instanceof b ? (b) hVar2 : null;
                if (bVar3 == null) {
                    break;
                }
                i10++;
            }
            if (i11 == i10) {
                b bVar4 = this;
                while (true) {
                    f fVar = bVar4.f16334b;
                    if (!l.b(bVar.C(fVar.getKey()), fVar)) {
                        zB = false;
                        break;
                    }
                    h hVar3 = bVar4.f16333a;
                    if (!(hVar3 instanceof b)) {
                        l.d(hVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        f fVar2 = (f) hVar3;
                        zB = l.b(bVar.C(fVar2.getKey()), fVar2);
                        break;
                    }
                    bVar4 = (b) hVar3;
                }
                if (zB) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f16334b.hashCode() + this.f16333a.hashCode();
    }

    @Override // ti.h
    public final h s(g gVar) {
        l.f(gVar, "key");
        f fVar = this.f16334b;
        f fVarC = fVar.C(gVar);
        h hVar = this.f16333a;
        if (fVarC != null) {
            return hVar;
        }
        h hVarS = hVar.s(gVar);
        return hVarS == hVar ? this : hVarS == i.f16336a ? fVar : new b(fVar, hVarS);
    }

    public final String toString() {
        return m6.a.i(new StringBuilder("["), (String) F(new ra.a(12, (byte) 0), ""), ']');
    }
}
