package m;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.anonlab.voidlauncher.R;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class n extends Button {

    /* renamed from: a, reason: collision with root package name */
    public final m f11138a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f11139b;

    /* renamed from: c, reason: collision with root package name */
    public s f11140c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialButtonStyle);
        s1.a(context);
        r1.a(getContext(), this);
        m mVar = new m(this);
        this.f11138a = mVar;
        mVar.d(attributeSet, R.attr.materialButtonStyle);
        c0 c0Var = new c0(this);
        this.f11139b = c0Var;
        c0Var.d(attributeSet, R.attr.materialButtonStyle);
        c0Var.b();
        getEmojiTextViewHelper().a(attributeSet, R.attr.materialButtonStyle);
    }

    private s getEmojiTextViewHelper() {
        if (this.f11140c == null) {
            this.f11140c = new s(this);
        }
        return this.f11140c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m mVar = this.f11138a;
        if (mVar != null) {
            mVar.a();
        }
        c0 c0Var = this.f11139b;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof y4.g ? ((y4.g) customSelectionActionModeCallback).f20220a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        m mVar = this.f11138a;
        if (mVar != null) {
            return mVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        m mVar = this.f11138a;
        if (mVar != null) {
            return mVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        ak.g gVar = this.f11139b.f11069h;
        if (gVar != null) {
            return (ColorStateList) gVar.f636c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        ak.g gVar = this.f11139b.f11069h;
        if (gVar != null) {
            return (PorterDuff.Mode) gVar.f637d;
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z2, int i10, int i11, int i12, int i13) {
        super.onLayout(z2, i10, i11, i12, i13);
        c0 c0Var = this.f11139b;
        if (c0Var != null) {
            c0Var.getClass();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        ((a.a) getEmojiTextViewHelper().f11179b.f5001a).V(z2);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        super.setAutoSizeTextTypeWithDefaults(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        m mVar = this.f11138a;
        if (mVar != null) {
            mVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        m mVar = this.f11138a;
        if (mVar != null) {
            mVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(u3.c.t(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        ((a.a) getEmojiTextViewHelper().f11179b.f5001a).W(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((a.a) getEmojiTextViewHelper().f11179b.f5001a).C(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z2) {
        c0 c0Var = this.f11139b;
        if (c0Var != null) {
            c0Var.f11062a.setAllCaps(z2);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        m mVar = this.f11138a;
        if (mVar != null) {
            mVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        m mVar = this.f11138a;
        if (mVar != null) {
            mVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        c0 c0Var = this.f11139b;
        c0Var.f(colorStateList);
        c0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        c0 c0Var = this.f11139b;
        c0Var.g(mode);
        c0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) throws Resources.NotFoundException {
        super.setTextAppearance(context, i10);
        c0 c0Var = this.f11139b;
        if (c0Var != null) {
            c0Var.e(context, i10);
        }
    }
}
