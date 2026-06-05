package f2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import c2.e0;
import c2.n;
import c2.r0;
import c2.u;
import c2.v;
import c2.w;
import c2.x0;
import s3.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g implements d {
    public int A;

    /* renamed from: b, reason: collision with root package name */
    public final v f6563b;

    /* renamed from: c, reason: collision with root package name */
    public final e2.b f6564c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f6565d;

    /* renamed from: e, reason: collision with root package name */
    public long f6566e;

    /* renamed from: f, reason: collision with root package name */
    public Paint f6567f;

    /* renamed from: g, reason: collision with root package name */
    public Matrix f6568g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6569h;

    /* renamed from: i, reason: collision with root package name */
    public float f6570i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public n f6571k;

    /* renamed from: l, reason: collision with root package name */
    public float f6572l;

    /* renamed from: m, reason: collision with root package name */
    public float f6573m;

    /* renamed from: n, reason: collision with root package name */
    public float f6574n;

    /* renamed from: o, reason: collision with root package name */
    public float f6575o;

    /* renamed from: p, reason: collision with root package name */
    public float f6576p;

    /* renamed from: q, reason: collision with root package name */
    public long f6577q;

    /* renamed from: r, reason: collision with root package name */
    public long f6578r;

    /* renamed from: s, reason: collision with root package name */
    public float f6579s;

    /* renamed from: t, reason: collision with root package name */
    public float f6580t;

    /* renamed from: u, reason: collision with root package name */
    public float f6581u;

    /* renamed from: v, reason: collision with root package name */
    public float f6582v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f6583w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f6584x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f6585y;

    /* renamed from: z, reason: collision with root package name */
    public r0 f6586z;

    public g() {
        v vVar = new v();
        e2.b bVar = new e2.b();
        this.f6563b = vVar;
        this.f6564c = bVar;
        RenderNode renderNodeA = f.a();
        this.f6565d = renderNodeA;
        this.f6566e = 0L;
        renderNodeA.setClipToBounds(false);
        Q(renderNodeA, 0);
        this.f6570i = 1.0f;
        this.j = 3;
        this.f6572l = 1.0f;
        this.f6573m = 1.0f;
        long j = w.f3052b;
        this.f6577q = j;
        this.f6578r = j;
        this.f6582v = 8.0f;
        this.A = 0;
    }

    @Override // f2.d
    public final n A() {
        return this.f6571k;
    }

    @Override // f2.d
    public final float B() {
        return this.f6580t;
    }

    @Override // f2.d
    public final boolean C() {
        return this.f6565d.hasDisplayList();
    }

    @Override // f2.d
    public final float D() {
        return this.f6581u;
    }

    @Override // f2.d
    public final void E(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.f6565d.resetPivot();
        } else {
            this.f6565d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.f6565d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // f2.d
    public final long F() {
        return this.f6577q;
    }

    @Override // f2.d
    public final void G(u uVar) {
        c2.c.a(uVar).drawRenderNode(this.f6565d);
    }

    @Override // f2.d
    public final float H() {
        return this.f6575o;
    }

    @Override // f2.d
    public final long I() {
        return this.f6578r;
    }

    @Override // f2.d
    public final void J(s3.c cVar, m mVar, b bVar, x0 x0Var) {
        e2.b bVar2 = this.f6564c;
        RecordingCanvas recordingCanvasBeginRecording = this.f6565d.beginRecording();
        try {
            v vVar = this.f6563b;
            c2.b bVar3 = vVar.f3047a;
            Canvas canvas = bVar3.f2965a;
            bVar3.f2965a = recordingCanvasBeginRecording;
            ac.d dVar = bVar2.f5738b;
            dVar.O(cVar);
            dVar.P(mVar);
            dVar.f374c = bVar;
            dVar.Q(this.f6566e);
            dVar.N(bVar3);
            x0Var.invoke(bVar2);
            vVar.f3047a.f2965a = canvas;
        } finally {
            this.f6565d.endRecording();
        }
    }

    @Override // f2.d
    public final float K() {
        return this.f6582v;
    }

    @Override // f2.d
    public final float L() {
        return this.f6574n;
    }

    @Override // f2.d
    public final float M() {
        return this.f6579s;
    }

    @Override // f2.d
    public final void N(int i10) {
        this.A = i10;
        R();
    }

    @Override // f2.d
    public final Matrix O() {
        Matrix matrix = this.f6568g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f6568g = matrix;
        }
        this.f6565d.getMatrix(matrix);
        return matrix;
    }

    @Override // f2.d
    public final float P() {
        return this.f6576p;
    }

    public final void Q(RenderNode renderNode, int i10) {
        if (i10 == 1) {
            renderNode.setUseCompositingLayer(true, this.f6567f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i10 == 2) {
            renderNode.setUseCompositingLayer(false, this.f6567f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.f6567f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void R() {
        int i10 = this.A;
        if (i10 != 1 && this.j == 3 && this.f6571k == null && this.f6586z == null) {
            Q(this.f6565d, i10);
        } else {
            Q(this.f6565d, 1);
        }
    }

    public final void a() {
        boolean z2 = this.f6583w;
        boolean z10 = false;
        boolean z11 = z2 && !this.f6569h;
        if (z2 && this.f6569h) {
            z10 = true;
        }
        if (z11 != this.f6584x) {
            this.f6584x = z11;
            this.f6565d.setClipToBounds(z11);
        }
        if (z10 != this.f6585y) {
            this.f6585y = z10;
            this.f6565d.setClipToOutline(z10);
        }
    }

    @Override // f2.d
    public final void b(float f10) {
        this.f6580t = f10;
        this.f6565d.setRotationY(f10);
    }

    @Override // f2.d
    public final float c() {
        return this.f6572l;
    }

    @Override // f2.d
    public final void d(float f10) {
        this.f6576p = f10;
        this.f6565d.setElevation(f10);
    }

    @Override // f2.d
    public final float e() {
        return this.f6570i;
    }

    @Override // f2.d
    public final int f() {
        return this.j;
    }

    @Override // f2.d
    public final void g(float f10) {
        this.f6581u = f10;
        this.f6565d.setRotationZ(f10);
    }

    @Override // f2.d
    public final void h(float f10) {
        this.f6575o = f10;
        this.f6565d.setTranslationY(f10);
    }

    @Override // f2.d
    public final void i(int i10) {
        this.j = i10;
        Paint paint = this.f6567f;
        if (paint == null) {
            paint = new Paint();
            this.f6567f = paint;
        }
        paint.setBlendMode(e0.A(i10));
        R();
    }

    @Override // f2.d
    public final void j(float f10) {
        this.f6573m = f10;
        this.f6565d.setScaleY(f10);
    }

    @Override // f2.d
    public final void k(r0 r0Var) {
        this.f6586z = r0Var;
        if (Build.VERSION.SDK_INT >= 31) {
            this.f6565d.setRenderEffect(r0Var != null ? r0Var.a() : null);
        }
    }

    @Override // f2.d
    public final r0 l() {
        return this.f6586z;
    }

    @Override // f2.d
    public final void m(float f10) {
        this.f6570i = f10;
        this.f6565d.setAlpha(f10);
    }

    @Override // f2.d
    public final void n(long j) {
        this.f6577q = j;
        this.f6565d.setAmbientShadowColor(e0.E(j));
    }

    @Override // f2.d
    public final void o(n nVar) {
        this.f6571k = nVar;
        Paint paint = this.f6567f;
        if (paint == null) {
            paint = new Paint();
            this.f6567f = paint;
        }
        paint.setColorFilter(nVar != null ? nVar.f3019a : null);
        R();
    }

    @Override // f2.d
    public final void p(float f10) {
        this.f6572l = f10;
        this.f6565d.setScaleX(f10);
    }

    @Override // f2.d
    public final void q(boolean z2) {
        this.f6583w = z2;
        a();
    }

    @Override // f2.d
    public final void r(Outline outline, long j) {
        this.f6565d.setOutline(outline);
        this.f6569h = outline != null;
        a();
    }

    @Override // f2.d
    public final void s(float f10) {
        this.f6574n = f10;
        this.f6565d.setTranslationX(f10);
    }

    @Override // f2.d
    public final void t(long j) {
        this.f6578r = j;
        this.f6565d.setSpotShadowColor(e0.E(j));
    }

    @Override // f2.d
    public final void u(float f10) {
        this.f6582v = f10;
        this.f6565d.setCameraDistance(f10);
    }

    @Override // f2.d
    public final float v() {
        return this.f6573m;
    }

    @Override // f2.d
    public final void w(float f10) {
        this.f6579s = f10;
        this.f6565d.setRotationX(f10);
    }

    @Override // f2.d
    public final void x() {
        this.f6565d.discardDisplayList();
    }

    @Override // f2.d
    public final void y(int i10, long j, int i11) {
        this.f6565d.setPosition(i10, i11, ((int) (j >> 32)) + i10, ((int) (4294967295L & j)) + i11);
        this.f6566e = cg.b.S(j);
    }

    @Override // f2.d
    public final int z() {
        return this.A;
    }
}
