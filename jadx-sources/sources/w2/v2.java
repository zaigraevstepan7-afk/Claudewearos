package w2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class v2 implements t1, fj.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1.p f18443a;

    public v2(f1.p pVar) {
        this.f18443a = pVar;
    }

    @Override // fj.h
    public final pi.c b() {
        return new fj.j(1, this.f18443a, f1.p.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0, 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof t1) && (obj instanceof fj.h)) {
            return b().equals(((fj.h) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
