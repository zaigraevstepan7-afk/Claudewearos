package eb;

import android.graphics.Bitmap;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f5904a;

    /* renamed from: b, reason: collision with root package name */
    public final s3.k f5905b;

    /* renamed from: c, reason: collision with root package name */
    public final Bitmap f5906c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5907d;

    /* renamed from: e, reason: collision with root package name */
    public final j f5908e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5909f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5910g;

    public k(long j, s3.k kVar, Bitmap bitmap, String str, j jVar, int i10, boolean z2) {
        fj.l.f(bitmap, "iconBitmap");
        fj.l.f(str, "packageName");
        fj.l.f(jVar, "phase");
        this.f5904a = j;
        this.f5905b = kVar;
        this.f5906c = bitmap;
        this.f5907d = str;
        this.f5908e = jVar;
        this.f5909f = i10;
        this.f5910g = z2;
    }

    public static k a(k kVar, int i10) {
        j jVar = j.f5902b;
        long j = kVar.f5904a;
        s3.k kVar2 = kVar.f5905b;
        Bitmap bitmap = kVar.f5906c;
        String str = kVar.f5907d;
        if ((i10 & 16) != 0) {
            jVar = kVar.f5908e;
        }
        j jVar2 = jVar;
        int i11 = kVar.f5909f;
        boolean z2 = (i10 & 64) != 0 ? kVar.f5910g : true;
        kVar.getClass();
        fj.l.f(bitmap, "iconBitmap");
        fj.l.f(str, "packageName");
        fj.l.f(jVar2, "phase");
        return new k(j, kVar2, bitmap, str, jVar2, i11, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f5904a == kVar.f5904a && fj.l.b(this.f5905b, kVar.f5905b) && fj.l.b(this.f5906c, kVar.f5906c) && fj.l.b(this.f5907d, kVar.f5907d) && this.f5908e == kVar.f5908e && this.f5909f == kVar.f5909f && this.f5910g == kVar.f5910g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5910g) + gk.b.g(this.f5909f, (this.f5908e.hashCode() + m1.c((this.f5906c.hashCode() + ((this.f5905b.hashCode() + (Long.hashCode(this.f5904a) * 31)) * 31)) * 31, 31, this.f5907d)) * 31, 31);
    }

    public final String toString() {
        return "OriginAppOpenState(id=" + this.f5904a + ", iconBounds=" + this.f5905b + ", iconBitmap=" + this.f5906c + ", packageName=" + this.f5907d + ", phase=" + this.f5908e + ", generation=" + this.f5909f + ", appLaunched=" + this.f5910g + ")";
    }
}
