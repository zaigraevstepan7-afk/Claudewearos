package hf;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f7946a;

    /* renamed from: b, reason: collision with root package name */
    public final q f7947b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f7948c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f7949d;

    public r(q qVar) {
        this.f7946a = qVar.f7939a;
        this.f7947b = qVar;
        this.f7948c = qVar.getContext();
        this.f7949d = qVar.f7945z;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public AccessibilityManager.TouchExplorationStateChangeListener h() {
        return null;
    }

    public boolean i(int i10) {
        return true;
    }

    public boolean j() {
        return this instanceof m;
    }

    public boolean k() {
        return false;
    }

    public final void p() {
        this.f7947b.f(false);
    }

    public void a() {
    }

    public void b() {
    }

    public void q() {
    }

    public void r() {
    }

    public void l(EditText editText) {
    }

    public void m(u4.e eVar) {
    }

    public void n(AccessibilityEvent accessibilityEvent) {
    }

    public void o(boolean z2) {
    }
}
