package r3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final int f13669b = 66305;

    /* renamed from: a, reason: collision with root package name */
    public final int f13670a;

    public static String a(int i10) {
        StringBuilder sb2 = new StringBuilder("LineBreak(strategy=");
        int i11 = i10 & 255;
        String str = "Invalid";
        sb2.append((Object) (i11 == 1 ? "Strategy.Simple" : i11 == 2 ? "Strategy.HighQuality" : i11 == 3 ? "Strategy.Balanced" : i11 == 0 ? "Strategy.Unspecified" : "Invalid"));
        sb2.append(", strictness=");
        int i12 = (i10 >> 8) & 255;
        sb2.append((Object) (i12 == 1 ? "Strictness.None" : i12 == 2 ? "Strictness.Loose" : i12 == 3 ? "Strictness.Normal" : i12 == 4 ? "Strictness.Strict" : i12 == 0 ? "Strictness.Unspecified" : "Invalid"));
        sb2.append(", wordBreak=");
        int i13 = (i10 >> 16) & 255;
        if (i13 == 1) {
            str = "WordBreak.None";
        } else if (i13 == 2) {
            str = "WordBreak.Phrase";
        } else if (i13 == 0) {
            str = "WordBreak.Unspecified";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f13670a == ((e) obj).f13670a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13670a);
    }

    public final String toString() {
        return a(this.f13670a);
    }
}
