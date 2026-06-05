package hf;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.anonlab.voidlauncher.R;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class v extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f7981e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f7982f;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.android.material.datepicker.n f7983g;

    public v(q qVar, int i10) {
        super(qVar);
        this.f7981e = R.drawable.design_password_eye;
        this.f7983g = new com.google.android.material.datepicker.n(this, 3);
        if (i10 != 0) {
            this.f7981e = i10;
        }
    }

    @Override // hf.r
    public final void b() {
        p();
    }

    @Override // hf.r
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // hf.r
    public final int d() {
        return this.f7981e;
    }

    @Override // hf.r
    public final View.OnClickListener f() {
        return this.f7983g;
    }

    @Override // hf.r
    public final boolean j() {
        return true;
    }

    @Override // hf.r
    public final boolean k() {
        EditText editText = this.f7982f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // hf.r
    public final void l(EditText editText) {
        this.f7982f = editText;
        p();
    }

    @Override // hf.r
    public final void q() {
        EditText editText = this.f7982f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f7982f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // hf.r
    public final void r() {
        EditText editText = this.f7982f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
