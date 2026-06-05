package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import c1.u1;
import com.anonlab.voidlauncher.R;
import com.google.android.gms.common.api.f;
import java.lang.reflect.Field;
import l4.b;
import m.a;
import m.a2;
import m.c;
import m.d;
import m.m0;
import t4.a1;
import t4.b0;
import t4.b1;
import t4.d0;
import t4.j1;
import t4.k;
import t4.l;
import t4.l0;
import t4.m1;
import t4.w0;
import t4.x0;
import t4.y0;
import t4.z0;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements k, l {
    public static final int[] S = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final m1 T;
    public static final Rect U;
    public boolean A;
    public boolean B;
    public int C;
    public final Rect D;
    public final Rect E;
    public final Rect F;
    public final Rect G;
    public m1 H;
    public m1 I;
    public m1 J;
    public m1 K;
    public OverScroller L;
    public ViewPropertyAnimator M;
    public final hf.l N;
    public final a O;
    public final a P;
    public final u1 Q;
    public final d R;

    /* renamed from: a, reason: collision with root package name */
    public int f791a;

    /* renamed from: b, reason: collision with root package name */
    public ContentFrameLayout f792b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarContainer f793c;

    /* renamed from: d, reason: collision with root package name */
    public m0 f794d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f795e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f796f;

    /* renamed from: z, reason: collision with root package name */
    public boolean f797z;

    static {
        int i10 = Build.VERSION.SDK_INT;
        b1 a1Var = i10 >= 34 ? new a1() : i10 >= 31 ? new z0() : i10 >= 30 ? new y0() : i10 >= 29 ? new x0() : new w0();
        a1Var.g(b.c(0, 1, 0, 1));
        T = a1Var.b();
        U = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D = new Rect();
        this.E = new Rect();
        this.F = new Rect();
        this.G = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        m1 m1Var = m1.f15750b;
        this.H = m1Var;
        this.I = m1Var;
        this.J = m1Var;
        this.K = m1Var;
        this.N = new hf.l(this, 2);
        this.O = new a(this, 0);
        this.P = new a(this, 1);
        i(context);
        this.Q = new u1();
        d dVar = new d(context);
        dVar.setWillNotDraw(true);
        this.R = dVar;
        addView(dVar);
    }

    public static boolean a(View view, Rect rect, boolean z2) {
        boolean z10;
        c cVar = (c) view.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        int i11 = rect.left;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) cVar).leftMargin = i11;
            z10 = true;
        } else {
            z10 = false;
        }
        int i12 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        int i13 = rect.top;
        if (i12 != i13) {
            ((ViewGroup.MarginLayoutParams) cVar).topMargin = i13;
            z10 = true;
        }
        int i14 = ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
        int i15 = rect.right;
        if (i14 != i15) {
            ((ViewGroup.MarginLayoutParams) cVar).rightMargin = i15;
            z10 = true;
        }
        if (z2) {
            int i16 = ((ViewGroup.MarginLayoutParams) cVar).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) cVar).bottomMargin = i17;
                return true;
            }
        }
        return z10;
    }

    public final void b() {
        removeCallbacks(this.O);
        removeCallbacks(this.P);
        ViewPropertyAnimator viewPropertyAnimator = this.M;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // t4.l
    public final void c(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        d(view, i10, i11, i12, i13, i14);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // t4.k
    public final void d(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f795e != null) {
            if (this.f793c.getVisibility() == 0) {
                translationY = (int) (this.f793c.getTranslationY() + this.f793c.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f795e.setBounds(0, translationY, getWidth(), this.f795e.getIntrinsicHeight() + translationY);
            this.f795e.draw(canvas);
        }
    }

    @Override // t4.k
    public final boolean e(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // t4.k
    public final void f(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // t4.k
    public final void g(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f793c;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        u1 u1Var = this.Q;
        return u1Var.f2737b | u1Var.f2736a;
    }

    public CharSequence getTitle() {
        j();
        return ((a2) this.f794d).f11048a.getTitle();
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(S);
        this.f791a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f795e = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.L = new OverScroller(context);
    }

    public final void j() {
        m0 wrapper;
        if (this.f792b == null) {
            this.f792b = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f793c = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof m0) {
                wrapper = (m0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f794d = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        j();
        m1 m1VarD = m1.d(this, windowInsets);
        j1 j1Var = m1VarD.f15751a;
        boolean zA = a(this.f793c, new Rect(j1Var.l().f9967a, m1VarD.a(), j1Var.l().f9969c, j1Var.l().f9970d), false);
        Field field = l0.f15744a;
        Rect rect = this.D;
        d0.b(this, m1VarD, rect);
        m1 m1VarN = j1Var.n(rect.left, rect.top, rect.right, rect.bottom);
        this.H = m1VarN;
        boolean z2 = true;
        if (!this.I.equals(m1VarN)) {
            this.I = this.H;
            zA = true;
        }
        Rect rect2 = this.E;
        if (rect2.equals(rect)) {
            z2 = zA;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return j1Var.a().f15751a.c().f15751a.b().c();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        Field field = l0.f15744a;
        b0.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) cVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z2) {
        if (!this.A || !z2) {
            return false;
        }
        this.L.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, f.API_PRIORITY_OTHER);
        if (this.L.getFinalY() > this.f793c.getHeight()) {
            b();
            this.P.run();
        } else {
            b();
            this.O.run();
        }
        this.B = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.C + i11;
        this.C = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.Q.f2736a = i10;
        this.C = getActionBarHideOffset();
        b();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f793c.getVisibility() != 0) {
            return false;
        }
        return this.A;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.A || this.B) {
            return;
        }
        if (this.C <= this.f793c.getHeight()) {
            b();
            postDelayed(this.O, 600L);
        } else {
            b();
            postDelayed(this.P, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    public void setActionBarHideOffset(int i10) {
        b();
        this.f793c.setTranslationY(-Math.max(0, Math.min(i10, this.f793c.getHeight())));
    }

    public void setActionBarVisibilityCallback(m.b bVar) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f797z = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.A) {
            this.A = z2;
            if (z2) {
                return;
            }
            b();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        j();
        a2 a2Var = (a2) this.f794d;
        a2Var.f11051d = i10 != 0 ? v.G(a2Var.f11048a.getContext(), i10) : null;
        a2Var.c();
    }

    public void setLogo(int i10) {
        j();
        a2 a2Var = (a2) this.f794d;
        a2Var.f11052e = i10 != 0 ? v.G(a2Var.f11048a.getContext(), i10) : null;
        a2Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f796f = z2;
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((a2) this.f794d).f11057k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        a2 a2Var = (a2) this.f794d;
        if (a2Var.f11054g) {
            return;
        }
        Toolbar toolbar = a2Var.f11048a;
        a2Var.f11055h = charSequence;
        if ((a2Var.f11049b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (a2Var.f11054g) {
                l0.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        a2 a2Var = (a2) this.f794d;
        a2Var.f11051d = drawable;
        a2Var.c();
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // t4.k
    public final void h(View view, int i10, int i11, int[] iArr, int i12) {
    }
}
