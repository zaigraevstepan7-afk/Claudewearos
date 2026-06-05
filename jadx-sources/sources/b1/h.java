package b1;

import d1.m0;
import f1.s;
import pi.o;
import qj.b0;
import qj.z;
import sa.l;
import t.j1;
import v.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1482a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f1483b;

    /* renamed from: c, reason: collision with root package name */
    public float f1484c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f1485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1486e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, float f10, t.j jVar, ti.c cVar) {
        super(2, cVar);
        this.f1485d = iVar;
        this.f1484c = f10;
        this.f1486e = jVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f1482a) {
            case 0:
                return new h((i) this.f1485d, this.f1484c, (t.j) this.f1486e, cVar);
            case 1:
                h hVar = new h((hb.h) this.f1486e, this.f1484c, cVar);
                hVar.f1485d = obj;
                return hVar;
            default:
                h hVar2 = new h((j1) this.f1486e, cVar);
                hVar2.f1485d = obj;
                return hVar2;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f1482a) {
        }
        return ((h) create(zVar, cVar)).invokeSuspend(o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        float fP;
        z zVar;
        switch (this.f1482a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f1483b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    t.c cVar = (t.c) ((i) this.f1485d).f1489c;
                    Float f10 = new Float(this.f1484c);
                    t.j jVar = (t.j) this.f1486e;
                    this.f1483b = 1;
                    if (t.c.d(cVar, f10, jVar, null, null, this, 12) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return o.f13011a;
            case 1:
                z zVar2 = (z) this.f1485d;
                ui.a aVar2 = ui.a.f17085a;
                int i11 = this.f1483b;
                if (i11 == 0) {
                    uk.c.R(obj);
                    hb.h hVar = (hb.h) this.f1486e;
                    v.j1 j1Var = hVar.f7812q;
                    hb.c cVar2 = new hb.c(hVar, this.f1484c, zVar2, null);
                    this.f1485d = null;
                    this.f1483b = 1;
                    f1 f1Var = f1.f17189a;
                    j1Var.getClass();
                    if (b0.h(new m0(f1Var, j1Var, cVar2, (ti.c) null), this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return o.f13011a;
            default:
                ui.a aVar3 = ui.a.f17085a;
                int i12 = this.f1483b;
                if (i12 == 0) {
                    uk.c.R(obj);
                    z zVar3 = (z) this.f1485d;
                    fP = t.d.p(zVar3.Q());
                    zVar = zVar3;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fP = this.f1484c;
                    zVar = (z) this.f1485d;
                    uk.c.R(obj);
                }
                while (b0.s(zVar)) {
                    l lVar = new l((j1) this.f1486e, fP, 1);
                    this.f1485d = zVar;
                    this.f1484c = fP;
                    this.f1483b = 1;
                    if (s.v(getContext()).a(lVar, this) == aVar3) {
                        return aVar3;
                    }
                }
                return o.f13011a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(hb.h hVar, float f10, ti.c cVar) {
        super(2, cVar);
        this.f1486e = hVar;
        this.f1484c = f10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j1 j1Var, ti.c cVar) {
        super(2, cVar);
        this.f1486e = j1Var;
    }
}
