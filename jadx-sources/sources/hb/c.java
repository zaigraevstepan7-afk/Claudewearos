package hb;

import ab.r;
import androidx.lifecycle.h0;
import pi.o;
import qj.b0;
import qj.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends vi.i implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f7782a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f7783b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f7784c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, float f10, z zVar, ti.c cVar) {
        super(1, cVar);
        this.f7782a = hVar;
        this.f7783b = f10;
        this.f7784c = zVar;
    }

    @Override // vi.a
    public final ti.c create(ti.c cVar) {
        return new c(this.f7782a, this.f7783b, this.f7784c, cVar);
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        c cVar = (c) create((ti.c) obj);
        o oVar = o.f13011a;
        cVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        ui.a aVar = ui.a.f17085a;
        uk.c.R(obj);
        h hVar = this.f7782a;
        q2.b bVar = (q2.b) hVar.f7813r.f12813b;
        q2.d dVar = (q2.d) bVar.f13183b;
        q2.a[] aVarArr = (q2.a[]) dVar.f13192e;
        qi.k.m0(0, aVarArr.length, null, aVarArr);
        dVar.f13189b = 0;
        q2.d dVar2 = (q2.d) bVar.f13184c;
        q2.a[] aVarArr2 = (q2.a[]) dVar2.f13192e;
        qi.k.m0(0, aVarArr2.length, null, aVarArr2);
        dVar2.f13189b = 0;
        bVar.f13182a = 0L;
        z zVar = hVar.f7797a;
        b0.w(zVar, null, new r(hVar, null, 1), 3);
        a aVar2 = new a(hVar, ((Number) cg.b.s(new Float(this.f7783b), hVar.f7798b)).floatValue(), null, 0);
        z zVar2 = this.f7784c;
        b0.w(zVar2, null, aVar2, 3);
        if (((Number) hVar.f7808m.e()).floatValue() != 0.0f) {
            b0.w(zVar2, null, new b(hVar, null, 0), 3);
        }
        b0.w(zVar, null, new h0(hVar, (ti.c) null, 13), 3);
        return o.f13011a;
    }
}
