package sa;

import wa.o0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.c f14913b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14914c;

    public /* synthetic */ n(int i10, ej.c cVar, Object obj) {
        this.f14912a = i10;
        this.f14913b = cVar;
        this.f14914c = obj;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f14912a) {
            case 0:
                this.f14913b.invoke((na.b) this.f14914c);
                break;
            default:
                this.f14913b.invoke(Integer.valueOf(((o0) this.f14914c).f19130a.f19862a));
                break;
        }
        return pi.o.f13011a;
    }
}
