package r3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final float f13671b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f13672c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f13673d;

    /* renamed from: a, reason: collision with root package name */
    public final float f13674a;

    static {
        a(0.0f);
        a(0.5f);
        f13671b = 0.5f;
        a(-1.0f);
        f13672c = -1.0f;
        a(1.0f);
        f13673d = 1.0f;
    }

    public static void a(float f10) {
        if ((0.0f > f10 || f10 > 1.0f) && f10 != -1.0f) {
            m3.a.b("topRatio should be in [0..1] range or -1");
        }
    }

    public static String b(float f10) {
        if (f10 == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f10 == f13671b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f10 == f13672c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f10 == f13673d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f10 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f13674a, ((f) obj).f13674a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13674a);
    }

    public final String toString() {
        return b(this.f13674a);
    }
}
