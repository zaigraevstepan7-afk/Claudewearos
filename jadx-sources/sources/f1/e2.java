package f1;

import c1.s3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e2 extends ti.a implements qj.x {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u1.f f6286b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f2 f6287c;

    /* JADX WARN: Illegal instructions before constructor call */
    public e2(u1.f fVar, f2 f2Var) {
        qj.w wVar = qj.w.f13631a;
        this.f6286b = fVar;
        this.f6287c = f2Var;
        super(wVar);
    }

    @Override // qj.x
    public final void l(Throwable th2, ti.h hVar) throws Throwable {
        u1.f fVar = this.f6286b;
        f2 f2Var = this.f6287c;
        u1.d.h(th2, new s3(25, fVar, f2Var));
        qj.x xVar = (qj.x) f2Var.f6298a.C(qj.w.f13631a);
        if (xVar == null) {
            throw th2;
        }
        xVar.l(th2, hVar);
    }
}
