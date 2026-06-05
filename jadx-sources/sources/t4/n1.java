package t4;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n1 extends yd.f {

    /* renamed from: h, reason: collision with root package name */
    public final Window f15752h;

    public n1(Window window, p7.k kVar) {
        this.f15752h = window;
    }

    @Override // yd.f
    public final void e0(boolean z2) {
        if (!z2) {
            s0(16);
            return;
        }
        Window window = this.f15752h;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
    }

    @Override // yd.f
    public final void f0(boolean z2) {
        if (!z2) {
            s0(8192);
            return;
        }
        Window window = this.f15752h;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
    }

    public final void s0(int i10) {
        View decorView = this.f15752h.getDecorView();
        decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
    }
}
