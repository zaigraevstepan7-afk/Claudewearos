package w2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p0 extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f18352a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f18353b;

    public p0(Context context) {
        super(context);
        setClipChildren(false);
        this.f18352a = new HashMap();
        this.f18353b = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<v3.h, v2.f0> getHolderToLayoutNode() {
        return this.f18352a;
    }

    public final HashMap<v2.f0, v3.h> getLayoutNodeToHolder() {
        return this.f18353b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i10, int i11, int i12, int i13) {
        for (v3.h hVar : this.f18352a.keySet()) {
            hVar.layout(hVar.getLeft(), hVar.getTop(), hVar.getRight(), hVar.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (!(View.MeasureSpec.getMode(i10) == 1073741824)) {
            s2.a.a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i11) == 1073741824)) {
            s2.a.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        for (v3.h hVar : this.f18352a.keySet()) {
            int i13 = hVar.O;
            if (i13 != Integer.MIN_VALUE && (i12 = hVar.P) != Integer.MIN_VALUE) {
                hVar.measure(i13, i12);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            v2.f0 f0Var = (v2.f0) this.f18352a.get(childAt);
            if (childAt.isLayoutRequested() && f0Var != null) {
                v2.f0.V(f0Var, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }
}
