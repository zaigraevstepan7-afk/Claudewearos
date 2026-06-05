package d0;

import c1.z2;
import f0.r0;
import f0.v0;
import f1.y;
import v.f1;
import x.o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final y f4351a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f4352b;

    public d(u uVar) {
        this.f4352b = uVar;
        this.f4351a = f1.s.q(new a7.e(uVar, 6));
    }

    @Override // f0.r0
    public final int a() {
        u uVar = this.f4352b;
        return (int) (uVar.g().f4406o == o1.f19664a ? uVar.g().b() & 4294967295L : uVar.g().b() >> 32);
    }

    @Override // f0.r0
    public final float b() {
        u uVar = this.f4352b;
        return (uVar.f4444e.f4425b.g() * 500) + uVar.f4444e.f4426c.g();
    }

    @Override // f0.r0
    public final int c() {
        u uVar = this.f4352b;
        return (-uVar.g().f4403l) + uVar.g().f4407p;
    }

    @Override // f0.r0
    public final float d() {
        u uVar = this.f4352b;
        int iG = uVar.f4444e.f4425b.g();
        int iG2 = uVar.f4444e.f4426c.g();
        return uVar.d() ? (iG * 500) + iG2 + 100 : (iG * 500) + iG2;
    }

    @Override // f0.r0
    public final d3.d e() {
        return new d3.d(((Number) this.f4351a.getValue()).intValue(), 1);
    }

    @Override // f0.r0
    public final Object f(int i10, v0 v0Var) {
        qh.c cVar = u.f4439x;
        u uVar = this.f4352b;
        uVar.getClass();
        Object objB = uVar.b(f1.f17189a, new z2(uVar, i10, null, 3), v0Var);
        ui.a aVar = ui.a.f17085a;
        pi.o oVar = pi.o.f13011a;
        if (objB != aVar) {
            objB = oVar;
        }
        return objB == aVar ? objB : oVar;
    }
}
