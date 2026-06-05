package fj;

import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class j extends d implements i, lj.a, pi.c {

    /* renamed from: z, reason: collision with root package name */
    public final int f6799z;

    public j(int i10, Class cls, String str, String str2, int i11) {
        this(i10, c.f6790a, cls, str, str2, i11, 0);
    }

    @Override // fj.d
    public final lj.a b() {
        w.f6808a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return this.f6794d.equals(jVar.f6794d) && this.f6795e.equals(jVar.f6795e) && l.b(this.f6792b, jVar.f6792b) && f().equals(jVar.f());
        }
        if (!(obj instanceof j)) {
            return false;
        }
        lj.a aVar = this.f6791a;
        if (aVar == null) {
            b();
            this.f6791a = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    @Override // fj.i
    public final int getArity() {
        return this.f6799z;
    }

    public final int hashCode() {
        f();
        return this.f6795e.hashCode() + m1.c(f().hashCode() * 31, 31, this.f6794d);
    }

    public final String toString() {
        lj.a aVar = this.f6791a;
        if (aVar == null) {
            b();
            this.f6791a = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f6794d;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : m1.j("function ", str, " (Kotlin reflection is not available)");
    }

    public j(int i10, Object obj, Class cls, String str, String str2, int i11, int i12) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.f6799z = i10;
    }
}
