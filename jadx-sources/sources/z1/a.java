package z1;

import c2.e0;
import c2.f0;
import c2.r;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends fj.m implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f20350a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f20351b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20352c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f20353d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(float f10, float f11, int i10, boolean z2) {
        super(1);
        this.f20350a = f10;
        this.f20351b = f11;
        this.f20352c = i10;
        this.f20353d = z2;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        f0 f0Var = (f0) obj;
        float fE = f0Var.e() * this.f20350a;
        float fE2 = f0Var.e() * this.f20351b;
        f0Var.k((fE <= 0.0f || fE2 <= 0.0f) ? null : new r(fE, fE2, this.f20352c));
        f0Var.y(e0.f2986b);
        f0Var.q(this.f20353d);
        return pi.o.f13011a;
    }
}
