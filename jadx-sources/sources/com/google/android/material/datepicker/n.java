package com.google.android.material.datepicker;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3873a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3874b;

    public /* synthetic */ n(Object obj, int i10) {
        this.f3873a = i10;
        this.f3874b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3873a) {
            case 0:
                ((p) this.f3874b).O();
                throw null;
            case 1:
                hf.d dVar = (hf.d) this.f3874b;
                EditText editText = dVar.f7905i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                dVar.p();
                return;
            case 2:
                ((hf.m) this.f3874b).t();
                return;
            default:
                hf.v vVar = (hf.v) this.f3874b;
                EditText editText2 = vVar.f7982f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = vVar.f7982f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    vVar.f7982f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    vVar.f7982f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    vVar.f7982f.setSelection(selectionEnd);
                }
                vVar.p();
                return;
        }
    }
}
