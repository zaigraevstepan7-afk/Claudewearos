package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2727a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x5 f2728b;

    public /* synthetic */ u(x5 x5Var, int i10) {
        this.f2727a = i10;
        this.f2728b = x5Var;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        c2.f0 f0Var = (c2.f0) obj;
        switch (this.f2727a) {
            case 0:
                d1.q qVar = this.f2728b.f2867d;
                float fG = qVar.j.g();
                float fC = qVar.d().c();
                float f10 = fG < fC ? fC - fG : 0.0f;
                f0Var.j(f10 > 0.0f ? (Float.intBitsToFloat((int) (f0Var.a() & 4294967295L)) + f10) / Float.intBitsToFloat((int) (4294967295L & f0Var.a())) : 1.0f);
                f0Var.J0(c2.e0.h(0.5f, 0.0f));
                break;
            default:
                d1.q qVar2 = this.f2728b.f2867d;
                float fG2 = qVar2.j.g();
                float fC2 = qVar2.d().c();
                float f11 = fG2 < fC2 ? fC2 - fG2 : 0.0f;
                f0Var.j(f11 > 0.0f ? 1 / ((Float.intBitsToFloat((int) (f0Var.a() & 4294967295L)) + f11) / Float.intBitsToFloat((int) (f0Var.a() & 4294967295L))) : 1.0f);
                f0Var.J0(c2.e0.h(0.5f, 0.0f));
                break;
        }
        return pi.o.f13011a;
    }
}
