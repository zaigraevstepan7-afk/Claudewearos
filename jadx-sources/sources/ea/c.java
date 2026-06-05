package ea;

import pi.o;
import tj.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements tj.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5839a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tj.e f5840b;

    public c(tj.e eVar) {
        this.f5840b = eVar;
    }

    @Override // tj.e
    public final Object c(tj.f fVar, ti.c cVar) {
        int i10 = this.f5839a;
        o oVar = o.f13011a;
        tj.e eVar = this.f5840b;
        switch (i10) {
            case 0:
                g gVar = h.f5844a;
                Object objC = eVar.c(new b(fVar), cVar);
                return objC == ui.a.f17085a ? objC : oVar;
            default:
                Object objC2 = eVar.c(new b(fVar, 2), cVar);
                return objC2 == ui.a.f17085a ? objC2 : oVar;
        }
    }

    public c(r0 r0Var) {
        g gVar = h.f5844a;
        this.f5840b = r0Var;
    }
}
