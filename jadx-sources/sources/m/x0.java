package m;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class x0 extends ViewGroup {
    public boolean A;
    public int[] B;
    public int[] C;
    public Drawable D;
    public int E;
    public int F;
    public int G;
    public int H;

    /* renamed from: a, reason: collision with root package name */
    public boolean f11202a;

    /* renamed from: b, reason: collision with root package name */
    public int f11203b;

    /* renamed from: c, reason: collision with root package name */
    public int f11204c;

    /* renamed from: d, reason: collision with root package name */
    public int f11205d;

    /* renamed from: e, reason: collision with root package name */
    public int f11206e;

    /* renamed from: f, reason: collision with root package name */
    public int f11207f;

    /* renamed from: z, reason: collision with root package name */
    public float f11208z;

    public x0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, 0);
        this.f11202a = true;
        this.f11203b = -1;
        this.f11204c = 0;
        this.f11206e = 8388659;
        int[] iArr = i.a.f8056k;
        ac.d dVarF = ac.d.F(context, attributeSet, iArr, 0);
        t4.l0.k(this, context, iArr, attributeSet, (TypedArray) dVarF.f374c, 0);
        TypedArray typedArray = (TypedArray) dVarF.f374c;
        int i11 = typedArray.getInt(1, -1);
        if (i11 >= 0) {
            setOrientation(i11);
        }
        int i12 = typedArray.getInt(0, -1);
        if (i12 >= 0) {
            setGravity(i12);
        }
        boolean z2 = typedArray.getBoolean(2, true);
        if (!z2) {
            setBaselineAligned(z2);
        }
        this.f11208z = typedArray.getFloat(4, -1.0f);
        this.f11203b = typedArray.getInt(3, -1);
        this.A = typedArray.getBoolean(7, false);
        setDividerDrawable(dVarF.l(5));
        this.G = typedArray.getInt(8, 0);
        this.H = typedArray.getDimensionPixelSize(6, 0);
        dVarF.I();
    }

    public final void c(Canvas canvas, int i10) {
        this.D.setBounds(getPaddingLeft() + this.H, i10, (getWidth() - getPaddingRight()) - this.H, this.F + i10);
        this.D.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof w0;
    }

    public final void d(Canvas canvas, int i10) {
        this.D.setBounds(i10, getPaddingTop() + this.H, this.E + i10, (getHeight() - getPaddingBottom()) - this.H);
        this.D.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public w0 generateDefaultLayoutParams() {
        int i10 = this.f11205d;
        if (i10 == 0) {
            return new w0(-2, -2);
        }
        if (i10 == 1) {
            return new w0(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public w0 generateLayoutParams(AttributeSet attributeSet) {
        return new w0(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public w0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof w0 ? new w0((w0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new w0((ViewGroup.MarginLayoutParams) layoutParams) : new w0(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f11203b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f11203b;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f11203b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f11204c;
        if (this.f11205d == 1 && (i10 = this.f11206e & 112) != 48) {
            if (i10 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f11207f) / 2;
            } else if (i10 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f11207f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((w0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f11203b;
    }

    public Drawable getDividerDrawable() {
        return this.D;
    }

    public int getDividerPadding() {
        return this.H;
    }

    public int getDividerWidth() {
        return this.E;
    }

    public int getGravity() {
        return this.f11206e;
    }

    public int getOrientation() {
        return this.f11205d;
    }

    public int getShowDividers() {
        return this.G;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f11208z;
    }

    public final boolean h(int i10) {
        if (i10 == 0) {
            return (this.G & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.G & 4) != 0;
        }
        if ((this.G & 2) != 0) {
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i10;
        if (this.D == null) {
            return;
        }
        int i11 = 0;
        if (this.f11205d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i11 < virtualChildCount) {
                View childAt = getChildAt(i11);
                if (childAt != null && childAt.getVisibility() != 8 && h(i11)) {
                    c(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((w0) childAt.getLayoutParams())).topMargin) - this.F);
                }
                i11++;
            }
            if (h(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                c(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.F : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((w0) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z2 = getLayoutDirection() == 1;
        while (i11 < virtualChildCount2) {
            View childAt3 = getChildAt(i11);
            if (childAt3 != null && childAt3.getVisibility() != 8 && h(i11)) {
                w0 w0Var = (w0) childAt3.getLayoutParams();
                d(canvas, z2 ? childAt3.getRight() + ((LinearLayout.LayoutParams) w0Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) w0Var).leftMargin) - this.E);
            }
            i11++;
        }
        if (h(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                w0 w0Var2 = (w0) childAt4.getLayoutParams();
                if (z2) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) w0Var2).leftMargin;
                    i10 = this.E;
                    right = left - i10;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) w0Var2).rightMargin;
                }
            } else if (z2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i10 = this.E;
                right = left - i10;
            }
            d(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a7  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.x0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.x0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z2) {
        this.f11202a = z2;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f11203b = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.D) {
            return;
        }
        this.D = drawable;
        if (drawable != null) {
            this.E = drawable.getIntrinsicWidth();
            this.F = drawable.getIntrinsicHeight();
        } else {
            this.E = 0;
            this.F = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.H = i10;
    }

    public void setGravity(int i10) {
        if (this.f11206e != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f11206e = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f11206e;
        if ((8388615 & i12) != i11) {
            this.f11206e = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.A = z2;
    }

    public void setOrientation(int i10) {
        if (this.f11205d != i10) {
            this.f11205d = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.G) {
            requestLayout();
        }
        this.G = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f11206e;
        if ((i12 & 112) != i11) {
            this.f11206e = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f11208z = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
