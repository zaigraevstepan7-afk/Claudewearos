package q6;

import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f13280a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13281b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13282c;

    public c(long j, long j4, int i10) {
        this.f13280a = j;
        this.f13281b = j4;
        this.f13282c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f13280a == cVar.f13280a && this.f13281b == cVar.f13281b && this.f13282c == cVar.f13282c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13282c) + gk.b.j(Long.hashCode(this.f13280a) * 31, this.f13281b, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TaxonomyVersion=");
        sb2.append(this.f13280a);
        sb2.append(", ModelVersion=");
        sb2.append(this.f13281b);
        sb2.append(", TopicCode=");
        return m1.i("Topic { ", m6.a.h(sb2, this.f13282c, " }"));
    }
}
