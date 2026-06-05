package wg;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final rg.h f19289a;

    /* renamed from: b, reason: collision with root package name */
    public final rg.f f19290b;

    /* renamed from: c, reason: collision with root package name */
    public final mg.b f19291c;

    public b(rg.f fVar, mg.b bVar, rg.h hVar) {
        this.f19290b = fVar;
        this.f19289a = hVar;
        this.f19291c = bVar;
    }

    @Override // wg.e
    public final void a() {
        this.f19290b.c(this.f19291c);
    }

    @Override // wg.e
    public final String toString() {
        return this.f19289a + ":CANCEL";
    }
}
