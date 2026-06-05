package mi;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class q {

    /* renamed from: f, reason: collision with root package name */
    public static final q f11773f = new q(Float.NaN, -1.0f, c2.w.f3058h, qi.s.f13520a, s.f11780d);

    /* renamed from: a, reason: collision with root package name */
    public final long f11774a;

    /* renamed from: b, reason: collision with root package name */
    public final List f11775b;

    /* renamed from: c, reason: collision with root package name */
    public final float f11776c;

    /* renamed from: d, reason: collision with root package name */
    public final float f11777d;

    /* renamed from: e, reason: collision with root package name */
    public final s f11778e;

    public q(float f10, float f11, long j, List list, s sVar) {
        fj.l.f(list, "tints");
        fj.l.f(sVar, "fallbackTint");
        this.f11774a = j;
        this.f11775b = list;
        this.f11776c = f10;
        this.f11777d = f11;
        this.f11778e = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return c2.w.d(this.f11774a, qVar.f11774a) && fj.l.b(this.f11775b, qVar.f11775b) && s3.f.e(this.f11776c, qVar.f11776c) && Float.compare(this.f11777d, qVar.f11777d) == 0 && fj.l.b(this.f11778e, qVar.f11778e);
    }

    public final int hashCode() {
        int i10 = c2.w.f3059i;
        return this.f11778e.hashCode() + gk.b.f(this.f11777d, gk.b.f(this.f11776c, gk.b.h(Long.hashCode(this.f11774a) * 31, 31, this.f11775b), 31), 31);
    }

    public final String toString() {
        return "HazeStyle(backgroundColor=" + c2.w.j(this.f11774a) + ", tints=" + this.f11775b + ", blurRadius=" + s3.f.f(this.f11776c) + ", noiseFactor=" + this.f11777d + ", fallbackTint=" + this.f11778e + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(long j, s sVar, float f10, int i10) {
        float f11 = (i10 & 8) != 0 ? -1.0f : 0.15f;
        s sVar2 = s.f11780d;
        fj.l.f(sVar2, "fallbackTint");
        this(f10, f11, j, yd.f.K(sVar), sVar2);
    }
}
