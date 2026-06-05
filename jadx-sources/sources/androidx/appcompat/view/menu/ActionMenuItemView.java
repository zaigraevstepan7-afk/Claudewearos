package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import l.a;
import l.b;
import l.g;
import l.h;
import l.o;
import m.b2;
import m.g0;
import m.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class ActionMenuItemView extends g0 implements o, View.OnClickListener, i {
    public l.i A;
    public CharSequence B;
    public Drawable C;
    public g D;
    public a E;
    public b F;
    public boolean G;
    public boolean H;
    public final int I;
    public int J;
    public final int K;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.G = g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.f8049c, 0, 0);
        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.K = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.J = -1;
        setSaveEnabled(false);
    }

    @Override // m.i
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // l.o
    public final void b(l.i iVar) {
        this.A = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.getTitleCondensed());
        setId(iVar.f9796a);
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.E == null) {
            this.E = new a(this);
        }
    }

    @Override // m.i
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.A.getIcon() == null;
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480) {
            return (i10 >= 640 && i11 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // l.o
    public l.i getItemData() {
        return this.A;
    }

    public final void h() {
        boolean z2 = true;
        boolean z10 = !TextUtils.isEmpty(this.B);
        if (this.C != null && ((this.A.f9819y & 4) != 4 || (!this.G && !this.H))) {
            z2 = false;
        }
        boolean z11 = z10 & z2;
        setText(z11 ? this.B : null);
        CharSequence charSequence = this.A.f9811q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z11 ? null : this.A.f9800e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.A.f9812r;
        if (TextUtils.isEmpty(charSequence2)) {
            b2.a(this, z11 ? null : this.A.f9800e);
        } else {
            b2.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        g gVar = this.D;
        if (gVar != null) {
            gVar.a(this.A);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.G = g();
        h();
    }

    @Override // m.g0, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i12 = this.J) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int i13 = this.I;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i13) : i13;
        if (mode != 1073741824 && i13 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i11);
        }
        if (!zIsEmpty || this.C == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.C.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.A.hasSubMenu() && (aVar = this.E) != null && aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z2) {
        if (this.H != z2) {
            this.H = z2;
            l.i iVar = this.A;
            if (iVar != null) {
                h hVar = iVar.f9808n;
                hVar.f9785k = true;
                hVar.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.C = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.K;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(g gVar) {
        this.D = gVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.J = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.F = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.B = charSequence;
        h();
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }
}
