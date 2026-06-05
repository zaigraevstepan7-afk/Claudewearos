package e0;

import c1.p4;
import f0.l0;
import f0.n0;
import f0.o0;
import f0.y;
import f1.a1;
import f1.j1;
import v2.f0;
import x.f2;
import x.o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v implements f2 {

    /* renamed from: w, reason: collision with root package name */
    public static final qh.c f5326w = s1.k.b(new p4(22), new ab.d(25));

    /* renamed from: a, reason: collision with root package name */
    public final d0.a f5327a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5328b;

    /* renamed from: c, reason: collision with root package name */
    public l f5329c;

    /* renamed from: d, reason: collision with root package name */
    public final d0.q f5330d;

    /* renamed from: e, reason: collision with root package name */
    public final j1 f5331e;

    /* renamed from: f, reason: collision with root package name */
    public final z.k f5332f;

    /* renamed from: g, reason: collision with root package name */
    public float f5333g;

    /* renamed from: h, reason: collision with root package name */
    public final x.n f5334h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5335i;
    public f0 j;

    /* renamed from: k, reason: collision with root package name */
    public final d0.s f5336k;

    /* renamed from: l, reason: collision with root package name */
    public final f0.e f5337l;

    /* renamed from: m, reason: collision with root package name */
    public final y f5338m;

    /* renamed from: n, reason: collision with root package name */
    public final d8.e f5339n;

    /* renamed from: o, reason: collision with root package name */
    public final o0 f5340o;

    /* renamed from: p, reason: collision with root package name */
    public final d8.e f5341p;

    /* renamed from: q, reason: collision with root package name */
    public final l0 f5342q;

    /* renamed from: r, reason: collision with root package name */
    public final a1 f5343r;

    /* renamed from: s, reason: collision with root package name */
    public final a1 f5344s;

    /* renamed from: t, reason: collision with root package name */
    public final j1 f5345t;

    /* renamed from: u, reason: collision with root package name */
    public final j1 f5346u;

    /* renamed from: v, reason: collision with root package name */
    public final t0.j f5347v;

    public v(int i10, int i11) {
        d0.a aVar = new d0.a();
        aVar.f4337a = -1;
        aVar.f4341e = new g1.e(new n0[16]);
        aVar.f4339c = -1;
        this.f5327a = aVar;
        this.f5330d = new d0.q(i10, i11, 1);
        this.f5331e = new j1(w.f5348a, f1.f.f6290d);
        this.f5332f = new z.k();
        this.f5334h = new x.n(new ab.k(this, 11));
        this.f5335i = true;
        this.f5336k = new d0.s(this, 1);
        this.f5337l = new f0.e();
        this.f5338m = new y();
        this.f5339n = new d8.e(6);
        this.f5340o = new o0(new s(i10, 0, this));
        this.f5341p = new d8.e(this);
        this.f5342q = new l0();
        this.f5343r = f0.o.h();
        this.f5344s = f0.o.h();
        Boolean bool = Boolean.FALSE;
        this.f5345t = f1.s.A(bool);
        this.f5346u = f1.s.A(bool);
        this.f5347v = new t0.j(10);
    }

    @Override // x.f2
    public final boolean a() {
        return this.f5334h.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r5.f5334h.b(r6, r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // x.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(v.f1 r6, ej.e r7, vi.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof e0.u
            if (r0 == 0) goto L13
            r0 = r8
            e0.u r0 = (e0.u) r0
            int r1 = r0.f5325e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5325e = r1
            goto L18
        L13:
            e0.u r0 = new e0.u
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f5323c
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f5325e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            uk.c.R(r8)
            goto L6c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            vi.i r6 = r0.f5322b
            r7 = r6
            ej.e r7 = (ej.e) r7
            v.f1 r6 = r0.f5321a
            uk.c.R(r8)
            goto L5c
        L3d:
            uk.c.R(r8)
            f1.j1 r8 = r5.f5331e
            java.lang.Object r8 = r8.getValue()
            e0.l r2 = e0.w.f5348a
            if (r8 != r2) goto L5c
            r0.f5321a = r6
            r8 = r7
            vi.i r8 = (vi.i) r8
            r0.f5322b = r8
            r0.f5325e = r4
            f0.e r8 = r5.f5337l
            java.lang.Object r8 = r8.h(r0)
            if (r8 != r1) goto L5c
            goto L6b
        L5c:
            r8 = 0
            r0.f5321a = r8
            r0.f5322b = r8
            r0.f5325e = r3
            x.n r8 = r5.f5334h
            java.lang.Object r6 = r8.b(r6, r7, r0)
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            pi.o r6 = pi.o.f13011a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.v.b(v.f1, ej.e, vi.c):java.lang.Object");
    }

    @Override // x.f2
    public final boolean c() {
        return ((Boolean) this.f5346u.getValue()).booleanValue();
    }

    @Override // x.f2
    public final boolean d() {
        return ((Boolean) this.f5345t.getValue()).booleanValue();
    }

    @Override // x.f2
    public final float e(float f10) {
        return this.f5334h.e(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010c  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(e0.l r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.v.f(e0.l, boolean, boolean):void");
    }

    public final l g() {
        return (l) this.f5331e.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
    public final void h(float f10, l lVar) {
        if (this.f5335i) {
            d0.a aVar = this.f5327a;
            g1.e eVar = (g1.e) aVar.f4341e;
            if (!lVar.f5268m.isEmpty()) {
                int i10 = 0;
                boolean z2 = f10 < 0.0f;
                int iC = d0.a.c(lVar, z2);
                int iA = d0.a.a(lVar, z2);
                if (iA >= 0) {
                    o1 o1Var = lVar.f5272q;
                    ?? r72 = lVar.f5268m;
                    if (iA < lVar.f5271p) {
                        if (iC != aVar.f4337a && iC >= 0) {
                            if (aVar.f4338b != z2) {
                                Object[] objArr = eVar.f7024a;
                                int i11 = eVar.f7026c;
                                for (int i12 = 0; i12 < i11; i12++) {
                                    ((n0) objArr[i12]).cancel();
                                }
                            }
                            aVar.f4338b = z2;
                            aVar.f4337a = iC;
                            eVar.h();
                            eVar.d(eVar.f7026c, this.f5341p.E(iC));
                        }
                        if (z2) {
                            m mVar = (m) qi.l.F0(r72);
                            if (((u0.l.l(mVar, o1Var) + ((int) (o1Var == o1.f19664a ? mVar.f5287n & 4294967295L : mVar.f5287n >> 32))) + lVar.f5274s) - lVar.f5270o < (-f10)) {
                                Object[] objArr2 = eVar.f7024a;
                                int i13 = eVar.f7026c;
                                while (i10 < i13) {
                                    ((n0) objArr2[i10]).a();
                                    i10++;
                                }
                            }
                        } else if (lVar.f5269n - u0.l.l((m) qi.l.z0(r72), o1Var) < f10) {
                            Object[] objArr3 = eVar.f7024a;
                            int i14 = eVar.f7026c;
                            while (i10 < i14) {
                                ((n0) objArr3[i10]).a();
                                i10++;
                            }
                        }
                    }
                }
            }
            aVar.f4340d = f10;
        }
    }
}
