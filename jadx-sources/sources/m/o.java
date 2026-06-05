package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.anonlab.voidlauncher.R;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class o extends CheckBox {

    /* renamed from: a, reason: collision with root package name */
    public final f1.r1 f11143a;

    /* renamed from: b, reason: collision with root package name */
    public final m f11144b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f11145c;

    /* renamed from: d, reason: collision with root package name */
    public s f11146d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.chipStyle);
        s1.a(context);
        r1.a(getContext(), this);
        this.f11143a = new f1.r1(this);
        Context context2 = getContext();
        int[] iArr = i.a.j;
        ac.d dVarF = ac.d.F(context2, attributeSet, iArr, R.attr.chipStyle);
        TypedArray typedArray = (TypedArray) dVarF.f374c;
        t4.l0.k(this, getContext(), iArr, attributeSet, (TypedArray) dVarF.f374c, R.attr.chipStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setButtonDrawable(u6.v.G(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setButtonDrawable(u6.v.G(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setButtonTintList(dVarF.i(2));
            }
            if (typedArray.hasValue(3)) {
                setButtonTintMode(n0.b(typedArray.getInt(3, -1), null));
            }
            dVarF.I();
            m mVar = new m(this);
            this.f11144b = mVar;
            mVar.d(attributeSet, R.attr.chipStyle);
            c0 c0Var = new c0(this);
            this.f11145c = c0Var;
            c0Var.d(attributeSet, R.attr.chipStyle);
            getEmojiTextViewHelper().a(attributeSet, R.attr.chipStyle);
        } catch (Throwable th2) {
            dVarF.I();
            throw th2;
        }
    }

    private s getEmojiTextViewHelper() {
        if (this.f11146d == null) {
            this.f11146d = new s(this);
        }
        return this.f11146d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        m mVar = this.f11144b;
        if (mVar != null) {
            mVar.a();
        }
        c0 c0Var = this.f11145c;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        m mVar = this.f11144b;
        if (mVar != null) {
            return mVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        m mVar = this.f11144b;
        if (mVar != null) {
            return mVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        f1.r1 r1Var = this.f11143a;
        if (r1Var != null) {
            return (ColorStateList) r1Var.f6438e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        f1.r1 r1Var = this.f11143a;
        if (r1Var != null) {
            return (PorterDuff.Mode) r1Var.f6439f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        ak.g gVar = this.f11145c.f11069h;
        if (gVar != null) {
            return (ColorStateList) gVar.f636c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        ak.g gVar = this.f11145c.f11069h;
        if (gVar != null) {
            return (PorterDuff.Mode) gVar.f637d;
        }
        return null;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        ((a.a) getEmojiTextViewHelper().f11179b.f5001a).V(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        m mVar = this.f11144b;
        if (mVar != null) {
            mVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        m mVar = this.f11144b;
        if (mVar != null) {
            mVar.f(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        f1.r1 r1Var = this.f11143a;
        if (r1Var != null) {
            if (r1Var.f6436c) {
                r1Var.f6436c = false;
            } else {
                r1Var.f6436c = true;
                r1Var.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f11145c;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f11145c;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        ((a.a) getEmojiTextViewHelper().f11179b.f5001a).W(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((a.a) getEmojiTextViewHelper().f11179b.f5001a).C(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        m mVar = this.f11144b;
        if (mVar != null) {
            mVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        m mVar = this.f11144b;
        if (mVar != null) {
            mVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        f1.r1 r1Var = this.f11143a;
        if (r1Var != null) {
            r1Var.f6438e = colorStateList;
            r1Var.f6434a = true;
            r1Var.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        f1.r1 r1Var = this.f11143a;
        if (r1Var != null) {
            r1Var.f6439f = mode;
            r1Var.f6435b = true;
            r1Var.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        c0 c0Var = this.f11145c;
        c0Var.f(colorStateList);
        c0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        c0 c0Var = this.f11145c;
        c0Var.g(mode);
        c0Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(u6.v.G(getContext(), i10));
    }
}
