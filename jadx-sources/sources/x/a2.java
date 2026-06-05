package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a2 implements o2.a {

    /* renamed from: a, reason: collision with root package name */
    public final l2 f19443a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19444b;

    public a2(l2 l2Var, boolean z2) {
        this.f19443a = l2Var;
        this.f19444b = z2;
    }

    @Override // o2.a
    public final long G0(int i10, long j, long j4) {
        if (!this.f19444b) {
            return 0L;
        }
        l2 l2Var = this.f19443a;
        if (l2Var.f19613a.a()) {
            return 0L;
        }
        return l2Var.h(l2Var.d(l2Var.f19613a.e(l2Var.d(l2Var.g(j4)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z0(long r5, long r7, ti.c r9) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r5 = r9 instanceof x.z1
            if (r5 == 0) goto L13
            r5 = r9
            x.z1 r5 = (x.z1) r5
            int r6 = r5.f19777d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r6 & r0
            if (r1 == 0) goto L13
            int r6 = r6 - r0
            r5.f19777d = r6
            goto L1a
        L13:
            x.z1 r5 = new x.z1
            vi.c r9 = (vi.c) r9
            r5.<init>(r4, r9)
        L1a:
            java.lang.Object r6 = r5.f19775b
            ui.a r9 = ui.a.f17085a
            int r0 = r5.f19777d
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            long r7 = r5.f19774a
            uk.c.R(r6)
            goto L4e
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            uk.c.R(r6)
            boolean r6 = r4.f19444b
            r2 = 0
            if (r6 == 0) goto L56
            x.l2 r6 = r4.f19443a
            boolean r0 = r6.f19621i
            if (r0 == 0) goto L43
            goto L52
        L43:
            r5.f19774a = r7
            r5.f19777d = r1
            java.lang.Object r6 = r6.a(r7, r5)
            if (r6 != r9) goto L4e
            return r9
        L4e:
            s3.q r6 = (s3.q) r6
            long r2 = r6.f14760a
        L52:
            long r2 = s3.q.d(r7, r2)
        L56:
            s3.q r5 = new s3.q
            r5.<init>(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x.a2.Z0(long, long, ti.c):java.lang.Object");
    }
}
