package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.datepicker.j;
import k4.l;
import l.i;
import l.o;
import m.b2;
import m.w0;
import t4.l0;
import ze.d;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class NavigationMenuItemView extends d implements o {

    /* renamed from: c0, reason: collision with root package name */
    public static final int[] f3917c0 = {R.attr.state_checked};
    public int O;
    public boolean P;
    public boolean Q;
    public final boolean R;
    public final CheckedTextView S;
    public FrameLayout T;
    public i U;
    public ColorStateList V;
    public boolean W;

    /* renamed from: a0, reason: collision with root package name */
    public Drawable f3918a0;

    /* renamed from: b0, reason: collision with root package name */
    public final j f3919b0;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.R = true;
        j jVar = new j(this, 3);
        this.f3919b0 = jVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.anonlab.voidlauncher.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.anonlab.voidlauncher.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.anonlab.voidlauncher.R.id.design_menu_item_text);
        this.S = checkedTextView;
        l0.l(checkedTextView, jVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.T == null) {
                this.T = (FrameLayout) ((ViewStub) findViewById(com.anonlab.voidlauncher.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.T.removeAllViews();
            this.T.addView(view);
        }
    }

    @Override // l.o
    public final void b(i iVar) throws Resources.NotFoundException {
        StateListDrawable stateListDrawable;
        this.U = iVar;
        int i10 = iVar.f9796a;
        if (i10 > 0) {
            setId(i10);
        }
        setVisibility(iVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.anonlab.voidlauncher.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f3917c0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.f9800e);
        setIcon(iVar.getIcon());
        View view = iVar.f9820z;
        if (view == null) {
            view = null;
        }
        setActionView(view);
        setContentDescription(iVar.f9811q);
        b2.a(this, iVar.f9812r);
        i iVar2 = this.U;
        CharSequence charSequence = iVar2.f9800e;
        CheckedTextView checkedTextView = this.S;
        if (charSequence == null && iVar2.getIcon() == null) {
            View view2 = this.U.f9820z;
            if ((view2 != null ? view2 : null) != null) {
                checkedTextView.setVisibility(8);
                FrameLayout frameLayout = this.T;
                if (frameLayout != null) {
                    w0 w0Var = (w0) frameLayout.getLayoutParams();
                    ((LinearLayout.LayoutParams) w0Var).width = -1;
                    this.T.setLayoutParams(w0Var);
                    return;
                }
                return;
            }
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.T;
        if (frameLayout2 != null) {
            w0 w0Var2 = (w0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) w0Var2).width = -2;
            this.T.setLayoutParams(w0Var2);
        }
    }

    @Override // l.o
    public i getItemData() {
        return this.U;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        i iVar = this.U;
        if (iVar != null && iVar.isCheckable() && this.U.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f3917c0);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.Q != z2) {
            this.Q = z2;
            this.f3919b0.h(this.S, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.S;
        checkedTextView.setChecked(z2);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z2 && this.R) ? 1 : 0);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) throws Resources.NotFoundException {
        if (drawable != null) {
            if (this.W) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.V);
            }
            int i10 = this.O;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.P) {
            if (this.f3918a0 == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = l.f9440a;
                Drawable drawable2 = resources.getDrawable(com.anonlab.voidlauncher.R.drawable.navigation_empty_icon, theme);
                this.f3918a0 = drawable2;
                if (drawable2 != null) {
                    int i11 = this.O;
                    drawable2.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.f3918a0;
        }
        this.S.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.S.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.O = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) throws Resources.NotFoundException {
        this.V = colorStateList;
        this.W = colorStateList != null;
        i iVar = this.U;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.S.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.P = z2;
    }

    public void setTextAppearance(int i10) {
        this.S.setTextAppearance(i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.S.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.S.setText(charSequence);
    }
}
