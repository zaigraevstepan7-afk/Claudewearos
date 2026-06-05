package c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w extends j6.d {

    /* renamed from: d, reason: collision with root package name */
    public final x f1860d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1861e;

    public w(x xVar, y yVar) {
        boolean z2 = xVar.f1863b;
        this.f8702a = yVar;
        this.f8703b = z2;
        this.f1860d = xVar;
        this.f1861e = true;
    }

    @Override // j6.d
    public final void a() {
        this.f1860d.a();
    }

    @Override // j6.d
    public final void b() {
        this.f1860d.b();
    }

    @Override // j6.d
    public final void c(j6.b bVar) {
        this.f1860d.c(new a(bVar));
    }

    @Override // j6.d
    public final void d(j6.b bVar) {
        fj.l.f(bVar, "event");
        this.f1860d.d(new a(bVar));
    }

    public final void g(boolean z2) {
        this.f1861e = z2;
        f(z2 && this.f1860d.f1863b);
    }
}
