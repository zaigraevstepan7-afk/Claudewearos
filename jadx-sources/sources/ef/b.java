package ef;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d f5974a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5975b;

    public b(float f10, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f5974a;
            f10 += ((b) dVar).f5975b;
        }
        this.f5974a = dVar;
        this.f5975b = f10;
    }

    @Override // ef.d
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f5974a.a(rectF) + this.f5975b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f5974a.equals(bVar.f5974a) && this.f5975b == bVar.f5975b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5974a, Float.valueOf(this.f5975b)});
    }
}
