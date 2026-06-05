package f2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import c2.e0;
import c2.n;
import c2.r0;
import c2.u;
import c2.v;
import c2.w;
import c2.x0;
import java.util.concurrent.atomic.AtomicBoolean;
import s3.m;
import w2.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e implements d {
    public static final AtomicBoolean D = new AtomicBoolean(true);
    public boolean A;
    public boolean B;
    public r0 C;

    /* renamed from: b, reason: collision with root package name */
    public final v f6539b;

    /* renamed from: c, reason: collision with root package name */
    public final e2.b f6540c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f6541d;

    /* renamed from: e, reason: collision with root package name */
    public long f6542e;

    /* renamed from: f, reason: collision with root package name */
    public Paint f6543f;

    /* renamed from: g, reason: collision with root package name */
    public Matrix f6544g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6545h;

    /* renamed from: i, reason: collision with root package name */
    public long f6546i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f6547k;

    /* renamed from: l, reason: collision with root package name */
    public n f6548l;

    /* renamed from: m, reason: collision with root package name */
    public float f6549m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f6550n;

    /* renamed from: o, reason: collision with root package name */
    public float f6551o;

    /* renamed from: p, reason: collision with root package name */
    public float f6552p;

    /* renamed from: q, reason: collision with root package name */
    public float f6553q;

    /* renamed from: r, reason: collision with root package name */
    public float f6554r;

    /* renamed from: s, reason: collision with root package name */
    public float f6555s;

    /* renamed from: t, reason: collision with root package name */
    public long f6556t;

    /* renamed from: u, reason: collision with root package name */
    public long f6557u;

    /* renamed from: v, reason: collision with root package name */
    public float f6558v;

    /* renamed from: w, reason: collision with root package name */
    public float f6559w;

    /* renamed from: x, reason: collision with root package name */
    public float f6560x;

    /* renamed from: y, reason: collision with root package name */
    public float f6561y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f6562z;

    public e(t tVar, v vVar, e2.b bVar) {
        this.f6539b = vVar;
        this.f6540c = bVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", tVar);
        this.f6541d = renderNodeCreate;
        this.f6542e = 0L;
        this.f6546i = 0L;
        if (D.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                k.c(renderNodeCreate, k.a(renderNodeCreate));
                k.d(renderNodeCreate, k.b(renderNodeCreate));
            }
            j.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        Q(0);
        this.j = 0;
        this.f6547k = 3;
        this.f6549m = 1.0f;
        this.f6551o = 1.0f;
        this.f6552p = 1.0f;
        long j = w.f3052b;
        this.f6556t = j;
        this.f6557u = j;
        this.f6561y = 8.0f;
    }

    @Override // f2.d
    public final n A() {
        return this.f6548l;
    }

    @Override // f2.d
    public final float B() {
        return this.f6559w;
    }

    @Override // f2.d
    public final boolean C() {
        return this.f6541d.isValid();
    }

    @Override // f2.d
    public final float D() {
        return this.f6560x;
    }

    @Override // f2.d
    public final void E(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.f6550n = true;
            this.f6541d.setPivotX(((int) (this.f6542e >> 32)) / 2.0f);
            this.f6541d.setPivotY(((int) (4294967295L & this.f6542e)) / 2.0f);
        } else {
            this.f6550n = false;
            this.f6541d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.f6541d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // f2.d
    public final long F() {
        return this.f6556t;
    }

    @Override // f2.d
    public final void G(u uVar) {
        DisplayListCanvas displayListCanvasA = c2.c.a(uVar);
        fj.l.d(displayListCanvasA, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        displayListCanvasA.drawRenderNode(this.f6541d);
    }

    @Override // f2.d
    public final float H() {
        return this.f6554r;
    }

    @Override // f2.d
    public final long I() {
        return this.f6557u;
    }

    @Override // f2.d
    public final void J(s3.c cVar, m mVar, b bVar, x0 x0Var) {
        Canvas canvasStart = this.f6541d.start(Math.max((int) (this.f6542e >> 32), (int) (this.f6546i >> 32)), Math.max((int) (this.f6542e & 4294967295L), (int) (this.f6546i & 4294967295L)));
        try {
            c2.b bVar2 = this.f6539b.f3047a;
            Canvas canvas = bVar2.f2965a;
            bVar2.f2965a = canvasStart;
            e2.b bVar3 = this.f6540c;
            ac.d dVar = bVar3.f5738b;
            long jS = cg.b.S(this.f6542e);
            s3.c cVarK = dVar.k();
            m mVarS = dVar.s();
            u uVarH = dVar.h();
            long jY = dVar.y();
            b bVar4 = (b) dVar.f374c;
            dVar.O(cVar);
            dVar.P(mVar);
            dVar.N(bVar2);
            dVar.Q(jS);
            dVar.f374c = bVar;
            bVar2.f();
            try {
                x0Var.invoke(bVar3);
                bVar2.q();
                dVar.O(cVarK);
                dVar.P(mVarS);
                dVar.N(uVarH);
                dVar.Q(jY);
                dVar.f374c = bVar4;
                bVar2.f2965a = canvas;
                this.f6541d.end(canvasStart);
            } catch (Throwable th2) {
                bVar2.q();
                ac.d dVar2 = bVar3.f5738b;
                dVar2.O(cVarK);
                dVar2.P(mVarS);
                dVar2.N(uVarH);
                dVar2.Q(jY);
                dVar2.f374c = bVar4;
                throw th2;
            }
        } catch (Throwable th3) {
            this.f6541d.end(canvasStart);
            throw th3;
        }
    }

    @Override // f2.d
    public final float K() {
        return this.f6561y;
    }

    @Override // f2.d
    public final float L() {
        return this.f6553q;
    }

    @Override // f2.d
    public final float M() {
        return this.f6558v;
    }

    @Override // f2.d
    public final void N(int i10) {
        this.j = i10;
        R();
    }

    @Override // f2.d
    public final Matrix O() {
        Matrix matrix = this.f6544g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f6544g = matrix;
        }
        this.f6541d.getMatrix(matrix);
        return matrix;
    }

    @Override // f2.d
    public final float P() {
        return this.f6555s;
    }

    public final void Q(int i10) {
        RenderNode renderNode = this.f6541d;
        if (i10 == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f6543f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i10 == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f6543f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f6543f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void R() {
        int i10 = this.j;
        if (i10 != 1 && this.f6547k == 3 && this.f6548l == null) {
            Q(i10);
        } else {
            Q(1);
        }
    }

    public final void a() {
        boolean z2 = this.f6562z;
        boolean z10 = false;
        boolean z11 = z2 && !this.f6545h;
        if (z2 && this.f6545h) {
            z10 = true;
        }
        if (z11 != this.A) {
            this.A = z11;
            this.f6541d.setClipToBounds(z11);
        }
        if (z10 != this.B) {
            this.B = z10;
            this.f6541d.setClipToOutline(z10);
        }
    }

    @Override // f2.d
    public final void b(float f10) {
        this.f6559w = f10;
        this.f6541d.setRotationY(f10);
    }

    @Override // f2.d
    public final float c() {
        return this.f6551o;
    }

    @Override // f2.d
    public final void d(float f10) {
        this.f6555s = f10;
        this.f6541d.setElevation(f10);
    }

    @Override // f2.d
    public final float e() {
        return this.f6549m;
    }

    @Override // f2.d
    public final int f() {
        return this.f6547k;
    }

    @Override // f2.d
    public final void g(float f10) {
        this.f6560x = f10;
        this.f6541d.setRotation(f10);
    }

    @Override // f2.d
    public final void h(float f10) {
        this.f6554r = f10;
        this.f6541d.setTranslationY(f10);
    }

    @Override // f2.d
    public final void i(int i10) {
        if (this.f6547k == i10) {
            return;
        }
        this.f6547k = i10;
        Paint paint = this.f6543f;
        if (paint == null) {
            paint = new Paint();
            this.f6543f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(e0.H(i10)));
        R();
    }

    @Override // f2.d
    public final void j(float f10) {
        this.f6552p = f10;
        this.f6541d.setScaleY(f10);
    }

    @Override // f2.d
    public final void k(r0 r0Var) {
        this.C = r0Var;
    }

    @Override // f2.d
    public final r0 l() {
        return this.C;
    }

    @Override // f2.d
    public final void m(float f10) {
        this.f6549m = f10;
        this.f6541d.setAlpha(f10);
    }

    @Override // f2.d
    public final void n(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f6556t = j;
            k.c(this.f6541d, e0.E(j));
        }
    }

    @Override // f2.d
    public final void o(n nVar) {
        this.f6548l = nVar;
        if (nVar == null) {
            R();
            return;
        }
        Q(1);
        RenderNode renderNode = this.f6541d;
        Paint paint = this.f6543f;
        if (paint == null) {
            paint = new Paint();
            this.f6543f = paint;
        }
        paint.setColorFilter(nVar.f3019a);
        renderNode.setLayerPaint(paint);
    }

    @Override // f2.d
    public final void p(float f10) {
        this.f6551o = f10;
        this.f6541d.setScaleX(f10);
    }

    @Override // f2.d
    public final void q(boolean z2) {
        this.f6562z = z2;
        a();
    }

    @Override // f2.d
    public final void r(Outline outline, long j) {
        this.f6546i = j;
        this.f6541d.setOutline(outline);
        this.f6545h = outline != null;
        a();
    }

    @Override // f2.d
    public final void s(float f10) {
        this.f6553q = f10;
        this.f6541d.setTranslationX(f10);
    }

    @Override // f2.d
    public final void t(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f6557u = j;
            k.d(this.f6541d, e0.E(j));
        }
    }

    @Override // f2.d
    public final void u(float f10) {
        this.f6561y = f10;
        this.f6541d.setCameraDistance(-f10);
    }

    @Override // f2.d
    public final float v() {
        return this.f6552p;
    }

    @Override // f2.d
    public final void w(float f10) {
        this.f6558v = f10;
        this.f6541d.setRotationX(f10);
    }

    @Override // f2.d
    public final void x() {
        j.a(this.f6541d);
    }

    @Override // f2.d
    public final void y(int i10, long j, int i11) {
        int i12 = (int) (j >> 32);
        int i13 = (int) (4294967295L & j);
        this.f6541d.setLeftTopRightBottom(i10, i11, i10 + i12, i11 + i13);
        if (s3.l.b(this.f6542e, j)) {
            return;
        }
        if (this.f6550n) {
            this.f6541d.setPivotX(i12 / 2.0f);
            this.f6541d.setPivotY(i13 / 2.0f);
        }
        this.f6542e = j;
    }

    @Override // f2.d
    public final int z() {
        return this.j;
    }
}
