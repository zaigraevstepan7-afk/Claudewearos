package t;

import f1.q2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e1 implements q2 {

    /* renamed from: a, reason: collision with root package name */
    public final i1 f15154a;

    /* renamed from: b, reason: collision with root package name */
    public ej.c f15155b;

    /* renamed from: c, reason: collision with root package name */
    public fj.m f15156c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1 f15157d;

    /* JADX WARN: Multi-variable type inference failed */
    public e1(f1 f1Var, i1 i1Var, ej.c cVar, ej.c cVar2) {
        this.f15157d = f1Var;
        this.f15154a = i1Var;
        this.f15155b = cVar;
        this.f15156c = (fj.m) cVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ej.c, fj.m] */
    /* JADX WARN: Type inference failed for: r1v5, types: [ej.c, fj.m] */
    public final void b(g1 g1Var) {
        Object objInvoke = this.f15156c.invoke(g1Var.c());
        boolean zG = this.f15157d.f15167c.g();
        i1 i1Var = this.f15154a;
        if (zG) {
            i1Var.f(this.f15156c.invoke(g1Var.b()), objInvoke, (z) this.f15155b.invoke(g1Var));
        } else {
            i1Var.g(objInvoke, (z) this.f15155b.invoke(g1Var));
        }
    }

    @Override // f1.q2
    public final Object getValue() {
        b(this.f15157d.f15167c.f());
        return this.f15154a.A.getValue();
    }
}
