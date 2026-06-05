package zg;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d extends x8.a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f20593b = false;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f20594c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f20595d;

    public d(f fVar, e eVar) {
        this.f20595d = fVar;
        this.f20594c = eVar;
    }

    @Override // x8.a
    public final void Y(Object obj, Object obj2) {
        c cVar = (c) obj;
        r rVar = (r) obj2;
        boolean z2 = this.f20593b;
        e eVar = this.f20594c;
        if (!z2) {
            c cVar2 = c.f20591d;
            if (cVar.compareTo(cVar2) > 0) {
                this.f20593b = true;
                eVar.c0(cVar2, this.f20595d.c());
            }
        }
        eVar.c0(cVar, rVar);
    }
}
