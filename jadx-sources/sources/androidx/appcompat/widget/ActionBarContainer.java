package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.anonlab.voidlauncher.R;
import h8.k;
import i.a;
import m.p1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public boolean A;
    public final int B;

    /* renamed from: a, reason: collision with root package name */
    public boolean f777a;

    /* renamed from: b, reason: collision with root package name */
    public View f778b;

    /* renamed from: c, reason: collision with root package name */
    public View f779c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f780d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f781e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f782f;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f783z;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new k(this, 1));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f8047a);
        boolean z2 = false;
        this.f780d = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f781e = typedArrayObtainStyledAttributes.getDrawable(2);
        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f783z = true;
            this.f782f = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f783z ? !(this.f780d != null || this.f781e != null) : this.f782f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f780d;
        if (drawable != null && drawable.isStateful()) {
            this.f780d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f781e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f781e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f782f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f782f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f780d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f781e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f782f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f778b = findViewById(R.id.action_bar);
        this.f779c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f777a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i10, int i11, int i12, int i13) {
        super.onLayout(z2, i10, i11, i12, i13);
        boolean z10 = true;
        if (this.f783z) {
            Drawable drawable = this.f782f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z10 = false;
            }
        } else {
            if (this.f780d == null) {
                z10 = false;
            } else if (this.f778b.getVisibility() == 0) {
                this.f780d.setBounds(this.f778b.getLeft(), this.f778b.getTop(), this.f778b.getRight(), this.f778b.getBottom());
            } else {
                View view = this.f779c;
                if (view == null || view.getVisibility() != 0) {
                    this.f780d.setBounds(0, 0, 0, 0);
                } else {
                    this.f780d.setBounds(this.f779c.getLeft(), this.f779c.getTop(), this.f779c.getRight(), this.f779c.getBottom());
                }
            }
            this.A = false;
        }
        if (z10) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.f778b == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.B) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f778b == null) {
            return;
        }
        View.MeasureSpec.getMode(i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f780d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f780d);
        }
        this.f780d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f778b;
            if (view != null) {
                this.f780d.setBounds(view.getLeft(), this.f778b.getTop(), this.f778b.getRight(), this.f778b.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f783z ? !(this.f780d != null || this.f781e != null) : this.f782f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f782f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f782f);
        }
        this.f782f = drawable;
        boolean z2 = this.f783z;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z2 && (drawable2 = this.f782f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z2 ? !(this.f780d != null || this.f781e != null) : this.f782f == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f781e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f781e);
        }
        this.f781e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.A && this.f781e != null) {
                throw null;
            }
        }
        boolean z2 = false;
        if (!this.f783z ? !(this.f780d != null || this.f781e != null) : this.f782f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z2) {
        this.f777a = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z2 = i10 == 0;
        Drawable drawable = this.f780d;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f781e;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f782f;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f780d;
        boolean z2 = this.f783z;
        if (drawable == drawable2 && !z2) {
            return true;
        }
        if (drawable == this.f781e && this.A) {
            return true;
        }
        return (drawable == this.f782f && z2) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    public void setTabContainer(p1 p1Var) {
    }
}
