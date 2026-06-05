package s;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: b, reason: collision with root package name */
    public static final t0 f14675b = new t0(new d1((u0) null, (b1) null, (e0) null, (y0) null, (LinkedHashMap) null, 127));

    /* renamed from: c, reason: collision with root package name */
    public static final t0 f14676c = new t0(new d1((u0) null, (b1) null, (e0) null, (y0) null, (LinkedHashMap) null, 95));

    /* renamed from: a, reason: collision with root package name */
    public final d1 f14677a;

    public t0(d1 d1Var) {
        this.f14677a = d1Var;
    }

    public final t0 a(t0 t0Var) {
        d1 d1Var = t0Var.f14677a;
        u0 u0Var = d1Var.f14582a;
        d1 d1Var2 = this.f14677a;
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
        return new t0(new d1(u0Var, b1Var, e0Var, y0Var, d1Var.f14586e || d1Var2.f14586e, qi.v.j0(d1Var2.f14587f, d1Var.f14587f)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof t0) && fj.l.b(((t0) obj).f14677a, this.f14677a);
    }

    public final int hashCode() {
        return this.f14677a.hashCode();
    }

    public final String toString() {
        if (equals(f14675b)) {
            return "ExitTransition.None";
        }
        if (equals(f14676c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb2 = new StringBuilder("ExitTransition: \nFade - ");
        d1 d1Var = this.f14677a;
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
        sb2.append(",\nKeepUntilTransitionsFinished - ");
        sb2.append(d1Var.f14586e);
        return sb2.toString();
    }
}
