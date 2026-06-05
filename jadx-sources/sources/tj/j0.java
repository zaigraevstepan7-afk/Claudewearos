package tj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class j0 extends uj.d {

    /* renamed from: a, reason: collision with root package name */
    public long f16385a;

    /* renamed from: b, reason: collision with root package name */
    public qj.l f16386b;

    @Override // uj.d
    public final boolean a(uj.b bVar) {
        h0 h0Var = (h0) bVar;
        if (this.f16385a >= 0) {
            return false;
        }
        long j = h0Var.B;
        if (j < h0Var.C) {
            h0Var.C = j;
        }
        this.f16385a = j;
        return true;
    }

    @Override // uj.d
    public final ti.c[] b(uj.b bVar) {
        long j = this.f16385a;
        this.f16385a = -1L;
        this.f16386b = null;
        return ((h0) bVar).v(j);
    }
}
