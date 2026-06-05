package w2;

import android.os.Build;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o0 implements h2 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f18341a;

    public o0(ViewConfiguration viewConfiguration) {
        this.f18341a = viewConfiguration;
    }

    @Override // w2.h2
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // w2.h2
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // w2.h2
    public final float c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f18341a.getScaledHandwritingSlop();
        }
        return 2.0f;
    }

    @Override // w2.h2
    public final float e() {
        return this.f18341a.getScaledMaximumFlingVelocity();
    }

    @Override // w2.h2
    public final float f() {
        return this.f18341a.getScaledTouchSlop();
    }

    @Override // w2.h2
    public final float g() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f18341a.getScaledHandwritingGestureLineMargin();
        }
        return 16.0f;
    }
}
