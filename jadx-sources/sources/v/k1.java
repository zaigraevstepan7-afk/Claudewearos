package v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f17241a;

    /* renamed from: b, reason: collision with root package name */
    public final b0.k1 f17242b;

    public k1() {
        long jD = c2.e0.d(4284900966L);
        b0.k1 k1VarB = b0.d.b(0.0f, 3);
        this.f17241a = jD;
        this.f17242b = k1VarB;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        fj.l.d(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        k1 k1Var = (k1) obj;
        return c2.w.d(this.f17241a, k1Var.f17241a) && fj.l.b(this.f17242b, k1Var.f17242b);
    }

    public final int hashCode() {
        int i10 = c2.w.f3059i;
        return this.f17242b.hashCode() + (Long.hashCode(this.f17241a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OverscrollConfiguration(glowColor=");
        t.m1.q(this.f17241a, sb2, ", drawPadding=");
        sb2.append(this.f17242b);
        sb2.append(')');
        return sb2.toString();
    }
}
