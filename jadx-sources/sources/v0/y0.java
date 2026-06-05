package v0;

import c1.z2;
import f1.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class y0 implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17536a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17537b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17538c;

    public /* synthetic */ y0(ej.a aVar, f1 f1Var) {
        this.f17537b = aVar;
        this.f17538c = f1Var;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ej.c, vi.i] */
    @Override // ej.a
    public final Object a() {
        int i10 = this.f17536a;
        pi.o oVar = pi.o.f13011a;
        Object obj = this.f17538c;
        Object obj2 = this.f17537b;
        switch (i10) {
            case 0:
                qj.a0 a0Var = qj.a0.f13538a;
                qj.b0.w((qj.z) obj2, null, new z2((vi.i) obj, null), 1);
                break;
            default:
                ej.a aVar = (ej.a) obj2;
                f1 f1Var = (f1) obj;
                if (f1Var.g() < -200.0f) {
                    aVar.a();
                }
                f1Var.h(0.0f);
                break;
        }
        return oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ y0(qj.z zVar, ej.c cVar) {
        this.f17537b = zVar;
        this.f17538c = (vi.i) cVar;
    }
}
