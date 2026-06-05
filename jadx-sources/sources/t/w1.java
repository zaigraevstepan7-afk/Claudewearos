package t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final p f15307a;

    /* renamed from: b, reason: collision with root package name */
    public final w f15308b;

    public w1(p pVar, w wVar) {
        this.f15307a = pVar;
        this.f15308b = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return fj.l.b(this.f15307a, w1Var.f15307a) && fj.l.b(this.f15308b, w1Var.f15308b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.f15308b.hashCode() + (this.f15307a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f15307a + ", easing=" + this.f15308b + ", arcMode=ArcMode(value=0))";
    }
}
