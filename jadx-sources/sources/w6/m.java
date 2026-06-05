package w6;

import java.util.concurrent.atomic.AtomicInteger;
import u6.e0;
import u6.f0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final fj.j f18828a;

    /* renamed from: b, reason: collision with root package name */
    public final e7.a f18829b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f18830c;

    /* renamed from: d, reason: collision with root package name */
    public e0 f18831d;

    /* JADX WARN: Multi-variable type inference failed */
    public m(ej.e eVar, e7.a aVar) {
        fj.l.f(aVar, "delegate");
        this.f18828a = (fj.j) eVar;
        this.f18829b = aVar;
        this.f18830c = new AtomicInteger(0);
    }

    @Override // u6.f0
    public final Boolean a(ti.c cVar) {
        return Boolean.valueOf(this.f18831d != null || this.f18829b.c());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [ej.e, fj.j] */
    @Override // u6.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, ej.c r7, vi.c r8) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r8 instanceof w6.k
            if (r0 == 0) goto L13
            r0 = r8
            w6.k r0 = (w6.k) r0
            int r1 = r0.f18824e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18824e = r1
            goto L18
        L13:
            w6.k r0 = new w6.k
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f18822c
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f18824e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            uk.c.R(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            ej.c r7 = r0.f18821b
            java.lang.String r6 = r0.f18820a
            uk.c.R(r8)
            goto L4a
        L3a:
            uk.c.R(r8)
            r0.f18820a = r6
            r0.f18821b = r7
            r0.f18824e = r4
            java.lang.Boolean r8 = r5.a(r0)
            if (r8 != r1) goto L4a
            goto L66
        L4a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r2 = 0
            if (r8 == 0) goto L68
            w6.l r8 = new w6.l
            r8.<init>(r5, r6, r7, r2)
            r0.f18820a = r2
            r0.f18821b = r2
            r0.f18824e = r3
            fj.j r6 = r5.f18828a
            java.lang.Object r6 = r6.invoke(r8, r0)
            if (r6 != r1) goto L67
        L66:
            return r1
        L67:
            return r6
        L68:
            e7.a r8 = r5.f18829b
            e7.c r6 = r8.d0(r6)
            java.lang.Object r7 = r7.invoke(r6)     // Catch: java.lang.Throwable -> L76
            uk.c.q(r6, r2)
            return r7
        L76:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L78
        L78:
            r8 = move-exception
            uk.c.q(r6, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.m.b(java.lang.String, ej.c, vi.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [ej.e, fj.j] */
    @Override // u6.f0
    public final Object c(ej.e eVar, vi.i iVar) {
        e0 e0Var = e0.f16694a;
        Object objInvoke = this.f18828a.invoke(new d1.l(eVar, (ti.c) null, this), iVar);
        ui.a aVar = ui.a.f17085a;
        return objInvoke;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(u6.e0 r9, ej.e r10, vi.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof w6.j
            if (r0 == 0) goto L13
            r0 = r11
            w6.j r0 = (w6.j) r0
            int r1 = r0.f18819d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18819d = r1
            goto L18
        L13:
            w6.j r0 = new w6.j
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f18817b
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f18819d
            java.lang.String r3 = "ROLLBACK TRANSACTION"
            r4 = 0
            java.util.concurrent.atomic.AtomicInteger r5 = r8.f18830c
            r6 = 1
            e7.a r7 = r8.f18829b
            if (r2 == 0) goto L3a
            if (r2 != r6) goto L32
            int r6 = r0.f18816a
            uk.c.R(r11)     // Catch: java.lang.Throwable -> L30
            goto L78
        L30:
            r9 = move-exception
            goto L8c
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            uk.c.R(r11)
            int r11 = r9.ordinal()
            if (r11 == 0) goto L5a
            if (r11 == r6) goto L54
            r2 = 2
            if (r11 != r2) goto L4e
            java.lang.String r11 = "BEGIN EXCLUSIVE TRANSACTION"
            uk.c.y(r7, r11)
            goto L5f
        L4e:
            b3.e r9 = new b3.e
            r9.<init>()
            throw r9
        L54:
            java.lang.String r11 = "BEGIN IMMEDIATE TRANSACTION"
            uk.c.y(r7, r11)
            goto L5f
        L5a:
            java.lang.String r11 = "BEGIN DEFERRED TRANSACTION"
            uk.c.y(r7, r11)
        L5f:
            int r11 = r5.incrementAndGet()
            if (r11 <= 0) goto L67
            r8.f18831d = r9
        L67:
            w6.i r9 = new w6.i     // Catch: java.lang.Throwable -> L30
            r11 = 0
            r9.<init>(r8, r11)     // Catch: java.lang.Throwable -> L30
            r0.f18816a = r6     // Catch: java.lang.Throwable -> L30
            r0.f18819d = r6     // Catch: java.lang.Throwable -> L30
            java.lang.Object r11 = r10.invoke(r9, r0)     // Catch: java.lang.Throwable -> L30
            if (r11 != r1) goto L78
            return r1
        L78:
            int r9 = r5.decrementAndGet()
            if (r9 != 0) goto L80
            r8.f18831d = r4
        L80:
            if (r6 == 0) goto L88
            java.lang.String r9 = "END TRANSACTION"
            uk.c.y(r7, r9)
            return r11
        L88:
            uk.c.y(r7, r3)
            return r11
        L8c:
            throw r9     // Catch: java.lang.Throwable -> L8d
        L8d:
            r10 = move-exception
            int r11 = r5.decrementAndGet()     // Catch: android.database.SQLException -> L97
            if (r11 != 0) goto L99
            r8.f18831d = r4     // Catch: android.database.SQLException -> L97
            goto L99
        L97:
            r11 = move-exception
            goto L9d
        L99:
            uk.c.y(r7, r3)     // Catch: android.database.SQLException -> L97
            goto La0
        L9d:
            mk.b.i(r9, r11)
        La0:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.m.d(u6.e0, ej.e, vi.c):java.lang.Object");
    }
}
