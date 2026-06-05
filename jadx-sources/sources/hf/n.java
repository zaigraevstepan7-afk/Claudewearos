package hf;

import android.text.Editable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class n extends ze.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f7932a;

    public n(q qVar) {
        this.f7932a = qVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f7932a.b().a();
    }

    @Override // ze.j, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.f7932a.b().b();
    }
}
