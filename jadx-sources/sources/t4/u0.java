package t4;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f15780a;

    /* renamed from: b, reason: collision with root package name */
    public float f15781b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f15782c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15783d;

    public u0(int i10, Interpolator interpolator, long j) {
        this.f15780a = i10;
        this.f15782c = interpolator;
        this.f15783d = j;
    }

    public float a() {
        return 1.0f;
    }

    public long b() {
        return this.f15783d;
    }

    public float c() {
        Interpolator interpolator = this.f15782c;
        return interpolator != null ? interpolator.getInterpolation(this.f15781b) : this.f15781b;
    }

    public int d() {
        return this.f15780a;
    }

    public void e(float f10) {
        this.f15781b = f10;
    }
}
