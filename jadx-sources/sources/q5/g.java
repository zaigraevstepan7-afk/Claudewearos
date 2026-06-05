package q5;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public double f13269a;

    /* renamed from: b, reason: collision with root package name */
    public double f13270b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13271c;

    /* renamed from: d, reason: collision with root package name */
    public double f13272d;

    /* renamed from: e, reason: collision with root package name */
    public double f13273e;

    /* renamed from: f, reason: collision with root package name */
    public double f13274f;

    /* renamed from: g, reason: collision with root package name */
    public double f13275g;

    /* renamed from: h, reason: collision with root package name */
    public double f13276h;

    /* renamed from: i, reason: collision with root package name */
    public double f13277i;
    public final e j;

    public g() {
        this.f13269a = Math.sqrt(1500.0d);
        this.f13270b = 0.5d;
        this.f13271c = false;
        this.f13277i = Double.MAX_VALUE;
        this.j = new e();
    }

    public final void a(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f13270b = f10;
        this.f13271c = false;
    }

    public final void b(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f13269a = Math.sqrt(f10);
        this.f13271c = false;
    }

    public final e c(double d10, double d11, long j) {
        double dSin;
        double dCos;
        if (!this.f13271c) {
            if (this.f13277i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d12 = this.f13270b;
            if (d12 > 1.0d) {
                double d13 = this.f13269a;
                this.f13274f = (Math.sqrt((d12 * d12) - 1.0d) * d13) + ((-d12) * d13);
                double d14 = this.f13270b;
                double d15 = this.f13269a;
                this.f13275g = ((-d14) * d15) - (Math.sqrt((d14 * d14) - 1.0d) * d15);
            } else if (d12 >= 0.0d && d12 < 1.0d) {
                this.f13276h = Math.sqrt(1.0d - (d12 * d12)) * this.f13269a;
            }
            this.f13271c = true;
        }
        double d16 = j / 1000.0d;
        double d17 = d10 - this.f13277i;
        double d18 = this.f13270b;
        if (d18 > 1.0d) {
            double d19 = this.f13275g;
            double d20 = ((d19 * d17) - d11) / (d19 - this.f13274f);
            double d21 = d17 - d20;
            dSin = (Math.pow(2.718281828459045d, this.f13274f * d16) * d20) + (Math.pow(2.718281828459045d, d19 * d16) * d21);
            double d22 = this.f13275g;
            double dPow = Math.pow(2.718281828459045d, d22 * d16) * d21 * d22;
            double d23 = this.f13274f;
            dCos = (Math.pow(2.718281828459045d, d23 * d16) * d20 * d23) + dPow;
        } else if (d18 == 1.0d) {
            double d24 = this.f13269a;
            double d25 = (d24 * d17) + d11;
            double d26 = (d25 * d16) + d17;
            double dPow2 = Math.pow(2.718281828459045d, (-d24) * d16) * d26;
            double dPow3 = Math.pow(2.718281828459045d, (-this.f13269a) * d16) * d26;
            double d27 = -this.f13269a;
            dCos = (Math.pow(2.718281828459045d, d27 * d16) * d25) + (dPow3 * d27);
            dSin = dPow2;
        } else {
            double d28 = 1.0d / this.f13276h;
            double d29 = this.f13269a;
            double d30 = ((d18 * d29 * d17) + d11) * d28;
            dSin = ((Math.sin(this.f13276h * d16) * d30) + (Math.cos(this.f13276h * d16) * d17)) * Math.pow(2.718281828459045d, (-d18) * d29 * d16);
            double d31 = this.f13269a;
            double d32 = this.f13270b;
            double d33 = (-d31) * dSin * d32;
            double dPow4 = Math.pow(2.718281828459045d, (-d32) * d31 * d16);
            double d34 = this.f13276h;
            double dSin2 = Math.sin(d34 * d16) * (-d34) * d17;
            double d35 = this.f13276h;
            dCos = (((Math.cos(d35 * d16) * d30 * d35) + dSin2) * dPow4) + d33;
        }
        float f10 = (float) (dSin + this.f13277i);
        e eVar = this.j;
        eVar.f13247a = f10;
        eVar.f13248b = (float) dCos;
        return eVar;
    }

    public g(float f10) {
        this.f13269a = Math.sqrt(1500.0d);
        this.f13270b = 0.5d;
        this.f13271c = false;
        this.j = new e();
        this.f13277i = f10;
    }
}
