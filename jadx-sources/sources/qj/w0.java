package qj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class w0 extends v {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f13633f = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f13634c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13635d;

    /* renamed from: e, reason: collision with root package name */
    public qi.j f13636e;

    @Override // qj.v
    public final v h0(int i10) {
        vj.b.a(i10);
        return this;
    }

    public final void i0(boolean z2) {
        long j = this.f13634c - (z2 ? 4294967296L : 1L);
        this.f13634c = j;
        if (j <= 0 && this.f13635d) {
            shutdown();
        }
    }

    public final void j0(k0 k0Var) {
        qi.j jVar = this.f13636e;
        if (jVar == null) {
            jVar = new qi.j();
            this.f13636e = jVar;
        }
        jVar.addLast(k0Var);
    }

    public abstract Thread k0();

    public final void l0(boolean z2) {
        this.f13634c = (z2 ? 4294967296L : 1L) + this.f13634c;
        if (z2) {
            return;
        }
        this.f13635d = true;
    }

    public abstract long m0();

    public final boolean n0() {
        qi.j jVar = this.f13636e;
        if (jVar == null) {
            return false;
        }
        k0 k0Var = (k0) (jVar.isEmpty() ? null : jVar.removeFirst());
        if (k0Var == null) {
            return false;
        }
        k0Var.run();
        return true;
    }

    public void o0(long j, t0 t0Var) {
        c0.C.t0(j, t0Var);
    }

    public abstract void shutdown();
}
