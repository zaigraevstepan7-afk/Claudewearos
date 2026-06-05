package m;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.anonlab.voidlauncher.R;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class r extends EditText implements t4.n {

    /* renamed from: a, reason: collision with root package name */
    public final m f11163a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f11164b;

    /* renamed from: c, reason: collision with root package name */
    public final mh.g f11165c;

    /* renamed from: d, reason: collision with root package name */
    public final y4.h f11166d;

    /* renamed from: e, reason: collision with root package name */
    public final t0.j f11167e;

    /* renamed from: f, reason: collision with root package name */
    public q f11168f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        s1.a(context);
        r1.a(getContext(), this);
        m mVar = new m(this);
        this.f11163a = mVar;
        mVar.d(attributeSet, R.attr.editTextStyle);
        c0 c0Var = new c0(this);
        this.f11164b = c0Var;
        c0Var.d(attributeSet, R.attr.editTextStyle);
        c0Var.b();
        mh.g gVar = new mh.g(21, false);
        gVar.f11707b = this;
        this.f11165c = gVar;
        this.f11166d = new y4.h();
        t0.j jVar = new t0.j((EditText) this);
        this.f11167e = jVar;
        jVar.o(attributeSet, R.attr.editTextStyle);
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

    private q getSuperCaller() {
        if (this.f11168f == null) {
            this.f11168f = new q(this);
        }
        return this.f11168f;
    }

    @Override // t4.n
    public final t4.f a(t4.f fVar) {
        this.f11166d.getClass();
        return y4.h.a(this, fVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m mVar = this.f11163a;
        if (mVar != null) {
            mVar.a();
        }
        c0 c0Var = this.f11164b;
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
        m mVar = this.f11163a;
        if (mVar != null) {
            return mVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        m mVar = this.f11163a;
        if (mVar != null) {
            return mVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        ak.g gVar = this.f11164b.f11069h;
        if (gVar != null) {
            return (ColorStateList) gVar.f636c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        ak.g gVar = this.f11164b.f11069h;
        if (gVar != null) {
            return (PorterDuff.Mode) gVar.f637d;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        mh.g gVar;
        if (Build.VERSION.SDK_INT >= 28 || (gVar = this.f11165c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) gVar.f11708c;
        return textClassifier == null ? x.a((TextView) gVar.f11707b) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrF;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f11164b.getClass();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 && inputConnectionOnCreateInputConnection != null) {
            u3.c.o(editorInfo, getText());
        }
        u6.v.R(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && i10 <= 30 && (strArrF = t4.l0.f(this)) != null) {
            editorInfo.contentMimeTypes = strArrF;
            inputConnectionOnCreateInputConnection = new v4.b(inputConnectionOnCreateInputConnection, new t1.f(this, 1));
        }
        return this.f11167e.p(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zA = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && t4.l0.f(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = w.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        t4.c eVar;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31 || t4.l0.f(this) == null || !(i10 == 16908322 || i10 == 16908337)) {
            return super.onTextContextMenuItem(i10);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i11 >= 31) {
                eVar = new d8.e(primaryClip, 1);
            } else {
                t4.d dVar = new t4.d();
                dVar.f15712b = primaryClip;
                dVar.f15713c = 1;
                eVar = dVar;
            }
            eVar.e(i10 == 16908322 ? 0 : 1);
            t4.l0.h(this, eVar.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        m mVar = this.f11163a;
        if (mVar != null) {
            mVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        m mVar = this.f11163a;
        if (mVar != null) {
            mVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f11164b;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        c0 c0Var = this.f11164b;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(u3.c.t(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f11167e.u(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f11167e.n(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        m mVar = this.f11163a;
        if (mVar != null) {
            mVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        m mVar = this.f11163a;
        if (mVar != null) {
            mVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        c0 c0Var = this.f11164b;
        c0Var.f(colorStateList);
        c0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        c0 c0Var = this.f11164b;
        c0Var.g(mode);
        c0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) throws Resources.NotFoundException {
        super.setTextAppearance(context, i10);
        c0 c0Var = this.f11164b;
        if (c0Var != null) {
            c0Var.e(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        mh.g gVar;
        if (Build.VERSION.SDK_INT >= 28 || (gVar = this.f11165c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            gVar.f11708c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
