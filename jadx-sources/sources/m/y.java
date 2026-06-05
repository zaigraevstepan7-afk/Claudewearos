package m;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y extends k4.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11211e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11212f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WeakReference f11213g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c0 f11214h;

    public y(c0 c0Var, int i10, int i11, WeakReference weakReference) {
        this.f11214h = c0Var;
        this.f11211e = i10;
        this.f11212f = i11;
        this.f11213g = weakReference;
    }

    @Override // k4.b
    public final void h(Typeface typeface) {
        int i10;
        if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f11211e) != -1) {
            typeface = b0.a(typeface, i10, (this.f11212f & 2) != 0);
        }
        c0 c0Var = this.f11214h;
        if (c0Var.f11073m) {
            c0Var.f11072l = typeface;
            TextView textView = (TextView) this.f11213g.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new b8.e(textView, c0Var.j, 1, typeface));
                } else {
                    textView.setTypeface(typeface, c0Var.j);
                }
            }
        }
    }

    @Override // k4.b
    public final void g(int i10) {
    }
}
