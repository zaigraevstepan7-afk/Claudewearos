package hi;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RenderEffect;
import android.os.Build;
import fi.e;
import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ColorMatrixColorFilter f8015a = new ColorMatrixColorFilter(new ColorMatrix(new float[]{1.3935f, -0.3575f, -0.036f, 0.0f, 0.0f, -0.1065f, 1.1425f, -0.036f, 0.0f, 0.0f, -0.1065f, -0.3575f, 1.464f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));

    public static final void a(e eVar) {
        l.f(eVar, "<this>");
        ColorMatrixColorFilter colorMatrixColorFilter = f8015a;
        l.f(colorMatrixColorFilter, "colorFilter");
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        RenderEffect renderEffect = eVar.f6759f;
        eVar.f6759f = renderEffect != null ? RenderEffect.createColorFilterEffect(colorMatrixColorFilter, renderEffect) : RenderEffect.createColorFilterEffect(colorMatrixColorFilter);
    }
}
