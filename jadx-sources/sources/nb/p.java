package nb;

import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f12051a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12052b;

    public p(String str, String str2) {
        this.f12051a = str;
        this.f12052b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return fj.l.b(this.f12051a, pVar.f12051a) && fj.l.b(this.f12052b, pVar.f12052b);
    }

    public final int hashCode() {
        return this.f12052b.hashCode() + (this.f12051a.hashCode() * 31);
    }

    public final String toString() {
        return m1.k("ProPricingLabels(monthlyLabel=", this.f12051a, ", yearlyLabel=", this.f12052b, ")");
    }
}
