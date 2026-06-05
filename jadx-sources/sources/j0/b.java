package j0;

import s3.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float f8599a;

    public b(float f10) {
        this.f8599a = f10;
    }

    @Override // j0.a
    public final float a(long j, s3.c cVar) {
        return cVar.w0(this.f8599a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && f.e(this.f8599a, ((b) obj).f8599a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f8599a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f8599a + ".dp)";
    }
}
