package p2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import c1.z2;
import c2.x0;
import java.util.ArrayList;
import qj.s1;
import v2.w1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p0 extends v1.n implements a0, s3.c, w1 {
    public Object H;
    public Object I;
    public PointerInputEventHandler J;
    public s1 K;
    public n L = k0.f12716a;
    public final g1.e M;
    public final g1.e N;
    public final g1.e O;
    public n P;
    public long Q;

    public p0(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.H = obj;
        this.I = obj2;
        this.J = pointerInputEventHandler;
        g1.e eVar = new g1.e(new o0[16]);
        this.M = eVar;
        this.N = eVar;
        this.O = new g1.e(new o0[16]);
        this.Q = 0L;
    }

    @Override // v2.w1
    public final void U0() {
        s1();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // v2.w1
    public final void V() {
        n nVar = this.P;
        if (nVar == null) {
            return;
        }
        ?? r12 = nVar.f12734a;
        int size = r12.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((w) r12.get(i10)).f12763d) {
                ArrayList arrayList = new ArrayList(r12.size());
                int size2 = r12.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    w wVar = (w) r12.get(i11);
                    long j = wVar.f12760a;
                    long j4 = wVar.f12762c;
                    long j10 = wVar.f12761b;
                    float f10 = wVar.f12764e;
                    boolean z2 = wVar.f12763d;
                    arrayList.add(new w(j, j10, j4, false, f10, j10, j4, z2, z2, wVar.f12768i, 0L, 1.0f, 0L));
                }
                n nVar2 = new n(arrayList, null);
                this.L = nVar2;
                r1(nVar2, o.f12743a);
                r1(nVar2, o.f12744b);
                r1(nVar2, o.f12745c);
                this.P = null;
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // v2.w1
    public final void a0(n nVar, o oVar, long j) {
        this.Q = j;
        if (oVar == o.f12743a) {
            this.L = nVar;
        }
        ti.c cVar = null;
        if (this.K == null) {
            qj.z zVarE1 = e1();
            qj.a0 a0Var = qj.a0.f13538a;
            this.K = qj.b0.w(zVarE1, null, new z2(this, cVar, 11), 1);
        }
        r1(nVar, oVar);
        ?? r42 = nVar.f12734a;
        int size = r42.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                nVar = null;
                break;
            } else if (!v.d((w) r42.get(i10))) {
                break;
            } else {
                i10++;
            }
        }
        this.P = nVar;
    }

    @Override // s3.c
    public final float e() {
        return v2.n.y(this).R.e();
    }

    @Override // v1.n
    public final void j1() {
        s1();
    }

    @Override // v2.j
    public final void l() {
        s1();
    }

    public final Object q1(ej.e eVar, ti.c cVar) {
        qj.l lVar = new qj.l(1, u3.a.g(cVar));
        lVar.p();
        o0 o0Var = new o0(this, lVar);
        synchronized (this.N) {
            this.M.b(o0Var);
            ti.c cVarG = u3.a.g(u3.a.a(eVar, o0Var, o0Var));
            ui.a aVar = ui.a.f17085a;
            new ti.j(cVarG).resumeWith(pi.o.f13011a);
        }
        lVar.s(new x0(o0Var, 8));
        return lVar.o();
    }

    @Override // s3.c
    public final float r0() {
        return v2.n.y(this).R.r0();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0020, B:17:0x0023, B:20:0x002f, B:22:0x0037, B:24:0x003b, B:25:0x0040, B:26:0x0043, B:28:0x004c, B:30:0x0054, B:32:0x0058), top: B:41:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r1(p2.n r7, p2.o r8) {
        /*
            r6 = this;
            g1.e r0 = r6.N
            monitor-enter(r0)
            g1.e r1 = r6.O     // Catch: java.lang.Throwable -> L6c
            g1.e r2 = r6.M     // Catch: java.lang.Throwable -> L6c
            int r3 = r1.f7026c     // Catch: java.lang.Throwable -> L6c
            r1.c(r3, r2)     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r0)
            int r0 = r8.ordinal()     // Catch: java.lang.Throwable -> L21
            r1 = 0
            if (r0 == 0) goto L43
            r2 = 1
            if (r0 == r2) goto L23
            r2 = 2
            if (r0 != r2) goto L1b
            goto L43
        L1b:
            b3.e r7 = new b3.e     // Catch: java.lang.Throwable -> L21
            r7.<init>()     // Catch: java.lang.Throwable -> L21
            throw r7     // Catch: java.lang.Throwable -> L21
        L21:
            r7 = move-exception
            goto L66
        L23:
            g1.e r0 = r6.O     // Catch: java.lang.Throwable -> L21
            int r3 = r0.f7026c     // Catch: java.lang.Throwable -> L21
            int r3 = r3 - r2
            java.lang.Object[] r0 = r0.f7024a     // Catch: java.lang.Throwable -> L21
            int r2 = r0.length     // Catch: java.lang.Throwable -> L21
            if (r3 >= r2) goto L60
        L2d:
            if (r3 < 0) goto L60
            r2 = r0[r3]     // Catch: java.lang.Throwable -> L21
            p2.o0 r2 = (p2.o0) r2     // Catch: java.lang.Throwable -> L21
            p2.o r4 = r2.f12750d     // Catch: java.lang.Throwable -> L21
            if (r8 != r4) goto L40
            qj.l r4 = r2.f12749c     // Catch: java.lang.Throwable -> L21
            if (r4 == 0) goto L40
            r2.f12749c = r1     // Catch: java.lang.Throwable -> L21
            r4.resumeWith(r7)     // Catch: java.lang.Throwable -> L21
        L40:
            int r3 = r3 + (-1)
            goto L2d
        L43:
            g1.e r0 = r6.O     // Catch: java.lang.Throwable -> L21
            java.lang.Object[] r2 = r0.f7024a     // Catch: java.lang.Throwable -> L21
            int r0 = r0.f7026c     // Catch: java.lang.Throwable -> L21
            r3 = 0
        L4a:
            if (r3 >= r0) goto L60
            r4 = r2[r3]     // Catch: java.lang.Throwable -> L21
            p2.o0 r4 = (p2.o0) r4     // Catch: java.lang.Throwable -> L21
            p2.o r5 = r4.f12750d     // Catch: java.lang.Throwable -> L21
            if (r8 != r5) goto L5d
            qj.l r5 = r4.f12749c     // Catch: java.lang.Throwable -> L21
            if (r5 == 0) goto L5d
            r4.f12749c = r1     // Catch: java.lang.Throwable -> L21
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L21
        L5d:
            int r3 = r3 + 1
            goto L4a
        L60:
            g1.e r7 = r6.O
            r7.h()
            return
        L66:
            g1.e r8 = r6.O
            r8.h()
            throw r7
        L6c:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.p0.r1(p2.n, p2.o):void");
    }

    public final void s1() {
        s1 s1Var = this.K;
        if (s1Var != null) {
            s1Var.o(new z("Pointer input was reset", 2));
            this.K = null;
        }
    }
}
