package m5;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import qj.s1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f11408a;

    /* renamed from: b, reason: collision with root package name */
    public final qj.z f11409b;

    /* renamed from: c, reason: collision with root package name */
    public final yj.c f11410c;

    /* renamed from: d, reason: collision with root package name */
    public int f11411d;

    /* renamed from: e, reason: collision with root package name */
    public s1 f11412e;

    /* renamed from: f, reason: collision with root package name */
    public final a0 f11413f;

    /* renamed from: g, reason: collision with root package name */
    public final a8.j f11414g;

    /* renamed from: h, reason: collision with root package name */
    public final pi.m f11415h;

    /* renamed from: i, reason: collision with root package name */
    public final pi.m f11416i;

    public z(d0 d0Var, List list, p9.a aVar, qj.z zVar) {
        this.f11408a = d0Var;
        this.f11409b = zVar;
        ti.c cVar = null;
        new ab.s(this, cVar, 13);
        this.f11410c = new yj.c();
        this.f11413f = new a0();
        a8.j jVar = new a8.j();
        jVar.f218d = this;
        jVar.f215a = new yj.c();
        jVar.f216b = qj.b0.a();
        jVar.f217c = qi.l.R0(list);
        this.f11414g = jVar;
        final int i10 = 0;
        this.f11415h = u6.v.Q(new ej.a(this) { // from class: m5.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f11288b;

            {
                this.f11288b = this;
            }

            @Override // ej.a
            public final Object a() throws IOException {
                switch (i10) {
                    case 0:
                        d0 d0Var2 = this.f11288b.f11408a;
                        File canonicalFile = ((File) d0Var2.f11280b.a()).getCanonicalFile();
                        synchronized (d0.f11278d) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = d0.f11277c;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            fj.l.c(absolutePath);
                            linkedHashSet.add(absolutePath);
                        }
                        return new g0(canonicalFile, (o0) d0Var2.f11279a.invoke(canonicalFile), new a7.e(canonicalFile, 21));
                    default:
                        return ((g0) this.f11288b.f11415h.getValue()).f11299b;
                }
            }
        });
        final int i11 = 1;
        this.f11416i = u6.v.Q(new ej.a(this) { // from class: m5.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z f11288b;

            {
                this.f11288b = this;
            }

            @Override // ej.a
            public final Object a() throws IOException {
                switch (i11) {
                    case 0:
                        d0 d0Var2 = this.f11288b.f11408a;
                        File canonicalFile = ((File) d0Var2.f11280b.a()).getCanonicalFile();
                        synchronized (d0.f11278d) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = d0.f11277c;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            fj.l.c(absolutePath);
                            linkedHashSet.add(absolutePath);
                        }
                        return new g0(canonicalFile, (o0) d0Var2.f11279a.invoke(canonicalFile), new a7.e(canonicalFile, 21));
                    default:
                        return ((g0) this.f11288b.f11415h.getValue()).f11299b;
                }
            }
        });
        new ag.i(zVar, new ab.k(this, 24), new lb.d(11), new androidx.lifecycle.h0(this, cVar, 18));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(m5.z r4, vi.c r5) {
        /*
            boolean r0 = r5 instanceof m5.o
            if (r0 == 0) goto L13
            r0 = r5
            m5.o r0 = (m5.o) r0
            int r1 = r0.f11353d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11353d = r1
            goto L18
        L13:
            m5.o r0 = new m5.o
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f11351b
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f11353d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yj.c r0 = r0.f11350a
            uk.c.R(r5)
            goto L42
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            uk.c.R(r5)
            yj.c r5 = r4.f11410c
            r0.f11350a = r5
            r0.f11353d = r3
            java.lang.Object r0 = r5.b(r0)
            if (r0 != r1) goto L41
            return r1
        L41:
            r0 = r5
        L42:
            r5 = 0
            int r1 = r4.f11411d     // Catch: java.lang.Throwable -> L53
            int r1 = r1 + (-1)
            r4.f11411d = r1     // Catch: java.lang.Throwable -> L53
            if (r1 != 0) goto L57
            qj.s1 r1 = r4.f11412e     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L55
            r1.e(r5)     // Catch: java.lang.Throwable -> L53
            goto L55
        L53:
            r4 = move-exception
            goto L5d
        L55:
            r4.f11412e = r5     // Catch: java.lang.Throwable -> L53
        L57:
            r0.e(r5)
            pi.o r4 = pi.o.f13011a
            return r4
        L5d:
            r0.e(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.z.a(m5.z, vi.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(m5.z r4, vi.c r5) {
        /*
            boolean r0 = r5 instanceof m5.p
            if (r0 == 0) goto L13
            r0 = r5
            m5.p r0 = (m5.p) r0
            int r1 = r0.f11359c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11359c = r1
            goto L18
        L13:
            m5.p r0 = new m5.p
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r4 = r0.f11357a
            ui.a r5 = ui.a.f17085a
            int r5 = r0.f11359c
            r0 = 0
            if (r5 == 0) goto L3d
            r1 = 1
            if (r5 != r1) goto L35
            uk.c.R(r4)     // Catch: java.lang.Throwable -> L28
            goto L2d
        L28:
            r4 = move-exception
            pi.j r4 = uk.c.r(r4)
        L2d:
            java.lang.Throwable r4 = pi.k.a(r4)
            r4.getClass()
            throw r0
        L35:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3d:
            uk.c.R(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.z.b(m5.z, vi.c):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(m5.z r4, vi.c r5) {
        /*
            boolean r0 = r5 instanceof m5.q
            if (r0 == 0) goto L13
            r0 = r5
            m5.q r0 = (m5.q) r0
            int r1 = r0.f11364d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11364d = r1
            goto L18
        L13:
            m5.q r0 = new m5.q
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f11362b
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f11364d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yj.c r0 = r0.f11361a
            uk.c.R(r5)
            goto L42
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            uk.c.R(r5)
            yj.c r5 = r4.f11410c
            r0.f11361a = r5
            r0.f11364d = r3
            java.lang.Object r0 = r5.b(r0)
            if (r0 != r1) goto L41
            return r1
        L41:
            r0 = r5
        L42:
            r5 = 0
            int r1 = r4.f11411d     // Catch: java.lang.Throwable -> L5a
            int r1 = r1 + r3
            r4.f11411d = r1     // Catch: java.lang.Throwable -> L5a
            if (r1 != r3) goto L5c
            qj.z r1 = r4.f11409b     // Catch: java.lang.Throwable -> L5a
            m5.k r2 = new m5.k     // Catch: java.lang.Throwable -> L5a
            r3 = 1
            r2.<init>(r4, r5, r3)     // Catch: java.lang.Throwable -> L5a
            r3 = 3
            qj.s1 r1 = qj.b0.w(r1, r5, r2, r3)     // Catch: java.lang.Throwable -> L5a
            r4.f11412e = r1     // Catch: java.lang.Throwable -> L5a
            goto L5c
        L5a:
            r4 = move-exception
            goto L62
        L5c:
            r0.e(r5)
            pi.o r4 = pi.o.f13011a
            return r4
        L62:
            r0.e(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.z.c(m5.z, vi.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r2.F(r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(m5.z r6, vi.c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof m5.s
            if (r0 == 0) goto L13
            r0 = r7
            m5.s r0 = (m5.s) r0
            int r1 = r0.f11372d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11372d = r1
            goto L18
        L13:
            m5.s r0 = new m5.s
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f11370b
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f11372d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            int r0 = r0.f11369a
            uk.c.R(r7)     // Catch: java.lang.Throwable -> L2c
            goto L5d
        L2c:
            r7 = move-exception
            goto L64
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            uk.c.R(r7)
            goto L4a
        L3a:
            uk.c.R(r7)
            m5.o0 r7 = r6.g()
            r0.f11372d = r4
            java.lang.Integer r7 = r7.a()
            if (r7 != r1) goto L4a
            goto L5c
        L4a:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            a8.j r2 = r6.f11414g     // Catch: java.lang.Throwable -> L60
            r0.f11369a = r7     // Catch: java.lang.Throwable -> L60
            r0.f11372d = r3     // Catch: java.lang.Throwable -> L60
            java.lang.Object r6 = r2.F(r0)     // Catch: java.lang.Throwable -> L60
            if (r6 != r1) goto L5d
        L5c:
            return r1
        L5d:
            pi.o r6 = pi.o.f13011a
            return r6
        L60:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L64:
            m5.a0 r6 = r6.f11413f
            m5.k0 r1 = new m5.k0
            r1.<init>(r7, r0)
            r6.b(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.z.d(m5.z, vi.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        if (r10 == r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
    
        if (r10 == r2) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(m5.z r8, boolean r9, ti.c r10) throws java.lang.Throwable {
        /*
            m5.a0 r0 = r8.f11413f
            boolean r1 = r10 instanceof m5.t
            if (r1 == 0) goto L15
            r1 = r10
            m5.t r1 = (m5.t) r1
            int r2 = r1.f11377e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f11377e = r2
            goto L1a
        L15:
            m5.t r1 = new m5.t
            r1.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r1.f11375c
            ui.a r2 = ui.a.f17085a
            int r3 = r1.f11377e
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L44
            if (r3 == r6) goto L3c
            if (r3 == r5) goto L38
            if (r3 != r4) goto L30
            uk.c.R(r10)
            goto Lab
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            uk.c.R(r10)
            goto L93
        L3c:
            boolean r9 = r1.f11373a
            m5.p0 r3 = r1.f11374b
            uk.c.R(r10)
            goto L65
        L44:
            uk.c.R(r10)
            tj.r0 r10 = r0.f11268a
            java.lang.Object r10 = r10.getValue()
            r3 = r10
            m5.p0 r3 = (m5.p0) r3
            boolean r10 = r3 instanceof m5.q0
            if (r10 != 0) goto Lbf
            m5.o0 r10 = r8.g()
            r1.f11374b = r3
            r1.f11373a = r9
            r1.f11377e = r6
            java.lang.Integer r10 = r10.a()
            if (r10 != r2) goto L65
            goto Laa
        L65:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            boolean r6 = r3 instanceof m5.c
            if (r6 == 0) goto L75
            r7 = r3
            m5.c r7 = (m5.c) r7
            int r7 = r7.f11360a
            goto L76
        L75:
            r7 = -1
        L76:
            if (r6 == 0) goto L7b
            if (r10 != r7) goto L7b
            return r3
        L7b:
            r10 = 0
            if (r9 == 0) goto L96
            m5.o0 r9 = r8.g()
            d1.l r3 = new d1.l
            r4 = 1
            r3.<init>(r8, r10, r4)
            r1.f11374b = r10
            r1.f11377e = r5
            java.lang.Object r10 = r9.b(r3, r1)
            if (r10 != r2) goto L93
            goto Laa
        L93:
            pi.h r10 = (pi.h) r10
            goto Lad
        L96:
            m5.o0 r9 = r8.g()
            m5.u r3 = new m5.u
            r5 = 0
            r3.<init>(r8, r7, r10, r5)
            r1.f11374b = r10
            r1.f11377e = r4
            java.lang.Object r10 = r9.c(r3, r1)
            if (r10 != r2) goto Lab
        Laa:
            return r2
        Lab:
            pi.h r10 = (pi.h) r10
        Lad:
            java.lang.Object r8 = r10.f13000a
            m5.p0 r8 = (m5.p0) r8
            java.lang.Object r9 = r10.f13001b
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lbe
            r0.b(r8)
        Lbe:
            return r8
        Lbf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.z.e(m5.z, boolean, ti.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0115, code lost:
    
        if (r10 != r1) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c5 A[Catch: b -> 0x0099, TryCatch #0 {b -> 0x0099, blocks: (B:36:0x0094, B:68:0x0118, B:41:0x009e, B:65:0x00fc, B:44:0x00a8, B:60:0x00e0, B:47:0x00ae, B:55:0x00c5, B:56:0x00c9, B:51:0x00b7, B:62:0x00ec), top: B:72:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(m5.z r8, boolean r9, vi.c r10) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.z.f(m5.z, boolean, vi.c):java.lang.Object");
    }

    public final o0 g() {
        return (o0) this.f11416i.getValue();
    }

    public final Object h(vi.c cVar) {
        return ((g0) this.f11415h.getValue()).a(new l(3, (ti.c) null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.Object r11, boolean r12, vi.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof m5.x
            if (r0 == 0) goto L13
            r0 = r13
            m5.x r0 = (m5.x) r0
            int r1 = r0.f11400d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11400d = r1
            goto L18
        L13:
            m5.x r0 = new m5.x
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f11398b
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f11400d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            fj.t r11 = r0.f11397a
            uk.c.R(r13)
            goto L56
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            uk.c.R(r13)
            fj.t r5 = new fj.t
            r5.<init>()
            pi.m r13 = r10.f11415h
            java.lang.Object r13 = r13.getValue()
            m5.g0 r13 = (m5.g0) r13
            m5.y r4 = new m5.y
            r9 = 0
            r6 = r10
            r7 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f11397a = r5
            r0.f11400d = r3
            java.lang.Object r11 = r13.b(r4, r0)
            if (r11 != r1) goto L55
            return r1
        L55:
            r11 = r5
        L56:
            int r11 = r11.f6805a
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.z.i(java.lang.Object, boolean, vi.c):java.lang.Object");
    }
}
