package hf;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f7933a;

    public o(q qVar) {
        this.f7933a = qVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        q qVar = this.f7933a;
        n nVar = qVar.O;
        if (qVar.L == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = qVar.L;
        if (editText != null) {
            editText.removeTextChangedListener(nVar);
            if (qVar.L.getOnFocusChangeListener() == qVar.b().e()) {
                qVar.L.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        qVar.L = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(nVar);
        }
        qVar.b().l(qVar.L);
        qVar.j(qVar.b());
    }
}
