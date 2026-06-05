package v;

import android.content.Context;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n0 extends EdgeEffect {

    /* renamed from: a, reason: collision with root package name */
    public final float f17249a;

    /* renamed from: b, reason: collision with root package name */
    public float f17250b;

    public n0(Context context) {
        super(context);
        this.f17249a = u6.v.b(context).f14739a * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i10) {
        this.f17250b = 0.0f;
        super.onAbsorb(i10);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f10, float f11) {
        this.f17250b = 0.0f;
        super.onPull(f10, f11);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f17250b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f10) {
        this.f17250b = 0.0f;
        super.onPull(f10);
    }
}
