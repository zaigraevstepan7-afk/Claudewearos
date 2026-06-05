package v0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final t f17483a;

    /* renamed from: b, reason: collision with root package name */
    public final t f17484b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17485c;

    public u(t tVar, t tVar2, boolean z2) {
        this.f17483a = tVar;
        this.f17484b = tVar2;
        this.f17485c = z2;
    }

    public static u a(u uVar, t tVar, t tVar2, boolean z2, int i10) {
        if ((i10 & 1) != 0) {
            tVar = uVar.f17483a;
        }
        if ((i10 & 2) != 0) {
            tVar2 = uVar.f17484b;
        }
        uVar.getClass();
        return new u(tVar, tVar2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return fj.l.b(this.f17483a, uVar.f17483a) && fj.l.b(this.f17484b, uVar.f17484b) && this.f17485c == uVar.f17485c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17485c) + ((this.f17484b.hashCode() + (this.f17483a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Selection(start=" + this.f17483a + ", end=" + this.f17484b + ", handlesCrossed=" + this.f17485c + ')';
    }
}
