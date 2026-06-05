package mi;

import android.view.View;
import android.view.WindowId;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q0;
import java.util.Iterator;
import java.util.List;
import q.n0;
import v2.e2;
import v2.i1;
import v2.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class i extends v1.n implements v2.i, v2.o, v2.v, m1, v2.m, e2 {
    public p H;
    public int I = 0;
    public final m J;
    public q K;
    public q L;
    public long M;
    public b2.c N;
    public final q.c0 O;
    public long P;
    public long Q;
    public long R;
    public final float S;
    public final float T;
    public final long U;
    public final qi.s V;
    public final s W;
    public final float X;
    public WindowId Y;
    public List Z;

    /* renamed from: a0, reason: collision with root package name */
    public final pi.m f11761a0;

    /* renamed from: b0, reason: collision with root package name */
    public a f11762b0;

    /* renamed from: c0, reason: collision with root package name */
    public final q0 f11763c0;

    /* renamed from: d0, reason: collision with root package name */
    public final Object f11764d0;

    public i(p pVar, q qVar) {
        this.H = pVar;
        k.c(this);
        this.J = m.f11769a;
        this.K = q.f11773f;
        this.L = qVar;
        this.M = 9205357640488583168L;
        this.N = b2.c.f1501e;
        q.c0 c0Var = new q.c0();
        c0Var.f13040a = n0.f13108a;
        c0Var.f13041b = r.a.f13650c;
        c0Var.f13042c = q.o.f13109a;
        c0Var.c(n0.d(6));
        this.O = c0Var;
        this.P = 9205357640488583168L;
        this.Q = 9205357640488583168L;
        this.R = 0L;
        this.S = Float.NaN;
        this.T = -1.0f;
        this.U = c2.w.f3058h;
        qi.s sVar = qi.s.f13520a;
        this.V = sVar;
        this.W = s.f11780d;
        this.X = 1.0f;
        this.Z = sVar;
        this.f11761a0 = u6.v.Q(new jb.e(15));
        this.f11762b0 = new e0(this);
        this.f11763c0 = e.f11754b;
        this.f11764d0 = u6.v.P(pi.f.f12998b, new a7.e(this, 23));
    }

    @Override // v2.e2
    public final Object D() {
        return t.f11785a;
    }

    @Override // v2.m1
    public final void F0() {
        v2.n.t(this, new a2.i(0, this, i.class, "updateEffect", "updateEffect()V", 0, 0, 4));
    }

    @Override // v2.o
    public final void N0(i1 i1Var) {
        r1(i1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004b A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:3:0x0003, B:7:0x000a, B:9:0x0017, B:11:0x001d, B:13:0x0021, B:15:0x0029, B:18:0x0034, B:19:0x0038, B:21:0x0042, B:28:0x005c, B:30:0x0075, B:31:0x0078, B:27:0x004b, B:32:0x007e), top: B:37:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:3:0x0003, B:7:0x000a, B:9:0x0017, B:11:0x001d, B:13:0x0021, B:15:0x0029, B:18:0x0034, B:19:0x0038, B:21:0x0042, B:28:0x005c, B:30:0x0075, B:31:0x0078, B:27:0x004b, B:32:0x007e), top: B:37:0x0003 }] */
    @Override // v2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O0(v2.h0 r7) {
        /*
            r6 = this;
            e2.b r0 = r7.f17669a
            r1 = 0
            boolean r2 = r6.G     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto La
            r6.I = r1
            return
        La:
            long r2 = r0.a()     // Catch: java.lang.Throwable -> L32
            r4 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L7e
            long r2 = r6.Q     // Catch: java.lang.Throwable -> L32
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L7e
            mi.p r2 = r6.H     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L38
            java.util.List r0 = r6.Z     // Catch: java.lang.Throwable -> L32
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L34
            mi.d.i(r6, r7)     // Catch: java.lang.Throwable -> L32
            mi.a r0 = r6.f11762b0     // Catch: java.lang.Throwable -> L32
            r0.a(r7)     // Catch: java.lang.Throwable -> L32
            goto L34
        L32:
            r7 = move-exception
            goto L84
        L34:
            mi.d.c(r7)     // Catch: java.lang.Throwable -> L32
            goto L81
        L38:
            mi.c r2 = r6.q1()     // Catch: java.lang.Throwable -> L32
            f2.b r2 = r2.a()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L4b
            boolean r3 = r2.f6531s     // Catch: java.lang.Throwable -> L32
            if (r3 != 0) goto L47
            goto L48
        L47:
            r2 = 0
        L48:
            if (r2 == 0) goto L4b
            goto L5c
        L4b:
            c2.b0 r2 = v2.n.w(r6)     // Catch: java.lang.Throwable -> L32
            f2.b r2 = r2.b()     // Catch: java.lang.Throwable -> L32
            mi.c r3 = r6.q1()     // Catch: java.lang.Throwable -> L32
            f1.j1 r3 = r3.f11742f     // Catch: java.lang.Throwable -> L32
            r3.setValue(r2)     // Catch: java.lang.Throwable -> L32
        L5c:
            long r3 = r0.a()     // Catch: java.lang.Throwable -> L32
            long r3 = cg.b.R(r3)     // Catch: java.lang.Throwable -> L32
            mi.f r0 = new mi.f     // Catch: java.lang.Throwable -> L32
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L32
            r7.n0(r2, r3, r0)     // Catch: java.lang.Throwable -> L32
            mi.d.i(r6, r7)     // Catch: java.lang.Throwable -> L32
            mi.a r0 = r6.f11762b0     // Catch: java.lang.Throwable -> L32
            boolean r0 = r0 instanceof mi.e0     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L78
            u6.v.C(r7, r2)     // Catch: java.lang.Throwable -> L32
        L78:
            mi.a r0 = r6.f11762b0     // Catch: java.lang.Throwable -> L32
            r0.a(r7)     // Catch: java.lang.Throwable -> L32
            goto L81
        L7e:
            mi.d.c(r7)     // Catch: java.lang.Throwable -> L32
        L81:
            r6.I = r1
            return
        L84:
            r6.I = r1
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mi.i.O0(v2.h0):void");
    }

    @Override // v1.n
    public final boolean f1() {
        return false;
    }

    @Override // v1.n
    public final void i1() {
        F0();
    }

    @Override // v2.v
    public final void o0(t2.w wVar) {
        fj.l.f(wVar, "coordinates");
        t1.g gVarF = t1.r.f();
        ej.c cVarE = gVarF != null ? gVarF.e() : null;
        t1.g gVarK = t1.r.k(gVarF);
        try {
            if ((this.M & 9223372034707292159L) == 9205357640488583168L) {
                r1(wVar);
            }
        } finally {
            t1.r.n(gVarF, gVarK, cVarE);
        }
    }

    public final c q1() {
        return (c) this.f11761a0.getValue();
    }

    public final void r1(t2.w wVar) {
        if (this.G) {
            fj.l.f(wVar, "<this>");
            long jX = wVar.X(0L);
            if (!b2.b.c(jX, this.M)) {
                this.I |= 4;
                this.M = jX;
            }
            long jS = cg.b.S(wVar.I());
            if (!b2.e.a(jS, this.P)) {
                this.I |= 16;
                this.P = jS;
            }
            this.Y = ((View) v2.n.h(this, AndroidCompositionLocals_androidKt.f842f)).getWindowId();
            t2.w wVarH = t2.z.h(wVar);
            b2.c cVarG = uk.c.g(wVarH.X(0L), cg.b.S(wVarH.I()));
            if (!cVarG.equals(this.N)) {
                this.I |= 4;
                this.N = cVarG;
            }
            y1();
        }
    }

    public final void s1(q qVar, q qVar2) {
        if (!fj.l.b(qVar != null ? qVar.f11775b : null, qVar2.f11775b)) {
            this.I |= 512;
        }
        if (!fj.l.b(qVar != null ? qVar.f11778e : null, qVar2.f11778e)) {
            this.I |= 512;
        }
        if (!fj.l.b(qVar != null ? new c2.w(qVar.f11774a) : null, new c2.w(qVar2.f11774a))) {
            this.I |= 256;
        }
        Float fValueOf = qVar != null ? Float.valueOf(qVar.f11777d) : null;
        Float fValueOf2 = Float.valueOf(qVar2.f11777d);
        if (fValueOf == null || fValueOf.floatValue() != fValueOf2.floatValue()) {
            this.I |= 64;
        }
        if (fj.l.b(qVar != null ? new s3.f(qVar.f11776c) : null, new s3.f(qVar2.f11776c))) {
            return;
        }
        this.I |= 32;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, pi.e] */
    public final void t1(List list) {
        ?? r2;
        if (list.equals(this.Z)) {
            return;
        }
        this.I |= 8192;
        Iterator it = this.Z.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            r2 = this.f11764d0;
            if (!zHasNext) {
                break;
            } else {
                ((c) it.next()).f11741e.remove((h) r2.getValue());
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((c) it2.next()).f11741e.add((h) r2.getValue());
        }
        this.Z = list;
    }

    public final void u1(a aVar) {
        fj.l.f(aVar, "value");
        if (aVar.equals(this.f11762b0)) {
            return;
        }
        this.f11762b0.b();
        this.f11762b0 = aVar;
    }

    public final void v1(long j) {
        if (b2.b.c(j, this.R)) {
            return;
        }
        this.I |= 32768;
        this.R = j;
    }

    public final void w1(long j) {
        if (b2.e.a(j, this.Q)) {
            return;
        }
        this.I |= 16384;
        this.Q = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x013f, code lost:
    
        r27 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0149, code lost:
    
        if (((((~r10) << 6) & r10) & r27) == 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x014b, code lost:
    
        r5 = r1.a(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0151, code lost:
    
        if (r1.f13045f != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0164, code lost:
    
        if (((r1.f13040a[r5 >> 3] >> ((r5 & 7) << 3)) & r17) != 254) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0166, code lost:
    
        r35 = r2;
        r10 = r6;
        r33 = r7;
        r31 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x016f, code lost:
    
        r5 = r1.f13043d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0173, code lost:
    
        if (r5 <= 8) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0185, code lost:
    
        if (java.lang.Long.compareUnsigned(r1.f13044e * 32, r5 * 25) > 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0187, code lost:
    
        r5 = r1.f13040a;
        r11 = r1.f13043d;
        r13 = r1.f13041b;
        r14 = r1.f13042c;
        r4 = (r11 + 7) >> 3;
        r9 = r19;
        r31 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0197, code lost:
    
        if (r9 >= r4) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0199, code lost:
    
        r35 = r2;
        r2 = r5[r9] & r27;
        r5[r9] = (-72340172838076674L) & ((~r2) + (r2 >>> r2));
        r9 = r9 + 1;
        r6 = r6;
        r7 = r7;
        r2 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01b6, code lost:
    
        r35 = r2;
        r10 = r6;
        r33 = r7;
        r2 = qi.k.q0(r5);
        r3 = r2 - 1;
        r8 = 72057594037927935L;
        r5[r3] = (r5[r3] & 72057594037927935L) | (-72057594037927936L);
        r5[r2] = r5[r19];
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01d5, code lost:
    
        if (r2 == r11) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01d7, code lost:
    
        r3 = r2 >> 3;
        r19 = (r2 & 7) << 3;
        r6 = (r5[r3] >> r19) & r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01e5, code lost:
    
        if (r6 != 128) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01e7, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ec, code lost:
    
        if (r6 == 254) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01ef, code lost:
    
        r4 = r13[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01f1, code lost:
    
        if (r4 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01f3, code lost:
    
        r4 = r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01f8, code lost:
    
        r4 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01fa, code lost:
    
        r4 = r4 * r21;
        r4 = ((r4 << 16) ^ r4) >>> 7;
        r7 = r1.a(r4);
        r4 = r4 & r11;
        r38 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0217, code lost:
    
        if ((((r7 - r4) & r11) / 8) != (((r2 - r4) & r11) / 8)) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0219, code lost:
    
        r30 = r5;
        r30[r3] = ((~(r17 << r19)) & r5[r3]) | ((r6 & 127) << r19);
        r4 = r30;
        r4[r4.length - 1] = (r4[r19] & r38) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0236, code lost:
    
        r2 = r2 + 1;
        r5 = r4;
        r8 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x023c, code lost:
    
        r4 = r5;
        r5 = r7 >> 3;
        r8 = r4[r5];
        r30 = (r7 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x024b, code lost:
    
        if (((r8 >> r30) & r17) != 128) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x024d, code lost:
    
        r43 = r2;
        r4[r5] = ((~(r17 << r30)) & r8) | ((r6 & 127) << r30);
        r4[r3] = (r4[r3] & (~(r17 << r19))) | (128 << r19);
        r13[r7] = r13[r43];
        r13[r43] = r23;
        r14[r7] = r14[r43];
        r14[r43] = 0;
        r2 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0279, code lost:
    
        r43 = r2;
        r4[r5] = ((~(r17 << r30)) & r8) | ((r6 & 127) << r30);
        r2 = r13[r7];
        r13[r7] = r13[r43];
        r13[r43] = r2;
        r2 = r14[r7];
        r14[r7] = r14[r43];
        r14[r43] = r2;
        r2 = r43 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x029b, code lost:
    
        r4[r4.length - 1] = (r4[r19] & r38) | Long.MIN_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02a7, code lost:
    
        r1.f13045f = q.n0.a(r1.f13043d) - r1.f13044e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02b4, code lost:
    
        r35 = r2;
        r10 = r6;
        r33 = r7;
        r31 = 128;
        r2 = q.n0.b(r1.f13043d);
        r3 = r1.f13040a;
        r4 = r1.f13041b;
        r5 = r1.f13042c;
        r6 = r1.f13043d;
        r1.c(r2);
        r2 = r1.f13040a;
        r7 = r1.f13041b;
        r8 = r1.f13042c;
        r9 = r1.f13043d;
        r11 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02d6, code lost:
    
        if (r11 >= r6) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02e5, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & r17) >= 128) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x02e7, code lost:
    
        r13 = r4[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02e9, code lost:
    
        if (r13 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02eb, code lost:
    
        r14 = r13.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02f0, code lost:
    
        r14 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02f2, code lost:
    
        r14 = r14 * r21;
        r14 = r14 ^ (r14 << 16);
        r15 = r1.a(r14 >>> 7);
        r19 = r2;
        r16 = r3;
        r2 = r14 & 127;
        r14 = r15 >> 3;
        r25 = (r15 & 7) << 3;
        r2 = (r19[r14] & (~(r17 << r25))) | (r2 << r25);
        r19[r14] = r2;
        r19[(((r15 - 7) & r9) + (r9 & 7)) >> 3] = r2;
        r7[r15] = r13;
        r8[r15] = r5[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x032b, code lost:
    
        r19 = r2;
        r16 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x032f, code lost:
    
        r11 = r11 + 1;
        r3 = r16;
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0336, code lost:
    
        r5 = r1.a(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x033a, code lost:
    
        r1.f13044e++;
        r2 = r1.f13045f;
        r3 = r1.f13040a;
        r4 = r5 >> 3;
        r6 = r3[r4];
        r8 = (r5 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0352, code lost:
    
        if (((r6 >> r8) & r17) != r31) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0355, code lost:
    
        r22 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0357, code lost:
    
        r1.f13045f = r2 - r22;
        r2 = r1.f13043d;
        r6 = (r6 & (~(r17 << r8))) | (r35 << r8);
        r3[r4] = r6;
        r3[(((r5 - 7) & r2) + (r2 & 7)) >> 3] = r6;
        r2 = ~r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x1() {
        /*
            Method dump skipped, instructions count: 930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mi.i.x1():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x02ed A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:3:0x000b, B:5:0x000f, B:7:0x0024, B:8:0x002b, B:12:0x0042, B:13:0x0048, B:16:0x0050, B:20:0x0067, B:22:0x0071, B:25:0x0077, B:29:0x0083, B:31:0x0087, B:34:0x008d, B:35:0x008f, B:36:0x00aa, B:38:0x00b0, B:39:0x00b8, B:41:0x00be, B:43:0x00f8, B:63:0x014c, B:67:0x0163, B:69:0x016e, B:71:0x0176, B:73:0x017c, B:75:0x0188, B:79:0x019a, B:81:0x01c6, B:82:0x01d3, B:84:0x01d9, B:86:0x01f6, B:88:0x01ff, B:92:0x0219, B:93:0x0232, B:95:0x025f, B:98:0x0270, B:102:0x027b, B:114:0x02f7, B:119:0x0304, B:78:0x0199, B:105:0x02a4, B:107:0x02aa, B:112:0x02b3, B:113:0x02ed, B:66:0x0162, B:46:0x0104, B:59:0x012e, B:60:0x0134, B:62:0x013a, B:49:0x0109, B:51:0x010d, B:54:0x0114, B:55:0x0118, B:57:0x011e, B:42:0x00c8), top: B:124:0x000b }] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, pi.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y1() {
        /*
            Method dump skipped, instructions count: 783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mi.i.y1():void");
    }
}
