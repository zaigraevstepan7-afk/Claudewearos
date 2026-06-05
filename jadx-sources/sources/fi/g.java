package fi;

import c2.f0;
import c2.k0;
import c2.n;
import c2.r0;
import c2.w0;
import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class g implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public long f6761a;

    /* renamed from: b, reason: collision with root package name */
    public float f6762b;

    /* renamed from: c, reason: collision with root package name */
    public float f6763c;

    /* renamed from: d, reason: collision with root package name */
    public float f6764d;

    /* renamed from: e, reason: collision with root package name */
    public float f6765e;

    /* renamed from: f, reason: collision with root package name */
    public float f6766f;

    /* renamed from: z, reason: collision with root package name */
    public float[] f6767z;

    @Override // c2.f0
    public final long a() {
        return this.f6761a;
    }

    @Override // c2.f0
    public final float c() {
        return this.f6764d;
    }

    @Override // s3.c
    public final float e() {
        return this.f6762b;
    }

    public final void f(ld.i iVar, s3.c cVar, ej.c cVar2) {
        l.f(cVar, "density");
        l.f(cVar2, "layerBlock");
        ac.d dVar = (ac.d) iVar.f10924b;
        this.f6761a = dVar.y();
        this.f6762b = cVar.e();
        this.f6763c = cVar.r0();
        cVar2.invoke(this);
        float f10 = this.f6766f;
        float f11 = this.f6764d;
        float f12 = this.f6765e;
        if (f10 == 0.0f) {
            if (f11 == 0.0f || f12 == 0.0f) {
                return;
            }
            iVar.S(1.0f / f11, 1.0f / f12, 0L);
            return;
        }
        float[] fArrA = this.f6767z;
        if (fArrA == null) {
            fArrA = k0.a();
            this.f6767z = fArrA;
        }
        if (fArrA.length < 16) {
            return;
        }
        double d10 = f10 * 0.017453292519943295d;
        float fSin = (float) Math.sin(d10);
        float fCos = (float) Math.cos(d10);
        float f13 = fCos * f11;
        float f14 = fSin * f12;
        float f15 = (-fSin) * f11;
        float f16 = fCos * f12;
        float f17 = (f13 * f16) - (f14 * f15);
        if (f17 == 0.0f) {
            return;
        }
        float f18 = 1.0f / f17;
        fArrA[0] = f16 * f18;
        fArrA[1] = (-f14) * f18;
        fArrA[4] = (-f15) * f18;
        fArrA[5] = f13 * f18;
        dVar.h().i(fArrA);
    }

    @Override // c2.f0
    public final void g(float f10) {
        this.f6766f = f10;
    }

    @Override // c2.f0
    public final void j(float f10) {
        this.f6765e = f10;
    }

    @Override // c2.f0
    public final void p(float f10) {
        this.f6764d = f10;
    }

    @Override // s3.c
    public final float r0() {
        return this.f6763c;
    }

    @Override // c2.f0
    public final float v() {
        return this.f6765e;
    }

    @Override // c2.f0
    public final void y(w0 w0Var) {
        l.f(w0Var, "<set-?>");
    }

    @Override // c2.f0
    public final void J0(long j) {
    }

    @Override // c2.f0
    public final void U(int i10) {
    }

    @Override // c2.f0
    public final void b(float f10) {
    }

    @Override // c2.f0
    public final void d(float f10) {
    }

    @Override // c2.f0
    public final void h(float f10) {
    }

    @Override // c2.f0
    public final void i(int i10) {
    }

    @Override // c2.f0
    public final void k(r0 r0Var) {
    }

    @Override // c2.f0
    public final void m(float f10) {
    }

    @Override // c2.f0
    public final void n(long j) {
    }

    @Override // c2.f0
    public final void o(n nVar) {
    }

    @Override // c2.f0
    public final void q(boolean z2) {
    }

    @Override // c2.f0
    public final void s(float f10) {
    }

    @Override // c2.f0
    public final void t(long j) {
    }

    @Override // c2.f0
    public final void u(float f10) {
    }

    @Override // c2.f0
    public final void w(float f10) {
    }
}
