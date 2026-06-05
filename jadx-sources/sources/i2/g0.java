package i2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g0 extends i0 implements Iterable, gj.a {
    public final float A;
    public final List B;
    public final List C;

    /* renamed from: a, reason: collision with root package name */
    public final String f8244a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8245b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8246c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8247d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8248e;

    /* renamed from: f, reason: collision with root package name */
    public final float f8249f;

    /* renamed from: z, reason: collision with root package name */
    public final float f8250z;

    public g0(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, ArrayList arrayList) {
        this.f8244a = str;
        this.f8245b = f10;
        this.f8246c = f11;
        this.f8247d = f12;
        this.f8248e = f13;
        this.f8249f = f14;
        this.f8250z = f15;
        this.A = f16;
        this.B = list;
        this.C = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof g0)) {
            g0 g0Var = (g0) obj;
            return fj.l.b(this.f8244a, g0Var.f8244a) && this.f8245b == g0Var.f8245b && this.f8246c == g0Var.f8246c && this.f8247d == g0Var.f8247d && this.f8248e == g0Var.f8248e && this.f8249f == g0Var.f8249f && this.f8250z == g0Var.f8250z && this.A == g0Var.A && fj.l.b(this.B, g0Var.B) && fj.l.b(this.C, g0Var.C);
        }
        return false;
    }

    public final int hashCode() {
        return this.C.hashCode() + gk.b.h(gk.b.f(this.A, gk.b.f(this.f8250z, gk.b.f(this.f8249f, gk.b.f(this.f8248e, gk.b.f(this.f8247d, gk.b.f(this.f8246c, gk.b.f(this.f8245b, this.f8244a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.B);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new f0(this);
    }
}
