package v0;

import java.util.List;
import k0.s1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final g3.f f17419a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17420b;

    /* renamed from: c, reason: collision with root package name */
    public final g3.k0 f17421c;

    /* renamed from: d, reason: collision with root package name */
    public final l3.n f17422d;

    /* renamed from: e, reason: collision with root package name */
    public final z0 f17423e;

    /* renamed from: f, reason: collision with root package name */
    public long f17424f;

    /* renamed from: g, reason: collision with root package name */
    public final g3.f f17425g;

    /* renamed from: h, reason: collision with root package name */
    public final l3.t f17426h;

    /* renamed from: i, reason: collision with root package name */
    public final s1 f17427i;

    public l0(l3.t tVar, l3.n nVar, s1 s1Var, z0 z0Var) {
        g3.f fVar = tVar.f9937a;
        long j = tVar.f9938b;
        g3.k0 k0Var = s1Var != null ? s1Var.f9254a : null;
        this.f17419a = fVar;
        this.f17420b = j;
        this.f17421c = k0Var;
        this.f17422d = nVar;
        this.f17423e = z0Var;
        this.f17424f = j;
        this.f17425g = fVar;
        this.f17426h = tVar;
        this.f17427i = s1Var;
    }

    public final List a(ej.c cVar) {
        if (!g3.m0.c(this.f17424f)) {
            return qi.k.c0(new l3.g[]{new l3.a("", 0), new l3.s(g3.m0.f(this.f17424f), g3.m0.f(this.f17424f))});
        }
        l3.g gVar = (l3.g) cVar.invoke(this);
        if (gVar != null) {
            return yd.f.K(gVar);
        }
        return null;
    }

    public final Integer b() {
        g3.k0 k0Var = this.f17421c;
        if (k0Var == null) {
            return null;
        }
        g3.o oVar = k0Var.f7129b;
        int iE = g3.m0.e(this.f17424f);
        l3.n nVar = this.f17422d;
        return Integer.valueOf(nVar.a(oVar.c(oVar.d(nVar.b(iE)), true)));
    }

    public final Integer c() {
        g3.k0 k0Var = this.f17421c;
        if (k0Var == null) {
            return null;
        }
        int iF = g3.m0.f(this.f17424f);
        l3.n nVar = this.f17422d;
        return Integer.valueOf(nVar.a(k0Var.f(k0Var.f7129b.d(nVar.b(iF)))));
    }

    public final Integer d() {
        int length;
        g3.k0 k0Var = this.f17421c;
        if (k0Var == null) {
            return null;
        }
        int iR = r();
        while (true) {
            g3.f fVar = this.f17419a;
            if (iR < fVar.f7081b.length()) {
                int length2 = this.f17425g.f7081b.length() - 1;
                if (iR <= length2) {
                    length2 = iR;
                }
                long jI = k0Var.i(length2);
                int i10 = g3.m0.f7144c;
                int i11 = (int) (jI & 4294967295L);
                if (i11 > iR) {
                    length = this.f17422d.a(i11);
                    break;
                }
                iR++;
            } else {
                length = fVar.f7081b.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer e() {
        int iA;
        g3.k0 k0Var = this.f17421c;
        if (k0Var == null) {
            return null;
        }
        int iR = r();
        while (true) {
            if (iR <= 0) {
                iA = 0;
                break;
            }
            int length = this.f17425g.f7081b.length() - 1;
            if (iR <= length) {
                length = iR;
            }
            long jI = k0Var.i(length);
            int i10 = g3.m0.f7144c;
            int i11 = (int) (jI >> 32);
            if (i11 < iR) {
                iA = this.f17422d.a(i11);
                break;
            }
            iR--;
        }
        return Integer.valueOf(iA);
    }

    public final boolean f() {
        g3.k0 k0Var = this.f17421c;
        return (k0Var != null ? k0Var.g(r()) : null) != r3.j.f13682b;
    }

    public final int g(g3.k0 k0Var, int i10) {
        int iR = r();
        z0 z0Var = this.f17423e;
        if (z0Var.f17544a == null) {
            z0Var.f17544a = Float.valueOf(k0Var.c(iR).f1502a);
        }
        g3.o oVar = k0Var.f7129b;
        int iD = oVar.d(iR) + i10;
        if (iD < 0) {
            return 0;
        }
        if (iD >= oVar.f7159f) {
            return this.f17425g.f7081b.length();
        }
        float fB = oVar.b(iD) - 1;
        Float f10 = z0Var.f17544a;
        fj.l.c(f10);
        float fFloatValue = f10.floatValue();
        if ((f() && fFloatValue >= k0Var.e(iD)) || (!f() && fFloatValue <= k0Var.d(iD))) {
            return oVar.c(iD, true);
        }
        return this.f17422d.a(oVar.g((Float.floatToRawIntBits(fB) & 4294967295L) | (Float.floatToRawIntBits(f10.floatValue()) << 32)));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(k0.s1 r9, int r10) {
        /*
            r8 = this;
            t2.w r0 = r9.f9255b
            g3.k0 r1 = r9.f9254a
            if (r0 == 0) goto L13
            t2.w r9 = r9.f9256c
            if (r9 == 0) goto L10
            r2 = 1
            b2.c r9 = r9.z(r0, r2)
            goto L11
        L10:
            r9 = 0
        L11:
            if (r9 != 0) goto L15
        L13:
            b2.c r9 = b2.c.f1501e
        L15:
            l3.t r0 = r8.f17426h
            long r2 = r0.f9938b
            int r0 = g3.m0.f7144c
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r0 = (int) r2
            l3.n r2 = r8.f17422d
            int r0 = r2.b(r0)
            b2.c r0 = r1.c(r0)
            float r3 = r0.f1502a
            float r0 = r0.f1503b
            long r6 = r9.c()
            long r6 = r6 & r4
            int r9 = (int) r6
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r10 = (float) r10
            float r9 = r9 * r10
            float r9 = r9 + r0
            int r10 = java.lang.Float.floatToRawIntBits(r3)
            long r6 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r9
            r0 = 32
            long r6 = r6 << r0
            long r9 = r9 & r4
            long r9 = r9 | r6
            g3.o r0 = r1.f7129b
            int r9 = r0.g(r9)
            int r9 = r2.a(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.l0.h(k0.s1, int):int");
    }

    public final void i() {
        z0 z0Var = this.f17423e;
        z0Var.f17544a = null;
        g3.f fVar = this.f17425g;
        if (fVar.f7081b.length() > 0) {
            if (f()) {
                k();
                return;
            }
            z0Var.f17544a = null;
            if (fVar.f7081b.length() > 0) {
                String str = fVar.f7081b;
                long j = this.f17424f;
                int i10 = g3.m0.f7144c;
                int iP = k0.s.p((int) (j & 4294967295L), str);
                if (iP != -1) {
                    q(iP, iP);
                }
            }
        }
    }

    public final void j() {
        this.f17423e.f17544a = null;
        g3.f fVar = this.f17425g;
        String str = fVar.f7081b;
        String str2 = fVar.f7081b;
        if (str.length() > 0) {
            int iQ = k0.s.q(str2, g3.m0.e(this.f17424f));
            if (iQ == g3.m0.e(this.f17424f) && iQ != str2.length()) {
                iQ = k0.s.q(str2, iQ + 1);
            }
            q(iQ, iQ);
        }
    }

    public final void k() {
        this.f17423e.f17544a = null;
        g3.f fVar = this.f17425g;
        if (fVar.f7081b.length() > 0) {
            String str = fVar.f7081b;
            long j = this.f17424f;
            int i10 = g3.m0.f7144c;
            int iS = k0.s.s((int) (j & 4294967295L), str);
            if (iS != -1) {
                q(iS, iS);
            }
        }
    }

    public final void l() {
        this.f17423e.f17544a = null;
        g3.f fVar = this.f17425g;
        String str = fVar.f7081b;
        String str2 = fVar.f7081b;
        if (str.length() > 0) {
            int iR = k0.s.r(str2, g3.m0.f(this.f17424f));
            if (iR == g3.m0.f(this.f17424f) && iR != 0) {
                iR = k0.s.r(str2, iR - 1);
            }
            q(iR, iR);
        }
    }

    public final void m() {
        z0 z0Var = this.f17423e;
        z0Var.f17544a = null;
        g3.f fVar = this.f17425g;
        if (fVar.f7081b.length() > 0) {
            if (!f()) {
                k();
                return;
            }
            z0Var.f17544a = null;
            if (fVar.f7081b.length() > 0) {
                String str = fVar.f7081b;
                long j = this.f17424f;
                int i10 = g3.m0.f7144c;
                int iP = k0.s.p((int) (j & 4294967295L), str);
                if (iP != -1) {
                    q(iP, iP);
                }
            }
        }
    }

    public final void n() {
        Integer numB;
        this.f17423e.f17544a = null;
        if (this.f17425g.f7081b.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        q(iIntValue, iIntValue);
    }

    public final void o() {
        Integer numC;
        this.f17423e.f17544a = null;
        if (this.f17425g.f7081b.length() <= 0 || (numC = c()) == null) {
            return;
        }
        int iIntValue = numC.intValue();
        q(iIntValue, iIntValue);
    }

    public final void p() {
        if (this.f17425g.f7081b.length() > 0) {
            int i10 = g3.m0.f7144c;
            this.f17424f = g3.e0.b((int) (this.f17420b >> 32), (int) (this.f17424f & 4294967295L));
        }
    }

    public final void q(int i10, int i11) {
        this.f17424f = g3.e0.b(i10, i11);
    }

    public final int r() {
        long j = this.f17424f;
        int i10 = g3.m0.f7144c;
        return this.f17422d.b((int) (j & 4294967295L));
    }
}
