package s;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f14582a;

    /* renamed from: b, reason: collision with root package name */
    public final b1 f14583b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f14584c;

    /* renamed from: d, reason: collision with root package name */
    public final y0 f14585d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14586e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f14587f;

    public d1(u0 u0Var, b1 b1Var, e0 e0Var, y0 y0Var, boolean z2, Map map) {
        this.f14582a = u0Var;
        this.f14583b = b1Var;
        this.f14584c = e0Var;
        this.f14585d = y0Var;
        this.f14586e = z2;
        this.f14587f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return fj.l.b(this.f14582a, d1Var.f14582a) && fj.l.b(this.f14583b, d1Var.f14583b) && fj.l.b(this.f14584c, d1Var.f14584c) && fj.l.b(this.f14585d, d1Var.f14585d) && this.f14586e == d1Var.f14586e && fj.l.b(this.f14587f, d1Var.f14587f);
    }

    public final int hashCode() {
        u0 u0Var = this.f14582a;
        int iHashCode = (u0Var == null ? 0 : u0Var.hashCode()) * 31;
        b1 b1Var = this.f14583b;
        int iHashCode2 = (iHashCode + (b1Var == null ? 0 : b1Var.hashCode())) * 31;
        e0 e0Var = this.f14584c;
        int iHashCode3 = (iHashCode2 + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        y0 y0Var = this.f14585d;
        return this.f14587f.hashCode() + gk.b.i((iHashCode3 + (y0Var != null ? y0Var.hashCode() : 0)) * 961, 31, this.f14586e);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f14582a + ", slide=" + this.f14583b + ", changeSize=" + this.f14584c + ", scale=" + this.f14585d + ", veil=null, hold=" + this.f14586e + ", effectsMap=" + this.f14587f + ')';
    }

    public /* synthetic */ d1(u0 u0Var, b1 b1Var, e0 e0Var, y0 y0Var, LinkedHashMap linkedHashMap, int i10) {
        this((i10 & 1) != 0 ? null : u0Var, (i10 & 2) != 0 ? null : b1Var, (i10 & 4) != 0 ? null : e0Var, (i10 & 8) != 0 ? null : y0Var, (i10 & 32) == 0, (i10 & 64) != 0 ? qi.t.f13521a : linkedHashMap);
    }
}
