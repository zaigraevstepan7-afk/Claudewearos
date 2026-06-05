package y;

import java.util.concurrent.CancellationException;
import x.s1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final float f20151a = 400;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(x.s1 r10, float r11, t.k r12, t.u r13, ej.c r14, vi.c r15) {
        /*
            boolean r0 = r15 instanceof y.i
            if (r0 == 0) goto L13
            r0 = r15
            y.i r0 = (y.i) r0
            int r1 = r0.f20144e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20144e = r1
            goto L18
        L13:
            y.i r0 = new y.i
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f20143d
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f20144e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            float r11 = r0.f20140a
            fj.s r10 = r0.f20142c
            t.k r12 = r0.f20141b
            uk.c.R(r15)
            goto L6a
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            uk.c.R(r15)
            fj.s r6 = new fj.s
            r6.<init>()
            java.lang.Object r15 = r12.b()
            java.lang.Number r15 = (java.lang.Number) r15
            float r15 = r15.floatValue()
            r2 = 0
            int r15 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r15 != 0) goto L4e
            r15 = r3
            goto L4f
        L4e:
            r15 = 0
        L4f:
            r15 = r15 ^ r3
            y.h r4 = new y.h
            r9 = 0
            r7 = r10
            r5 = r11
            r8 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f20141b = r12
            r0.f20142c = r6
            r0.f20140a = r5
            r0.f20144e = r3
            java.lang.Object r10 = t.d.f(r12, r13, r15, r4, r0)
            if (r10 != r1) goto L68
            return r1
        L68:
            r11 = r5
            r10 = r6
        L6a:
            y.a r13 = new y.a
            float r10 = r10.f6804a
            float r11 = r11 - r10
            java.lang.Float r10 = new java.lang.Float
            r10.<init>(r11)
            r13.<init>(r10, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: y.k.a(x.s1, float, t.k, t.u, ej.c, vi.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(x.s1 r16, float r17, float r18, t.k r19, t.u0 r20, ej.c r21, vi.c r22) {
        /*
            r0 = r17
            r1 = r22
            boolean r2 = r1 instanceof y.j
            if (r2 == 0) goto L18
            r2 = r1
            y.j r2 = (y.j) r2
            int r3 = r2.f20150f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f20150f = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            y.j r2 = new y.j
            r2.<init>(r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.f20149e
            ui.a r2 = ui.a.f17085a
            int r3 = r8.f20150f
            r9 = 0
            r4 = 1
            if (r3 == 0) goto L40
            if (r3 != r4) goto L38
            float r0 = r8.f20146b
            float r2 = r8.f20145a
            fj.s r3 = r8.f20148d
            t.k r4 = r8.f20147c
            uk.c.R(r1)
            r1 = r0
            r0 = r2
            goto L91
        L38:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L40:
            uk.c.R(r1)
            fj.s r12 = new fj.s
            r12.<init>()
            java.lang.Object r1 = r19.b()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            java.lang.Object r5 = r19.b()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L67
            r5 = r4
            goto L68
        L67:
            r5 = 0
        L68:
            r6 = r5 ^ 1
            y.h r10 = new y.h
            r15 = 1
            r13 = r16
            r11 = r18
            r14 = r21
            r10.<init>(r11, r12, r13, r14, r15)
            r5 = r3
            r3 = r19
            r8.f20147c = r3
            r8.f20148d = r12
            r8.f20145a = r0
            r8.f20146b = r1
            r8.f20150f = r4
            r4 = r5
            r7 = r10
            r5 = r20
            java.lang.Object r4 = t.d.h(r3, r4, r5, r6, r7, r8)
            if (r4 != r2) goto L8e
            return r2
        L8e:
            r4 = r19
            r3 = r12
        L91:
            java.lang.Object r2 = r4.b()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r1 = d(r2, r1)
            y.a r2 = new y.a
            float r3 = r3.f6804a
            float r0 = r0 - r3
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            r0 = 29
            t.k r0 = t.d.k(r4, r9, r1, r0)
            r2.<init>(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: y.k.b(x.s1, float, float, t.k, t.u0, ej.c, vi.c):java.lang.Object");
    }

    public static final void c(t.i iVar, s1 s1Var, ej.c cVar, float f10) {
        float fA;
        try {
            fA = s1Var.a(f10);
        } catch (CancellationException unused) {
            iVar.a();
            fA = 0.0f;
        }
        cVar.invoke(Float.valueOf(fA));
        if (Math.abs(f10 - fA) > 0.5f) {
            iVar.a();
        }
    }

    public static final float d(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        return (f11 <= 0.0f ? f10 >= f11 : f10 <= f11) ? f10 : f11;
    }
}
