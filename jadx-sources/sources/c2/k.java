package c2;

import android.graphics.PathMeasure;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f3014a;

    public k(PathMeasure pathMeasure) {
        this.f3014a = pathMeasure;
    }

    public final boolean a(float f10, float f11, j jVar) {
        if (jVar == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return this.f3014a.getSegment(f10, f11, jVar.f3006a, true);
    }
}
