package qj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d implements j {

    /* renamed from: a, reason: collision with root package name */
    public final c[] f13563a;

    public d(c[] cVarArr) {
        this.f13563a = cVarArr;
    }

    @Override // qj.j
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (c cVar : this.f13563a) {
            o0 o0Var = cVar.f13559f;
            if (o0Var == null) {
                fj.l.l("handle");
                throw null;
            }
            o0Var.a();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f13563a + ']';
    }
}
