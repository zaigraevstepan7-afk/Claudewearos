package tj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16346a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f16347b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fj.v f16348c;

    public c(d dVar, fj.v vVar, f fVar) {
        this.f16348c = vVar;
        this.f16347b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // tj.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7, ti.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = r6.f16346a
            switch(r0) {
                case 0: goto L52;
                default: goto L5;
            }
        L5:
            boolean r0 = r8 instanceof tj.p
            if (r0 == 0) goto L18
            r0 = r8
            tj.p r0 = (tj.p) r0
            int r1 = r0.f16421d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f16421d = r1
            goto L1d
        L18:
            tj.p r0 = new tj.p
            r0.<init>(r6, r8)
        L1d:
            java.lang.Object r8 = r0.f16419b
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f16421d
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            tj.c r7 = r0.f16418a
            uk.c.R(r8)     // Catch: java.lang.Throwable -> L2e
            goto L48
        L2e:
            r8 = move-exception
            goto L4d
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            uk.c.R(r8)
            tj.f r8 = r6.f16347b     // Catch: java.lang.Throwable -> L4b
            r0.f16418a = r6     // Catch: java.lang.Throwable -> L4b
            r0.f16421d = r3     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r7 = r8.b(r7, r0)     // Catch: java.lang.Throwable -> L4b
            if (r7 != r1) goto L48
            goto L4a
        L48:
            pi.o r1 = pi.o.f13011a
        L4a:
            return r1
        L4b:
            r8 = move-exception
            r7 = r6
        L4d:
            fj.v r7 = r7.f16348c
            r7.f6807a = r8
            throw r8
        L52:
            boolean r0 = r8 instanceof tj.b
            if (r0 == 0) goto L65
            r0 = r8
            tj.b r0 = (tj.b) r0
            int r1 = r0.f16345c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L65
            int r1 = r1 - r2
            r0.f16345c = r1
            goto L6a
        L65:
            tj.b r0 = new tj.b
            r0.<init>(r6, r8)
        L6a:
            java.lang.Object r8 = r0.f16343a
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f16345c
            pi.o r3 = pi.o.f13011a
            r4 = 1
            if (r2 == 0) goto L84
            if (r2 != r4) goto L7c
            uk.c.R(r8)
        L7a:
            r1 = r3
            goto La1
        L7c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L84:
            uk.c.R(r8)
            fj.v r8 = r6.f16348c
            java.lang.Object r2 = r8.f6807a
            d7.c r5 = uj.c.f17101b
            if (r2 == r5) goto L95
            boolean r2 = fj.l.b(r2, r7)
            if (r2 != 0) goto L7a
        L95:
            r8.f6807a = r7
            r0.f16345c = r4
            tj.f r8 = r6.f16347b
            java.lang.Object r7 = r8.b(r7, r0)
            if (r7 != r1) goto L7a
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tj.c.b(java.lang.Object, ti.c):java.lang.Object");
    }

    public c(f fVar, fj.v vVar) {
        this.f16347b = fVar;
        this.f16348c = vVar;
    }
}
