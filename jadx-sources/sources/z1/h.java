package z1;

import c2.e0;
import c2.g0;
import c2.w0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class h {
    public static final v1.o a(float f10, v1.o oVar) {
        return f10 == 1.0f ? oVar : e0.s(oVar, 0.0f, 0.0f, f10, null, null, 520187);
    }

    public static v1.o b(float f10, v1.o oVar) {
        float f11 = 0;
        if (s3.f.b(f10, f11) > 0) {
            s3.f.b(f10, f11);
        }
        return e0.q(oVar, new a(f10, f10, 0, true));
    }

    public static final v1.o c(v1.o oVar, w0 w0Var) {
        return e0.s(oVar, 0.0f, 0.0f, 0.0f, w0Var, null, 518143);
    }

    public static final v1.o d(v1.o oVar) {
        return e0.s(oVar, 0.0f, 0.0f, 0.0f, null, null, 520191);
    }

    public static final v1.o e(v1.o oVar, ej.c cVar) {
        return oVar.c(new f(cVar));
    }

    public static final v1.o f(v1.o oVar, ej.c cVar) {
        return oVar.c(new i(cVar));
    }

    public static final v1.o g(v1.o oVar, ej.c cVar) {
        return oVar.c(new j(cVar));
    }

    public static v1.o h(v1.o oVar, h2.b bVar, v1.c cVar, t2.i iVar, float f10, c2.n nVar, int i10) {
        if ((i10 & 4) != 0) {
            cVar = v1.b.f17551e;
        }
        v1.c cVar2 = cVar;
        if ((i10 & 16) != 0) {
            f10 = 1.0f;
        }
        return oVar.c(new m(bVar, cVar2, iVar, f10, nVar));
    }

    public static final v1.o i(v1.o oVar, float f10, float f11) {
        return (f10 == 1.0f && f11 == 1.0f) ? oVar : e0.s(oVar, f10, f11, 0.0f, null, null, 524284);
    }

    public static v1.o j(float f10, int i10, w0 w0Var, v1.o oVar) {
        boolean z2;
        if ((i10 & 4) != 0) {
            z2 = s3.f.b(f10, (float) 0) > 0;
        } else {
            z2 = false;
        }
        long j = g0.f2997a;
        return (s3.f.b(f10, (float) 0) > 0 || z2) ? oVar.c(new o(f10, w0Var, z2, j, j)) : oVar;
    }
}
