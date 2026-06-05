package ef;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import java.util.BitSet;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class i extends Drawable implements x {
    public static final Paint X;
    public static final h[] Y;
    public final Matrix A;
    public final Path B;
    public final Path C;
    public final RectF D;
    public final RectF E;
    public final Region F;
    public final Region G;
    public final Paint H;
    public final Paint I;
    public final df.a J;
    public final p7.k K;
    public final o L;
    public PorterDuffColorFilter M;
    public PorterDuffColorFilter N;
    public final RectF O;
    public final boolean P;
    public boolean Q;
    public m R;
    public q5.g S;
    public final q5.f[] T;
    public float[] U;
    public float[] V;
    public ac.h W;

    /* renamed from: a, reason: collision with root package name */
    public final ag.i f5999a;

    /* renamed from: b, reason: collision with root package name */
    public g f6000b;

    /* renamed from: c, reason: collision with root package name */
    public final v[] f6001c;

    /* renamed from: d, reason: collision with root package name */
    public final v[] f6002d;

    /* renamed from: e, reason: collision with root package name */
    public final BitSet f6003e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6004f;

    /* renamed from: z, reason: collision with root package name */
    public boolean f6005z;

    static {
        Paint paint = new Paint(1);
        X = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        Y = new h[4];
        int i10 = 0;
        while (true) {
            h[] hVarArr = Y;
            if (i10 >= hVarArr.length) {
                return;
            }
            hVarArr[i10] = new h(i10);
            i10++;
        }
    }

    public i() {
        this(new m());
    }

    public static float b(RectF rectF, m mVar, float[] fArr) {
        if (fArr == null) {
            if (mVar.e(rectF)) {
                return mVar.f6022e.a(rectF);
            }
            return -1.0f;
        }
        if (fArr.length > 1) {
            float f10 = fArr[0];
            for (int i10 = 1; i10 < fArr.length; i10++) {
                if (fArr[i10] != f10) {
                    return -1.0f;
                }
            }
        }
        if (mVar.d()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final void a(RectF rectF, Path path) {
        g gVar = this.f6000b;
        this.L.a(gVar.f5982a, this.U, gVar.j, rectF, this.K, path);
        if (this.f6000b.f5990i != 1.0f) {
            Matrix matrix = this.A;
            matrix.reset();
            float f10 = this.f6000b.f5990i;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.O, true);
    }

    public final int c(int i10) {
        int i11;
        g gVar = this.f6000b;
        float f10 = gVar.f5994n + 0.0f + gVar.f5993m;
        ye.a aVar = gVar.f5984c;
        if (aVar == null || !aVar.f20303a || l4.a.d(i10, 255) != aVar.f20306d) {
            return i10;
        }
        float fMin = (aVar.f20307e <= 0.0f || f10 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f10 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i10);
        int iM = u2.b.m(fMin, l4.a.d(i10, 255), aVar.f20304b);
        if (fMin > 0.0f && (i11 = aVar.f20305c) != 0) {
            iM = l4.a.b(l4.a.d(i11, ye.a.f20302f), iM);
        }
        return l4.a.d(iM, iAlpha);
    }

    public final void d(Canvas canvas) {
        if (this.f6003e.cardinality() > 0) {
            Log.w("i", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i10 = this.f6000b.f5996p;
        Path path = this.B;
        df.a aVar = this.J;
        if (i10 != 0) {
            canvas.drawPath(path, aVar.f5114a);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            v vVar = this.f6001c[i11];
            int i12 = this.f6000b.f5995o;
            Matrix matrix = v.f6057b;
            vVar.a(matrix, aVar, i12, canvas);
            this.f6002d[i11].a(matrix, aVar, this.f6000b.f5995o, canvas);
        }
        if (this.P) {
            double d10 = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d10)) * this.f6000b.f5996p);
            int iCos = (int) (Math.cos(Math.toRadians(d10)) * this.f6000b.f5996p);
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, X);
            canvas.translate(iSin, iCos);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0097 A[EDGE_INSN: B:64:0x0097->B:30:0x0097 BREAK  A[LOOP:1: B:21:0x007e->B:26:0x0088]] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ef.i.draw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas, Paint paint, Path path, m mVar, float[] fArr, RectF rectF) {
        float fB = b(rectF, mVar, fArr);
        if (fB < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f10 = fB * this.f6000b.j;
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    public void f(Canvas canvas) {
        m mVar = this.R;
        float[] fArr = this.V;
        RectF rectFG = g();
        RectF rectF = this.E;
        rectF.set(rectFG);
        float fI = i();
        rectF.inset(fI, fI);
        e(canvas, this.I, this.C, mVar, fArr, rectF);
    }

    public final RectF g() {
        Rect bounds = getBounds();
        RectF rectF = this.D;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f6000b.f5992l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f6000b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f6000b.getClass();
        RectF rectFG = g();
        if (rectFG.isEmpty()) {
            return;
        }
        float fB = b(rectFG, this.f6000b.f5982a, this.U);
        if (fB >= 0.0f) {
            outline.setRoundRect(getBounds(), fB * this.f6000b.j);
            return;
        }
        boolean z2 = this.f6004f;
        Path path = this.B;
        if (z2) {
            a(rectFG, path);
            this.f6004f = false;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            xe.b.a(outline, path);
            return;
        }
        if (i10 >= 29) {
            try {
                xe.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            xe.a.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f6000b.f5989h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.F;
        region.set(bounds);
        RectF rectFG = g();
        Path path = this.B;
        a(rectFG, path);
        Region region2 = this.G;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final float h() {
        float[] fArr = this.U;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF rectFG = g();
        m mVar = this.f6000b.f5982a;
        o oVar = this.L;
        oVar.getClass();
        float fA = mVar.f6022e.a(rectFG);
        m mVar2 = this.f6000b.f5982a;
        oVar.getClass();
        float fA2 = mVar2.f6025h.a(rectFG) + fA;
        m mVar3 = this.f6000b.f5982a;
        oVar.getClass();
        float fA3 = fA2 - mVar3.f6024g.a(rectFG);
        m mVar4 = this.f6000b.f5982a;
        oVar.getClass();
        return (fA3 - mVar4.f6023f.a(rectFG)) / 2.0f;
    }

    public final float i() {
        if (j()) {
            return this.I.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f6004f = true;
        this.f6005z = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f6000b.f5987f;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f6000b.getClass();
        ColorStateList colorStateList2 = this.f6000b.f5986e;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f6000b.f5985d;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        z zVar = this.f6000b.f5983b;
        return zVar != null && zVar.d();
    }

    public final boolean j() {
        Paint.Style style = this.f6000b.f5997q;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.I.getStrokeWidth() > 0.0f;
    }

    public final void k(Context context) {
        this.f6000b.f5984c = new ye.a(context);
        s();
    }

    public final void l(q5.g gVar) {
        if (this.S == gVar) {
            return;
        }
        this.S = gVar;
        int i10 = 0;
        while (true) {
            q5.f[] fVarArr = this.T;
            if (i10 >= fVarArr.length) {
                q(getState(), true);
                invalidateSelf();
                return;
            }
            if (fVarArr[i10] == null) {
                fVarArr[i10] = new q5.f(this, Y[i10]);
            }
            q5.f fVar = fVarArr[i10];
            q5.g gVar2 = new q5.g();
            gVar2.a((float) gVar.f13270b);
            double d10 = gVar.f13269a;
            gVar2.b((float) (d10 * d10));
            fVar.f13266m = gVar2;
            i10++;
        }
    }

    public final void m(float f10) {
        g gVar = this.f6000b;
        if (gVar.f5994n != f10) {
            gVar.f5994n = f10;
            s();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f6000b = new g(this.f6000b);
        return this;
    }

    public final void n(ColorStateList colorStateList) {
        g gVar = this.f6000b;
        if (gVar.f5985d != colorStateList) {
            gVar.f5985d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void o(z zVar) {
        g gVar = this.f6000b;
        if (gVar.f5983b != zVar) {
            gVar.f5983b = zVar;
            q(getState(), true);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f6004f = true;
        this.f6005z = true;
        super.onBoundsChange(rect);
        if (this.f6000b.f5983b != null && !rect.isEmpty()) {
            q(getState(), this.Q);
        }
        this.Q = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.f6000b.f5983b != null) {
            q(iArr, false);
        }
        boolean z2 = p(iArr) || r();
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    public final boolean p(int[] iArr) {
        boolean z2;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f6000b.f5985d == null || color2 == (colorForState2 = this.f6000b.f5985d.getColorForState(iArr, (color2 = (paint2 = this.H).getColor())))) {
            z2 = false;
        } else {
            paint2.setColor(colorForState2);
            z2 = true;
        }
        if (this.f6000b.f5986e == null || color == (colorForState = this.f6000b.f5986e.getColorForState(iArr, (color = (paint = this.I).getColor())))) {
            return z2;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final void q(int[] iArr, boolean z2) {
        m mVarA;
        int i10;
        RectF rectFG = g();
        if (this.f6000b.f5983b == null || rectFG.isEmpty()) {
            return;
        }
        boolean z10 = z2 | (this.S == null);
        if (this.U == null) {
            this.U = new float[4];
        }
        z zVar = this.f6000b.f5983b;
        m[] mVarArr = zVar.f6073d;
        int i11 = zVar.f6070a;
        int[][] iArr2 = zVar.f6072c;
        y yVar = zVar.f6077h;
        y yVar2 = zVar.f6076g;
        y yVar3 = zVar.f6075f;
        y yVar4 = zVar.f6074e;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                i12 = -1;
                break;
            } else if (StateSet.stateSetMatches(iArr2[i12], iArr)) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int i13 = 0;
            while (true) {
                if (i13 >= i11) {
                    i10 = -1;
                    break;
                } else {
                    if (StateSet.stateSetMatches(iArr2[i13], iArr3)) {
                        i10 = i13;
                        break;
                    }
                    i13++;
                }
            }
            i12 = i10;
        }
        if (yVar4 == null && yVar3 == null && yVar2 == null && yVar == null) {
            mVarA = mVarArr[i12];
        } else {
            l lVarF = mVarArr[i12].f();
            if (yVar4 != null) {
                lVarF.f6011e = yVar4.c(iArr);
            }
            if (yVar3 != null) {
                lVarF.f6012f = yVar3.c(iArr);
            }
            if (yVar2 != null) {
                lVarF.f6014h = yVar2.c(iArr);
            }
            if (yVar != null) {
                lVarF.f6013g = yVar.c(iArr);
            }
            mVarA = lVarF.a();
        }
        int i14 = 0;
        while (i14 < 4) {
            this.L.getClass();
            float fA = (i14 != 1 ? i14 != 2 ? i14 != 3 ? mVarA.f6023f : mVarA.f6022e : mVarA.f6025h : mVarA.f6024g).a(rectFG);
            if (z10) {
                this.U[i14] = fA;
            }
            q5.f[] fVarArr = this.T;
            q5.f fVar = fVarArr[i14];
            if (fVar != null) {
                fVar.a(fA);
                if (z10) {
                    fVarArr[i14].d();
                }
            }
            i14++;
        }
        if (z10) {
            invalidateSelf();
        }
    }

    public final boolean r() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.M;
        PorterDuffColorFilter porterDuffColorFilter3 = this.N;
        g gVar = this.f6000b;
        ColorStateList colorStateList = gVar.f5987f;
        PorterDuff.Mode mode = gVar.f5988g;
        if (colorStateList == null || mode == null) {
            int color = this.H.getColor();
            int iC = c(color);
            porterDuffColorFilter = iC != color ? new PorterDuffColorFilter(iC, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(c(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.M = porterDuffColorFilter;
        this.f6000b.getClass();
        this.N = null;
        this.f6000b.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.M) && Objects.equals(porterDuffColorFilter3, this.N)) ? false : true;
    }

    public final void s() {
        g gVar = this.f6000b;
        float f10 = gVar.f5994n + 0.0f;
        gVar.f5995o = (int) Math.ceil(0.75f * f10);
        this.f6000b.f5996p = (int) Math.ceil(f10 * 0.25f);
        r();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        g gVar = this.f6000b;
        if (gVar.f5992l != i10) {
            gVar.f5992l = i10;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f6000b.getClass();
        super.invalidateSelf();
    }

    @Override // ef.x
    public final void setShapeAppearanceModel(m mVar) {
        g gVar = this.f6000b;
        gVar.f5982a = mVar;
        gVar.f5983b = null;
        this.U = null;
        this.V = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f6000b.f5987f = colorStateList;
        r();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        g gVar = this.f6000b;
        if (gVar.f5988g != mode) {
            gVar.f5988g = mode;
            r();
            super.invalidateSelf();
        }
    }

    public i(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(m.b(context, attributeSet, i10, i11).a());
    }

    public i(m mVar) {
        this(new g(mVar));
    }

    public i(g gVar) {
        o oVar;
        this.f5999a = new ag.i(this, 4);
        this.f6001c = new v[4];
        this.f6002d = new v[4];
        this.f6003e = new BitSet(8);
        this.A = new Matrix();
        this.B = new Path();
        this.C = new Path();
        this.D = new RectF();
        this.E = new RectF();
        this.F = new Region();
        this.G = new Region();
        Paint paint = new Paint(1);
        this.H = paint;
        Paint paint2 = new Paint(1);
        this.I = paint2;
        this.J = new df.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            oVar = n.f6029a;
        } else {
            oVar = new o();
        }
        this.L = oVar;
        this.O = new RectF();
        this.P = true;
        this.Q = true;
        this.T = new q5.f[4];
        this.f6000b = gVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        r();
        p(getState());
        this.K = new p7.k(this, 6);
    }
}
