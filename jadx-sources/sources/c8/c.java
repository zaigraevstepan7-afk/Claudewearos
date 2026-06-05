package c8;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f3111a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f3112b;

    public c(String str, long j) {
        this.f3111a = str;
        this.f3112b = Long.valueOf(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Long l10 = cVar.f3112b;
        if (!this.f3111a.equals(cVar.f3111a)) {
            return false;
        }
        Long l11 = this.f3112b;
        return l11 != null ? l11.equals(l10) : l10 == null;
    }

    public final int hashCode() {
        int iHashCode = this.f3111a.hashCode() * 31;
        Long l10 = this.f3112b;
        return iHashCode + (l10 != null ? l10.hashCode() : 0);
    }
}
