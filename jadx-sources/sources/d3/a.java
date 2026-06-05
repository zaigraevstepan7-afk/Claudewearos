package d3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f4703a;

    /* renamed from: b, reason: collision with root package name */
    public final pi.c f4704b;

    public a(String str, pi.c cVar) {
        this.f4703a = str;
        this.f4704b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return fj.l.b(this.f4703a, aVar.f4703a) && fj.l.b(this.f4704b, aVar.f4704b);
    }

    public final int hashCode() {
        String str = this.f4703a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        pi.c cVar = this.f4704b;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f4703a + ", action=" + this.f4704b + ')';
    }
}
