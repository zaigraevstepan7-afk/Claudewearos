package fi;

import c2.f0;
import c2.u;
import fj.l;
import pi.o;
import t2.w;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6752a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f6753b;

    public /* synthetic */ d(f fVar, int i10) {
        this.f6752a = i10;
        this.f6753b = fVar;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        long j;
        switch (this.f6752a) {
            case 0:
                e2.d dVar = (e2.d) obj;
                l.f(dVar, "$this$recordLayer");
                f fVar = this.f6753b;
                fVar.U.invoke(dVar);
                ej.c cVar = fVar.N;
                if (cVar != null) {
                    cVar.invoke(dVar);
                }
                return o.f13011a;
            case 1:
                f0 f0Var = (f0) obj;
                l.f(f0Var, "<this>");
                f0Var.q(true);
                f0Var.y((j) this.f6753b.I.f6779g);
                f0Var.U(1);
                break;
            case 2:
                e2.d dVar2 = (e2.d) obj;
                l.f(dVar2, "<this>");
                u uVarH = dVar2.C0().h();
                f fVar2 = this.f6753b;
                float fG = fVar2.S.g();
                if (fG != 0.0f) {
                    uVarH.p(fG, fG);
                }
                fVar2.M.invoke(dVar2, new d(fVar2, 4));
                if (fG != 0.0f) {
                    float f10 = -fG;
                    uVarH.p(f10, f10);
                }
                return o.f13011a;
            case 3:
                e2.d dVar3 = (e2.d) obj;
                l.f(dVar3, "<this>");
                f fVar3 = this.f6753b;
                f2.b bVar = fVar3.P;
                if (bVar != null) {
                    float fG2 = fVar3.S.g();
                    int i10 = (int) fG2;
                    int i11 = i10 * 2;
                    c.c(fVar3, dVar3, bVar, ((((int) Float.intBitsToFloat((int) (dVar3.a() >> 32))) + i11) << 32) | ((((int) Float.intBitsToFloat((int) (dVar3.a() & 4294967295L))) + i11) & 4294967295L), fVar3.T);
                    if (fG2 == 0.0f) {
                        j = 0;
                    } else {
                        long j4 = -i10;
                        j = (j4 & 4294967295L) | (j4 << 32);
                    }
                    if (!s3.j.a(bVar.f6532t, j)) {
                        bVar.f6532t = j;
                        bVar.f6514a.y((int) (j >> 32), bVar.f6533u, (int) (j & 4294967295L));
                    }
                    v.C(dVar3, bVar);
                }
                return o.f13011a;
            default:
                e2.d dVar4 = (e2.d) obj;
                l.f(dVar4, "$this$onDrawBackdrop");
                f fVar4 = this.f6753b;
                fVar4.H.b(dVar4, fVar4.O, (w) fVar4.R.getValue(), fVar4.K);
                break;
        }
        return o.f13011a;
    }
}
