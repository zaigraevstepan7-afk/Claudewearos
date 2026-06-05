package hf;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class x implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public int f7991a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f7992b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f7993c;

    public x(TextInputLayout textInputLayout, EditText editText) {
        this.f7993c = textInputLayout;
        this.f7992b = editText;
        this.f7991a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) throws Resources.NotFoundException {
        TextInputLayout textInputLayout = this.f7993c;
        textInputLayout.w(!textInputLayout.U0, false);
        if (textInputLayout.E) {
            textInputLayout.p(editable);
        }
        if (textInputLayout.M) {
            textInputLayout.x(editable);
        }
        EditText editText = this.f7992b;
        int lineCount = editText.getLineCount();
        int i10 = this.f7991a;
        if (lineCount != i10) {
            if (lineCount < i10) {
                int minimumHeight = editText.getMinimumHeight();
                int i11 = textInputLayout.N0;
                if (minimumHeight != i11) {
                    editText.setMinimumHeight(i11);
                }
            }
            this.f7991a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
