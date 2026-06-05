package l3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: g, reason: collision with root package name */
    public static final j f9913g = new j(false, 0, true, 1, 1, n3.b.f11896c);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9914a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9915b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9916c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9917d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9918e;

    /* renamed from: f, reason: collision with root package name */
    public final n3.b f9919f;

    public j(boolean z2, int i10, boolean z10, int i11, int i12, n3.b bVar) {
        this.f9914a = z2;
        this.f9915b = i10;
        this.f9916c = z10;
        this.f9917d = i11;
        this.f9918e = i12;
        this.f9919f = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f9914a == jVar.f9914a && this.f9915b == jVar.f9915b && this.f9916c == jVar.f9916c && this.f9917d == jVar.f9917d && this.f9918e == jVar.f9918e && fj.l.b(this.f9919f, jVar.f9919f);
    }

    public final int hashCode() {
        return this.f9919f.f11897a.hashCode() + gk.b.g(this.f9918e, gk.b.g(this.f9917d, gk.b.i(gk.b.g(this.f9915b, Boolean.hashCode(this.f9914a) * 31, 31), 31, this.f9916c), 31), 961);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImeOptions(singleLine=");
        sb2.append(this.f9914a);
        sb2.append(", capitalization=");
        int i10 = this.f9915b;
        sb2.append((Object) (i10 == -1 ? "Unspecified" : i10 == 0 ? "None" : i10 == 1 ? "Characters" : i10 == 2 ? "Words" : i10 == 3 ? "Sentences" : "Invalid"));
        sb2.append(", autoCorrect=");
        sb2.append(this.f9916c);
        sb2.append(", keyboardType=");
        sb2.append((Object) hj.a.S(this.f9917d));
        sb2.append(", imeAction=");
        sb2.append((Object) i.a(this.f9918e));
        sb2.append(", platformImeOptions=null, hintLocales=");
        sb2.append(this.f9919f);
        sb2.append(')');
        return sb2.toString();
    }
}
