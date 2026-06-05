package v2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q0 extends fj.m implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17746a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f17747b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(r0 r0Var, int i10) {
        super(0);
        this.f17746a = i10;
        this.f17747b = r0Var;
    }

    @Override // ej.a
    public final Object a() {
        o0 o0VarU1;
        switch (this.f17746a) {
            case 0:
                r0 r0Var = this.f17747b;
                j0 j0Var = r0Var.f17748f;
                j0Var.f17696h = 0;
                g1.e eVarY = j0Var.f17689a.y();
                Object[] objArr = eVarY.f7024a;
                int i10 = eVarY.f7026c;
                for (int i11 = 0; i11 < i10; i11++) {
                    r0 r0Var2 = ((f0) objArr[i11]).Z.f17704q;
                    fj.l.c(r0Var2);
                    r0Var2.A = r0Var2.B;
                    r0Var2.B = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                    if (r0Var2.C == d0.f17603b) {
                        r0Var2.C = d0.f17604c;
                    }
                }
                f0 f0Var = j0Var.f17689a;
                f0 f0Var2 = j0Var.f17689a;
                g1.e eVarY2 = f0Var.y();
                Object[] objArr2 = eVarY2.f7024a;
                int i12 = eVarY2.f7026c;
                for (int i13 = 0; i13 < i12; i13++) {
                    r0 r0Var3 = ((f0) objArr2[i13]).Z.f17704q;
                    fj.l.c(r0Var3);
                    r0Var3.K.f17655d = false;
                }
                r rVar = r0Var.A().f17752l0;
                if (rVar != null) {
                    boolean z2 = rVar.D;
                    g1.b bVar = (g1.b) f0Var2.n();
                    int i14 = ((g1.e) bVar.f7016b).f7026c;
                    for (int i15 = 0; i15 < i14; i15++) {
                        o0 o0VarU12 = ((f0) bVar.get(i15)).Y.f17584d.u1();
                        if (o0VarU12 != null) {
                            o0VarU12.D = z2;
                        }
                    }
                }
                r rVar2 = r0Var.A().f17752l0;
                fj.l.c(rVar2);
                rVar2.e1().g();
                if (r0Var.A().f17752l0 != null) {
                    g1.b bVar2 = (g1.b) f0Var2.n();
                    int i16 = ((g1.e) bVar2.f7016b).f7026c;
                    for (int i17 = 0; i17 < i16; i17++) {
                        o0 o0VarU13 = ((f0) bVar2.get(i17)).Y.f17584d.u1();
                        if (o0VarU13 != null) {
                            o0VarU13.D = false;
                        }
                    }
                }
                g1.e eVarY3 = f0Var2.y();
                Object[] objArr3 = eVarY3.f7024a;
                int i18 = eVarY3.f7026c;
                for (int i19 = 0; i19 < i18; i19++) {
                    r0 r0Var4 = ((f0) objArr3[i19]).Z.f17704q;
                    fj.l.c(r0Var4);
                    int i20 = r0Var4.A;
                    int i21 = r0Var4.B;
                    if (i20 != i21 && i21 == Integer.MAX_VALUE) {
                        r0Var4.P0(true);
                    }
                }
                g1.e eVarY4 = f0Var2.y();
                Object[] objArr4 = eVarY4.f7024a;
                int i22 = eVarY4.f7026c;
                for (int i23 = 0; i23 < i22; i23++) {
                    r0 r0Var5 = ((f0) objArr4[i23]).Z.f17704q;
                    fj.l.c(r0Var5);
                    g0 g0Var = r0Var5.K;
                    g0Var.f17656e = g0Var.f17655d;
                }
                break;
            case 1:
                r0 r0Var6 = this.f17747b;
                j0 j0Var2 = r0Var6.f17748f;
                t2.e1 placementScope = null;
                if (n.s(j0Var2.f17689a) || j0Var2.f17691c) {
                    i1 i1Var = j0Var2.a().J;
                    if (i1Var != null) {
                        placementScope = i1Var.E;
                    }
                } else {
                    i1 i1Var2 = j0Var2.a().J;
                    if (i1Var2 != null && (o0VarU1 = i1Var2.u1()) != null) {
                        placementScope = o0VarU1.E;
                    }
                }
                if (placementScope == null) {
                    placementScope = ((w2.t) i0.a(j0Var2.f17689a)).getPlacementScope();
                }
                o0 o0VarU14 = j0Var2.a().u1();
                fj.l.c(o0VarU14);
                t2.e1.C(placementScope, o0VarU14, r0Var6.H);
                break;
            default:
                r0 r0Var7 = this.f17747b;
                o0 o0VarU15 = r0Var7.f17748f.a().u1();
                fj.l.c(o0VarU15);
                o0VarU15.Y(r0Var7.R);
                break;
        }
        return pi.o.f13011a;
    }
}
