package b3;

import fj.l;
import i2.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final f f1515a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1516b;

    public a(f fVar, int i10) {
        this.f1515a = fVar;
        this.f1516b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.b(this.f1515a, aVar.f1515a) && this.f1516b == aVar.f1516b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1516b) + (this.f1515a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageVectorEntry(imageVector=");
        sb2.append(this.f1515a);
        sb2.append(", configFlags=");
        return m6.a.g(sb2, this.f1516b, ')');
    }
}
