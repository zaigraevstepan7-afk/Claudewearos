package fj;

import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class q extends d implements lj.d {

    /* renamed from: z, reason: collision with root package name */
    public final boolean f6802z;

    public q(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f6802z = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            return f().equals(qVar.f()) && this.f6794d.equals(qVar.f6794d) && this.f6795e.equals(qVar.f6795e) && l.b(this.f6792b, qVar.f6792b);
        }
        if (obj instanceof lj.d) {
            return obj.equals(h());
        }
        return false;
    }

    public final lj.a h() {
        if (this.f6802z) {
            return this;
        }
        lj.a aVar = this.f6791a;
        if (aVar != null) {
            return aVar;
        }
        lj.a aVarB = b();
        this.f6791a = aVarB;
        return aVarB;
    }

    public final int hashCode() {
        return this.f6795e.hashCode() + m1.c(f().hashCode() * 31, 31, this.f6794d);
    }

    public final String toString() {
        lj.a aVarH = h();
        return aVarH != this ? aVarH.toString() : m6.a.j(new StringBuilder("property "), this.f6794d, " (Kotlin reflection is not available)");
    }
}
