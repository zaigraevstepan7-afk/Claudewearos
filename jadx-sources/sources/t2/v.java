package t2;

import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v implements s0, r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f15659a;

    /* renamed from: b, reason: collision with root package name */
    public final s3.m f15660b;

    public v(r rVar, s3.m mVar) {
        this.f15659a = rVar;
        this.f15660b = mVar;
    }

    @Override // t2.s0
    public final r0 D0(int i10, int i11, Map map, ej.c cVar, ej.c cVar2) {
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        if ((i10 & (-16777216)) != 0 || ((-16777216) & i11) != 0) {
            s2.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new u(i10, i11, map, cVar);
    }

    @Override // s3.c
    public final int E0(long j) {
        return this.f15659a.E0(j);
    }

    @Override // s3.c
    public final int I0(float f10) {
        return this.f15659a.I0(f10);
    }

    @Override // s3.c
    public final long J(float f10) {
        return this.f15659a.J(f10);
    }

    @Override // s3.c
    public final long K(long j) {
        return this.f15659a.K(j);
    }

    @Override // s3.c
    public final float N(long j) {
        return this.f15659a.N(j);
    }

    @Override // s3.c
    public final long Q0(long j) {
        return this.f15659a.Q0(j);
    }

    @Override // s3.c
    public final float W0(long j) {
        return this.f15659a.W0(j);
    }

    @Override // s3.c
    public final long Z(float f10) {
        return this.f15659a.Z(f10);
    }

    @Override // s3.c
    public final float e() {
        return this.f15659a.e();
    }

    @Override // t2.r
    public final s3.m getLayoutDirection() {
        return this.f15660b;
    }

    @Override // s3.c
    public final float h0(int i10) {
        return this.f15659a.h0(i10);
    }

    @Override // s3.c
    public final float l0(float f10) {
        return this.f15659a.l0(f10);
    }

    @Override // s3.c
    public final float r0() {
        return this.f15659a.r0();
    }

    @Override // t2.r
    public final boolean t0() {
        return this.f15659a.t0();
    }

    @Override // s3.c
    public final float w0(float f10) {
        return this.f15659a.w0(f10);
    }
}
