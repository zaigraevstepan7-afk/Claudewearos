package p2;

import w2.h2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o0 implements s3.c, ti.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f12747a;

    /* renamed from: b, reason: collision with root package name */
    public final qj.l f12748b;

    /* renamed from: c, reason: collision with root package name */
    public qj.l f12749c;

    /* renamed from: d, reason: collision with root package name */
    public o f12750d = o.f12744b;

    /* renamed from: e, reason: collision with root package name */
    public final ti.i f12751e = ti.i.f16336a;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p0 f12752f;

    public o0(p0 p0Var, qj.l lVar) {
        this.f12752f = p0Var;
        this.f12747a = p0Var;
        this.f12748b = lVar;
    }

    public final long A() {
        p0 p0Var = this.f12752f;
        p0Var.getClass();
        long jQ0 = p0Var.Q0(v2.n.y(p0Var).T.d());
        long j = p0Var.Q;
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jQ0 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (jQ0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L);
    }

    public final h2 C() {
        p0 p0Var = this.f12752f;
        p0Var.getClass();
        return v2.n.y(p0Var).T;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0, types: [long] */
    /* JADX WARN: Type inference failed for: r7v1, types: [qj.e1] */
    /* JADX WARN: Type inference failed for: r7v4, types: [qj.e1] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [ej.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(long r7, ej.e r9, vi.a r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof p2.l0
            if (r0 == 0) goto L13
            r0 = r10
            p2.l0 r0 = (p2.l0) r0
            int r1 = r0.f12727d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12727d = r1
            goto L18
        L13:
            p2.l0 r0 = new p2.l0
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f12725b
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f12727d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            qj.s1 r7 = r0.f12724a
            uk.c.R(r10)     // Catch: java.lang.Throwable -> L29
            goto L68
        L29:
            r8 = move-exception
            goto L6e
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            uk.c.R(r10)
            r4 = 0
            int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r10 > 0) goto L4c
            qj.l r10 = r6.f12749c
            if (r10 == 0) goto L4c
            p2.p r2 = new p2.p
            r2.<init>(r7)
            pi.j r2 = uk.c.r(r2)
            r10.resumeWith(r2)
        L4c:
            p2.p0 r10 = r6.f12752f
            qj.z r10 = r10.e1()
            p2.m0 r2 = new p2.m0
            r4 = 0
            r2.<init>(r7, r6, r4)
            r7 = 3
            qj.s1 r7 = qj.b0.w(r10, r4, r2, r7)
            r0.f12724a = r7     // Catch: java.lang.Throwable -> L29
            r0.f12727d = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r10 = r9.invoke(r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r10 != r1) goto L68
            return r1
        L68:
            p2.b r8 = p2.b.f12668b
            r7.e(r8)
            return r10
        L6e:
            p2.b r9 = p2.b.f12668b
            r7.e(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.o0.D(long, ej.e, vi.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(long r5, ej.e r7, vi.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof p2.n0
            if (r0 == 0) goto L13
            r0 = r8
            p2.n0 r0 = (p2.n0) r0
            int r1 = r0.f12742c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12742c = r1
            goto L18
        L13:
            p2.n0 r0 = new p2.n0
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f12740a
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f12742c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            uk.c.R(r8)     // Catch: p2.p -> L3c
            return r8
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            uk.c.R(r8)
            r0.f12742c = r3     // Catch: p2.p -> L3c
            java.lang.Object r5 = r4.D(r5, r7, r0)     // Catch: p2.p -> L3c
            if (r5 != r1) goto L3b
            return r1
        L3b:
            return r5
        L3c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.o0.E(long, ej.e, vi.c):java.lang.Object");
    }

    @Override // s3.c
    public final int E0(long j) {
        return this.f12747a.E0(j);
    }

    @Override // s3.c
    public final int I0(float f10) {
        return this.f12747a.I0(f10);
    }

    @Override // s3.c
    public final long J(float f10) {
        return this.f12747a.J(f10);
    }

    @Override // s3.c
    public final long K(long j) {
        return this.f12747a.K(j);
    }

    @Override // s3.c
    public final float N(long j) {
        return this.f12747a.N(j);
    }

    @Override // s3.c
    public final long Q0(long j) {
        return this.f12747a.Q0(j);
    }

    @Override // s3.c
    public final float W0(long j) {
        return this.f12747a.W0(j);
    }

    @Override // s3.c
    public final long Z(float f10) {
        return this.f12747a.Z(f10);
    }

    @Override // s3.c
    public final float e() {
        return this.f12747a.e();
    }

    @Override // ti.c
    public final ti.h getContext() {
        return this.f12751e;
    }

    @Override // s3.c
    public final float h0(int i10) {
        return this.f12747a.h0(i10);
    }

    public final Object l(o oVar, vi.a aVar) {
        qj.l lVar = new qj.l(1, u3.a.g(aVar));
        lVar.p();
        this.f12750d = oVar;
        this.f12749c = lVar;
        Object objO = lVar.o();
        ui.a aVar2 = ui.a.f17085a;
        return objO;
    }

    @Override // s3.c
    public final float l0(float f10) {
        return f10 / this.f12747a.e();
    }

    @Override // s3.c
    public final float r0() {
        return this.f12747a.r0();
    }

    @Override // ti.c
    public final void resumeWith(Object obj) {
        p0 p0Var = this.f12752f;
        synchronized (p0Var.N) {
            p0Var.M.k(this);
        }
        this.f12748b.resumeWith(obj);
    }

    @Override // s3.c
    public final float w0(float f10) {
        return this.f12747a.e() * f10;
    }
}
