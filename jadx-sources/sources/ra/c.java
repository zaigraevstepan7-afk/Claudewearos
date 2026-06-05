package ra;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f13948a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13949b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13950c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13951d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f13952e;

    /* renamed from: f, reason: collision with root package name */
    public final long f13953f;

    public c(String str, long j, String str2, String str3, LinkedHashMap linkedHashMap, long j4) {
        this.f13948a = str;
        this.f13949b = j;
        this.f13950c = str2;
        this.f13951d = str3;
        this.f13952e = linkedHashMap;
        this.f13953f = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f13948a.equals(cVar.f13948a) && this.f13949b == cVar.f13949b && this.f13950c.equals(cVar.f13950c) && fj.l.b(this.f13951d, cVar.f13951d) && this.f13952e.equals(cVar.f13952e) && this.f13953f == cVar.f13953f;
    }

    public final int hashCode() {
        int iC = t.m1.c(gk.b.j(this.f13948a.hashCode() * 31, this.f13949b, 31), 31, this.f13950c);
        String str = this.f13951d;
        return Long.hashCode(this.f13953f) + ((this.f13952e.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DevLogEntry(id=");
        sb2.append(this.f13948a);
        sb2.append(", timestamp=");
        sb2.append(this.f13949b);
        t.m1.s(sb2, ", content=", this.f13950c, ", imageUrl=", this.f13951d);
        sb2.append(", reactions=");
        sb2.append(this.f13952e);
        sb2.append(", views=");
        sb2.append(this.f13953f);
        sb2.append(")");
        return sb2.toString();
    }
}
