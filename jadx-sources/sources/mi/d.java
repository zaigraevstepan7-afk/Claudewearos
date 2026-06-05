package mi;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.Surface;
import f1.i0;
import t.m1;
import v2.h0;
import w2.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class d {
    public static final void a(Surface surface, f2.b bVar, s3.c cVar, e2.b bVar2) {
        Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
        try {
            fj.l.c(canvasLockHardwareCanvas);
            canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            e2.a aVar = bVar2.f5737a;
            s3.m mVar = aVar.f5734b;
            Canvas canvas = c2.c.f2968a;
            c2.b bVar3 = new c2.b();
            bVar3.f2965a = canvasLockHardwareCanvas;
            float width = canvasLockHardwareCanvas.getWidth();
            float height = canvasLockHardwareCanvas.getHeight();
            long jFloatToRawIntBits = (Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
            s3.c cVar2 = aVar.f5733a;
            s3.m mVar2 = aVar.f5734b;
            c2.u uVar = aVar.f5735c;
            long j = aVar.f5736d;
            aVar.f5733a = cVar;
            aVar.f5734b = mVar;
            aVar.f5735c = bVar3;
            aVar.f5736d = jFloatToRawIntBits;
            bVar3.f();
            u6.v.C(bVar2, bVar);
            bVar3.q();
            aVar.f5733a = cVar2;
            aVar.f5734b = mVar2;
            aVar.f5735c = uVar;
            aVar.f5736d = j;
        } finally {
            surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
    }

    public static final f2.b b(h0 h0Var, final i iVar, final float f10, long j, final long j4) {
        long jK = cg.b.K(b2.e.g(j, f10));
        if (((int) (jK >> 32)) <= 0 || ((int) (4294967295L & jK)) <= 0) {
            return null;
        }
        f2.b bVarB = ((c2.b0) v2.n.h(iVar, f1.f18261g)).b();
        h0Var.n0(bVarB, jK, new ej.c() { // from class: mi.b
            /* JADX WARN: Finally extract failed */
            /* JADX WARN: Removed duplicated region for block: B:111:0x0226  */
            /* JADX WARN: Removed duplicated region for block: B:115:0x022d A[Catch: all -> 0x0229, TRY_LEAVE, TryCatch #4 {all -> 0x0229, blocks: (B:100:0x020b, B:102:0x0211, B:107:0x021a, B:109:0x0221, B:115:0x022d), top: B:149:0x020b, outer: #5 }] */
            /* JADX WARN: Removed duplicated region for block: B:130:0x0268  */
            /* JADX WARN: Removed duplicated region for block: B:156:0x016d A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:161:0x026c A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:164:0x01ad A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x012a A[Catch: all -> 0x0123, TRY_LEAVE, TryCatch #1 {all -> 0x0123, blocks: (B:35:0x0103, B:37:0x0109, B:42:0x0112, B:44:0x011b, B:51:0x012a), top: B:144:0x0103, outer: #3 }] */
            /* JADX WARN: Removed duplicated region for block: B:66:0x0166  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x016a A[Catch: all -> 0x00b6, TryCatch #3 {all -> 0x00b6, blocks: (B:12:0x0090, B:13:0x0096, B:15:0x009c, B:17:0x00a6, B:19:0x00ac, B:24:0x00bc, B:30:0x00d3, B:32:0x00e2, B:34:0x00ea, B:52:0x012d, B:53:0x013b, B:54:0x0148, B:55:0x0149, B:57:0x0151, B:62:0x015a, B:64:0x0161, B:68:0x016a, B:71:0x0176, B:72:0x0179, B:73:0x017a, B:74:0x017f, B:35:0x0103, B:37:0x0109, B:42:0x0112, B:44:0x011b, B:51:0x012a, B:25:0x00c0), top: B:148:0x0090, outer: #5, inners: #1, #2 }] */
            @Override // ej.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r37) {
                /*
                    Method dump skipped, instructions count: 646
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: mi.b.invoke(java.lang.Object):java.lang.Object");
            }
        });
        return bVarB;
    }

    public static final void c(h0 h0Var) throws Exception {
        try {
            h0Var.f();
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "";
            }
            if (!nj.e.C0(message, "mViewFlags", false) && !nj.e.C0(message, "LayoutNode", false)) {
                throw e10;
            }
        }
    }

    public static final void d(e2.d dVar, long j, long j4, boolean z2, ej.c cVar) {
        ac.d dVarC0;
        long jY;
        fj.l.f(dVar, "$this$drawScaledContent");
        float fMax = Math.max(Float.intBitsToFloat((int) (dVar.a() >> 32)) / Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (dVar.a() & 4294967295L)) / Float.intBitsToFloat((int) (j4 & 4294967295L)));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.a() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar.a() & 4294967295L));
        ac.d dVarC02 = dVar.C0();
        long jY2 = dVarC02.y();
        dVarC02.h().f();
        try {
            ld.i iVar = (ld.i) dVarC02.f373b;
            if (z2) {
                iVar.w(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
            }
            if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0 || b2.b.c(j, 0L)) {
                dVarC0 = dVar.C0();
                jY = dVarC0.y();
                dVarC0.h().f();
                try {
                    ((ld.i) dVarC0.f373b).S(fMax, fMax, 0L);
                    cVar.invoke(dVar);
                } finally {
                }
            } else {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
                ((ld.i) dVar.C0().f373b).U(fIntBitsToFloat3, fIntBitsToFloat4);
                try {
                    dVarC0 = dVar.C0();
                    jY = dVarC0.y();
                    dVarC0.h().f();
                    try {
                        ((ld.i) dVarC0.f373b).S(fMax, fMax, 0L);
                        cVar.invoke(dVar);
                        dVarC0.h().q();
                        dVarC0.Q(jY);
                    } finally {
                    }
                } finally {
                    ((ld.i) dVar.C0().f373b).U(-fIntBitsToFloat3, -fIntBitsToFloat4);
                }
            }
            m1.r(dVarC02, jY2);
        } catch (Throwable th2) {
            m1.r(dVarC02, jY2);
            throw th2;
        }
    }

    public static final void e(e2.d dVar, s sVar, v2.i iVar, long j, long j4) {
        fj.l.f(dVar, "$this$drawScrim");
        fj.l.f(sVar, "tint");
        c2.s sVar2 = sVar.f11784c;
        if (sVar2 != null) {
            e2.d.P(dVar, sVar2, j, dVar.a(), 0.0f, null, null, sVar.f11783b, 56);
        } else {
            e2.d.c1(dVar, sVar.f11782a, 0L, j4, 0.0f, null, sVar.f11783b, 58);
        }
    }

    public static v1.o f(v1.o oVar, p pVar, q qVar) {
        fj.l.f(oVar, "<this>");
        fj.l.f(qVar, "style");
        return oVar.c(new j(pVar, qVar));
    }

    public static final p g(i0 i0Var) {
        float f10 = e.f11753a;
        boolean z2 = Build.VERSION.SDK_INT >= 31;
        Object objQ = i0Var.Q();
        if (objQ == f1.m.f6385a) {
            objQ = new p(z2);
            i0Var.l0(objQ);
        }
        p pVar = (p) objQ;
        pVar.f11772b.setValue(Boolean.valueOf(z2));
        return pVar;
    }

    public static final BlendMode h(int i10) {
        return i10 == 0 ? BlendMode.CLEAR : i10 == 27 ? BlendMode.COLOR : i10 == 19 ? BlendMode.COLOR_BURN : i10 == 18 ? BlendMode.COLOR_DODGE : i10 == 16 ? BlendMode.DARKEN : i10 == 22 ? BlendMode.DIFFERENCE : i10 == 2 ? BlendMode.DST : i10 == 10 ? BlendMode.DST_ATOP : i10 == 6 ? BlendMode.DST_IN : i10 == 8 ? BlendMode.DST_OUT : i10 == 4 ? BlendMode.DST_OVER : i10 == 23 ? BlendMode.EXCLUSION : i10 == 20 ? BlendMode.HARD_LIGHT : i10 == 25 ? BlendMode.HUE : i10 == 17 ? BlendMode.LIGHTEN : i10 == 28 ? BlendMode.LUMINOSITY : i10 == 13 ? BlendMode.MODULATE : i10 == 24 ? BlendMode.MULTIPLY : i10 == 15 ? BlendMode.OVERLAY : i10 == 26 ? BlendMode.SATURATION : i10 == 14 ? BlendMode.SCREEN : i10 == 21 ? BlendMode.SOFT_LIGHT : i10 == 1 ? BlendMode.SRC : i10 == 9 ? BlendMode.SRC_ATOP : i10 == 5 ? BlendMode.SRC_IN : i10 == 7 ? BlendMode.SRC_OUT : i10 == 3 ? BlendMode.SRC_OVER : BlendMode.SRC_IN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [pi.j] */
    public static final void i(i iVar, h0 h0Var) {
        b0 b0VarR;
        boolean z2 = Build.VERSION.SDK_INT >= 31 && c2.c.a(h0Var.f17669a.f5738b.h()).isHardwareAccelerated();
        boolean zC = k.c(iVar);
        if (zC && z2) {
            a vVar = iVar.f11762b0;
            if (!(vVar instanceof v)) {
                vVar = new v(iVar);
            }
            iVar.u1(vVar);
            return;
        }
        if (zC) {
            a aVar = iVar.f11762b0;
            if (!(aVar instanceof b0)) {
                if (b0.f11729h) {
                    try {
                        b0VarR = new b0(iVar);
                    } catch (Throwable th2) {
                        b0VarR = uk.c.r(th2);
                    }
                    if (pi.k.a(b0VarR) != null) {
                        b0.f11729h = false;
                    }
                    b0Var = b0VarR instanceof pi.j ? null : b0VarR;
                }
                aVar = b0Var;
            }
            if (aVar != null) {
                iVar.u1(aVar);
                return;
            }
        }
        if (iVar.f11762b0 instanceof e0) {
            return;
        }
        iVar.u1(new e0(iVar));
    }
}
