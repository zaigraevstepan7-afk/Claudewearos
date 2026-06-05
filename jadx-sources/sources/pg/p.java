package pg;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12923a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f12924b;

    public p(ArrayList arrayList, HashMap map) {
        this.f12923a = arrayList;
        this.f12924b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f12923a.equals(pVar.f12923a)) {
            return this.f12924b.equals(pVar.f12924b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12924b.hashCode() + (this.f12923a.hashCode() * 31);
    }

    public final String toString() {
        return hj.a.E(this.f12923a) + " (params: " + this.f12924b + ")";
    }
}
