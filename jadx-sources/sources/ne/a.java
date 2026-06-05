package ne;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f12301a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final a6.a f12302b = new a6.a(a6.a.f185d);

    /* renamed from: c, reason: collision with root package name */
    public static final a6.a f12303c = new a6.a();

    /* renamed from: d, reason: collision with root package name */
    public static final a6.a f12304d = new a6.a(a6.a.f186e);

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f10, float f11, float f12) {
        return gk.b.e(f11, f10, f12, f10);
    }

    public static float b(float f10, float f11, float f12, float f13, float f14) {
        return f14 <= f12 ? f10 : f14 >= f13 ? f11 : a(f10, f11, (f14 - f12) / (f13 - f12));
    }

    public static int c(float f10, int i10, int i11) {
        return Math.round(f10 * (i11 - i10)) + i10;
    }
}
