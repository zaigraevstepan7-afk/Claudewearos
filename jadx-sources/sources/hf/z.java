package hf;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import m.g0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class z extends t4.b {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f7996d;

    public z(TextInputLayout textInputLayout) {
        this.f7996d = textInputLayout;
    }

    @Override // t4.b
    public final void d(View view, u4.e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f16615a;
        this.f15694a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f7996d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z2 = textInputLayout.O0;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z10 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        w wVar = textInputLayout.f3949b;
        g0 g0Var = wVar.f7985b;
        if (g0Var.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(g0Var);
            accessibilityNodeInfo.setTraversalAfter(g0Var);
        } else {
            accessibilityNodeInfo.setTraversalAfter(wVar.f7987d);
        }
        if (!zIsEmpty) {
            eVar.l(text);
        } else if (!TextUtils.isEmpty(string)) {
            eVar.l(string);
            if (!z2 && placeholderText != null) {
                eVar.l(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            eVar.l(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            accessibilityNodeInfo.setHintText(string);
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z10) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        g0 g0Var2 = textInputLayout.D.f7979y;
        if (g0Var2 != null) {
            accessibilityNodeInfo.setLabelFor(g0Var2);
        }
        textInputLayout.f3951c.b().m(eVar);
    }

    @Override // t4.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f7996d.f3951c.b().n(accessibilityEvent);
    }
}
