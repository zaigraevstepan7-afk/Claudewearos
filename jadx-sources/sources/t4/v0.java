package t4;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public u0 f15784a;

    public v0(int i10, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f15784a = new t0(r0.g(i10, interpolator, j));
        } else {
            this.f15784a = new q0(i10, interpolator, j);
        }
    }
}
