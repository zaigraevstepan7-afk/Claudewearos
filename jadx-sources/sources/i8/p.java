package i8;

import f1.g1;
import t2.z;
import v2.h0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p extends h2.b {
    public final long A;
    public final boolean C;
    public oj.e E;
    public boolean F;
    public c2.n H;
    public h2.b I;
    public final long J;

    /* renamed from: f, reason: collision with root package name */
    public final h2.b f8397f;

    /* renamed from: z, reason: collision with root package name */
    public final t2.i f8398z;
    public final oj.g B = oj.f.f12546b;
    public final g1 D = new g1(0);
    public float G = 1.0f;

    public p(h2.b bVar, h2.b bVar2, t2.i iVar, long j, boolean z2) {
        this.f8397f = bVar2;
        this.f8398z = iVar;
        this.A = j;
        this.C = z2;
        this.I = bVar;
        long jH = bVar != null ? bVar.h() : 0L;
        long jH2 = bVar2 != null ? bVar2.h() : 0L;
        long jFloatToRawIntBits = 9205357640488583168L;
        boolean z10 = jH != 9205357640488583168L;
        boolean z11 = jH2 != 9205357640488583168L;
        if (z10 && z11) {
            jFloatToRawIntBits = (Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (jH >> 32)), Float.intBitsToFloat((int) (jH2 >> 32)))) << 32) | (4294967295L & Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (jH & 4294967295L)), Float.intBitsToFloat((int) (jH2 & 4294967295L)))));
        }
        this.J = jFloatToRawIntBits;
    }

    @Override // h2.b
    public final boolean b(float f10) {
        this.G = f10;
        return true;
    }

    @Override // h2.b
    public final boolean e(c2.n nVar) {
        this.H = nVar;
        return true;
    }

    @Override // h2.b
    public final long h() {
        return this.J;
    }

    @Override // h2.b
    public final void i(h0 h0Var) {
        boolean z2 = this.F;
        h2.b bVar = this.f8397f;
        if (z2) {
            j(h0Var, bVar, this.G);
            return;
        }
        oj.e eVarA = this.E;
        if (eVarA == null) {
            eVarA = this.B.a();
            this.E = eVarA;
        }
        float f10 = oj.a.f(oj.e.a(eVarA.f12545a)) / oj.a.f(this.A);
        float fO = cg.b.o(f10, 0.0f, 1.0f);
        float f11 = this.G;
        float f12 = fO * f11;
        if (this.C) {
            f11 -= f12;
        }
        this.F = f10 >= 1.0f;
        j(h0Var, this.I, f11);
        j(h0Var, bVar, f12);
        if (this.F) {
            this.I = null;
        } else {
            g1 g1Var = this.D;
            g1Var.h(g1Var.g() + 1);
        }
    }

    public final void j(h0 h0Var, h2.b bVar, float f10) {
        e2.b bVar2 = h0Var.f17669a;
        if (bVar == null || f10 <= 0.0f) {
            return;
        }
        long jA = bVar2.a();
        long jH = bVar.h();
        long jO = (jH == 9205357640488583168L || b2.e.f(jH) || jA == 9205357640488583168L || b2.e.f(jA)) ? jA : z.o(jH, this.f8398z.a(jH, jA));
        if (jA == 9205357640488583168L || b2.e.f(jA)) {
            bVar.g(h0Var, jO, f10, this.H);
            return;
        }
        long j = jO;
        float f11 = 2;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (jA >> 32)) - Float.intBitsToFloat((int) (j >> 32))) / f11;
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (jA & 4294967295L)) - Float.intBitsToFloat((int) (4294967295L & j))) / f11;
        ((ld.i) bVar2.f5738b.f373b).N(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat, fIntBitsToFloat2);
        try {
            bVar.g(h0Var, j, f10, this.H);
        } finally {
            float f12 = -fIntBitsToFloat;
            float f13 = -fIntBitsToFloat2;
            ((ld.i) bVar2.f5738b.f373b).N(f12, f13, f12, f13);
        }
    }
}
