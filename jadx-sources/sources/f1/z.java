package f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final ej.c f6497a;

    /* renamed from: b, reason: collision with root package name */
    public a0 f6498b;

    public z(ej.c cVar) {
        this.f6497a = cVar;
    }

    @Override // f1.c2
    public final void c() {
        a0 a0Var = this.f6498b;
        if (a0Var != null) {
            a0Var.a();
        }
        this.f6498b = null;
    }

    @Override // f1.c2
    public final void d() {
        this.f6498b = (a0) this.f6497a.invoke(s.f6441b);
    }

    @Override // f1.c2
    public final void a() {
    }
}
