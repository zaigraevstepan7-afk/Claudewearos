package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s5 implements o2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x5 f2679a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.c f2680b;

    public s5(x5 x5Var, ej.c cVar) {
        x.o1 o1Var = x.o1.f19664a;
        this.f2679a = x5Var;
        this.f2680b = cVar;
    }

    @Override // o2.a
    public final long G0(int i10, long j, long j4) {
        if (i10 != 1) {
            return 0L;
        }
        d1.q qVar = this.f2679a.f2867d;
        x.o1 o1Var = x.o1.f19664a;
        float fE = qVar.e(Float.intBitsToFloat((int) (4294967295L & j4)));
        f1.f1 f1Var = qVar.j;
        float fG = Float.isNaN(f1Var.g()) ? 0.0f : f1Var.g();
        f1Var.h(fE);
        return a(fE - fG);
    }

    @Override // o2.a
    public final Object Z0(long j, long j4, ti.c cVar) {
        x.o1 o1Var = x.o1.f19664a;
        this.f2680b.invoke(new Float(s3.q.c(j4)));
        return new s3.q(j4);
    }

    public final long a(float f10) {
        x.o1 o1Var = x.o1.f19664a;
        x.o1 o1Var2 = x.o1.f19664a;
        return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L);
    }

    @Override // o2.a
    public final long c0(int i10, long j) {
        x.o1 o1Var = x.o1.f19664a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f || i10 != 1) {
            return 0L;
        }
        d1.q qVar = this.f2679a.f2867d;
        float fE = qVar.e(fIntBitsToFloat);
        f1.f1 f1Var = qVar.j;
        float fG = Float.isNaN(f1Var.g()) ? 0.0f : f1Var.g();
        f1Var.h(fE);
        return a(fE - fG);
    }

    @Override // o2.a
    public final Object v0(long j, ti.c cVar) {
        x.o1 o1Var = x.o1.f19664a;
        float fC = s3.q.c(j);
        x5 x5Var = this.f2679a;
        float f10 = x5Var.f2867d.f();
        float fC2 = x5Var.f2867d.d().c();
        if (fC >= 0.0f || f10 <= fC2) {
            j = 0;
        } else {
            this.f2680b.invoke(new Float(fC));
        }
        return new s3.q(j);
    }
}
