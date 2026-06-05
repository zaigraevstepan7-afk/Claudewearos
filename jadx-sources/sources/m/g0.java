package m;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class g0 extends TextView {

    /* renamed from: a, reason: collision with root package name */
    public final m f11092a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f11093b;

    /* renamed from: c, reason: collision with root package name */
    public final mh.g f11094c;

    /* renamed from: d, reason: collision with root package name */
    public s f11095d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11096e;

    /* renamed from: f, reason: collision with root package name */
    public ag.i f11097f;

    /* renamed from: z, reason: collision with root package name */
    public Future f11098z;

    public g0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private s getEmojiTextViewHelper() {
        if (this.f11095d == null) {
            this.f11095d = new s(this);
        }
        return this.f11095d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m mVar = this.f11092a;
        if (mVar != null) {
            mVar.a();
        }
        c0 c0Var = this.f11093b;
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public d0 getSuperCaller() {
        if (this.f11097f == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.f11097f = new f0(this);
            } else if (i10 >= 28) {
                this.f11097f = new e0(this);
            } else {
                this.f11097f = new ag.i(this, 12);
            }
        }
        return this.f11097f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        m mVar = this.f11092a;
        if (mVar != null) {
            return mVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        m mVar = this.f11092a;
        if (mVar != null) {
            return mVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        ak.g gVar = this.f11093b.f11069h;
        if (gVar != null) {
            return (ColorStateList) gVar.f636c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        ak.g gVar = this.f11093b.f11069h;
        if (gVar != null) {
            return (PorterDuff.Mode) gVar.f637d;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f11098z;
        if (future != null) {
            try {
                this.f11098z = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                u3.c.j(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        mh.g gVar;
        if (Build.VERSION.SDK_INT >= 28 || (gVar = this.f11094c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) gVar.f11708c;
        return textClassifier == null ? x.a((TextView) gVar.f11707b) : textClassifier;
    }

    public r4.c getTextMetricsParamsCompat() {
        return u3.c.j(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f11093b.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            u3.c.o(editorInfo, getText());
        }
        u6.v.R(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i10, int i11, int i12, int i13) {
        super.onLayout(z2, i10, i11, i12, i13);
        c0 c0Var = this.f11093b;
        if (c0Var != null) {
            c0Var.getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        Future future = this.f11098z;
        if (future != null) {
            try {
                this.f11098z = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                u3.c.j(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        ((a.a) getEmojiTextViewHelper().f11179b.f5001a).V(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        super.setAutoSizeTextTypeWithDefaults(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        m mVar = this.f11092a;
        if (mVar != null) {
            mVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        m mVar = this.f11092a;
        if (mVar != null) {
            mVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f11093b;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f11093b;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f11093b;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f11093b;
        if (c0Var != null) {
            c0Var.b();
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().u(i10);
        } else {
            u3.c.n(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().g(i10);
        } else {
            u3.c.p(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        u3.c.q(this, i10);
    }

    public void setPrecomputedText(r4.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        u3.c.j(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        m mVar = this.f11092a;
        if (mVar != null) {
            mVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        m mVar = this.f11092a;
        if (mVar != null) {
            mVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        c0 c0Var = this.f11093b;
        c0Var.f(colorStateList);
        c0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        c0 c0Var = this.f11093b;
        c0Var.g(mode);
        c0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        c0 c0Var = this.f11093b;
        if (c0Var != null) {
            c0Var.e(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        mh.g gVar;
        if (Build.VERSION.SDK_INT >= 28 || (gVar = this.f11094c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            gVar.f11708c = textClassifier;
        }
    }

    public void setTextFuture(Future<r4.d> future) {
        this.f11098z = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(r4.c cVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f13713b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i10 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i10 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i10 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i10 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i10 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i10 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i10 = 7;
            }
        }
        setTextDirection(i10);
        getPaint().set(cVar.f13712a);
        setBreakStrategy(cVar.f13714c);
        setHyphenationFrequency(cVar.f13715d);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i10) {
        Typeface typefaceCreate;
        if (this.f11096e) {
            return;
        }
        if (typeface == null || i10 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            uk.c cVar = l4.f.f9974a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i10);
        }
        this.f11096e = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f11096e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        s1.a(context);
        this.f11096e = false;
        this.f11097f = null;
        r1.a(getContext(), this);
        m mVar = new m(this);
        this.f11092a = mVar;
        mVar.d(attributeSet, i10);
        c0 c0Var = new c0(this);
        this.f11093b = c0Var;
        c0Var.d(attributeSet, i10);
        c0Var.b();
        mh.g gVar = new mh.g(21, false);
        gVar.f11707b = this;
        this.f11094c = gVar;
        getEmojiTextViewHelper().a(attributeSet, i10);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i10, float f10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            getSuperCaller().y(i10, f10);
        } else if (i11 >= 34) {
            t4.v.k(this, i10, f10);
        } else {
            u3.c.q(this, Math.round(TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? u6.v.G(context, i10) : null, i11 != 0 ? u6.v.G(context, i11) : null, i12 != 0 ? u6.v.G(context, i12) : null, i13 != 0 ? u6.v.G(context, i13) : null);
        c0 c0Var = this.f11093b;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? u6.v.G(context, i10) : null, i11 != 0 ? u6.v.G(context, i11) : null, i12 != 0 ? u6.v.G(context, i12) : null, i13 != 0 ? u6.v.G(context, i13) : null);
        c0 c0Var = this.f11093b;
        if (c0Var != null) {
            c0Var.b();
        }
    }
}
