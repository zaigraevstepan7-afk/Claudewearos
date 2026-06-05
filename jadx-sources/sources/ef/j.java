package ef;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class j implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f6006a;

    public j(float f10) {
        this.f6006a = f10;
    }

    @Override // ef.d
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f6006a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f6006a == ((j) obj).f6006a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f6006a)});
    }

    public final String toString() {
        return m6.a.h(new StringBuilder(), (int) (this.f6006a * 100.0f), "%");
    }
}
