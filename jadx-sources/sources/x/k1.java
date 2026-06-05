package x;

import android.view.ViewConfiguration;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k1 extends n1 {

    /* renamed from: f, reason: collision with root package name */
    public final w5.a0 f19591f;

    /* renamed from: g, reason: collision with root package name */
    public final sj.c f19592g;

    /* renamed from: h, reason: collision with root package name */
    public qj.s1 f19593h;

    public k1(l2 l2Var, w5.a0 a0Var, p1.d dVar, s3.c cVar) {
        super(l2Var, dVar, cVar);
        this.f19591f = a0Var;
        this.f19592g = u6.v.a(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r0v18, types: [ej.e, fj.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(x.k1 r19, x.l2 r20, x.g1 r21, float r22, float r23, vi.c r24) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.k1.c(x.k1, x.l2, x.g1, float, float, vi.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(x.k1 r14, fj.v r15, fj.s r16, x.l2 r17, fj.v r18, long r19, vi.c r21) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.k1.d(x.k1, fj.v, fj.s, x.l2, fj.v, long, vi.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static g1 g(sj.c cVar) {
        g1 g1Var = null;
        mj.g gVarY = mk.b.y(new k0.x0((Object) new f1(cVar, 0), (ti.c) (0 == true ? 1 : 0), 2));
        while (gVarY.hasNext()) {
            g1 g1VarA = (g1) gVarY.next();
            if (g1Var != null) {
                g1VarA = g1Var.a(g1VarA);
            }
            g1Var = g1VarA;
        }
        return g1Var;
    }

    public final float e(j2 j2Var, float f10) {
        l2 l2Var = this.f19651a;
        long jH = l2Var.h(l2Var.d(f10));
        l2 l2Var2 = j2Var.f19583a;
        return l2Var.g(l2Var.e(l2Var2.c(l2Var2.f19622k, jH, 1)));
    }

    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final boolean f(p2.n nVar) {
        long j;
        w5.a0 a0Var = this.f19591f;
        ViewConfiguration viewConfiguration = (ViewConfiguration) a0Var.f18604a;
        float f10 = -viewConfiguration.getScaledVerticalScrollFactor();
        float f11 = -viewConfiguration.getScaledHorizontalScrollFactor();
        ?? r32 = nVar.f12734a;
        b2.b bVar = new b2.b(0L);
        int size = r32.size();
        int i10 = 0;
        while (true) {
            j = bVar.f1500a;
            if (i10 >= size) {
                break;
            }
            bVar = new b2.b(b2.b.f(j, ((p2.w) r32.get(i10)).j));
            i10++;
        }
        long jFloatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f11) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f10) & 4294967295L);
        l2 l2Var = this.f19651a;
        float fI = l2Var.i(l2Var.e(jFloatToRawIntBits));
        if (!(fI != 0.0f ? fI > 0.0f ? l2Var.f19613a.d() : l2Var.f19613a.c() : false)) {
            return this.f19654d;
        }
        long j4 = ((p2.w) qi.l.z0(nVar.f12734a)).f12761b;
        a0Var.getClass();
        return !(this.f19592g.h(new g1(jFloatToRawIntBits, j4, false)) instanceof sj.i);
    }
}
