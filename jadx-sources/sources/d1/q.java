package d1;

import c1.y5;
import f1.f1;
import f1.j1;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final c1.l f4554a;

    /* renamed from: b, reason: collision with root package name */
    public final ej.a f4555b;

    /* renamed from: c, reason: collision with root package name */
    public final a7.e f4556c;

    /* renamed from: d, reason: collision with root package name */
    public final ej.c f4557d;

    /* renamed from: g, reason: collision with root package name */
    public final j1 f4560g;

    /* renamed from: k, reason: collision with root package name */
    public final f1 f4563k;

    /* renamed from: l, reason: collision with root package name */
    public final j1 f4564l;

    /* renamed from: m, reason: collision with root package name */
    public final j1 f4565m;

    /* renamed from: n, reason: collision with root package name */
    public final n f4566n;

    /* renamed from: e, reason: collision with root package name */
    public final n0 f4558e = new n0();

    /* renamed from: f, reason: collision with root package name */
    public final p f4559f = new p(this);

    /* renamed from: h, reason: collision with root package name */
    public final f1.y f4561h = f1.s.q(new j(this, 0));

    /* renamed from: i, reason: collision with root package name */
    public final f1.y f4562i = f1.s.q(new j(this, 1));
    public final f1 j = new f1(Float.NaN);

    public q(y5 y5Var, c1.l lVar, ej.a aVar, a7.e eVar, ej.c cVar) {
        this.f4554a = lVar;
        this.f4555b = aVar;
        this.f4556c = eVar;
        this.f4557d = cVar;
        this.f4560g = f1.s.A(y5Var);
        f1.s.r(new j(this, 2), f1.f.f6293z);
        this.f4563k = new f1(0.0f);
        this.f4564l = f1.s.A(null);
        this.f4565m = f1.s.A(new o0(qi.t.f13521a));
        this.f4566n = new n(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r14, v.f1 r15, ej.g r16, vi.c r17) {
        /*
            r13 = this;
            r0 = r17
            boolean r2 = r0 instanceof d1.m
            if (r2 == 0) goto L16
            r2 = r0
            d1.m r2 = (d1.m) r2
            int r3 = r2.f4535c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f4535c = r3
        L14:
            r6 = r2
            goto L1c
        L16:
            d1.m r2 = new d1.m
            r2.<init>(r13, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r6.f4533a
            ui.a r7 = ui.a.f17085a
            int r2 = r6.f4535c
            f1.f1 r8 = r13.j
            ej.c r9 = r13.f4557d
            r10 = 1056964608(0x3f000000, float:0.5)
            r11 = 1
            r4 = 0
            if (r2 == 0) goto L3c
            if (r2 != r11) goto L34
            uk.c.R(r0)     // Catch: java.lang.Throwable -> L32
            goto L68
        L32:
            r0 = move-exception
            goto L9e
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3c:
            uk.c.R(r0)
            d1.o0 r0 = r13.d()
            java.util.Map r0 = r0.f4550a
            boolean r0 = r0.containsKey(r14)
            if (r0 == 0) goto Ld4
            d1.n0 r12 = r13.f4558e     // Catch: java.lang.Throwable -> L32
            c1.h8 r0 = new c1.h8     // Catch: java.lang.Throwable -> L32
            r5 = 1
            r1 = r13
            r2 = r14
            r3 = r16
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L32
            r6.f4535c = r11     // Catch: java.lang.Throwable -> L32
            r12.getClass()     // Catch: java.lang.Throwable -> L32
            d1.m0 r2 = new d1.m0     // Catch: java.lang.Throwable -> L32
            r2.<init>(r15, r12, r0, r4)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r0 = qj.b0.h(r2, r6)     // Catch: java.lang.Throwable -> L32
            if (r0 != r7) goto L68
            return r7
        L68:
            r13.h(r4)
            d1.o0 r0 = r13.d()
            float r2 = r8.g()
            java.lang.Object r0 = r0.a(r2)
            if (r0 == 0) goto Ld7
            float r2 = r8.g()
            d1.o0 r3 = r13.d()
            float r3 = r3.d(r0)
            float r2 = r2 - r3
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 > 0) goto Ld7
            java.lang.Object r2 = r9.invoke(r0)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Ld7
            r13.g(r0)
            goto Ld7
        L9e:
            r13.h(r4)
            d1.o0 r2 = r13.d()
            float r3 = r8.g()
            java.lang.Object r2 = r2.a(r3)
            if (r2 == 0) goto Ld3
            float r3 = r8.g()
            d1.o0 r4 = r13.d()
            float r4 = r4.d(r2)
            float r3 = r3 - r4
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 > 0) goto Ld3
            java.lang.Object r3 = r9.invoke(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Ld3
            r13.g(r2)
        Ld3:
            throw r0
        Ld4:
            r13.g(r14)
        Ld7:
            pi.o r0 = pi.o.f13011a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.q.a(java.lang.Object, v.f1, ej.g, vi.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(v.f1 r10, d1.o r11, vi.c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof d1.k
            if (r0 == 0) goto L13
            r0 = r12
            d1.k r0 = (d1.k) r0
            int r1 = r0.f4522c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4522c = r1
            goto L18
        L13:
            d1.k r0 = new d1.k
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f4520a
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f4522c
            f1.f1 r3 = r9.j
            ej.c r4 = r9.f4557d
            r5 = 1056964608(0x3f000000, float:0.5)
            r6 = 1
            if (r2 == 0) goto L37
            if (r2 != r6) goto L2f
            uk.c.R(r12)     // Catch: java.lang.Throwable -> L2d
            goto L54
        L2d:
            r10 = move-exception
            goto L89
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            uk.c.R(r12)
            d1.n0 r12 = r9.f4558e     // Catch: java.lang.Throwable -> L2d
            d1.l r2 = new d1.l     // Catch: java.lang.Throwable -> L2d
            r7 = 0
            r8 = 0
            r2.<init>(r9, r11, r8, r7)     // Catch: java.lang.Throwable -> L2d
            r0.f4522c = r6     // Catch: java.lang.Throwable -> L2d
            r12.getClass()     // Catch: java.lang.Throwable -> L2d
            d1.m0 r11 = new d1.m0     // Catch: java.lang.Throwable -> L2d
            r11.<init>(r10, r12, r2, r8)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r10 = qj.b0.h(r11, r0)     // Catch: java.lang.Throwable -> L2d
            if (r10 != r1) goto L54
            return r1
        L54:
            d1.o0 r10 = r9.d()
            float r11 = r3.g()
            java.lang.Object r10 = r10.a(r11)
            if (r10 == 0) goto L86
            float r11 = r3.g()
            d1.o0 r12 = r9.d()
            float r12 = r12.d(r10)
            float r11 = r11 - r12
            float r11 = java.lang.Math.abs(r11)
            int r11 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r11 > 0) goto L86
            java.lang.Object r11 = r4.invoke(r10)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L86
            r9.g(r10)
        L86:
            pi.o r10 = pi.o.f13011a
            return r10
        L89:
            d1.o0 r11 = r9.d()
            float r12 = r3.g()
            java.lang.Object r11 = r11.a(r12)
            if (r11 == 0) goto Lbb
            float r12 = r3.g()
            d1.o0 r0 = r9.d()
            float r0 = r0.d(r11)
            float r12 = r12 - r0
            float r12 = java.lang.Math.abs(r12)
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 > 0) goto Lbb
            java.lang.Object r12 = r4.invoke(r11)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto Lbb
            r9.g(r11)
        Lbb:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.q.b(v.f1, d1.o, vi.c):java.lang.Object");
    }

    public final Object c(float f10, float f11, Object obj) {
        o0 o0VarD = d();
        float fD = o0VarD.d(obj);
        float fFloatValue = ((Number) this.f4555b.a()).floatValue();
        if (fD != f10 && !Float.isNaN(fD)) {
            c1.l lVar = this.f4554a;
            if (fD < f10) {
                if (f11 >= fFloatValue) {
                    Object objB = o0VarD.b(f10, true);
                    fj.l.c(objB);
                    return objB;
                }
                Object objB2 = o0VarD.b(f10, true);
                fj.l.c(objB2);
                if (f10 >= Math.abs(Math.abs(((Number) lVar.invoke(Float.valueOf(Math.abs(o0VarD.d(objB2) - fD)))).floatValue()) + fD)) {
                    return objB2;
                }
            } else {
                if (f11 <= (-fFloatValue)) {
                    Object objB3 = o0VarD.b(f10, false);
                    fj.l.c(objB3);
                    return objB3;
                }
                Object objB4 = o0VarD.b(f10, false);
                fj.l.c(objB4);
                float fAbs = Math.abs(fD - Math.abs(((Number) lVar.invoke(Float.valueOf(Math.abs(fD - o0VarD.d(objB4))))).floatValue()));
                if (f10 >= 0.0f ? f10 <= fAbs : Math.abs(f10) >= fAbs) {
                    return objB4;
                }
            }
        }
        return obj;
    }

    public final o0 d() {
        return (o0) this.f4565m.getValue();
    }

    public final float e(float f10) {
        Float fValueOf;
        f1 f1Var = this.j;
        float fG = (Float.isNaN(f1Var.g()) ? 0.0f : f1Var.g()) + f10;
        float fC = d().c();
        Collection collectionValues = d().f4550a.values();
        fj.l.f(collectionValues, "<this>");
        Iterator it = collectionValues.iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        return cg.b.o(fG, fC, fValueOf != null ? fValueOf.floatValue() : Float.NaN);
    }

    public final float f() {
        f1 f1Var = this.j;
        if (Float.isNaN(f1Var.g())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return f1Var.g();
    }

    public final void g(Object obj) {
        this.f4560g.setValue(obj);
    }

    public final void h(Object obj) {
        this.f4564l.setValue(obj);
    }
}
