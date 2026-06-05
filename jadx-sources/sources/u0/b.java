package u0;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.o1;
import b0.q1;
import b0.r;
import b0.t1;
import c1.k2;
import c1.v7;
import c2.e0;
import c2.v0;
import c2.w;
import com.anonlab.voidlauncher.R;
import f1.a1;
import f1.f1;
import f1.i0;
import f1.n1;
import f1.q2;
import f1.s;
import g3.f0;
import k3.y;
import p2.k0;
import pi.o;
import ra.d0;
import t2.q0;
import u6.v;
import v.z1;
import va.u;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: b, reason: collision with root package name */
    public static c2.g f16476b;

    /* renamed from: c, reason: collision with root package name */
    public static c2.b f16477c;

    /* renamed from: d, reason: collision with root package name */
    public static e2.b f16478d;

    /* renamed from: e, reason: collision with root package name */
    public static i2.f f16479e;

    /* renamed from: f, reason: collision with root package name */
    public static i2.f f16480f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16481a = 10;

    public static final void a(int i10, ej.a aVar, ej.a aVar2, ej.c cVar, i0 i0Var, mi.p pVar, v1.o oVar, boolean z2) {
        v1.o oVar2;
        boolean z10;
        i0 i0Var2 = i0Var;
        fj.l.f(aVar, "onUnlockRequest");
        fj.l.f(cVar, "onPinComplete");
        fj.l.f(aVar2, "onCancel");
        i0Var2.c0(761105095);
        int i11 = i10 | (i0Var.f(pVar) ? 4 : 2) | (i0Var2.g(z2) ? 32 : 16) | (i0Var2.h(cVar) ? 2048 : 1024) | 196608;
        if (i0Var2.T(i11 & 1, (74899 & i11) != 74898)) {
            Object objQ = i0Var2.Q();
            f1.f fVar = f1.m.f6385a;
            if (objQ == fVar) {
                objQ = y8.f.a(0.0f, i0Var2);
            }
            f1 f1Var = (f1) objQ;
            Object objQ2 = i0Var2.Q();
            if (objQ2 == fVar) {
                objQ2 = s.A("");
                i0Var2.l0(objQ2);
            }
            a1 a1Var = (a1) objQ2;
            Object objQ3 = i0Var2.Q();
            ti.c cVar2 = null;
            if (objQ3 == fVar) {
                objQ3 = new d0(2, a1Var, cVar2);
                i0Var2.l0(objQ3);
            }
            pi.o oVar3 = pi.o.f13011a;
            s.f((ej.e) objQ3, i0Var2, oVar3);
            q2 q2VarB = t.e.b(z2 ? 1.0f : 0.0f, t.d.t(200, 100, null, 4), "pin_alpha", null, i0Var2, 3120, 20);
            Object objQ4 = i0Var2.Q();
            if (objQ4 == fVar) {
                k3.m mVar = new k3.m(qi.k.c0(new y[]{v.c(R.font.big_oppo_clock, null, 14)}));
                i0Var2.l0(mVar);
                objQ4 = mVar;
            }
            k3.j jVar = (k3.j) objQ4;
            Configuration configuration = (Configuration) i0Var2.j(AndroidCompositionLocals_androidKt.f837a);
            float f10 = configuration.screenWidthDp;
            float f11 = configuration.screenHeightDp;
            f1.v vVar = jb.f.f8827g;
            b0.i0 i0Var3 = t1.f1433c;
            v1.g gVar = v1.b.f17547a;
            q0 q0VarD = r.d(gVar, false);
            int iHashCode = Long.hashCode(i0Var2.T);
            n1 n1VarL = i0Var2.l();
            v1.o oVarC = v1.a.c(i0Var2, i0Var3);
            v2.h.f17668w.getClass();
            v2.f fVar2 = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar2);
            } else {
                i0Var2.o0();
            }
            v2.e eVar = v2.g.f17649f;
            s.M(eVar, i0Var2, q0VarD);
            v2.e eVar2 = v2.g.f17648e;
            s.M(eVar2, i0Var2, n1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            v2.e eVar3 = v2.g.f17650g;
            s.w(i0Var2, numValueOf, eVar3);
            v2.d dVar = v2.g.f17651h;
            s.I(dVar, i0Var2);
            v2.e eVar4 = v2.g.f17647d;
            s.M(eVar4, i0Var2, oVarC);
            v1.o oVarF = v.n.f(i0Var3, w.f3057g, e0.f2986b);
            Object objQ5 = i0Var2.Q();
            if (objQ5 == fVar) {
                objQ5 = ya.a.f20267a;
                i0Var2.l0(objQ5);
            }
            r.a(k0.a(oVarF, oVar3, (PointerInputEventHandler) objQ5), i0Var2, 0);
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zC = ((i11 & 112) == 32) | i0Var2.c(-200.0f);
            Object objQ6 = i0Var2.Q();
            if (zC || objQ6 == fVar) {
                objQ6 = new ya.b(z2, aVar, f1Var);
                i0Var2.l0(objQ6);
            }
            v1.o oVarA = k0.a(i0Var3, boolValueOf, (PointerInputEventHandler) objQ6);
            q0 q0VarD2 = r.d(gVar, false);
            int iHashCode2 = Long.hashCode(i0Var2.T);
            n1 n1VarL2 = i0Var2.l();
            v1.o oVarC2 = v1.a.c(i0Var2, oVarA);
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar2);
            } else {
                i0Var2.o0();
            }
            s.M(eVar, i0Var2, q0VarD2);
            s.M(eVar2, i0Var2, n1VarL2);
            gk.b.t(iHashCode2, i0Var2, eVar3, i0Var2, dVar);
            s.M(eVar4, i0Var2, oVarC2);
            float f12 = z2 ? 0.0f : 1.0f;
            String str = (String) a1Var.getValue();
            long jD = hj.a.D(4294967296L, 0.22f * f10);
            long j = w.f3054d;
            v1.l lVar = v1.l.f17564b;
            v1.o oVarC3 = t1.c(1.0f, lVar);
            v1.g gVar2 = v1.b.f17548b;
            b0.w wVar = b0.w.f1450a;
            float f13 = 32;
            v7.a(str, z1.h.a(f12, b0.d.x(wVar.b(oVarC3, gVar2), f13, f11 * 0.08f, f13, 0.0f, 8)), j, jD, null, jVar, 0L, new r3.k(3), 0L, 0, false, 0, 0, null, i0Var, 12583296, 0, 260968);
            long jC = w.c(j, 0.6f);
            long jX = hj.a.x(14);
            v1.o oVarX = b0.d.x(wVar.b(lVar, v1.b.A), 0.0f, 0.0f, 0.0f, 80, 7);
            Object objQ7 = i0Var.Q();
            if (objQ7 == fVar) {
                objQ7 = new ra.m(f1Var, 6);
                i0Var.l0(objQ7);
            }
            v7.a("Swipe up to unlock", b0.d.o(oVarX, (ej.c) objQ7), jC, jX, null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 24966, 0, 262120);
            i0Var2 = i0Var;
            i0Var2.p(true);
            if (z2) {
                i0Var2.b0(1581280998);
                v1.o oVarA2 = z1.h.a(((Number) q2VarB.getValue()).floatValue(), lVar);
                q0 q0VarD3 = r.d(gVar, false);
                int iHashCode3 = Long.hashCode(i0Var2.T);
                n1 n1VarL3 = i0Var2.l();
                v1.o oVarC4 = v1.a.c(i0Var2, oVarA2);
                i0Var2.e0();
                if (i0Var2.S) {
                    i0Var2.k(fVar2);
                } else {
                    i0Var2.o0();
                }
                s.M(eVar, i0Var2, q0VarD3);
                s.M(eVar2, i0Var2, n1VarL3);
                gk.b.t(iHashCode3, i0Var2, eVar3, i0Var2, dVar);
                s.M(eVar4, i0Var2, oVarC4);
                va.m.a(u.f18005c, cVar, aVar2, null, "", false, pVar, (jb.d) i0Var2.j(vVar), (fi.a) i0Var2.j(jb.f.f8828h), i0Var, ((i11 >> 6) & 112) | 221574 | ((i11 << 18) & 3670016));
                i0Var2 = i0Var;
                z10 = true;
                i0Var2.p(true);
                i0Var2.p(false);
            } else {
                z10 = true;
                i0Var2.b0(1581798977);
                i0Var2.p(false);
            }
            i0Var2.p(z10);
            oVar2 = lVar;
        } else {
            i0Var2.W();
            oVar2 = oVar;
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new lb.p(pVar, z2, aVar, cVar, aVar2, oVar2, i10);
        }
    }

    public static final void b(v1.o oVar, za.e eVar, long j, i0 i0Var, int i10) {
        i0Var.c0(1061651633);
        int i11 = i10 | 6 | (i0Var.f(eVar) ? 32 : 16);
        if (i0Var.T(i11 & 1, (i11 & 147) != 146)) {
            i0Var.b0(-1954992465);
            c(eVar, j, i0Var, i11 & 1022);
            i0Var.p(false);
            oVar = v1.l.f17564b;
        } else {
            i0Var.W();
        }
        v1.o oVar2 = oVar;
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new k2(oVar2, eVar, j, i10, 4);
        }
    }

    public static final void c(final za.e eVar, final long j, i0 i0Var, final int i10) {
        int i11;
        i0 i0Var2 = i0Var;
        pi.h hVar = eVar.f20481a;
        i0Var2.c0(1038897608);
        int i12 = i10 & 6;
        v1.l lVar = v1.l.f17564b;
        if (i12 == 0) {
            i11 = (i0Var2.f(lVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var2.f(eVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= i0Var2.e(j) ? 256 : 128;
        }
        if (i0Var2.T(i11 & 1, (i11 & 147) != 146)) {
            Object objQ = i0Var2.Q();
            if (objQ == f1.m.f6385a) {
                s3.p[] pVarArr = s3.o.f14756b;
                long j4 = 1095216660480L & j;
                if (j4 == 0) {
                    s3.i.a("Cannot perform operation for Unspecified type.");
                }
                s3.o oVar = new s3.o(hj.a.D(j4, s3.o.c(j) * 0.8f));
                i0Var2.l0(oVar);
                objQ = oVar;
            }
            long j10 = ((s3.o) objQ).f14758a;
            q1 q1VarA = o1.a(b0.j.f1359a, v1.b.C, i0Var2, 0);
            int iHashCode = Long.hashCode(i0Var2.T);
            n1 n1VarL = i0Var2.l();
            v1.o oVarC = v1.a.c(i0Var2, lVar);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            s.M(v2.g.f17649f, i0Var2, q1VarA);
            s.M(v2.g.f17648e, i0Var2, n1VarL);
            s.w(i0Var2, Integer.valueOf(iHashCode), v2.g.f17650g);
            s.I(v2.g.f17651h, i0Var2);
            s.M(v2.g.f17647d, i0Var2, oVarC);
            g3.c cVar = new g3.c();
            k3.m mVar = ha.e.f7771c;
            cVar.d(new f0(0L, j, (k3.s) null, (k3.o) null, (k3.p) null, mVar, (String) null, 0L, (r3.a) null, (r3.p) null, (n3.b) null, 0L, (r3.l) null, (v0) null, 65501));
            pi.h hVar2 = eVar.f20482b;
            d(cVar, ((za.a) hVar.f13000a).f20468a);
            cVar.b("\n");
            d(cVar, ((za.a) hVar2.f13000a).f20468a);
            int i13 = (i11 << 3) & 112;
            v7.b(cVar.e(), lVar, 0L, 0L, 0L, new r3.k(3), j10, 0, false, 0, 0, null, null, null, i0Var, i13, 521212);
            g3.c cVar2 = new g3.c();
            cVar2.d(new f0(0L, j, (k3.s) null, (k3.o) null, (k3.p) null, mVar, (String) null, 0L, (r3.a) null, (r3.p) null, (n3.b) null, 0L, (r3.l) null, (v0) null, 65501));
            d(cVar2, ((za.a) hVar.f13001b).f20468a);
            cVar2.b("\n");
            d(cVar2, ((za.a) hVar2.f13001b).f20468a);
            v7.b(cVar2.e(), lVar, 0L, 0L, 0L, new r3.k(3), j10, 0, false, 0, 0, null, null, null, i0Var, i13, 521212);
            i0Var2 = i0Var;
            i0Var2.p(true);
        } else {
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e() { // from class: za.f
                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iO = s.O(i10 | 1);
                    u0.b.c(eVar, j, (i0) obj, iO);
                    return o.f13011a;
                }
            };
        }
    }

    public static final void d(g3.c cVar, pi.h hVar) {
        int iD = cVar.d(new f0(((w) hVar.f13001b).f3060a, 0L, (k3.s) null, (k3.o) null, (k3.p) null, (k3.j) null, (String) null, 0L, (r3.a) null, (r3.p) null, (n3.b) null, 0L, (r3.l) null, (v0) null, 65534));
        try {
            cVar.b(String.valueOf(((Number) hVar.f13000a).intValue()));
        } finally {
            cVar.c(iD);
        }
    }

    public static final long e() {
        return Thread.currentThread().getId();
    }

    public static final long f(long j, boolean z2, int i10, float f10) {
        int iH = ((z2 || i10 == 2 || i10 == 4 || i10 == 5) && s3.a.d(j)) ? s3.a.h(j) : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        if (s3.a.j(j) != iH) {
            iH = cg.b.p(k0.s.m(f10), s3.a.j(j), iH);
        }
        return uk.c.B(0, iH, 0, s3.a.g(j));
    }

    public static ColorStateList i(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !z1.n(drawable)) {
            return null;
        }
        return z1.d(drawable).getColorStateList();
    }

    public static SharedPreferences l(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:253:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018f A[PHI: r6 r20 r21 r22 r23 r24 r25 r26 r27 r28 r29
      0x018f: PHI (r6v14 w1.d) = (r6v13 w1.d), (r6v15 w1.d) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r20v6 boolean) = (r20v5 boolean), (r20v7 boolean) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r21v5 f3.a) = (r21v4 f3.a), (r21v6 f3.a) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r22v5 g3.f) = (r22v4 g3.f), (r22v6 g3.f) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r23v13 w1.f) = (r23v12 w1.f), (r23v14 w1.f) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r24v6 w1.m) = (r24v5 w1.m), (r24v7 w1.m) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r25v6 java.lang.Boolean) = (r25v5 java.lang.Boolean), (r25v7 java.lang.Boolean) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r26v13 d3.j) = (r26v12 d3.j), (r26v14 d3.j) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r27v6 boolean) = (r27v5 boolean), (r27v7 boolean) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r28v7 boolean) = (r28v6 boolean), (r28v8 boolean) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
      0x018f: PHI (r29v6 java.lang.Integer) = (r29v5 java.lang.Integer), (r29v7 java.lang.Integer) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(android.view.ViewStructure r39, v2.f0 r40, android.view.autofill.AutofillId r41, java.lang.String r42, e3.b r43) {
        /*
            Method dump skipped, instructions count: 1103
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.b.n(android.view.ViewStructure, v2.f0, android.view.autofill.AutofillId, java.lang.String, e3.b):void");
    }

    public abstract int g(View view, int i10, int i11);

    public z5.h h() {
        return new z5.h();
    }

    public abstract String j();

    public abstract int k(View view, int i10);

    public String toString() {
        switch (this.f16481a) {
            case 10:
                return "Alignment:" + j();
            default:
                return super.toString();
        }
    }

    public int m(int i10, int i11) {
        return i10;
    }
}
