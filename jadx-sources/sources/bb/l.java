package bb;

import qj.b0;
import qj.z;
import t.u0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l implements o2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f1697a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t.c f1698b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ej.a f1699c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej.a f1700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f1701e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u0 f1702f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ k2.a f1703z;

    public l(float f10, t.c cVar, ej.a aVar, ej.a aVar2, z zVar, u0 u0Var, k2.a aVar3) {
        this.f1697a = f10;
        this.f1698b = cVar;
        this.f1699c = aVar;
        this.f1700d = aVar2;
        this.f1701e = zVar;
        this.f1702f = u0Var;
        this.f1703z = aVar3;
    }

    @Override // o2.a
    public final long G0(int i10, long j, long j4) {
        int i11 = (int) (j4 >> 32);
        if (Float.intBitsToFloat(i11) == 0.0f) {
            return 0L;
        }
        t.c cVar = this.f1698b;
        if (((Number) cVar.e()).floatValue() == 0.0f && ((Float.intBitsToFloat(i11) <= 0.0f || !((Boolean) this.f1699c.a()).booleanValue()) && (Float.intBitsToFloat(i11) >= 0.0f || !((Boolean) this.f1700d.a()).booleanValue()))) {
            return 0L;
        }
        b0.w(this.f1701e, null, new i(cVar, a(j4), null, 0), 3);
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
            boolean r8 = r12 instanceof bb.h
            if (r8 == 0) goto L14
            r8 = r12
            bb.h r8 = (bb.h) r8
            int r9 = r8.f1683d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r9 & r0
            if (r1 == 0) goto L14
            int r9 = r9 - r0
            r8.f1683d = r9
        L12:
            r5 = r8
            goto L1c
        L14:
            bb.h r8 = new bb.h
            vi.c r12 = (vi.c) r12
            r8.<init>(r7, r12)
            goto L12
        L1c:
            java.lang.Object r8 = r5.f1681b
            ui.a r9 = ui.a.f17085a
            int r12 = r5.f1683d
            r0 = 1
            if (r12 == 0) goto L35
            if (r12 != r0) goto L2d
            long r10 = r5.f1680a
            uk.c.R(r8)
            goto L6a
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            uk.c.R(r8)
            float r8 = s3.q.b(r10)
            r12 = 0
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 != 0) goto L42
            goto L4a
        L42:
            r8 = 0
            k2.a r1 = r7.f1703z
            k2.c r1 = (k2.c) r1
            r1.a(r8)
        L4a:
            float r8 = s3.q.b(r10)
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r12)
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r8)
            r5.f1680a = r10
            r5.f1683d = r0
            t.c r0 = r7.f1698b
            t.u0 r2 = r7.f1702f
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
        throw new UnsupportedOperationException("Method not decompiled: bb.l.Z0(long, long, ti.c):java.lang.Object");
    }

    public final float a(long j) {
        float fFloatValue = ((Number) this.f1698b.e()).floatValue();
        float fAbs = Math.abs(fFloatValue);
        float f10 = this.f1697a;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (j >> 32)) * (fAbs >= f10 ? 1.0f - cg.b.o((fAbs - f10) / 600.0f, 0.0f, 1.0f) : 1.0f)) + fFloatValue;
        if (fFloatValue > 0.0f) {
            if (fIntBitsToFloat < 0.0f) {
                return 0.0f;
            }
        } else if (fFloatValue < 0.0f && fIntBitsToFloat > 0.0f) {
            return 0.0f;
        }
        return fIntBitsToFloat;
    }

    @Override // o2.a
    public final long c0(int i10, long j) {
        if (((Number) this.f1698b.e()).floatValue() == 0.0f || i10 == 2) {
            return 0L;
        }
        b0.w(this.f1701e, null, new k(this.f1698b, this, j, null, 0), 3);
        return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bc, code lost:
    
        if (t.c.d(r17.f1698b, r4, r17.f1702f, r6, null, r8, 8) == r2) goto L39;
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
        throw new UnsupportedOperationException("Method not decompiled: bb.l.v0(long, ti.c):java.lang.Object");
    }
}
