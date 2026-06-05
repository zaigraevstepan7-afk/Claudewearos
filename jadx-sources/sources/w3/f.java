package w3;

import f1.i0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends fj.m implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v1.o f18502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.e f18503b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18504c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(v1.o oVar, ej.e eVar, int i10) {
        super(2);
        this.f18502a = oVar;
        this.f18503b = eVar;
        this.f18504c = i10;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iO = f1.s.O(this.f18504c | 1);
        u0.c.c(this.f18502a, this.f18503b, (i0) obj, iO);
        return pi.o.f13011a;
    }
}
