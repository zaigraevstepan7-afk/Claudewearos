package r3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final i f13677d = new i(f.f13672c, 17, 0);

    /* renamed from: a, reason: collision with root package name */
    public final float f13678a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13679b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13680c;

    public i(float f10, int i10, int i11) {
        this.f13678a = f10;
        this.f13679b = i10;
        this.f13680c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        float f10 = iVar.f13678a;
        float f11 = f.f13671b;
        return Float.compare(this.f13678a, f10) == 0 && this.f13679b == iVar.f13679b && this.f13680c == iVar.f13680c;
    }

    public final int hashCode() {
        float f10 = f.f13671b;
        return Integer.hashCode(this.f13680c) + gk.b.g(this.f13679b, Float.hashCode(this.f13678a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LineHeightStyle(alignment=");
        sb2.append((Object) f.b(this.f13678a));
        sb2.append(", trim=");
        String str = "Invalid";
        int i10 = this.f13679b;
        sb2.append((Object) (i10 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i10 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i10 == 17 ? "LineHeightStyle.Trim.Both" : i10 == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb2.append(",mode=");
        int i11 = this.f13680c;
        if (i11 == 0) {
            str = "LineHeightStyle.Mode.Fixed";
        } else if (i11 == 1) {
            str = "LineHeightStyle.Mode.Minimum";
        } else if (i11 == 2) {
            str = "LineHeightStyle.Mode.Tight";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}
