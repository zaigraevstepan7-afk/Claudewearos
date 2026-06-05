package zg;

import com.google.android.gms.common.internal.e0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class l implements Iterable {

    /* renamed from: d, reason: collision with root package name */
    public static final og.f f20604d = new og.f(Collections.EMPTY_LIST, null);

    /* renamed from: a, reason: collision with root package name */
    public final r f20605a;

    /* renamed from: b, reason: collision with root package name */
    public og.f f20606b;

    /* renamed from: c, reason: collision with root package name */
    public final k f20607c;

    public l(r rVar, k kVar) {
        this.f20607c = kVar;
        this.f20605a = rVar;
        this.f20606b = null;
    }

    public static l e(r rVar) {
        return new l(rVar, s.f20617a);
    }

    public final void b() {
        if (this.f20606b == null) {
            m mVar = m.f20608a;
            k kVar = this.f20607c;
            boolean zEquals = kVar.equals(mVar);
            og.f fVar = f20604d;
            if (zEquals) {
                this.f20606b = fVar;
                return;
            }
            ArrayList arrayList = new ArrayList();
            boolean z2 = false;
            for (p pVar : this.f20605a) {
                z2 = z2 || kVar.b(pVar.f20615b);
                arrayList.add(new p(pVar.f20614a, pVar.f20615b));
            }
            if (z2) {
                this.f20606b = new og.f(arrayList, kVar);
            } else {
                this.f20606b = fVar;
            }
        }
    }

    public final l i(c cVar, r rVar) {
        r rVar2 = this.f20605a;
        r rVarD = rVar2.d(cVar, rVar);
        og.f fVar = this.f20606b;
        og.f fVar2 = f20604d;
        boolean zL = e0.l(fVar, fVar2);
        k kVar = this.f20607c;
        if (zL && !kVar.b(rVar)) {
            return new l(rVarD, kVar, fVar2);
        }
        og.f fVar3 = this.f20606b;
        if (fVar3 == null || e0.l(fVar3, fVar2)) {
            return new l(rVarD, kVar, null);
        }
        r rVarT = rVar2.t(cVar);
        og.f fVar4 = this.f20606b;
        p pVar = new p(cVar, rVarT);
        og.c cVar2 = fVar4.f12516a;
        og.c cVarB = cVar2.B(pVar);
        if (cVarB != cVar2) {
            fVar4 = new og.f(cVarB);
        }
        if (!rVar.isEmpty()) {
            fVar4 = new og.f(fVar4.f12516a.A(null, new p(cVar, rVar)));
        }
        return new l(rVarD, kVar, fVar4);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b();
        return e0.l(this.f20606b, f20604d) ? this.f20605a.iterator() : this.f20606b.iterator();
    }

    public l(r rVar, k kVar, og.f fVar) {
        this.f20607c = kVar;
        this.f20605a = rVar;
        this.f20606b = fVar;
    }
}
