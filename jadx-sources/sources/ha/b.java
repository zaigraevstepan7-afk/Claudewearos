package ha;

import c2.s;
import c2.w;
import fj.l;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f7752a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7753b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7754c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7755d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7756e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7757f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7758g;

    /* renamed from: h, reason: collision with root package name */
    public final long f7759h;

    /* renamed from: i, reason: collision with root package name */
    public final long f7760i;
    public final s j;

    /* renamed from: k, reason: collision with root package name */
    public final s f7761k;

    /* renamed from: l, reason: collision with root package name */
    public final long f7762l;

    /* renamed from: m, reason: collision with root package name */
    public final long f7763m;

    /* renamed from: n, reason: collision with root package name */
    public final long f7764n;

    /* renamed from: o, reason: collision with root package name */
    public final long f7765o;

    public b(long j, long j4, long j10, long j11, long j12, long j13, long j14, long j15, long j16, s sVar, s sVar2, long j17, long j18, long j19, long j20) {
        l.f(sVar, "bgProBrush");
        l.f(sVar2, "lightBorderBrush");
        this.f7752a = j;
        this.f7753b = j4;
        this.f7754c = j10;
        this.f7755d = j11;
        this.f7756e = j12;
        this.f7757f = j13;
        this.f7758g = j14;
        this.f7759h = j15;
        this.f7760i = j16;
        this.j = sVar;
        this.f7761k = sVar2;
        this.f7762l = j17;
        this.f7763m = j18;
        this.f7764n = j19;
        this.f7765o = j20;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return w.d(this.f7752a, bVar.f7752a) && w.d(this.f7753b, bVar.f7753b) && w.d(this.f7754c, bVar.f7754c) && w.d(this.f7755d, bVar.f7755d) && w.d(this.f7756e, bVar.f7756e) && w.d(this.f7757f, bVar.f7757f) && w.d(this.f7758g, bVar.f7758g) && w.d(this.f7759h, bVar.f7759h) && w.d(this.f7760i, bVar.f7760i) && l.b(this.j, bVar.j) && l.b(this.f7761k, bVar.f7761k) && w.d(this.f7762l, bVar.f7762l) && w.d(this.f7763m, bVar.f7763m) && w.d(this.f7764n, bVar.f7764n) && w.d(this.f7765o, bVar.f7765o);
    }

    public final int hashCode() {
        int i10 = w.f3059i;
        return Long.hashCode(this.f7765o) + gk.b.j(gk.b.j(gk.b.j((this.f7761k.hashCode() + ((this.j.hashCode() + gk.b.j(gk.b.j(gk.b.j(gk.b.j(gk.b.j(gk.b.j(gk.b.j(gk.b.j(Long.hashCode(this.f7752a) * 31, this.f7753b, 31), this.f7754c, 31), this.f7755d, 31), this.f7756e, 31), this.f7757f, 31), this.f7758g, 31), this.f7759h, 31), this.f7760i, 31)) * 31)) * 31, this.f7762l, 31), this.f7763m, 31), this.f7764n, 31);
    }

    public final String toString() {
        String strJ = w.j(this.f7752a);
        String strJ2 = w.j(this.f7753b);
        String strJ3 = w.j(this.f7754c);
        String strJ4 = w.j(this.f7755d);
        String strJ5 = w.j(this.f7756e);
        String strJ6 = w.j(this.f7757f);
        String strJ7 = w.j(this.f7758g);
        String strJ8 = w.j(this.f7759h);
        String strJ9 = w.j(this.f7760i);
        String strJ10 = w.j(this.f7762l);
        String strJ11 = w.j(this.f7763m);
        String strJ12 = w.j(this.f7764n);
        String strJ13 = w.j(this.f7765o);
        StringBuilder sbM = m1.m("ColorScheme(bgLumi1=", strJ, ", bgLumi2=", strJ2, ", textPrimary=");
        m1.s(sbM, strJ3, ", textSecondary=", strJ4, ", underlinedText=");
        m1.s(sbM, strJ5, ", headerText=", strJ6, ", coloredStatusBar=");
        m1.s(sbM, strJ7, ", iconPrimary=", strJ8, ", iconSecondary=");
        sbM.append(strJ9);
        sbM.append(", bgProBrush=");
        sbM.append(this.j);
        sbM.append(", lightBorderBrush=");
        sbM.append(this.f7761k);
        sbM.append(", bgSelectedItem=");
        sbM.append(strJ10);
        sbM.append(", bgWarning=");
        m1.s(sbM, strJ11, ", bgSafe=", strJ12, ", bgExtremeWarning=");
        return m6.a.j(sbM, strJ13, ")");
    }
}
