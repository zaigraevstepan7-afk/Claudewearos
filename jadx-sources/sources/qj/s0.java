package qj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class s0 extends t0 {

    /* renamed from: c, reason: collision with root package name */
    public final z1 f13620c;

    public s0(long j, z1 z1Var) {
        super(j);
        this.f13620c = z1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13620c.run();
    }

    @Override // qj.t0
    public final String toString() {
        return super.toString() + this.f13620c;
    }
}
