package i0;

import fj.l;
import v.a1;
import v1.n;
import v2.x0;
import z.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class a extends x0 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8067b;

    /* renamed from: c, reason: collision with root package name */
    public final k f8068c;

    /* renamed from: d, reason: collision with root package name */
    public final a1 f8069d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8070e;

    /* renamed from: f, reason: collision with root package name */
    public final ej.a f8071f;

    public a(boolean z2, k kVar, a1 a1Var, boolean z10, ej.a aVar) {
        this.f8067b = z2;
        this.f8068c = kVar;
        this.f8069d = a1Var;
        this.f8070e = z10;
        this.f8071f = aVar;
    }

    @Override // v2.x0
    public final n d() {
        d dVar = new d(this.f8068c, this.f8069d, false, this.f8070e, null, null, this.f8071f);
        dVar.f8076h0 = this.f8067b;
        return dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f8067b == aVar.f8067b && l.b(this.f8068c, aVar.f8068c) && l.b(this.f8069d, aVar.f8069d) && this.f8070e == aVar.f8070e && this.f8071f == aVar.f8071f;
    }

    @Override // v2.x0
    public final void g(n nVar) {
        d dVar = (d) nVar;
        boolean z2 = dVar.f8076h0;
        boolean z10 = this.f8067b;
        if (z2 != z10) {
            dVar.f8076h0 = z10;
            v2.n.o(dVar);
        }
        dVar.F1(this.f8068c, this.f8069d, false, this.f8070e, null, null, this.f8071f);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f8067b) * 31;
        k kVar = this.f8068c;
        int iHashCode2 = (iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
        a1 a1Var = this.f8069d;
        return this.f8071f.hashCode() + gk.b.i(gk.b.i((iHashCode2 + (a1Var != null ? a1Var.hashCode() : 0)) * 31, 31, false), 961, this.f8070e);
    }
}
