package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.google.android.gms.common.api.f;
import l.g;
import l.h;
import l.i;
import lh.e;
import m.j;
import m.k;
import m.w0;
import m.x0;
import yh.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class ActionMenuView extends x0 implements g {
    public h I;
    public Context J;
    public int K;
    public m.h L;
    public c M;
    public boolean N;
    public int O;
    public final int P;
    public final int Q;
    public k R;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.P = (int) (56.0f * f10);
        this.Q = (int) (f10 * 4.0f);
        this.J = context;
        this.K = 0;
    }

    public static j i() {
        j jVar = new j(-2, -2);
        jVar.f11106a = false;
        ((LinearLayout.LayoutParams) jVar).gravity = 16;
        return jVar;
    }

    public static j j(ViewGroup.LayoutParams layoutParams) {
        j jVar;
        if (layoutParams == null) {
            return i();
        }
        if (layoutParams instanceof j) {
            j jVar2 = (j) layoutParams;
            jVar = new j(jVar2);
            jVar.f11106a = jVar2.f11106a;
        } else {
            jVar = new j(layoutParams);
        }
        if (((LinearLayout.LayoutParams) jVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) jVar).gravity = 16;
        }
        return jVar;
    }

    @Override // l.g
    public final boolean a(i iVar) {
        return this.I.p(iVar, null, 0);
    }

    @Override // m.x0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof j;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // m.x0
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ w0 generateDefaultLayoutParams() {
        return i();
    }

    @Override // m.x0
    /* renamed from: f */
    public final w0 generateLayoutParams(AttributeSet attributeSet) {
        return new j(getContext(), attributeSet);
    }

    @Override // m.x0
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ w0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    @Override // m.x0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    @Override // m.x0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public Menu getMenu() {
        if (this.I == null) {
            Context context = getContext();
            h hVar = new h(context);
            this.I = hVar;
            hVar.f9780e = new ld.i(this, 12);
            m.h hVar2 = new m.h(context);
            this.L = hVar2;
            hVar2.D = true;
            hVar2.E = true;
            hVar2.f11103e = new e();
            this.I.b(hVar2, this.J);
            m.h hVar3 = this.L;
            hVar3.f11105z = this;
            this.I = hVar3.f11101c;
        }
        return this.I;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        m.h hVar = this.L;
        m.g gVar = hVar.A;
        if (gVar != null) {
            return gVar.getDrawable();
        }
        if (hVar.C) {
            return hVar.B;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.K;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean k(int i10) {
        boolean zA = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof m.i)) {
            zA = ((m.i) childAt).a();
        }
        return (i10 <= 0 || !(childAt2 instanceof m.i)) ? zA : ((m.i) childAt2).c() | zA;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m.h hVar = this.L;
        if (hVar != null) {
            hVar.f();
            m.e eVar = this.L.K;
            if (eVar == null || !eVar.b()) {
                return;
            }
            this.L.e();
            this.L.g();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m.h hVar = this.L;
        if (hVar != null) {
            hVar.e();
            m.e eVar = hVar.L;
            if (eVar == null || !eVar.b()) {
                return;
            }
            eVar.f9831i.dismiss();
        }
    }

    @Override // m.x0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i10, int i11, int i12, int i13) {
        int width;
        int paddingLeft;
        if (!this.N) {
            super.onLayout(z2, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i12 - i10;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean z10 = getLayoutDirection() == 1;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                j jVar = (j) childAt.getLayoutParams();
                if (jVar.f11106a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z10) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) jVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) jVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) jVar).leftMargin) + ((LinearLayout.LayoutParams) jVar).rightMargin;
                    k(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        int iMax = Math.max(0, i22 > 0 ? paddingRight / i22 : 0);
        if (z10) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                j jVar2 = (j) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !jVar2.f11106a) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) jVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) jVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            j jVar3 = (j) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !jVar3.f11106a) {
                int i27 = paddingLeft2 + ((LinearLayout.LayoutParams) jVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) jVar3).rightMargin + iMax + i27;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // m.x0, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        ?? r11;
        int i14;
        int i15;
        h hVar;
        boolean z2 = this.N;
        boolean z10 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.N = z10;
        if (z2 != z10) {
            this.O = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.N && (hVar = this.I) != null && size != this.O) {
            this.O = size;
            hVar.o(true);
        }
        int childCount = getChildCount();
        if (!this.N || childCount <= 0) {
            for (int i16 = 0; i16 < childCount; i16++) {
                j jVar = (j) getChildAt(i16).getLayoutParams();
                ((LinearLayout.LayoutParams) jVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) jVar).leftMargin = 0;
            }
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(i11);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
        int i17 = size2 - paddingRight;
        int i18 = this.P;
        int i19 = i17 / i18;
        int i20 = i17 % i18;
        if (i19 == 0) {
            setMeasuredDimension(i17, 0);
            return;
        }
        int i21 = (i20 / i19) + i18;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i22 = 0;
        int iMax2 = 0;
        int i23 = 0;
        boolean z11 = false;
        int i24 = 0;
        long j = 0;
        while (true) {
            i12 = this.Q;
            if (i23 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i23);
            int i25 = size3;
            int i26 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i14 = i21;
            } else {
                boolean z12 = childAt instanceof ActionMenuItemView;
                i22++;
                if (z12) {
                    childAt.setPadding(i12, 0, i12, 0);
                }
                j jVar2 = (j) childAt.getLayoutParams();
                jVar2.f11111f = false;
                jVar2.f11108c = 0;
                jVar2.f11107b = 0;
                jVar2.f11109d = false;
                ((LinearLayout.LayoutParams) jVar2).leftMargin = 0;
                ((LinearLayout.LayoutParams) jVar2).rightMargin = 0;
                jVar2.f11110e = z12 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i27 = jVar2.f11106a ? 1 : i19;
                j jVar3 = (j) childAt.getLayoutParams();
                int i28 = i19;
                i14 = i21;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i26, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z12 ? (ActionMenuItemView) childAt : null;
                boolean z13 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z14 = z13;
                if (i27 <= 0 || (z13 && i27 < 2)) {
                    i15 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i14 * i27, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i15 = measuredWidth / i14;
                    if (measuredWidth % i14 != 0) {
                        i15++;
                    }
                    if (z14 && i15 < 2) {
                        i15 = 2;
                    }
                }
                jVar3.f11109d = !jVar3.f11106a && z14;
                jVar3.f11107b = i15;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15 * i14, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i15);
                if (jVar2.f11109d) {
                    i24++;
                }
                if (jVar2.f11106a) {
                    z11 = true;
                }
                i19 = i28 - i15;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i15 == 1) {
                    j |= 1 << i23;
                }
            }
            i23++;
            size3 = i25;
            paddingBottom = i26;
            i21 = i14;
        }
        int i29 = size3;
        int i30 = i19;
        int i31 = i21;
        boolean z15 = z11 && i22 == 2;
        int i32 = i30;
        boolean z16 = false;
        while (i24 > 0 && i32 > 0) {
            int i33 = f.API_PRIORITY_OTHER;
            long j4 = 0;
            int i34 = 0;
            int i35 = 0;
            while (i35 < childCount2) {
                int i36 = iMax;
                j jVar4 = (j) getChildAt(i35).getLayoutParams();
                boolean z17 = z15;
                if (jVar4.f11109d) {
                    int i37 = jVar4.f11107b;
                    if (i37 < i33) {
                        j4 = 1 << i35;
                        i33 = i37;
                        i34 = 1;
                    } else if (i37 == i33) {
                        j4 |= 1 << i35;
                        i34++;
                    }
                }
                i35++;
                z15 = z17;
                iMax = i36;
            }
            i13 = iMax;
            boolean z18 = z15;
            j |= j4;
            if (i34 > i32) {
                break;
            }
            int i38 = i33 + 1;
            int i39 = 0;
            while (i39 < childCount2) {
                View childAt2 = getChildAt(i39);
                j jVar5 = (j) childAt2.getLayoutParams();
                boolean z19 = z11;
                long j10 = 1 << i39;
                if ((j4 & j10) != 0) {
                    if (z18 && jVar5.f11110e) {
                        r11 = 1;
                        r11 = 1;
                        if (i32 == 1) {
                            childAt2.setPadding(i12 + i31, 0, i12, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    jVar5.f11107b += r11;
                    jVar5.f11111f = r11;
                    i32--;
                } else if (jVar5.f11107b == i38) {
                    j |= j10;
                }
                i39++;
                z11 = z19;
            }
            z15 = z18;
            iMax = i13;
            z16 = true;
        }
        i13 = iMax;
        boolean z20 = !z11 && i22 == 1;
        if (i32 > 0 && j != 0 && (i32 < i22 - 1 || z20 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z20) {
                if ((j & 1) != 0 && !((j) getChildAt(0).getLayoutParams()).f11110e) {
                    fBitCount -= 0.5f;
                }
                int i40 = childCount2 - 1;
                if ((j & (1 << i40)) != 0 && !((j) getChildAt(i40).getLayoutParams()).f11110e) {
                    fBitCount -= 0.5f;
                }
            }
            int i41 = fBitCount > 0.0f ? (int) ((i32 * i31) / fBitCount) : 0;
            boolean z21 = z16;
            for (int i42 = 0; i42 < childCount2; i42++) {
                if ((j & (1 << i42)) != 0) {
                    View childAt3 = getChildAt(i42);
                    j jVar6 = (j) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        jVar6.f11108c = i41;
                        jVar6.f11111f = true;
                        if (i42 == 0 && !jVar6.f11110e) {
                            ((LinearLayout.LayoutParams) jVar6).leftMargin = (-i41) / 2;
                        }
                        z21 = true;
                    } else if (jVar6.f11106a) {
                        jVar6.f11108c = i41;
                        jVar6.f11111f = true;
                        ((LinearLayout.LayoutParams) jVar6).rightMargin = (-i41) / 2;
                        z21 = true;
                    } else {
                        if (i42 != 0) {
                            ((LinearLayout.LayoutParams) jVar6).leftMargin = i41 / 2;
                        }
                        if (i42 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) jVar6).rightMargin = i41 / 2;
                        }
                    }
                }
            }
            z16 = z21;
        }
        if (z16) {
            for (int i43 = 0; i43 < childCount2; i43++) {
                View childAt4 = getChildAt(i43);
                j jVar7 = (j) childAt4.getLayoutParams();
                if (jVar7.f11111f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((jVar7.f11107b * i31) + jVar7.f11108c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i17, mode != 1073741824 ? i13 : i29);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.L.I = z2;
    }

    public void setOnMenuItemClickListener(k kVar) {
        this.R = kVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        m.h hVar = this.L;
        m.g gVar = hVar.A;
        if (gVar != null) {
            gVar.setImageDrawable(drawable);
        } else {
            hVar.C = true;
            hVar.B = drawable;
        }
    }

    public void setPopupTheme(int i10) {
        if (this.K != i10) {
            this.K = i10;
            if (i10 == 0) {
                this.J = getContext();
            } else {
                this.J = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(m.h hVar) {
        this.L = hVar;
        hVar.f11105z = this;
        this.I = hVar.f11101c;
    }

    @Override // m.x0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new j(getContext(), attributeSet);
    }

    public void setOverflowReserved(boolean z2) {
    }
}
