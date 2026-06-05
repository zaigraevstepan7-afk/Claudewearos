package t7;

import java.util.HashSet;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: i, reason: collision with root package name */
    public static final c f16101i;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16103b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16104c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16105d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16106e;

    /* renamed from: a, reason: collision with root package name */
    public int f16102a = 1;

    /* renamed from: f, reason: collision with root package name */
    public long f16107f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f16108g = -1;

    /* renamed from: h, reason: collision with root package name */
    public e f16109h = new e();

    static {
        e eVar = new e();
        c cVar = new c();
        cVar.f16102a = 1;
        cVar.f16107f = -1L;
        cVar.f16108g = -1L;
        new HashSet();
        cVar.f16103b = false;
        cVar.f16104c = false;
        cVar.f16102a = 1;
        cVar.f16105d = false;
        cVar.f16106e = false;
        cVar.f16109h = eVar;
        cVar.f16107f = -1L;
        cVar.f16108g = -1L;
        f16101i = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f16103b == cVar.f16103b && this.f16104c == cVar.f16104c && this.f16105d == cVar.f16105d && this.f16106e == cVar.f16106e && this.f16107f == cVar.f16107f && this.f16108g == cVar.f16108g && this.f16102a == cVar.f16102a) {
            return this.f16109h.equals(cVar.f16109h);
        }
        return false;
    }

    public final int hashCode() {
        int iB = ((((((((y3.e.b(this.f16102a) * 31) + (this.f16103b ? 1 : 0)) * 31) + (this.f16104c ? 1 : 0)) * 31) + (this.f16105d ? 1 : 0)) * 31) + (this.f16106e ? 1 : 0)) * 31;
        long j = this.f16107f;
        int i10 = (iB + ((int) (j ^ (j >>> 32)))) * 31;
        long j4 = this.f16108g;
        return this.f16109h.f16112a.hashCode() + ((i10 + ((int) (j4 ^ (j4 >>> 32)))) * 31);
    }
}
