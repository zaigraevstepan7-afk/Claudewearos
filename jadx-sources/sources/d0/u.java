package d0;

import c1.p4;
import f0.l0;
import f0.n0;
import f0.o0;
import f0.y;
import f1.a1;
import f1.j1;
import v2.f0;
import x.f2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u implements f2 {

    /* renamed from: x, reason: collision with root package name */
    public static final qh.c f4439x = s1.k.b(new p4(17), new ab.d(21));

    /* renamed from: a, reason: collision with root package name */
    public final a f4440a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4441b;

    /* renamed from: c, reason: collision with root package name */
    public o f4442c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4443d;

    /* renamed from: e, reason: collision with root package name */
    public final q f4444e;

    /* renamed from: f, reason: collision with root package name */
    public final j1 f4445f;

    /* renamed from: g, reason: collision with root package name */
    public final z.k f4446g;

    /* renamed from: h, reason: collision with root package name */
    public float f4447h;

    /* renamed from: i, reason: collision with root package name */
    public final x.n f4448i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public f0 f4449k;

    /* renamed from: l, reason: collision with root package name */
    public final s f4450l;

    /* renamed from: m, reason: collision with root package name */
    public final f0.e f4451m;

    /* renamed from: n, reason: collision with root package name */
    public final y f4452n;

    /* renamed from: o, reason: collision with root package name */
    public final d8.e f4453o;

    /* renamed from: p, reason: collision with root package name */
    public final o0 f4454p;

    /* renamed from: q, reason: collision with root package name */
    public final d8.e f4455q;

    /* renamed from: r, reason: collision with root package name */
    public final l0 f4456r;

    /* renamed from: s, reason: collision with root package name */
    public final a1 f4457s;

    /* renamed from: t, reason: collision with root package name */
    public final j1 f4458t;

    /* renamed from: u, reason: collision with root package name */
    public final j1 f4459u;

    /* renamed from: v, reason: collision with root package name */
    public final a1 f4460v;

    /* renamed from: w, reason: collision with root package name */
    public final t0.j f4461w;

    public u(int i10, int i11) {
        a aVar = new a();
        aVar.f4337a = -1;
        aVar.f4339c = -1;
        this.f4440a = aVar;
        this.f4444e = new q(i10, i11, 0);
        this.f4445f = new j1(w.f4463a, f1.f.f6290d);
        this.f4446g = new z.k();
        this.f4448i = new x.n(new ab.k(this, 8));
        this.j = true;
        this.f4450l = new s(this, 0);
        this.f4451m = new f0.e();
        this.f4452n = new y();
        this.f4453o = new d8.e(6);
        this.f4454p = new o0(new r(this, i10));
        this.f4455q = new d8.e(this);
        this.f4456r = new l0();
        this.f4457s = f0.o.h();
        Boolean bool = Boolean.FALSE;
        this.f4458t = f1.s.A(bool);
        this.f4459u = f1.s.A(bool);
        this.f4460v = f0.o.h();
        this.f4461w = new t0.j(10);
    }

    @Override // x.f2
    public final boolean a() {
        return this.f4448i.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r5.f4448i.b(r6, r7, r0) == r1) goto L23;
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
            boolean r0 = r8 instanceof d0.t
            if (r0 == 0) goto L13
            r0 = r8
            d0.t r0 = (d0.t) r0
            int r1 = r0.f4438e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4438e = r1
            goto L18
        L13:
            d0.t r0 = new d0.t
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f4436c
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f4438e
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
            vi.i r6 = r0.f4435b
            r7 = r6
            ej.e r7 = (ej.e) r7
            v.f1 r6 = r0.f4434a
            uk.c.R(r8)
            goto L5c
        L3d:
            uk.c.R(r8)
            f1.j1 r8 = r5.f4445f
            java.lang.Object r8 = r8.getValue()
            d0.o r2 = d0.w.f4463a
            if (r8 != r2) goto L5c
            r0.f4434a = r6
            r8 = r7
            vi.i r8 = (vi.i) r8
            r0.f4435b = r8
            r0.f4438e = r4
            f0.e r8 = r5.f4451m
            java.lang.Object r8 = r8.h(r0)
            if (r8 != r1) goto L5c
            goto L6b
        L5c:
            r8 = 0
            r0.f4434a = r8
            r0.f4435b = r8
            r0.f4438e = r3
            x.n r8 = r5.f4448i
            java.lang.Object r6 = r8.b(r6, r7, r0)
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            pi.o r6 = pi.o.f13011a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.u.b(v.f1, ej.e, vi.c):java.lang.Object");
    }

    @Override // x.f2
    public final boolean c() {
        return ((Boolean) this.f4459u.getValue()).booleanValue();
    }

    @Override // x.f2
    public final boolean d() {
        return ((Boolean) this.f4458t.getValue()).booleanValue();
    }

    @Override // x.f2
    public final float e(float f10) {
        return this.f4448i.e(f10);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void f(o oVar, boolean z2, boolean z10) {
        float f10;
        t0.j jVar;
        long j;
        ?? r2 = oVar.f4402k;
        int i10 = oVar.f4405n;
        int i11 = oVar.f4394b;
        p pVar = oVar.f4393a;
        this.f4454p.f6180e = r2.size();
        t0.j jVar2 = this.f4461w;
        q qVar = this.f4444e;
        if (!z2 && this.f4441b) {
            this.f4442c = oVar;
            t1.g gVarF = t1.r.f();
            ej.c cVarE = gVarF != null ? gVarF.e() : null;
            t1.g gVarK = t1.r.k(gVarF);
            try {
                if (!(((Number) ((t.k) jVar2.f15364c).f15211b.getValue()).floatValue() == 0.0f) && pVar != null && pVar.f4409a == qVar.f4425b.g() && i11 == qVar.f4426c.g()) {
                    jVar2.v();
                }
                return;
            } finally {
                t1.r.n(gVarF, gVarK, cVarE);
            }
        }
        if (z2) {
            this.f4441b = true;
        }
        this.f4459u.setValue(Boolean.valueOf(((pVar != null ? pVar.f4409a : 0) == 0 && i11 == 0) ? false : true));
        this.f4458t.setValue(Boolean.valueOf(oVar.f4395c));
        this.f4447h -= oVar.f4396d;
        this.f4445f.setValue(oVar);
        if (z10) {
            qVar.getClass();
            if (!(((float) i11) >= 0.0f)) {
                a0.a.c("scrollOffset should be non-negative");
            }
            qVar.f4426c.h(i11);
            jVar = jVar2;
        } else {
            p pVar2 = (p) qi.l.A0(r2);
            p pVar3 = (p) qi.l.G0(r2);
            if (pVar2 != null) {
                f10 = 0.0f;
                jVar = jVar2;
                j = pVar2.f4409a;
            } else {
                f10 = 0.0f;
                jVar = jVar2;
                j = -1;
            }
            u3.a.o(j, "firstVisibleItem:index");
            u3.a.o(pVar3 != null ? pVar3.f4409a : -1L, "lastVisibleItem:index");
            qVar.getClass();
            qVar.f4428e = pVar != null ? pVar.f4415g : null;
            if (qVar.f4427d || i10 > 0) {
                qVar.f4427d = true;
                if (!(((float) i11) >= f10)) {
                    a0.a.c("scrollOffset should be non-negative");
                }
                qVar.a(pVar != null ? pVar.f4409a : 0, i11);
            }
            if (this.j) {
                a aVar = this.f4440a;
                int i12 = aVar.f4337a;
                boolean z11 = aVar.f4338b;
                if (i12 != -1 && !r2.isEmpty() && i12 != a.b(oVar, z11)) {
                    aVar.f4337a = -1;
                    n0 n0Var = (n0) aVar.f4341e;
                    if (n0Var != null) {
                        n0Var.cancel();
                    }
                    aVar.f4341e = null;
                }
                int i13 = aVar.f4339c;
                if (i13 != -1 && aVar.f4340d != f10 && i13 != i10 && !r2.isEmpty()) {
                    int iB = a.b(oVar, aVar.f4340d < f10);
                    if (iB >= 0 && iB < i10) {
                        aVar.f4337a = iB;
                        aVar.f4341e = d8.e.F(this.f4455q, iB);
                    }
                }
                aVar.f4339c = i10;
            }
        }
        if (z2) {
            jVar.w(oVar.f4398f, oVar.f4401i, oVar.f4400h);
        }
    }

    public final o g() {
        return (o) this.f4445f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final void h(float f10, o oVar) {
        n0 n0Var;
        n0 n0Var2;
        if (this.j) {
            ?? r02 = oVar.f4402k;
            ?? r12 = oVar.f4402k;
            boolean zIsEmpty = r02.isEmpty();
            a aVar = this.f4440a;
            if (!zIsEmpty) {
                boolean z2 = f10 < 0.0f;
                int iB = a.b(oVar, z2);
                if (iB >= 0 && iB < oVar.f4405n) {
                    if (iB != aVar.f4337a) {
                        if (aVar.f4338b != z2) {
                            aVar.f4337a = -1;
                            n0 n0Var3 = (n0) aVar.f4341e;
                            if (n0Var3 != null) {
                                n0Var3.cancel();
                            }
                            aVar.f4341e = null;
                        }
                        aVar.f4338b = z2;
                        aVar.f4337a = iB;
                        aVar.f4341e = d8.e.F(this.f4455q, iB);
                    }
                    if (z2) {
                        p pVar = (p) qi.l.F0(r12);
                        if (((pVar.j + pVar.f4418k) + oVar.f4408q) - oVar.f4404m < (-f10) && (n0Var2 = (n0) aVar.f4341e) != null) {
                            n0Var2.a();
                        }
                    } else if (oVar.f4403l - ((p) qi.l.z0(r12)).j < f10 && (n0Var = (n0) aVar.f4341e) != null) {
                        n0Var.a();
                    }
                }
            }
            aVar.f4340d = f10;
        }
    }
}
