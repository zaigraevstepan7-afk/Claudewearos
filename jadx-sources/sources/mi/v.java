package mi;

import b0.g2;
import c2.r0;
import k0.t1;
import v2.h0;
import w2.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class v implements a {

    /* renamed from: a, reason: collision with root package name */
    public final i f11789a;

    /* renamed from: b, reason: collision with root package name */
    public r0 f11790b;

    public v(i iVar) {
        this.f11789a = iVar;
    }

    @Override // mi.a
    public final void a(h0 h0Var) {
        g2 g2Var = new g2(this, 17);
        i iVar = this.f11789a;
        float fA = k.a(iVar);
        boolean z2 = iVar.f11763c0 != null;
        c2.b0 b0Var = (c2.b0) v2.n.h(iVar, f1.f18261g);
        f2.b bVarB = d.b(h0Var, iVar, fA, iVar.Q, iVar.R);
        if (bVarB != null) {
            bVarB.g(z2);
            d.d(h0Var, iVar.R ^ (-9223372034707292160L), b2.e.g(h0Var.f17669a.a(), fA), z2, new t1(7, g2Var, bVarB));
            b0Var.a(bVarB);
        }
    }
}
