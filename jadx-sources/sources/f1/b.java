package f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6268a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f6269b;

    public /* synthetic */ b(long j, int i10) {
        this.f6268a = i10;
        this.f6269b = j;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        qj.l lVar;
        Object objR;
        switch (this.f6268a) {
            case 0:
                long j = this.f6269b;
                c cVar = (c) obj;
                ej.c cVar2 = cVar.f6274b;
                if (cVar2 != null && (lVar = cVar.f6273a) != null) {
                    try {
                        objR = cVar2.invoke(Long.valueOf(j));
                    } catch (Throwable th2) {
                        objR = uk.c.r(th2);
                    }
                    lVar.resumeWith(objR);
                }
                break;
            case 1:
                e2.d dVar = (e2.d) obj;
                fj.l.f(dVar, "$this$drawBackdrop");
                e2.d.c1(dVar, this.f6269b, 0L, 0L, 0.0f, null, 0, 126);
                break;
            case 2:
                e2.d dVar2 = (e2.d) obj;
                fj.l.f(dVar2, "$this$drawBackdrop");
                e2.d.c1(dVar2, this.f6269b, 0L, 0L, 0.0f, null, 0, 126);
                break;
            case 3:
                z1.d dVar3 = (z1.d) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar3.f20354a.a() >> 32)) / 2.0f;
                break;
            case 4:
                ((d3.z) obj).b(v0.f0.f17389c, new v0.e0(k0.j0.f9133a, this.f6269b, v0.d0.f17372b, true));
                break;
            case 5:
                v2.h0 h0Var = (v2.h0) obj;
                fj.l.f(h0Var, "$this$rememberLayerBackdrop");
                e2.d.c1(h0Var, this.f6269b, 0L, 0L, 0.0f, null, 0, 126);
                h0Var.f();
                break;
            default:
                e2.d dVar4 = (e2.d) obj;
                fj.l.f(dVar4, "$this$drawBackdrop");
                e2.d.c1(dVar4, c2.w.c(this.f6269b, 0.85f), 0L, 0L, 0.0f, null, 0, 126);
                break;
        }
        return pi.o.f13011a;
    }
}
