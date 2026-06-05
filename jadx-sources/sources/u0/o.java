package u0;

import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f16555a;

    /* renamed from: b, reason: collision with root package name */
    public String f16556b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16557c = false;

    /* renamed from: d, reason: collision with root package name */
    public g f16558d = null;

    public o(String str, String str2) {
        this.f16555a = str;
        this.f16556b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return fj.l.b(this.f16555a, oVar.f16555a) && fj.l.b(this.f16556b, oVar.f16556b) && this.f16557c == oVar.f16557c && fj.l.b(this.f16558d, oVar.f16558d);
    }

    public final int hashCode() {
        int i10 = gk.b.i(m1.c(this.f16555a.hashCode() * 31, 31, this.f16556b), 31, this.f16557c);
        g gVar = this.f16558d;
        return i10 + (gVar == null ? 0 : gVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.f16558d + ", isShowingSubstitution=" + this.f16557c + ')';
    }
}
