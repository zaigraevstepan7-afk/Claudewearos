package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class b7 {

    /* renamed from: a, reason: collision with root package name */
    public static final f1.v f1945a = new f1.v(new b6.j(15));

    public static final void a(v1.o oVar, c2.w0 w0Var, long j, long j4, float f10, float f11, p1.e eVar, f1.i0 i0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            w0Var = c2.e0.f2986b;
        }
        c2.w0 w0Var2 = w0Var;
        long jB = (i11 & 8) != 0 ? x0.b(j, i0Var) : j4;
        float f12 = (i11 & 16) != 0 ? 0 : f10;
        float f13 = (i11 & 32) != 0 ? 0 : f11;
        f1.v vVar = f1945a;
        float f14 = ((s3.f) i0Var.j(vVar)).f14742a + f12;
        f1.s.b(new f1.r1[]{g1.f2116a.a(new c2.w(jB)), vVar.a(new s3.f(f14))}, p1.j.d(421772006, new y6(oVar, w0Var2, j, f14, null, f13, eVar), i0Var), i0Var, 56);
    }

    public static final v1.o b(v1.o oVar, c2.w0 w0Var, long j, v.u uVar, float f10) {
        c2.w0 w0Var2;
        v1.o oVarR;
        v1.o tVar = v1.l.f17564b;
        if (f10 > 0.0f) {
            w0Var2 = w0Var;
            oVarR = c2.e0.r(tVar, 0.0f, 0.0f, 0.0f, f10, w0Var2, 124895);
        } else {
            w0Var2 = w0Var;
            oVarR = tVar;
        }
        v1.o oVarC = oVar.c(oVarR);
        if (uVar != null) {
            tVar = new v.t(uVar.f17289a, uVar.f17290b, w0Var2);
        }
        return z1.h.c(v.n.f(oVarC.c(tVar), j, w0Var2), w0Var2);
    }

    public static final long c(long j, float f10, f1.i0 i0Var) {
        w0 w0Var = (w0) i0Var.j(x0.f2845a);
        boolean zBooleanValue = ((Boolean) i0Var.j(x0.f2846b)).booleanValue();
        long j4 = w0Var.f2806p;
        if (!c2.w.d(j, j4) || !zBooleanValue) {
            return j;
        }
        if (s3.f.e(f10, 0)) {
            return j4;
        }
        return c2.e0.k(c2.w.c(w0Var.f2810t, ((((float) Math.log(f10 + 1)) * 4.5f) + 2.0f) / 100.0f), j4);
    }
}
