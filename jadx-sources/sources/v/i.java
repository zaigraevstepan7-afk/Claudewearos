package v;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import c1.u6;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final s3.c f17217a;

    /* renamed from: b, reason: collision with root package name */
    public long f17218b = 9205357640488583168L;

    /* renamed from: c, reason: collision with root package name */
    public final h0 f17219c;

    /* renamed from: d, reason: collision with root package name */
    public final f1.j1 f17220d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17221e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17222f;

    /* renamed from: g, reason: collision with root package name */
    public long f17223g;

    /* renamed from: h, reason: collision with root package name */
    public long f17224h;

    /* renamed from: i, reason: collision with root package name */
    public final v2.k f17225i;

    public i(Context context, s3.c cVar, long j, b0.i1 i1Var) {
        this.f17217a = cVar;
        h0 h0Var = new h0(context, c2.e0.E(j));
        this.f17219c = h0Var;
        this.f17220d = new f1.j1(pi.o.f13011a, f1.f.f6290d);
        this.f17221e = true;
        this.f17223g = 0L;
        this.f17224h = -1L;
        u6 u6Var = new u6(this, 7);
        p2.n nVar = p2.k0.f12716a;
        p2.p0 p0Var = new p2.p0(null, null, u6Var);
        this.f17225i = Build.VERSION.SDK_INT >= 31 ? new o0(p0Var, this, h0Var) : new o0(p0Var, this, h0Var, i1Var);
    }

    public final void a() {
        boolean z2;
        h0 h0Var = this.f17219c;
        EdgeEffect edgeEffect = h0Var.f17208d;
        boolean z10 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = !edgeEffect.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = h0Var.f17209e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 = !edgeEffect2.isFinished() || z2;
        }
        EdgeEffect edgeEffect3 = h0Var.f17210f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 = !edgeEffect3.isFinished() || z2;
        }
        EdgeEffect edgeEffect4 = h0Var.f17211g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z2) {
                z10 = false;
            }
            z2 = z10;
        }
        if (z2) {
            d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0138, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r19, x.k2 r21, vi.c r22) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.i.b(long, x.k2, vi.c):java.lang.Object");
    }

    public final long c() {
        long jZ = this.f17218b;
        if ((9223372034707292159L & jZ) == 9205357640488583168L) {
            jZ = x8.a.z(this.f17223g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jZ >> 32)) / Float.intBitsToFloat((int) (this.f17223g >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jZ & 4294967295L)) / Float.intBitsToFloat((int) (this.f17223g & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void d() {
        if (this.f17221e) {
            this.f17220d.setValue(pi.o.f13011a);
        }
    }

    public final float e(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i10 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.f17223g & 4294967295L));
        EdgeEffect edgeEffectB = this.f17219c.b();
        float fC = -fIntBitsToFloat2;
        float f10 = 1 - fIntBitsToFloat;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            fC = l.c(edgeEffectB, fC, f10);
        } else {
            edgeEffectB.onPull(fC, f10);
        }
        return (i11 >= 31 ? l.b(edgeEffectB) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.f17223g)) * (-fC) : Float.intBitsToFloat(i10);
    }

    public final float f(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i10 = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.f17223g >> 32));
        EdgeEffect edgeEffectC = this.f17219c.c();
        float f10 = 1 - fIntBitsToFloat;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            fIntBitsToFloat2 = l.c(edgeEffectC, fIntBitsToFloat2, f10);
        } else {
            edgeEffectC.onPull(fIntBitsToFloat2, f10);
        }
        return (i11 >= 31 ? l.b(edgeEffectC) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f17223g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i10);
    }

    public final float g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i10 = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.f17223g >> 32));
        EdgeEffect edgeEffectD = this.f17219c.d();
        float fC = -fIntBitsToFloat2;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            fC = l.c(edgeEffectD, fC, fIntBitsToFloat);
        } else {
            edgeEffectD.onPull(fC, fIntBitsToFloat);
        }
        return (i11 >= 31 ? l.b(edgeEffectD) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f17223g >> 32)) * (-fC) : Float.intBitsToFloat(i10);
    }

    public final float h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i10 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10) / Float.intBitsToFloat((int) (this.f17223g & 4294967295L));
        EdgeEffect edgeEffectE = this.f17219c.e();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            fIntBitsToFloat2 = l.c(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectE.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i11 >= 31 ? l.b(edgeEffectE) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.f17223g & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i10);
    }

    public final void i(long j) {
        boolean zA = b2.e.a(this.f17223g, 0L);
        boolean zA2 = b2.e.a(j, this.f17223g);
        this.f17223g = j;
        if (!zA2) {
            long jH = (hj.a.H(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (hj.a.H(Float.intBitsToFloat((int) (j >> 32))) << 32);
            h0 h0Var = this.f17219c;
            h0Var.f17207c = jH;
            EdgeEffect edgeEffect = h0Var.f17208d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jH >> 32), (int) (jH & 4294967295L));
            }
            EdgeEffect edgeEffect2 = h0Var.f17209e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jH >> 32), (int) (jH & 4294967295L));
            }
            EdgeEffect edgeEffect3 = h0Var.f17210f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jH & 4294967295L), (int) (jH >> 32));
            }
            EdgeEffect edgeEffect4 = h0Var.f17211g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jH & 4294967295L), (int) (jH >> 32));
            }
            EdgeEffect edgeEffect5 = h0Var.f17212h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jH >> 32), (int) (jH & 4294967295L));
            }
            EdgeEffect edgeEffect6 = h0Var.f17213i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jH >> 32), (int) (jH & 4294967295L));
            }
            EdgeEffect edgeEffect7 = h0Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jH & 4294967295L), (int) (jH >> 32));
            }
            EdgeEffect edgeEffect8 = h0Var.f17214k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jH), (int) (jH >> 32));
            }
        }
        if (zA || zA2) {
            return;
        }
        a();
    }
}
