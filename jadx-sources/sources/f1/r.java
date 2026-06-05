package f1;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r implements o {
    public final q.h0 A;
    public final q.h0 B;
    public final q.g0 C;
    public final j1.a D;
    public final j1.a E;
    public final q.g0 F;
    public q.g0 G;
    public boolean H;
    public h2 I;
    public l1 J;
    public r K;
    public int L;
    public final ld.i M;
    public final p1.k N;
    public final i0 O;
    public int P;

    /* renamed from: a, reason: collision with root package name */
    public final p f6423a;

    /* renamed from: b, reason: collision with root package name */
    public final v2.f2 f6424b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f6425c = new AtomicReference(null);

    /* renamed from: d, reason: collision with root package name */
    public final Object f6426d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final q.j0 f6427e;

    /* renamed from: f, reason: collision with root package name */
    public final i1.h f6428f;

    /* renamed from: z, reason: collision with root package name */
    public final q.g0 f6429z;

    public r(p pVar, v2.f2 f2Var) {
        this.f6423a = pVar;
        this.f6424b = f2Var;
        q.j0 j0Var = new q.j0(new q.h0());
        this.f6427e = j0Var;
        i1.h hVar = new i1.h();
        if (pVar.d()) {
            hVar.D = new q.v();
        }
        if (pVar.f()) {
            hVar.e();
        }
        this.f6428f = hVar;
        this.f6429z = yd.f.q();
        this.A = new q.h0();
        this.B = new q.h0();
        this.C = yd.f.q();
        j1.a aVar = new j1.a();
        this.D = aVar;
        j1.a aVar2 = new j1.a();
        this.E = aVar2;
        this.F = yd.f.q();
        this.G = yd.f.q();
        ld.i iVar = new ld.i(pVar, 7);
        this.M = iVar;
        this.N = new p1.k();
        i0 i0Var = new i0(f2Var, pVar, i1.j.d(hVar), j0Var, aVar, aVar2, iVar, this);
        pVar.p(i0Var);
        this.O = i0Var;
    }

    public final void A(ej.e eVar) {
        boolean zI = i();
        q();
        p pVar = this.f6423a;
        if (!zI) {
            pVar.a(this, eVar);
            return;
        }
        i0 i0Var = this.O;
        i0Var.f6337z = 0;
        i0Var.f6336y = true;
        pVar.a(this, eVar);
        i0Var.v();
    }

    public final void a() {
        this.f6425c.set(null);
        this.D.l0();
        this.E.l0();
        q.j0 j0Var = this.f6427e;
        if (j0Var.f13094a.g()) {
            return;
        }
        p1.k kVar = this.N;
        try {
            kVar.g(j0Var, this.O.D());
            kVar.b();
        } finally {
            kVar.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r20, boolean r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            q.g0 r2 = r0.f6429z
            java.lang.Object r2 = r2.g(r1)
            if (r2 == 0) goto L9a
            boolean r3 = r2 instanceof q.h0
            q.h0 r4 = r0.A
            q.h0 r5 = r0.B
            q.g0 r6 = r0.F
            if (r3 == 0) goto L7d
            q.h0 r2 = (q.h0) r2
            java.lang.Object[] r3 = r2.f13082b
            long[] r2 = r2.f13081a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L9a
            r9 = 0
        L22:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L78
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L3c:
            if (r14 >= r12) goto L75
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L6c
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r3[r15]
            f1.t1 r15 = (f1.t1) r15
            boolean r16 = yd.f.Z(r6, r1, r15)
            if (r16 != 0) goto L6c
            f1.p0 r8 = r15.c(r1)
            r17 = r13
            f1.p0 r13 = f1.p0.f6407a
            if (r8 == r13) goto L6e
            q.g0 r8 = r15.f6459g
            if (r8 == 0) goto L68
            if (r21 != 0) goto L68
            r5.a(r15)
            goto L6e
        L68:
            r4.a(r15)
            goto L6e
        L6c:
            r17 = r13
        L6e:
            long r10 = r10 >> r17
            int r14 = r14 + 1
            r13 = r17
            goto L3c
        L75:
            r8 = r13
            if (r12 != r8) goto L9a
        L78:
            if (r9 == r7) goto L9a
            int r9 = r9 + 1
            goto L22
        L7d:
            f1.t1 r2 = (f1.t1) r2
            boolean r3 = yd.f.Z(r6, r1, r2)
            if (r3 != 0) goto L9a
            f1.p0 r1 = r2.c(r1)
            f1.p0 r3 = f1.p0.f6407a
            if (r1 == r3) goto L9a
            q.g0 r1 = r2.f6459g
            if (r1 == 0) goto L97
            if (r21 != 0) goto L97
            r5.a(r2)
            return
        L97:
            r4.a(r2)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.r.b(java.lang.Object, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0183 A[EDGE_INSN: B:73:0x0183->B:224:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.util.Set r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.r.c(java.util.Set, boolean):void");
    }

    public final void d() {
        synchronized (this.f6426d) {
            try {
                e(this.D);
                o();
            } catch (Throwable th2) {
                try {
                    if (!this.f6427e.f13094a.g()) {
                        p1.k kVar = this.N;
                        try {
                            kVar.g(this.f6427e, this.O.D());
                            kVar.b();
                            kVar.a();
                        } catch (Throwable th3) {
                            kVar.a();
                            throw th3;
                        }
                    }
                    throw th2;
                } catch (Throwable th4) {
                    a();
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(j1.a r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.r.e(j1.a):void");
    }

    public final void f() {
        synchronized (this.f6426d) {
            try {
                j1.a aVar = this.E;
                aVar.getClass();
                if (!aVar.f8606d.e0()) {
                    e(this.E);
                }
            } catch (Throwable th2) {
                try {
                    if (!this.f6427e.f13094a.g()) {
                        p1.k kVar = this.N;
                        try {
                            kVar.g(this.f6427e, this.O.D());
                            kVar.b();
                            kVar.a();
                        } catch (Throwable th3) {
                            kVar.a();
                            throw th3;
                        }
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }

    public final void g() {
        p1.k kVar;
        synchronized (this.f6426d) {
            try {
                this.O.f6333v = null;
                if (!this.f6427e.f13094a.g()) {
                    kVar = this.N;
                    try {
                        kVar.g(this.f6427e, this.O.D());
                        kVar.b();
                        kVar.a();
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                try {
                    if (!this.f6427e.f13094a.g()) {
                        kVar = this.N;
                        try {
                            kVar.g(this.f6427e, this.O.D());
                            kVar.b();
                            kVar.a();
                        } finally {
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.r.h():void");
    }

    public final boolean i() {
        boolean z2;
        synchronized (this.f6426d) {
            z2 = true;
            if (this.P != 1) {
                z2 = false;
            }
            if (z2) {
                this.P = 0;
            }
        }
        return z2;
    }

    public final void j(ej.e eVar) {
        try {
            synchronized (this.f6426d) {
                n();
                q.g0 g0Var = this.G;
                this.G = yd.f.q();
                try {
                    i0 i0Var = this.O;
                    h2 h2Var = this.I;
                    if (!i0Var.f6317e.f8606d.e0()) {
                        n.a("Expected applyChanges() to have been called");
                    }
                    i0Var.P = h2Var;
                    try {
                        i0Var.n(g0Var, eVar);
                    } finally {
                        i0Var.P = null;
                    }
                } catch (Throwable th2) {
                    this.G = g0Var;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (!this.f6427e.f13094a.g()) {
                    p1.k kVar = this.N;
                    try {
                        kVar.g(this.f6427e, this.O.D());
                        kVar.b();
                        kVar.a();
                    } catch (Throwable th4) {
                        kVar.a();
                        throw th4;
                    }
                }
                throw th3;
            } catch (Throwable th5) {
                a();
                throw th5;
            }
        }
    }

    public final l1 k(boolean z2, ej.e eVar) {
        if (this.J != null) {
            o1.b("A pausable composition is in progress");
        }
        l1 l1Var = new l1(this, this.f6423a, this.O, this.f6427e, eVar, z2, this.f6424b, this.f6426d);
        this.J = l1Var;
        return l1Var;
    }

    public final void l() {
        synchronized (this.f6426d) {
            try {
                if (this.J != null) {
                    o1.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z2 = this.f6428f.f8127b == 0;
                if (!z2 || !this.f6427e.f13094a.g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        p1.k kVar = this.N;
                        try {
                            kVar.g(this.f6427e, this.O.D());
                            if (!z2) {
                                i1.h hVar = this.f6428f;
                                p1.k kVar2 = this.N;
                                i1.k kVarX = hVar.x();
                                try {
                                    kVarX.n(kVarX.f8154t, new ab.g(9, kVar2, kVarX));
                                    kVarX.e(true);
                                    this.f6424b.m();
                                    kVar.c();
                                } catch (Throwable th2) {
                                    kVarX.e(false);
                                    throw th2;
                                }
                            }
                            kVar.b();
                            kVar.a();
                        } catch (Throwable th3) {
                            kVar.a();
                            throw th3;
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
                this.f6429z.a();
                this.C.a();
                this.G.a();
                this.D.l0();
                this.E.l0();
                i0 i0Var = this.O;
                i0Var.E.clear();
                i0Var.f6330s.clear();
                i0Var.f6317e.l0();
                i0Var.f6333v = null;
                this.P = 1;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void m() {
        synchronized (this.f6426d) {
            try {
                if (this.O.F) {
                    o1.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.P != 3) {
                    this.P = 3;
                    j1.a aVar = this.O.L;
                    if (aVar != null) {
                        e(aVar);
                    }
                    boolean z2 = this.f6428f.f8127b == 0;
                    if (!z2 || !this.f6427e.f13094a.g()) {
                        p1.k kVar = this.N;
                        try {
                            kVar.g(this.f6427e, this.O.D());
                            if (!z2) {
                                i1.h hVar = this.f6428f;
                                p1.k kVar2 = this.N;
                                i1.k kVarX = hVar.x();
                                try {
                                    kVarX.n(kVarX.f8154t, new b0.g2(kVar2, 5));
                                    kVarX.H();
                                    kVarX.e(true);
                                    this.f6424b.a();
                                    this.f6424b.m();
                                    kVar.c();
                                } catch (Throwable th2) {
                                    kVarX.e(false);
                                    throw th2;
                                }
                            }
                            kVar.b();
                            kVar.a();
                        } catch (Throwable th3) {
                            kVar.a();
                            throw th3;
                        }
                    }
                    i0 i0Var = this.O;
                    i0Var.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        i0Var.f6314b.u(i0Var);
                        i0Var.E.clear();
                        i0Var.f6330s.clear();
                        i0Var.f6317e.l0();
                        i0Var.f6333v = null;
                        i0Var.f6313a.a();
                        Trace.endSection();
                    } catch (Throwable th4) {
                        Trace.endSection();
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        this.f6423a.v(this);
    }

    public final void n() {
        Object obj = s.f6440a;
        AtomicReference atomicReference = this.f6425c;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                n.b("pending composition has not been applied");
                throw new b3.e();
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                n.b("corrupt pendingModifications drain: " + atomicReference);
                throw new b3.e();
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void o() {
        AtomicReference atomicReference = this.f6425c;
        Object andSet = atomicReference.getAndSet(null);
        if (fj.l.b(andSet, s.f6440a)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(set, false);
            }
            return;
        }
        if (andSet != null) {
            n.b("corrupt pendingModifications drain: " + atomicReference);
            throw new b3.e();
        }
        if (this.J == null) {
            n.a("calling recordModificationsOf and applyChanges concurrently is not supported");
        }
    }

    public final void p() {
        qi.u uVar = qi.u.f13522a;
        AtomicReference atomicReference = this.f6425c;
        Object andSet = atomicReference.getAndSet(uVar);
        if (fj.l.b(andSet, s.f6440a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            n.b("corrupt pendingModifications drain: " + atomicReference);
            throw new b3.e();
        }
        for (Set set : (Set[]) andSet) {
            c(set, false);
        }
    }

    public final void q() {
        int i10 = this.P;
        if (i10 != 0) {
            o1.b(i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.J == null) {
            return;
        }
        o1.b("A pausable composition is in progress");
    }

    public final void r(ArrayList arrayList) {
        q.j0 j0Var = this.f6427e;
        i0 i0Var = this.O;
        if (arrayList.size() > 0) {
            ((v0) ((pi.h) arrayList.get(0)).f13000a).getClass();
            throw null;
        }
        try {
            i0Var.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    i0Var.G(arrayList);
                    i0Var.i();
                } catch (Throwable th2) {
                    i0Var.a();
                    throw th2;
                }
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th3) {
            try {
                if (!j0Var.f13094a.g()) {
                    p1.k kVar = this.N;
                    try {
                        kVar.g(j0Var, i0Var.D());
                        kVar.b();
                        kVar.a();
                    } catch (Throwable th4) {
                        kVar.a();
                        throw th4;
                    }
                }
                throw th3;
            } catch (Throwable th5) {
                a();
                throw th5;
            }
        }
    }

    public final p0 s(t1 t1Var, Object obj) {
        r rVar;
        int i10 = t1Var.f6454b;
        if ((i10 & 2) != 0) {
            t1Var.f6454b = i10 | 4;
        }
        i1.b bVar = t1Var.f6455c;
        if (bVar == null || !bVar.a()) {
            return p0.f6407a;
        }
        i1.h hVar = this.f6428f;
        hVar.getClass();
        i1.b bVar2 = t1Var.f6455c;
        if (bVar2 != null && hVar.y(cg.b.g(bVar2))) {
            if (t1Var.f6456d == null) {
                return p0.f6407a;
            }
            p0 p0VarT = t(t1Var, bVar, obj);
            if (p0VarT != p0.f6407a) {
                this.M.y();
            }
            return p0VarT;
        }
        synchronized (this.f6426d) {
            rVar = this.K;
        }
        if (rVar != null) {
            i0 i0Var = rVar.O;
            if (i0Var.F && i0Var.g0(t1Var, obj)) {
                return p0.f6410d;
            }
        }
        return p0.f6407a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cc A[Catch: all -> 0x0044, EDGE_INSN: B:78:0x00cc->B:63:0x00cc BREAK  A[LOOP:0: B:47:0x008d->B:59:0x00c4], EDGE_INSN: B:79:0x00cc->B:63:0x00cc BREAK  A[LOOP:0: B:47:0x008d->B:59:0x00c4], TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0049, B:27:0x004f, B:32:0x005a, B:36:0x0060, B:37:0x0069, B:39:0x006d, B:40:0x0075, B:42:0x007d, B:44:0x0081, B:47:0x008d, B:49:0x009d, B:51:0x00a9, B:53:0x00b2, B:56:0x00bc, B:59:0x00c4, B:60:0x00c7, B:63:0x00cc), top: B:76:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final f1.p0 t(f1.t1 r20, i1.b r21, java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.r.t(f1.t1, i1.b, java.lang.Object):f1.p0");
    }

    public final void u(Object obj) {
        Object objG = this.f6429z.g(obj);
        if (objG == null) {
            return;
        }
        boolean z2 = objG instanceof q.h0;
        q.g0 g0Var = this.F;
        if (!z2) {
            t1 t1Var = (t1) objG;
            if (t1Var.c(obj) == p0.f6410d) {
                yd.f.d(g0Var, obj, t1Var);
                return;
            }
            return;
        }
        q.h0 h0Var = (q.h0) objG;
        Object[] objArr = h0Var.f13082b;
        long[] jArr = h0Var.f13081a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128) {
                        t1 t1Var2 = (t1) objArr[(i10 << 3) + i12];
                        if (t1Var2.c(obj) == p0.f6410d) {
                            yd.f.d(g0Var, obj, t1Var2);
                        }
                    }
                    j >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(java.util.Set r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof g1.h
            q.g0 r3 = r0.C
            q.g0 r4 = r0.f6429z
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L5e
            g1.h r1 = (g1.h) r1
            q.h0 r1 = r1.f7033a
            java.lang.Object[] r2 = r1.f13082b
            long[] r1 = r1.f13081a
            int r7 = r1.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7b
            r8 = r5
        L1c:
            r9 = r1[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L59
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r5
        L36:
            if (r13 >= r11) goto L57
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L53
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r2[r14]
            boolean r15 = r4.c(r14)
            if (r15 != 0) goto L52
            boolean r14 = r3.c(r14)
            if (r14 == 0) goto L53
        L52:
            return r6
        L53:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L36
        L57:
            if (r11 != r12) goto L7b
        L59:
            if (r8 == r7) goto L7b
            int r8 = r8 + 1
            goto L1c
        L5e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()
            boolean r7 = r4.c(r2)
            if (r7 != 0) goto L7a
            boolean r2 = r3.c(r2)
            if (r2 == 0) goto L64
        L7a:
            return r6
        L7b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.r.v(java.util.Set):boolean");
    }

    public final boolean w() {
        synchronized (this.f6426d) {
            l1 l1Var = this.J;
            boolean z2 = false;
            if (l1Var != null && (l1Var.f6380h.get() != m1.f6391e || l1Var.f6381i != p1.j.b())) {
                AtomicReference atomicReference = l1Var.f6380h;
                m1 m1Var = m1.f6392f;
                m1 m1Var2 = m1.f6390d;
                while (!atomicReference.compareAndSet(m1Var, m1Var2) && atomicReference.get() == m1Var) {
                }
                l1Var.f6383l.f6270a.a(9);
                return false;
            }
            n();
            try {
                q.g0 g0Var = this.G;
                this.G = yd.f.q();
                try {
                    i0 i0Var = this.O;
                    h2 h2Var = this.I;
                    j1.l0 l0Var = i0Var.f6317e.f8606d;
                    if (!l0Var.e0()) {
                        n.a("Expected applyChanges() to have been called");
                    }
                    if (g0Var.f13077e > 0 || !i0Var.f6330s.isEmpty()) {
                        i0Var.P = h2Var;
                        try {
                            i0Var.n(g0Var, null);
                            i0Var.P = null;
                            z2 = !l0Var.e0();
                        } catch (Throwable th2) {
                            i0Var.P = null;
                            throw th2;
                        }
                    }
                    if (!z2) {
                        o();
                    }
                    return z2;
                } catch (Throwable th3) {
                    this.G = g0Var;
                    throw th3;
                }
            } catch (Throwable th4) {
                try {
                    if (!this.f6427e.f13094a.g()) {
                        p1.k kVar = this.N;
                        try {
                            kVar.g(this.f6427e, this.O.D());
                            kVar.b();
                            kVar.a();
                        } catch (Throwable th5) {
                            kVar.a();
                            throw th5;
                        }
                    }
                    throw th4;
                } catch (Throwable th6) {
                    a();
                    throw th6;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.Set[]] */
    public final void x(g1.h hVar) {
        g1.h hVar2;
        while (true) {
            Object obj = this.f6425c.get();
            if (obj == null || obj.equals(s.f6440a)) {
                hVar2 = hVar;
            } else if (obj instanceof Set) {
                hVar2 = new Set[]{obj, hVar};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f6425c).toString());
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? CopyOf = Arrays.copyOf(setArr, length + 1);
                CopyOf[length] = hVar;
                hVar2 = CopyOf;
            }
            AtomicReference atomicReference = this.f6425c;
            while (!atomicReference.compareAndSet(obj, hVar2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.f6426d) {
                    o();
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.r.y(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f6426d
            monitor-enter(r0)
            r14.u(r15)     // Catch: java.lang.Throwable -> L4f
            q.g0 r1 = r14.C     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r15 = r1.g(r15)     // Catch: java.lang.Throwable -> L4f
            if (r15 == 0) goto L61
            boolean r1 = r15 instanceof q.h0     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L5c
            q.h0 r15 = (q.h0) r15     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r1 = r15.f13082b     // Catch: java.lang.Throwable -> L4f
            long[] r15 = r15.f13081a     // Catch: java.lang.Throwable -> L4f
            int r2 = r15.length     // Catch: java.lang.Throwable -> L4f
            int r2 = r2 + (-2)
            if (r2 < 0) goto L61
            r3 = 0
            r4 = r3
        L1f:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L4f
            long r7 = ~r5     // Catch: java.lang.Throwable -> L4f
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L4f
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L39:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L4f
            f1.y r10 = (f1.y) r10     // Catch: java.lang.Throwable -> L4f
            r14.u(r10)     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r15 = move-exception
            goto L63
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L39
        L55:
            if (r7 != r8) goto L61
        L57:
            if (r4 == r2) goto L61
            int r4 = r4 + 1
            goto L1f
        L5c:
            f1.y r15 = (f1.y) r15     // Catch: java.lang.Throwable -> L4f
            r14.u(r15)     // Catch: java.lang.Throwable -> L4f
        L61:
            monitor-exit(r0)
            return
        L63:
            monitor-exit(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.r.z(java.lang.Object):void");
    }
}
