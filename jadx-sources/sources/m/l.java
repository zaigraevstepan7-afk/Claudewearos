package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class l extends AutoCompleteTextView {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f11120d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final m f11121a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f11122b;

    /* renamed from: c, reason: collision with root package name */
    public final t0.j f11123c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.anonlab.voidlauncher.R.attr.autoCompleteTextViewStyle);
        s1.a(context);
        r1.a(getContext(), this);
        ac.d dVarF = ac.d.F(getContext(), attributeSet, f11120d, com.anonlab.voidlauncher.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) dVarF.f374c).hasValue(0)) {
            setDropDownBackgroundDrawable(dVarF.l(0));
        }
        dVarF.I();
        m mVar = new m(this);
        this.f11121a = mVar;
        mVar.d(attributeSet, com.anonlab.voidlauncher.R.attr.autoCompleteTextViewStyle);
        c0 c0Var = new c0(this);
        this.f11122b = c0Var;
        c0Var.d(attributeSet, com.anonlab.voidlauncher.R.attr.autoCompleteTextViewStyle);
        c0Var.b();
        t0.j jVar = new t0.j((EditText) this);
        this.f11123c = jVar;
        jVar.o(attributeSet, com.anonlab.voidlauncher.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerN = jVar.n(keyListener);
        if (keyListenerN == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerN);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m mVar = this.f11121a;
        if (mVar != null) {
            mVar.a();
        }
        c0 c0Var = this.f11122b;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof y4.g ? ((y4.g) customSelectionActionModeCallback).f20220a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        m mVar = this.f11121a;
        if (mVar != null) {
            return mVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        m mVar = this.f11121a;
        if (mVar != null) {
            return mVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        ak.g gVar = this.f11122b.f11069h;
        if (gVar != null) {
            return (ColorStateList) gVar.f636c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        ak.g gVar = this.f11122b.f11069h;
        if (gVar != null) {
            return (PorterDuff.Mode) gVar.f637d;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        u6.v.R(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.f11123c.p(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        m mVar = this.f11121a;
        if (mVar != null) {
            mVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        m mVar = this.f11121a;
        if (mVar != null) {
            mVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f11122b;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f11122b;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(u3.c.t(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(u6.v.G(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f11123c.u(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f11123c.n(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        m mVar = this.f11121a;
        if (mVar != null) {
            mVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        m mVar = this.f11121a;
        if (mVar != null) {
            mVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        c0 c0Var = this.f11122b;
        c0Var.f(colorStateList);
        c0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        c0 c0Var = this.f11122b;
        c0Var.g(mode);
        c0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) throws Resources.NotFoundException {
        super.setTextAppearance(context, i10);
        c0 c0Var = this.f11122b;
        if (c0Var != null) {
            c0Var.e(context, i10);
        }
    }
}
