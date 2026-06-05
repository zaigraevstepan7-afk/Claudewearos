package v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t1 extends v1.n implements v2.w, v2.z1 {
    public v1 H;
    public boolean I;

    @Override // v2.w
    public final int C(v2.n0 n0Var, t2.p0 p0Var, int i10) {
        if (!this.I) {
            i10 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        return p0Var.v0(i10);
    }

    @Override // v2.w
    public final int O(v2.n0 n0Var, t2.p0 p0Var, int i10) {
        if (!this.I) {
            i10 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        return p0Var.l(i10);
    }

    @Override // v2.w
    public final int R0(v2.n0 n0Var, t2.p0 p0Var, int i10) {
        if (this.I) {
            i10 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        return p0Var.V(i10);
    }

    @Override // v2.w
    public final int b1(v2.n0 n0Var, t2.p0 p0Var, int i10) {
        if (this.I) {
            i10 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        return p0Var.O(i10);
    }

    @Override // v2.w
    public final t2.r0 r(t2.s0 s0Var, t2.p0 p0Var, long j) {
        n.i(j, this.I ? x.o1.f19664a : x.o1.f19665b);
        boolean z2 = this.I;
        int iH = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        int iG = z2 ? Integer.MAX_VALUE : s3.a.g(j);
        if (this.I) {
            iH = s3.a.h(j);
        }
        t2.f1 f1VarY = p0Var.Y(s3.a.a(j, 0, iH, 0, iG, 5));
        int i10 = f1VarY.f15550a;
        int iH2 = s3.a.h(j);
        if (i10 > iH2) {
            i10 = iH2;
        }
        int i11 = f1VarY.f15551b;
        int iG2 = s3.a.g(j);
        if (i11 > iG2) {
            i11 = iG2;
        }
        int i12 = f1VarY.f15551b - i11;
        int i13 = f1VarY.f15550a - i10;
        if (!this.I) {
            i12 = i13;
        }
        v1 v1Var = this.H;
        f1.g1 g1Var = v1Var.f17311e;
        f1.g1 g1Var2 = v1Var.f17307a;
        g1Var.h(i12);
        t1.g gVarF = t1.r.f();
        ej.c cVarE = gVarF != null ? gVarF.e() : null;
        t1.g gVarK = t1.r.k(gVarF);
        try {
            if (g1Var2.g() > i12) {
                g1Var2.h(i12);
            }
            t1.r.n(gVarF, gVarK, cVarE);
            this.H.f17308b.h(this.I ? i11 : i10);
            this.H.f17309c.h(this.I ? f1VarY.f15551b : f1VarY.f15550a);
            return s0Var.B(i10, i11, qi.t.f13521a, new f1.s1(this, i12, 2, f1VarY));
        } catch (Throwable th2) {
            t1.r.n(gVarF, gVarK, cVarE);
            throw th2;
        }
    }

    @Override // v2.z1
    public final void u0(d3.z zVar) {
        d3.x.g(zVar);
        final int i10 = 0;
        final int i11 = 1;
        d3.k kVar = new d3.k(new ej.a(this) { // from class: v.s1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t1 f17282b;

            {
                this.f17282b = this;
            }

            @Override // ej.a
            public final Object a() {
                int iG;
                switch (i10) {
                    case 0:
                        iG = this.f17282b.H.f17307a.g();
                        break;
                    default:
                        iG = this.f17282b.H.f17311e.g();
                        break;
                }
                return Float.valueOf(iG);
            }
        }, new ej.a(this) { // from class: v.s1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t1 f17282b;

            {
                this.f17282b = this;
            }

            @Override // ej.a
            public final Object a() {
                int iG;
                switch (i11) {
                    case 0:
                        iG = this.f17282b.H.f17307a.g();
                        break;
                    default:
                        iG = this.f17282b.H.f17311e.g();
                        break;
                }
                return Float.valueOf(iG);
            }
        });
        if (this.I) {
            d3.y yVar = d3.v.f4797w;
            lj.d dVar = d3.x.f4803a[13];
            zVar.b(yVar, kVar);
        } else {
            d3.y yVar2 = d3.v.f4796v;
            lj.d dVar2 = d3.x.f4803a[12];
            zVar.b(yVar2, kVar);
        }
    }
}
