package s;

import t2.e1;
import t2.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o0 extends fj.m implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1 f14654a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f14655b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f14656c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a2.n f14657d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(f1 f1Var, long j, long j4, a2.n nVar) {
        super(1);
        this.f14654a = f1Var;
        this.f14655b = j;
        this.f14656c = j4;
        this.f14657d = nVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        e1 e1Var = (e1) obj;
        long j = this.f14655b;
        long j4 = this.f14656c;
        e1Var.getClass();
        f1 f1Var = this.f14654a;
        e1.f(e1Var, f1Var);
        f1Var.G0(s3.j.c(((((int) (j >> 32)) + ((int) (j4 >> 32))) << 32) | ((((int) (j & 4294967295L)) + ((int) (j4 & 4294967295L))) & 4294967295L), f1Var.f15554e), 0.0f, this.f14657d);
        return pi.o.f13011a;
    }
}
