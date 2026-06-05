package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o5 {

    /* renamed from: a, reason: collision with root package name */
    public final j0.d f2525a;

    /* renamed from: b, reason: collision with root package name */
    public final j0.d f2526b;

    /* renamed from: c, reason: collision with root package name */
    public final j0.d f2527c;

    /* renamed from: d, reason: collision with root package name */
    public final j0.d f2528d;

    /* renamed from: e, reason: collision with root package name */
    public final j0.d f2529e;

    /* renamed from: f, reason: collision with root package name */
    public final j0.d f2530f;

    /* renamed from: g, reason: collision with root package name */
    public final j0.d f2531g;

    /* renamed from: h, reason: collision with root package name */
    public final j0.d f2532h;

    public o5() {
        j0.d dVar = n5.f2472a;
        j0.d dVar2 = n5.f2473b;
        j0.d dVar3 = n5.f2474c;
        j0.d dVar4 = n5.f2475d;
        j0.d dVar5 = n5.f2477f;
        j0.d dVar6 = n5.f2476e;
        j0.d dVar7 = n5.f2478g;
        j0.d dVar8 = n5.f2479h;
        this.f2525a = dVar;
        this.f2526b = dVar2;
        this.f2527c = dVar3;
        this.f2528d = dVar4;
        this.f2529e = dVar5;
        this.f2530f = dVar6;
        this.f2531g = dVar7;
        this.f2532h = dVar8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5)) {
            return false;
        }
        o5 o5Var = (o5) obj;
        return fj.l.b(this.f2525a, o5Var.f2525a) && fj.l.b(this.f2526b, o5Var.f2526b) && fj.l.b(this.f2527c, o5Var.f2527c) && fj.l.b(this.f2528d, o5Var.f2528d) && fj.l.b(this.f2529e, o5Var.f2529e) && fj.l.b(this.f2530f, o5Var.f2530f) && fj.l.b(this.f2531g, o5Var.f2531g) && fj.l.b(this.f2532h, o5Var.f2532h);
    }

    public final int hashCode() {
        return this.f2532h.hashCode() + ((this.f2531g.hashCode() + ((this.f2530f.hashCode() + ((this.f2529e.hashCode() + ((this.f2528d.hashCode() + ((this.f2527c.hashCode() + ((this.f2526b.hashCode() + (this.f2525a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f2525a + ", small=" + this.f2526b + ", medium=" + this.f2527c + ", large=" + this.f2528d + ", largeIncreased=" + this.f2530f + ", extraLarge=" + this.f2529e + ", extralargeIncreased=" + this.f2531g + ", extraExtraLarge=" + this.f2532h + ')';
    }
}
