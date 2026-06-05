package ef;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f5980a;

    public c(float f10) {
        this.f5980a = f10;
    }

    @Override // ef.d
    public final float a(RectF rectF) {
        float fMin = Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
        float f10 = this.f5980a;
        if (f10 < 0.0f) {
            return 0.0f;
        }
        return f10 > fMin ? fMin : f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f5980a == ((c) obj).f5980a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f5980a)});
    }
}
