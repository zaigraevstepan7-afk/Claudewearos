package c1;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q6 implements t2.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2614a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2615b;

    public /* synthetic */ q6(Object obj, int i10) {
        this.f2614a = i10;
        this.f2615b = obj;
    }

    @Override // t2.q0
    public final t2.r0 a(t2.s0 s0Var, List list, long j) {
        int iMax;
        int iMax2;
        int i10;
        int i11;
        int iH;
        switch (this.f2614a) {
            case 0:
                x6 x6Var = (x6) this.f2615b;
                float[] fArr = x6Var.f2874e;
                x.o1 o1Var = x6Var.f2879k;
                int size = list.size();
                for (int i12 = 0; i12 < size; i12++) {
                    t2.p0 p0Var = (t2.p0) list.get(i12);
                    if (t2.z.i(p0Var) == b6.f1942a) {
                        final t2.f1 f1VarY = p0Var.Y(j);
                        int size2 = list.size();
                        for (int i13 = 0; i13 < size2; i13++) {
                            t2.p0 p0Var2 = (t2.p0) list.get(i13);
                            if (t2.z.i(p0Var2) == b6.f1943b) {
                                x.o1 o1Var2 = x.o1.f19664a;
                                t2.f1 f1VarY2 = o1Var == o1Var2 ? p0Var2.Y(s3.a.a(s3.b.j(0, j, -f1VarY.f15551b, 1), 0, 0, 0, 0, 14)) : p0Var2.Y(s3.a.a(s3.b.j(-f1VarY.f15550a, j, 0, 2), 0, 0, 0, 0, 11));
                                final fj.t tVar = new fj.t();
                                float fC = x6Var.c();
                                if (!fj.l.a(fC, qi.k.o0(fArr))) {
                                    fj.l.a(fC, qi.k.t0(fArr));
                                }
                                f1VarY2.x0(v6.f2780f);
                                if (o1Var == o1Var2) {
                                    iMax = Math.max(f1VarY2.f15550a, f1VarY.f15550a);
                                    int i14 = f1VarY.f15551b;
                                    int i15 = f1VarY2.f15551b;
                                    iMax2 = i14 + i15;
                                    i10 = (iMax - f1VarY2.f15550a) / 2;
                                    i11 = i14 / 2;
                                    iH = (iMax - f1VarY.f15550a) / 2;
                                    tVar.f6805a = hj.a.H(i15 * fC);
                                } else {
                                    iMax = f1VarY.f15550a + f1VarY2.f15550a;
                                    iMax2 = Math.max(f1VarY2.f15551b, f1VarY.f15551b);
                                    i10 = f1VarY.f15550a / 2;
                                    i11 = (iMax2 - f1VarY2.f15551b) / 2;
                                    iH = hj.a.H(f1VarY2.f15550a * fC);
                                    tVar.f6805a = (iMax2 - f1VarY.f15551b) / 2;
                                }
                                final int i16 = i11;
                                final int i17 = i10;
                                final int i18 = iH;
                                x6Var.f2875f.h(iMax);
                                x6Var.f2876g.h(iMax2);
                                final t2.f1 f1Var = f1VarY2;
                                return s0Var.B(iMax, iMax2, qi.t.f13521a, new ej.c() { // from class: c1.p6
                                    @Override // ej.c
                                    public final Object invoke(Object obj) {
                                        t2.e1 e1Var = (t2.e1) obj;
                                        t2.e1.D(e1Var, f1Var, i17, i16);
                                        t2.e1.D(e1Var, f1VarY, i18, tVar.f6805a);
                                        return pi.o.f13011a;
                                    }
                                });
                            }
                        }
                        u3.b.b("Collection contains no element matching the predicate.");
                        throw new b3.e();
                    }
                }
                u3.b.b("Collection contains no element matching the predicate.");
                throw new b3.e();
            default:
                return s0Var.B(s3.a.h(j), s3.a.g(j), qi.t.f13521a, new b0.c1(28, list, this));
        }
    }
}
