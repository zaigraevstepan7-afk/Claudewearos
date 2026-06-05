package t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final p1 f15165a;

    /* renamed from: b, reason: collision with root package name */
    public final f1.j1 f15166b = f1.s.A(null);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j1 f15167c;

    public f1(j1 j1Var, p1 p1Var, String str) {
        this.f15167c = j1Var;
        this.f15165a = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e1 a(ej.c cVar, ej.c cVar2) {
        f1.j1 j1Var = this.f15166b;
        e1 e1Var = (e1) j1Var.getValue();
        j1 j1Var2 = this.f15167c;
        if (e1Var == null) {
            Object objInvoke = cVar2.invoke(j1Var2.c());
            Object objInvoke2 = cVar2.invoke(j1Var2.c());
            p1 p1Var = this.f15165a;
            p pVar = (p) p1Var.f15249a.invoke(objInvoke2);
            pVar.d();
            i1 i1Var = new i1(j1Var2, objInvoke, pVar, p1Var);
            e1Var = new e1(this, i1Var, cVar, cVar2);
            j1Var.setValue(e1Var);
            j1Var2.f15208i.add(i1Var);
        }
        e1Var.f15156c = (fj.m) cVar2;
        e1Var.f15155b = cVar;
        e1Var.b(j1Var2.f());
        return e1Var;
    }
}
