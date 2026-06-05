package v;

import android.view.KeyEvent;
import java.util.ArrayList;
import w2.h2;
import x.v2;
import x.w2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class x extends g {

    /* renamed from: f0, reason: collision with root package name */
    public p2.w f17329f0;

    /* renamed from: g0, reason: collision with root package name */
    public m2.b f17330g0;

    @Override // v.g
    public final boolean D1(KeyEvent keyEvent) {
        return false;
    }

    @Override // v.g
    public final void E1(KeyEvent keyEvent) {
        this.P.a();
    }

    public final void G1(boolean z2) {
        if (z2) {
            this.f17330g0 = null;
        } else {
            this.f17329f0 = null;
        }
        x1(z2);
    }

    @Override // v.g, v2.w1
    public final void V() {
        super.V();
        G1(false);
    }

    @Override // m2.c
    public final void X(ak.x xVar, p2.o oVar) {
        ArrayList arrayList = (ArrayList) xVar.f743c;
        B1();
        if (this.O && this.T == null) {
            m0 m0Var = new m0(this);
            q1(m0Var);
            this.T = m0Var;
        }
        if (oVar != p2.o.f12744b) {
            if (oVar != p2.o.f12745c || this.f17330g0 == null) {
                return;
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                m2.b bVar = (m2.b) arrayList.get(i10);
                if (bVar.f11267i && !bVar.equals(this.f17330g0)) {
                    G1(true);
                    return;
                }
            }
            return;
        }
        if (this.f17330g0 == null) {
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                if (w2.h((m2.b) arrayList.get(i11))) {
                    m2.b bVar2 = (m2.b) arrayList.get(0);
                    bVar2.f11267i = true;
                    this.f17330g0 = bVar2;
                    if (this.O) {
                        z1(bVar2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i12 = 0; i12 < size3; i12++) {
            m2.b bVar3 = (m2.b) arrayList.get(i12);
            if (bVar3.f11267i || !bVar3.f11266h || bVar3.f11262d) {
                float f10 = ((h2) v2.n.h(this, w2.f1.f18273t)).f();
                int size4 = arrayList.size();
                for (int i13 = 0; i13 < size4; i13++) {
                    m2.b bVar4 = (m2.b) arrayList.get(i13);
                    long j = bVar4.f11261c;
                    m2.b bVar5 = this.f17330g0;
                    fj.l.c(bVar5);
                    boolean z2 = Math.abs(b2.b.d(b2.b.e(j, bVar5.f11261c))) > f10;
                    if (bVar4.f11267i || z2) {
                        G1(true);
                        return;
                    }
                }
                return;
            }
        }
        ((m2.b) arrayList.get(0)).f11267i = true;
        if (this.O) {
            m2.b bVar6 = this.f17330g0;
            fj.l.c(bVar6);
            y1(bVar6.f11261c, true);
            this.P.a();
        }
        this.f17330g0 = null;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // v.g, v2.w1
    public final void a0(p2.n nVar, p2.o oVar, long j) {
        super.a0(nVar, oVar, j);
        if (oVar != p2.o.f12744b) {
            if (oVar != p2.o.f12745c || this.f17329f0 == null) {
                return;
            }
            ?? r72 = nVar.f12734a;
            int size = r72.size();
            for (int i10 = 0; i10 < size; i10++) {
                p2.w wVar = (p2.w) r72.get(i10);
                if (wVar.b() && !wVar.equals(this.f17329f0)) {
                    G1(false);
                    return;
                }
            }
            return;
        }
        if (this.f17329f0 == null) {
            if (v2.e(nVar, true)) {
                p2.w wVar2 = (p2.w) nVar.f12734a.get(0);
                wVar2.a();
                this.f17329f0 = wVar2;
                if (this.O) {
                    A1(wVar2);
                    return;
                }
                return;
            }
            return;
        }
        ?? r73 = nVar.f12734a;
        int size2 = r73.size();
        for (int i11 = 0; i11 < size2; i11++) {
            if (!p2.v.c((p2.w) r73.get(i11))) {
                long jW1 = w1(j);
                int size3 = r73.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    p2.w wVar3 = (p2.w) r73.get(i12);
                    if (wVar3.b() || p2.v.f(wVar3, j, jW1)) {
                        G1(false);
                        return;
                    }
                }
                return;
            }
        }
        ((p2.w) r73.get(0)).a();
        if (this.O) {
            p2.w wVar4 = this.f17329f0;
            fj.l.c(wVar4);
            y1(wVar4.f12762c, false);
            this.P.a();
        }
        this.f17329f0 = null;
    }

    @Override // m2.c
    public final void z0() {
        G1(true);
    }
}
