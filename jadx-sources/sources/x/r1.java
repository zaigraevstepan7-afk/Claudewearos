package x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r1 implements s3.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s3.c f19699a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19700b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19701c;

    /* renamed from: d, reason: collision with root package name */
    public final yj.c f19702d = new yj.c();

    public r1(s3.c cVar) {
        this.f19699a = cVar;
    }

    @Override // s3.c
    public final int E0(long j) {
        return this.f19699a.E0(j);
    }

    @Override // s3.c
    public final int I0(float f10) {
        return this.f19699a.I0(f10);
    }

    @Override // s3.c
    public final long J(float f10) {
        return this.f19699a.J(f10);
    }

    @Override // s3.c
    public final long K(long j) {
        return this.f19699a.K(j);
    }

    @Override // s3.c
    public final float N(long j) {
        return this.f19699a.N(j);
    }

    @Override // s3.c
    public final long Q0(long j) {
        return this.f19699a.Q0(j);
    }

    @Override // s3.c
    public final float W0(long j) {
        return this.f19699a.W0(j);
    }

    @Override // s3.c
    public final long Z(float f10) {
        return this.f19699a.Z(f10);
    }

    @Override // s3.c
    public final float e() {
        return this.f19699a.e();
    }

    public final void f() {
        this.f19701c = true;
        yj.c cVar = this.f19702d;
        if (cVar.f()) {
            cVar.e(null);
        }
    }

    @Override // s3.c
    public final float h0(int i10) {
        return this.f19699a.h0(i10);
    }

    public final void l() {
        this.f19700b = true;
        yj.c cVar = this.f19702d;
        if (cVar.f()) {
            cVar.e(null);
        }
    }

    @Override // s3.c
    public final float l0(float f10) {
        return this.f19699a.l0(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(vi.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof x.p1
            if (r0 == 0) goto L13
            r0 = r5
            x.p1 r0 = (x.p1) r0
            int r1 = r0.f19675c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19675c = r1
            goto L18
        L13:
            x.p1 r0 = new x.p1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f19673a
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f19675c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            uk.c.R(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            uk.c.R(r5)
            r0.f19675c = r3
            yj.c r5 = r4.f19702d
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            r5 = 0
            r4.f19700b = r5
            r4.f19701c = r5
            pi.o r5 = pi.o.f13011a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x.r1.r(vi.c):java.lang.Object");
    }

    @Override // s3.c
    public final float r0() {
        return this.f19699a.r0();
    }

    @Override // s3.c
    public final float w0(float f10) {
        return this.f19699a.w0(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(vi.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof x.q1
            if (r0 == 0) goto L13
            r0 = r6
            x.q1 r0 = (x.q1) r0
            int r1 = r0.f19689c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19689c = r1
            goto L18
        L13:
            x.q1 r0 = new x.q1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f19687a
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f19689c
            yj.c r3 = r5.f19702d
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            uk.c.R(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            uk.c.R(r6)
            boolean r6 = r5.f19700b
            if (r6 != 0) goto L49
            boolean r6 = r5.f19701c
            if (r6 != 0) goto L49
            r0.f19689c = r4
            java.lang.Object r6 = r3.b(r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r6 = 0
            r3.e(r6)
        L49:
            boolean r6 = r5.f19700b
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x.r1.x(vi.c):java.lang.Object");
    }
}
