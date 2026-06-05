package wg;

import rg.e0;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f19296a;

    /* renamed from: b, reason: collision with root package name */
    public final mg.a f19297b;

    public d(e0 e0Var, mg.a aVar) {
        this.f19296a = e0Var;
        this.f19297b = aVar;
    }

    @Override // wg.e
    public final void a() {
        e0 e0Var = this.f19296a;
        if (e0Var.f14408a.get()) {
            return;
        }
        e0Var.f14406e.n(this.f19297b);
    }

    @Override // wg.e
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        mg.a aVar = this.f19297b;
        sb2.append(aVar.f11668b.f11674b);
        sb2.append(": ");
        sb2.append(m1.B(5));
        sb2.append(": ");
        sb2.append(aVar.f11667a.f20605a.s(true));
        return sb2.toString();
    }
}
