package c1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class k6 implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x6 f2343b;

    public /* synthetic */ k6(x6 x6Var, int i10) {
        this.f2342a = i10;
        this.f2343b = x6Var;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        boolean z2;
        switch (this.f2342a) {
            case 0:
                s3.l lVar = (s3.l) obj;
                int i10 = (int) (lVar.f14751a >> 32);
                x6 x6Var = this.f2343b;
                x6Var.f2878i.h(i10);
                x6Var.j.h((int) (lVar.f14751a & 4294967295L));
                break;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                x6 x6Var2 = this.f2343b;
                kj.d dVar = x6Var2.f2870a;
                float fO = cg.b.o(fFloatValue, dVar.f9663a, dVar.f9664b);
                f1.f1 f1Var = x6Var2.f2871b;
                if (fO == f1Var.g()) {
                    z2 = false;
                } else {
                    if (fO != f1Var.g()) {
                        ej.c cVar = x6Var2.f2872c;
                        if (cVar != null) {
                            cVar.invoke(Float.valueOf(fO));
                        } else {
                            x6Var2.d(fO);
                        }
                    }
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            default:
                x6 x6Var3 = this.f2343b;
                x6Var3.b(0.0f);
                x6Var3.f2881m.a();
                break;
        }
        return pi.o.f13011a;
    }
}
