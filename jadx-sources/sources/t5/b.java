package t5;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import r5.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f15802a;

    /* renamed from: b, reason: collision with root package name */
    public final x9.b f15803b;

    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        x9.b bVar = new x9.b(12);
        super(inputConnection, false);
        this.f15802a = editText;
        this.f15803b = bVar;
        if (k.d()) {
            k.a().i(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        Editable editableText = this.f15802a.getEditableText();
        this.f15803b.getClass();
        return x9.b.i(this, editableText, i10, i11, false) || super.deleteSurroundingText(i10, i11);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        Editable editableText = this.f15802a.getEditableText();
        this.f15803b.getClass();
        return x9.b.i(this, editableText, i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11);
    }
}
