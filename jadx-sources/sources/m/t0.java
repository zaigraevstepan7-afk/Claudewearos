package m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.anonlab.voidlauncher.R;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class t0 extends ListView {
    public boolean A;
    public final boolean B;
    public boolean C;
    public y4.d D;
    public ah.d E;

    /* renamed from: a, reason: collision with root package name */
    public final Rect f11185a;

    /* renamed from: b, reason: collision with root package name */
    public int f11186b;

    /* renamed from: c, reason: collision with root package name */
    public int f11187c;

    /* renamed from: d, reason: collision with root package name */
    public int f11188d;

    /* renamed from: e, reason: collision with root package name */
    public int f11189e;

    /* renamed from: f, reason: collision with root package name */
    public int f11190f;

    /* renamed from: z, reason: collision with root package name */
    public r0 f11191z;

    public t0(Context context, boolean z2) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f11185a = new Rect();
        this.f11186b = 0;
        this.f11187c = 0;
        this.f11188d = 0;
        this.f11189e = 0;
        this.B = z2;
        setCacheColorHint(0);
    }

    public final int a(int i10, int i11) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i12 = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i14 = layoutParams.height;
            view.measure(i10, i14 > 0 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i13 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i11) {
                return i11;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.view.MotionEvent r18, int r19) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.t0.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f11185a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.E != null) {
            return;
        }
        super.drawableStateChanged();
        r0 r0Var = this.f11191z;
        if (r0Var != null) {
            r0Var.f11170b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.C && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.B || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.B || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.B || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.B && this.A) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.E = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i10 = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.E == null) {
            ah.d dVar = new ah.d(this, 11);
            this.E = dVar;
            post(dVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i10 < 30 || !p0.f11161d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        p0.f11158a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        p0.f11159b.invoke(this, Integer.valueOf(iPointToPosition));
                        p0.f11160c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e10) {
                        e10.printStackTrace();
                    } catch (InvocationTargetException e11) {
                        e11.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.C && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f11190f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        ah.d dVar = this.E;
        if (dVar != null) {
            t0 t0Var = (t0) dVar.f462b;
            t0Var.E = null;
            t0Var.removeCallbacks(dVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.A = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        r0 r0Var = null;
        if (drawable != null) {
            r0 r0Var2 = new r0();
            Drawable drawable2 = r0Var2.f11169a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            r0Var2.f11169a = drawable;
            drawable.setCallback(r0Var2);
            r0Var2.f11170b = true;
            r0Var = r0Var2;
        }
        this.f11191z = r0Var;
        super.setSelector(r0Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f11186b = rect.left;
        this.f11187c = rect.top;
        this.f11188d = rect.right;
        this.f11189e = rect.bottom;
    }
}
