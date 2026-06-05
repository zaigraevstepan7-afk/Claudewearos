package androidx.appcompat.widget;

import ah.d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.anonlab.voidlauncher.R;
import i.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import l.h;
import l.i;
import m.a2;
import m.b2;
import m.e;
import m.g0;
import m.m0;
import m.o1;
import m.t;
import m.u;
import m.u1;
import m.v1;
import m.w1;
import m.x1;
import m.y1;
import m.z1;
import p1.l;
import p7.k;
import t4.l0;
import u6.v;
import w5.b0;
import yh.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public t A;
    public View B;
    public Context C;
    public int D;
    public int E;
    public int F;
    public final int G;
    public final int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public o1 M;
    public int N;
    public int O;
    public final int P;
    public CharSequence Q;
    public CharSequence R;
    public ColorStateList S;
    public ColorStateList T;
    public boolean U;
    public boolean V;
    public final ArrayList W;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f812a;

    /* renamed from: a0, reason: collision with root package name */
    public final ArrayList f813a0;

    /* renamed from: b, reason: collision with root package name */
    public g0 f814b;

    /* renamed from: b0, reason: collision with root package name */
    public final int[] f815b0;

    /* renamed from: c, reason: collision with root package name */
    public g0 f816c;

    /* renamed from: c0, reason: collision with root package name */
    public final l f817c0;

    /* renamed from: d, reason: collision with root package name */
    public t f818d;

    /* renamed from: d0, reason: collision with root package name */
    public ArrayList f819d0;

    /* renamed from: e, reason: collision with root package name */
    public u f820e;

    /* renamed from: e0, reason: collision with root package name */
    public final k f821e0;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f822f;

    /* renamed from: f0, reason: collision with root package name */
    public a2 f823f0;

    /* renamed from: g0, reason: collision with root package name */
    public w1 f824g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f825h0;

    /* renamed from: i0, reason: collision with root package name */
    public OnBackInvokedCallback f826i0;

    /* renamed from: j0, reason: collision with root package name */
    public OnBackInvokedDispatcher f827j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f828k0;

    /* renamed from: l0, reason: collision with root package name */
    public final d f829l0;

    /* renamed from: z, reason: collision with root package name */
    public final CharSequence f830z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static x1 g() {
        x1 x1Var = new x1(-2, -2);
        x1Var.f11210b = 0;
        x1Var.f11209a = 8388627;
        return x1Var;
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new k.d(getContext());
    }

    public static x1 h(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof x1;
        if (z2) {
            x1 x1Var = (x1) layoutParams;
            x1 x1Var2 = new x1(x1Var);
            x1Var2.f11210b = 0;
            x1Var2.f11210b = x1Var.f11210b;
            return x1Var2;
        }
        if (z2) {
            x1 x1Var3 = new x1((x1) layoutParams);
            x1Var3.f11210b = 0;
            return x1Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            x1 x1Var4 = new x1(layoutParams);
            x1Var4.f11210b = 0;
            return x1Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        x1 x1Var5 = new x1(marginLayoutParams);
        x1Var5.f11210b = 0;
        ((ViewGroup.MarginLayoutParams) x1Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) x1Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) x1Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) x1Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return x1Var5;
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i10) {
        boolean z2 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, getLayoutDirection());
        arrayList.clear();
        if (!z2) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                x1 x1Var = (x1) childAt.getLayoutParams();
                if (x1Var.f11210b == 0 && r(childAt)) {
                    int i12 = x1Var.f11209a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i12, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i13 = childCount - 1; i13 >= 0; i13--) {
            View childAt2 = getChildAt(i13);
            x1 x1Var2 = (x1) childAt2.getLayoutParams();
            if (x1Var2.f11210b == 0 && r(childAt2)) {
                int i14 = x1Var2.f11209a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i14, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        x1 x1VarG = layoutParams == null ? g() : !checkLayoutParams(layoutParams) ? h(layoutParams) : (x1) layoutParams;
        x1VarG.f11210b = 1;
        if (!z2 || this.B == null) {
            addView(view, x1VarG);
        } else {
            view.setLayoutParams(x1VarG);
            this.f813a0.add(view);
        }
    }

    public final void c() {
        if (this.A == null) {
            t tVar = new t(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.A = tVar;
            tVar.setImageDrawable(this.f822f);
            this.A.setContentDescription(this.f830z);
            x1 x1VarG = g();
            x1VarG.f11209a = (this.G & 112) | 8388611;
            x1VarG.f11210b = 2;
            this.A.setLayoutParams(x1VarG);
            this.A.setOnClickListener(new com.google.android.material.datepicker.l(this, 1));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof x1);
    }

    public final void d() {
        if (this.M == null) {
            o1 o1Var = new o1();
            o1Var.f11147a = 0;
            o1Var.f11148b = 0;
            o1Var.f11149c = Integer.MIN_VALUE;
            o1Var.f11150d = Integer.MIN_VALUE;
            o1Var.f11151e = 0;
            o1Var.f11152f = 0;
            o1Var.f11153g = false;
            o1Var.f11154h = false;
            this.M = o1Var;
        }
    }

    public final void e() {
        if (this.f812a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f812a = actionMenuView;
            actionMenuView.setPopupTheme(this.D);
            this.f812a.setOnMenuItemClickListener(this.f821e0);
            ActionMenuView actionMenuView2 = this.f812a;
            c cVar = new c(this, 9);
            actionMenuView2.getClass();
            actionMenuView2.M = cVar;
            x1 x1VarG = g();
            x1VarG.f11209a = (this.G & 112) | 8388613;
            this.f812a.setLayoutParams(x1VarG);
            b(this.f812a, false);
        }
        ActionMenuView actionMenuView3 = this.f812a;
        if (actionMenuView3.I == null) {
            h hVar = (h) actionMenuView3.getMenu();
            if (this.f824g0 == null) {
                this.f824g0 = new w1(this);
            }
            this.f812a.setExpandedActionViewsExclusive(true);
            hVar.b(this.f824g0, this.C);
            s();
        }
    }

    public final void f() {
        if (this.f818d == null) {
            this.f818d = new t(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            x1 x1VarG = g();
            x1VarG.f11209a = (this.G & 112) | 8388611;
            this.f818d.setLayoutParams(x1VarG);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return h(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        t tVar = this.A;
        if (tVar != null) {
            return tVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        t tVar = this.A;
        if (tVar != null) {
            return tVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        o1 o1Var = this.M;
        if (o1Var != null) {
            return o1Var.f11153g ? o1Var.f11147a : o1Var.f11148b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.O;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        o1 o1Var = this.M;
        if (o1Var != null) {
            return o1Var.f11147a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        o1 o1Var = this.M;
        if (o1Var != null) {
            return o1Var.f11148b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        o1 o1Var = this.M;
        if (o1Var != null) {
            return o1Var.f11153g ? o1Var.f11148b : o1Var.f11147a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.N;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        h hVar;
        ActionMenuView actionMenuView = this.f812a;
        return (actionMenuView == null || (hVar = actionMenuView.I) == null || !hVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.O, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.N, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        u uVar = this.f820e;
        if (uVar != null) {
            return uVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        u uVar = this.f820e;
        if (uVar != null) {
            return uVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f812a.getMenu();
    }

    public View getNavButtonView() {
        return this.f818d;
    }

    public CharSequence getNavigationContentDescription() {
        t tVar = this.f818d;
        if (tVar != null) {
            return tVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        t tVar = this.f818d;
        if (tVar != null) {
            return tVar.getDrawable();
        }
        return null;
    }

    public m.h getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f812a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.C;
    }

    public int getPopupTheme() {
        return this.D;
    }

    public CharSequence getSubtitle() {
        return this.R;
    }

    public final TextView getSubtitleTextView() {
        return this.f816c;
    }

    public CharSequence getTitle() {
        return this.Q;
    }

    public int getTitleMarginBottom() {
        return this.L;
    }

    public int getTitleMarginEnd() {
        return this.J;
    }

    public int getTitleMarginStart() {
        return this.I;
    }

    public int getTitleMarginTop() {
        return this.K;
    }

    public final TextView getTitleTextView() {
        return this.f814b;
    }

    public m0 getWrapper() {
        Drawable drawable;
        if (this.f823f0 == null) {
            a2 a2Var = new a2();
            a2Var.f11058l = 0;
            a2Var.f11048a = this;
            a2Var.f11055h = getTitle();
            a2Var.f11056i = getSubtitle();
            a2Var.f11054g = a2Var.f11055h != null;
            a2Var.f11053f = getNavigationIcon();
            ac.d dVarF = ac.d.F(getContext(), null, a.f8047a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) dVarF.f374c;
            a2Var.f11059m = dVarF.l(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                a2Var.f11054g = true;
                a2Var.f11055h = text;
                if ((a2Var.f11049b & 8) != 0) {
                    setTitle(text);
                    if (a2Var.f11054g) {
                        l0.m(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                a2Var.f11056i = text2;
                if ((a2Var.f11049b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableL = dVarF.l(20);
            if (drawableL != null) {
                a2Var.f11052e = drawableL;
                a2Var.c();
            }
            Drawable drawableL2 = dVarF.l(17);
            if (drawableL2 != null) {
                a2Var.f11051d = drawableL2;
                a2Var.c();
            }
            if (a2Var.f11053f == null && (drawable = a2Var.f11059m) != null) {
                a2Var.f11053f = drawable;
                if ((a2Var.f11049b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            a2Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = a2Var.f11050c;
                if (view != null && (a2Var.f11049b & 16) != 0) {
                    removeView(view);
                }
                a2Var.f11050c = viewInflate;
                if (viewInflate != null && (a2Var.f11049b & 16) != 0) {
                    addView(viewInflate);
                }
                a2Var.a(a2Var.f11049b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.M.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.E = resourceId2;
                g0 g0Var = this.f814b;
                if (g0Var != null) {
                    g0Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.F = resourceId3;
                g0 g0Var2 = this.f816c;
                if (g0Var2 != null) {
                    g0Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            dVarF.I();
            if (R.string.abc_action_bar_up_description != a2Var.f11058l) {
                a2Var.f11058l = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i10 = a2Var.f11058l;
                    a2Var.j = i10 != 0 ? getContext().getString(i10) : null;
                    a2Var.b();
                }
            }
            a2Var.j = getNavigationContentDescription();
            setNavigationOnClickListener(new com.google.android.material.datepicker.l(a2Var));
            this.f823f0 = a2Var;
        }
        return this.f823f0;
    }

    public final int i(View view, int i10) {
        x1 x1Var = (x1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int i12 = x1Var.f11209a & 112;
        if (i12 != 16 && i12 != 48 && i12 != 80) {
            i12 = this.P & 112;
        }
        if (i12 == 48) {
            return getPaddingTop() - i11;
        }
        if (i12 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) x1Var).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i13 = ((ViewGroup.MarginLayoutParams) x1Var).topMargin;
        if (iMax < i13) {
            iMax = i13;
        } else {
            int i14 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i15 = ((ViewGroup.MarginLayoutParams) x1Var).bottomMargin;
            if (i14 < i15) {
                iMax = Math.max(0, iMax - (i15 - i14));
            }
        }
        return paddingTop + iMax;
    }

    public final void l() {
        ArrayList arrayList = this.f819d0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f817c0.f12661c).iterator();
        while (it.hasNext()) {
            ((b0) it.next()).f18612a.k();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f819d0 = currentMenuItems2;
    }

    public final boolean m(View view) {
        return view.getParent() == this || this.f813a0.contains(view);
    }

    public final int n(View view, int i10, int i11, int[] iArr) {
        x1 x1Var = (x1) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) x1Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int i13 = i(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, i13, iMax + measuredWidth, view.getMeasuredHeight() + i13);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) x1Var).rightMargin + iMax;
    }

    public final int o(View view, int i10, int i11, int[] iArr) {
        x1 x1Var = (x1) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) x1Var).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int i13 = i(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, i13, iMax, view.getMeasuredHeight() + i13);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) x1Var).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f829l0);
        s();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.V = false;
        }
        if (!this.V) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.V = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.V = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x028f A[LOOP:0: B:102:0x028d->B:103:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a7 A[LOOP:1: B:105:0x02a5->B:106:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c7 A[LOOP:2: B:108:0x02c5->B:109:0x02c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x031a A[LOOP:3: B:117:0x0318->B:118:0x031a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0218  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        char c6;
        Object[] objArr;
        int iJ;
        int iMax;
        int iCombineMeasuredStates;
        int iJ2;
        int iK;
        int iCombineMeasuredStates2;
        int iMax2;
        int i12 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c6 = 0;
        } else {
            c6 = 1;
            objArr = false;
        }
        if (r(this.f818d)) {
            q(this.f818d, i10, 0, i11, this.H);
            iJ = j(this.f818d) + this.f818d.getMeasuredWidth();
            iMax = Math.max(0, k(this.f818d) + this.f818d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f818d.getMeasuredState());
        } else {
            iJ = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (r(this.A)) {
            q(this.A, i10, 0, i11, this.H);
            iJ = j(this.A) + this.A.getMeasuredWidth();
            iMax = Math.max(iMax, k(this.A) + this.A.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.A.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iJ);
        int iMax4 = Math.max(0, currentContentInsetStart - iJ);
        Object[] objArr2 = objArr;
        int[] iArr = this.f815b0;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (r(this.f812a)) {
            q(this.f812a, i10, iMax3, i11, this.H);
            iJ2 = j(this.f812a) + this.f812a.getMeasuredWidth();
            iMax = Math.max(iMax, k(this.f812a) + this.f812a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f812a.getMeasuredState());
        } else {
            iJ2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iJ2);
        iArr[c6] = Math.max(0, currentContentInsetEnd - iJ2);
        if (r(this.B)) {
            iMax5 += p(this.B, i10, iMax5, i11, 0, iArr);
            iMax = Math.max(iMax, k(this.B) + this.B.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.B.getMeasuredState());
        }
        if (r(this.f820e)) {
            iMax5 += p(this.f820e, i10, iMax5, i11, 0, iArr);
            iMax = Math.max(iMax, k(this.f820e) + this.f820e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f820e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((x1) childAt.getLayoutParams()).f11210b == 0 && r(childAt)) {
                iMax5 += p(childAt, i10, iMax5, i11, 0, iArr);
                int iMax6 = Math.max(iMax, k(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i14 = iMax5;
        int i15 = this.K + this.L;
        int i16 = this.I + this.J;
        if (r(this.f814b)) {
            p(this.f814b, i10, i14 + i16, i11, i15, iArr);
            int iJ3 = j(this.f814b) + this.f814b.getMeasuredWidth();
            iK = k(this.f814b) + this.f814b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f814b.getMeasuredState());
            iMax2 = iJ3;
        } else {
            iK = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (r(this.f816c)) {
            iMax2 = Math.max(iMax2, p(this.f816c, i10, i14 + i16, i11, i15 + iK, iArr));
            iK += k(this.f816c) + this.f816c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f816c.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iK);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i14 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16);
        if (!this.f825h0) {
            i12 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i17 = 0; i17 < childCount2; i17++) {
            View childAt2 = getChildAt(i17);
            if (r(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i12 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i12);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof z1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z1 z1Var = (z1) parcelable;
        super.onRestoreInstanceState(z1Var.f9454a);
        ActionMenuView actionMenuView = this.f812a;
        h hVar = actionMenuView != null ? actionMenuView.I : null;
        int i10 = z1Var.f11216c;
        if (i10 != 0 && this.f824g0 != null && hVar != null && (menuItemFindItem = hVar.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (z1Var.f11217d) {
            d dVar = this.f829l0;
            removeCallbacks(dVar);
            post(dVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        d();
        o1 o1Var = this.M;
        boolean z2 = i10 == 1;
        if (z2 == o1Var.f11153g) {
            return;
        }
        o1Var.f11153g = z2;
        if (!o1Var.f11154h) {
            o1Var.f11147a = o1Var.f11151e;
            o1Var.f11148b = o1Var.f11152f;
            return;
        }
        if (z2) {
            int i11 = o1Var.f11150d;
            if (i11 == Integer.MIN_VALUE) {
                i11 = o1Var.f11151e;
            }
            o1Var.f11147a = i11;
            int i12 = o1Var.f11149c;
            if (i12 == Integer.MIN_VALUE) {
                i12 = o1Var.f11152f;
            }
            o1Var.f11148b = i12;
            return;
        }
        int i13 = o1Var.f11149c;
        if (i13 == Integer.MIN_VALUE) {
            i13 = o1Var.f11151e;
        }
        o1Var.f11147a = i13;
        int i14 = o1Var.f11150d;
        if (i14 == Integer.MIN_VALUE) {
            i14 = o1Var.f11152f;
        }
        o1Var.f11148b = i14;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        m.h hVar;
        e eVar;
        i iVar;
        z1 z1Var = new z1(super.onSaveInstanceState());
        w1 w1Var = this.f824g0;
        if (w1Var != null && (iVar = w1Var.f11200b) != null) {
            z1Var.f11216c = iVar.f9796a;
        }
        ActionMenuView actionMenuView = this.f812a;
        z1Var.f11217d = (actionMenuView == null || (hVar = actionMenuView.L) == null || (eVar = hVar.K) == null || !eVar.b()) ? false : true;
        return z1Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.U = false;
        }
        if (!this.U) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.U = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.U = false;
        return true;
    }

    public final int p(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i15) + Math.max(0, i14);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + iMax + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void q(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i13 >= 0) {
            if (mode != 0) {
                i13 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i13);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean r(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void s() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = v1.a(this);
            w1 w1Var = this.f824g0;
            boolean z2 = (w1Var == null || w1Var.f11200b == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.f828k0) ? false : true;
            if (z2 && this.f827j0 == null) {
                if (this.f826i0 == null) {
                    this.f826i0 = v1.b(new u1(this, 0));
                }
                v1.c(onBackInvokedDispatcherA, this.f826i0);
                this.f827j0 = onBackInvokedDispatcherA;
                return;
            }
            if (z2 || (onBackInvokedDispatcher = this.f827j0) == null) {
                return;
            }
            v1.d(onBackInvokedDispatcher, this.f826i0);
            this.f827j0 = null;
        }
    }

    public void setBackInvokedCallbackEnabled(boolean z2) {
        if (this.f828k0 != z2) {
            this.f828k0 = z2;
            s();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(v.G(getContext(), i10));
    }

    public void setCollapsible(boolean z2) {
        this.f825h0 = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.O) {
            this.O = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.N) {
            this.N = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(v.G(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(v.G(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f818d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f812a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.D != i10) {
            this.D = i10;
            if (i10 == 0) {
                this.C = getContext();
            } else {
                this.C = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.L = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.J = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.I = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.K = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.P = 8388627;
        this.W = new ArrayList();
        this.f813a0 = new ArrayList();
        this.f815b0 = new int[2];
        this.f817c0 = new l(new u1(this, 1));
        this.f819d0 = new ArrayList();
        this.f821e0 = new k(this, 14);
        this.f829l0 = new d(this, 13);
        Context context2 = getContext();
        int[] iArr = a.f8064s;
        ac.d dVarF = ac.d.F(context2, attributeSet, iArr, R.attr.toolbarStyle);
        l0.k(this, context, iArr, attributeSet, (TypedArray) dVarF.f374c, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) dVarF.f374c;
        this.E = typedArray.getResourceId(28, 0);
        this.F = typedArray.getResourceId(19, 0);
        this.P = typedArray.getInteger(0, 8388627);
        this.G = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.L = dimensionPixelOffset;
        this.K = dimensionPixelOffset;
        this.J = dimensionPixelOffset;
        this.I = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.I = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.J = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.K = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.L = dimensionPixelOffset5;
        }
        this.H = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        o1 o1Var = this.M;
        o1Var.f11154h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            o1Var.f11151e = dimensionPixelSize;
            o1Var.f11147a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            o1Var.f11152f = dimensionPixelSize2;
            o1Var.f11148b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            o1Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.N = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.O = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f822f = dVarF.l(4);
        this.f830z = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.C = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableL = dVarF.l(16);
        if (drawableL != null) {
            setNavigationIcon(drawableL);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableL2 = dVarF.l(11);
        if (drawableL2 != null) {
            setLogo(drawableL2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(dVarF.i(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(dVarF.i(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        dVarF.I();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        x1 x1Var = new x1(context, attributeSet);
        x1Var.f11209a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f8048b);
        x1Var.f11209a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        x1Var.f11210b = 0;
        return x1Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        t tVar = this.A;
        if (tVar != null) {
            tVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.A.setImageDrawable(drawable);
        } else {
            t tVar = this.A;
            if (tVar != null) {
                tVar.setImageDrawable(this.f822f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f820e == null) {
                this.f820e = new u(getContext(), null, 0);
            }
            if (!m(this.f820e)) {
                b(this.f820e, true);
            }
        } else {
            u uVar = this.f820e;
            if (uVar != null && m(uVar)) {
                removeView(this.f820e);
                this.f813a0.remove(this.f820e);
            }
        }
        u uVar2 = this.f820e;
        if (uVar2 != null) {
            uVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f820e == null) {
            this.f820e = new u(getContext(), null, 0);
        }
        u uVar = this.f820e;
        if (uVar != null) {
            uVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        t tVar = this.f818d;
        if (tVar != null) {
            tVar.setContentDescription(charSequence);
            b2.a(this.f818d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!m(this.f818d)) {
                b(this.f818d, true);
            }
        } else {
            t tVar = this.f818d;
            if (tVar != null && m(tVar)) {
                removeView(this.f818d);
                this.f813a0.remove(this.f818d);
            }
        }
        t tVar2 = this.f818d;
        if (tVar2 != null) {
            tVar2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            g0 g0Var = this.f816c;
            if (g0Var != null && m(g0Var)) {
                removeView(this.f816c);
                this.f813a0.remove(this.f816c);
            }
        } else {
            if (this.f816c == null) {
                Context context = getContext();
                g0 g0Var2 = new g0(context, null);
                this.f816c = g0Var2;
                g0Var2.setSingleLine();
                this.f816c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.F;
                if (i10 != 0) {
                    this.f816c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.T;
                if (colorStateList != null) {
                    this.f816c.setTextColor(colorStateList);
                }
            }
            if (!m(this.f816c)) {
                b(this.f816c, true);
            }
        }
        g0 g0Var3 = this.f816c;
        if (g0Var3 != null) {
            g0Var3.setText(charSequence);
        }
        this.R = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.T = colorStateList;
        g0 g0Var = this.f816c;
        if (g0Var != null) {
            g0Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            g0 g0Var = this.f814b;
            if (g0Var != null && m(g0Var)) {
                removeView(this.f814b);
                this.f813a0.remove(this.f814b);
            }
        } else {
            if (this.f814b == null) {
                Context context = getContext();
                g0 g0Var2 = new g0(context, null);
                this.f814b = g0Var2;
                g0Var2.setSingleLine();
                this.f814b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.E;
                if (i10 != 0) {
                    this.f814b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.S;
                if (colorStateList != null) {
                    this.f814b.setTextColor(colorStateList);
                }
            }
            if (!m(this.f814b)) {
                b(this.f814b, true);
            }
        }
        g0 g0Var3 = this.f814b;
        if (g0Var3 != null) {
            g0Var3.setText(charSequence);
        }
        this.Q = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.S = colorStateList;
        g0 g0Var = this.f814b;
        if (g0Var != null) {
            g0Var.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(y1 y1Var) {
    }
}
