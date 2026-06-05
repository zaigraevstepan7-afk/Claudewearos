package e2;

import android.graphics.Paint;
import c2.e0;
import c2.j;
import c2.n;
import c2.p0;
import c2.s;
import c2.u;
import c2.w;
import fj.l;
import s3.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final a f5737a;

    /* renamed from: b, reason: collision with root package name */
    public final ac.d f5738b;

    /* renamed from: c, reason: collision with root package name */
    public c2.h f5739c;

    /* renamed from: d, reason: collision with root package name */
    public c2.h f5740d;

    public b() {
        m mVar = m.f14752a;
        a aVar = new a();
        aVar.f5733a = c.f5741a;
        aVar.f5734b = mVar;
        aVar.f5735c = f.f5742a;
        aVar.f5736d = 0L;
        this.f5737a = aVar;
        this.f5738b = new ac.d(this);
    }

    public static c2.h f(b bVar, long j, e eVar, float f10, int i10) {
        c2.h hVarR = bVar.r(eVar);
        if (f10 != 1.0f) {
            j = w.c(j, w.e(j) * f10);
        }
        Paint paint = hVarR.f2999a;
        if (!w.d(e0.c(paint.getColor()), j)) {
            hVarR.e(j);
        }
        if (hVarR.f3001c != null) {
            hVarR.h(null);
        }
        if (!l.b(hVarR.f3002d, null)) {
            hVarR.f(null);
        }
        if (hVarR.f3000b != i10) {
            hVarR.d(i10);
        }
        if (paint.isFilterBitmap()) {
            return hVarR;
        }
        hVarR.g(1);
        return hVarR;
    }

    @Override // e2.d
    public final ac.d C0() {
        return this.f5738b;
    }

    @Override // e2.d
    public final void H0(long j, float f10, long j4, e eVar) {
        this.f5737a.f5735c.h(f10, j4, f(this, j, eVar, 1.0f, 3));
    }

    @Override // e2.d
    public final void R(long j, long j4, long j10, float f10, int i10) {
        u uVar = this.f5737a.f5735c;
        c2.h hVarG = this.f5740d;
        if (hVarG == null) {
            hVarG = e0.g();
            hVarG.l(1);
            this.f5740d = hVarG;
        }
        Paint paint = hVarG.f2999a;
        if (!w.d(e0.c(paint.getColor()), j)) {
            hVarG.e(j);
        }
        if (hVarG.f3001c != null) {
            hVarG.h(null);
        }
        if (!l.b(hVarG.f3002d, null)) {
            hVarG.f(null);
        }
        if (hVarG.f3000b != 3) {
            hVarG.d(3);
        }
        if (paint.getStrokeWidth() != f10) {
            hVarG.k(f10);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (hVarG.a() != i10) {
            hVarG.i(i10);
        }
        if (hVarG.b() != 0) {
            hVarG.j(0);
        }
        if (!paint.isFilterBitmap()) {
            hVarG.g(1);
        }
        uVar.n(j4, j10, hVarG);
    }

    @Override // e2.d
    public final void S(long j, float f10, float f11, long j4, long j10, e eVar) {
        int i10 = (int) (j4 >> 32);
        int i11 = (int) (j4 & 4294967295L);
        this.f5737a.f5735c.r(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat(i11), f10, f11, f(this, j, eVar, 1.0f, 3));
    }

    @Override // e2.d
    public final void S0(j jVar, long j, e eVar) {
        this.f5737a.f5735c.a(jVar, f(this, j, eVar, 1.0f, 3));
    }

    @Override // e2.d
    public final void T(c2.g gVar, long j, long j4, long j10, float f10, n nVar, int i10) {
        this.f5737a.f5735c.s(gVar, j, j4, j10, l(null, g.f5743a, f10, nVar, 3, i10));
    }

    @Override // e2.d
    public final void T0(j jVar, s sVar, float f10, e eVar, int i10) {
        this.f5737a.f5735c.a(jVar, l(sVar, eVar, f10, null, i10, 1));
    }

    @Override // e2.d
    public final void W(s sVar, long j, long j4, float f10, e eVar, n nVar, int i10) {
        int i11 = (int) (j >> 32);
        int i12 = (int) (j & 4294967295L);
        this.f5737a.f5735c.k(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (j4 >> 32)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (4294967295L & j4)) + Float.intBitsToFloat(i12), l(sVar, eVar, f10, nVar, i10, 1));
    }

    @Override // e2.d
    public final void Y0(c2.g gVar, n nVar) {
        this.f5737a.f5735c.e(gVar, l(null, g.f5743a, 1.0f, nVar, 3, 1));
    }

    @Override // s3.c
    public final float e() {
        return this.f5737a.f5733a.e();
    }

    @Override // e2.d
    public final void e0(long j, long j4, long j10, float f10, e eVar, int i10) {
        int i11 = (int) (j4 >> 32);
        int i12 = (int) (j4 & 4294967295L);
        this.f5737a.f5735c.k(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (4294967295L & j10)) + Float.intBitsToFloat(i12), f(this, j, eVar, f10, i10));
    }

    @Override // e2.d
    public final void f0(long j, long j4, long j10, long j11, e eVar) {
        int i10 = (int) (j4 >> 32);
        int i11 = (int) (j4 & 4294967295L);
        this.f5737a.f5735c.l(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), f(this, j, eVar, 1.0f, 3));
    }

    @Override // e2.d
    public final m getLayoutDirection() {
        return this.f5737a.f5734b;
    }

    @Override // e2.d
    public final void k0(p0 p0Var, float f10, long j) {
        this.f5737a.f5735c.h(f10, j, l(p0Var, g.f5743a, 1.0f, null, 3, 1));
    }

    public final c2.h l(s sVar, e eVar, float f10, n nVar, int i10, int i11) {
        c2.h hVarR = r(eVar);
        if (sVar != null) {
            sVar.a(f10, a(), hVarR);
        } else {
            Paint paint = hVarR.f2999a;
            if (hVarR.f3001c != null) {
                hVarR.h(null);
            }
            long jC = e0.c(paint.getColor());
            long j = w.f3052b;
            if (!w.d(jC, j)) {
                hVarR.e(j);
            }
            if (paint.getAlpha() / 255.0f != f10) {
                hVarR.c(f10);
            }
        }
        if (!l.b(hVarR.f3002d, nVar)) {
            hVarR.f(nVar);
        }
        if (hVarR.f3000b != i10) {
            hVarR.d(i10);
        }
        if (hVarR.f2999a.isFilterBitmap() == i11) {
            return hVarR;
        }
        hVarR.g(i11);
        return hVarR;
    }

    public final c2.h r(e eVar) {
        if (l.b(eVar, g.f5743a)) {
            c2.h hVar = this.f5739c;
            if (hVar != null) {
                return hVar;
            }
            c2.h hVarG = e0.g();
            hVarG.l(0);
            this.f5739c = hVarG;
            return hVarG;
        }
        if (!(eVar instanceof h)) {
            throw new b3.e();
        }
        c2.h hVarG2 = this.f5740d;
        if (hVarG2 == null) {
            hVarG2 = e0.g();
            hVarG2.l(1);
            this.f5740d = hVarG2;
        }
        Paint paint = hVarG2.f2999a;
        float strokeWidth = paint.getStrokeWidth();
        h hVar2 = (h) eVar;
        float f10 = hVar2.f5744a;
        if (strokeWidth != f10) {
            hVarG2.k(f10);
        }
        int iA = hVarG2.a();
        int i10 = hVar2.f5746c;
        if (iA != i10) {
            hVarG2.i(i10);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f11 = hVar2.f5745b;
        if (strokeMiter != f11) {
            paint.setStrokeMiter(f11);
        }
        int iB = hVarG2.b();
        int i11 = hVar2.f5747d;
        if (iB == i11) {
            return hVarG2;
        }
        hVarG2.j(i11);
        return hVarG2;
    }

    @Override // s3.c
    public final float r0() {
        return this.f5737a.f5733a.r0();
    }
}
