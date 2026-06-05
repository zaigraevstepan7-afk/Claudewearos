package sj;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import qj.b0;
import qj.e2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b implements e2 {

    /* renamed from: a, reason: collision with root package name */
    public Object f15043a = e.f15067p;

    /* renamed from: b, reason: collision with root package name */
    public qj.l f15044b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f15045c;

    public b(c cVar) {
        this.f15045c = cVar;
    }

    @Override // qj.e2
    public final void a(vj.r rVar, int i10) {
        qj.l lVar = this.f15044b;
        if (lVar != null) {
            lVar.a(rVar, i10);
        }
    }

    public final Object b(vi.c cVar) throws Throwable {
        k kVarN;
        Object obj = this.f15043a;
        boolean z2 = true;
        if (obj == e.f15067p || obj == e.f15063l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f15051z;
            c cVar2 = this.f15045c;
            k kVar = (k) atomicReferenceFieldUpdater.get(cVar2);
            while (true) {
                cVar2.getClass();
                if (cVar2.t(c.f15046b.get(cVar2), true)) {
                    this.f15043a = e.f15063l;
                    Throwable thO = cVar2.o();
                    if (thO != null) {
                        int i10 = vj.s.f18122a;
                        throw thO;
                    }
                    z2 = false;
                } else {
                    long andIncrement = c.f15047c.getAndIncrement(cVar2);
                    long j = e.f15054b;
                    long j4 = andIncrement / j;
                    int i11 = (int) (andIncrement % j);
                    if (kVar.f18121c != j4) {
                        kVarN = cVar2.n(j4, kVar);
                        if (kVarN == null) {
                            continue;
                        }
                    } else {
                        kVarN = kVar;
                    }
                    Object objC = cVar2.C(kVarN, i11, andIncrement, null);
                    d7.c cVar3 = e.f15064m;
                    if (objC == cVar3) {
                        throw new IllegalStateException("unreachable");
                    }
                    d7.c cVar4 = e.f15066o;
                    if (objC == cVar4) {
                        if (andIncrement < cVar2.r()) {
                            kVarN.b();
                        }
                        kVar = kVarN;
                    } else {
                        if (objC == e.f15065n) {
                            c cVar5 = this.f15045c;
                            qj.l lVarP = b0.p(u3.a.g(cVar));
                            try {
                                this.f15044b = lVarP;
                                Object objC2 = cVar5.C(kVarN, i11, andIncrement, this);
                                if (objC2 == cVar3) {
                                    a(kVarN, i11);
                                } else {
                                    if (objC2 == cVar4) {
                                        if (andIncrement < cVar5.r()) {
                                            kVarN.b();
                                        }
                                        k kVar2 = (k) c.f15051z.get(cVar5);
                                        while (true) {
                                            if (cVar5.t(c.f15046b.get(cVar5), true)) {
                                                qj.l lVar = this.f15044b;
                                                fj.l.c(lVar);
                                                this.f15044b = null;
                                                this.f15043a = e.f15063l;
                                                Throwable thO2 = cVar2.o();
                                                if (thO2 == null) {
                                                    lVar.resumeWith(Boolean.FALSE);
                                                } else {
                                                    lVar.resumeWith(uk.c.r(thO2));
                                                }
                                            } else {
                                                long andIncrement2 = c.f15047c.getAndIncrement(cVar5);
                                                long j10 = e.f15054b;
                                                long j11 = andIncrement2 / j10;
                                                int i12 = (int) (andIncrement2 % j10);
                                                if (kVar2.f18121c != j11) {
                                                    k kVarN2 = cVar5.n(j11, kVar2);
                                                    if (kVarN2 != null) {
                                                        kVar2 = kVarN2;
                                                    }
                                                }
                                                Object objC3 = cVar5.C(kVar2, i12, andIncrement2, this);
                                                if (objC3 == e.f15064m) {
                                                    a(kVar2, i12);
                                                    break;
                                                }
                                                if (objC3 == e.f15066o) {
                                                    if (andIncrement2 < cVar5.r()) {
                                                        kVar2.b();
                                                    }
                                                } else {
                                                    if (objC3 == e.f15065n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    kVar2.b();
                                                    this.f15043a = objC3;
                                                    this.f15044b = null;
                                                }
                                            }
                                        }
                                    } else {
                                        kVarN.b();
                                        this.f15043a = objC2;
                                        this.f15044b = null;
                                    }
                                    lVarP.r(Boolean.TRUE, null);
                                }
                                Object objO = lVarP.o();
                                ui.a aVar = ui.a.f17085a;
                                return objO;
                            } catch (Throwable th2) {
                                lVarP.A();
                                throw th2;
                            }
                        }
                        kVarN.b();
                        this.f15043a = objC;
                    }
                }
            }
        }
        return Boolean.valueOf(z2);
    }

    public final Object c() throws Throwable {
        Object obj = this.f15043a;
        d7.c cVar = e.f15067p;
        if (obj == cVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f15043a = cVar;
        if (obj != e.f15063l) {
            return obj;
        }
        Throwable thP = this.f15045c.p();
        int i10 = vj.s.f18122a;
        throw thP;
    }
}
