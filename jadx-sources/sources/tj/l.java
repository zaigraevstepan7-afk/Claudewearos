package tj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class l implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16397a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f16398b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vi.i f16399c;

    /* JADX WARN: Multi-variable type inference failed */
    public l(ej.e eVar, e eVar2) {
        this.f16399c = (vi.i) eVar;
        this.f16398b = eVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ej.e, vi.i] */
    /* JADX WARN: Type inference failed for: r2v8, types: [ej.e, vi.i] */
    @Override // tj.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(tj.f r7, ti.c r8) {
        /*
            r6 = this;
            int r0 = r6.f16397a
            switch(r0) {
                case 0: goto L1f;
                default: goto L5;
            }
        L5:
            fj.r r0 = new fj.r
            r0.<init>()
            d1.h r1 = new d1.h
            vi.i r2 = r6.f16399c
            r1.<init>(r0, r7, r2)
            tj.e r7 = r6.f16398b
            java.lang.Object r7 = r7.c(r1, r8)
            ui.a r8 = ui.a.f17085a
            if (r7 != r8) goto L1c
            goto L1e
        L1c:
            pi.o r7 = pi.o.f13011a
        L1e:
            return r7
        L1f:
            boolean r0 = r8 instanceof tj.k
            if (r0 == 0) goto L32
            r0 = r8
            tj.k r0 = (tj.k) r0
            int r1 = r0.f16388b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L32
            int r1 = r1 - r2
            r0.f16388b = r1
            goto L37
        L32:
            tj.k r0 = new tj.k
            r0.<init>(r6, r8)
        L37:
            java.lang.Object r8 = r0.f16387a
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f16388b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L5d
            if (r2 == r4) goto L51
            if (r2 != r3) goto L49
            uk.c.R(r8)
            goto L92
        L49:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L51:
            uj.o r7 = r0.f16392f
            tj.f r2 = r0.f16391e
            tj.l r4 = r0.f16390d
            uk.c.R(r8)     // Catch: java.lang.Throwable -> L5b
            goto L7d
        L5b:
            r8 = move-exception
            goto L99
        L5d:
            uk.c.R(r8)
            uj.o r8 = new uj.o
            ti.h r2 = r0.getContext()
            r8.<init>(r7, r2)
            vi.i r2 = r6.f16399c     // Catch: java.lang.Throwable -> L95
            r0.f16390d = r6     // Catch: java.lang.Throwable -> L95
            r0.f16391e = r7     // Catch: java.lang.Throwable -> L95
            r0.f16392f = r8     // Catch: java.lang.Throwable -> L95
            r0.f16388b = r4     // Catch: java.lang.Throwable -> L95
            java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L95
            if (r2 != r1) goto L7a
            goto L94
        L7a:
            r4 = r6
            r2 = r7
            r7 = r8
        L7d:
            r7.releaseIntercepted()
            tj.e r7 = r4.f16398b
            r8 = 0
            r0.f16390d = r8
            r0.f16391e = r8
            r0.f16392f = r8
            r0.f16388b = r3
            java.lang.Object r7 = r7.c(r2, r0)
            if (r7 != r1) goto L92
            goto L94
        L92:
            pi.o r1 = pi.o.f13011a
        L94:
            return r1
        L95:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L99:
            r7.releaseIntercepted()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tj.l.c(tj.f, ti.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(e eVar, ej.e eVar2) {
        this.f16398b = eVar;
        this.f16399c = (vi.i) eVar2;
    }
}
