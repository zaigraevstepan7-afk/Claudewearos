package s;

import t2.e1;
import t2.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k extends fj.m implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1[] f14637a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14638b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14639c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f1[] f1VarArr, l lVar, int i10, int i11) {
        super(1);
        this.f14637a = f1VarArr;
        this.f14638b = i10;
        this.f14639c = i11;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        e1 e1Var = (e1) obj;
        for (f1 f1Var : this.f14637a) {
            if (f1Var != null) {
                long j = (f1Var.f15550a << 32) | (f1Var.f15551b & 4294967295L);
                long j4 = (this.f14638b << 32) | (this.f14639c & 4294967295L);
                s3.m mVar = s3.m.f14752a;
                s3.m mVar2 = s3.m.f14752a;
                float f10 = 1;
                float f11 = (f10 - 1.0f) * ((((int) (j4 >> 32)) - ((int) (j >> 32))) / 2.0f);
                float f12 = (f10 - 1.0f) * ((((int) (j4 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f);
                long jRound = (Math.round(f12) & 4294967295L) | (Math.round(f11) << 32);
                e1Var.z(f1Var, (int) (jRound >> 32), (int) (jRound & 4294967295L), 0.0f);
            }
        }
        return pi.o.f13011a;
    }
}
