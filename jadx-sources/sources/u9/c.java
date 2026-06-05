package u9;

import fj.l;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final String f16873a;

    public c(String str) {
        this.f16873a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && l.b(this.f16873a, ((c) obj).f16873a);
    }

    public final int hashCode() {
        return this.f16873a.hashCode();
    }

    public final String toString() {
        return m1.j("External(packageName=", this.f16873a, ")");
    }
}
