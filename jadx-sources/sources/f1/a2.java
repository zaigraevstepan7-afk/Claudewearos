package f1;

import android.util.Log;
import c1.s3;
import com.google.android.gms.internal.ads.zzbch;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a2 extends p {

    /* renamed from: a, reason: collision with root package name */
    public final e f6244a;

    /* renamed from: b, reason: collision with root package name */
    public final ac.d f6245b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6246c;

    /* renamed from: d, reason: collision with root package name */
    public qj.e1 f6247d;

    /* renamed from: e, reason: collision with root package name */
    public Throwable f6248e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f6249f;

    /* renamed from: g, reason: collision with root package name */
    public Object f6250g;

    /* renamed from: h, reason: collision with root package name */
    public q.h0 f6251h;

    /* renamed from: i, reason: collision with root package name */
    public final g1.e f6252i;
    public final ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f6253k;

    /* renamed from: l, reason: collision with root package name */
    public final q.g0 f6254l;

    /* renamed from: m, reason: collision with root package name */
    public final mh.g f6255m;

    /* renamed from: n, reason: collision with root package name */
    public final q.g0 f6256n;

    /* renamed from: o, reason: collision with root package name */
    public final q.g0 f6257o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f6258p;

    /* renamed from: q, reason: collision with root package name */
    public q.h0 f6259q;

    /* renamed from: r, reason: collision with root package name */
    public qj.l f6260r;

    /* renamed from: s, reason: collision with root package name */
    public final tj.r0 f6261s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6262t;

    /* renamed from: u, reason: collision with root package name */
    public final tj.r0 f6263u;

    /* renamed from: v, reason: collision with root package name */
    public final p1.l f6264v;

    /* renamed from: w, reason: collision with root package name */
    public final qj.g1 f6265w;

    /* renamed from: x, reason: collision with root package name */
    public final ti.h f6266x;

    /* renamed from: y, reason: collision with root package name */
    public final f f6267y;

    /* renamed from: z, reason: collision with root package name */
    public static final tj.r0 f6243z = tj.i0.b(n1.b.f11856d);
    public static final AtomicReference A = new AtomicReference(Boolean.FALSE);

    public a2(ti.h hVar) {
        e eVar = new e(new u1(this, 0));
        this.f6244a = eVar;
        this.f6245b = new ac.d(new u1(this, 1));
        this.f6246c = new Object();
        this.f6249f = new ArrayList();
        this.f6251h = new q.h0();
        this.f6252i = new g1.e(new r[16]);
        this.j = new ArrayList();
        this.f6253k = new ArrayList();
        this.f6254l = new q.g0();
        this.f6255m = new mh.g(11);
        this.f6256n = new q.g0();
        this.f6257o = new q.g0();
        this.f6261s = tj.i0.b(null);
        this.f6263u = tj.i0.b(w1.f6473c);
        this.f6264v = new p1.l(0);
        qj.g1 g1Var = new qj.g1((qj.e1) hVar.C(qj.w.f13632b));
        g1Var.T(new ab.k(this, 17));
        this.f6265w = g1Var;
        this.f6266x = hVar.V(eVar).V(g1Var);
        this.f6267y = new f(9);
    }

    public static final void G(ArrayList arrayList, a2 a2Var, r rVar) {
        arrayList.clear();
        synchronized (a2Var.f6246c) {
            Iterator it = a2Var.f6253k.iterator();
            if (it.hasNext()) {
                ((v0) it.next()).getClass();
                throw null;
            }
        }
    }

    public static void w(t1.b bVar) {
        try {
            if (bVar.w() instanceof t1.h) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            bVar.c();
        }
    }

    public final boolean A() {
        return this.f6252i.f7026c != 0 || z() || B() || this.f6254l.j();
    }

    public final boolean B() {
        return !this.f6262t && (((p1.a) ((ak.v) this.f6245b.f374c).f732c).get() & 134217727) > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f6246c
            monitor-enter(r0)
            q.h0 r1 = r2.f6251h     // Catch: java.lang.Throwable -> L21
            boolean r1 = r1.h()     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L23
            g1.e r1 = r2.f6252i     // Catch: java.lang.Throwable -> L21
            int r1 = r1.f7026c     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L12
            goto L23
        L12:
            boolean r1 = r2.z()     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L23
            boolean r1 = r2.B()     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L1f
            goto L23
        L1f:
            r1 = 0
            goto L24
        L21:
            r1 = move-exception
            goto L26
        L23:
            r1 = 1
        L24:
            monitor-exit(r0)
            return r1
        L26:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.a2.C():boolean");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final List D() {
        ?? r02 = this.f6250g;
        if (r02 != 0) {
            return r02;
        }
        ArrayList arrayList = this.f6249f;
        List arrayList2 = arrayList.isEmpty() ? qi.s.f13520a : new ArrayList(arrayList);
        this.f6250g = arrayList2;
        return arrayList2;
    }

    public final void E() {
        qj.k kVarY;
        synchronized (this.f6246c) {
            kVarY = y();
            if (((w1) this.f6263u.getValue()).compareTo(w1.f6472b) <= 0) {
                Throwable th2 = this.f6248e;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th2);
                throw cancellationException;
            }
        }
        if (kVarY != null) {
            ((qj.l) kVarY).resumeWith(pi.o.f13011a);
        }
    }

    public final void F(r rVar) {
        synchronized (this.f6246c) {
            ArrayList arrayList = this.f6253k;
            if (arrayList.size() > 0) {
                ((v0) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x013b, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0140, code lost:
    
        if (r4 >= r3) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014a, code lost:
    
        if (((pi.h) r10.get(r4)).f13001b == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014f, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015d, code lost:
    
        if (r8 >= r4) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015f, code lost:
    
        r11 = (pi.h) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0167, code lost:
    
        if (r11.f13001b != null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0169, code lost:
    
        r11 = (f1.v0) r11.f13000a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0170, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0173, code lost:
    
        r4 = r17.f6246c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0175, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0176, code lost:
    
        qi.q.u0(r17.f6253k, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017b, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017c, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018a, code lost:
    
        if (r8 >= r4) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018c, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0195, code lost:
    
        if (((pi.h) r11).f13001b == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0197, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x019a, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019d, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List H(java.util.List r18, q.h0 r19) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.a2.H(java.util.List, q.h0):java.util.List");
    }

    public final r I(r rVar, q.h0 h0Var) {
        t1.b bVarC;
        if (rVar.O.F || rVar.P == 3) {
            return null;
        }
        q.h0 h0Var2 = this.f6259q;
        if (h0Var2 == null || !h0Var2.c(rVar)) {
            ab.k kVar = new ab.k(rVar, 16);
            b0.c1 c1Var = new b0.c1(20, rVar, h0Var);
            t1.g gVarJ = t1.m.j();
            t1.b bVar = gVarJ instanceof t1.b ? (t1.b) gVarJ : null;
            if (bVar == null || (bVarC = bVar.C(kVar, c1Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                t1.g gVarJ2 = bVarC.j();
                if (h0Var != null) {
                    try {
                        if (h0Var.h()) {
                            s3 s3Var = new s3(6, h0Var, rVar);
                            i0 i0Var = rVar.O;
                            if (i0Var.F) {
                                n.a("Preparing a composition while composing is not supported");
                            }
                            i0Var.F = true;
                            try {
                                s3Var.a();
                                i0Var.F = false;
                            } catch (Throwable th2) {
                                i0Var.F = false;
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        t1.g.q(gVarJ2);
                        throw th3;
                    }
                }
                boolean zW = rVar.w();
                t1.g.q(gVarJ2);
                if (zW) {
                    return rVar;
                }
            } finally {
                w(bVarC);
            }
        }
        return null;
    }

    public final void J(Throwable th2, r rVar) throws Throwable {
        if (!((Boolean) A.get()).booleanValue() || (th2 instanceof l)) {
            synchronized (this.f6246c) {
                Log.e("ComposeInternal", "Error was captured in composition.", th2);
                v1 v1Var = (v1) this.f6261s.getValue();
                if (v1Var != null) {
                    throw v1Var.f6467a;
                }
                tj.r0 r0Var = this.f6261s;
                v1 v1Var2 = new v1(th2);
                r0Var.getClass();
                r0Var.k(null, v1Var2);
            }
            throw th2;
        }
        synchronized (this.f6246c) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th2);
                this.j.clear();
                this.f6252i.h();
                this.f6251h = new q.h0();
                this.f6253k.clear();
                this.f6254l.a();
                this.f6256n.a();
                tj.r0 r0Var2 = this.f6261s;
                v1 v1Var3 = new v1(th2);
                r0Var2.getClass();
                r0Var2.k(null, v1Var3);
                if (rVar != null) {
                    L(rVar);
                }
                if (y() != null) {
                    n.a("expected to go to inactive state due to composition error");
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean K() {
        boolean zA;
        synchronized (this.f6246c) {
            if (this.f6251h.g()) {
                return A();
            }
            List listD = D();
            g1.h hVar = new g1.h(this.f6251h);
            this.f6251h = new q.h0();
            try {
                int size = listD.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((r) listD.get(i10)).x(hVar);
                    if (((w1) this.f6263u.getValue()).compareTo(w1.f6472b) <= 0) {
                        break;
                    }
                }
                synchronized (this.f6246c) {
                    if (y() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zA = A();
                }
                return zA;
            } catch (Throwable th2) {
                synchronized (this.f6246c) {
                    q.h0 h0Var = this.f6251h;
                    h0Var.getClass();
                    Iterator<E> it = hVar.iterator();
                    while (it.hasNext()) {
                        h0Var.j(it.next());
                    }
                    throw th2;
                }
            }
        }
    }

    public final void L(r rVar) {
        ArrayList arrayList = this.f6258p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f6258p = arrayList;
        }
        if (!arrayList.contains(rVar)) {
            arrayList.add(rVar);
        }
        if (this.f6249f.remove(rVar)) {
            this.f6250g = null;
        }
    }

    @Override // f1.p
    public final void a(r rVar, ej.e eVar) throws Throwable {
        w1 w1Var;
        boolean zContains;
        t1.b bVarC;
        boolean z2 = rVar.O.F;
        synchronized (this.f6246c) {
            w1 w1Var2 = (w1) this.f6263u.getValue();
            w1Var = w1.f6472b;
            zContains = w1Var2.compareTo(w1Var) > 0 ? true ^ D().contains(rVar) : true;
        }
        try {
            ab.k kVar = new ab.k(rVar, 16);
            b0.c1 c1Var = new b0.c1(20, rVar, (Object) null);
            t1.g gVarJ = t1.m.j();
            t1.b bVar = gVarJ instanceof t1.b ? (t1.b) gVarJ : null;
            if (bVar == null || (bVarC = bVar.C(kVar, c1Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                t1.g gVarJ2 = bVarC.j();
                try {
                    rVar.j(eVar);
                    synchronized (this.f6246c) {
                        if (((w1) this.f6263u.getValue()).compareTo(w1Var) > 0 && !D().contains(rVar)) {
                            this.f6249f.add(rVar);
                            this.f6250g = null;
                        }
                    }
                    if (!z2) {
                        t1.m.j().m();
                    }
                    try {
                        F(rVar);
                        try {
                            rVar.d();
                            rVar.f();
                            if (z2) {
                                return;
                            }
                            t1.m.j().m();
                        } catch (Throwable th2) {
                            J(th2, null);
                        }
                    } catch (Throwable th3) {
                        J(th3, rVar);
                    }
                } finally {
                    t1.g.q(gVarJ2);
                }
            } finally {
                w(bVarC);
            }
        } catch (Throwable th4) {
            if (zContains) {
                synchronized (this.f6246c) {
                }
            }
            J(th4, rVar);
        }
    }

    @Override // f1.p
    public final q.h0 b(r rVar, h2 h2Var, ej.e eVar) {
        p1.l lVar = this.f6264v;
        try {
            h2 h2Var2 = rVar.I;
            rVar.I = h2Var;
            try {
                a(rVar, eVar);
                q.h0 h0Var = (q.h0) lVar.get();
                if (h0Var == null) {
                    h0Var = q.o0.f13110a;
                    fj.l.d(h0Var, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
                }
                return h0Var;
            } finally {
                rVar.I = h2Var2;
            }
        } finally {
            lVar.C(null);
        }
    }

    @Override // f1.p
    public final boolean d() {
        return ((Boolean) A.get()).booleanValue();
    }

    @Override // f1.p
    public final boolean e() {
        return false;
    }

    @Override // f1.p
    public final boolean f() {
        return false;
    }

    @Override // f1.p
    public final long g() {
        return zzbch.zzq.zzf;
    }

    @Override // f1.p
    public final o h() {
        return null;
    }

    @Override // f1.p
    public final ti.h j() {
        return this.f6266x;
    }

    @Override // f1.p
    public final boolean k() {
        return false;
    }

    @Override // f1.p
    public final void l(r rVar) {
        qj.k kVarY;
        synchronized (this.f6246c) {
            if (this.f6252i.i(rVar)) {
                kVarY = null;
            } else {
                this.f6252i.b(rVar);
                kVarY = y();
            }
        }
        if (kVarY != null) {
            ((qj.l) kVarY).resumeWith(pi.o.f13011a);
        }
    }

    @Override // f1.p
    public final u0 m(v0 v0Var) {
        u0 u0Var;
        synchronized (this.f6246c) {
            u0Var = (u0) this.f6256n.k(v0Var);
        }
        return u0Var;
    }

    @Override // f1.p
    public final q.h0 n(r rVar, h2 h2Var, q.h0 h0Var) {
        p1.l lVar = this.f6264v;
        try {
            K();
            rVar.x(new g1.h(h0Var));
            h2 h2Var2 = rVar.I;
            rVar.I = h2Var;
            try {
                r rVarI = I(rVar, null);
                if (rVarI != null) {
                    F(rVar);
                    rVarI.d();
                    rVarI.f();
                }
                q.h0 h0Var2 = (q.h0) lVar.get();
                if (h0Var2 == null) {
                    h0Var2 = q.o0.f13110a;
                    fj.l.d(h0Var2, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
                }
                return h0Var2;
            } finally {
                rVar.I = h2Var2;
            }
        } finally {
            lVar.C(null);
        }
    }

    @Override // f1.p
    public final void q(t1 t1Var) {
        p1.l lVar = this.f6264v;
        q.h0 h0Var = (q.h0) lVar.get();
        if (h0Var == null) {
            q.h0 h0Var2 = q.o0.f13110a;
            h0Var = new q.h0();
            lVar.C(h0Var);
        }
        h0Var.a(t1Var);
    }

    @Override // f1.p
    public final void r(r rVar) {
        synchronized (this.f6246c) {
            try {
                q.h0 h0Var = this.f6259q;
                if (h0Var == null) {
                    q.h0 h0Var2 = q.o0.f13110a;
                    h0Var = new q.h0();
                    this.f6259q = h0Var;
                }
                h0Var.a(rVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // f1.p
    public final g s(a2.f0 f0Var) {
        ac.d dVar = this.f6245b;
        ak.v vVar = (ak.v) dVar.f374c;
        c1 c1Var = new c1();
        c1Var.f6276a = f0Var;
        return vVar.g(c1Var, (s3) dVar.f375d);
    }

    @Override // f1.p
    public final void v(r rVar) {
        synchronized (this.f6246c) {
            if (this.f6249f.remove(rVar)) {
                this.f6250g = null;
            }
            this.f6252i.k(rVar);
            this.j.remove(rVar);
        }
    }

    public final void x() {
        synchronized (this.f6246c) {
            if (((w1) this.f6263u.getValue()).compareTo(w1.f6475e) >= 0) {
                tj.r0 r0Var = this.f6263u;
                w1 w1Var = w1.f6472b;
                r0Var.getClass();
                r0Var.k(null, w1Var);
            }
        }
        this.f6265w.e(null);
    }

    public final qj.k y() {
        w1 w1Var;
        tj.r0 r0Var = this.f6263u;
        int iCompareTo = ((w1) r0Var.getValue()).compareTo(w1.f6472b);
        tj.r0 r0Var2 = this.f6261s;
        ArrayList arrayList = this.f6253k;
        ArrayList arrayList2 = this.j;
        g1.e eVar = this.f6252i;
        if (iCompareTo > 0) {
            if (r0Var2.getValue() != null) {
                w1Var = w1.f6473c;
            } else if (this.f6247d == null) {
                this.f6251h = new q.h0();
                eVar.h();
                w1Var = (z() || B()) ? w1.f6474d : w1.f6473c;
            } else {
                w1Var = (eVar.f7026c != 0 || this.f6251h.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || z() || B() || this.f6254l.j()) ? w1.f6476f : w1.f6475e;
            }
            r0Var.getClass();
            r0Var.k(null, w1Var);
            if (w1Var != w1.f6476f) {
                return null;
            }
            qj.l lVar = this.f6260r;
            this.f6260r = null;
            return lVar;
        }
        List listD = D();
        int size = listD.size();
        for (int i10 = 0; i10 < size; i10++) {
        }
        this.f6249f.clear();
        this.f6250g = qi.s.f13520a;
        this.f6251h = new q.h0();
        eVar.h();
        arrayList2.clear();
        arrayList.clear();
        this.f6258p = null;
        qj.l lVar2 = this.f6260r;
        if (lVar2 != null) {
            lVar2.x(null);
        }
        this.f6260r = null;
        r0Var2.j(null);
        return null;
    }

    public final boolean z() {
        return !this.f6262t && (((p1.a) ((ak.v) this.f6244a.f6282c).f732c).get() & 134217727) > 0;
    }

    @Override // f1.p
    public final void o(Set set) {
    }
}
