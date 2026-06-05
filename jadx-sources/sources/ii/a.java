package ii;

import fj.l;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final a f8575e = new a(null, 15);

    /* renamed from: f, reason: collision with root package name */
    public static final a f8576f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f8577g;

    /* renamed from: a, reason: collision with root package name */
    public final float f8578a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8579b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8580c;

    /* renamed from: d, reason: collision with root package name */
    public final h f8581d;

    static {
        h.f8596a.getClass();
        f8576f = new a(e.f8588c, 7);
        f8577g = new a(e.f8589d, 7);
    }

    public a(float f10, float f11, float f12, h hVar) {
        l.f(hVar, "style");
        this.f8578a = f10;
        this.f8579b = f11;
        this.f8580c = f12;
        this.f8581d = hVar;
    }

    public static a a(a aVar, float f10, float f11, float f12, int i10) {
        if ((i10 & 1) != 0) {
            f10 = aVar.f8578a;
        }
        if ((i10 & 2) != 0) {
            f11 = aVar.f8579b;
        }
        h hVar = aVar.f8581d;
        aVar.getClass();
        l.f(hVar, "style");
        return new a(f10, f11, f12, hVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s3.f.e(this.f8578a, aVar.f8578a) && s3.f.e(this.f8579b, aVar.f8579b) && Float.compare(this.f8580c, aVar.f8580c) == 0 && l.b(this.f8581d, aVar.f8581d);
    }

    public final int hashCode() {
        return this.f8581d.hashCode() + gk.b.f(this.f8580c, gk.b.f(this.f8579b, Float.hashCode(this.f8578a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM = m1.m("Highlight(width=", s3.f.f(this.f8578a), ", blurRadius=", s3.f.f(this.f8579b), ", alpha=");
        sbM.append(this.f8580c);
        sbM.append(", style=");
        sbM.append(this.f8581d);
        sbM.append(")");
        return sbM.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(h hVar, int i10) {
        if ((i10 & 8) != 0) {
            h.f8596a.getClass();
            hVar = e.f8587b;
        }
        this(0.5f, 0.25f, 1.0f, hVar);
    }
}
