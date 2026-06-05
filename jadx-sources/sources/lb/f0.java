package lb;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10271a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10272b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10273c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.a1 f10274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10275e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f10276f;

    public /* synthetic */ f0(f1.a1 a1Var, f1.a1 a1Var2, f1.a1 a1Var3, f1.a1 a1Var4, f1.a1 a1Var5) {
        this.f10272b = a1Var;
        this.f10273c = a1Var2;
        this.f10274d = a1Var3;
        this.f10275e = a1Var4;
        this.f10276f = a1Var5;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f10271a) {
            case 0:
                qj.z zVar = (qj.z) this.f10275e;
                Context context = (Context) this.f10276f;
                Boolean bool = Boolean.TRUE;
                f1.a1 a1Var = this.f10272b;
                a1Var.setValue(bool);
                f1.a1 a1Var2 = this.f10273c;
                a1Var2.setValue(null);
                qj.b0.w(zVar, null, new ab.q(context, this.f10274d, a1Var2, a1Var, (ti.c) null), 3);
                break;
            default:
                f1.a1 a1Var3 = (f1.a1) this.f10275e;
                f1.a1 a1Var4 = (f1.a1) this.f10276f;
                mg.f.c(cg.i.e(), "https://voidlauncher2anonlab-default-rtdb.europe-west1.firebasedatabase.app").d().b("config/dev/password").c().addOnSuccessListener(new ac.h(new d.b(this.f10272b, this.f10273c, this.f10274d, a1Var3, a1Var4), 15)).addOnFailureListener(new d.c(a1Var4));
                break;
        }
        return pi.o.f13011a;
    }

    public /* synthetic */ f0(qj.z zVar, f1.a1 a1Var, f1.a1 a1Var2, Context context, f1.a1 a1Var3) {
        this.f10275e = zVar;
        this.f10272b = a1Var;
        this.f10273c = a1Var2;
        this.f10276f = context;
        this.f10274d = a1Var3;
    }
}
