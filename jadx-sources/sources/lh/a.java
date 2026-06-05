package lh;

import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f10973a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f10974b;

    public a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f10973a = str;
        this.f10974b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f10973a.equals(aVar.f10973a) && this.f10974b.equals(aVar.f10974b);
    }

    public final int hashCode() {
        return ((this.f10973a.hashCode() ^ 1000003) * 1000003) ^ this.f10974b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f10973a + ", usedDates=" + this.f10974b + "}";
    }
}
