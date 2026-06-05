package f2;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
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
public final class i implements d {
    public static final h D = new h();
    public float A;
    public float B;
    public r0 C;

    /* renamed from: b, reason: collision with root package name */
    public final g2.a f6587b;

    /* renamed from: c, reason: collision with root package name */
    public final v f6588c;

    /* renamed from: d, reason: collision with root package name */
    public final l f6589d;

    /* renamed from: e, reason: collision with root package name */
    public final Resources f6590e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f6591f;

    /* renamed from: g, reason: collision with root package name */
    public Paint f6592g;

    /* renamed from: h, reason: collision with root package name */
    public int f6593h;

    /* renamed from: i, reason: collision with root package name */
    public int f6594i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6595k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6596l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6597m;

    /* renamed from: n, reason: collision with root package name */
    public int f6598n;

    /* renamed from: o, reason: collision with root package name */
    public n f6599o;

    /* renamed from: p, reason: collision with root package name */
    public int f6600p;

    /* renamed from: q, reason: collision with root package name */
    public float f6601q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6602r;

    /* renamed from: s, reason: collision with root package name */
    public float f6603s;

    /* renamed from: t, reason: collision with root package name */
    public float f6604t;

    /* renamed from: u, reason: collision with root package name */
    public float f6605u;

    /* renamed from: v, reason: collision with root package name */
    public float f6606v;

    /* renamed from: w, reason: collision with root package name */
    public float f6607w;

    /* renamed from: x, reason: collision with root package name */
    public long f6608x;

    /* renamed from: y, reason: collision with root package name */
    public long f6609y;

    /* renamed from: z, reason: collision with root package name */
    public float f6610z;

    public i(g2.a aVar) {
        v vVar = new v();
        e2.b bVar = new e2.b();
        this.f6587b = aVar;
        this.f6588c = vVar;
        l lVar = new l(aVar, vVar, bVar);
        this.f6589d = lVar;
        this.f6590e = aVar.getResources();
        this.f6591f = new Rect();
        aVar.addView(lVar);
        lVar.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.f6598n = 3;
        this.f6600p = 0;
        this.f6601q = 1.0f;
        this.f6603s = 1.0f;
        this.f6604t = 1.0f;
        long j = w.f3052b;
        this.f6608x = j;
        this.f6609y = j;
    }

    @Override // f2.d
    public final n A() {
        return this.f6599o;
    }

    @Override // f2.d
    public final float B() {
        return this.A;
    }

    @Override // f2.d
    public final float D() {
        return this.B;
    }

    @Override // f2.d
    public final void E(long j) {
        long j4 = 9223372034707292159L & j;
        l lVar = this.f6589d;
        if (j4 != 9205357640488583168L) {
            this.f6602r = false;
            lVar.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            lVar.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                lVar.resetPivot();
                return;
            }
            this.f6602r = true;
            lVar.setPivotX(((int) (this.j >> 32)) / 2.0f);
            lVar.setPivotY(((int) (this.j & 4294967295L)) / 2.0f);
        }
    }

    @Override // f2.d
    public final long F() {
        return this.f6608x;
    }

    @Override // f2.d
    public final void G(u uVar) {
        Rect rect;
        boolean z2 = this.f6595k;
        l lVar = this.f6589d;
        if (z2) {
            if ((this.f6597m || lVar.getClipToOutline()) && !this.f6596l) {
                rect = this.f6591f;
                rect.left = 0;
                rect.top = 0;
                rect.right = lVar.getWidth();
                rect.bottom = lVar.getHeight();
            } else {
                rect = null;
            }
            lVar.setClipBounds(rect);
        }
        if (c2.c.a(uVar).isHardwareAccelerated()) {
            this.f6587b.a(uVar, lVar, lVar.getDrawingTime());
        }
    }

    @Override // f2.d
    public final float H() {
        return this.f6606v;
    }

    @Override // f2.d
    public final long I() {
        return this.f6609y;
    }

    @Override // f2.d
    public final void J(s3.c cVar, m mVar, b bVar, x0 x0Var) {
        l lVar = this.f6589d;
        ViewParent parent = lVar.getParent();
        g2.a aVar = this.f6587b;
        if (parent == null) {
            aVar.addView(lVar);
        }
        lVar.f6617z = cVar;
        lVar.A = mVar;
        lVar.B = x0Var;
        lVar.C = bVar;
        if (lVar.isAttachedToWindow()) {
            lVar.setVisibility(4);
            lVar.setVisibility(0);
            try {
                v vVar = this.f6588c;
                h hVar = D;
                c2.b bVar2 = vVar.f3047a;
                Canvas canvas = bVar2.f2965a;
                bVar2.f2965a = hVar;
                aVar.a(bVar2, lVar, lVar.getDrawingTime());
                vVar.f3047a.f2965a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // f2.d
    public final float K() {
        return this.f6589d.getCameraDistance() / this.f6590e.getDisplayMetrics().densityDpi;
    }

    @Override // f2.d
    public final float L() {
        return this.f6605u;
    }

    @Override // f2.d
    public final float M() {
        return this.f6610z;
    }

    @Override // f2.d
    public final void N(int i10) {
        this.f6600p = i10;
        Q();
    }

    @Override // f2.d
    public final Matrix O() {
        return this.f6589d.getMatrix();
    }

    @Override // f2.d
    public final float P() {
        return this.f6607w;
    }

    public final void Q() {
        int i10 = this.f6600p;
        if (i10 != 1 && this.f6598n == 3 && this.f6599o == null) {
            a(i10);
        } else {
            a(1);
        }
    }

    public final void a(int i10) {
        l lVar = this.f6589d;
        boolean z2 = true;
        if (i10 == 1) {
            lVar.setLayerType(2, this.f6592g);
        } else if (i10 == 2) {
            lVar.setLayerType(0, this.f6592g);
            z2 = false;
        } else {
            lVar.setLayerType(0, this.f6592g);
        }
        lVar.setCanUseCompositingLayer$ui_graphics(z2);
    }

    @Override // f2.d
    public final void b(float f10) {
        this.A = f10;
        this.f6589d.setRotationY(f10);
    }

    @Override // f2.d
    public final float c() {
        return this.f6603s;
    }

    @Override // f2.d
    public final void d(float f10) {
        this.f6607w = f10;
        this.f6589d.setElevation(f10);
    }

    @Override // f2.d
    public final float e() {
        return this.f6601q;
    }

    @Override // f2.d
    public final int f() {
        return this.f6598n;
    }

    @Override // f2.d
    public final void g(float f10) {
        this.B = f10;
        this.f6589d.setRotation(f10);
    }

    @Override // f2.d
    public final void h(float f10) {
        this.f6606v = f10;
        this.f6589d.setTranslationY(f10);
    }

    @Override // f2.d
    public final void i(int i10) {
        this.f6598n = i10;
        Paint paint = this.f6592g;
        if (paint == null) {
            paint = new Paint();
            this.f6592g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(e0.H(i10)));
        Q();
    }

    @Override // f2.d
    public final void j(float f10) {
        this.f6604t = f10;
        this.f6589d.setScaleY(f10);
    }

    @Override // f2.d
    public final void k(r0 r0Var) {
        this.C = r0Var;
        if (Build.VERSION.SDK_INT >= 31) {
            this.f6589d.setRenderEffect(r0Var != null ? r0Var.a() : null);
        }
    }

    @Override // f2.d
    public final r0 l() {
        return this.C;
    }

    @Override // f2.d
    public final void m(float f10) {
        this.f6601q = f10;
        this.f6589d.setAlpha(f10);
    }

    @Override // f2.d
    public final void n(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f6608x = j;
            this.f6589d.setOutlineAmbientShadowColor(e0.E(j));
        }
    }

    @Override // f2.d
    public final void o(n nVar) {
        this.f6599o = nVar;
        Paint paint = this.f6592g;
        if (paint == null) {
            paint = new Paint();
            this.f6592g = paint;
        }
        paint.setColorFilter(nVar != null ? nVar.f3019a : null);
        Q();
    }

    @Override // f2.d
    public final void p(float f10) {
        this.f6603s = f10;
        this.f6589d.setScaleX(f10);
    }

    @Override // f2.d
    public final void q(boolean z2) {
        boolean z10 = false;
        this.f6597m = z2 && !this.f6596l;
        this.f6595k = true;
        if (z2 && this.f6596l) {
            z10 = true;
        }
        this.f6589d.setClipToOutline(z10);
    }

    @Override // f2.d
    public final void r(Outline outline, long j) {
        l lVar = this.f6589d;
        lVar.f6615e = outline;
        lVar.invalidateOutline();
        if ((this.f6597m || lVar.getClipToOutline()) && outline != null) {
            lVar.setClipToOutline(true);
            if (this.f6597m) {
                this.f6597m = false;
                this.f6595k = true;
            }
        }
        this.f6596l = outline != null;
    }

    @Override // f2.d
    public final void s(float f10) {
        this.f6605u = f10;
        this.f6589d.setTranslationX(f10);
    }

    @Override // f2.d
    public final void t(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f6609y = j;
            this.f6589d.setOutlineSpotShadowColor(e0.E(j));
        }
    }

    @Override // f2.d
    public final void u(float f10) {
        this.f6589d.setCameraDistance(f10 * this.f6590e.getDisplayMetrics().densityDpi);
    }

    @Override // f2.d
    public final float v() {
        return this.f6604t;
    }

    @Override // f2.d
    public final void w(float f10) {
        this.f6610z = f10;
        this.f6589d.setRotationX(f10);
    }

    @Override // f2.d
    public final void x() {
        this.f6587b.removeViewInLayout(this.f6589d);
    }

    @Override // f2.d
    public final void y(int i10, long j, int i11) {
        boolean zB = s3.l.b(this.j, j);
        l lVar = this.f6589d;
        if (zB) {
            int i12 = this.f6593h;
            if (i12 != i10) {
                lVar.offsetLeftAndRight(i10 - i12);
            }
            int i13 = this.f6594i;
            if (i13 != i11) {
                lVar.offsetTopAndBottom(i11 - i13);
            }
        } else {
            if (this.f6597m || lVar.getClipToOutline()) {
                this.f6595k = true;
            }
            int i14 = (int) (j >> 32);
            int i15 = (int) (4294967295L & j);
            lVar.layout(i10, i11, i10 + i14, i11 + i15);
            this.j = j;
            if (this.f6602r) {
                lVar.setPivotX(i14 / 2.0f);
                lVar.setPivotY(i15 / 2.0f);
            }
        }
        this.f6593h = i10;
        this.f6594i = i11;
    }

    @Override // f2.d
    public final int z() {
        return this.f6600p;
    }
}
