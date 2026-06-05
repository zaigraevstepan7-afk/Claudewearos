package qj;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final d7.c f13548a = new d7.c("RESUME_TOKEN");

    /* renamed from: b, reason: collision with root package name */
    public static final d7.c f13549b = new d7.c("REMOVED_TASK");

    /* renamed from: c, reason: collision with root package name */
    public static final d7.c f13550c = new d7.c("CLOSED_EMPTY");

    /* renamed from: d, reason: collision with root package name */
    public static final d7.c f13551d = new d7.c("COMPLETING_ALREADY");

    /* renamed from: e, reason: collision with root package name */
    public static final d7.c f13552e = new d7.c("COMPLETING_WAITING_CHILDREN");

    /* renamed from: f, reason: collision with root package name */
    public static final d7.c f13553f = new d7.c("COMPLETING_RETRY");

    /* renamed from: g, reason: collision with root package name */
    public static final d7.c f13554g = new d7.c("TOO_LATE_TO_CANCEL");

    /* renamed from: h, reason: collision with root package name */
    public static final d7.c f13555h = new d7.c("SEALED");

    /* renamed from: i, reason: collision with root package name */
    public static final q0 f13556i = new q0(false);
    public static final q0 j = new q0(true);

    public static final Object A(ti.h hVar, ej.e eVar) throws Throwable {
        w0 w0VarA;
        ti.h hVarK;
        long jM0;
        Thread threadCurrentThread = Thread.currentThread();
        ti.g gVar = ti.d.f16335a;
        ti.e eVar2 = (ti.e) hVar.C(gVar);
        ti.i iVar = ti.i.f16336a;
        if (eVar2 == null) {
            w0VarA = v1.a();
            hVarK = k(iVar, hVar.V(w0VarA), true);
            xj.e eVar3 = m0.f13601a;
            if (hVarK != eVar3 && hVarK.C(gVar) == null) {
                hVarK = hVarK.V(eVar3);
            }
        } else {
            if (eVar2 instanceof w0) {
            }
            w0VarA = (w0) v1.f13630a.get();
            hVarK = k(iVar, hVar, true);
            xj.e eVar4 = m0.f13601a;
            if (hVarK != eVar4 && hVarK.C(gVar) == null) {
                hVarK = hVarK.V(eVar4);
            }
        }
        g gVar2 = new g(hVarK, threadCurrentThread, w0VarA);
        gVar2.j0(a0.f13538a, gVar2, eVar);
        w0 w0Var = gVar2.f13577e;
        if (w0Var != null) {
            int i10 = w0.f13633f;
            w0Var.l0(false);
        }
        while (true) {
            if (w0Var != null) {
                try {
                    jM0 = w0Var.m0();
                } catch (Throwable th2) {
                    if (w0Var != null) {
                        int i11 = w0.f13633f;
                        w0Var.i0(false);
                    }
                    throw th2;
                }
            } else {
                jM0 = Long.MAX_VALUE;
            }
            if (gVar2.M()) {
                break;
            }
            LockSupport.parkNanos(gVar2, jM0);
            if (Thread.interrupted()) {
                gVar2.m(new InterruptedException());
            }
        }
        if (w0Var != null) {
            int i12 = w0.f13633f;
            w0Var.i0(false);
        }
        Object objE = E(l1.f13598a.get(gVar2));
        t tVar = objE instanceof t ? (t) objE : null;
        if (tVar == null) {
            return objE;
        }
        throw tVar.f13622a;
    }

    public static final Object B(z1 z1Var, ej.e eVar) {
        r(z1Var, true, new p0(m(z1Var.f18119d.getContext()).Z(z1Var.f13645e, z1Var, z1Var.f13537c), 0));
        return u0.l.o(z1Var, false, z1Var, eVar);
    }

    public static final String C(ti.c cVar) {
        Object objR;
        if (cVar instanceof vj.g) {
            return ((vj.g) cVar).toString();
        }
        try {
            objR = cVar + '@' + n(cVar);
        } catch (Throwable th2) {
            objR = uk.c.r(th2);
        }
        if (pi.k.a(objR) != null) {
            objR = cVar.getClass().getName() + '@' + n(cVar);
        }
        return (String) objR;
    }

    public static final long D(long j4) {
        oj.f fVar = oj.a.f12531b;
        boolean z2 = j4 > 0;
        if (z2) {
            return oj.a.f(oj.a.o(j4, yd.f.k0(999999L, oj.c.f12536b)));
        }
        if (z2) {
            throw new b3.e();
        }
        return 0L;
    }

    public static final Object E(Object obj) {
        b1 b1Var;
        c1 c1Var = obj instanceof c1 ? (c1) obj : null;
        return (c1Var == null || (b1Var = c1Var.f13561a) == null) ? obj : b1Var;
    }

    public static final c2 F(ti.c cVar, ti.h hVar, Object obj) {
        c2 c2Var = null;
        if ((cVar instanceof vi.d) && hVar.C(d2.f13567a) != null) {
            vi.d callerFrame = (vi.d) cVar;
            while (true) {
                if ((callerFrame instanceof j0) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof c2) {
                    c2Var = (c2) callerFrame;
                    break;
                }
            }
            if (c2Var != null) {
                c2Var.n0(hVar, obj);
            }
        }
        return c2Var;
    }

    public static final Object G(ti.h hVar, ej.e eVar, ti.c cVar) throws Throwable {
        Object objE;
        ti.h context = cVar.getContext();
        ti.h hVarV = !((Boolean) hVar.F(new lb.d(23), Boolean.FALSE)).booleanValue() ? context.V(hVar) : k(context, hVar, false);
        j(hVarV);
        if (hVarV == context) {
            vj.q qVar = new vj.q(cVar, hVarV);
            objE = u0.l.o(qVar, true, qVar, eVar);
        } else {
            ti.d dVar = ti.d.f16335a;
            if (fj.l.b(hVarV.C(dVar), context.C(dVar))) {
                c2 c2Var = new c2(cVar, hVarV);
                ti.h hVar2 = c2Var.f13537c;
                Object objN = vj.b.n(hVar2, null);
                try {
                    Object objO = u0.l.o(c2Var, true, c2Var, eVar);
                    vj.b.g(hVar2, objN);
                    objE = objO;
                } catch (Throwable th2) {
                    vj.b.g(hVar2, objN);
                    throw th2;
                }
            } else {
                j0 j0Var = new j0(cVar, hVarV);
                try {
                    vj.b.h(pi.o.f13011a, u3.a.g(u3.a.a(eVar, j0Var, j0Var)));
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j0.f13585e;
                    while (true) {
                        int i10 = atomicIntegerFieldUpdater.get(j0Var);
                        if (i10 != 0) {
                            if (i10 != 2) {
                                throw new IllegalStateException("Already suspended");
                            }
                            objE = E(l1.f13598a.get(j0Var));
                            if (objE instanceof t) {
                                throw ((t) objE).f13622a;
                            }
                        } else if (atomicIntegerFieldUpdater.compareAndSet(j0Var, 0, 1)) {
                            objE = ui.a.f17085a;
                            break;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (th instanceof i0) {
                        th = ((i0) th).f13584a;
                    }
                    j0Var.resumeWith(uk.c.r(th));
                    throw th;
                }
            }
        }
        ui.a aVar = ui.a.f17085a;
        return objE;
    }

    public static final Object H(long j4, ej.e eVar, vi.c cVar) {
        if (j4 <= 0) {
            throw new y1("Timed out immediately", null);
        }
        Object objB = B(new z1(j4, cVar), eVar);
        ui.a aVar = ui.a.f17085a;
        return objB;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I(long r6, ej.e r8, vi.c r9) {
        /*
            boolean r0 = r9 instanceof qj.a2
            if (r0 == 0) goto L13
            r0 = r9
            qj.a2 r0 = (qj.a2) r0
            int r1 = r0.f13546c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13546c = r1
            goto L18
        L13:
            qj.a2 r0 = new qj.a2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f13545b
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f13546c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            fj.v r6 = r0.f13544a
            uk.c.R(r9)     // Catch: qj.y1 -> L29
            return r9
        L29:
            r7 = move-exception
            goto L57
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            uk.c.R(r9)
            r4 = 0
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 > 0) goto L3d
            goto L5d
        L3d:
            fj.v r9 = new fj.v
            r9.<init>()
            r0.f13544a = r9     // Catch: qj.y1 -> L55
            r0.f13546c = r3     // Catch: qj.y1 -> L55
            qj.z1 r2 = new qj.z1     // Catch: qj.y1 -> L55
            r2.<init>(r6, r0)     // Catch: qj.y1 -> L55
            r9.f6807a = r2     // Catch: qj.y1 -> L55
            java.lang.Object r6 = B(r2, r8)     // Catch: qj.y1 -> L55
            if (r6 != r1) goto L54
            return r1
        L54:
            return r6
        L55:
            r7 = move-exception
            r6 = r9
        L57:
            qj.e1 r8 = r7.f13643a
            java.lang.Object r6 = r6.f6807a
            if (r8 != r6) goto L5f
        L5d:
            r6 = 0
            return r6
        L5f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qj.b0.I(long, ej.e, vi.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J(k3.c r7) {
        /*
            ti.h r0 = r7.getContext()
            j(r0)
            ti.c r7 = u3.a.g(r7)
            boolean r1 = r7 instanceof vj.g
            if (r1 == 0) goto L12
            vj.g r7 = (vj.g) r7
            goto L13
        L12:
            r7 = 0
        L13:
            pi.o r1 = pi.o.f13011a
            if (r7 != 0) goto L1a
        L17:
            r7 = r1
            goto L88
        L1a:
            qj.v r2 = r7.f18095d
            boolean r3 = vj.b.j(r2, r0)
            r4 = 1
            if (r3 == 0) goto L2b
            r7.f18097f = r1
            r7.f13589c = r4
            r2.f0(r0, r7)
            goto L86
        L2b:
            qj.f2 r3 = new qj.f2
            qj.w r5 = qj.f2.f13574c
            r3.<init>(r5)
            ti.h r0 = r0.V(r3)
            r7.f18097f = r1
            r7.f13589c = r4
            r2.f0(r0, r7)
            boolean r0 = r3.f13575b
            if (r0 == 0) goto L86
            qj.w0 r0 = qj.v1.a()
            qi.j r2 = r0.f13636e
            if (r2 == 0) goto L4e
            boolean r2 = r2.isEmpty()
            goto L4f
        L4e:
            r2 = r4
        L4f:
            if (r2 == 0) goto L52
            goto L17
        L52:
            long r2 = r0.f13634c
            r5 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 < 0) goto L5f
            r2 = r4
            goto L60
        L5f:
            r2 = 0
        L60:
            if (r2 == 0) goto L6c
            r7.f18097f = r1
            r7.f13589c = r4
            r0.j0(r7)
            ui.a r7 = ui.a.f17085a
            goto L88
        L6c:
            r0.l0(r4)
            r7.run()     // Catch: java.lang.Throwable -> L7c
        L72:
            boolean r2 = r0.n0()     // Catch: java.lang.Throwable -> L7c
            if (r2 != 0) goto L72
        L78:
            r0.i0(r4)
            goto L17
        L7c:
            r2 = move-exception
            r7.g(r2)     // Catch: java.lang.Throwable -> L81
            goto L78
        L81:
            r7 = move-exception
            r0.i0(r4)
            throw r7
        L86:
            ui.a r7 = ui.a.f17085a
        L88:
            ui.a r0 = ui.a.f17085a
            if (r7 != r0) goto L8d
            return r7
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qj.b0.J(k3.c):java.lang.Object");
    }

    public static r a() {
        r rVar = new r(true);
        rVar.K(null);
        return rVar;
    }

    public static final vj.d b(ti.h hVar) {
        if (hVar.C(w.f13632b) == null) {
            hVar = hVar.V(new g1(null));
        }
        return new vj.d(hVar);
    }

    public static u1 c() {
        return new u1(null);
    }

    public static f0 d(z zVar, ti.h hVar, ej.e eVar, int i10) {
        if ((i10 & 1) != 0) {
            hVar = ti.i.f16336a;
        }
        a0 a0Var = a0.f13538a;
        ti.h hVarX = x(zVar, hVar);
        a0 a0Var2 = a0.f13538a;
        f0 f0Var = new f0(hVarX, true);
        f0Var.j0(a0Var, f0Var, eVar);
        return f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(vi.c r4) {
        /*
            boolean r0 = r4 instanceof qj.h0
            if (r0 == 0) goto L13
            r0 = r4
            qj.h0 r0 = (qj.h0) r0
            int r1 = r0.f13580b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13580b = r1
            goto L18
        L13:
            qj.h0 r0 = new qj.h0
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f13579a
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f13580b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L2b:
            uk.c.R(r4)
            goto L47
        L2f:
            uk.c.R(r4)
            r0.f13580b = r3
            qj.l r4 = new qj.l
            ti.c r0 = u3.a.g(r0)
            r4.<init>(r3, r0)
            r4.p()
            java.lang.Object r4 = r4.o()
            if (r4 != r1) goto L47
            return
        L47:
            b3.e r4 = new b3.e
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: qj.b0.e(vi.c):void");
    }

    public static final void f(z zVar, CancellationException cancellationException) {
        e1 e1Var = (e1) zVar.Q().C(w.f13632b);
        if (e1Var != null) {
            e1Var.e(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + zVar).toString());
        }
    }

    public static final void g(ti.h hVar, CancellationException cancellationException) {
        e1 e1Var = (e1) hVar.C(w.f13632b);
        if (e1Var != null) {
            e1Var.e(cancellationException);
        }
    }

    public static final Object h(ej.e eVar, ti.c cVar) {
        vj.q qVar = new vj.q(cVar, cVar.getContext());
        Object objO = u0.l.o(qVar, true, qVar, eVar);
        ui.a aVar = ui.a.f17085a;
        return objO;
    }

    public static final Object i(long j4, ti.c cVar) {
        if (j4 > 0) {
            l lVar = new l(1, u3.a.g(cVar));
            lVar.p();
            if (j4 < Long.MAX_VALUE) {
                m(lVar.f13597e).Q(j4, lVar);
            }
            Object objO = lVar.o();
            if (objO == ui.a.f17085a) {
                return objO;
            }
        }
        return pi.o.f13011a;
    }

    public static final void j(ti.h hVar) {
        e1 e1Var = (e1) hVar.C(w.f13632b);
        if (e1Var != null && !e1Var.b()) {
            throw e1Var.t();
        }
    }

    public static final ti.h k(ti.h hVar, ti.h hVar2, boolean z2) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) hVar.F(new lb.d(23), bool)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) hVar2.F(new lb.d(23), bool)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return hVar.V(hVar2);
        }
        lb.d dVar = new lb.d(24);
        ti.i iVar = ti.i.f16336a;
        ti.h hVar3 = (ti.h) hVar.F(dVar, iVar);
        Object objF = hVar2;
        if (zBooleanValue2) {
            objF = hVar2.F(new lb.d(25), iVar);
        }
        return hVar3.V((ti.h) objF);
    }

    public static final v l(Executor executor) {
        return new y0(executor);
    }

    public static final g0 m(ti.h hVar) {
        ti.f fVarC = hVar.C(ti.d.f16335a);
        g0 g0Var = fVarC instanceof g0 ? (g0) fVarC : null;
        return g0Var == null ? d0.f13564a : g0Var;
    }

    public static final String n(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final e1 o(ti.h hVar) {
        e1 e1Var = (e1) hVar.C(w.f13632b);
        if (e1Var != null) {
            return e1Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + hVar).toString());
    }

    public static final l p(ti.c cVar) {
        l lVar;
        l lVar2;
        if (!(cVar instanceof vj.g)) {
            return new l(1, cVar);
        }
        vj.g gVar = (vj.g) cVar;
        d7.c cVar2 = vj.b.f18085c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vj.g.A;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(gVar);
            lVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(gVar, cVar2);
                lVar2 = null;
                break;
            }
            if (obj instanceof l) {
                while (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, cVar2)) {
                    if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                        break;
                    }
                }
                lVar2 = (l) obj;
                break loop0;
            }
            if (obj != cVar2 && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (lVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = l.f13595z;
            Object obj2 = atomicReferenceFieldUpdater2.get(lVar2);
            if (!(obj2 instanceof s) || ((s) obj2).f13618d == null) {
                l.f13594f.set(lVar2, 536870911);
                atomicReferenceFieldUpdater2.set(lVar2, b.f13547a);
                lVar = lVar2;
            } else {
                lVar2.l();
            }
            if (lVar != null) {
                return lVar;
            }
        }
        return new l(2, cVar);
    }

    public static final void q(Throwable th2, ti.h hVar) {
        if (th2 instanceof i0) {
            th2 = ((i0) th2).f13584a;
        }
        try {
            x xVar = (x) hVar.C(w.f13631a);
            if (xVar != null) {
                xVar.l(th2, hVar);
            } else {
                vj.b.d(th2, hVar);
            }
        } catch (Throwable th3) {
            if (th2 != th3) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                mk.b.i(runtimeException, th2);
                th2 = runtimeException;
            }
            vj.b.d(th2, hVar);
        }
    }

    public static final o0 r(e1 e1Var, boolean z2, h1 h1Var) {
        if (e1Var instanceof l1) {
            return ((l1) e1Var).L(z2, h1Var);
        }
        return e1Var.O(h1Var.k(), z2, new k0.h1(1, h1Var, h1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0, 3));
    }

    public static final boolean s(z zVar) {
        e1 e1Var = (e1) zVar.Q().C(w.f13632b);
        if (e1Var != null) {
            return e1Var.b();
        }
        return true;
    }

    public static final boolean t(ti.h hVar) {
        e1 e1Var = (e1) hVar.C(w.f13632b);
        if (e1Var != null) {
            return e1Var.b();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(java.util.List r4, vi.c r5) {
        /*
            boolean r0 = r5 instanceof qj.f
            if (r0 == 0) goto L13
            r0 = r5
            qj.f r0 = (qj.f) r0
            int r1 = r0.f13572c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13572c = r1
            goto L18
        L13:
            qj.f r0 = new qj.f
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f13571b
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f13572c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.Iterator r4 = r0.f13570a
            uk.c.R(r5)
            goto L38
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            uk.c.R(r5)
            java.util.Iterator r4 = r4.iterator()
        L38:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4f
            java.lang.Object r5 = r4.next()
            qj.e1 r5 = (qj.e1) r5
            r0.f13570a = r4
            r0.f13572c = r3
            java.lang.Object r5 = r5.W(r0)
            if (r5 != r1) goto L38
            return r1
        L4f:
            pi.o r4 = pi.o.f13011a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: qj.b0.u(java.util.List, vi.c):java.lang.Object");
    }

    public static final s1 v(z zVar, ti.h hVar, a0 a0Var, ej.e eVar) {
        ti.h hVarX = x(zVar, hVar);
        a0Var.getClass();
        s1 m1Var = a0Var == a0.f13539b ? new m1(hVarX, eVar) : new s1(hVarX, true);
        m1Var.j0(a0Var, m1Var, eVar);
        return m1Var;
    }

    public static /* synthetic */ s1 w(z zVar, ti.h hVar, ej.e eVar, int i10) {
        a0 a0Var = a0.f13541d;
        if ((i10 & 1) != 0) {
            hVar = ti.i.f16336a;
        }
        if ((i10 & 2) != 0) {
            a0Var = a0.f13538a;
        }
        return v(zVar, hVar, a0Var, eVar);
    }

    public static final ti.h x(z zVar, ti.h hVar) {
        ti.h hVarK = k(zVar.Q(), hVar, true);
        xj.e eVar = m0.f13601a;
        return (hVarK == eVar || hVarK.C(ti.d.f16335a) != null) ? hVarK : hVarK.V(eVar);
    }

    public static final Object y(Object obj) {
        return obj instanceof t ? uk.c.r(((t) obj).f13622a) : obj;
    }

    public static final void z(l lVar, ti.c cVar, boolean z2) {
        Object obj = l.f13595z.get(lVar);
        Throwable thD = lVar.d(obj);
        Object objR = thD != null ? uk.c.r(thD) : lVar.e(obj);
        if (!z2) {
            cVar.resumeWith(objR);
            return;
        }
        fj.l.d(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        vj.g gVar = (vj.g) cVar;
        vi.c cVar2 = gVar.f18096e;
        Object obj2 = gVar.f18098z;
        ti.h context = cVar2.getContext();
        Object objN = vj.b.n(context, obj2);
        c2 c2VarF = objN != vj.b.f18086d ? F(cVar2, context, objN) : null;
        try {
            cVar2.resumeWith(objR);
            if (c2VarF == null || c2VarF.l0()) {
                vj.b.g(context, objN);
            }
        } catch (Throwable th2) {
            if (c2VarF == null || c2VarF.l0()) {
                vj.b.g(context, objN);
            }
            throw th2;
        }
    }
}
