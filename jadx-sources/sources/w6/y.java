package w6;

import u6.e0;
import u6.f0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final lh.e f18881a;

    /* renamed from: b, reason: collision with root package name */
    public final h f18882b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18883c;

    /* renamed from: d, reason: collision with root package name */
    public final qi.j f18884d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f18885e;

    public y(lh.e eVar, h hVar, boolean z2) {
        fj.l.f(eVar, "connectionElementKey");
        this.f18881a = eVar;
        this.f18882b = hVar;
        this.f18883c = z2;
        this.f18884d = new qi.j();
    }

    @Override // u6.f0
    public final Boolean a(ti.c cVar) {
        if (this.f18885e) {
            uk.c.S(21, "Connection is recycled");
            throw null;
        }
        a aVar = (a) cVar.getContext().C(this.f18881a);
        if (aVar != null && aVar.f18789b == this) {
            return Boolean.valueOf(!this.f18884d.isEmpty() || this.f18882b.f18809a.c());
        }
        uk.c.S(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // u6.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, ej.c r8, vi.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof w6.x
            if (r0 == 0) goto L13
            r0 = r9
            w6.x r0 = (w6.x) r0
            int r1 = r0.f18880f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18880f = r1
            goto L18
        L13:
            w6.x r0 = new w6.x
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f18878d
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f18880f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            w6.h r7 = r0.f18877c
            ej.c r8 = r0.f18876b
            java.lang.String r0 = r0.f18875a
            uk.c.R(r9)
            r9 = r7
            r7 = r0
            goto L66
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            uk.c.R(r9)
            boolean r9 = r6.f18885e
            r2 = 21
            if (r9 != 0) goto L8f
            ti.h r9 = r0.getContext()
            lh.e r5 = r6.f18881a
            ti.f r9 = r9.C(r5)
            w6.a r9 = (w6.a) r9
            if (r9 == 0) goto L89
            w6.y r9 = r9.f18789b
            if (r9 != r6) goto L89
            w6.h r9 = r6.f18882b
            r0.f18875a = r7
            r0.f18876b = r8
            r0.f18877c = r9
            r0.f18880f = r3
            yj.a r2 = r9.f18810b
            java.lang.Object r0 = r2.b(r0)
            if (r0 != r1) goto L66
            return r1
        L66:
            w6.s r0 = new w6.s     // Catch: java.lang.Throwable -> L7c
            w6.h r1 = r6.f18882b     // Catch: java.lang.Throwable -> L7c
            e7.c r7 = r1.d0(r7)     // Catch: java.lang.Throwable -> L7c
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r7 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L7e
            uk.c.q(r0, r4)     // Catch: java.lang.Throwable -> L7c
            r9.e(r4)
            return r7
        L7c:
            r7 = move-exception
            goto L85
        L7e:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L80
        L80:
            r8 = move-exception
            uk.c.q(r0, r7)     // Catch: java.lang.Throwable -> L7c
            throw r8     // Catch: java.lang.Throwable -> L7c
        L85:
            r9.e(r4)
            throw r7
        L89:
            java.lang.String r7 = "Attempted to use connection on a different coroutine"
            uk.c.S(r2, r7)
            throw r4
        L8f:
            java.lang.String r7 = "Connection is recycled"
            uk.c.S(r2, r7)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.y.b(java.lang.String, ej.c, vi.c):java.lang.Object");
    }

    @Override // u6.f0
    public final Object c(ej.e eVar, vi.i iVar) {
        e0 e0Var = e0.f16695b;
        if (this.f18885e) {
            uk.c.S(21, "Connection is recycled");
            throw null;
        }
        a aVar = (a) iVar.getContext().C(this.f18881a);
        if (aVar != null && aVar.f18789b == this) {
            return f(e0Var, eVar, iVar);
        }
        uk.c.S(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(u6.e0 r8, vi.c r9) {
        /*
            r7 = this;
            qi.j r0 = r7.f18884d
            java.lang.String r1 = "SAVEPOINT '"
            boolean r2 = r9 instanceof w6.u
            if (r2 == 0) goto L17
            r2 = r9
            w6.u r2 = (w6.u) r2
            int r3 = r2.f18863e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f18863e = r3
            goto L1c
        L17:
            w6.u r2 = new w6.u
            r2.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r2.f18861c
            ui.a r3 = ui.a.f17085a
            int r4 = r2.f18863e
            r5 = 1
            w6.h r6 = r7.f18882b
            if (r4 == 0) goto L3b
            if (r4 != r5) goto L33
            w6.h r8 = r2.f18860b
            u6.e0 r2 = r2.f18859a
            uk.c.R(r9)
            r9 = r8
            r8 = r2
            goto L4e
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            uk.c.R(r9)
            r2.f18859a = r8
            r2.f18860b = r6
            r2.f18863e = r5
            yj.a r9 = r6.f18810b
            java.lang.Object r9 = r9.b(r2)
            if (r9 != r3) goto L4d
            return r3
        L4d:
            r9 = r6
        L4e:
            r2 = 0
            int r3 = r0.f13518c     // Catch: java.lang.Throwable -> L68
            boolean r4 = r0.isEmpty()     // Catch: java.lang.Throwable -> L68
            if (r4 == 0) goto L7c
            int r8 = r8.ordinal()     // Catch: java.lang.Throwable -> L68
            if (r8 == 0) goto L76
            if (r8 == r5) goto L70
            r1 = 2
            if (r8 != r1) goto L6a
            java.lang.String r8 = "BEGIN EXCLUSIVE TRANSACTION"
            uk.c.y(r6, r8)     // Catch: java.lang.Throwable -> L68
            goto L90
        L68:
            r8 = move-exception
            goto L9e
        L6a:
            b3.e r8 = new b3.e     // Catch: java.lang.Throwable -> L68
            r8.<init>()     // Catch: java.lang.Throwable -> L68
            throw r8     // Catch: java.lang.Throwable -> L68
        L70:
            java.lang.String r8 = "BEGIN IMMEDIATE TRANSACTION"
            uk.c.y(r6, r8)     // Catch: java.lang.Throwable -> L68
            goto L90
        L76:
            java.lang.String r8 = "BEGIN DEFERRED TRANSACTION"
            uk.c.y(r6, r8)     // Catch: java.lang.Throwable -> L68
            goto L90
        L7c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L68
            r8.append(r3)     // Catch: java.lang.Throwable -> L68
            r1 = 39
            r8.append(r1)     // Catch: java.lang.Throwable -> L68
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L68
            uk.c.y(r6, r8)     // Catch: java.lang.Throwable -> L68
        L90:
            w6.t r8 = new w6.t     // Catch: java.lang.Throwable -> L68
            r8.<init>(r3)     // Catch: java.lang.Throwable -> L68
            r0.addLast(r8)     // Catch: java.lang.Throwable -> L68
            pi.o r8 = pi.o.f13011a     // Catch: java.lang.Throwable -> L68
            r9.e(r2)
            return r8
        L9e:
            r9.e(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.y.d(u6.e0, vi.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(boolean r9, vi.c r10) {
        /*
            r8 = this;
            qi.j r0 = r8.f18884d
            java.lang.String r1 = "ROLLBACK TRANSACTION TO SAVEPOINT '"
            java.lang.String r2 = "RELEASE SAVEPOINT '"
            boolean r3 = r10 instanceof w6.v
            if (r3 == 0) goto L19
            r3 = r10
            w6.v r3 = (w6.v) r3
            int r4 = r3.f18868e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f18868e = r4
            goto L1e
        L19:
            w6.v r3 = new w6.v
            r3.<init>(r8, r10)
        L1e:
            java.lang.Object r10 = r3.f18866c
            ui.a r4 = ui.a.f17085a
            int r5 = r3.f18868e
            r6 = 1
            w6.h r7 = r8.f18882b
            if (r5 == 0) goto L3b
            if (r5 != r6) goto L33
            boolean r9 = r3.f18864a
            w6.h r3 = r3.f18865b
            uk.c.R(r10)
            goto L4e
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            uk.c.R(r10)
            r3.f18865b = r7
            r3.f18864a = r9
            r3.f18868e = r6
            yj.a r10 = r7.f18810b
            java.lang.Object r10 = r10.b(r3)
            if (r10 != r4) goto L4d
            return r4
        L4d:
            r3 = r7
        L4e:
            r10 = 0
            boolean r4 = r0.isEmpty()     // Catch: java.lang.Throwable -> L78
            if (r4 != 0) goto Lbd
            boolean r4 = r0.isEmpty()     // Catch: java.lang.Throwable -> L78
            if (r4 != 0) goto Lb5
            int r4 = yd.f.B(r0)     // Catch: java.lang.Throwable -> L78
            java.lang.Object r4 = r0.e(r4)     // Catch: java.lang.Throwable -> L78
            w6.t r4 = (w6.t) r4     // Catch: java.lang.Throwable -> L78
            r5 = 39
            if (r9 == 0) goto L8f
            r4.getClass()     // Catch: java.lang.Throwable -> L78
            boolean r9 = r0.isEmpty()     // Catch: java.lang.Throwable -> L78
            if (r9 == 0) goto L7a
            java.lang.String r9 = "END TRANSACTION"
            uk.c.y(r7, r9)     // Catch: java.lang.Throwable -> L78
            goto Laf
        L78:
            r9 = move-exception
            goto Lc5
        L7a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78
            r9.<init>(r2)     // Catch: java.lang.Throwable -> L78
            int r0 = r4.f18858a     // Catch: java.lang.Throwable -> L78
            r9.append(r0)     // Catch: java.lang.Throwable -> L78
            r9.append(r5)     // Catch: java.lang.Throwable -> L78
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L78
            uk.c.y(r7, r9)     // Catch: java.lang.Throwable -> L78
            goto Laf
        L8f:
            boolean r9 = r0.isEmpty()     // Catch: java.lang.Throwable -> L78
            if (r9 == 0) goto L9b
            java.lang.String r9 = "ROLLBACK TRANSACTION"
            uk.c.y(r7, r9)     // Catch: java.lang.Throwable -> L78
            goto Laf
        L9b:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L78
            int r0 = r4.f18858a     // Catch: java.lang.Throwable -> L78
            r9.append(r0)     // Catch: java.lang.Throwable -> L78
            r9.append(r5)     // Catch: java.lang.Throwable -> L78
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L78
            uk.c.y(r7, r9)     // Catch: java.lang.Throwable -> L78
        Laf:
            pi.o r9 = pi.o.f13011a     // Catch: java.lang.Throwable -> L78
            r3.e(r10)
            return r9
        Lb5:
            java.util.NoSuchElementException r9 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = "List is empty."
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L78
            throw r9     // Catch: java.lang.Throwable -> L78
        Lbd:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = "Not in a transaction"
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L78
            throw r9     // Catch: java.lang.Throwable -> L78
        Lc5:
            r3.e(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.y.e(boolean, vi.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x009f, code lost:
    
        if (e(false, r0) != r1) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [ej.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0, types: [u6.f0, w6.y] */
    /* JADX WARN: Type inference failed for: r9v13, types: [int] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(u6.e0 r9, ej.e r10, vi.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof w6.w
            if (r0 == 0) goto L13
            r0 = r11
            w6.w r0 = (w6.w) r0
            int r1 = r0.f18874f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18874f = r1
            goto L18
        L13:
            w6.w r0 = new w6.w
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f18872d
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f18874f
            r3 = 0
            r4 = 5
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L5d
            if (r2 == r7) goto L54
            if (r2 == r6) goto L4b
            if (r2 == r5) goto L45
            r9 = 4
            if (r2 == r9) goto L45
            if (r2 == r4) goto L38
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.Throwable r9 = r0.f18870b
            java.lang.Object r10 = r0.f18869a
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            uk.c.R(r11)     // Catch: android.database.SQLException -> L43
            goto La7
        L43:
            r11 = move-exception
            goto La2
        L45:
            java.lang.Object r9 = r0.f18869a
            uk.c.R(r11)
            return r9
        L4b:
            int r9 = r0.f18871c
            uk.c.R(r11)     // Catch: java.lang.Throwable -> L51
            goto L84
        L51:
            r9 = move-exception
            r10 = r9
            goto L93
        L54:
            java.lang.Object r9 = r0.f18869a
            r10 = r9
            ej.e r10 = (ej.e) r10
            uk.c.R(r11)
            goto L6f
        L5d:
            uk.c.R(r11)
            if (r9 != 0) goto L64
            u6.e0 r9 = u6.e0.f16694a
        L64:
            r0.f18869a = r10
            r0.f18874f = r7
            java.lang.Object r9 = r8.d(r9, r0)
            if (r9 != r1) goto L6f
            goto La1
        L6f:
            w6.i r9 = new w6.i     // Catch: java.lang.Throwable -> L51
            r11 = 1
            r9.<init>(r8, r11)     // Catch: java.lang.Throwable -> L51
            r11 = 0
            r0.f18869a = r11     // Catch: java.lang.Throwable -> L51
            r0.f18871c = r7     // Catch: java.lang.Throwable -> L51
            r0.f18874f = r6     // Catch: java.lang.Throwable -> L51
            java.lang.Object r11 = r10.invoke(r9, r0)     // Catch: java.lang.Throwable -> L51
            if (r11 != r1) goto L83
            goto La1
        L83:
            r9 = r7
        L84:
            if (r9 == 0) goto L87
            r3 = r7
        L87:
            r0.f18869a = r11
            r0.f18874f = r5
            java.lang.Object r9 = r8.e(r3, r0)
            if (r9 != r1) goto L92
            goto La1
        L92:
            return r11
        L93:
            throw r10     // Catch: java.lang.Throwable -> L94
        L94:
            r9 = move-exception
            r0.f18869a = r10     // Catch: android.database.SQLException -> L43
            r0.f18870b = r9     // Catch: android.database.SQLException -> L43
            r0.f18874f = r4     // Catch: android.database.SQLException -> L43
            java.lang.Object r10 = r8.e(r3, r0)     // Catch: android.database.SQLException -> L43
            if (r10 != r1) goto La7
        La1:
            return r1
        La2:
            if (r10 == 0) goto La8
            mk.b.i(r10, r11)
        La7:
            throw r9
        La8:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.y.f(u6.e0, ej.e, vi.c):java.lang.Object");
    }
}
