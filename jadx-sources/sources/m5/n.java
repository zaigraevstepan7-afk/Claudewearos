package m5;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n implements tj.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11343a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11344b;

    public /* synthetic */ n(tj.e eVar, int i10) {
        this.f11343a = i10;
        this.f11344b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Type inference failed for: r7v8, types: [ej.e, vi.i] */
    @Override // tj.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(tj.f r7, ti.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = r6.f11343a
            switch(r0) {
                case 0: goto L84;
                case 1: goto L69;
                default: goto L5;
            }
        L5:
            boolean r0 = r8 instanceof tj.a
            if (r0 == 0) goto L18
            r0 = r8
            tj.a r0 = (tj.a) r0
            int r1 = r0.f16342d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f16342d = r1
            goto L1d
        L18:
            tj.a r0 = new tj.a
            r0.<init>(r6, r8)
        L1d:
            java.lang.Object r8 = r0.f16340b
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f16342d
            pi.o r3 = pi.o.f13011a
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            uj.o r7 = r0.f16339a
            uk.c.R(r8)     // Catch: java.lang.Throwable -> L30
            goto L5a
        L30:
            r8 = move-exception
            goto L65
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            uk.c.R(r8)
            uj.o r8 = new uj.o
            ti.h r2 = r0.getContext()
            r8.<init>(r7, r2)
            r0.f16339a = r8     // Catch: java.lang.Throwable -> L63
            r0.f16342d = r4     // Catch: java.lang.Throwable -> L63
            java.lang.Object r7 = r6.f11344b     // Catch: java.lang.Throwable -> L63
            vi.i r7 = (vi.i) r7     // Catch: java.lang.Throwable -> L63
            java.lang.Object r7 = r7.invoke(r8, r0)     // Catch: java.lang.Throwable -> L63
            if (r7 != r1) goto L55
            goto L56
        L55:
            r7 = r3
        L56:
            if (r7 != r1) goto L59
            goto L5e
        L59:
            r7 = r8
        L5a:
            r7.releaseIntercepted()
            r1 = r3
        L5e:
            return r1
        L5f:
            r5 = r8
            r8 = r7
            r7 = r5
            goto L65
        L63:
            r7 = move-exception
            goto L5f
        L65:
            r7.releaseIntercepted()
            throw r8
        L69:
            fj.t r0 = new fj.t
            r0.<init>()
            java.lang.Object r1 = r6.f11344b
            m5.n r1 = (m5.n) r1
            b1.g r2 = new b1.g
            r3 = 4
            r2.<init>(r3, r0, r7)
            java.lang.Object r7 = r1.c(r2, r8)
            ui.a r8 = ui.a.f17085a
            if (r7 != r8) goto L81
            goto L83
        L81:
            pi.o r7 = pi.o.f13011a
        L83:
            return r7
        L84:
            java.lang.Object r0 = r6.f11344b
            tj.l r0 = (tj.l) r0
            ea.b r1 = new ea.b
            r2 = 1
            r1.<init>(r7, r2)
            java.lang.Object r7 = r0.c(r1, r8)
            ui.a r8 = ui.a.f17085a
            if (r7 != r8) goto L97
            goto L99
        L97:
            pi.o r7 = pi.o.f13011a
        L99:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.n.c(tj.f, ti.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(ej.e eVar) {
        this.f11343a = 2;
        this.f11344b = (vi.i) eVar;
    }
}
