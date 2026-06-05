package i2;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k0 extends i0 {
    public final float A;
    public final int B;
    public final int C;
    public final float D;
    public final float E;
    public final float F;
    public final float G;

    /* renamed from: a, reason: collision with root package name */
    public final String f8287a;

    /* renamed from: b, reason: collision with root package name */
    public final List f8288b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8289c;

    /* renamed from: d, reason: collision with root package name */
    public final c2.s f8290d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8291e;

    /* renamed from: f, reason: collision with root package name */
    public final c2.s f8292f;

    /* renamed from: z, reason: collision with root package name */
    public final float f8293z;

    public k0(String str, List list, int i10, c2.s sVar, float f10, c2.s sVar2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16) {
        this.f8287a = str;
        this.f8288b = list;
        this.f8289c = i10;
        this.f8290d = sVar;
        this.f8291e = f10;
        this.f8292f = sVar2;
        this.f8293z = f11;
        this.A = f12;
        this.B = i11;
        this.C = i12;
        this.D = f13;
        this.E = f14;
        this.F = f15;
        this.G = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k0.class == obj.getClass()) {
            k0 k0Var = (k0) obj;
            return fj.l.b(this.f8287a, k0Var.f8287a) && fj.l.b(this.f8290d, k0Var.f8290d) && this.f8291e == k0Var.f8291e && fj.l.b(this.f8292f, k0Var.f8292f) && this.f8293z == k0Var.f8293z && this.A == k0Var.A && this.B == k0Var.B && this.C == k0Var.C && this.D == k0Var.D && this.E == k0Var.E && this.F == k0Var.F && this.G == k0Var.G && this.f8289c == k0Var.f8289c && fj.l.b(this.f8288b, k0Var.f8288b);
        }
        return false;
    }

    public final int hashCode() {
        int iH = gk.b.h(this.f8287a.hashCode() * 31, 31, this.f8288b);
        c2.s sVar = this.f8290d;
        int iF = gk.b.f(this.f8291e, (iH + (sVar != null ? sVar.hashCode() : 0)) * 31, 31);
        c2.s sVar2 = this.f8292f;
        return Integer.hashCode(this.f8289c) + gk.b.f(this.G, gk.b.f(this.F, gk.b.f(this.E, gk.b.f(this.D, gk.b.g(this.C, gk.b.g(this.B, gk.b.f(this.A, gk.b.f(this.f8293z, (iF + (sVar2 != null ? sVar2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
