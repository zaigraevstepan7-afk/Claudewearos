package mi;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements fj.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f11760a;

    public h(i iVar) {
        this.f11760a = iVar;
    }

    @Override // fj.h
    public final pi.c b() {
        return new fj.j(0, this.f11760a, v2.n.class, "invalidateDraw", "invalidateDraw(Landroidx/compose/ui/node/DrawModifierNode;)V", 1, 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof h) && (obj instanceof fj.h)) {
            return b().equals(((fj.h) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
