package r3;

import c2.u0;
import c2.w;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f13665a;

    /* renamed from: b, reason: collision with root package name */
    public final float f13666b;

    public b(u0 u0Var, float f10) {
        this.f13665a = u0Var;
        this.f13666b = f10;
    }

    @Override // r3.o
    public final long a() {
        int i10 = w.f3059i;
        return w.f3058h;
    }

    @Override // r3.o
    public final c2.s b() {
        return this.f13665a;
    }

    @Override // r3.o
    public final float e() {
        return this.f13666b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return fj.l.b(this.f13665a, bVar.f13665a) && Float.compare(this.f13666b, bVar.f13666b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13666b) + (this.f13665a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BrushStyle(value=");
        sb2.append(this.f13665a);
        sb2.append(", alpha=");
        return gk.b.o(sb2, this.f13666b, ')');
    }
}
