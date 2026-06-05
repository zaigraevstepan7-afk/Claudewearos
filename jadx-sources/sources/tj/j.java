package tj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class j implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m5.n f16383a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m5.l f16384b;

    public j(m5.n nVar, m5.l lVar) {
        this.f16383a = nVar;
        this.f16384b = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // tj.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(tj.f r9, ti.c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof tj.i
            if (r0 == 0) goto L13
            r0 = r10
            tj.i r0 = (tj.i) r0
            int r1 = r0.f16376b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16376b = r1
            goto L18
        L13:
            tj.i r0 = new tj.i
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f16375a
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f16376b
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r9 = r0.f16378d
            uj.o r9 = (uj.o) r9
            uk.c.R(r10)     // Catch: java.lang.Throwable -> L32
            goto L7c
        L32:
            r10 = move-exception
            goto L86
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.f16378d
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            uk.c.R(r10)
            goto La0
        L44:
            tj.f r9 = r0.f16379e
            java.lang.Object r2 = r0.f16378d
            tj.j r2 = (tj.j) r2
            uk.c.R(r10)     // Catch: java.lang.Throwable -> L4e
            goto L63
        L4e:
            r9 = move-exception
            goto L8c
        L50:
            uk.c.R(r10)
            m5.n r10 = r8.f16383a     // Catch: java.lang.Throwable -> L8a
            r0.f16378d = r8     // Catch: java.lang.Throwable -> L8a
            r0.f16379e = r9     // Catch: java.lang.Throwable -> L8a
            r0.f16376b = r5     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r10 = r10.c(r9, r0)     // Catch: java.lang.Throwable -> L8a
            if (r10 != r1) goto L62
            goto L9f
        L62:
            r2 = r8
        L63:
            uj.o r10 = new uj.o
            ti.h r4 = r0.getContext()
            r10.<init>(r9, r4)
            m5.l r9 = r2.f16384b     // Catch: java.lang.Throwable -> L82
            r0.f16378d = r10     // Catch: java.lang.Throwable -> L82
            r0.f16379e = r6     // Catch: java.lang.Throwable -> L82
            r0.f16376b = r3     // Catch: java.lang.Throwable -> L82
            java.lang.Object r9 = r9.c(r10, r6, r0)     // Catch: java.lang.Throwable -> L82
            if (r9 != r1) goto L7b
            goto L9f
        L7b:
            r9 = r10
        L7c:
            r9.releaseIntercepted()
            pi.o r9 = pi.o.f13011a
            return r9
        L82:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L86:
            r9.releaseIntercepted()
            throw r10
        L8a:
            r9 = move-exception
            r2 = r8
        L8c:
            tj.t0 r10 = new tj.t0
            r10.<init>(r9)
            m5.l r2 = r2.f16384b
            r0.f16378d = r9
            r0.f16379e = r6
            r0.f16376b = r4
            java.lang.Object r10 = tj.i0.c(r10, r2, r9, r0)
            if (r10 != r1) goto La0
        L9f:
            return r1
        La0:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tj.j.c(tj.f, ti.c):java.lang.Object");
    }
}
