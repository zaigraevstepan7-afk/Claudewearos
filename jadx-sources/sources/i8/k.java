package i8;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import f1.i0;
import f1.n1;
import f1.t1;
import h8.u;
import h8.v;
import h8.w;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import w2.q1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final j f8385a = new j();

    public static final void a(r8.g gVar, String str, v1.o oVar, i0 i0Var, int i10) {
        h8.m mVar;
        v1.g gVar2 = v1.b.f17551e;
        Context context = (Context) i0Var.j(AndroidCompositionLocals_androidKt.f838b);
        AtomicReference atomicReference = u.f7732a;
        Object obj = atomicReference.get();
        h8.m mVarA = null;
        h8.m mVar2 = obj instanceof h8.m ? (h8.m) obj : null;
        if (mVar2 == null) {
            loop0: while (true) {
                Object obj2 = atomicReference.get();
                if (obj2 instanceof h8.m) {
                    mVar = mVarA;
                    mVarA = (h8.m) obj2;
                } else {
                    if (mVarA == null) {
                        context.getApplicationContext();
                        gf.f fVar = w.f7733a;
                        mVarA = v.a(context);
                    }
                    mVar = mVarA;
                }
                while (!atomicReference.compareAndSet(obj2, mVarA)) {
                    if (atomicReference.get() != obj2) {
                        break;
                    }
                }
                mVarA = mVar;
            }
            mVar2 = mVarA;
        }
        b(new j8.a(mVar2, (b) i0Var.j(r.f8400a), gVar), str, oVar, i.N, gVar2, t2.h.f15563a, i0Var, (((((i10 << 3) & 7168) | 12582960) >> 3) & 896) | 1572912, 0);
    }

    public static final void b(final j8.a aVar, final String str, final v1.o oVar, final ej.c cVar, final v1.c cVar2, final t2.i iVar, i0 i0Var, final int i10, final int i11) {
        int i12;
        Object obj;
        i0Var.c0(1236588022);
        int i13 = (i0Var.f(aVar) ? 4 : 2) | i10;
        if ((i10 & 384) == 0) {
            i13 |= i0Var.f(oVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i13 |= i0Var.h(cVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i13 |= i0Var.h(null) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i13 |= i0Var.f(cVar2) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i13 |= i0Var.f(iVar) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i13 |= i0Var.c(1.0f) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i13 |= i0Var.f(null) ? 67108864 : 33554432;
        }
        if ((805306368 & i10) == 0) {
            i13 |= i0Var.d(1) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i12 = i11 | (i0Var.g(true) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (i0Var.T(i13 & 1, ((306783379 & i13) == 306783378 && (i12 & 3) == 2) ? false : true)) {
            r8.g gVar = aVar.f8736a;
            int i14 = j8.g.f8753b;
            i0Var.b0(-329318062);
            i0Var.b0(-1008895720);
            if (gVar.f13885s.f13865g != null) {
                i0Var.b0(-1008855668);
                i0Var.p(false);
                i0Var.p(false);
                i0Var.p(false);
            } else {
                i0Var.b0(-1008807494);
                boolean zB = fj.l.b(iVar, t2.h.f15567e);
                boolean zG = i0Var.g(zB);
                Object objQ = i0Var.Q();
                Object obj2 = f1.m.f6385a;
                if (zG || objQ == obj2) {
                    if (zB) {
                        obj = s8.i.f14789a;
                    } else {
                        o oVar2 = new o();
                        oVar2.f8395b = j8.g.f8752a;
                        oVar2.f8396c = new ArrayList();
                        obj = oVar2;
                    }
                    objQ = obj;
                    i0Var.l0(objQ);
                }
                s8.i iVar2 = (s8.i) objQ;
                boolean zF = i0Var.f(gVar) | i0Var.f(iVar2);
                Object objQ2 = i0Var.Q();
                if (zF || objQ2 == obj2) {
                    r8.d dVarA = r8.g.a(gVar);
                    dVarA.f13841l = iVar2;
                    objQ2 = dVarA.a();
                    i0Var.l0(objQ2);
                }
                gVar = (r8.g) objQ2;
                i0Var.p(false);
                i0Var.p(false);
                i0Var.p(false);
            }
            r8.g gVar2 = gVar;
            Object obj3 = gVar2.f13869b;
            if (obj3 instanceof r8.d) {
                throw new IllegalArgumentException("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
            }
            if (obj3 instanceof c2.g) {
                j8.g.b("ImageBitmap");
                throw null;
            }
            if (obj3 instanceof i2.f) {
                j8.g.b("ImageVector");
                throw null;
            }
            if (obj3 instanceof h2.b) {
                j8.g.b("Painter");
                throw null;
            }
            if (gVar2.f13870c != null) {
                throw new IllegalArgumentException("request.target must be null.");
            }
            if (((androidx.lifecycle.v) h8.n.d(gVar2, r8.i.f13895e)) != null) {
                throw new IllegalArgumentException("request.lifecycle must be null.");
            }
            h8.m mVar = aVar.f8738c;
            m mVar2 = null;
            b bVar = aVar.f8737b;
            if (((Boolean) i0Var.j(q1.f18361a)).booleanValue()) {
                i0Var.b0(2019071620);
                mVar2 = (m) i0Var.j(s.f8401a);
                i0Var.p(false);
            } else {
                i0Var.b0(2019129125);
                i0Var.p(false);
            }
            v1.o oVarC = oVar.c(new j8.b(gVar2, mVar, bVar, cVar, cVar2, iVar, mVar2, str));
            int iHashCode = Long.hashCode(i0Var.T);
            v1.o oVarC2 = v1.a.c(i0Var, oVarC);
            n1 n1VarL = i0Var.l();
            v2.h.f17668w.getClass();
            ej.a aVar2 = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(aVar2);
            } else {
                i0Var.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var, j8.f.f8751a);
            f1.s.M(v2.g.f17648e, i0Var, n1VarL);
            f1.s.M(v2.g.f17647d, i0Var, oVarC2);
            v2.e eVar = v2.g.f17650g;
            if (i0Var.S || !fj.l.b(i0Var.Q(), Integer.valueOf(iHashCode))) {
                m6.a.l(iHashCode, i0Var, iHashCode, eVar);
            }
            i0Var.p(true);
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e() { // from class: i8.a
                @Override // ej.e
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    k.b(aVar, str, oVar, cVar, cVar2, iVar, (i0) obj4, f1.s.O(i10 | 1), f1.s.O(i11));
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final h2.b c(h8.j jVar, Context context, int i10) {
        return jVar instanceof h8.a ? wd.a.b(new c2.g(((h8.a) jVar).f7686a), i10) : jVar instanceof h8.e ? new qb.b(h8.n.b(jVar, context.getResources()).mutate()) : new q(jVar);
    }
}
