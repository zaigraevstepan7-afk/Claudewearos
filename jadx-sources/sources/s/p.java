package s;

import t2.e1;
import t2.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p extends fj.m implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f14658a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1 f14659b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f14660c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, f1 f1Var, long j) {
        super(1);
        this.f14658a = qVar;
        this.f14659b = f1Var;
        this.f14660c = j;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        this.f14658a.J.getClass();
        f1 f1Var = this.f14659b;
        long j = (f1Var.f15550a << 32) | (f1Var.f15551b & 4294967295L);
        s3.m mVar = s3.m.f14752a;
        long j4 = this.f14660c;
        s3.m mVar2 = s3.m.f14752a;
        float f10 = 1;
        float f11 = (f10 - 1.0f) * ((((int) (j4 >> 32)) - ((int) (j >> 32))) / 2.0f);
        float f12 = (f10 - 1.0f) * ((((int) (j4 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f);
        e1.C((e1) obj, f1Var, (Math.round(f11) << 32) | (Math.round(f12) & 4294967295L));
        return pi.o.f13011a;
    }
}
