package c2;

import android.graphics.RenderEffect;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public RenderEffect f3036a;

    public final RenderEffect a() {
        RenderEffect renderEffect = this.f3036a;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect renderEffectB = b();
        this.f3036a = renderEffectB;
        return renderEffectB;
    }

    public abstract RenderEffect b();
}
