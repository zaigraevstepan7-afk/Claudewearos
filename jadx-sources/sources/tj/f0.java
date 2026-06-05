package tj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class f0 implements qj.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f16352a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16353b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f16354c;

    /* renamed from: d, reason: collision with root package name */
    public final qj.l f16355d;

    public f0(h0 h0Var, long j, Object obj, qj.l lVar) {
        this.f16352a = h0Var;
        this.f16353b = j;
        this.f16354c = obj;
        this.f16355d = lVar;
    }

    @Override // qj.o0
    public final void a() {
        h0 h0Var = this.f16352a;
        synchronized (h0Var) {
            if (this.f16353b < h0Var.o()) {
                return;
            }
            Object[] objArr = h0Var.A;
            fj.l.c(objArr);
            long j = this.f16353b;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            i0.d(objArr, j, i0.f16380a);
            h0Var.j();
        }
    }
}
