package qj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class j1 extends h1 {
    public final Object A;

    /* renamed from: e, reason: collision with root package name */
    public final l1 f13586e;

    /* renamed from: f, reason: collision with root package name */
    public final k1 f13587f;

    /* renamed from: z, reason: collision with root package name */
    public final p f13588z;

    public j1(l1 l1Var, k1 k1Var, p pVar, Object obj) {
        this.f13586e = l1Var;
        this.f13587f = k1Var;
        this.f13588z = pVar;
        this.A = obj;
    }

    @Override // qj.h1
    public final boolean k() {
        return false;
    }

    @Override // qj.h1
    public final void l(Throwable th2) {
        p pVar = this.f13588z;
        p pVarX = l1.X(pVar);
        l1 l1Var = this.f13586e;
        k1 k1Var = this.f13587f;
        Object obj = this.A;
        if (pVarX == null || !l1Var.g0(k1Var, pVarX, obj)) {
            k1Var.f13593a.d(new vj.i(2), 2);
            p pVarX2 = l1.X(pVar);
            if (pVarX2 == null || !l1Var.g0(k1Var, pVarX2, obj)) {
                l1Var.i(l1Var.y(k1Var, obj));
            }
        }
    }
}
