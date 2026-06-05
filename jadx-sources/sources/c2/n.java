package c2;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final ColorFilter f3019a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3020b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3021c;

    public n(long j, int i10) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            a.k();
            porterDuffColorFilter = a.d(e0.E(j), e0.A(i10));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(e0.E(j), e0.H(i10));
        }
        this.f3019a = porterDuffColorFilter;
        this.f3020b = j;
        this.f3021c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return w.d(this.f3020b, nVar.f3020b) && this.f3021c == nVar.f3021c;
    }

    public final int hashCode() {
        int i10 = w.f3059i;
        return Integer.hashCode(this.f3021c) + (Long.hashCode(this.f3020b) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BlendModeColorFilter(color=");
        m1.q(this.f3020b, sb2, ", blendMode=");
        sb2.append((Object) e0.I(this.f3021c));
        sb2.append(')');
        return sb2.toString();
    }
}
