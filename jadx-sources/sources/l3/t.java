package l3;

import g3.e0;
import g3.m0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final g3.f f9937a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9938b;

    /* renamed from: c, reason: collision with root package name */
    public final m0 f9939c;

    public t(g3.f fVar, long j, m0 m0Var) {
        m0 m0Var2;
        this.f9937a = fVar;
        this.f9938b = e0.c(fVar.f7081b.length(), j);
        if (m0Var != null) {
            m0Var2 = new m0(e0.c(fVar.f7081b.length(), m0Var.f7145a));
        } else {
            m0Var2 = null;
        }
        this.f9939c = m0Var2;
    }

    public static t a(t tVar, g3.f fVar, long j, int i10) {
        if ((i10 & 1) != 0) {
            fVar = tVar.f9937a;
        }
        if ((i10 & 2) != 0) {
            j = tVar.f9938b;
        }
        m0 m0Var = (i10 & 4) != 0 ? tVar.f9939c : null;
        tVar.getClass();
        return new t(fVar, j, m0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return m0.b(this.f9938b, tVar.f9938b) && fj.l.b(this.f9939c, tVar.f9939c) && fj.l.b(this.f9937a, tVar.f9937a);
    }

    public final int hashCode() {
        int iHashCode = this.f9937a.hashCode() * 31;
        int i10 = m0.f7144c;
        int iJ = gk.b.j(iHashCode, this.f9938b, 31);
        m0 m0Var = this.f9939c;
        return iJ + (m0Var != null ? Long.hashCode(m0Var.f7145a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f9937a) + "', selection=" + ((Object) m0.h(this.f9938b)) + ", composition=" + this.f9939c + ')';
    }

    public t(String str, long j, int i10) {
        this(new g3.f((i10 & 1) != 0 ? "" : str), (i10 & 2) != 0 ? m0.f7143b : j, (m0) null);
    }
}
