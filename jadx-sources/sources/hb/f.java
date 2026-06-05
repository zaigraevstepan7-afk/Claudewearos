package hb;

import pi.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f implements tj.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m5.n f7791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f7792b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f7793c;

    public f(m5.n nVar, h hVar, float f10) {
        this.f7791a = nVar;
        this.f7792b = hVar;
        this.f7793c = f10;
    }

    @Override // tj.e
    public final Object c(tj.f fVar, ti.c cVar) throws Throwable {
        Object objC = this.f7791a.c(new e(fVar, this.f7792b, this.f7793c), cVar);
        return objC == ui.a.f17085a ? objC : o.f13011a;
    }
}
