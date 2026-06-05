package t1;

import b0.p1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f15483a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f15484b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final Object f15485c = new Object();

    public static final void a(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException("index (" + i10 + ") is out of bound of [0, " + i11 + ')');
        }
    }

    public static final boolean b(x xVar, int i10, l1.c cVar, boolean z2) {
        boolean z10;
        synchronized (f15483a) {
            try {
                int i11 = xVar.f15515d;
                if (i11 == i10) {
                    xVar.f15514c = cVar;
                    z10 = true;
                    if (z2) {
                        xVar.f15516e++;
                    }
                    xVar.f15515d = i11 + 1;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public static final boolean c(e0 e0Var, int i10, n1.b bVar) {
        boolean z2;
        synchronized (f15485c) {
            int i11 = e0Var.f15431d;
            if (i11 == i10) {
                e0Var.f15430c = bVar;
                z2 = true;
                e0Var.f15431d = i11 + 1;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    public static final int d(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i10 = 0;
        while (i10 <= length) {
            int i11 = (i10 + length) >>> 1;
            long j4 = jArr[i11];
            if (j > j4) {
                i10 = i11 + 1;
            } else {
                if (j >= j4) {
                    return i11;
                }
                length = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static g f() {
        return (g) m.f15470b.get();
    }

    public static final int g(w wVar) {
        e0 e0Var = wVar.f15513a;
        fj.l.d(e0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
        return ((e0) m.h(e0Var)).f15431d;
    }

    public static final x h(q qVar) {
        x xVar = qVar.f15482a;
        fj.l.d(xVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.<get-readable>>");
        return (x) m.t(xVar, qVar);
    }

    public static final e0 i(w wVar) {
        e0 e0Var = wVar.f15513a;
        fj.l.d(e0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.<get-readable>>");
        return (e0) m.t(e0Var, wVar);
    }

    public static final int j(q qVar) {
        x xVar = qVar.f15482a;
        fj.l.d(xVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return ((x) m.h(xVar)).f15516e;
    }

    public static g k(g gVar) {
        if (gVar instanceof g0) {
            g0 g0Var = (g0) gVar;
            if (g0Var.f15447t == p1.j.b()) {
                g0Var.f15445r = null;
                return gVar;
            }
        }
        if (gVar instanceof h0) {
            h0 h0Var = (h0) gVar;
            if (h0Var.f15453i == p1.j.b()) {
                h0Var.f15452h = null;
                return gVar;
            }
        }
        g gVarG = m.g(gVar, null, false);
        gVarG.j();
        return gVarG;
    }

    public static final boolean l(q qVar, ej.c cVar) {
        int i10;
        l1.c cVar2;
        Object objInvoke;
        g gVarJ;
        boolean zB;
        do {
            synchronized (f15483a) {
                x xVar = qVar.f15482a;
                fj.l.d(xVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                x xVar2 = (x) m.h(xVar);
                i10 = xVar2.f15515d;
                cVar2 = xVar2.f15514c;
            }
            fj.l.c(cVar2);
            l1.f fVarX = cVar2.x();
            objInvoke = cVar.invoke(fVarX);
            l1.c cVarI = fVarX.i();
            if (fj.l.b(cVarI, cVar2)) {
                break;
            }
            x xVar3 = qVar.f15482a;
            fj.l.d(xVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (m.f15471c) {
                gVarJ = m.j();
                zB = b((x) m.w(xVar3, qVar, gVarJ), i10, cVarI, true);
            }
            m.n(gVarJ, qVar);
        } while (!zB);
        return ((Boolean) objInvoke).booleanValue();
    }

    public static Object m(p1 p1Var, ej.a aVar) {
        g g0Var;
        g gVar = (g) m.f15470b.get();
        if (gVar instanceof g0) {
            g0 g0Var2 = (g0) gVar;
            if (g0Var2.f15447t == p1.j.b()) {
                ej.c cVar = g0Var2.f15445r;
                ej.c cVar2 = g0Var2.f15446s;
                try {
                    ((g0) gVar).f15445r = m.k(p1Var, cVar, true);
                    ((g0) gVar).f15446s = cVar2;
                    return aVar.a();
                } finally {
                    g0Var2.f15445r = cVar;
                    g0Var2.f15446s = cVar2;
                }
            }
        }
        if (gVar == null || (gVar instanceof b)) {
            g0Var = new g0(gVar instanceof b ? (b) gVar : null, p1Var, null, true, false);
        } else {
            g0Var = gVar.u(p1Var);
        }
        try {
            g gVarJ = g0Var.j();
            try {
                Object objA = aVar.a();
                g.q(gVarJ);
                g0Var.c();
                return objA;
            } catch (Throwable th2) {
                g.q(gVarJ);
                throw th2;
            }
        } catch (Throwable th3) {
            g0Var.c();
            throw th3;
        }
    }

    public static void n(g gVar, g gVar2, ej.c cVar) {
        if (gVar != gVar2) {
            gVar2.getClass();
            g.q(gVar);
            gVar2.c();
        } else if (gVar instanceof g0) {
            ((g0) gVar).f15445r = cVar;
        } else if (gVar instanceof h0) {
            ((h0) gVar).f15452h = cVar;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + gVar).toString());
        }
    }

    public static final void o() {
        throw new UnsupportedOperationException();
    }

    public abstract void e();
}
