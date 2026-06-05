package o2;

import a2.f0;
import fj.l;
import fj.v;
import qj.b0;
import qj.z;
import v1.n;
import v2.b1;
import v2.e2;
import v2.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i extends n implements e2, a {
    public a H;
    public d I;
    public i J;
    public final String K;

    public i(a aVar, d dVar) {
        this.H = aVar;
        this.I = dVar == null ? new d() : dVar;
        this.K = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // v2.e2
    public final Object D() {
        return this.K;
    }

    @Override // o2.a
    public final long G0(int i10, long j, long j4) {
        long jG0 = this.H.G0(i10, j, j4);
        i iVarR1 = this.G ? r1() : null;
        return b2.b.f(jG0, iVarR1 != null ? iVarR1.G0(i10, b2.b.f(j, jG0), b2.b.e(j4, jG0)) : 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // o2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z0(long r11, long r13, ti.c r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof o2.g
            if (r0 == 0) goto L14
            r0 = r15
            o2.g r0 = (o2.g) r0
            int r1 = r0.f12387e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f12387e = r1
        L12:
            r6 = r0
            goto L1c
        L14:
            o2.g r0 = new o2.g
            vi.c r15 = (vi.c) r15
            r0.<init>(r10, r15)
            goto L12
        L1c:
            java.lang.Object r15 = r6.f12385c
            ui.a r0 = ui.a.f17085a
            int r1 = r6.f12387e
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L40
            if (r1 == r2) goto L38
            if (r1 != r7) goto L30
            long r11 = r6.f12383a
            uk.c.R(r15)
            goto L81
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L38:
            long r13 = r6.f12384b
            long r11 = r6.f12383a
            uk.c.R(r15)
            goto L56
        L40:
            uk.c.R(r15)
            o2.a r1 = r10.H
            r6.f12383a = r11
            r6.f12384b = r13
            r6.f12387e = r2
            r2 = r11
            r4 = r13
            java.lang.Object r15 = r1.Z0(r2, r4, r6)
            if (r15 != r0) goto L54
            goto L7f
        L54:
            r11 = r2
            r13 = r4
        L56:
            s3.q r15 = (s3.q) r15
            long r8 = r15.f14760a
            boolean r15 = r10.G
            if (r15 == 0) goto L68
            if (r15 == 0) goto L65
            o2.i r15 = r10.r1()
            goto L66
        L65:
            r15 = 0
        L66:
            r1 = r15
            goto L6b
        L68:
            o2.i r15 = r10.J
            goto L66
        L6b:
            if (r1 == 0) goto L87
            long r2 = s3.q.e(r11, r8)
            long r4 = s3.q.d(r13, r8)
            r6.f12383a = r8
            r6.f12387e = r7
            java.lang.Object r15 = r1.Z0(r2, r4, r6)
            if (r15 != r0) goto L80
        L7f:
            return r0
        L80:
            r11 = r8
        L81:
            s3.q r15 = (s3.q) r15
            long r13 = r15.f14760a
            r8 = r11
            goto L89
        L87:
            r13 = 0
        L89:
            long r11 = s3.q.e(r8, r13)
            s3.q r13 = new s3.q
            r13.<init>(r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.i.Z0(long, long, ti.c):java.lang.Object");
    }

    @Override // o2.a
    public final long c0(int i10, long j) {
        i iVarR1 = this.G ? r1() : null;
        long jC0 = iVarR1 != null ? iVarR1.c0(i10, j) : 0L;
        return b2.b.f(jC0, this.H.c0(i10, b2.b.e(j, jC0)));
    }

    @Override // v1.n
    public final void i1() {
        d dVar = this.I;
        dVar.f12377a = this;
        dVar.f12378b = null;
        this.J = null;
        dVar.f12379c = new f0(this, 8);
        dVar.f12380d = e1();
    }

    @Override // v1.n
    public final void j1() {
        v vVar = new v();
        v2.n.C(this, new j(vVar, 0));
        i iVar = (i) ((e2) vVar.f6807a);
        this.J = iVar;
        d dVar = this.I;
        dVar.f12378b = iVar;
        if (dVar.f12377a == this) {
            dVar.f12377a = null;
        }
    }

    public final z q1() {
        i iVarR1 = r1();
        z zVarQ1 = iVarR1 != null ? iVarR1.q1() : null;
        if (zVarQ1 != null && b0.s(zVarQ1)) {
            return zVarQ1;
        }
        z zVar = this.I.f12380d;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final i r1() {
        b1 b1Var;
        e2 e2Var = null;
        if (!this.G) {
            return null;
        }
        if (!this.f17565a.G) {
            s2.a.b("visitAncestors called on an unattached node");
        }
        n nVar = this.f17565a.f17569e;
        v2.f0 f0VarY = v2.n.y(this);
        loop0: while (true) {
            if (f0VarY == null) {
                break;
            }
            if ((f0VarY.Y.f17586f.f17568d & 262144) != 0) {
                while (nVar != null) {
                    if ((nVar.f17567c & 262144) != 0) {
                        n nVarE = nVar;
                        g1.e eVar = null;
                        while (nVarE != null) {
                            if (nVarE instanceof e2) {
                                e2 e2Var2 = (e2) nVarE;
                                if (l.b(this.K, e2Var2.D()) && i.class == e2Var2.getClass()) {
                                    e2Var = e2Var2;
                                    break loop0;
                                }
                            }
                            if ((nVarE.f17567c & 262144) != 0 && (nVarE instanceof k)) {
                                int i10 = 0;
                                for (n nVar2 = ((k) nVarE).I; nVar2 != null; nVar2 = nVar2.f17570f) {
                                    if ((nVar2.f17567c & 262144) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            nVarE = nVar2;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new g1.e(new n[16]);
                                            }
                                            if (nVarE != null) {
                                                eVar.b(nVarE);
                                                nVarE = null;
                                            }
                                            eVar.b(nVar2);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            nVarE = v2.n.e(eVar);
                        }
                    }
                    nVar = nVar.f17569e;
                }
            }
            f0VarY = f0VarY.u();
            nVar = (f0VarY == null || (b1Var = f0VarY.Y) == null) ? null : b1Var.f17585e;
        }
        return (i) e2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        if (r11 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        if (r11 != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v0(long r9, ti.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof o2.h
            if (r0 == 0) goto L13
            r0 = r11
            o2.h r0 = (o2.h) r0
            int r1 = r0.f12391d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12391d = r1
            goto L1a
        L13:
            o2.h r0 = new o2.h
            vi.c r11 = (vi.c) r11
            r0.<init>(r8, r11)
        L1a:
            java.lang.Object r11 = r0.f12389b
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f12391d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            long r9 = r0.f12388a
            uk.c.R(r11)
            goto L72
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            long r9 = r0.f12388a
            uk.c.R(r11)
            goto L56
        L3c:
            uk.c.R(r11)
            boolean r11 = r8.G
            if (r11 == 0) goto L48
            o2.i r11 = r8.r1()
            goto L49
        L48:
            r11 = 0
        L49:
            if (r11 == 0) goto L5e
            r0.f12388a = r9
            r0.f12391d = r4
            java.lang.Object r11 = r11.v0(r9, r0)
            if (r11 != r1) goto L56
            goto L71
        L56:
            s3.q r11 = (s3.q) r11
            long r4 = r11.f14760a
        L5a:
            r6 = r4
            r4 = r9
            r9 = r6
            goto L61
        L5e:
            r4 = 0
            goto L5a
        L61:
            o2.a r11 = r8.H
            long r4 = s3.q.d(r4, r9)
            r0.f12388a = r9
            r0.f12391d = r3
            java.lang.Object r11 = r11.v0(r4, r0)
            if (r11 != r1) goto L72
        L71:
            return r1
        L72:
            s3.q r11 = (s3.q) r11
            long r0 = r11.f14760a
            long r9 = s3.q.e(r9, r0)
            s3.q r11 = new s3.q
            r11.<init>(r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.i.v0(long, ti.c):java.lang.Object");
    }
}
