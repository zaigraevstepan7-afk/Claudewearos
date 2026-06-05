package uj;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public d[] f17096a;

    /* renamed from: b, reason: collision with root package name */
    public int f17097b;

    /* renamed from: c, reason: collision with root package name */
    public int f17098c;

    /* renamed from: d, reason: collision with root package name */
    public u f17099d;

    public final d d() {
        d dVarE;
        u uVar;
        synchronized (this) {
            try {
                d[] dVarArrF = this.f17096a;
                if (dVarArrF == null) {
                    dVarArrF = f();
                    this.f17096a = dVarArrF;
                } else if (this.f17097b >= dVarArrF.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(dVarArrF, dVarArrF.length * 2);
                    fj.l.e(objArrCopyOf, "copyOf(...)");
                    this.f17096a = (d[]) objArrCopyOf;
                    dVarArrF = (d[]) objArrCopyOf;
                }
                int i10 = this.f17098c;
                do {
                    dVarE = dVarArrF[i10];
                    if (dVarE == null) {
                        dVarE = e();
                        dVarArrF[i10] = dVarE;
                    }
                    i10++;
                    if (i10 >= dVarArrF.length) {
                        i10 = 0;
                    }
                } while (!dVarE.a(this));
                this.f17098c = i10;
                this.f17097b++;
                uVar = this.f17099d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (uVar != null) {
            uVar.w(1);
        }
        return dVarE;
    }

    public abstract d e();

    public abstract d[] f();

    public final void g(d dVar) {
        u uVar;
        int i10;
        ti.c[] cVarArrB;
        synchronized (this) {
            try {
                int i11 = this.f17097b - 1;
                this.f17097b = i11;
                uVar = this.f17099d;
                if (i11 == 0) {
                    this.f17098c = 0;
                }
                fj.l.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                cVarArrB = dVar.b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (ti.c cVar : cVarArrB) {
            if (cVar != null) {
                cVar.resumeWith(pi.o.f13011a);
            }
        }
        if (uVar != null) {
            uVar.w(-1);
        }
    }

    public final u h() {
        u uVar;
        synchronized (this) {
            uVar = this.f17099d;
            if (uVar == null) {
                int i10 = this.f17097b;
                uVar = new u(1, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, sj.a.f15040b);
                uVar.q(Integer.valueOf(i10));
                this.f17099d = uVar;
            }
        }
        return uVar;
    }
}
