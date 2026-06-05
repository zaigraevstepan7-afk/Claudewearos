package t1;

import f1.o1;
import java.util.ArrayList;
import java.util.HashMap;
import q.o0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class b extends g {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f15407n = new int[0];

    /* renamed from: e, reason: collision with root package name */
    public final ej.c f15408e;

    /* renamed from: f, reason: collision with root package name */
    public final ej.c f15409f;

    /* renamed from: g, reason: collision with root package name */
    public int f15410g;

    /* renamed from: h, reason: collision with root package name */
    public q.h0 f15411h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f15412i;
    public k j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f15413k;

    /* renamed from: l, reason: collision with root package name */
    public int f15414l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f15415m;

    public b(long j, k kVar, ej.c cVar, ej.c cVar2) {
        super(j, kVar);
        this.f15408e = cVar;
        this.f15409f = cVar2;
        this.j = k.f15461e;
        this.f15413k = f15407n;
        this.f15414l = 1;
    }

    public final void A(long j) {
        synchronized (m.f15471c) {
            this.j = this.j.x(j);
        }
    }

    public void B(q.h0 h0Var) {
        this.f15411h = h0Var;
    }

    public b C(ej.c cVar, ej.c cVar2) throws Throwable {
        if (this.f15440c) {
            o1.a("Cannot use a disposed snapshot");
        }
        if (this.f15415m && this.f15441d < 0) {
            o1.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = m.f15471c;
        synchronized (obj) {
            try {
                long j = m.f15473e;
                long j4 = 1;
                m.f15473e = j + j4;
                m.f15472d = m.f15472d.x(j);
                k kVarD = d();
                r(kVarD.x(j));
                try {
                    c cVar3 = new c(j, m.d(kVarD, g() + j4, j), m.k(cVar, e(), true), m.l(cVar2, i()), this);
                    if (this.f15415m || this.f15440c) {
                        return cVar3;
                    }
                    long jG = g();
                    synchronized (obj) {
                        long j10 = m.f15473e;
                        m.f15473e = j10 + j4;
                        s(j10);
                        m.f15472d = m.f15472d.x(g());
                    }
                    r(m.d(d(), jG + j4, g()));
                    return cVar3;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    @Override // t1.g
    public final void b() {
        m.f15472d = m.f15472d.e(g()).b(this.j);
    }

    @Override // t1.g
    public void c() {
        if (this.f15440c) {
            return;
        }
        this.f15440c = true;
        synchronized (m.f15471c) {
            o();
        }
        l();
    }

    @Override // t1.g
    public boolean f() {
        return false;
    }

    @Override // t1.g
    public int h() {
        return this.f15410g;
    }

    @Override // t1.g
    public ej.c i() {
        return this.f15409f;
    }

    @Override // t1.g
    public void k() {
        this.f15414l++;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    @Override // t1.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f15414l
            if (r1 <= 0) goto L7
            goto Lc
        L7:
            java.lang.String r1 = "no pending nested snapshots"
            f1.o1.a(r1)
        Lc:
            int r1 = r0.f15414l
            int r1 = r1 + (-1)
            r0.f15414l = r1
            if (r1 != 0) goto L94
            boolean r1 = r0.f15415m
            if (r1 != 0) goto L94
            q.h0 r1 = r0.x()
            if (r1 == 0) goto L91
            boolean r2 = r0.f15415m
            if (r2 == 0) goto L27
            java.lang.String r2 = "Unsupported operation on a snapshot that has been applied"
            f1.o1.b(r2)
        L27:
            r2 = 0
            r0.B(r2)
            long r2 = r0.g()
            java.lang.Object[] r4 = r1.f13082b
            long[] r1 = r1.f13081a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L91
            r7 = 0
        L39:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L8c
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L53:
            if (r12 >= r10) goto L8a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L86
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            t1.a0 r13 = (t1.a0) r13
            t1.c0 r13 = r13.b()
        L69:
            if (r13 == 0) goto L86
            long r14 = r13.f15419a
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto L7d
            t1.k r6 = r0.j
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            boolean r6 = qi.l.w0(r6, r14)
            if (r6 == 0) goto L83
        L7d:
            ra.p0 r6 = t1.m.f15469a
            r14 = 0
            r13.f15419a = r14
        L83:
            t1.c0 r13 = r13.f15420b
            goto L69
        L86:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L53
        L8a:
            if (r10 != r11) goto L91
        L8c:
            if (r7 == r5) goto L91
            int r7 = r7 + 1
            goto L39
        L91:
            r0.a()
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.b.l():void");
    }

    @Override // t1.g
    public void m() {
        if (this.f15415m || this.f15440c) {
            return;
        }
        v();
    }

    @Override // t1.g
    public void n(a0 a0Var) {
        q.h0 h0VarX = x();
        if (h0VarX == null) {
            q.h0 h0Var = o0.f13110a;
            h0VarX = new q.h0();
            B(h0VarX);
        }
        h0VarX.a(a0Var);
    }

    @Override // t1.g
    public final void p() {
        int length = this.f15413k.length;
        for (int i10 = 0; i10 < length; i10++) {
            m.u(this.f15413k[i10]);
        }
        o();
    }

    @Override // t1.g
    public void t(int i10) {
        this.f15410g = i10;
    }

    @Override // t1.g
    public g u(ej.c cVar) throws Throwable {
        if (this.f15440c) {
            o1.a("Cannot use a disposed snapshot");
        }
        if (this.f15415m && this.f15441d < 0) {
            o1.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = m.f15471c;
        synchronized (obj) {
            try {
                long j = m.f15473e;
                long j4 = 1;
                m.f15473e = j + j4;
                m.f15472d = m.f15472d.x(j);
                try {
                    d dVar = new d(j, m.d(d(), jG + j4, j), m.k(cVar, e(), true), this);
                    if (this.f15415m || this.f15440c) {
                        return dVar;
                    }
                    long jG2 = g();
                    synchronized (obj) {
                        long j10 = m.f15473e;
                        m.f15473e = j10 + j4;
                        s(j10);
                        m.f15472d = m.f15472d.x(g());
                    }
                    r(m.d(d(), jG2 + j4, g()));
                    return dVar;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final void v() {
        long j;
        A(g());
        if (this.f15415m || this.f15440c) {
            return;
        }
        long jG = g();
        synchronized (m.f15471c) {
            long j4 = m.f15473e;
            j = 1;
            m.f15473e = j4 + j;
            s(j4);
            m.f15472d = m.f15472d.x(g());
        }
        r(m.d(d(), jG + j, g()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t1.r w() {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.b.w():t1.r");
    }

    public q.h0 x() {
        return this.f15411h;
    }

    @Override // t1.g
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public ej.c e() {
        return this.f15408e;
    }

    public final r z(long j, q.h0 h0Var, HashMap map, k kVar) {
        ArrayList arrayList;
        ArrayList arrayListI0;
        ArrayList arrayList2;
        k kVar2;
        Object[] objArr;
        long[] jArr;
        k kVar3;
        Object[] objArr2;
        long[] jArr2;
        int i10;
        long j4;
        ArrayList arrayList3;
        c0 c0VarI;
        k kVarW = d().x(g()).w(this.j);
        Object[] objArr3 = h0Var.f13082b;
        long[] jArr3 = h0Var.f13081a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i11 = 0;
            arrayList2 = null;
            arrayListI0 = null;
            while (true) {
                long j10 = jArr3[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j10 & 255) < 128) {
                            objArr2 = objArr3;
                            a0 a0Var = (a0) objArr3[(i11 << 3) + i13];
                            jArr2 = jArr3;
                            c0 c0VarB = a0Var.b();
                            i10 = i13;
                            ArrayList arrayList4 = arrayList2;
                            c0 c0VarS = m.s(c0VarB, j, kVar);
                            if (c0VarS == null) {
                                kVar3 = kVarW;
                                arrayList3 = arrayListI0;
                                j4 = j10;
                            } else {
                                arrayList3 = arrayListI0;
                                j4 = j10;
                                c0 c0VarS2 = m.s(c0VarB, g(), kVarW);
                                if (c0VarS2 == null) {
                                    kVar3 = kVarW;
                                } else {
                                    kVar3 = kVarW;
                                    if (c0VarS2.f15419a != 1 && !c0VarS.equals(c0VarS2)) {
                                        c0 c0VarS3 = m.s(c0VarB, g(), d());
                                        if (c0VarS3 == null) {
                                            m.r();
                                            throw null;
                                        }
                                        if (map == null || (c0VarI = (c0) map.get(c0VarS)) == null) {
                                            c0VarI = a0Var.i(c0VarS2, c0VarS, c0VarS3);
                                        }
                                        if (c0VarI == null) {
                                            return new h(this);
                                        }
                                        if (!c0VarI.equals(c0VarS3)) {
                                            if (c0VarI.equals(c0VarS)) {
                                                ArrayList arrayList5 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList5.add(new pi.h(a0Var, c0VarS.b(g())));
                                                arrayListI0 = arrayList3 == null ? new ArrayList() : arrayList3;
                                                arrayListI0.add(a0Var);
                                                arrayList2 = arrayList5;
                                            } else {
                                                arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList2.add(!c0VarI.equals(c0VarS2) ? new pi.h(a0Var, c0VarI) : new pi.h(a0Var, c0VarS2.b(g())));
                                            }
                                        }
                                        arrayListI0 = arrayList3;
                                    }
                                }
                            }
                            arrayList2 = arrayList4;
                            arrayListI0 = arrayList3;
                        } else {
                            kVar3 = kVarW;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i10 = i13;
                            j4 = j10;
                        }
                        j10 = j4 >> 8;
                        i13 = i10 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        kVarW = kVar3;
                    }
                    kVar2 = kVarW;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i12 != 8) {
                        break;
                    }
                } else {
                    kVar2 = kVarW;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i11 == length) {
                    arrayList = arrayList2;
                    break;
                }
                i11++;
                jArr3 = jArr;
                objArr3 = objArr;
                kVarW = kVar2;
            }
        } else {
            arrayList = null;
            arrayListI0 = null;
        }
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            int size = arrayList2.size();
            for (int i14 = 0; i14 < size; i14++) {
                pi.h hVar = (pi.h) arrayList2.get(i14);
                a0 a0Var2 = (a0) hVar.f13000a;
                c0 c0Var = (c0) hVar.f13001b;
                c0Var.f15419a = j;
                synchronized (m.f15471c) {
                    c0Var.f15420b = a0Var2.b();
                    a0Var2.e(c0Var);
                }
            }
        }
        if (arrayListI0 != null) {
            int size2 = arrayListI0.size();
            for (int i15 = 0; i15 < size2; i15++) {
                h0Var.l((a0) arrayListI0.get(i15));
            }
            ArrayList arrayList6 = this.f15412i;
            if (arrayList6 != null) {
                arrayListI0 = qi.l.I0(arrayList6, arrayListI0);
            }
            this.f15412i = arrayListI0;
        }
        return i.f15454d;
    }
}
