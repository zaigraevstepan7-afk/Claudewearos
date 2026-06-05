package w2;

import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q2 implements androidx.lifecycle.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vj.d f18362a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.e f18363b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.a2 f18364c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fj.v f18365d;

    public q2(vj.d dVar, f1.e eVar, f1.a2 a2Var, fj.v vVar) {
        this.f18362a = dVar;
        this.f18363b = eVar;
        this.f18364c = a2Var;
        this.f18365d = vVar;
    }

    @Override // androidx.lifecycle.r
    public final void e(androidx.lifecycle.t tVar, androidx.lifecycle.n nVar) {
        boolean z2;
        qj.k kVarY = null;
        switch (p2.f18357a[nVar.ordinal()]) {
            case 1:
                vj.d dVar = this.f18362a;
                qj.a0 a0Var = qj.a0.f13538a;
                qj.b0.w(dVar, null, new ab.q(this.f18365d, this.f18364c, tVar, this, null, 15), 1);
                return;
            case 2:
                f1.e eVar = this.f18363b;
                if (eVar != null) {
                    f0.a1 a1Var = (f0.a1) eVar.f6282c;
                    synchronized (a1Var.f6105b) {
                        try {
                            synchronized (a1Var.f6105b) {
                                z2 = a1Var.f6104a;
                            }
                            if (!z2) {
                                ArrayList arrayList = (ArrayList) a1Var.f6106c;
                                a1Var.f6106c = (ArrayList) a1Var.f6107d;
                                a1Var.f6107d = arrayList;
                                a1Var.f6104a = true;
                                int size = arrayList.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    ((ti.c) arrayList.get(i10)).resumeWith(pi.o.f13011a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                f1.a2 a2Var = this.f18364c;
                synchronized (a2Var.f6246c) {
                    if (a2Var.f6262t) {
                        a2Var.f6262t = false;
                        kVarY = a2Var.y();
                    }
                }
                if (kVarY != null) {
                    ((qj.l) kVarY).resumeWith(pi.o.f13011a);
                    return;
                }
                return;
            case 3:
                f1.a2 a2Var2 = this.f18364c;
                synchronized (a2Var2.f6246c) {
                    a2Var2.f6262t = true;
                }
                return;
            case 4:
                this.f18364c.x();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                throw new b3.e();
        }
    }
}
