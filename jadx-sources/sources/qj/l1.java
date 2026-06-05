package qj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class l1 implements e1, r1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13598a = AtomicReferenceFieldUpdater.newUpdater(l1.class, Object.class, "_state$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13599b = AtomicReferenceFieldUpdater.newUpdater(l1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public l1(boolean z2) {
        this._state$volatile = z2 ? b0.j : b0.f13556i;
    }

    public static p X(vj.j jVar) {
        while (jVar.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vj.j.f18106b;
            vj.j jVarF = jVar.f();
            if (jVarF == null) {
                Object obj = atomicReferenceFieldUpdater.get(jVar);
                while (true) {
                    jVar = (vj.j) obj;
                    if (!jVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVar);
                }
            } else {
                jVar = jVarF;
            }
        }
        while (true) {
            jVar = jVar.h();
            if (!jVar.i()) {
                if (jVar instanceof p) {
                    return (p) jVar;
                }
                if (jVar instanceof n1) {
                    return null;
                }
            }
        }
    }

    public static String e0(Object obj) {
        if (!(obj instanceof k1)) {
            return obj instanceof b1 ? ((b1) obj).b() ? "Active" : "New" : obj instanceof t ? "Cancelled" : "Completed";
        }
        k1 k1Var = (k1) obj;
        return k1Var.e() ? "Cancelling" : k1.f13590b.get(k1Var) == 1 ? "Completing" : "Active";
    }

    public final Object A() throws Throwable {
        Object obj = f13598a.get(this);
        if (obj instanceof b1) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof t) {
            throw ((t) obj).f13622a;
        }
        return b0.E(obj);
    }

    public final Throwable B(k1 k1Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (k1Var.e()) {
                return new f1(q(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i11);
            i11++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th2 = (Throwable) obj;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        if (th3 instanceof y1) {
            int size2 = arrayList.size();
            while (true) {
                if (i10 >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i10);
                i10++;
                Throwable th4 = (Throwable) obj3;
                if (th4 != th3 && (th4 instanceof y1)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj2;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    @Override // ti.h
    public final ti.f C(ti.g gVar) {
        return yd.f.w(this, gVar);
    }

    public boolean E() {
        return true;
    }

    @Override // ti.h
    public final Object F(ej.e eVar, Object obj) {
        return eVar.invoke(obj, this);
    }

    public boolean G() {
        return this instanceof r;
    }

    public final n1 H(b1 b1Var) {
        n1 n1VarC = b1Var.c();
        if (n1VarC != null) {
            return n1VarC;
        }
        if (b1Var instanceof q0) {
            return new n1();
        }
        if (b1Var instanceof h1) {
            c0((h1) b1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + b1Var).toString());
    }

    public boolean I(Throwable th2) {
        return false;
    }

    public final void K(e1 e1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13599b;
        p1 p1Var = p1.f13611a;
        if (e1Var == null) {
            atomicReferenceFieldUpdater.set(this, p1Var);
            return;
        }
        e1Var.start();
        o oVarP = e1Var.P(this);
        atomicReferenceFieldUpdater.set(this, oVarP);
        if (M()) {
            oVarP.a();
            atomicReferenceFieldUpdater.set(this, p1Var);
        }
    }

    public final o0 L(boolean z2, h1 h1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        p1 p1Var;
        boolean z10;
        boolean zD;
        h1Var.f13581d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f13598a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z11 = obj instanceof q0;
            p1Var = p1.f13611a;
            z10 = true;
            if (!z11) {
                if (!(obj instanceof b1)) {
                    z10 = false;
                    break;
                }
                b1 b1Var = (b1) obj;
                n1 n1VarC = b1Var.c();
                if (n1VarC == null) {
                    c0((h1) obj);
                } else {
                    if (h1Var.k()) {
                        k1 k1Var = b1Var instanceof k1 ? (k1) b1Var : null;
                        Throwable thD = k1Var != null ? k1Var.d() : null;
                        if (thD == null) {
                            zD = n1VarC.d(h1Var, 5);
                        } else if (z2) {
                            h1Var.l(thD);
                            return p1Var;
                        }
                    } else {
                        zD = n1VarC.d(h1Var, 1);
                    }
                    if (zD) {
                        break;
                    }
                }
            } else {
                q0 q0Var = (q0) obj;
                if (q0Var.f13612a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, h1Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                b0(q0Var);
            }
        }
        if (z10) {
            return h1Var;
        }
        if (z2) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            t tVar = obj2 instanceof t ? (t) obj2 : null;
            h1Var.l(tVar != null ? tVar.f13622a : null);
        }
        return p1Var;
    }

    public final boolean M() {
        return !(f13598a.get(this) instanceof b1);
    }

    public boolean N() {
        return this instanceof g;
    }

    @Override // qj.e1
    public final o0 O(boolean z2, boolean z10, k0.h1 h1Var) {
        return L(z10, z2 ? new d1(h1Var) : new p0(h1Var, 1));
    }

    @Override // qj.e1
    public final o P(l1 l1Var) {
        p pVar = new p(l1Var);
        pVar.f13581d = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13598a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof q0) {
                q0 q0Var = (q0) obj;
                if (q0Var.f13612a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, pVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                b0(q0Var);
            } else {
                boolean z2 = obj instanceof b1;
                p1 p1Var = p1.f13611a;
                if (!z2) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    t tVar = obj2 instanceof t ? (t) obj2 : null;
                    pVar.l(tVar != null ? tVar.f13622a : null);
                    return p1Var;
                }
                n1 n1VarC = ((b1) obj).c();
                if (n1VarC == null) {
                    c0((h1) obj);
                } else if (!n1VarC.d(pVar, 7)) {
                    boolean zD = n1VarC.d(pVar, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof k1) {
                        thD = ((k1) obj3).d();
                    } else {
                        t tVar2 = obj3 instanceof t ? (t) obj3 : null;
                        if (tVar2 != null) {
                            thD = tVar2.f13622a;
                        }
                    }
                    pVar.l(thD);
                    if (zD) {
                        break loop0;
                    }
                    return p1Var;
                }
            }
        }
        return pVar;
    }

    public final boolean R(Object obj) {
        Object objF0;
        do {
            objF0 = f0(f13598a.get(this), obj);
            if (objF0 == b0.f13551d) {
                return false;
            }
            if (objF0 == b0.f13552e) {
                return true;
            }
        } while (objF0 == b0.f13553f);
        i(objF0);
        return true;
    }

    public final Object S(Object obj) {
        Object objF0;
        do {
            objF0 = f0(f13598a.get(this), obj);
            if (objF0 == b0.f13551d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                t tVar = obj instanceof t ? (t) obj : null;
                throw new IllegalStateException(str, tVar != null ? tVar.f13622a : null);
            }
        } while (objF0 == b0.f13553f);
        return objF0;
    }

    @Override // qj.e1
    public final o0 T(ej.c cVar) {
        return L(true, new p0(cVar, 1));
    }

    public String U() {
        return getClass().getSimpleName();
    }

    @Override // ti.h
    public final ti.h V(ti.h hVar) {
        return yd.f.W(this, hVar);
    }

    @Override // qj.e1
    public final Object W(vi.c cVar) {
        Object obj;
        pi.o oVar;
        do {
            obj = f13598a.get(this);
            boolean z2 = obj instanceof b1;
            oVar = pi.o.f13011a;
            if (!z2) {
                b0.j(cVar.getContext());
                return oVar;
            }
        } while (d0(obj) < 0);
        l lVar = new l(1, u3.a.g(cVar));
        lVar.p();
        lVar.t(new i(b0.r(this, true, new n(lVar, 1)), 2));
        Object objO = lVar.o();
        ui.a aVar = ui.a.f17085a;
        if (objO != aVar) {
            objO = oVar;
        }
        return objO == aVar ? objO : oVar;
    }

    public final void Y(n1 n1Var, Throwable th2) {
        n1Var.d(new vj.i(4), 4);
        Object obj = vj.j.f18105a.get(n1Var);
        fj.l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        b3.e eVar = null;
        for (vj.j jVarH = (vj.j) obj; !jVarH.equals(n1Var); jVarH = jVarH.h()) {
            if ((jVarH instanceof h1) && ((h1) jVarH).k()) {
                try {
                    ((h1) jVarH).l(th2);
                } catch (Throwable th3) {
                    if (eVar != null) {
                        mk.b.i(eVar, th3);
                    } else {
                        eVar = new b3.e("Exception in completion handler " + jVarH + " for " + this, th3);
                    }
                }
            }
        }
        if (eVar != null) {
            J(eVar);
        }
        p(th2);
    }

    @Override // qj.e1
    public boolean b() {
        Object obj = f13598a.get(this);
        return (obj instanceof b1) && ((b1) obj).b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [qj.a1] */
    public final void b0(q0 q0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        n1 n1Var = new n1();
        if (!q0Var.f13612a) {
            n1Var = new a1(n1Var);
        }
        do {
            atomicReferenceFieldUpdater = f13598a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, q0Var, n1Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == q0Var);
    }

    public final void c0(h1 h1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        n1 n1Var = new n1();
        h1Var.getClass();
        vj.j.f18106b.set(n1Var, h1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = vj.j.f18105a;
        atomicReferenceFieldUpdater2.set(n1Var, h1Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(h1Var) == h1Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(h1Var, h1Var, n1Var)) {
                    if (atomicReferenceFieldUpdater2.get(h1Var) != h1Var) {
                        break;
                    }
                }
                n1Var.g(h1Var);
                break loop0;
            }
            break;
        }
        vj.j jVarH = h1Var.h();
        do {
            atomicReferenceFieldUpdater = f13598a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, h1Var, jVarH)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == h1Var);
    }

    public final int d0(Object obj) {
        boolean z2 = obj instanceof q0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13598a;
        if (z2) {
            if (((q0) obj).f13612a) {
                return 0;
            }
            q0 q0Var = b0.j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, q0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            a0();
            return 1;
        }
        if (!(obj instanceof a1)) {
            return 0;
        }
        n1 n1Var = ((a1) obj).f13543a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, n1Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        a0();
        return 1;
    }

    @Override // qj.e1
    public void e(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new f1(q(), null, this);
        }
        o(cancellationException);
    }

    public final Object f0(Object obj, Object obj2) {
        if (!(obj instanceof b1)) {
            return b0.f13551d;
        }
        if (((obj instanceof q0) || (obj instanceof h1)) && !(obj instanceof p) && !(obj2 instanceof t)) {
            b1 b1Var = (b1) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13598a;
            Object c1Var = obj2 instanceof b1 ? new c1((b1) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, b1Var, c1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != b1Var) {
                    return b0.f13553f;
                }
            }
            Z(obj2);
            v(b1Var, obj2);
            return obj2;
        }
        b1 b1Var2 = (b1) obj;
        n1 n1VarH = H(b1Var2);
        if (n1VarH == null) {
            return b0.f13553f;
        }
        k1 k1Var = b1Var2 instanceof k1 ? (k1) b1Var2 : null;
        if (k1Var == null) {
            k1Var = new k1(n1VarH, null);
        }
        synchronized (k1Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = k1.f13590b;
            if (atomicIntegerFieldUpdater.get(k1Var) == 1) {
                return b0.f13551d;
            }
            atomicIntegerFieldUpdater.set(k1Var, 1);
            if (k1Var != b1Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f13598a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, b1Var2, k1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != b1Var2) {
                        return b0.f13553f;
                    }
                }
            }
            boolean zE = k1Var.e();
            t tVar = obj2 instanceof t ? (t) obj2 : null;
            if (tVar != null) {
                k1Var.a(tVar.f13622a);
            }
            Throwable thD = zE ? null : k1Var.d();
            if (thD != null) {
                Y(n1VarH, thD);
            }
            p pVarX = X(n1VarH);
            if (pVarX != null && g0(k1Var, pVarX, obj2)) {
                return b0.f13552e;
            }
            n1VarH.d(new vj.i(2), 2);
            p pVarX2 = X(n1VarH);
            return (pVarX2 == null || !g0(k1Var, pVarX2, obj2)) ? y(k1Var, obj2) : b0.f13552e;
        }
    }

    public Object g() {
        return A();
    }

    public final boolean g0(k1 k1Var, p pVar, Object obj) {
        while (b0.r(pVar.f13608e, false, new j1(this, k1Var, pVar, obj)) == p1.f13611a) {
            pVar = X(pVar);
            if (pVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // ti.f
    public final ti.g getKey() {
        return w.f13632b;
    }

    @Override // qj.e1
    public final boolean isCancelled() {
        Object obj = f13598a.get(this);
        if (obj instanceof t) {
            return true;
        }
        return (obj instanceof k1) && ((k1) obj).e();
    }

    public void j(Object obj) {
        i(obj);
    }

    public final Object k(vi.c cVar) throws Throwable {
        Object obj;
        do {
            obj = f13598a.get(this);
            if (!(obj instanceof b1)) {
                if (obj instanceof t) {
                    throw ((t) obj).f13622a;
                }
                return b0.E(obj);
            }
        } while (d0(obj) < 0);
        i1 i1Var = new i1(u3.a.g(cVar), this);
        i1Var.p();
        int i10 = 2;
        i1Var.t(new i(b0.r(this, true, new p0(i1Var, i10)), i10));
        Object objO = i1Var.o();
        ui.a aVar = ui.a.f17085a;
        return objO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r0
      0x003e: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v13 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qj.l1.m(java.lang.Object):boolean");
    }

    @Override // qj.e1
    public final mj.f n() {
        return new mj.i(new d1.a0(this, (ti.c) null, 2));
    }

    public void o(CancellationException cancellationException) {
        m(cancellationException);
    }

    public final boolean p(Throwable th2) {
        if (N()) {
            return true;
        }
        boolean z2 = th2 instanceof CancellationException;
        o oVar = (o) f13599b.get(this);
        return (oVar == null || oVar == p1.f13611a) ? z2 : oVar.e(th2) || z2;
    }

    public String q() {
        return "Job was cancelled";
    }

    @Override // ti.h
    public final ti.h s(ti.g gVar) {
        return yd.f.N(this, gVar);
    }

    @Override // qj.e1
    public final boolean start() {
        int iD0;
        do {
            iD0 = d0(f13598a.get(this));
            if (iD0 == 0) {
                return false;
            }
        } while (iD0 != 1);
        return true;
    }

    @Override // qj.e1
    public final CancellationException t() {
        CancellationException cancellationException;
        Object obj = f13598a.get(this);
        if (!(obj instanceof k1)) {
            if (obj instanceof b1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof t)) {
                return new f1(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th2 = ((t) obj).f13622a;
            cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            return cancellationException == null ? new f1(q(), th2, this) : cancellationException;
        }
        Throwable thD = ((k1) obj).d();
        if (thD == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thD instanceof CancellationException ? (CancellationException) thD : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = q();
        }
        return new f1(strConcat, thD, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(U() + '{' + e0(f13598a.get(this)) + '}');
        sb2.append('@');
        sb2.append(b0.n(this));
        return sb2.toString();
    }

    public boolean u(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return m(th2) && E();
    }

    public final void v(b1 b1Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13599b;
        o oVar = (o) atomicReferenceFieldUpdater.get(this);
        if (oVar != null) {
            oVar.a();
            atomicReferenceFieldUpdater.set(this, p1.f13611a);
        }
        b3.e eVar = null;
        t tVar = obj instanceof t ? (t) obj : null;
        Throwable th2 = tVar != null ? tVar.f13622a : null;
        if (b1Var instanceof h1) {
            try {
                ((h1) b1Var).l(th2);
                return;
            } catch (Throwable th3) {
                J(new b3.e("Exception in completion handler " + b1Var + " for " + this, th3));
                return;
            }
        }
        n1 n1VarC = b1Var.c();
        if (n1VarC != null) {
            n1VarC.d(new vj.i(1), 1);
            Object obj2 = vj.j.f18105a.get(n1VarC);
            fj.l.d(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (vj.j jVarH = (vj.j) obj2; !jVarH.equals(n1VarC); jVarH = jVarH.h()) {
                if (jVarH instanceof h1) {
                    try {
                        ((h1) jVarH).l(th2);
                    } catch (Throwable th4) {
                        if (eVar != null) {
                            mk.b.i(eVar, th4);
                        } else {
                            eVar = new b3.e("Exception in completion handler " + jVarH + " for " + this, th4);
                        }
                    }
                }
            }
            if (eVar != null) {
                J(eVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable w(Object obj) {
        CancellationException cancellationExceptionD;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        l1 l1Var = (l1) ((r1) obj);
        Object obj2 = f13598a.get(l1Var);
        if (obj2 instanceof k1) {
            cancellationExceptionD = ((k1) obj2).d();
        } else if (obj2 instanceof t) {
            cancellationExceptionD = ((t) obj2).f13622a;
        } else {
            if (obj2 instanceof b1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            cancellationExceptionD = null;
        }
        CancellationException cancellationException = cancellationExceptionD instanceof CancellationException ? cancellationExceptionD : null;
        return cancellationException == null ? new f1("Parent job is ".concat(e0(obj2)), cancellationExceptionD, l1Var) : cancellationException;
    }

    public final Object y(k1 k1Var, Object obj) {
        Throwable thB;
        t tVar = obj instanceof t ? (t) obj : null;
        Throwable th2 = tVar != null ? tVar.f13622a : null;
        synchronized (k1Var) {
            k1Var.e();
            ArrayList arrayListF = k1Var.f(th2);
            thB = B(k1Var, arrayListF);
            if (thB != null && arrayListF.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                int size = arrayListF.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayListF.get(i10);
                    i10++;
                    Throwable th3 = (Throwable) obj2;
                    if (th3 != thB && th3 != thB && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                        mk.b.i(thB, th3);
                    }
                }
            }
        }
        if (thB != null && thB != th2) {
            obj = new t(false, thB);
        }
        if (thB != null && (p(thB) || I(thB))) {
            fj.l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            t.f13621b.compareAndSet((t) obj, 0, 1);
        }
        Z(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13598a;
        Object c1Var = obj instanceof b1 ? new c1((b1) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, k1Var, c1Var) && atomicReferenceFieldUpdater.get(this) == k1Var) {
        }
        v(k1Var, obj);
        return obj;
    }

    public void a0() {
    }

    public void J(b3.e eVar) {
        throw eVar;
    }

    public void Z(Object obj) {
    }

    public void i(Object obj) {
    }
}
