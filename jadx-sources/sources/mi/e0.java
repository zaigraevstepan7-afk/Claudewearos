package mi;

import v2.h0;
import w2.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e0 implements a {

    /* renamed from: a, reason: collision with root package name */
    public final i f11755a;

    public e0(i iVar) {
        this.f11755a = iVar;
    }

    @Override // mi.a
    public final void a(h0 h0Var) {
        Object obj = k.f11767a;
        i iVar = this.f11755a;
        s sVar = iVar.W;
        s sVar2 = null;
        if (!sVar.a()) {
            sVar = null;
        }
        if (sVar == null) {
            sVar = iVar.L.f11778e;
            if (!sVar.a()) {
                sVar = null;
            }
            if (sVar == null) {
                sVar = iVar.K.f11778e;
            }
        }
        if (!sVar.a()) {
            sVar = null;
        }
        if (sVar == null) {
            s sVar3 = (s) qi.l.A0(k.f(iVar));
            if (sVar3 != null) {
                c2.s sVar4 = sVar3.f11784c;
                float fD = k.d(iVar);
                if (Float.isNaN(fD)) {
                    fD = 0;
                }
                if (sVar4 != null) {
                    sVar2 = sVar3;
                } else {
                    if (Float.isNaN(fD)) {
                        fD = e.f11753a;
                    }
                    long j = sVar3.f11782a;
                    float fE = c2.w.e(j) * ((fD / 72) + 1);
                    if (fE > 1.0f) {
                        fE = 1.0f;
                    }
                    sVar2 = new s(c2.w.c(j, fE), sVar3.f11783b, sVar4);
                }
            }
            if (sVar2 == null) {
                return;
            }
        } else {
            sVar2 = sVar;
        }
        float f10 = iVar.X;
        if (f10 >= 1.0f) {
            d.e(h0Var, sVar2, iVar, 0L, h0Var.a());
            return;
        }
        c2.b0 b0Var = (c2.b0) v2.n.h(iVar, f1.f18261g);
        f2.b bVarB = b0Var.b();
        try {
            fj.l.f(bVarB, "layer");
            bVarB.f(f10);
            e2.d.s0(h0Var, bVarB, new d1.b0(4, sVar2, this));
            u6.v.C(h0Var, bVarB);
        } finally {
            b0Var.a(bVarB);
        }
    }
}
