package v;

import android.graphics.Canvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o0 extends v2.k implements v2.m {
    public final /* synthetic */ int J = 1;
    public final i K;
    public final h0 L;
    public Object M;

    public o0(p2.p0 p0Var, i iVar, h0 h0Var) {
        this.K = iVar;
        this.L = h0Var;
        q1(p0Var);
    }

    public static boolean t1(float f10, EdgeEffect edgeEffect, Canvas canvas) {
        if (f10 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f10);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public static boolean u1(float f10, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f10);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01f8 A[PHI: r16
      0x01f8: PHI (r16v5 boolean) = (r16v4 boolean), (r16v15 boolean) binds: [B:94:0x01ae, B:102:0x01c9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // v2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O0(v2.h0 r25) {
        /*
            Method dump skipped, instructions count: 1240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.o0.O0(v2.h0):void");
    }

    public RenderNode v1() {
        RenderNode renderNode = (RenderNode) this.M;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeC = z1.c();
        this.M = renderNodeC;
        return renderNodeC;
    }

    public o0(p2.p0 p0Var, i iVar, h0 h0Var, b0.i1 i1Var) {
        this.K = iVar;
        this.L = h0Var;
        this.M = i1Var;
        q1(p0Var);
    }
}
