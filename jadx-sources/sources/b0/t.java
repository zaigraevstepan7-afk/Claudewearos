package b0;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1422a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1423b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1424c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1426e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1427f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f1428z;

    public /* synthetic */ t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f1422a = i10;
        this.f1423b = obj;
        this.f1424c = obj2;
        this.f1425d = obj3;
        this.f1426e = obj4;
        this.f1427f = obj5;
        this.f1428z = obj6;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f1422a) {
            case 0:
                t2.f1[] f1VarArr = (t2.f1[]) this.f1423b;
                List list = (List) this.f1424c;
                t2.s0 s0Var = (t2.s0) this.f1425d;
                fj.t tVar = (fj.t) this.f1426e;
                fj.t tVar2 = (fj.t) this.f1427f;
                u uVar = (u) this.f1428z;
                t2.e1 e1Var = (t2.e1) obj;
                int length = f1VarArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i11 < length) {
                    t2.f1 f1Var = f1VarArr[i11];
                    fj.l.d(f1Var, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    r.b(e1Var, f1Var, (t2.p0) list.get(i10), s0Var.getLayoutDirection(), tVar.f6805a, tVar2.f6805a, uVar.f1440a);
                    i11++;
                    i10++;
                }
                return pi.o.f13011a;
            default:
                f1.a1 a1Var = (f1.a1) this.f1423b;
                f1.a1 a1Var2 = (f1.a1) this.f1424c;
                f1.g1 g1Var = (f1.g1) this.f1425d;
                f1.a1 a1Var3 = (f1.a1) this.f1426e;
                f1.a1 a1Var4 = (f1.a1) this.f1427f;
                f1.a1 a1Var5 = (f1.a1) this.f1428z;
                fj.l.f((f1.b0) obj, "$this$DisposableEffect");
                mg.d dVarD = mg.f.c(cg.i.e(), "https://voidlauncher2anonlab-default-rtdb.europe-west1.firebasedatabase.app").d();
                uf.p pVar = new uf.p();
                pVar.f17052a = a1Var;
                pVar.f17053b = a1Var2;
                pVar.f17054c = g1Var;
                pVar.f17055d = a1Var3;
                pVar.f17056e = a1Var4;
                pVar.f17057f = a1Var5;
                dVarD.b("config").a(pVar);
                return new e2(5, dVarD, pVar);
        }
    }
}
