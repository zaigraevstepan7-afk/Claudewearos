package t4;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class o1 extends yd.f {

    /* renamed from: h, reason: collision with root package name */
    public final WindowInsetsController f15761h;

    /* renamed from: i, reason: collision with root package name */
    public final Window f15762i;

    public o1(Window window, p7.k kVar) {
        this.f15761h = window.getInsetsController();
        this.f15762i = window;
    }

    @Override // yd.f
    public final void e0(boolean z2) {
        Window window = this.f15762i;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f15761h.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f15761h.setSystemBarsAppearance(0, 16);
    }

    @Override // yd.f
    public final void f0(boolean z2) {
        Window window = this.f15762i;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f15761h.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f15761h.setSystemBarsAppearance(0, 8);
    }
}
