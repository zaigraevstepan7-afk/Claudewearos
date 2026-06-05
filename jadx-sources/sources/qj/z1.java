package qj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class z1 extends vj.q implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final long f13645e;

    public z1(long j, vi.c cVar) {
        super(cVar, cVar.getContext());
        this.f13645e = j;
    }

    @Override // qj.l1
    public final String U() {
        return super.U() + "(timeMillis=" + this.f13645e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0.m(this.f13537c);
        m(new y1("Timed out waiting for " + this.f13645e + " ms", this));
    }
}
