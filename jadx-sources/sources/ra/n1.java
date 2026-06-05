package ra;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n1 implements o2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f14096a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t.c f14097b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qj.z f14098c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t.u0 f14099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k2.a f14100e;

    public n1(float f10, t.c cVar, qj.z zVar, t.u0 u0Var, k2.a aVar) {
        this.f14096a = f10;
        this.f14097b = cVar;
        this.f14098c = zVar;
        this.f14099d = u0Var;
        this.f14100e = aVar;
    }

    public static final float a(n1 n1Var, long j) {
        float fFloatValue = ((Number) n1Var.f14097b.e()).floatValue();
        float fAbs = Math.abs(fFloatValue);
        float f10 = n1Var.f14096a;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (j & 4294967295L)) * (fAbs >= f10 ? 1.0f - cg.b.o((fAbs - f10) / 600.0f, 0.0f, 1.0f) : 1.0f)) + fFloatValue;
        if (fFloatValue <= 0.0f ? fFloatValue >= 0.0f || fIntBitsToFloat <= 0.0f : fIntBitsToFloat >= 0.0f) {
            return fIntBitsToFloat;
        }
        return 0.0f;
    }

    @Override // o2.a
    public final long G0(int i10, long j, long j4) {
        if (Float.intBitsToFloat((int) (4294967295L & j4)) == 0.0f) {
            return 0L;
        }
        qj.b0.w(this.f14098c, null, new l1(this.f14097b, this, j4, null, 0), 3);
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // o2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z0(long r8, long r10, ti.c r12) {
        /*
            r7 = this;
            boolean r8 = r12 instanceof ra.k1
            if (r8 == 0) goto L14
            r8 = r12
            ra.k1 r8 = (ra.k1) r8
            int r9 = r8.f14061d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r9 & r0
            if (r1 == 0) goto L14
            int r9 = r9 - r0
            r8.f14061d = r9
        L12:
            r5 = r8
            goto L1c
        L14:
            ra.k1 r8 = new ra.k1
            vi.c r12 = (vi.c) r12
            r8.<init>(r7, r12)
            goto L12
        L1c:
            java.lang.Object r8 = r5.f14059b
            ui.a r9 = ui.a.f17085a
            int r12 = r5.f14061d
            r0 = 1
            if (r12 == 0) goto L35
            if (r12 != r0) goto L2d
            long r10 = r5.f14058a
            uk.c.R(r8)
            goto L6a
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            uk.c.R(r8)
            float r8 = s3.q.c(r10)
            r12 = 0
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 != 0) goto L42
            goto L4a
        L42:
            r8 = 0
            k2.a r1 = r7.f14100e
            k2.c r1 = (k2.c) r1
            r1.a(r8)
        L4a:
            float r8 = s3.q.c(r10)
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r12)
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r8)
            r5.f14058a = r10
            r5.f14061d = r0
            t.c r0 = r7.f14097b
            t.u0 r2 = r7.f14099d
            r4 = 0
            r6 = 8
            java.lang.Object r8 = t.c.d(r0, r1, r2, r3, r4, r5, r6)
            if (r8 != r9) goto L6a
            return r9
        L6a:
            s3.q r8 = new s3.q
            r8.<init>(r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.n1.Z0(long, long, ti.c):java.lang.Object");
    }

    @Override // o2.a
    public final long c0(int i10, long j) {
        if (((Number) this.f14097b.e()).floatValue() == 0.0f || i10 == 2) {
            return 0L;
        }
        qj.b0.w(this.f14098c, null, new l1(this.f14097b, this, j, null, 1), 3);
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bc, code lost:
    
        if (t.c.d(r17.f14097b, r4, r17.f14099d, r6, null, r8, 8) == r2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00db, code lost:
    
        if (r15.c(r3, r1, r11, r8) == r2) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // o2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v0(long r18, ti.c r20) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.n1.v0(long, ti.c):java.lang.Object");
    }
}
