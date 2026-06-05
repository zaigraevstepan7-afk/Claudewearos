package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k2 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public long f19594a;

    /* renamed from: b, reason: collision with root package name */
    public int f19595b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ long f19596c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l2 f19597d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(l2 l2Var, ti.c cVar) {
        super(2, cVar);
        this.f19597d = l2Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        k2 k2Var = new k2(this.f19597d, cVar);
        k2Var.f19596c = ((s3.q) obj).f14760a;
        return k2Var;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        long j = ((s3.q) obj).f14760a;
        k2 k2Var = new k2(this.f19597d, (ti.c) obj2);
        k2Var.f19596c = j;
        return k2Var.invokeSuspend(pi.o.f13011a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    @Override // vi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            ui.a r0 = ui.a.f17085a
            int r1 = r14.f19595b
            r2 = 3
            r3 = 2
            r4 = 1
            x.l2 r5 = r14.f19597d
            if (r1 == 0) goto L2f
            if (r1 == r4) goto L29
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            long r0 = r14.f19594a
            long r2 = r14.f19596c
            uk.c.R(r15)
            goto L71
        L19:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L21:
            long r3 = r14.f19594a
            long r6 = r14.f19596c
            uk.c.R(r15)
            goto L57
        L29:
            long r6 = r14.f19596c
            uk.c.R(r15)
            goto L41
        L2f:
            uk.c.R(r15)
            long r6 = r14.f19596c
            o2.d r15 = r5.f19618f
            r14.f19596c = r6
            r14.f19595b = r4
            java.lang.Object r15 = r15.b(r6, r14)
            if (r15 != r0) goto L41
            goto L6e
        L41:
            s3.q r15 = (s3.q) r15
            long r8 = r15.f14760a
            long r8 = s3.q.d(r6, r8)
            r14.f19596c = r6
            r14.f19594a = r8
            r14.f19595b = r3
            java.lang.Object r15 = r5.a(r8, r14)
            if (r15 != r0) goto L56
            goto L6e
        L56:
            r3 = r8
        L57:
            s3.q r15 = (s3.q) r15
            long r11 = r15.f14760a
            o2.d r8 = r5.f19618f
            long r9 = s3.q.d(r3, r11)
            r14.f19596c = r6
            r14.f19594a = r11
            r14.f19595b = r2
            r13 = r14
            java.lang.Object r15 = r8.a(r9, r11, r13)
            if (r15 != r0) goto L6f
        L6e:
            return r0
        L6f:
            r2 = r6
            r0 = r11
        L71:
            s3.q r15 = (s3.q) r15
            long r4 = r15.f14760a
            long r0 = s3.q.d(r0, r4)
            long r0 = s3.q.d(r2, r0)
            s3.q r15 = new s3.q
            r15.<init>(r0)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: x.k2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
