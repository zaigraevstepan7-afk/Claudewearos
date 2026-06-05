package mi;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.h0;
import c1.z2;
import qj.s1;
import v2.e2;
import v2.i1;
import v2.m1;
import w2.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class o extends v1.n implements v2.i, v2.o, v2.v, v2.m, e2, m1 {
    public final c H;
    public p I;
    public s1 J;

    public o(p pVar) {
        c cVar = new c();
        this.H = cVar;
        cVar.f11739c.h(0.0f);
        this.I = pVar;
    }

    @Override // v2.e2
    public final Object D() {
        return t.f11786b;
    }

    @Override // v2.m1
    public final void F0() {
        v2.n.t(this, new a7.e(this, 24));
    }

    @Override // v2.o
    public final void N0(i1 i1Var) {
        if (this.G) {
            long jX = i1Var.X(0L);
            c cVar = this.H;
            cVar.f11737a.setValue(new b2.b(jX));
            cVar.f11738b.setValue(new b2.e(cg.b.S(i1Var.I())));
            cVar.f11740d = ((View) v2.n.h(this, AndroidCompositionLocals_androidKt.f842f)).getWindowId();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:3:0x0004, B:7:0x0010, B:9:0x0020, B:11:0x002e, B:20:0x0042, B:19:0x0039, B:21:0x004e), top: B:25:0x0004 }] */
    @Override // v2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O0(v2.h0 r6) {
        /*
            r5 = this;
            mi.c r0 = r5.H
            r1 = 1
            r2 = 0
            r0.f11743g = r1     // Catch: java.lang.Throwable -> L37
            boolean r3 = r5.G     // Catch: java.lang.Throwable -> L37
            if (r3 != 0) goto L10
        La:
            r0.f11743g = r2
            r5.q1()
            return
        L10:
            e2.b r3 = r6.f17669a     // Catch: java.lang.Throwable -> L37
            long r3 = r3.a()     // Catch: java.lang.Throwable -> L37
            float r3 = b2.e.d(r3)     // Catch: java.lang.Throwable -> L37
            int r3 = hj.a.H(r3)     // Catch: java.lang.Throwable -> L37
            if (r3 < r1) goto L4e
            f1.r2 r1 = w2.f1.f18261g     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = v2.n.h(r5, r1)     // Catch: java.lang.Throwable -> L37
            c2.b0 r1 = (c2.b0) r1     // Catch: java.lang.Throwable -> L37
            f2.b r3 = r0.a()     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L39
            boolean r4 = r3.f6531s     // Catch: java.lang.Throwable -> L37
            if (r4 != 0) goto L33
            goto L34
        L33:
            r3 = 0
        L34:
            if (r3 == 0) goto L39
            goto L42
        L37:
            r6 = move-exception
            goto L52
        L39:
            f2.b r3 = r1.b()     // Catch: java.lang.Throwable -> L37
            f1.j1 r1 = r0.f11742f     // Catch: java.lang.Throwable -> L37
            r1.setValue(r3)     // Catch: java.lang.Throwable -> L37
        L42:
            mi.f r1 = new mi.f     // Catch: java.lang.Throwable -> L37
            r1.<init>(r6, r3)     // Catch: java.lang.Throwable -> L37
            e2.d.s0(r6, r3, r1)     // Catch: java.lang.Throwable -> L37
            u6.v.C(r6, r3)     // Catch: java.lang.Throwable -> L37
            goto La
        L4e:
            mi.d.c(r6)     // Catch: java.lang.Throwable -> L37
            goto La
        L52:
            r0.f11743g = r2
            r5.q1()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mi.o.O0(v2.h0):void");
    }

    @Override // v1.n
    public final boolean f1() {
        return false;
    }

    @Override // v1.n
    public final void i1() {
        ti.c cVar;
        c.m mVar;
        p pVar = this.I;
        pVar.getClass();
        c cVar2 = this.H;
        fj.l.f(cVar2, "area");
        pVar.f11771a.add(cVar2);
        Context baseContext = (Context) v2.n.h(this, AndroidCompositionLocals_androidKt.f838b);
        while (true) {
            cVar = null;
            if (!(baseContext instanceof c.m)) {
                if (!(baseContext instanceof ContextWrapper)) {
                    mVar = null;
                    break;
                } else {
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    fj.l.e(baseContext, "getBaseContext(...)");
                }
            } else {
                mVar = (c.m) baseContext;
                break;
            }
        }
        if (mVar != null) {
            qj.b0.w(e1(), null, new h0(mVar, this, cVar, 22), 3);
        }
        F0();
    }

    @Override // v1.n
    public final void j1() {
        c cVar = this.H;
        cVar.f11737a.setValue(new b2.b(9205357640488583168L));
        cVar.f11738b.setValue(new b2.e(9205357640488583168L));
        cVar.f11743g = false;
        f2.b bVarA = cVar.a();
        if (bVarA != null) {
            ((c2.b0) v2.n.h(this, f1.f18261g)).a(bVarA);
        }
        cVar.f11742f.setValue(null);
        p pVar = this.I;
        pVar.getClass();
        pVar.f11771a.remove(cVar);
    }

    @Override // v1.n
    public final void k1() {
        c cVar = this.H;
        cVar.f11737a.setValue(new b2.b(9205357640488583168L));
        cVar.f11738b.setValue(new b2.e(9205357640488583168L));
        cVar.f11743g = false;
    }

    @Override // v2.v
    public final void o0(t2.w wVar) {
        c cVar = this.H;
        fj.l.f(wVar, "coordinates");
        t1.g gVarF = t1.r.f();
        ej.c cVarE = gVarF != null ? gVarF.e() : null;
        t1.g gVarK = t1.r.k(gVarF);
        try {
            if ((cVar.b() & 9223372034707292159L) == 9205357640488583168L && this.G) {
                cVar.f11737a.setValue(new b2.b(wVar.X(0L)));
                cVar.f11738b.setValue(new b2.e(cg.b.S(wVar.I())));
                cVar.f11740d = ((View) v2.n.h(this, AndroidCompositionLocals_androidKt.f842f)).getWindowId();
            }
        } finally {
            t1.r.n(gVarF, gVarK, cVarE);
        }
    }

    public final s1 q1() {
        return qj.b0.w(e1(), null, new z2(this, null, 9), 3);
    }
}
