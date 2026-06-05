package d2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final double f4694a;

    /* renamed from: b, reason: collision with root package name */
    public final double f4695b;

    /* renamed from: c, reason: collision with root package name */
    public final double f4696c;

    /* renamed from: d, reason: collision with root package name */
    public final double f4697d;

    /* renamed from: e, reason: collision with root package name */
    public final double f4698e;

    /* renamed from: f, reason: collision with root package name */
    public final double f4699f;

    /* renamed from: g, reason: collision with root package name */
    public final double f4700g;

    public r(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f4694a = d10;
        this.f4695b = d11;
        this.f4696c = d12;
        this.f4697d = d13;
        this.f4698e = d14;
        this.f4699f = d15;
        this.f4700g = d16;
        if (Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d10 == -2.0d || d10 == -3.0d) {
            return;
        }
        if (d14 < 0.0d || d14 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d14);
        }
        if (d14 == 0.0d && (d11 == 0.0d || d10 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d14 >= 1.0d && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d11 == 0.0d || d10 == 0.0d) && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d13 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d11 < 0.0d || d10 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Double.compare(this.f4694a, rVar.f4694a) == 0 && Double.compare(this.f4695b, rVar.f4695b) == 0 && Double.compare(this.f4696c, rVar.f4696c) == 0 && Double.compare(this.f4697d, rVar.f4697d) == 0 && Double.compare(this.f4698e, rVar.f4698e) == 0 && Double.compare(this.f4699f, rVar.f4699f) == 0 && Double.compare(this.f4700g, rVar.f4700g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f4700g) + ((Double.hashCode(this.f4699f) + ((Double.hashCode(this.f4698e) + ((Double.hashCode(this.f4697d) + ((Double.hashCode(this.f4696c) + ((Double.hashCode(this.f4695b) + (Double.hashCode(this.f4694a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f4694a + ", a=" + this.f4695b + ", b=" + this.f4696c + ", c=" + this.f4697d + ", d=" + this.f4698e + ", e=" + this.f4699f + ", f=" + this.f4700g + ')';
    }

    public /* synthetic */ r(double d10, double d11, double d12, double d13, double d14) {
        this(d10, d11, d12, d13, d14, 0.0d, 0.0d);
    }
}
