package ef;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final float f5971a;

    public a(float f10) {
        this.f5971a = f10;
    }

    @Override // ef.d
    public final float a(RectF rectF) {
        return this.f5971a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f5971a == ((a) obj).f5971a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f5971a)});
    }

    public final String toString() {
        return this.f5971a + "px";
    }
}
