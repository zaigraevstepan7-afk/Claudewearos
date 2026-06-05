package u1;

import f0.i0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n extends i0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16580b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f16581c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, int i10) {
        super(3);
        this.f16580b = i10;
        this.f16581c = obj;
    }

    @Override // f0.i0
    public final int j(i1.b bVar) {
        switch (this.f16580b) {
            case 0:
                i1.g gVar = (i1.g) this.f16581c;
                return gVar.i(gVar.f8113a.b(cg.b.g(bVar)));
            default:
                i1.k kVar = (i1.k) this.f16581c;
                return kVar.s(kVar.c(cg.b.g(bVar)));
        }
    }

    @Override // f0.i0
    public final i1.c q(i1.b bVar) {
        switch (this.f16580b) {
            case 0:
                i1.h hVar = ((i1.g) this.f16581c).f8113a;
                hVar.z(hVar.b(cg.b.g(bVar)));
                break;
            default:
                i1.k kVar = (i1.k) this.f16581c;
                kVar.O(kVar.c(cg.b.g(bVar)));
                break;
        }
        return null;
    }
}
