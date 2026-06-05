package b1;

import ac.o;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import c2.e0;
import c2.w;
import fj.l;
import z.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e extends View {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f1471f = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f1472z = new int[0];

    /* renamed from: a, reason: collision with root package name */
    public j f1473a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f1474b;

    /* renamed from: c, reason: collision with root package name */
    public Long f1475c;

    /* renamed from: d, reason: collision with root package name */
    public o f1476d;

    /* renamed from: e, reason: collision with root package name */
    public a7.e f1477e;

    private final void setRippleState(boolean z2) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f1476d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.f1475c;
        long jLongValue = jCurrentAnimationTimeMillis - (l10 != null ? l10.longValue() : 0L);
        if (z2 || jLongValue >= 5) {
            int[] iArr = z2 ? f1471f : f1472z;
            j jVar = this.f1473a;
            if (jVar != null) {
                jVar.setState(iArr);
            }
        } else {
            o oVar = new o(this, 3);
            this.f1476d = oVar;
            postDelayed(oVar, 50L);
        }
        this.f1475c = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(e eVar) {
        j jVar = eVar.f1473a;
        if (jVar != null) {
            jVar.setState(f1472z);
        }
        eVar.f1476d = null;
    }

    public final void b(m mVar, boolean z2, long j, int i10, long j4, a7.e eVar) {
        if (this.f1473a == null || !Boolean.valueOf(z2).equals(this.f1474b)) {
            j jVar = new j(z2);
            setBackground(jVar);
            this.f1473a = jVar;
            this.f1474b = Boolean.valueOf(z2);
        }
        j jVar2 = this.f1473a;
        l.c(jVar2);
        this.f1477e = eVar;
        e(i10, j, j4);
        if (z2) {
            jVar2.setHotspot(Float.intBitsToFloat((int) (mVar.f20348a >> 32)), Float.intBitsToFloat((int) (mVar.f20348a & 4294967295L)));
        } else {
            jVar2.setHotspot(jVar2.getBounds().centerX(), jVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.f1477e = null;
        o oVar = this.f1476d;
        if (oVar != null) {
            removeCallbacks(oVar);
            o oVar2 = this.f1476d;
            l.c(oVar2);
            oVar2.run();
        } else {
            j jVar = this.f1473a;
            if (jVar != null) {
                jVar.setState(f1472z);
            }
        }
        j jVar2 = this.f1473a;
        if (jVar2 == null) {
            return;
        }
        jVar2.setVisible(false, false);
        unscheduleDrawable(jVar2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(int i10, long j, long j4) {
        j jVar = this.f1473a;
        if (jVar == null) {
            return;
        }
        Integer num = jVar.f1494c;
        if (num == null || num.intValue() != i10) {
            jVar.f1494c = Integer.valueOf(i10);
            jVar.setRadius(i10);
        }
        float f10 = Build.VERSION.SDK_INT < 28 ? 0.1f * 2 : 0.1f;
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        long jC = w.c(j4, f10);
        w wVar = jVar.f1493b;
        if (!(wVar == null ? false : w.d(wVar.f3060a, jC))) {
            jVar.f1493b = new w(jC);
            jVar.setColor(ColorStateList.valueOf(e0.E(jC)));
        }
        Rect rect = new Rect(0, 0, hj.a.H(b2.e.e(j)), hj.a.H(b2.e.b(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        jVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        a7.e eVar = this.f1477e;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i10, int i11, int i12, int i13) {
    }
}
