package androidx.lifecycle;

import qj.e1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i0 implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f1094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fj.v f1095b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qj.z f1096c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f1097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qj.l f1098e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yj.c f1099f;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ ab.s f1100z;

    public i0(n nVar, fj.v vVar, qj.z zVar, n nVar2, qj.l lVar, yj.c cVar, ab.s sVar) {
        this.f1094a = nVar;
        this.f1095b = vVar;
        this.f1096c = zVar;
        this.f1097d = nVar2;
        this.f1098e = lVar;
        this.f1099f = cVar;
        this.f1100z = sVar;
    }

    @Override // androidx.lifecycle.r
    public final void e(t tVar, n nVar) {
        n nVar2 = this.f1094a;
        fj.v vVar = this.f1095b;
        if (nVar == nVar2) {
            vVar.f6807a = qj.b0.w(this.f1096c, null, new ab.q(this.f1099f, this.f1100z, (ti.c) null, 1), 3);
            return;
        }
        if (nVar == this.f1097d) {
            e1 e1Var = (e1) vVar.f6807a;
            if (e1Var != null) {
                e1Var.e(null);
            }
            vVar.f6807a = null;
        }
        if (nVar == n.ON_DESTROY) {
            this.f1098e.resumeWith(pi.o.f13011a);
        }
    }
}
