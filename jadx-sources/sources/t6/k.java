package t6;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k extends c0 {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final ah.d B;

    /* renamed from: a, reason: collision with root package name */
    public final int f15923a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15924b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f15925c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f15926d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15927e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15928f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f15929g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f15930h;

    /* renamed from: i, reason: collision with root package name */
    public final int f15931i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public int f15932k;

    /* renamed from: l, reason: collision with root package name */
    public int f15933l;

    /* renamed from: m, reason: collision with root package name */
    public float f15934m;

    /* renamed from: n, reason: collision with root package name */
    public int f15935n;

    /* renamed from: o, reason: collision with root package name */
    public int f15936o;

    /* renamed from: p, reason: collision with root package name */
    public float f15937p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f15940s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f15947z;

    /* renamed from: q, reason: collision with root package name */
    public int f15938q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f15939r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f15941t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f15942u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f15943v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f15944w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f15945x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f15946y = new int[2];

    public k(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f15947z = valueAnimatorOfFloat;
        this.A = 0;
        ah.d dVar = new ah.d(this, 27);
        this.B = dVar;
        i iVar = new i(this);
        this.f15925c = stateListDrawable;
        this.f15926d = drawable;
        this.f15929g = stateListDrawable2;
        this.f15930h = drawable2;
        this.f15927e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f15928f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f15931i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f15923a = i11;
        this.f15924b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new j(this));
        valueAnimatorOfFloat.addUpdateListener(new hf.y(this, 2));
        RecyclerView recyclerView2 = this.f15940s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.G;
            e0 e0Var = recyclerView2.E;
            if (e0Var != null) {
                e0Var.c("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.M();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f15940s;
            recyclerView3.H.remove(this);
            if (recyclerView3.I == this) {
                recyclerView3.I = null;
            }
            ArrayList arrayList2 = this.f15940s.y0;
            if (arrayList2 != null) {
                arrayList2.remove(iVar);
            }
            this.f15940s.removeCallbacks(dVar);
        }
        this.f15940s = recyclerView;
        recyclerView.f(this);
        this.f15940s.H.add(this);
        this.f15940s.g(iVar);
    }

    public static int e(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 != 0) {
            int i14 = i10 - i12;
            int i15 = (int) (((f11 - f10) / i13) * i14);
            int i16 = i11 + i15;
            if (i16 < i14 && i16 >= 0) {
                return i15;
            }
        }
        return 0;
    }

    @Override // t6.c0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int i10 = this.f15938q;
        RecyclerView recyclerView2 = this.f15940s;
        if (i10 != recyclerView2.getWidth() || this.f15939r != recyclerView2.getHeight()) {
            this.f15938q = recyclerView2.getWidth();
            this.f15939r = recyclerView2.getHeight();
            f(0);
            return;
        }
        if (this.A != 0) {
            if (this.f15941t) {
                int i11 = this.f15938q;
                int i12 = this.f15927e;
                int i13 = i11 - i12;
                int i14 = this.f15933l;
                int i15 = this.f15932k;
                int i16 = i14 - (i15 / 2);
                StateListDrawable stateListDrawable = this.f15925c;
                stateListDrawable.setBounds(0, 0, i12, i15);
                int i17 = this.f15928f;
                int i18 = this.f15939r;
                Drawable drawable = this.f15926d;
                drawable.setBounds(0, 0, i17, i18);
                Field field = t4.l0.f15744a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i12, i16);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i12, -i16);
                } else {
                    canvas.translate(i13, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i16);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i13, -i16);
                }
            }
            if (this.f15942u) {
                int i19 = this.f15939r;
                int i20 = this.f15931i;
                int i21 = i19 - i20;
                int i22 = this.f15936o;
                int i23 = this.f15935n;
                int i24 = i22 - (i23 / 2);
                StateListDrawable stateListDrawable2 = this.f15929g;
                stateListDrawable2.setBounds(0, 0, i23, i20);
                int i25 = this.f15938q;
                int i26 = this.j;
                Drawable drawable2 = this.f15930h;
                drawable2.setBounds(0, 0, i25, i26);
                canvas.translate(0.0f, i21);
                drawable2.draw(canvas);
                canvas.translate(i24, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i24, -i21);
            }
        }
    }

    public final boolean c(float f10, float f11) {
        if (f11 < this.f15939r - this.f15931i) {
            return false;
        }
        int i10 = this.f15936o;
        int i11 = this.f15935n;
        return f10 >= ((float) (i10 - (i11 / 2))) && f10 <= ((float) ((i11 / 2) + i10));
    }

    public final boolean d(float f10, float f11) {
        Field field = t4.l0.f15744a;
        int layoutDirection = this.f15940s.getLayoutDirection();
        int i10 = this.f15927e;
        if (layoutDirection == 1) {
            if (f10 > i10) {
                return false;
            }
        } else if (f10 < this.f15938q - i10) {
            return false;
        }
        int i11 = this.f15933l;
        int i12 = this.f15932k / 2;
        return f11 >= ((float) (i11 - i12)) && f11 <= ((float) (i12 + i11));
    }

    public final void f(int i10) {
        ah.d dVar = this.B;
        StateListDrawable stateListDrawable = this.f15925c;
        if (i10 == 2 && this.f15943v != 2) {
            stateListDrawable.setState(C);
            this.f15940s.removeCallbacks(dVar);
        }
        if (i10 == 0) {
            this.f15940s.invalidate();
        } else {
            g();
        }
        if (this.f15943v == 2 && i10 != 2) {
            stateListDrawable.setState(D);
            this.f15940s.removeCallbacks(dVar);
            this.f15940s.postDelayed(dVar, 1200);
        } else if (i10 == 1) {
            this.f15940s.removeCallbacks(dVar);
            this.f15940s.postDelayed(dVar, 1500);
        }
        this.f15943v = i10;
    }

    public final void g() {
        int i10 = this.A;
        ValueAnimator valueAnimator = this.f15947z;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
