package u6;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o extends f7.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b4.e f16764b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(b4.e eVar, int i10) {
        super(i10);
        this.f16764b = eVar;
    }

    @Override // f7.c
    public final void h(g7.b bVar) throws Exception {
        this.f16764b.j(new h7.a(bVar));
    }

    @Override // f7.c
    public final void i(g7.b bVar, int i10, int i11) throws Exception {
        k(bVar, i10, i11);
    }

    @Override // f7.c
    public final void j(g7.b bVar) throws Exception {
        h7.a aVar = new h7.a(bVar);
        b4.e eVar = this.f16764b;
        eVar.l(aVar);
        eVar.f1540i = bVar;
    }

    @Override // f7.c
    public final void k(g7.b bVar, int i10, int i11) throws Exception {
        this.f16764b.k(new h7.a(bVar), i10, i11);
    }
}
