package t4;

import android.view.WindowInsetsAnimation;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t0 extends u0 {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f15778e;

    public t0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f15778e = windowInsetsAnimation;
    }

    @Override // t4.u0
    public final float a() {
        return this.f15778e.getAlpha();
    }

    @Override // t4.u0
    public final long b() {
        return this.f15778e.getDurationMillis();
    }

    @Override // t4.u0
    public final float c() {
        return this.f15778e.getInterpolatedFraction();
    }

    @Override // t4.u0
    public final int d() {
        return this.f15778e.getTypeMask();
    }

    @Override // t4.u0
    public final void e(float f10) {
        this.f15778e.setFraction(f10);
    }
}
