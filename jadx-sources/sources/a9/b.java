package a9;

import fj.l;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    public final String f220a;

    public b(String str) {
        this.f220a = str;
        a[] aVarArr = a.f219a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && l.b(this.f220a, ((b) obj).f220a);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return null;
    }

    public final int hashCode() {
        return this.f220a.hashCode() * 31;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return m1.j("GeneralInternalError(errorMessage=", this.f220a, ", cause=null)");
    }
}
