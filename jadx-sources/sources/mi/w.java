package mi;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final float f11791a;

    /* renamed from: b, reason: collision with root package name */
    public final float f11792b;

    /* renamed from: c, reason: collision with root package name */
    public final float f11793c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11794d;

    /* renamed from: e, reason: collision with root package name */
    public final long f11795e;

    /* renamed from: f, reason: collision with root package name */
    public final List f11796f;

    /* renamed from: g, reason: collision with root package name */
    public final float f11797g;

    /* renamed from: h, reason: collision with root package name */
    public final c2.s f11798h;

    /* renamed from: i, reason: collision with root package name */
    public final int f11799i;

    public w(float f10, float f11, float f12, long j, long j4, List list, float f13, c2.s sVar, int i10) {
        this.f11791a = f10;
        this.f11792b = f11;
        this.f11793c = f12;
        this.f11794d = j;
        this.f11795e = j4;
        this.f11796f = list;
        this.f11797g = f13;
        this.f11798h = sVar;
        this.f11799i = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return s3.f.e(this.f11791a, wVar.f11791a) && Float.compare(this.f11792b, wVar.f11792b) == 0 && Float.compare(this.f11793c, wVar.f11793c) == 0 && b2.e.a(this.f11794d, wVar.f11794d) && b2.b.c(this.f11795e, wVar.f11795e) && this.f11796f.equals(wVar.f11796f) && Float.compare(this.f11797g, wVar.f11797g) == 0 && fj.l.b(this.f11798h, wVar.f11798h) && this.f11799i == wVar.f11799i;
    }

    public final int hashCode() {
        int iF = gk.b.f(this.f11797g, gk.b.h(gk.b.j(gk.b.j(gk.b.f(this.f11793c, gk.b.f(this.f11792b, Float.hashCode(this.f11791a) * 31, 31), 31), this.f11794d, 31), this.f11795e, 31), 31, this.f11796f), 31);
        c2.s sVar = this.f11798h;
        return Integer.hashCode(this.f11799i) + ((iF + (sVar == null ? 0 : sVar.hashCode())) * 961);
    }

    public final String toString() {
        String strF = s3.f.f(this.f11791a);
        String strH = b2.e.h(this.f11794d);
        String strH2 = b2.b.h(this.f11795e);
        String strJ = c2.e0.J(this.f11799i);
        StringBuilder sb2 = new StringBuilder("RenderEffectParams(blurRadius=");
        sb2.append(strF);
        sb2.append(", noiseFactor=");
        sb2.append(this.f11792b);
        sb2.append(", scale=");
        sb2.append(this.f11793c);
        sb2.append(", contentSize=");
        sb2.append(strH);
        sb2.append(", contentOffset=");
        sb2.append(strH2);
        sb2.append(", tints=");
        sb2.append(this.f11796f);
        sb2.append(", tintAlphaModulate=");
        sb2.append(this.f11797g);
        sb2.append(", mask=");
        sb2.append(this.f11798h);
        sb2.append(", progressive=null, blurTileMode=");
        return m6.a.j(sb2, strJ, ")");
    }
}
