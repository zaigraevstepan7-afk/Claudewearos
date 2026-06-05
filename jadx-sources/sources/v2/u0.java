package v2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u0 extends fj.m implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17787a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f17788b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(v0 v0Var, int i10) {
        super(0);
        this.f17787a = i10;
        this.f17788b = v0Var;
    }

    @Override // ej.a
    public final Object a() {
        t2.e1 placementScope;
        switch (this.f17787a) {
            case 0:
                v0 v0Var = this.f17788b;
                j0 j0Var = v0Var.f17793f;
                j0Var.f17697i = 0;
                g1.e eVarY = j0Var.f17689a.y();
                Object[] objArr = eVarY.f7024a;
                int i10 = eVarY.f7026c;
                for (int i11 = 0; i11 < i10; i11++) {
                    v0 v0Var2 = ((f0) objArr[i11]).Z.f17703p;
                    v0Var2.A = v0Var2.B;
                    v0Var2.B = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                    v0Var2.M = false;
                    if (v0Var2.E == d0.f17603b) {
                        v0Var2.E = d0.f17604c;
                    }
                }
                f0 f0Var = j0Var.f17689a;
                f0 f0Var2 = j0Var.f17689a;
                g1.e eVarY2 = f0Var.y();
                Object[] objArr2 = eVarY2.f7024a;
                int i12 = eVarY2.f7026c;
                for (int i13 = 0; i13 < i12; i13++) {
                    ((f0) objArr2[i13]).Z.f17703p.Q.f17655d = false;
                }
                if (v0Var.A().D) {
                    g1.b bVar = (g1.b) f0Var2.n();
                    int i14 = ((g1.e) bVar.f7016b).f7026c;
                    for (int i15 = 0; i15 < i14; i15++) {
                        ((f0) bVar.get(i15)).Y.f17584d.D = true;
                    }
                }
                v0Var.A().e1().g();
                if (v0Var.A().D) {
                    g1.b bVar2 = (g1.b) f0Var2.n();
                    int i16 = ((g1.e) bVar2.f7016b).f7026c;
                    for (int i17 = 0; i17 < i16; i17++) {
                        ((f0) bVar2.get(i17)).Y.f17584d.D = false;
                    }
                }
                g1.e eVarY3 = f0Var2.y();
                Object[] objArr3 = eVarY3.f7024a;
                int i18 = eVarY3.f7026c;
                for (int i19 = 0; i19 < i18; i19++) {
                    f0 f0Var3 = (f0) objArr3[i19];
                    j0 j0Var2 = f0Var3.Z;
                    if (j0Var2.f17703p.A != f0Var3.v()) {
                        f0Var2.O();
                        f0Var2.B();
                        if (f0Var3.v() == Integer.MAX_VALUE) {
                            if (j0Var2.f17691c || n.s(f0Var3)) {
                                r0 r0Var = j0Var2.f17704q;
                                fj.l.c(r0Var);
                                r0Var.P0(false);
                            }
                            j0Var2.f17703p.R0();
                        }
                    }
                }
                g1.e eVarY4 = f0Var2.y();
                Object[] objArr4 = eVarY4.f7024a;
                int i20 = eVarY4.f7026c;
                for (int i21 = 0; i21 < i20; i21++) {
                    g0 g0Var = ((f0) objArr4[i21]).Z.f17703p.Q;
                    g0Var.f17656e = g0Var.f17655d;
                }
                break;
            case 1:
                v0 v0Var3 = this.f17788b;
                v0Var3.f17793f.a().Y(v0Var3.U);
                break;
            default:
                v0 v0Var4 = this.f17788b;
                j0 j0Var3 = v0Var4.f17793f;
                i1 i1Var = j0Var3.a().J;
                if (i1Var == null || (placementScope = i1Var.E) == null) {
                    placementScope = ((w2.t) i0.a(j0Var3.f17689a)).getPlacementScope();
                }
                ej.c cVar = v0Var4.Z;
                if (cVar == null) {
                    i1 i1VarA = j0Var3.a();
                    long j = v0Var4.f17789a0;
                    float f10 = v0Var4.f17790b0;
                    placementScope.getClass();
                    t2.e1.f(placementScope, i1VarA);
                    i1VarA.G0(s3.j.c(j, i1VarA.f15554e), f10, null);
                } else {
                    i1 i1VarA2 = j0Var3.a();
                    long j4 = v0Var4.f17789a0;
                    float f11 = v0Var4.f17790b0;
                    placementScope.getClass();
                    t2.e1.f(placementScope, i1VarA2);
                    i1VarA2.G0(s3.j.c(j4, i1VarA2.f15554e), f11, cVar);
                }
                break;
        }
        return pi.o.f13011a;
    }
}
