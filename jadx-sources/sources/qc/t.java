package qc;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final String f13456a;

    /* renamed from: b, reason: collision with root package name */
    public final double f13457b;

    /* renamed from: c, reason: collision with root package name */
    public final double f13458c;

    /* renamed from: d, reason: collision with root package name */
    public final double f13459d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13460e;

    public t(String str, double d10, double d11, double d12, int i10) {
        this.f13456a = str;
        this.f13458c = d10;
        this.f13457b = d11;
        this.f13459d = d12;
        this.f13460e = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return com.google.android.gms.common.internal.e0.l(this.f13456a, tVar.f13456a) && this.f13457b == tVar.f13457b && this.f13458c == tVar.f13458c && this.f13460e == tVar.f13460e && Double.compare(this.f13459d, tVar.f13459d) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13456a, Double.valueOf(this.f13457b), Double.valueOf(this.f13458c), Double.valueOf(this.f13459d), Integer.valueOf(this.f13460e)});
    }

    public final String toString() {
        t0.j jVar = new t0.j(this);
        jVar.g(this.f13456a, "name");
        jVar.g(Double.valueOf(this.f13458c), "minBound");
        jVar.g(Double.valueOf(this.f13457b), "maxBound");
        jVar.g(Double.valueOf(this.f13459d), "percent");
        jVar.g(Integer.valueOf(this.f13460e), "count");
        return jVar.toString();
    }
}
