package c2;

import android.graphics.RenderEffect;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r extends r0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f3033b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3034c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3035d;

    public r(float f10, float f11, int i10) {
        this.f3033b = f10;
        this.f3034c = f11;
        this.f3035d = i10;
    }

    @Override // c2.r0
    public final RenderEffect b() {
        float f10 = this.f3033b;
        float f11 = this.f3034c;
        return (f10 == 0.0f && f11 == 0.0f) ? RenderEffect.createOffsetEffect(0.0f, 0.0f) : RenderEffect.createBlurEffect(f10, f11, e0.D(this.f3035d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f3033b == rVar.f3033b && this.f3034c == rVar.f3034c && this.f3035d == rVar.f3035d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3035d) + gk.b.f(this.f3034c, Float.hashCode(this.f3033b) * 31, 31);
    }

    public final String toString() {
        return "BlurEffect(renderEffect=null, radiusX=" + this.f3033b + ", radiusY=" + this.f3034c + ", edgeTreatment=" + ((Object) e0.J(this.f3035d)) + ')';
    }
}
