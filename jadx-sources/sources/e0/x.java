package e0;

import c1.z2;
import f0.r0;
import f0.v0;
import v.f1;
import x.o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f5349a;

    public x(v vVar) {
        this.f5349a = vVar;
    }

    @Override // f0.r0
    public final int a() {
        v vVar = this.f5349a;
        return (int) (vVar.g().f5272q == o1.f19664a ? vVar.g().b() & 4294967295L : vVar.g().b() >> 32);
    }

    @Override // f0.r0
    public final float b() {
        v vVar = this.f5349a;
        return (vVar.f5330d.f4425b.g() * 500) + vVar.f5330d.f4426c.g();
    }

    @Override // f0.r0
    public final int c() {
        v vVar = this.f5349a;
        return (-vVar.g().f5269n) + vVar.g().f5273r;
    }

    @Override // f0.r0
    public final float d() {
        v vVar = this.f5349a;
        int iG = vVar.f5330d.f4425b.g();
        int iG2 = vVar.f5330d.f4426c.g();
        return vVar.d() ? (iG * 500) + iG2 + 100 : (iG * 500) + iG2;
    }

    @Override // f0.r0
    public final d3.d e() {
        return new d3.d(-1, -1);
    }

    @Override // f0.r0
    public final Object f(int i10, v0 v0Var) {
        qh.c cVar = v.f5326w;
        v vVar = this.f5349a;
        vVar.getClass();
        Object objB = vVar.b(f1.f17189a, new z2(vVar, i10, null, 4), v0Var);
        ui.a aVar = ui.a.f17085a;
        pi.o oVar = pi.o.f13011a;
        if (objB != aVar) {
            objB = oVar;
        }
        return objB == aVar ? objB : oVar;
    }
}
