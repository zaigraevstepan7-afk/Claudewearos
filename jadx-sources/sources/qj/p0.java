package qj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class p0 extends h1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f13609e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f13610f;

    public /* synthetic */ p0(Object obj, int i10) {
        this.f13609e = i10;
        this.f13610f = obj;
    }

    @Override // qj.h1
    public final boolean k() {
        switch (this.f13609e) {
        }
        return false;
    }

    @Override // qj.h1
    public final void l(Throwable th2) {
        switch (this.f13609e) {
            case 0:
                ((o0) this.f13610f).a();
                break;
            case 1:
                ((ej.c) this.f13610f).invoke(th2);
                break;
            default:
                i1 i1Var = (i1) this.f13610f;
                Object obj = l1.f13598a.get(j());
                if (!(obj instanceof t)) {
                    i1Var.resumeWith(b0.E(obj));
                    break;
                } else {
                    i1Var.resumeWith(uk.c.r(((t) obj).f13622a));
                    break;
                }
        }
    }
}
