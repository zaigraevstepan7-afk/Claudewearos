package w2;

import android.view.ViewParent;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l1 implements v2.q1 {
    public final float[] A;
    public float[] B;
    public boolean C;
    public s3.c D;
    public s3.m E;
    public final e2.b F;
    public int G;
    public long H;
    public c2.e0 I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public final c2.x0 N;

    /* renamed from: a, reason: collision with root package name */
    public f2.b f18316a;

    /* renamed from: b, reason: collision with root package name */
    public final c2.b0 f18317b;

    /* renamed from: c, reason: collision with root package name */
    public final t f18318c;

    /* renamed from: d, reason: collision with root package name */
    public ej.e f18319d;

    /* renamed from: e, reason: collision with root package name */
    public ej.a f18320e;

    /* renamed from: f, reason: collision with root package name */
    public long f18321f;

    /* renamed from: z, reason: collision with root package name */
    public boolean f18322z;

    public l1(f2.b bVar, c2.b0 b0Var, t tVar, ej.e eVar, ej.a aVar) {
        this.f18316a = bVar;
        this.f18317b = b0Var;
        this.f18318c = tVar;
        this.f18319d = eVar;
        this.f18320e = aVar;
        long j = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.f18321f = (j & 4294967295L) | (j << 32);
        this.A = c2.k0.a();
        this.D = wd.a.c();
        this.E = s3.m.f14752a;
        this.F = new e2.b();
        this.H = c2.a1.f2962b;
        this.L = true;
        this.N = new c2.x0(this, 25);
    }

    public final float[] a() {
        float[] fArrA = this.B;
        if (fArrA == null) {
            fArrA = c2.k0.a();
            this.B = fArrA;
        }
        if (this.K) {
            this.K = false;
            float[] fArrB = b();
            if (this.L) {
                return fArrB;
            }
            if (!f0.o(fArrB, fArrA)) {
                fArrA[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrA[0])) {
            return null;
        }
        return fArrA;
    }

    public final float[] b() {
        boolean z2 = this.J;
        float[] fArr = this.A;
        if (z2) {
            f2.b bVar = this.f18316a;
            long jZ = bVar.f6534v;
            f2.d dVar = bVar.f6514a;
            if ((9223372034707292159L & jZ) == 9205357640488583168L) {
                jZ = x8.a.z(cg.b.S(this.f18321f));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jZ >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jZ & 4294967295L));
            float fL = dVar.L();
            float fH = dVar.H();
            float fM = dVar.M();
            float fB = dVar.B();
            float fD = dVar.D();
            float fC = dVar.c();
            float fV = dVar.v();
            double d10 = fM * 0.017453292519943295d;
            float fSin = (float) Math.sin(d10);
            float fCos = (float) Math.cos(d10);
            float f10 = -fSin;
            float f11 = (fH * fCos) - (0.0f * fSin);
            float f12 = (0.0f * fCos) + (fH * fSin);
            double d11 = fB * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d11);
            float fCos2 = (float) Math.cos(d11);
            float f13 = -fSin2;
            float f14 = fSin * fSin2;
            float f15 = fSin * fCos2;
            float f16 = fCos * fSin2;
            float f17 = fCos * fCos2;
            float f18 = (f12 * fSin2) + (fL * fCos2);
            float f19 = (f12 * fCos2) + ((-fL) * fSin2);
            double d12 = fD * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d12);
            float fCos3 = (float) Math.cos(d12);
            float f20 = -fSin3;
            float f21 = (fCos3 * f14) + (f20 * fCos2);
            float f22 = ((f14 * fSin3) + (fCos2 * fCos3)) * fC;
            float f23 = fSin3 * fCos * fC;
            float f24 = ((fSin3 * f15) + (fCos3 * f13)) * fC;
            float f25 = f21 * fV;
            float f26 = fCos * fCos3 * fV;
            float f27 = ((fCos3 * f15) + (f20 * f13)) * fV;
            float f28 = f16 * 1.0f;
            float f29 = f10 * 1.0f;
            float f30 = f17 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f22;
                fArr[1] = f23;
                fArr[2] = f24;
                fArr[3] = 0.0f;
                fArr[4] = f25;
                fArr[5] = f26;
                fArr[6] = f27;
                fArr[7] = 0.0f;
                fArr[8] = f28;
                fArr[9] = f29;
                fArr[10] = f30;
                fArr[11] = 0.0f;
                float f31 = -fIntBitsToFloat;
                fArr[12] = ((f22 * f31) - (fIntBitsToFloat2 * f25)) + f18 + fIntBitsToFloat;
                fArr[13] = ((f23 * f31) - (fIntBitsToFloat2 * f26)) + f11 + fIntBitsToFloat2;
                fArr[14] = ((f31 * f24) - (fIntBitsToFloat2 * f27)) + f19;
                fArr[15] = 1.0f;
            }
            this.J = false;
            this.L = c2.e0.t(fArr);
        }
        return fArr;
    }

    public final long c(long j, boolean z2) {
        float[] fArrB;
        if (z2) {
            fArrB = a();
            if (fArrB == null) {
                return 9187343241974906880L;
            }
        } else {
            fArrB = b();
        }
        return this.L ? j : c2.k0.b(j, fArrB);
    }

    public final void d(long j) {
        boolean zR = t.r();
        t tVar = this.f18318c;
        if (zR) {
            tVar.Q(-4.0f);
        }
        f2.b bVar = this.f18316a;
        if (!s3.j.a(bVar.f6532t, j)) {
            bVar.f6532t = j;
            bVar.f6514a.y((int) (j >> 32), bVar.f6533u, (int) (j & 4294967295L));
        }
        ViewParent parent = tVar.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(tVar, tVar);
        }
    }

    public final void e(long j) {
        if (s3.l.b(j, this.f18321f)) {
            return;
        }
        boolean zR = t.r();
        t tVar = this.f18318c;
        if (zR) {
            tVar.Q(-4.0f);
        }
        this.f18321f = j;
        if (this.C || this.f18322z) {
            return;
        }
        tVar.invalidate();
        if (true != this.C) {
            this.C = true;
            tVar.A(this, true);
        }
    }

    public final void f() {
        t.r();
        if (this.C) {
            if (!c2.a1.a(this.H, c2.a1.f2962b) && !s3.l.b(this.f18316a.f6533u, this.f18321f)) {
                f2.b bVar = this.f18316a;
                float fB = c2.a1.b(this.H) * ((int) (this.f18321f >> 32));
                float fC = c2.a1.c(this.H) * ((int) (this.f18321f & 4294967295L));
                long jFloatToRawIntBits = (Float.floatToRawIntBits(fC) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32);
                if (!b2.b.c(bVar.f6534v, jFloatToRawIntBits)) {
                    bVar.f6534v = jFloatToRawIntBits;
                    bVar.f6514a.E(jFloatToRawIntBits);
                }
            }
            this.f18316a.e(this.D, this.E, this.f18321f, this.N);
            if (this.C) {
                this.C = false;
                this.f18318c.A(this, false);
            }
        }
    }

    @Override // v2.q1
    public final void invalidate() {
        if (this.C || this.f18322z) {
            return;
        }
        t tVar = this.f18318c;
        tVar.invalidate();
        if (true != this.C) {
            this.C = true;
            tVar.A(this, true);
        }
    }
}
