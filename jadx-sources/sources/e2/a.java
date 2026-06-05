package e2;

import c2.u;
import fj.l;
import s3.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public s3.c f5733a;

    /* renamed from: b, reason: collision with root package name */
    public m f5734b;

    /* renamed from: c, reason: collision with root package name */
    public u f5735c;

    /* renamed from: d, reason: collision with root package name */
    public long f5736d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.b(this.f5733a, aVar.f5733a) && this.f5734b == aVar.f5734b && l.b(this.f5735c, aVar.f5735c) && b2.e.a(this.f5736d, aVar.f5736d);
    }

    public final int hashCode() {
        return Long.hashCode(this.f5736d) + ((this.f5735c.hashCode() + ((this.f5734b.hashCode() + (this.f5733a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f5733a + ", layoutDirection=" + this.f5734b + ", canvas=" + this.f5735c + ", size=" + ((Object) b2.e.h(this.f5736d)) + ')';
    }
}
