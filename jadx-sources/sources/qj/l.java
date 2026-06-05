package qj;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class l extends k0 implements k, vi.d, e2 {
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final ti.c f13596d;

    /* renamed from: e, reason: collision with root package name */
    public final ti.h f13597e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13594f = AtomicIntegerFieldUpdater.newUpdater(l.class, "_decisionAndIndex$volatile");

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13595z = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_parentHandle$volatile");

    public l(int i10, ti.c cVar) {
        super(i10);
        this.f13596d = cVar;
        this.f13597e = cVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.f13547a;
    }

    public static Object D(q1 q1Var, Object obj, int i10, ej.f fVar) {
        if (obj instanceof t) {
            return obj;
        }
        if (i10 != 1 && i10 != 2) {
            return obj;
        }
        if (fVar != null || (q1Var instanceof j)) {
            return new s(obj, q1Var instanceof j ? (j) q1Var : null, fVar, (Throwable) null, 16);
        }
        return obj;
    }

    public static void w(q1 q1Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + q1Var + ", already has " + obj).toString());
    }

    public final void A() {
        ti.c cVar = this.f13596d;
        Throwable th2 = null;
        vj.g gVar = cVar instanceof vj.g ? (vj.g) cVar : null;
        if (gVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vj.g.A;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(gVar);
                d7.c cVar2 = vj.b.f18085c;
                if (obj == cVar2) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, cVar2, this)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != cVar2) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th2 = (Throwable) obj;
                }
            }
            if (th2 == null) {
                return;
            }
            l();
            x(th2);
        }
    }

    public final void B(Object obj, int i10, ej.f fVar) throws i0 {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13595z;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof q1) {
                Object objD = D((q1) obj2, obj, i10, fVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objD)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!v()) {
                    l();
                }
                m(i10);
                return;
            }
            if (obj2 instanceof m) {
                m mVar = (m) obj2;
                if (m.f13600c.compareAndSet(mVar, 0, 1)) {
                    if (fVar != null) {
                        j(fVar, mVar.f13622a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void C(v vVar, Object obj) throws i0 {
        ti.c cVar = this.f13596d;
        vj.g gVar = cVar instanceof vj.g ? (vj.g) cVar : null;
        B(obj, (gVar != null ? gVar.f18095d : null) == vVar ? 4 : this.f13589c, null);
    }

    public final d7.c E(Object obj, ej.f fVar) {
        d7.c cVar = b0.f13548a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13595z;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof q1)) {
                return null;
            }
            Object objD = D((q1) obj2, obj, this.f13589c, fVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objD)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!v()) {
                l();
            }
            return cVar;
        }
    }

    @Override // qj.e2
    public final void a(vj.r rVar, int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f13594f;
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        t(rVar);
    }

    @Override // qj.k0
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13595z;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof q1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof t) {
                return;
            }
            if (!(obj instanceof s)) {
                cancellationException2 = cancellationException;
                s sVar = new s(obj, (j) null, (ej.f) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, sVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            s sVar2 = (s) obj;
            if (sVar2.f13619e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            s sVarA = s.a(sVar2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, sVarA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            j jVar = sVar2.f13616b;
            if (jVar != null) {
                i(jVar, cancellationException);
            }
            ej.f fVar = sVar2.f13617c;
            if (fVar != null) {
                j(fVar, cancellationException, sVar2.f13615a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // qj.k0
    public final ti.c c() {
        return this.f13596d;
    }

    @Override // qj.k0
    public final Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    @Override // qj.k0
    public final Object e(Object obj) {
        return obj instanceof s ? ((s) obj).f13615a : obj;
    }

    @Override // qj.k
    public final d7.c f(Object obj, ej.f fVar) {
        return E(obj, fVar);
    }

    @Override // vi.d
    public final vi.d getCallerFrame() {
        ti.c cVar = this.f13596d;
        if (cVar instanceof vi.d) {
            return (vi.d) cVar;
        }
        return null;
    }

    @Override // ti.c
    public final ti.h getContext() {
        return this.f13597e;
    }

    @Override // qj.k0
    public final Object h() {
        return f13595z.get(this);
    }

    public final void i(j jVar, Throwable th2) {
        try {
            jVar.a(th2);
        } catch (Throwable th3) {
            b0.q(new b3.e("Exception in invokeOnCancellation handler for " + this, th3), this.f13597e);
        }
    }

    public final void j(ej.f fVar, Throwable th2, Object obj) {
        ti.h hVar = this.f13597e;
        try {
            fVar.c(th2, obj, hVar);
        } catch (Throwable th3) {
            b0.q(new b3.e("Exception in resume onCancellation handler for " + this, th3), hVar);
        }
    }

    public final void k(vj.r rVar, Throwable th2) {
        ti.h hVar = this.f13597e;
        int i10 = f13594f.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            rVar.h(i10, hVar);
        } catch (Throwable th3) {
            b0.q(new b3.e("Exception in invokeOnCancellation handler for " + this, th3), hVar);
        }
    }

    public final void l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
        o0 o0Var = (o0) atomicReferenceFieldUpdater.get(this);
        if (o0Var == null) {
            return;
        }
        o0Var.a();
        atomicReferenceFieldUpdater.set(this, p1.f13611a);
    }

    public final void m(int i10) throws i0 {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f13594f;
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z2 = i10 == 4;
                ti.c cVar = this.f13596d;
                if (!z2 && (cVar instanceof vj.g)) {
                    boolean z10 = i10 == 1 || i10 == 2;
                    int i13 = this.f13589c;
                    if (z10 == (i13 == 1 || i13 == 2)) {
                        vj.g gVar = (vj.g) cVar;
                        v vVar = gVar.f18095d;
                        ti.h context = gVar.f18096e.getContext();
                        if (vj.b.j(vVar, context)) {
                            vj.b.i(vVar, context, this);
                            return;
                        }
                        w0 w0VarA = v1.a();
                        if (w0VarA.f13634c >= 4294967296L) {
                            w0VarA.j0(this);
                            return;
                        }
                        w0VarA.l0(true);
                        try {
                            b0.z(this, cVar, true);
                            do {
                            } while (w0VarA.n0());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                b0.z(this, cVar, z2);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 1073741824 + (536870911 & i11)));
    }

    public Throwable n(l1 l1Var) {
        return l1Var.t();
    }

    public final Object o() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        e1 e1Var;
        boolean zV = v();
        do {
            atomicIntegerFieldUpdater = f13594f;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zV) {
                    A();
                }
                Object obj = f13595z.get(this);
                if (obj instanceof t) {
                    throw ((t) obj).f13622a;
                }
                int i12 = this.f13589c;
                if ((i12 != 1 && i12 != 2) || (e1Var = (e1) this.f13597e.C(w.f13632b)) == null || e1Var.b()) {
                    return e(obj);
                }
                CancellationException cancellationExceptionT = e1Var.t();
                b(cancellationExceptionT);
                throw cancellationExceptionT;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        if (((o0) A.get(this)) == null) {
            q();
        }
        if (zV) {
            A();
        }
        return ui.a.f17085a;
    }

    public final void p() {
        o0 o0VarQ = q();
        if (o0VarQ == null || (f13595z.get(this) instanceof q1)) {
            return;
        }
        o0VarQ.a();
        A.set(this, p1.f13611a);
    }

    public final o0 q() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        e1 e1Var = (e1) this.f13597e.C(w.f13632b);
        if (e1Var == null) {
            return null;
        }
        o0 o0VarR = b0.r(e1Var, true, new n(this, 0));
        do {
            atomicReferenceFieldUpdater = A;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, o0VarR)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return o0VarR;
    }

    @Override // qj.k
    public final void r(Object obj, ej.f fVar) throws i0 {
        B(obj, this.f13589c, fVar);
    }

    @Override // ti.c
    public final void resumeWith(Object obj) {
        Throwable thA = pi.k.a(obj);
        if (thA != null) {
            obj = new t(false, thA);
        }
        B(obj, this.f13589c, null);
    }

    public final void s(ej.c cVar) {
        t(new i(cVar, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a0, code lost:
    
        w(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a3, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(qj.q1 r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = qj.l.f13595z
            java.lang.Object r2 = r0.get(r7)
            boolean r1 = r2 instanceof qj.b
            if (r1 == 0) goto L19
        La:
            boolean r1 = r0.compareAndSet(r7, r2, r8)
            if (r1 == 0) goto L12
            goto L97
        L12:
            java.lang.Object r1 = r0.get(r7)
            if (r1 == r2) goto La
            goto L0
        L19:
            boolean r1 = r2 instanceof qj.j
            r3 = 0
            if (r1 != 0) goto La0
            boolean r1 = r2 instanceof vj.r
            if (r1 != 0) goto La0
            boolean r1 = r2 instanceof qj.t
            if (r1 == 0) goto L4d
            r0 = r2
            qj.t r0 = (qj.t) r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = qj.t.f13621b
            r4 = 0
            r5 = 1
            boolean r1 = r1.compareAndSet(r0, r4, r5)
            if (r1 == 0) goto L49
            boolean r1 = r2 instanceof qj.m
            if (r1 == 0) goto L97
            java.lang.Throwable r0 = r0.f13622a
            boolean r1 = r8 instanceof qj.j
            if (r1 == 0) goto L43
            qj.j r8 = (qj.j) r8
            r7.i(r8, r0)
            return
        L43:
            vj.r r8 = (vj.r) r8
            r7.k(r8, r0)
            return
        L49:
            w(r8, r2)
            throw r3
        L4d:
            boolean r1 = r2 instanceof qj.s
            if (r1 == 0) goto L80
            r1 = r2
            qj.s r1 = (qj.s) r1
            qj.j r4 = r1.f13616b
            if (r4 != 0) goto L7c
            boolean r4 = r8 instanceof vj.r
            if (r4 == 0) goto L5d
            goto L97
        L5d:
            r4 = r8
            qj.j r4 = (qj.j) r4
            java.lang.Throwable r5 = r1.f13619e
            if (r5 == 0) goto L68
            r7.i(r4, r5)
            return
        L68:
            r5 = 29
            qj.s r1 = qj.s.a(r1, r4, r3, r5)
        L6e:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L75
            goto L97
        L75:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L6e
            goto L0
        L7c:
            w(r8, r2)
            throw r3
        L80:
            boolean r1 = r8 instanceof vj.r
            if (r1 == 0) goto L85
            goto L97
        L85:
            r3 = r8
            qj.j r3 = (qj.j) r3
            qj.s r1 = new qj.s
            r5 = 0
            r6 = 28
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
        L91:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L98
        L97:
            return
        L98:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L91
            goto L0
        La0:
            w(r8, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: qj.l.t(qj.q1):void");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(y());
        sb2.append('(');
        sb2.append(b0.C(this.f13596d));
        sb2.append("){");
        Object obj = f13595z.get(this);
        sb2.append(obj instanceof q1 ? "Active" : obj instanceof m ? "Cancelled" : "Completed");
        sb2.append("}@");
        sb2.append(b0.n(this));
        return sb2.toString();
    }

    public final boolean u() {
        return f13595z.get(this) instanceof q1;
    }

    public final boolean v() {
        if (this.f13589c != 2) {
            return false;
        }
        ti.c cVar = this.f13596d;
        fj.l.d(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return vj.g.A.get((vj.g) cVar) != null;
    }

    @Override // qj.k
    public final boolean x(Throwable th2) {
        Throwable cancellationException;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13595z;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof q1)) {
                return false;
            }
            boolean z2 = (obj instanceof j) || (obj instanceof vj.r);
            if (th2 == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th2;
            }
            m mVar = new m(z2, cancellationException);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            q1 q1Var = (q1) obj;
            if (q1Var instanceof j) {
                i((j) obj, th2);
            } else if (q1Var instanceof vj.r) {
                k((vj.r) obj, th2);
            }
            if (!v()) {
                l();
            }
            m(this.f13589c);
            return true;
        }
    }

    public String y() {
        return "CancellableContinuation";
    }

    @Override // qj.k
    public final void z(Object obj) throws i0 {
        m(this.f13589c);
    }
}
