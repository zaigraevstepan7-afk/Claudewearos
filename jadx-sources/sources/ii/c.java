package ii;

import android.graphics.BlurMaskFilter;
import android.os.Build;
import c2.b0;
import c2.e0;
import c2.j;
import c2.l;
import c2.n0;
import fi.k;
import java.util.LinkedHashMap;
import ld.i;
import u6.v;
import v1.n;
import v2.h0;
import v2.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c extends n implements m {
    public k H;
    public ej.a I;
    public f2.b J;
    public final c2.h K;
    public j L;
    public final i M;

    public c(k kVar, ej.a aVar) {
        this.H = kVar;
        this.I = aVar;
        c2.h hVarG = e0.g();
        hVarG.l(1);
        this.K = hVarG;
        this.M = new i(8);
    }

    @Override // v2.m
    public final void O0(h0 h0Var) {
        j jVarA;
        e2.b bVar = h0Var.f17669a;
        a aVar = (a) this.I.a();
        if (aVar != null) {
            float f10 = aVar.f8578a;
            h hVar = aVar.f8581d;
            if (f10 > 0.0f) {
                h0Var.f();
                f2.b bVar2 = this.J;
                if (bVar2 != null) {
                    long jCeil = ((((int) Math.ceil(Float.intBitsToFloat((int) (r8 >> 32)))) + 2) << 32) | ((((int) Math.ceil(Float.intBitsToFloat((int) (r8 & 4294967295L)))) + 2) & 4294967295L);
                    e0 e0VarB = ((fi.j) this.H.f6779g).b(bVar.a(), h0Var.getLayoutDirection(), h0Var);
                    if (e0VarB instanceof n0) {
                        jVarA = this.L;
                        if (jVarA == null) {
                            jVarA = l.a();
                            this.L = jVarA;
                        }
                    } else {
                        jVarA = null;
                    }
                    long jA = hVar.a();
                    c2.h hVar2 = this.K;
                    hVar2.e(jA);
                    float fW0 = h0Var.w0(f10);
                    float fD = b2.e.d(bVar.a()) / 2.0f;
                    if (fW0 > fD) {
                        fW0 = fD;
                    }
                    hVar2.k(((float) Math.ceil(fW0)) * 2.0f);
                    float fW02 = h0Var.w0(aVar.f8579b);
                    hVar2.f2999a.setMaskFilter(fW02 > 0.0f ? new BlurMaskFilter(fW02, BlurMaskFilter.Blur.NORMAL) : null);
                    if (Build.VERSION.SDK_INT >= 31) {
                        hVar2.h(hVar.b(h0Var, (fi.j) this.H.f6779g, this.M));
                    }
                    bVar2.f(aVar.f8580c);
                    int iF = hVar.f();
                    f2.d dVar = bVar2.f6514a;
                    if (dVar.f() != iF) {
                        dVar.i(iF);
                    }
                    h0Var.n0(bVar2, jCeil, new ab.m(e0VarB, jVarA, this, 7));
                    ((i) bVar.f5738b.f373b).U(-1.0f, -1.0f);
                    try {
                        v.C(h0Var, bVar2);
                        return;
                    } finally {
                        ((i) bVar.f5738b.f373b).U(1.0f, 1.0f);
                    }
                }
                return;
            }
        }
        h0Var.f();
    }

    @Override // v1.n
    public final boolean f1() {
        return false;
    }

    @Override // v1.n
    public final void i1() {
        this.J = v2.n.w(this).b();
    }

    @Override // v1.n
    public final void j1() {
        b0 b0VarW = v2.n.w(this);
        f2.b bVar = this.J;
        if (bVar != null) {
            b0VarW.a(bVar);
            this.J = null;
        }
        this.L = null;
        ((LinkedHashMap) this.M.f10924b).clear();
    }
}
