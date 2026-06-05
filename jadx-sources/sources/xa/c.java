package xa;

import android.graphics.Path;
import f1.v;
import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final v f19854a = new v(new s1.g(21));

    public static final void a(Path path, float f10, float f11) {
        l.f(path, "path");
        float f12 = f10 / 2.0f;
        float f13 = f11 / 2.0f;
        float fMin = Math.min(f10, f11) / 2.0f;
        float f14 = 0.42f * fMin;
        for (int i10 = 0; i10 < 10; i10++) {
            double d10 = ((i10 * 3.141592653589793d) / 5.0d) - 1.5707963267948966d;
            double d11 = i10 % 2 == 0 ? fMin : f14;
            float fCos = (float) ((Math.cos(d10) * d11) + f12);
            float fSin = (float) ((Math.sin(d10) * d11) + f13);
            if (i10 == 0) {
                path.moveTo(fCos, fSin);
            } else {
                path.lineTo(fCos, fSin);
            }
        }
        path.close();
    }
}
