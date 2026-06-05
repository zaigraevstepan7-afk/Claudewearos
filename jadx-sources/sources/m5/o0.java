package m5;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final yj.c f11354a = new yj.c();

    /* renamed from: b, reason: collision with root package name */
    public final d8.e f11355b = new d8.e(14);

    /* renamed from: c, reason: collision with root package name */
    public final n f11356c = new n(new lb.k0(2, null, 1));

    public o0(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f11355b.f5001a).get());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ej.c r8, vi.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof m5.m0
            if (r0 == 0) goto L13
            r0 = r9
            m5.m0 r0 = (m5.m0) r0
            int r1 = r0.f11342e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11342e = r1
            goto L18
        L13:
            m5.m0 r0 = new m5.m0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f11340c
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f11342e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.f11338a
            yj.a r8 = (yj.a) r8
            uk.c.R(r9)     // Catch: java.lang.Throwable -> L2f
            goto L67
        L2f:
            r9 = move-exception
            goto L6f
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            yj.c r8 = r0.f11339b
            java.lang.Object r2 = r0.f11338a
            ej.c r2 = (ej.c) r2
            uk.c.R(r9)
            r9 = r8
            r8 = r2
            goto L57
        L45:
            uk.c.R(r9)
            r0.f11338a = r8
            yj.c r9 = r7.f11354a
            r0.f11339b = r9
            r0.f11342e = r4
            java.lang.Object r2 = r9.b(r0)
            if (r2 != r1) goto L57
            goto L63
        L57:
            r0.f11338a = r9     // Catch: java.lang.Throwable -> L6b
            r0.f11339b = r5     // Catch: java.lang.Throwable -> L6b
            r0.f11342e = r3     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L6b
            if (r8 != r1) goto L64
        L63:
            return r1
        L64:
            r6 = r9
            r9 = r8
            r8 = r6
        L67:
            r8.e(r5)
            return r9
        L6b:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L6f:
            r8.e(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.o0.b(ej.c, vi.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(ej.e r7, vi.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof m5.n0
            if (r0 == 0) goto L13
            r0 = r8
            m5.n0 r0 = (m5.n0) r0
            int r1 = r0.f11349e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11349e = r1
            goto L18
        L13:
            m5.n0 r0 = new m5.n0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f11347c
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f11349e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            boolean r7 = r0.f11346b
            yj.c r0 = r0.f11345a
            uk.c.R(r8)     // Catch: java.lang.Throwable -> L2c
            goto L53
        L2c:
            r8 = move-exception
            goto L5d
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            uk.c.R(r8)
            yj.c r8 = r6.f11354a
            boolean r2 = r8.g()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L59
            r0.f11345a = r8     // Catch: java.lang.Throwable -> L59
            r0.f11346b = r2     // Catch: java.lang.Throwable -> L59
            r0.f11349e = r3     // Catch: java.lang.Throwable -> L59
            java.lang.Object r7 = r7.invoke(r5, r0)     // Catch: java.lang.Throwable -> L59
            if (r7 != r1) goto L50
            return r1
        L50:
            r0 = r8
            r8 = r7
            r7 = r2
        L53:
            if (r7 == 0) goto L58
            r0.e(r4)
        L58:
            return r8
        L59:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L5d:
            if (r7 == 0) goto L62
            r0.e(r4)
        L62:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.o0.c(ej.e, vi.c):java.lang.Object");
    }
}
