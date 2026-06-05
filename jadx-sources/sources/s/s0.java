package s;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: b, reason: collision with root package name */
    public static final s0 f14671b = new s0(new d1((u0) null, (b1) null, (e0) null, (y0) null, (LinkedHashMap) null, 127));

    /* renamed from: a, reason: collision with root package name */
    public final d1 f14672a;

    public s0(d1 d1Var) {
        this.f14672a = d1Var;
    }

    public final s0 a(s0 s0Var) {
        d1 d1Var = s0Var.f14672a;
        u0 u0Var = d1Var.f14582a;
        d1 d1Var2 = this.f14672a;
        if (u0Var == null) {
            u0Var = d1Var2.f14582a;
        }
        b1 b1Var = d1Var.f14583b;
        if (b1Var == null) {
            b1Var = d1Var2.f14583b;
        }
        e0 e0Var = d1Var.f14584c;
        if (e0Var == null) {
            e0Var = d1Var2.f14584c;
        }
        y0 y0Var = d1Var.f14585d;
        if (y0Var == null) {
            y0Var = d1Var2.f14585d;
        }
        return new s0(new d1(u0Var, b1Var, e0Var, y0Var, qi.v.j0(d1Var2.f14587f, d1Var.f14587f), 32));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s0) && fj.l.b(((s0) obj).f14672a, this.f14672a);
    }

    public final int hashCode() {
        return this.f14672a.hashCode();
    }

    public final String toString() {
        if (equals(f14671b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb2 = new StringBuilder("EnterTransition: \nFade - ");
        d1 d1Var = this.f14672a;
        u0 u0Var = d1Var.f14582a;
        sb2.append(u0Var != null ? u0Var.toString() : null);
        sb2.append(",\nSlide - ");
        b1 b1Var = d1Var.f14583b;
        sb2.append(b1Var != null ? b1Var.toString() : null);
        sb2.append(",\nShrink - ");
        e0 e0Var = d1Var.f14584c;
        sb2.append(e0Var != null ? e0Var.toString() : null);
        sb2.append(",\nScale - ");
        y0 y0Var = d1Var.f14585d;
        sb2.append(y0Var != null ? y0Var.toString() : null);
        return sb2.toString();
    }
}
