package nb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.b0;
import b0.g2;
import b0.o1;
import b0.q1;
import b0.r1;
import b0.t1;
import b0.y0;
import c1.a2;
import c1.k0;
import c1.v7;
import c1.x4;
import c2.e0;
import c2.j0;
import c2.z0;
import f1.i0;
import f1.n1;
import f1.q2;
import g3.f0;
import g3.n0;
import i2.h0;
import java.util.ArrayList;
import java.util.List;
import lb.u0;
import t.m1;
import t2.q0;
import v2.f2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final long f12074a = e0.d(4278519047L);

    /* renamed from: b, reason: collision with root package name */
    public static final long f12075b = e0.d(4281998954L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f12076c = e0.d(4279117640L);

    /* renamed from: d, reason: collision with root package name */
    public static final long f12077d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f12078e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f12079f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f12080g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f12081h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f12082i;
    public static final float j;

    /* renamed from: k, reason: collision with root package name */
    public static final float f12083k;

    /* renamed from: l, reason: collision with root package name */
    public static final List f12084l;

    static {
        e0.d(4279111186L);
        e0.d(4279571739L);
        f12077d = e0.c(536870911);
        f12078e = e0.d(4294309367L);
        f12079f = e0.d(3019898879L);
        f12080g = e0.d(2164260863L);
        f12081h = e0.c(1509949439);
        f12082i = e0.d(4287280383L);
        e0.d(4285500927L);
        j = 320;
        f12083k = 72;
        i2.f fVarB = u3.a.f16591b;
        if (fVarB == null) {
            i2.e eVar = new i2.e("Outlined.AutoAwesome", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i10 = h0.f8270a;
            long j4 = c2.w.f3052b;
            z0 z0Var = new z0(j4);
            d8.e eVar2 = new d8.e(9);
            eVar2.x(19.0f, 9.0f);
            eVar2.w(1.25f, -2.75f);
            eVar2.w(2.75f, -1.25f);
            eVar2.w(-2.75f, -1.25f);
            eVar2.w(-1.25f, -2.75f);
            eVar2.w(-1.25f, 2.75f);
            eVar2.w(-2.75f, 1.25f);
            eVar2.w(2.75f, 1.25f);
            eVar2.k();
            i2.e.a(eVar, (ArrayList) eVar2.f5001a, z0Var);
            z0 z0Var2 = new z0(j4);
            d8.e eVar3 = new d8.e(9);
            eVar3.x(19.0f, 15.0f);
            eVar3.w(-1.25f, 2.75f);
            eVar3.w(-2.75f, 1.25f);
            eVar3.w(2.75f, 1.25f);
            eVar3.w(1.25f, 2.75f);
            eVar3.w(1.25f, -2.75f);
            eVar3.w(2.75f, -1.25f);
            eVar3.w(-2.75f, -1.25f);
            eVar3.k();
            i2.e.a(eVar, (ArrayList) eVar3.f5001a, z0Var2);
            z0 z0Var3 = new z0(j4);
            d8.e eVar4 = new d8.e(9);
            eVar4.x(11.5f, 9.5f);
            eVar4.v(9.0f, 4.0f);
            eVar4.v(6.5f, 9.5f);
            eVar4.v(1.0f, 12.0f);
            eVar4.w(5.5f, 2.5f);
            eVar4.v(9.0f, 20.0f);
            eVar4.w(2.5f, -5.5f);
            eVar4.v(17.0f, 12.0f);
            eVar4.v(11.5f, 9.5f);
            eVar4.k();
            eVar4.x(9.99f, 12.99f);
            eVar4.v(9.0f, 15.17f);
            eVar4.w(-0.99f, -2.18f);
            eVar4.v(5.83f, 12.0f);
            eVar4.w(2.18f, -0.99f);
            eVar4.v(9.0f, 8.83f);
            eVar4.w(0.99f, 2.18f);
            eVar4.v(12.17f, 12.0f);
            eVar4.v(9.99f, 12.99f);
            eVar4.k();
            i2.e.a(eVar, (ArrayList) eVar4.f5001a, z0Var3);
            fVarB = eVar.b();
            u3.a.f16591b = fVarB;
        }
        f fVar = new f(fVarB, "Liquid Glass dock", "Real refraction, blur and chromatic detail.");
        i2.f fVarB2 = u1.b.f16563c;
        if (fVarB2 == null) {
            i2.e eVar5 = new i2.e("Outlined.PhoneIphone", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i11 = h0.f8270a;
            z0 z0Var4 = new z0(c2.w.f3052b);
            d8.e eVar6 = new d8.e(9);
            eVar6.x(15.5f, 1.0f);
            eVar6.u(-8.0f);
            eVar6.n(6.12f, 1.0f, 5.0f, 2.12f, 5.0f, 3.5f);
            eVar6.H(17.0f);
            eVar6.n(5.0f, 21.88f, 6.12f, 23.0f, 7.5f, 23.0f);
            eVar6.u(8.0f);
            eVar6.o(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
            eVar6.H(-17.0f);
            eVar6.n(18.0f, 2.12f, 16.88f, 1.0f, 15.5f, 1.0f);
            eVar6.k();
            eVar6.x(11.5f, 22.0f);
            eVar6.o(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
            eVar6.D(0.67f, -1.5f, 1.5f, -1.5f);
            eVar6.D(1.5f, 0.67f, 1.5f, 1.5f);
            eVar6.D(-0.67f, 1.5f, -1.5f, 1.5f);
            eVar6.k();
            eVar6.x(16.0f, 18.0f);
            eVar6.v(7.0f, 18.0f);
            eVar6.v(7.0f, 4.0f);
            eVar6.u(9.0f);
            eVar6.H(14.0f);
            eVar6.k();
            i2.e.a(eVar5, (ArrayList) eVar6.f5001a, z0Var4);
            fVarB2 = eVar5.b();
            u1.b.f16563c = fVarB2;
        }
        f fVar2 = new f(fVarB2, "Liquid Glass app icons", "A glass surface behind every icon on your home.");
        i2.f fVarB3 = u3.c.f16594a;
        if (fVarB3 == null) {
            i2.e eVar7 = new i2.e("Outlined.Bolt", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i12 = h0.f8270a;
            z0 z0Var5 = new z0(c2.w.f3052b);
            d8.e eVar8 = new d8.e(9);
            eVar8.x(11.0f, 21.0f);
            eVar8.u(-1.0f);
            eVar8.w(1.0f, -7.0f);
            eVar8.t(7.5f);
            eVar8.o(-0.88f, 0.0f, -0.33f, -0.75f, -0.31f, -0.78f);
            eVar8.n(8.48f, 10.94f, 10.42f, 7.54f, 13.01f, 3.0f);
            eVar8.u(1.0f);
            eVar8.w(-1.0f, 7.0f);
            eVar8.u(3.51f);
            eVar8.o(0.4f, 0.0f, 0.62f, 0.19f, 0.4f, 0.66f);
            eVar8.n(12.97f, 17.55f, 11.0f, 21.0f, 11.0f, 21.0f);
            eVar8.k();
            i2.e.a(eVar7, (ArrayList) eVar8.f5001a, z0Var5);
            fVarB3 = eVar7.b();
            u3.c.f16594a = fVarB3;
        }
        f fVar3 = new f(fVarB3, "Ultra graphics quality", "Unlock the highest fidelity preset.");
        i2.f fVarB4 = u0.b.f16479e;
        if (fVarB4 == null) {
            i2.e eVar9 = new i2.e("Outlined.Brush", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i13 = h0.f8270a;
            z0 z0Var6 = new z0(c2.w.f3052b);
            d8.e eVar10 = new d8.e(9);
            eVar10.x(7.0f, 16.0f);
            eVar10.o(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
            eVar10.o(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
            eVar10.o(-0.17f, 0.0f, -0.33f, -0.02f, -0.5f, -0.05f);
            eVar10.o(0.31f, -0.55f, 0.5f, -1.21f, 0.5f, -1.95f);
            eVar10.o(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
            eVar10.x(18.67f, 3.0f);
            eVar10.o(-0.26f, 0.0f, -0.51f, 0.1f, -0.71f, 0.29f);
            eVar10.v(9.0f, 12.25f);
            eVar10.v(11.75f, 15.0f);
            eVar10.w(8.96f, -8.96f);
            eVar10.o(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
            eVar10.w(-1.34f, -1.34f);
            eVar10.o(-0.2f, -0.2f, -0.45f, -0.29f, -0.7f, -0.29f);
            eVar10.k();
            eVar10.x(7.0f, 14.0f);
            eVar10.o(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
            eVar10.o(0.0f, 1.31f, -1.16f, 2.0f, -2.0f, 2.0f);
            eVar10.o(0.92f, 1.22f, 2.49f, 2.0f, 4.0f, 2.0f);
            eVar10.o(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
            eVar10.o(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
            eVar10.k();
            i2.e.a(eVar9, (ArrayList) eVar10.f5001a, z0Var6);
            fVarB4 = eVar9.b();
            u0.b.f16479e = fVarB4;
        }
        f fVar4 = new f(fVarB4, "Theme uploads", "Share your themes \u00e2\u20ac\u201d and use the community's.");
        i2.f fVarB5 = u1.d.f16568b;
        if (fVarB5 == null) {
            i2.e eVar11 = new i2.e("Outlined.CloudSync", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i14 = h0.f8270a;
            z0 z0Var7 = new z0(c2.w.f3052b);
            d8.e eVar12 = new d8.e(9);
            eVar12.x(21.5f, 14.98f);
            eVar12.o(-0.02f, 0.0f, -0.03f, 0.0f, -0.05f, 0.01f);
            eVar12.n(21.2f, 13.3f, 19.76f, 12.0f, 18.0f, 12.0f);
            eVar12.o(-1.4f, 0.0f, -2.6f, 0.83f, -3.16f, 2.02f);
            eVar12.n(13.26f, 14.1f, 12.0f, 15.4f, 12.0f, 17.0f);
            eVar12.o(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
            eVar12.w(6.5f, -0.02f);
            eVar12.o(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
            eVar12.C(22.88f, 14.98f, 21.5f, 14.98f);
            eVar12.k();
            eVar12.x(21.51f, 18.0f);
            eVar12.v(21.51f, 18.0f);
            eVar12.v(15.0f, 18.0f);
            eVar12.o(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
            eVar12.D(0.45f, -1.0f, 1.0f, -1.0f);
            eVar12.u(1.25f);
            eVar12.H(-0.25f);
            eVar12.o(0.0f, -0.97f, 0.78f, -1.75f, 1.75f, -1.75f);
            eVar12.D(1.75f, 0.78f, 1.75f, 1.75f);
            eVar12.G(17.0f);
            eVar12.o(0.0f, 0.0f, 1.75f, 0.0f, 1.76f, 0.0f);
            eVar12.o(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
            eVar12.n(22.0f, 17.77f, 21.78f, 18.0f, 21.51f, 18.0f);
            eVar12.k();
            eVar12.x(10.0f, 4.26f);
            eVar12.H(2.09f);
            eVar12.n(7.67f, 7.18f, 6.0f, 9.39f, 6.0f, 12.0f);
            eVar12.o(0.0f, 1.77f, 0.78f, 3.34f, 2.0f, 4.44f);
            eVar12.G(14.0f);
            eVar12.u(2.0f);
            eVar12.H(6.0f);
            eVar12.t(4.0f);
            eVar12.H(-2.0f);
            eVar12.u(2.73f);
            eVar12.n(5.06f, 16.54f, 4.0f, 14.4f, 4.0f, 12.0f);
            eVar12.n(4.0f, 8.27f, 6.55f, 5.15f, 10.0f, 4.26f);
            eVar12.k();
            eVar12.x(20.0f, 6.0f);
            eVar12.u(-2.73f);
            eVar12.o(1.43f, 1.26f, 2.41f, 3.01f, 2.66f, 5.0f);
            eVar12.w(-2.02f, 0.0f);
            eVar12.n(17.68f, 9.64f, 16.98f, 8.45f, 16.0f, 7.56f);
            eVar12.G(10.0f);
            eVar12.u(-2.0f);
            eVar12.G(4.0f);
            eVar12.u(6.0f);
            eVar12.G(6.0f);
            eVar12.k();
            i2.e.a(eVar11, (ArrayList) eVar12.f5001a, z0Var7);
            fVarB5 = eVar11.b();
            u1.d.f16568b = fVarB5;
        }
        f fVar5 = new f(fVarB5, "Cross-device license", "Your Pro on every device you sign in to.");
        i2.f fVarB6 = u2.b.f16589c;
        if (fVarB6 == null) {
            i2.e eVar13 = new i2.e("Outlined.Star", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i15 = h0.f8270a;
            z0 z0Var8 = new z0(c2.w.f3052b);
            d8.e eVar14 = new d8.e(9);
            eVar14.x(12.0f, 17.27f);
            eVar14.v(18.18f, 21.0f);
            eVar14.w(-1.64f, -7.03f);
            eVar14.v(22.0f, 9.24f);
            eVar14.w(-7.19f, -0.61f);
            eVar14.v(12.0f, 2.0f);
            eVar14.v(9.19f, 8.63f);
            eVar14.v(2.0f, 9.24f);
            eVar14.w(5.46f, 4.73f);
            eVar14.v(5.82f, 21.0f);
            eVar14.v(12.0f, 17.27f);
            eVar14.k();
            i2.e.a(eVar13, (ArrayList) eVar14.f5001a, z0Var8);
            fVarB6 = eVar13.b();
            u2.b.f16589c = fVarB6;
        }
        f12084l = qi.k.c0(new f[]{fVar, fVar2, fVar3, fVar4, fVar5, new f(fVarB6, "Everything coming next", "New Pro features ship to you automatically.")});
    }

    public static final void a(String str, boolean z2, ej.a aVar, i0 i0Var, int i10) {
        boolean z10;
        i0 i0Var2 = i0Var;
        i0Var2.c0(437675998);
        int i11 = i10 | (i0Var2.f(str) ? 4 : 2) | (i0Var2.g(z2) ? 32 : 16) | (i0Var2.h(aVar) ? 256 : 128);
        if (i0Var2.T(i11 & 1, (i11 & 147) != 146)) {
            ga.c cVar = new ga.c(28, 1);
            v1.l lVar = v1.l.f17564b;
            v1.o oVarE = v.n.e(z1.h.c(t1.e(56, t1.c(1.0f, lVar)), cVar), new j0(qi.k.c0(new c2.w[]{new c2.w(e0.d(4294967295L)), new c2.w(e0.d(4293059310L))}), null, 0L, 9187343241974906880L));
            Object objQ = i0Var2.Q();
            if (objQ == f1.m.f6385a) {
                objQ = m1.p(i0Var2);
            }
            v1.o oVarK = v.n.k(oVarE, (z.k) objQ, null, !z2, null, aVar, 24);
            q0 q0VarD = b0.r.d(v1.b.f17551e, false);
            int iHashCode = Long.hashCode(i0Var2.T);
            n1 n1VarL = i0Var2.l();
            v1.o oVarC = v1.a.c(i0Var2, oVarK);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var2, q0VarD);
            f1.s.M(v2.g.f17648e, i0Var2, n1VarL);
            f1.s.w(i0Var2, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var2);
            f1.s.M(v2.g.f17647d, i0Var2, oVarC);
            if (z2) {
                i0Var2.b0(239433877);
                x4.a(t1.k(22, lVar), e0.d(4278848015L), (float) 2.5d, 0L, 0, 0.0f, i0Var2, 438, 56);
                i0Var2.p(false);
                z10 = true;
            } else {
                i0Var2.b0(239631471);
                z10 = true;
                v7.a(str, null, e0.d(4278848015L), hj.a.x(17), k3.s.A, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, (i11 & 14) | 1597824, 0, 262058);
                i0Var2 = i0Var;
                i0Var2.p(false);
            }
            i0Var2.p(z10);
        } else {
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new u0(str, z2, aVar, i10, 1);
        }
    }

    public static final void b(String str, i0 i0Var, int i10) {
        i0 i0Var2 = i0Var;
        i0Var2.c0(307020394);
        int i11 = i10 | (i0Var2.f(str) ? 4 : 2);
        if (i0Var2.T(i11 & 1, (i11 & 3) != 2)) {
            float f10 = 27;
            v1.o oVarU = b0.d.u(v.n.h(v.n.f(y8.f.c(f10, t1.c(1.0f, v1.l.f17564b)), e0.c(872364848), e0.f2986b), 1, e0.c(1442790192), new ga.c(f10, 1)), 14, 10);
            q1 q1VarA = o1.a(b0.j.f1359a, v1.b.D, i0Var2, 48);
            int iHashCode = Long.hashCode(i0Var2.T);
            n1 n1VarL = i0Var2.l();
            v1.o oVarC = v1.a.c(i0Var2, oVarU);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var2, q1VarA);
            f1.s.M(v2.g.f17648e, i0Var2, n1VarL);
            f1.s.w(i0Var2, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var2);
            f1.s.M(v2.g.f17647d, i0Var2, oVarC);
            v7.a(str, null, e0.d(4294948014L), hj.a.x(12), null, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, (i11 & 14) | 24960, 0, 262122);
            i0Var2 = i0Var;
            i0Var2.p(true);
        } else {
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new lb.z0(str, i10, 3);
        }
    }

    public static final void c(gi.d dVar, i0 i0Var, int i10) {
        i0Var.c0(-2041738917);
        int i11 = (i0Var.f(dVar) ? 4 : 2) | i10;
        if (i0Var.T(i11 & 1, (i11 & 3) != 2)) {
            ga.c cVar = new ga.c(28, 1);
            float f10 = 1.0f;
            v1.l lVar = v1.l.f17564b;
            v1.o oVarC = z1.h.c(gi.f.a(t1.c(1.0f, lVar), dVar), cVar);
            long jC = e0.c(184549375);
            c2.q0 q0Var = e0.f2986b;
            v1.o oVarF = v.n.f(oVarC, jC, q0Var);
            float f11 = 1;
            long j4 = f12077d;
            v1.o oVarV = b0.d.v(v.n.h(oVarF, f11, j4, cVar), 0.0f, 6, 1);
            b0 b0VarA = b0.z.a(b0.j.f1361c, v1.b.E, i0Var, 0);
            int iHashCode = Long.hashCode(i0Var.T);
            n1 n1VarL = i0Var.l();
            v1.o oVarC2 = v1.a.c(i0Var, oVarV);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar);
            } else {
                i0Var.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var, b0VarA);
            f1.s.M(v2.g.f17648e, i0Var, n1VarL);
            f1.s.w(i0Var, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var);
            f1.s.M(v2.g.f17647d, i0Var, oVarC2);
            i0Var.b0(1633735952);
            List list = f12084l;
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    yd.f.i0();
                    throw null;
                }
                d((f) obj, i0Var, 0);
                if (i12 < yd.f.B(list)) {
                    i0Var.b0(-1539542935);
                    b0.r.a(v.n.f(z1.h.c(b0.d.v(t1.e(f11, t1.c(f10, lVar)), 60, 0.0f, 2), j0.e.f8605a), j4, q0Var), i0Var, 0);
                    i0Var.p(false);
                } else {
                    i0Var.b0(-1539241181);
                    i0Var.p(false);
                }
                i12 = i13;
                f10 = 1.0f;
            }
            i0Var.p(false);
            i0Var.p(true);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new g2(i10, 19, dVar);
        }
    }

    public static final void d(f fVar, i0 i0Var, int i10) {
        i0 i0Var2 = i0Var;
        i0Var2.c0(-1645896061);
        int i11 = i10 | (i0Var2.f(fVar) ? 4 : 2);
        if (i0Var2.T(i11 & 1, (i11 & 3) != 2)) {
            v1.l lVar = v1.l.f17564b;
            float f10 = 14;
            v1.o oVarU = b0.d.u(t1.c(1.0f, lVar), 16, f10);
            q1 q1VarA = o1.a(b0.j.f1359a, v1.b.D, i0Var2, 48);
            int iHashCode = Long.hashCode(i0Var2.T);
            n1 n1VarL = i0Var2.l();
            v1.o oVarC = v1.a.c(i0Var2, oVarU);
            v2.h.f17668w.getClass();
            v2.f fVar2 = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar2);
            } else {
                i0Var2.o0();
            }
            v2.e eVar = v2.g.f17649f;
            f1.s.M(eVar, i0Var2, q1VarA);
            v2.e eVar2 = v2.g.f17648e;
            f1.s.M(eVar2, i0Var2, n1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            v2.e eVar3 = v2.g.f17650g;
            f1.s.w(i0Var2, numValueOf, eVar3);
            v2.d dVar = v2.g.f17651h;
            f1.s.I(dVar, i0Var2);
            v2.e eVar4 = v2.g.f17647d;
            f1.s.M(eVar4, i0Var2, oVarC);
            i2.f fVar3 = fVar.f11995a;
            v1.o oVarK = t1.k(24, lVar);
            long j4 = f12078e;
            a2.b(fVar3, null, oVarK, j4, i0Var2, 3504, 0);
            b0.d.e(i0Var2, t1.o(f10, lVar));
            if (1.0f <= 0.0d) {
                c0.a.a("invalid weight; must be greater than zero");
            }
            y0 y0Var = new y0(1.0f, true);
            b0 b0VarA = b0.z.a(b0.j.f1361c, v1.b.E, i0Var2, 0);
            int iHashCode2 = Long.hashCode(i0Var2.T);
            n1 n1VarL2 = i0Var2.l();
            v1.o oVarC2 = v1.a.c(i0Var2, y0Var);
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar2);
            } else {
                i0Var2.o0();
            }
            f1.s.M(eVar, i0Var2, b0VarA);
            f1.s.M(eVar2, i0Var2, n1VarL2);
            gk.b.t(iHashCode2, i0Var2, eVar3, i0Var2, dVar);
            f1.s.M(eVar4, i0Var2, oVarC2);
            v7.a(fVar.f11996b, null, j4, hj.a.x(15), k3.s.A, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, 1597824, 0, 262058);
            b0.d.e(i0Var, t1.e(2, lVar));
            v7.a(fVar.f11997c, null, f12080g, hj.a.x(12), null, null, 0L, null, hj.a.x(16), 0, false, 0, 0, null, i0Var, 24960, 48, 260074);
            i0Var2 = i0Var;
            i0Var2.p(true);
            b0.d.e(i0Var2, t1.o(12, lVar));
            v1.o oVarE = v.n.e(z1.h.c(t1.k(22, lVar), j0.e.f8605a), new j0(qi.k.c0(new c2.w[]{new c2.w(e0.d(4290365439L)), new c2.w(e0.d(4285500927L))}), null, 0L, 9187343241974906880L));
            q0 q0VarD = b0.r.d(v1.b.f17551e, false);
            int iHashCode3 = Long.hashCode(i0Var2.T);
            n1 n1VarL3 = i0Var2.l();
            v1.o oVarC3 = v1.a.c(i0Var2, oVarE);
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar2);
            } else {
                i0Var2.o0();
            }
            f1.s.M(eVar, i0Var2, q0VarD);
            f1.s.M(eVar2, i0Var2, n1VarL3);
            gk.b.t(iHashCode3, i0Var2, eVar3, i0Var2, dVar);
            f1.s.M(eVar4, i0Var2, oVarC3);
            a2.b(u0.c.l(), null, t1.k(13, lVar), e0.d(4278848015L), i0Var2, 3504, 0);
            i0Var2.p(true);
            i0Var2.p(true);
        } else {
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new g2(i10, 20, fVar);
        }
    }

    public static final void e(int i10, i0 i0Var) {
        i0 i0Var2 = i0Var;
        i0Var2.c0(1113937009);
        if (i0Var2.T(i10 & 1, i10 != 0)) {
            Context context = (Context) i0Var2.j(AndroidCompositionLocals_androidKt.f838b);
            Object objQ = i0Var2.Q();
            f1.f fVar = f1.m.f6385a;
            if (objQ == fVar) {
                try {
                    Drawable applicationIcon = context.getPackageManager().getApplicationIcon(context.getPackageName());
                    fj.l.e(applicationIcon, "getApplicationIcon(...)");
                    int intrinsicWidth = applicationIcon.getIntrinsicWidth();
                    if (intrinsicWidth < 1) {
                        intrinsicWidth = 1;
                    }
                    int intrinsicHeight = applicationIcon.getIntrinsicHeight();
                    if (intrinsicHeight < 1) {
                        intrinsicHeight = 1;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                    fj.l.e(bitmapCreateBitmap, "createBitmap(...)");
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    applicationIcon.draw(canvas);
                    objQ = new c2.g(bitmapCreateBitmap);
                } catch (Exception unused) {
                    objQ = null;
                }
                i0Var2.l0(objQ);
            }
            c2.g gVar = (c2.g) objQ;
            v1.e eVar = v1.b.F;
            v1.l lVar = v1.l.f17564b;
            v1.o oVarC = t1.c(1.0f, lVar);
            b0 b0VarA = b0.z.a(b0.j.f1361c, eVar, i0Var2, 48);
            int iHashCode = Long.hashCode(i0Var2.T);
            n1 n1VarL = i0Var2.l();
            v1.o oVarC2 = v1.a.c(i0Var2, oVarC);
            v2.h.f17668w.getClass();
            v2.f fVar2 = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar2);
            } else {
                i0Var2.o0();
            }
            v2.e eVar2 = v2.g.f17649f;
            f1.s.M(eVar2, i0Var2, b0VarA);
            v2.e eVar3 = v2.g.f17648e;
            f1.s.M(eVar3, i0Var2, n1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            v2.e eVar4 = v2.g.f17650g;
            f1.s.w(i0Var2, numValueOf, eVar4);
            v2.d dVar = v2.g.f17651h;
            f1.s.I(dVar, i0Var2);
            v2.e eVar5 = v2.g.f17647d;
            f1.s.M(eVar5, i0Var2, oVarC2);
            v1.o oVarK = t1.k(124, lVar);
            Object objQ2 = i0Var2.Q();
            if (objQ2 == fVar) {
                objQ2 = new la.a(21);
                i0Var2.l0(objQ2);
            }
            v1.o oVarE = z1.h.e(oVarK, (ej.c) objQ2);
            q0 q0VarD = b0.r.d(v1.b.f17551e, false);
            int iHashCode2 = Long.hashCode(i0Var2.T);
            n1 n1VarL2 = i0Var2.l();
            v1.o oVarC3 = v1.a.c(i0Var2, oVarE);
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar2);
            } else {
                i0Var2.o0();
            }
            f1.s.M(eVar2, i0Var2, q0VarD);
            f1.s.M(eVar3, i0Var2, n1VarL2);
            gk.b.t(iHashCode2, i0Var2, eVar4, i0Var2, dVar);
            f1.s.M(eVar5, i0Var2, oVarC3);
            if (gVar != null) {
                i0Var2.b0(1810665206);
                v.n.c(gVar, null, t1.k(88, lVar), null, i0Var2, 432, 248);
                i0Var2.p(false);
            } else {
                i0Var2.b0(1810909548);
                i2.f fVarB = u2.b.f16588b;
                if (fVarB == null) {
                    i2.e eVar6 = new i2.e("Outlined.Diamond", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i11 = h0.f8270a;
                    z0 z0Var = new z0(c2.w.f3052b);
                    d8.e eVar7 = new d8.e(9);
                    eVar7.x(19.0f, 3.0f);
                    eVar7.t(5.0f);
                    eVar7.v(2.0f, 9.0f);
                    eVar7.w(10.0f, 12.0f);
                    eVar7.v(22.0f, 9.0f);
                    eVar7.v(19.0f, 3.0f);
                    eVar7.k();
                    eVar7.x(9.62f, 8.0f);
                    eVar7.w(1.5f, -3.0f);
                    eVar7.u(1.76f);
                    eVar7.w(1.5f, 3.0f);
                    eVar7.t(9.62f);
                    eVar7.k();
                    eVar7.x(11.0f, 10.0f);
                    eVar7.H(6.68f);
                    eVar7.v(5.44f, 10.0f);
                    eVar7.t(11.0f);
                    eVar7.k();
                    eVar7.x(13.0f, 10.0f);
                    eVar7.u(5.56f);
                    eVar7.v(13.0f, 16.68f);
                    eVar7.G(10.0f);
                    eVar7.k();
                    eVar7.x(19.26f, 8.0f);
                    eVar7.u(-2.65f);
                    eVar7.w(-1.5f, -3.0f);
                    eVar7.u(2.65f);
                    eVar7.v(19.26f, 8.0f);
                    eVar7.k();
                    eVar7.x(6.24f, 5.0f);
                    eVar7.u(2.65f);
                    eVar7.w(-1.5f, 3.0f);
                    eVar7.t(4.74f);
                    eVar7.v(6.24f, 5.0f);
                    eVar7.k();
                    i2.e.a(eVar6, (ArrayList) eVar7.f5001a, z0Var);
                    fVarB = eVar6.b();
                    u2.b.f16588b = fVarB;
                }
                a2.b(fVarB, null, t1.k(40, lVar), f12082i, i0Var, 3504, 0);
                i0Var2 = i0Var;
                i0Var2.p(false);
            }
            i0Var2.p(true);
            b0.d.e(i0Var2, t1.e(20, lVar));
            long jX = hj.a.x(14);
            k3.s sVar = k3.s.f9400z;
            v7.a("VoidLauncher", t1.c(1.0f, lVar), f12080g, jX, sVar, null, hj.a.x(4), new r3.k(3), 0L, 0, false, 0, 0, null, i0Var, 102261174, 0, 260776);
            b0.d.e(i0Var, t1.e(2, lVar));
            long jX2 = hj.a.x(56);
            k3.s sVar2 = k3.s.B;
            long jW = hj.a.w(-1.5d);
            v1.o oVarC4 = t1.c(1.0f, lVar);
            j0 j0Var = new j0(qi.k.c0(new c2.w[]{new c2.w(e0.d(4294967295L)), new c2.w(e0.d(4290365439L)), new c2.w(e0.d(4286484952L))}), null, 0L, 9187343241974906880L);
            long j4 = s3.o.f14757c;
            v7.a("Pro", oVarC4, f12078e, jX2, sVar2, null, jW, new r3.k(3), 0L, 0, false, 0, 0, new n0(new f0(new r3.b(j0Var, Float.NaN), j4, null, null, null, null, null, j4, null, null, null, c2.w.f3058h, null, null, null, null), new g3.t(0, 0, j4, null, null, null, 0, 0, null), null), i0Var, 1597878, 12582912, 129704);
            b0.d.e(i0Var, t1.e(6, lVar));
            v7.a("Unlock everything", t1.c(1.0f, lVar), f12079f, hj.a.x(13), sVar, null, hj.a.x(3), new r3.k(3), 0L, 0, false, 0, 0, null, i0Var, 102261174, 0, 260776);
            i0Var2 = i0Var;
            i0Var2.p(true);
        } else {
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new lb.d(i10, 18);
        }
    }

    public static final void f(final ej.a aVar, final boolean z2, final i2.f fVar, final String str, i0 i0Var, final int i10) {
        int i11;
        i0 i0Var2;
        i0Var.c0(2011740248);
        if ((i10 & 6) == 0) {
            i11 = i10 | (i0Var.h(aVar) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= i0Var.g(z2) ? 32 : 16;
        }
        int i12 = i11 | (i0Var.f(fVar) ? 256 : 128);
        if (i0Var.T(i12 & 1, (i12 & 1171) != 1170)) {
            v1.l lVar = v1.l.f17564b;
            v1.o oVarF = v.n.f(z1.h.c(t1.k(48, lVar), j0.e.f8605a), c2.w.c(e0.d(4279571739L), 0.68f), e0.f2986b);
            Object objQ = i0Var.Q();
            if (objQ == f1.m.f6385a) {
                objQ = m1.p(i0Var);
            }
            v1.o oVarK = v.n.k(oVarF, (z.k) objQ, null, z2, null, aVar, 24);
            q0 q0VarD = b0.r.d(v1.b.f17551e, false);
            int iHashCode = Long.hashCode(i0Var.T);
            n1 n1VarL = i0Var.l();
            v1.o oVarC = v1.a.c(i0Var, oVarK);
            v2.h.f17668w.getClass();
            v2.f fVar2 = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar2);
            } else {
                i0Var.o0();
            }
            f1.s.M(v2.g.f17649f, i0Var, q0VarD);
            f1.s.M(v2.g.f17648e, i0Var, n1VarL);
            f1.s.w(i0Var, Integer.valueOf(iHashCode), v2.g.f17650g);
            f1.s.I(v2.g.f17651h, i0Var);
            f1.s.M(v2.g.f17647d, i0Var, oVarC);
            i0Var2 = i0Var;
            a2.b(fVar, str, t1.k(24, lVar), z2 ? f12078e : f12081h, i0Var2, ((i12 >> 6) & 14) | 432, 0);
            i0Var2.p(true);
        } else {
            i0Var2 = i0Var;
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e() { // from class: nb.s
                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    v.f(aVar, z2, fVar, str, (i0) obj, f1.s.O(i10 | 1));
                    return pi.o.f13011a;
                }
            };
        }
    }

    public static final void g(final q qVar, final ej.c cVar, final boolean z2, final ej.c cVar2, v1.o oVar, i0 i0Var, int i10) {
        v1.o oVar2;
        i0Var.c0(-1878098832);
        int i11 = i10 | (i0Var.d(qVar.ordinal()) ? 4 : 2) | (i0Var.g(z2) ? 256 : 128);
        if (i0Var.T(i11 & 1, (i11 & 9363) != 9362)) {
            float f10 = 27;
            ga.c cVar3 = new ga.c(f10, 1);
            final ga.c cVar4 = new ga.c(f10, 1);
            final float f11 = 4;
            final long j4 = ha.a.f7749h;
            oVar2 = oVar;
            b0.d.a(v.n.h(v.n.f(z1.h.c(oVar2, cVar3), e0.c(352321535), e0.f2986b), 1, f12077d, cVar3), null, p1.j.d(-672204474, new ej.f() { // from class: nb.r
                @Override // ej.f
                public final Object c(Object obj, Object obj2, Object obj3) {
                    b0.y yVar = (b0.y) obj;
                    i0 i0Var2 = (i0) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    fj.l.f(yVar, "$this$BoxWithConstraints");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= i0Var2.f(yVar) ? 4 : 2;
                    }
                    boolean z10 = (iIntValue & 19) != 18;
                    f2 f2Var = i0Var2.f6313a;
                    if (i0Var2.T(iIntValue & 1, z10)) {
                        float fC = yVar.c();
                        float f12 = 2;
                        float f13 = f11;
                        float f14 = (fC - (f13 * f12)) / f12;
                        q2 q2VarA = t.e.a(qVar == q.f12054b ? f14 : 0, t.d.s(1.0f, 400.0f, null, 4), "plan_thumb_offset", i0Var2, 432, 8);
                        float fO = f14 > 0.0f ? cg.b.o(((s3.f) q2VarA.getValue()).f14742a / f14, 0.0f, 1.0f) : 0.0f;
                        Float fValueOf = Float.valueOf(fO);
                        Object obj4 = cVar2;
                        boolean zF = i0Var2.f(obj4) | i0Var2.c(fO);
                        Object objQ = i0Var2.Q();
                        Object obj5 = f1.m.f6385a;
                        if (zF || objQ == obj5) {
                            objQ = new t(obj4, fO, null, 0);
                            i0Var2.l0(objQ);
                        }
                        f1.s.f((ej.e) objQ, i0Var2, fValueOf);
                        v1.l lVar = v1.l.f17564b;
                        b0.r.a(v.n.f(z1.h.c(t1.e(46, t1.o(f14, b0.d.q(b0.d.x(lVar, f13, f13, 0.0f, 0.0f, 12), ((s3.f) q2VarA.getValue()).f14742a, 0.0f, 2))), cVar4), j4, e0.f2986b), i0Var2, 0);
                        v1.o oVarT = b0.d.t(f13, t1.f1433c);
                        q1 q1VarA = o1.a(b0.j.f1359a, v1.b.C, i0Var2, 0);
                        int iHashCode = Long.hashCode(i0Var2.T);
                        n1 n1VarL = i0Var2.l();
                        v1.o oVarC = v1.a.c(i0Var2, oVarT);
                        v2.h.f17668w.getClass();
                        ej.a aVar = v2.g.f17645b;
                        i0Var2.e0();
                        if (i0Var2.S) {
                            i0Var2.k(aVar);
                        } else {
                            i0Var2.o0();
                        }
                        v2.e eVar = v2.g.f17649f;
                        f1.s.M(eVar, i0Var2, q1VarA);
                        v2.e eVar2 = v2.g.f17648e;
                        f1.s.M(eVar2, i0Var2, n1VarL);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        v2.e eVar3 = v2.g.f17650g;
                        f1.s.w(i0Var2, numValueOf, eVar3);
                        v2.d dVar = v2.g.f17651h;
                        f1.s.I(dVar, i0Var2);
                        v2.e eVar4 = v2.g.f17647d;
                        f1.s.M(eVar4, i0Var2, oVarC);
                        r1 r1Var = r1.f1410a;
                        v1.o oVarA = r1.a(r1Var, lVar);
                        b0.i0 i0Var3 = t1.f1432b;
                        v1.o oVarC2 = oVarA.c(i0Var3);
                        Object objQ2 = i0Var2.Q();
                        if (objQ2 == obj5) {
                            objQ2 = m1.p(i0Var2);
                        }
                        z.k kVar = (z.k) objQ2;
                        ej.c cVar5 = cVar;
                        boolean zF2 = i0Var2.f(cVar5);
                        Object objQ3 = i0Var2.Q();
                        if (zF2 || objQ3 == obj5) {
                            objQ3 = new db.g(cVar5, 5);
                            i0Var2.l0(objQ3);
                        }
                        boolean z11 = z2;
                        v1.o oVarK = v.n.k(oVarC2, kVar, null, z11, null, (ej.a) objQ3, 24);
                        v1.g gVar = v1.b.f17551e;
                        q0 q0VarD = b0.r.d(gVar, false);
                        int iHashCode2 = Long.hashCode(i0Var2.T);
                        n1 n1VarL2 = i0Var2.l();
                        v1.o oVarC3 = v1.a.c(i0Var2, oVarK);
                        i0Var2.e0();
                        if (i0Var2.S) {
                            i0Var2.k(aVar);
                        } else {
                            i0Var2.o0();
                        }
                        f1.s.M(eVar, i0Var2, q0VarD);
                        f1.s.M(eVar2, i0Var2, n1VarL2);
                        gk.b.u(iHashCode2, i0Var2, eVar3, i0Var2, dVar);
                        f1.s.M(eVar4, i0Var2, oVarC3);
                        long jX = hj.a.x(14);
                        k3.s sVar = k3.s.A;
                        long j10 = v.f12078e;
                        v7.a("Monthly", null, j10, jX, sVar, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var2, 1597830, 0, 262058);
                        i0Var2.p(true);
                        v1.o oVarC4 = r1.a(r1Var, lVar).c(i0Var3);
                        Object objQ4 = i0Var2.Q();
                        if (objQ4 == obj5) {
                            objQ4 = m1.p(i0Var2);
                        }
                        z.k kVar2 = (z.k) objQ4;
                        boolean zF3 = i0Var2.f(cVar5);
                        Object objQ5 = i0Var2.Q();
                        if (zF3 || objQ5 == obj5) {
                            objQ5 = new db.g(cVar5, 6);
                            i0Var2.l0(objQ5);
                        }
                        v1.o oVarK2 = v.n.k(oVarC4, kVar2, null, z11, null, (ej.a) objQ5, 24);
                        q0 q0VarD2 = b0.r.d(gVar, false);
                        int iHashCode3 = Long.hashCode(i0Var2.T);
                        n1 n1VarL3 = i0Var2.l();
                        v1.o oVarC5 = v1.a.c(i0Var2, oVarK2);
                        i0Var2.e0();
                        if (i0Var2.S) {
                            i0Var2.k(aVar);
                        } else {
                            i0Var2.o0();
                        }
                        f1.s.M(eVar, i0Var2, q0VarD2);
                        f1.s.M(eVar2, i0Var2, n1VarL3);
                        gk.b.u(iHashCode3, i0Var2, eVar3, i0Var2, dVar);
                        f1.s.M(eVar4, i0Var2, oVarC5);
                        v7.a("Yearly", null, j10, hj.a.x(14), sVar, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var2, 1597830, 0, 262058);
                        i0Var2.p(true);
                        i0Var2.p(true);
                    } else {
                        i0Var2.W();
                    }
                    return pi.o.f13011a;
                }
            }, i0Var), i0Var, 3072, 6);
        } else {
            oVar2 = oVar;
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new k0(qVar, cVar, z2, cVar2, oVar2, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x078b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(ej.a r68, f1.i0 r69, int r70) {
        /*
            Method dump skipped, instructions count: 1987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.v.h(ej.a, f1.i0, int):void");
    }

    public static final void i(String str, i0 i0Var, int i10) {
        i0 i0Var2 = i0Var;
        i0Var2.c0(-2071034347);
        int i11 = i10 | (i0Var2.f(str) ? 4 : 2);
        if (i0Var2.T(i11 & 1, (i11 & 3) != 2)) {
            ga.c cVar = new ga.c(28, 1);
            v1.l lVar = v1.l.f17564b;
            v1.o oVarC = z1.h.c(t1.c(1.0f, lVar), cVar);
            long jC = e0.c(184549375);
            c2.q0 q0Var = e0.f2986b;
            float f10 = 10;
            v1.o oVarU = b0.d.u(v.n.h(v.n.f(oVarC, jC, q0Var), 1, f12077d, cVar), 14, f10);
            q1 q1VarA = o1.a(b0.j.f1359a, v1.b.D, i0Var2, 48);
            int iHashCode = Long.hashCode(i0Var2.T);
            n1 n1VarL = i0Var2.l();
            v1.o oVarC2 = v1.a.c(i0Var2, oVarU);
            v2.h.f17668w.getClass();
            v2.f fVar = v2.g.f17645b;
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            v2.e eVar = v2.g.f17649f;
            f1.s.M(eVar, i0Var2, q1VarA);
            v2.e eVar2 = v2.g.f17648e;
            f1.s.M(eVar2, i0Var2, n1VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            v2.e eVar3 = v2.g.f17650g;
            f1.s.w(i0Var2, numValueOf, eVar3);
            v2.d dVar = v2.g.f17651h;
            f1.s.I(dVar, i0Var2);
            v2.e eVar4 = v2.g.f17647d;
            f1.s.M(eVar4, i0Var2, oVarC2);
            b0.r.a(v.n.f(z1.h.c(t1.k(8, lVar), j0.e.f8605a), e0.d(4281648985L), q0Var), i0Var2, 0);
            b0.d.e(i0Var2, t1.o(f10, lVar));
            if (1.0f <= 0.0d) {
                c0.a.a("invalid weight; must be greater than zero");
            }
            y0 y0Var = new y0(1.0f, true);
            b0 b0VarA = b0.z.a(b0.j.f1361c, v1.b.E, i0Var2, 0);
            int iHashCode2 = Long.hashCode(i0Var2.T);
            n1 n1VarL2 = i0Var2.l();
            v1.o oVarC3 = v1.a.c(i0Var2, y0Var);
            i0Var2.e0();
            if (i0Var2.S) {
                i0Var2.k(fVar);
            } else {
                i0Var2.o0();
            }
            f1.s.M(eVar, i0Var2, b0VarA);
            f1.s.M(eVar2, i0Var2, n1VarL2);
            gk.b.t(iHashCode2, i0Var2, eVar3, i0Var2, dVar);
            f1.s.M(eVar4, i0Var2, oVarC3);
            v7.a("Signed in as", null, f12081h, hj.a.x(11), null, null, hj.a.x(1), null, 0L, 0, false, 0, 0, null, i0Var, 100688262, 0, 261866);
            v7.a(str, null, f12079f, hj.a.x(13), k3.s.f9400z, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var, (i11 & 14) | 1597824, 0, 262058);
            i0Var2 = i0Var;
            i0Var2.p(true);
            i0Var2.p(true);
        } else {
            i0Var2.W();
        }
        f1.t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new lb.z0(str, i10, 2);
        }
    }

    public static final void j(int i10, i0 i0Var) {
        i0Var.c0(-708647999);
        if (i0Var.T(i10 & 1, (i10 & 3) != 2)) {
            v1.o oVarB = b0.w.f1450a.b(t1.e(420, t1.c(1.0f, v1.l.f17564b)), v1.b.f17548b);
            Object objQ = i0Var.Q();
            if (objQ == f1.m.f6385a) {
                objQ = new la.a(20);
                i0Var.l0(objQ);
            }
            b0.r.a(z1.h.e(oVarB, (ej.c) objQ), i0Var, 0);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new lb.d(i10, 17);
        }
    }
}
