package p0;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.r;
import c1.s3;
import f1.i0;
import f1.s;
import f1.t1;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import w3.d0;
import w3.e0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f12625a;

    static {
        f12625a = new d0((30 & 1) == 0, e0.f18499a, true, 0);
    }

    public static final void a(n0.g gVar, n0.c cVar, i0 i0Var, int i10) {
        i0 i0Var2;
        Context context;
        i0Var.c0(1904307118);
        int i11 = (i0Var.f(gVar) ? 4 : 2) | i10 | (i0Var.h(cVar) ? 32 : 16);
        if (i0Var.T(i11 & 1, (i11 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                i0Var.b0(-1009482584);
                context = (Context) i0Var.j(AndroidCompositionLocals_androidKt.f838b);
                i0Var.p(false);
            } else {
                i0Var.b0(-1009433480);
                i0Var.p(false);
                context = null;
            }
            boolean zH = i0Var.h(cVar) | ((i11 & 14) == 4) | i0Var.h(context);
            Object objQ = i0Var.Q();
            if (zH || objQ == f1.m.f6385a) {
                objQ = new ab.m(cVar, context, gVar, 15);
                i0Var.l0(objQ);
            }
            i0Var2 = i0Var;
            w.f.b(null, null, (ej.c) objQ, i0Var2, 0, 3);
        } else {
            i0Var2 = i0Var;
            i0Var2.W();
        }
        t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ab.g(gVar, i10, 19, cVar);
        }
    }

    public static final void b(final int i10, final long j, i0 i0Var, final int i11) throws XmlPullParserException, Resources.NotFoundException, IOException {
        final int i12;
        int i13;
        t1 t1VarU;
        ej.e eVar;
        i0Var.c0(-1240244237);
        if ((i11 & 6) == 0) {
            i12 = i10;
            i13 = i11 | (i0Var.d(i12) ? 4 : 2);
        } else {
            i12 = i10;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= i0Var.e(j) ? 32 : 16;
        }
        if (i0Var.T(i13 & 1, (i13 & 19) != 18)) {
            Context context = (Context) i0Var.j(AndroidCompositionLocals_androidKt.f838b);
            boolean zF = ((i13 & 14) == 4) | i0Var.f(context);
            Object objQ = i0Var.Q();
            Object obj = f1.m.f6385a;
            if (zF || objQ == obj) {
                objQ = Integer.valueOf(context.obtainStyledAttributes(new int[]{i12}).getResourceId(0, -1));
                i0Var.l0(objQ);
            }
            int iIntValue = ((Number) objQ).intValue();
            if (iIntValue == -1) {
                t1VarU = i0Var.u();
                if (t1VarU != null) {
                    final int i14 = 1;
                    eVar = new ej.e() { // from class: p0.k
                        @Override // ej.e
                        public final Object invoke(Object obj2, Object obj3) throws XmlPullParserException, Resources.NotFoundException, IOException {
                            int i15 = i14;
                            i0 i0Var2 = (i0) obj2;
                            ((Integer) obj3).getClass();
                            switch (i15) {
                                case 0:
                                    l.b(i12, j, i0Var2, s.O(i11 | 1));
                                    break;
                                default:
                                    l.b(i12, j, i0Var2, s.O(i11 | 1));
                                    break;
                            }
                            return pi.o.f13011a;
                        }
                    };
                    t1VarU.f6456d = eVar;
                }
                return;
            }
            h2.b bVarV = yd.f.V(iIntValue, i0Var);
            boolean z2 = (i13 & 112) == 32;
            Object objQ2 = i0Var.Q();
            if (z2 || objQ2 == obj) {
                objQ2 = j == 16 ? null : new c2.n(j, 5);
                i0Var.l0(objQ2);
            }
            r.a(z1.h.h(b0.t1.k(w.e.j, v1.l.f17564b), bVarV, null, t2.h.f15564b, 0.0f, (c2.n) objQ2, 22), i0Var, 0);
        } else {
            i0Var.W();
        }
        t1VarU = i0Var.u();
        if (t1VarU != null) {
            final int i15 = 0;
            eVar = new ej.e() { // from class: p0.k
                @Override // ej.e
                public final Object invoke(Object obj2, Object obj3) throws XmlPullParserException, Resources.NotFoundException, IOException {
                    int i152 = i15;
                    i0 i0Var2 = (i0) obj2;
                    ((Integer) obj3).getClass();
                    switch (i152) {
                        case 0:
                            l.b(i10, j, i0Var2, s.O(i11 | 1));
                            break;
                        default:
                            l.b(i10, j, i0Var2, s.O(i11 | 1));
                            break;
                    }
                    return pi.o.f13011a;
                }
            };
            t1VarU.f6456d = eVar;
        }
    }

    public static final void c(n0.g gVar, r0.e eVar, ej.a aVar, i0 i0Var, int i10) {
        int i11;
        i0Var.c0(-2040393164);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? i0Var.f(gVar) : i0Var.h(gVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? i0Var.f(eVar) : i0Var.h(eVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= i0Var.h(aVar) ? 256 : 128;
        }
        boolean z2 = false;
        if (i0Var.T(i11 & 1, (i11 & 147) != 146)) {
            boolean z10 = (i11 & 112) == 32 || ((i11 & 64) != 0 && i0Var.f(eVar));
            Object objQ = i0Var.Q();
            f1.f fVar = f1.m.f6385a;
            if (z10 || objQ == fVar) {
                objQ = new n(new p7.k(new s3(19, eVar, aVar), 29));
                i0Var.l0(objQ);
            }
            n nVar = (n) objQ;
            if ((i11 & 14) == 4 || ((i11 & 8) != 0 && i0Var.h(gVar))) {
                z2 = true;
            }
            Object objQ2 = i0Var.Q();
            if (z2 || objQ2 == fVar) {
                objQ2 = new a7.e(gVar, 27);
                i0Var.l0(objQ2);
            }
            w3.m.a(nVar, (ej.a) objQ2, f12625a, p1.j.d(1315155414, new ab.g(18, eVar, gVar), i0Var), i0Var, 3456, 0);
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new b6.e(gVar, eVar, aVar, i10, 5);
        }
    }

    public static final void d(v1.o oVar, p1.e eVar, i0 i0Var, int i10) {
        int i11;
        i0Var.c0(1392105195);
        if ((i10 & 6) == 0) {
            i11 = (i0Var.f(oVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.h(eVar) ? 32 : 16;
        }
        if (i0Var.T(i11 & 1, (i11 & 19) != 18)) {
            hj.a.f(oVar, r0.g.f13662a, eVar, i0Var, ((i11 << 6) & 7168) | (i11 & 14) | 432);
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new i(oVar, eVar, i10, 2);
        }
    }
}
