package hb;

import pi.o;
import qj.b0;
import qj.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7826a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7827b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f7828c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, ti.c cVar, int i10) {
        super(2, cVar);
        this.f7826a = i10;
        this.f7828c = nVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f7826a) {
            case 0:
                m mVar = new m(this.f7828c, cVar, 0);
                mVar.f7827b = obj;
                return mVar;
            case 1:
                m mVar2 = new m(this.f7828c, cVar, 1);
                mVar2.f7827b = obj;
                return mVar2;
            default:
                m mVar3 = new m(this.f7828c, cVar, 2);
                mVar3.f7827b = obj;
                return mVar3;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f7826a) {
            case 0:
                m mVar = (m) create(zVar, cVar);
                o oVar = o.f13011a;
                mVar.invokeSuspend(oVar);
                return oVar;
            case 1:
                m mVar2 = (m) create(zVar, cVar);
                o oVar2 = o.f13011a;
                mVar2.invokeSuspend(oVar2);
                return oVar2;
            default:
                m mVar3 = (m) create(zVar, cVar);
                o oVar3 = o.f13011a;
                mVar3.invokeSuspend(oVar3);
                return oVar3;
        }
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f7826a;
        o oVar = o.f13011a;
        n nVar = this.f7828c;
        ti.c cVar = null;
        int i11 = 3;
        switch (i10) {
            case 0:
                z zVar = (z) this.f7827b;
                ui.a aVar = ui.a.f17085a;
                uk.c.R(obj);
                b0.w(zVar, null, new l(nVar, cVar, 0), 3);
                b0.w(zVar, null, new l(nVar, cVar, 1), 3);
                break;
            case 1:
                z zVar2 = (z) this.f7827b;
                ui.a aVar2 = ui.a.f17085a;
                uk.c.R(obj);
                b0.w(zVar2, null, new l(nVar, cVar, 2), 3);
                b0.w(zVar2, null, new l(nVar, cVar, i11), 3);
                break;
            default:
                z zVar3 = (z) this.f7827b;
                ui.a aVar3 = ui.a.f17085a;
                uk.c.R(obj);
                b0.w(zVar3, null, new l(nVar, cVar, 4), 3);
                b0.w(zVar3, null, new l(nVar, cVar, 5), 3);
                break;
        }
        return oVar;
    }
}
