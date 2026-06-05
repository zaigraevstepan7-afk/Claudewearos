package j6;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k extends f {

    /* renamed from: c, reason: collision with root package name */
    public final OnBackInvokedDispatcher f8724c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8725d;

    /* renamed from: e, reason: collision with root package name */
    public final OnBackInvokedCallback f8726e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8727f;

    public k(OnBackInvokedDispatcher onBackInvokedDispatcher, int i10) {
        this.f8724c = onBackInvokedDispatcher;
        this.f8725d = i10;
        this.f8726e = Build.VERSION.SDK_INT == 33 ? new l(this, 0) : new m(this);
    }

    @Override // j6.f
    public final void b(boolean z2) {
        if (z2 && !this.f8727f) {
            this.f8724c.registerOnBackInvokedCallback(this.f8725d, this.f8726e);
            this.f8727f = true;
        } else {
            if (z2 || !this.f8727f) {
                return;
            }
            this.f8724c.unregisterOnBackInvokedCallback(this.f8726e);
            this.f8727f = false;
        }
    }
}
