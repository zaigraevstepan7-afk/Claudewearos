package ia;

import c2.w;
import fj.l;
import gk.b;
import java.util.List;
import mi.s;
import s3.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f8402a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8403b;

    /* renamed from: c, reason: collision with root package name */
    public final List f8404c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8405d;

    /* renamed from: e, reason: collision with root package name */
    public final s f8406e;

    public a(float f10, float f11, long j, List list, s sVar) {
        l.f(list, "tints");
        l.f(sVar, "fallbackTint");
        this.f8402a = f10;
        this.f8403b = j;
        this.f8404c = list;
        this.f8405d = f11;
        this.f8406e = sVar;
    }

    public static a a(a aVar, float f10, int i10) {
        float f11 = (i10 & 1) != 0 ? aVar.f8402a : 0.001f;
        long j = aVar.f8403b;
        List list = (i10 & 4) != 0 ? aVar.f8404c : qi.s.f13520a;
        if ((i10 & 8) != 0) {
            f10 = aVar.f8405d;
        }
        s sVar = aVar.f8406e;
        aVar.getClass();
        l.f(list, "tints");
        l.f(sVar, "fallbackTint");
        return new a(f11, f10, j, list, sVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f8402a, aVar.f8402a) == 0 && w.d(this.f8403b, aVar.f8403b) && l.b(this.f8404c, aVar.f8404c) && f.e(this.f8405d, aVar.f8405d) && l.b(this.f8406e, aVar.f8406e);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f8402a) * 31;
        int i10 = w.f3059i;
        return this.f8406e.hashCode() + b.f(this.f8405d, b.h(b.j(iHashCode, this.f8403b, 31), 31, this.f8404c), 31);
    }

    public final String toString() {
        return "BlurBackgroundConfig(noiseFactor=" + this.f8402a + ", backgroundColor=" + w.j(this.f8403b) + ", tints=" + this.f8404c + ", blurRadius=" + f.f(this.f8405d) + ", fallbackTint=" + this.f8406e + ")";
    }
}
